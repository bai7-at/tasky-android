package at.bai7.deeplink

import android.content.Context
import android.net.Uri
import android.net.http.SslError
import android.os.Bundle
import android.util.Log
import android.webkit.SslErrorHandler
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import at.bai7.deeplink.ui.theme.ToDoAppTheme
import kotlinx.coroutines.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.ui.viewinterop.AndroidView

const val BASE_URL = "http://10.0.2.2:8000"

//const val BASE_URL = "https://mobile.s7ven.info:8000"

class MainActivity : ComponentActivity() {

//    private lateinit var webView: WebView

    override fun onResume() {
        super.onResume()
        refreshToDoList()
    }


    fun refreshToDoList() {
        val (accessToken, refreshToken) = loadTokensPlain(this)

        if (accessToken != null) {
            fetchTodos(
                aToken = accessToken,
                rToken = refreshToken!!,
                onResult = { todos ->
                    Log.d("ToDoRefresh", "Fetched ${todos.size} items on resume")
                    // Optionally update your Composable state here
                },
                onUnauthorized = {
                    clearTokensPlain(this)
                    Toast.makeText(this, "Session expired. Please log in again.", Toast.LENGTH_LONG).show()
                }

            )
        } else if (refreshToken != null) {
            refreshAccessToken(refreshToken) { newToken ->
                if (newToken != null) {
                    saveTokensPlain(this, newToken, refreshToken)
                    fetchTodos(
                        aToken = newToken,
                        rToken = refreshToken,
                        onResult = { todos ->
                            Log.d("ToDoRefresh", "Fetched ${todos.size} items after refresh")
                        }
                    )
                } else {
                    clearTokensPlain(this)
                    Toast.makeText(this, "Session expired. Please log in again.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Always clear saved tokens on fresh start
//        clearTokensPlain(this)

        val deepLink: Uri? = intent?.data
        Log.d("DeepLink", "Received intent URI: $deepLink")

        val targetUrl = deepLink?.getQueryParameter("url")

        val (accessToken, _) = loadTokensPlain(this)

        setContent {
            ToDoAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ToDoApp()

                    if (targetUrl != null && accessToken != null) {
                        WebViewScreen(url = targetUrl, accessToken = accessToken)
                    }

                }
            }
        }
    }
}

private const val sharedPrefToken = "token"

fun saveTokensPlain(context: Context, access: String, refresh: String) {
    val prefs = context.getSharedPreferences(sharedPrefToken, Context.MODE_PRIVATE)
    prefs.edit()
        .putString("access_token", access)
        .putString("refresh_token", refresh)
        .apply()
}

fun loadTokensPlain(context: Context): Pair<String?, String?> {
    val prefs = context.getSharedPreferences(sharedPrefToken, Context.MODE_PRIVATE)
    val access = prefs.getString("access_token", null)
    val refresh = prefs.getString("refresh_token", null)
    return access to refresh
}

fun clearTokensPlain(context: Context) {
    val prefs = context.getSharedPreferences(sharedPrefToken, Context.MODE_PRIVATE)
    prefs.edit().clear().apply()
}


@Composable
fun WebViewScreen(url: String, accessToken: String) {
    AndroidView(factory = { context ->
        WebView(context).apply {
            clearCache(true)
            clearHistory()
            clearFormData()

            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true

            addJavascriptInterface(TokenBridge(context), "TokenBridge")

            settings.cacheMode = android.webkit.WebSettings.LOAD_NO_CACHE
            webChromeClient = WebChromeClient()

            webViewClient = object : WebViewClient() {

                override fun shouldOverrideUrlLoading(
                    view: WebView?,
                    request: WebResourceRequest?
                ): Boolean {
                    // Allow internal navigation
                    return false
                }

                override fun onReceivedSslError(
                    view: WebView?,
                    handler: SslErrorHandler?,
                    error: SslError?
                ) {
                    Log.w("WebViewExploit", "⚠️ SSL Error: ${error?.primaryError}, proceeding anyway")
                    handler?.proceed()
                }
            }

            // Inject Authorization header with JWT
            val headers = mapOf("Authorization" to "Bearer $accessToken")
            Log.d("WebViewExploit", "Loading $url with JWT in headers")
            loadUrl(url, headers)
        }
    })
}



@Composable
fun ToDoApp() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var accessToken by remember { mutableStateOf<String?>(null) }
    var refreshToken by remember { mutableStateOf<String?>(null) }
    var todos by remember { mutableStateOf(listOf<ToDo>()) }
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    val context = LocalContext.current

    // Load tokens once at startup
    LaunchedEffect(Unit) {
        val (storedAccess, storedRefresh) = loadTokensPlain(context)
        accessToken = storedAccess
        refreshToken = storedRefresh

        if (storedAccess != null) {
            fetchTodos(
                aToken = storedAccess,
                rToken = storedRefresh!!,
                onResult = { todos = it }
            )
        } else if (storedRefresh != null) {
            refreshAccessToken(storedRefresh) { newToken ->
                if (newToken != null) {
                    accessToken = newToken
                    saveTokensPlain(context, newToken, storedRefresh)
                    fetchTodos(
                        aToken = newToken,
                        rToken = storedRefresh,
                        onResult = { todos = it }
                    )

                } else {
                    clearTokensPlain(context)
                    accessToken = null
                    refreshToken = null
                    todos = emptyList()
                    Toast.makeText(context, "Session expired. Please log in again.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    LaunchedEffect(accessToken) {
        if (accessToken == null && refreshToken != null) {
            refreshAccessToken(refreshToken!!) { newToken ->
                if (newToken != null) {
                    accessToken = newToken
                    fetchTodos(
                        aToken = newToken,
                        rToken = refreshToken!!,
                        onResult = { todos = it }
                    )

                } else {
                    Toast.makeText(context, "Session expired. Please login again.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        if (accessToken == null) {
            Text(
                text = "Tasky",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
            )
            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                label = { Text("Username") }
            )
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation()
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { register(username, password, context) }) {
                    Text("Register")
                }
                Button(onClick = {
                    login(username, password, context, onSuccess = { token, refresh ->
                        accessToken = token
                        refreshToken = refresh
                        saveTokensPlain(context, token, refresh)
                        fetchTodos(
                            aToken = token,
                            rToken = refreshToken!!,
                            onResult = { todos = it }
                        )
                    })
                }) {
                    Text("Login")
                }
            }
        } else {

            Text("To-Dos", style = MaterialTheme.typography.headlineMedium)

            TextField(
                value = title,
                onValueChange = { title = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Title") }
            )
            TextField(
                value = description,
                onValueChange = { description = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Description") }
            )
            Button(onClick = {
                accessToken?.let {
                    createTodo(it, title, description) {
                        fetchTodos(
                            aToken = it,
                            rToken = refreshToken!!,
                            onResult = { todos = it }
                        )
                    }
                }
            }) {
                Text("Add To-Do")
            }

            // 🔁 Sort the todos in reverse order (latest on top)
            val sortedTodos = todos.reversed()


            Spacer(modifier = Modifier.height(16.dp))
            sortedTodos.forEach {
                Text("• ${it.title}: ${it.description}", modifier = Modifier.padding(4.dp))
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

fun register(username: String, password: String, context: android.content.Context) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val client = OkHttpClient()
            val json = JSONObject(mapOf("username" to username, "password" to password)).toString()
            val body = json.toRequestBody("application/json".toMediaType())
            val request = Request.Builder().url("$BASE_URL/register").post(body).build()
            client.newCall(request).execute().use { response ->
                val message = response.body?.string() ?: "No response body"
                Log.d("Register", "Response code: ${response.code}, body: $message")

                withContext(Dispatchers.Main) {
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                }
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "Registration failed: ${e.localizedMessage}", Toast.LENGTH_LONG).show()
                Log.d("Registration", "Registration failed: ${e.localizedMessage}")
            }
        }
    }
}

fun login(username: String, password: String, context: android.content.Context, onSuccess: (String, String) -> Unit) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val client = OkHttpClient()
            val body = "username=$username&password=$password".toRequestBody("application/x-www-form-urlencoded".toMediaType())
            val request = Request.Builder().url("$BASE_URL/token").post(body).build()
            val response: Response = client.newCall(request).execute()
            val bodyString = response.body?.string()
            if (response.isSuccessful && bodyString != null) {
                val json = JSONObject(bodyString)
                val token = json.getString("access_token")
                val refresh = json.getString("refresh_token")
                withContext(Dispatchers.Main) { onSuccess(token, refresh) }
            } else {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Login failed: $bodyString", Toast.LENGTH_LONG).show()
                }
            }
        } catch (e: Exception) {
            Log.e("Login", "Login failed", e)
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "Login error: ${e.localizedMessage}", Toast.LENGTH_LONG).show()
            }
        }
    }
}

fun refreshAccessToken(refreshToken: String, onResult: (String?) -> Unit) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val client = OkHttpClient()
            val json = JSONObject(mapOf("refresh_token" to refreshToken)).toString()
            val body = json.toRequestBody("application/json".toMediaType())
            val request = Request.Builder().url("$BASE_URL/token/refresh").post(body).build()
            val response = client.newCall(request).execute()
            val bodyString = response.body?.string()
            if (response.isSuccessful && bodyString != null) {
                val json = JSONObject(bodyString)
                val token = json.getString("access_token")
                withContext(Dispatchers.Main) {
                    onResult(token)
                }
            } else {
                withContext(Dispatchers.Main) {
                    onResult(null)
                }
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                onResult(null)
            }
        }
    }
}

fun fetchTodos(
    aToken: String,
    rToken: String,
    onResult: (List<ToDo>) -> Unit,
    onUnauthorized: (() -> Unit)? = null
) {
    CoroutineScope(Dispatchers.IO).launch {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("$BASE_URL/todos")
            .addHeader("Authorization", "Bearer $aToken")
            .build()
        val response = client.newCall(request).execute()
        val responseBody = response.body?.string()

        // Handle 401 Unauthorized
        if (response.code == 401 || responseBody?.contains("Invalid or expired token", ignoreCase = true) == true) {
            Log.w("fetchTodos", "Access token expired or invalid.")
            withContext(Dispatchers.Main) {
                // 🚨 Call onUnauthorized (let the caller clear tokens and redirect)
                onUnauthorized?.invoke()
            }
            return@launch
        }

        val todos = mutableListOf<ToDo>()
        try {
            val jsonArray = JSONArray(responseBody)
            for (i in 0 until jsonArray.length()) {
                val item = jsonArray.getJSONObject(i)
                todos.add(ToDo(item.getInt("id"), item.getString("title"), item.getString("description")))
            }
        } catch (e: Exception) {
            Log.e("fetchTodos", "Failed to parse todos: $responseBody", e)
        }

        withContext(Dispatchers.Main) {
            onResult(todos)
        }
    }
}

fun createTodo(token: String, title: String, description: String, onComplete: () -> Unit) {
    CoroutineScope(Dispatchers.IO).launch {
        val client = OkHttpClient()
        val json = JSONObject(mapOf("title" to title, "description" to description)).toString()
        val body = json.toRequestBody("application/json".toMediaType())
        val request = Request.Builder()
            .url("$BASE_URL/todo")
            .addHeader("Authorization", "Bearer $token")
            .post(body)
            .build()
        client.newCall(request).execute().use { response ->
            println("TODO CREATED: ${response.code}")
        }
        withContext(Dispatchers.Main) {
            onComplete()
        }
    }
}

data class ToDo(val id: Int, val title: String, val description: String)
