package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class r7b {
    private HandlerThread a = null;
    private Handler b = null;
    private int c = 0;
    private final Object d = new Object();

    public final Handler a() {
        return this.b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.d) {
            try {
                if (this.c != 0) {
                    Preconditions.checkNotNull(this.a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.a == null) {
                    pzc.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.a = handlerThread;
                    handlerThread.start();
                    this.b = new cde(this.a.getLooper());
                    pzc.k("Looper thread started.");
                } else {
                    pzc.k("Resuming the looper thread");
                    this.d.notifyAll();
                }
                this.c++;
                looper = this.a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
