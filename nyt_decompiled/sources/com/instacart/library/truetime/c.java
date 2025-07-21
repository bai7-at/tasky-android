package com.instacart.library.truetime;

import android.util.Log;

/* loaded from: classes3.dex */
abstract class c {
    private static boolean a;

    static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
    }

    static void b(String str, String str2) {
        if (a) {
            Log.i(str, str2);
        }
    }

    static void c(boolean z) {
        a = z;
    }

    static void d(String str, String str2) {
        if (a) {
            Log.w(str, str2);
        }
    }
}
