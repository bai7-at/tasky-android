package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFb1oSDK;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
public class AFLogger {
    private static final long values = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int values;

        LogLevel(int i) {
            this.values = i;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    private static void AFInAppEventParameterName(String str, Throwable th, boolean z, boolean z2) {
        if (AFInAppEventParameterName(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String values2 = values(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.8.2", values2, th);
            } else if (z) {
                Log.d("AppsFlyer_6.8.2", values2);
            }
        }
        AFb1oSDK.AFInAppEventType().AFInAppEventType(th);
        Application application = AFb1kSDK.AFInAppEventParameterName;
        if (application != null) {
            SharedPreferences.Editor edit = AFa1aSDK.AFInAppEventType(application).edit();
            Application application2 = AFb1kSDK.AFInAppEventParameterName;
            edit.putLong("exception_number", (application2 == null ? -1L : AFa1aSDK.AFInAppEventType(application2).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    private static boolean AFInAppEventType() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void AFKeystoreWrapper(String str) {
        if (!AFInAppEventType()) {
            Log.d("AppsFlyer_6.8.2", values(str, false));
        }
        AFb1oSDK.AFInAppEventType().valueOf("F", str);
    }

    public static void afDebugLog(String str) {
        if (AFInAppEventParameterName(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.8.2", values(str, false));
        }
        AFb1oSDK.AFInAppEventType().valueOf(QueryKeys.FORCE_DECAY, values(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        AFInAppEventParameterName(str, th, true, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (AFInAppEventParameterName(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.8.2", values(str, false));
        }
        if (z) {
            AFb1oSDK.AFInAppEventType().valueOf(QueryKeys.IDLING, values(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFInAppEventParameterName(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.8.2", values(str, false));
        }
        AFb1oSDK.AFInAppEventType().valueOf(QueryKeys.SDK_VERSION, values(str, true));
    }

    public static void afWarnLog(String str) {
        valueOf(str);
    }

    public static void valueOf(String str) {
        if (AFInAppEventParameterName(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.8.2", values(str, false));
        }
        AFb1oSDK.AFInAppEventType().valueOf(QueryKeys.WRITING, values(str, true));
    }

    @NonNull
    private static String values(String str, boolean z) {
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - values);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        AFInAppEventParameterName(str, th, true, z);
    }

    public static void afErrorLog(Throwable th) {
        AFInAppEventParameterName(null, th, false, false);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    private static boolean AFInAppEventParameterName(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }
}
