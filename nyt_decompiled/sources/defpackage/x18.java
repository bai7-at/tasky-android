package defpackage;

import androidx.work.impl.a;

/* loaded from: classes.dex */
public final class x18 implements Runnable {
    private final a a;
    private final q08 b;
    private final boolean c;
    private final int d;

    public x18(a aVar, q08 q08Var, boolean z, int i) {
        zq3.h(aVar, "processor");
        zq3.h(q08Var, "token");
        this.a = aVar;
        this.b = q08Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean v = this.c ? this.a.v(this.b, this.d) : this.a.w(this.b, this.d);
        h94.e().a(h94.i("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a().b() + "; Processor.stopWork = " + v);
    }
}
