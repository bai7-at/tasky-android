package at.bai7.deeplink

import android.content.Context
import android.webkit.JavascriptInterface

class TokenBridge(private val context: Context) {

    @JavascriptInterface
    fun getAccessToken(): String? {
        val (accessToken, _) = loadTokensPlain(context)
        return accessToken
    }

    @JavascriptInterface
    fun getRefreshToken(): String? {
        val (_, refreshToken) = loadTokensPlain(context)
        return refreshToken
    }
}