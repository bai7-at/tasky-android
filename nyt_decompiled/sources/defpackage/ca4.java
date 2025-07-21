package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class ca4 {
    public static void a(String str, String str2, Object obj) {
        String d = d(str);
        if (Log.isLoggable(d, 3)) {
            Log.d(d, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String d = d(str);
        if (Log.isLoggable(d, 3)) {
            Log.d(d, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String d = d(str);
        if (Log.isLoggable(d, 6)) {
            Log.e(d, str2, th);
        }
    }

    private static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String d = d(str);
        if (Log.isLoggable(d, 4)) {
            Log.i(d, String.format(str2, obj));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String d = d(str);
        if (Log.isLoggable(d, 5)) {
            Log.w(d, String.format(str2, obj));
        }
    }
}
