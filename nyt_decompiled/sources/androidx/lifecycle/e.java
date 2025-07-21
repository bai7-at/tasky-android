package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e;
import defpackage.d44;
import defpackage.es1;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class e {
    private final Lifecycle a;
    private final Lifecycle.State b;
    private final es1 c;
    private final g d;

    public e(Lifecycle lifecycle, Lifecycle.State state, es1 es1Var, final Job job) {
        zq3.h(lifecycle, "lifecycle");
        zq3.h(state, "minState");
        zq3.h(es1Var, "dispatchQueue");
        zq3.h(job, "parentJob");
        this.a = lifecycle;
        this.b = state;
        this.c = es1Var;
        g gVar = new g() { // from class: z34
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var, Lifecycle.Event event) {
                e.c(e.this, job, d44Var, event);
            }
        };
        this.d = gVar;
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            lifecycle.a(gVar);
        } else {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e eVar, Job job, d44 d44Var, Lifecycle.Event event) {
        zq3.h(eVar, "this$0");
        zq3.h(job, "$parentJob");
        zq3.h(d44Var, "source");
        zq3.h(event, "<anonymous parameter 1>");
        if (d44Var.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            eVar.b();
        } else if (d44Var.getLifecycle().b().compareTo(eVar.b) < 0) {
            eVar.c.h();
        } else {
            eVar.c.i();
        }
    }

    public final void b() {
        this.a.d(this.d);
        this.c.g();
    }
}
