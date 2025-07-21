package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class fj1 implements i47 {
    private final Handler a = o63.a(Looper.getMainLooper());

    @Override // defpackage.i47
    public void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.i47
    public void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
