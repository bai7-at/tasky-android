package com.comscore.util.unittest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.comscore.util.cpp.CppJavaBinder;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class TestUtils {
    public static int getExceptionCounter(CppJavaBinder cppJavaBinder) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = CppJavaBinder.class.getDeclaredMethod("getExceptionCounter", null);
        declaredMethod.setAccessible(true);
        return ((Integer) declaredMethod.invoke(cppJavaBinder, null)).intValue();
    }

    public static int getExceptionCounterStatic(Class<?> cls) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = cls.getDeclaredMethod("getExceptionCounter", null);
        declaredMethod.setAccessible(true);
        return ((Integer) declaredMethod.invoke(null, null)).intValue();
    }

    public static native boolean isAnalyticsInitialized();

    public static boolean isServerReachable(Context context, String str) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(3)) {
            return false;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            return httpURLConnection.getResponseCode() != -1;
        } catch (IOException unused) {
            return false;
        }
    }
}
