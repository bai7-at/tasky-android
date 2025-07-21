package defpackage;

import androidx.work.WorkerParameters;
import androidx.work.impl.a;

/* loaded from: classes.dex */
public final class lj9 implements jj9 {
    private final a a;
    private final rg8 b;

    public lj9(a aVar, rg8 rg8Var) {
        zq3.h(aVar, "processor");
        zq3.h(rg8Var, "workTaskExecutor");
        this.a = aVar;
        this.b = rg8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(lj9 lj9Var, q08 q08Var, WorkerParameters.a aVar) {
        lj9Var.a.s(q08Var, aVar);
    }

    @Override // defpackage.jj9
    public void c(final q08 q08Var, final WorkerParameters.a aVar) {
        zq3.h(q08Var, "workSpecId");
        this.b.d(new Runnable() { // from class: kj9
            @Override // java.lang.Runnable
            public final void run() {
                lj9.g(lj9.this, q08Var, aVar);
            }
        });
    }

    @Override // defpackage.jj9
    public void d(q08 q08Var, int i) {
        zq3.h(q08Var, "workSpecId");
        this.b.d(new x18(this.a, q08Var, false, i));
    }
}
