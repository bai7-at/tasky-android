package com.chartbeat.androidsdk;

import android.util.Log;

/* loaded from: classes2.dex */
class Logger {
    Logger() {
    }

    static void d(String str, String str2) {
        if (Tracker.DEBUG_MODE) {
            Log.d(str, str2);
        }
    }

    static void e(String str, String str2) {
        if (Tracker.DEBUG_MODE) {
            Log.e(str, str2);
        }
    }

    static void v(String str, String str2) {
        if (Tracker.DEBUG_MODE) {
            Log.v(str, str2);
        }
    }

    static void w(String str, String str2) {
        if (Tracker.DEBUG_MODE) {
            Log.w(str, str2);
        }
    }
}
