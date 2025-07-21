package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
final class gsf extends Thread {
    gsf(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
