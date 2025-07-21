package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.FeatureManager;
import defpackage.g29;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class g29 {
    private static int b;
    public static final g29 a = new g29();
    private static long c = -1;
    private static long d = -1;
    private static long e = -1;
    private static String f = "";
    private static String g = "";
    private static String h = "NoCarrier";

    public interface a {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    private g29() {
    }

    public static final JSONObject A() {
        if (c11.d(g29.class)) {
            return null;
        }
        try {
            String string = w92.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, g29.class);
            return null;
        }
    }

    public static final void A0(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        Display display;
        PackageInfo packageInfo;
        zq3.h(jSONObject, "params");
        zq3.h(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        a.v0(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        if (packageInfo == null) {
            return;
        }
        i3 = packageInfo.versionCode;
        str = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
        jSONArray.put(f);
        jSONArray.put(h);
        double d2 = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
                d2 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i = i2;
            i2 = i4;
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            jSONArray.put(a.s0());
            jSONArray.put(d);
            jSONArray.put(e);
            jSONArray.put(g);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(a.s0());
        jSONArray.put(d);
        jSONArray.put(e);
        jSONArray.put(g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String B(String str) {
        String u = w92.u();
        return str == null ? u : zq3.c(str, "gaming") ? h.F(u, "facebook.com", "fb.gg", false, 4, null) : zq3.c(str, "instagram") ? h.F(u, "facebook.com", "instagram.com", false, 4, null) : u;
    }

    public static final String B0(byte[] bArr) {
        zq3.h(bArr, "bytes");
        return a.O("SHA-1", bArr);
    }

    private final GraphRequest C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", I(z()));
        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, str);
        GraphRequest y = GraphRequest.n.y(null, null);
        y.H(bundle);
        y.G(HttpMethod.GET);
        return y;
    }

    public static final String C0(String str) {
        if (str == null) {
            return null;
        }
        return a.N("SHA-256", str);
    }

    public static final void D(final String str, final a aVar) {
        zq3.h(str, "accessToken");
        zq3.h(aVar, "callback");
        JSONObject a2 = k46.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        GraphRequest.b bVar = new GraphRequest.b() { // from class: e29
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                g29.E(g29.a.this, str, m23Var);
            }
        };
        GraphRequest C = a.C(str);
        C.D(bVar);
        C.l();
    }

    public static final void D0(Parcel parcel, Map map) {
        zq3.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(a aVar, String str, m23 m23Var) {
        zq3.h(aVar, "$callback");
        zq3.h(str, "$accessToken");
        zq3.h(m23Var, "response");
        if (m23Var.b() != null) {
            aVar.b(m23Var.b().e());
            return;
        }
        k46 k46Var = k46.a;
        JSONObject d2 = m23Var.d();
        if (d2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        k46.b(str, d2);
        aVar.a(m23Var.d());
    }

    public static final void E0(Parcel parcel, Map map) {
        zq3.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final String F(Context context) {
        v29.m(context, "context");
        return w92.m();
    }

    public static final Method G(Class cls, String str, Class... clsArr) {
        zq3.h(cls, "clazz");
        zq3.h(str, "methodName");
        zq3.h(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method H(String str, String str2, Class... clsArr) {
        zq3.h(str, "className");
        zq3.h(str2, "methodName");
        zq3.h(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            zq3.g(cls, "forName(className)");
            return G(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String I(String str) {
        return zq3.c(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale J() {
        try {
            return w92.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object K(JSONObject jSONObject, String str, String str2) {
        zq3.h(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, opt);
        return jSONObject2;
    }

    public static final String L(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    private final String M(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        zq3.g(digest, "digest");
        int length = digest.length;
        int i = 0;
        while (i < length) {
            byte b2 = digest[i];
            i++;
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "builder.toString()");
        return sb2;
    }

    private final String N(String str, String str2) {
        Charset charset = yj0.b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
        return O(str, bytes);
    }

    private final String O(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            zq3.g(messageDigest, "hash");
            return M(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object P(Object obj, Method method, Object... objArr) {
        zq3.h(method, "method");
        zq3.h(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean Q() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            z38 z38Var = z38.a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{w92.m()}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l = w92.l();
            PackageManager packageManager = l.getPackageManager();
            String packageName = l.getPackageName();
            Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it2.hasNext()) {
                if (zq3.c(packageName, it2.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean R(Context context) {
        zq3.h(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        return autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean S(Context context) {
        zq3.h(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
    }

    public static final boolean T(Uri uri) {
        return uri != null && h.w("content", uri.getScheme(), true);
    }

    public static final boolean U(AccessToken accessToken) {
        return accessToken != null && zq3.c(accessToken, AccessToken.Companion.e());
    }

    public static final boolean V() {
        if (c11.d(g29.class)) {
            return false;
        }
        try {
            JSONObject A = A();
            if (A == null) {
                return false;
            }
            try {
                JSONArray jSONArray = A.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        String string = jSONArray.getString(i);
                        zq3.g(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (zq3.c(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, g29.class);
            return false;
        }
    }

    public static final boolean W(Uri uri) {
        return uri != null && h.w(TransferTable.COLUMN_FILE, uri.getScheme(), true);
    }

    private final boolean X(Context context) {
        Method H = H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (H == null) {
            return false;
        }
        Object P = P(null, H, context);
        return (P instanceof Integer) && zq3.c(P, 0);
    }

    public static final boolean Y(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean Z(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean a0(Uri uri) {
        return uri != null && (h.w("http", uri.getScheme(), true) || h.w("https", uri.getScheme(), true) || h.w("fbstaging", uri.getScheme(), true));
    }

    public static final Set b0(JSONArray jSONArray) {
        zq3.h(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String string = jSONArray.getString(i);
                zq3.g(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }

    private final void c(JSONObject jSONObject, kv kvVar, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !X(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (kvVar.l()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public static final List c0(JSONArray jSONArray) {
        zq3.h(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(jSONArray.getString(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    private final void d(JSONObject jSONObject, kv kvVar, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !X(context)) {
            jSONObject.put("attribution", kvVar.j());
        } else {
            if (kvVar.l()) {
                return;
            }
            jSONObject.put("attribution", kvVar.j());
        }
    }

    public static final Map d0(String str) {
        zq3.h(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zq3.g(next, TransferTable.COLUMN_KEY);
                String string = jSONObject.getString(next);
                zq3.g(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : zq3.c(obj, obj2);
    }

    public static final void e0(String str, Exception exc) {
        if (!w92.C() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    public static final JSONObject f(String str) {
        zq3.h(str, "accessToken");
        JSONObject a2 = k46.a(str);
        if (a2 != null) {
            return a2;
        }
        m23 k = a.C(str).k();
        if (k.b() != null) {
            return null;
        }
        return k.d();
    }

    public static final void f0(String str, String str2) {
        if (!w92.C() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        zq3.g(build, "builder.build()");
        return build;
    }

    public static final void g0(String str, String str2, Throwable th) {
        if (!w92.C() || Y(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    private final void h(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = h.F0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            Object[] array2 = h.F0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = zq3.j(str3.charAt(!z ? i2 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                cookieManager.setCookie(str, zq3.q(str3.subSequence(i2, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final String h0(Map map) {
        zq3.h(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            zq3.g(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final void i(Context context) {
        zq3.h(context, "context");
        try {
            g29 g29Var = a;
            g29Var.h(context, "facebook.com");
            g29Var.h(context, ".facebook.com");
            g29Var.h(context, "https://facebook.com");
            g29Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String i0(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return a.N("MD5", str);
    }

    public static final void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final boolean j0(Context context) {
        zq3.h(context, "context");
        return R(context);
    }

    public static final String k(String str, String str2) {
        return Y(str) ? str2 : str;
    }

    public static final Bundle k0(String str) {
        Bundle bundle = new Bundle();
        if (!Y(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object[] array = h.F0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                Object[] array2 = h.F0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], Constants.DEFAULT_ENCODING), URLDecoder.decode(strArr2[1], Constants.DEFAULT_ENCODING));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], Constants.DEFAULT_ENCODING), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    e0("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    private final long l(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static final boolean l0(Bundle bundle, String str, Object obj) {
        zq3.h(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final List m(JSONArray jSONArray) {
        zq3.h(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String string = jSONArray.getString(i);
                zq3.g(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i2 >= length) {
                    return arrayList;
                }
                i = i2;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final void m0(Bundle bundle, String str, String str2) {
        zq3.h(bundle, "b");
        if (Y(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final Map n(JSONObject jSONObject) {
        int length;
        zq3.h(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    String string = names.getString(i);
                    zq3.g(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = n((JSONObject) obj);
                    }
                    zq3.g(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    public static final void n0(Bundle bundle, String str, Uri uri) {
        zq3.h(bundle, "b");
        if (uri != null) {
            m0(bundle, str, uri.toString());
        }
    }

    public static final Map o(JSONObject jSONObject) {
        zq3.h(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                zq3.g(next, TransferTable.COLUMN_KEY);
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final Map o0(Parcel parcel) {
        zq3.h(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i < readInt);
        }
        return hashMap;
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        zq3.h(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final String p0(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[ProgressEvent.PART_COMPLETED_EVENT_CODE];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String sb2 = sb.toString();
                            zq3.g(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return sb2;
                        }
                        sb.append(cArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final Map q0(Parcel parcel) {
        zq3.h(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i < readInt);
        }
        return hashMap;
    }

    private final boolean r() {
        return zq3.c("mounted", Environment.getExternalStorageState());
    }

    private final void r0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            e = l(e);
        } catch (Exception unused) {
        }
    }

    public static final String s(int i) {
        String bigInteger = new BigInteger(i * 5, new Random()).toString(32);
        zq3.g(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    private final int s0() {
        int i = b;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: f29
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean t0;
                    t0 = g29.t0(file, str);
                    return t0;
                }
            });
            if (listFiles != null) {
                b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (b <= 0) {
            b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return b;
    }

    public static final String t(Context context) {
        if (context == null) {
            return Constants.NULL_VERSION_ID;
        }
        if (context == context.getApplicationContext()) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        String simpleName = context.getClass().getSimpleName();
        zq3.g(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final String u(Context context) {
        String string;
        zq3.h(context, "context");
        try {
            String n = w92.n();
            if (n != null) {
                return n;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                zq3.g(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void u0(Context context) {
        if (zq3.c(h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                zq3.g(networkOperatorName, "telephonyManager.networkOperatorName");
                h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public static final String v() {
        Context l = w92.l();
        if (l == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l.getPackageManager().getPackageInfo(l.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void v0(Context context) {
        if (c == -1 || System.currentTimeMillis() - c >= 1800000) {
            c = System.currentTimeMillis();
            w0();
            u0(context);
            x0();
            r0();
        }
    }

    public static final Date w(Bundle bundle, String str, Date date) {
        long parseLong;
        zq3.h(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (parseLong * 1000));
    }

    private final void w0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            zq3.g(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f = displayName;
            String id = timeZone.getID();
            zq3.g(id, "tz.id");
            g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final long x(Uri uri) {
        zq3.h(uri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = w92.l().getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void x0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            d = l(d);
        } catch (Exception unused) {
        }
    }

    public static final Locale y() {
        Locale J = J();
        if (J != null) {
            return J;
        }
        Locale locale = Locale.getDefault();
        zq3.g(locale, "getDefault()");
        return locale;
    }

    public static final void y0(Runnable runnable) {
        try {
            w92.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    private final String z() {
        AccessToken e2 = AccessToken.Companion.e();
        return (e2 == null || e2.h() == null) ? AccessToken.DEFAULT_GRAPH_DOMAIN : e2.h();
    }

    public static final void z0(JSONObject jSONObject, kv kvVar, String str, boolean z, Context context) {
        zq3.h(jSONObject, "params");
        zq3.h(context, "context");
        FeatureManager featureManager = FeatureManager.a;
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.g(feature)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", w92.k());
        if (kvVar != null) {
            if (FeatureManager.g(feature)) {
                a.c(jSONObject, kvVar, str, context);
            }
            if (kvVar.j() != null) {
                if (FeatureManager.g(feature)) {
                    a.d(jSONObject, kvVar, context);
                } else {
                    jSONObject.put("attribution", kvVar.j());
                }
            }
            if (kvVar.h() != null) {
                jSONObject.put("advertiser_id", kvVar.h());
                jSONObject.put("advertiser_tracking_enabled", !kvVar.l());
            }
            if (!kvVar.l()) {
                String b2 = uz8.b();
                if (b2.length() != 0) {
                    jSONObject.put("ud", b2);
                }
            }
            if (kvVar.i() != null) {
                jSONObject.put("installer_package", kvVar.i());
            }
        }
    }
}
