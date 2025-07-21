package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes3.dex */
final class abb implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ k5c b;

    abb(k5c k5cVar, og8 og8Var) {
        this.b = k5cVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1g w1gVar;
        w1g w1gVar2;
        w1g w1gVar3;
        cy0 cy0Var;
        w1g w1gVar4;
        w1g w1gVar5;
        if (this.a.o()) {
            w1gVar5 = this.b.c;
            w1gVar5.v();
            return;
        }
        try {
            cy0Var = this.b.b;
            Object then = cy0Var.then(this.a);
            w1gVar4 = this.b.c;
            w1gVar4.u(then);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                w1gVar3 = this.b.c;
                w1gVar3.t((Exception) e.getCause());
            } else {
                w1gVar2 = this.b.c;
                w1gVar2.t(e);
            }
        } catch (Exception e2) {
            w1gVar = this.b.c;
            w1gVar.t(e2);
        }
    }
}
