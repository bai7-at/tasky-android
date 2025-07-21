package defpackage;

import android.os.Handler;

/* loaded from: classes3.dex */
final class eae implements Runnable {
    eae() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = fae.k;
        if (handler != null) {
            handler2 = fae.k;
            runnable = fae.l;
            handler2.post(runnable);
            handler3 = fae.k;
            runnable2 = fae.m;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
