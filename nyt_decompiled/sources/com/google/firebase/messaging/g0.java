package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.qc9;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
abstract class g0 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    private static qc9 c;

    private static void a(Context context) {
        if (c == null) {
            qc9 qc9Var = new qc9(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = qc9Var;
            qc9Var.d(true);
        }
    }

    static void b(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && c(intent)) {
                    d(intent, false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static ComponentName e(Context context, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean c2 = c(intent);
                d(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!c2) {
                    c.a(a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
