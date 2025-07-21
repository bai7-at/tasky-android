package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class jzc implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ ctd b;

    jzc(ctd ctdVar, og8 og8Var) {
        this.b = ctdVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1g w1gVar;
        w1g w1gVar2;
        w1g w1gVar3;
        cy0 cy0Var;
        try {
            cy0Var = this.b.b;
            og8 og8Var = (og8) cy0Var.then(this.a);
            if (og8Var == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = tg8.b;
            og8Var.g(executor, this.b);
            og8Var.e(executor, this.b);
            og8Var.a(executor, this.b);
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
