package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.cz6;

/* loaded from: classes2.dex */
class s {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((cz6) message.obj).c();
            return true;
        }
    }

    s() {
    }

    synchronized void a(cz6 cz6Var, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                cz6Var.c();
                this.a = false;
            }
            this.b.obtainMessage(1, cz6Var).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
