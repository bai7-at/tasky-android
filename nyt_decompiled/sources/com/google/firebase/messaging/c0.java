package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class c0 {
    private static WeakReference d;
    private final SharedPreferences a;
    private y b;
    private final Executor c;

    private c0(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized c0 a(Context context, Executor executor) {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                WeakReference weakReference = d;
                c0Var = weakReference != null ? (c0) weakReference.get() : null;
                if (c0Var == null) {
                    c0Var = new c0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c0Var.c();
                    d = new WeakReference(c0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    private synchronized void c() {
        this.b = y.c(this.a, "topic_operation_queue", ",", this.c);
    }

    synchronized b0 b() {
        return b0.a(this.b.e());
    }

    synchronized boolean d(b0 b0Var) {
        return this.b.f(b0Var.e());
    }
}
