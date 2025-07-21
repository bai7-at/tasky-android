package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class alf implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ qof b;

    alf(qof qofVar, og8 og8Var) {
        this.b = qofVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc8 bc8Var;
        try {
            bc8Var = this.b.b;
            og8 then = bc8Var.then(this.a.m());
            if (then == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = tg8.b;
            then.g(executor, this.b);
            then.e(executor, this.b);
            then.a(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e.getCause());
            } else {
                this.b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.onFailure(e2);
        }
    }
}
