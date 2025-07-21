package defpackage;

import android.os.Process;

/* loaded from: classes3.dex */
public abstract class q30 implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
