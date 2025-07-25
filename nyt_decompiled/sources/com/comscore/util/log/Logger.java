package com.comscore.util.log;

import com.comscore.util.setup.Setup;

/* loaded from: classes2.dex */
public class Logger {
    private static final int a = 30000;
    private static int b;
    private static OnErrorLogListener c;
    public static LogHelper log;

    public interface OnErrorLogListener {
        void onLogError(String str, Throwable th);
    }

    static {
        Setup.setUp();
        log = null;
        b = 30000;
    }

    private static void a(String str, Throwable th) {
        OnErrorLogListener onErrorLogListener = c;
        if (onErrorLogListener == null) {
            return;
        }
        onErrorLogListener.onLogError(str, th);
    }

    public static void d(String str) {
        LogHelper logHelper;
        if (b >= 30003 && (logHelper = log) != null) {
            logHelper.d(str);
        }
    }

    public static void e(String str) {
        LogHelper logHelper;
        a(str, null);
        if (b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str);
        }
    }

    public static int getLogLevel() {
        if (Setup.isSetUpFinished()) {
            try {
                return getLogLevelNative();
            } catch (UnsatisfiedLinkError e) {
                e("Error using the native library: ", e);
            }
        }
        return b;
    }

    private static native int getLogLevelNative();

    public static void i(String str) {
        LogHelper logHelper;
        if (b >= 30004 && (logHelper = log) != null) {
            logHelper.i(str);
        }
    }

    public static void setLogLevel(int i) {
        if (i < 30000 || i > 30004) {
            return;
        }
        if (Setup.isSetUpFinished()) {
            try {
                setLogLevelNative(i);
            } catch (UnsatisfiedLinkError e) {
                e("Error using the native library: ", e);
            }
        }
        b = i;
    }

    private static native void setLogLevelNative(int i);

    public static void setOnErrorLogListener(OnErrorLogListener onErrorLogListener) {
        c = onErrorLogListener;
    }

    public static void syncrhonizeLogLevelWithNative() {
        try {
            int i = b;
            if (30000 != i) {
                setLogLevelNative(i);
            } else {
                b = getLogLevelNative();
            }
        } catch (UnsatisfiedLinkError e) {
            e("Error using the native library: ", e);
        }
    }

    public static void w(String str) {
        LogHelper logHelper;
        if (b >= 30002 && (logHelper = log) != null) {
            logHelper.w(str);
        }
    }

    public static void d(String str, String str2) {
        LogHelper logHelper;
        if (b >= 30003 && (logHelper = log) != null) {
            logHelper.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        LogHelper logHelper;
        a(str2, null);
        if (b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        LogHelper logHelper;
        if (b >= 30004 && (logHelper = log) != null) {
            logHelper.i(str, str2);
        }
    }

    public static void w(String str, String str2) {
        LogHelper logHelper;
        if (b >= 30002 && (logHelper = log) != null) {
            logHelper.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        LogHelper logHelper;
        a(str2, th);
        if (b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, str2, th);
        }
    }

    public static void e(String str, Throwable th) {
        LogHelper logHelper;
        a(str, th);
        if (b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, th);
        }
    }
}
