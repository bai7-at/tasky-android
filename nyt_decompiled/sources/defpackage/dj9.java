package defpackage;

import android.content.Context;
import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import java.util.UUID;

/* loaded from: classes.dex */
public class dj9 implements ap2 {
    private static final String d = h94.i("WMFgUpdater");
    private final rg8 a;
    final yo2 b;
    final ek9 c;

    public dj9(WorkDatabase workDatabase, yo2 yo2Var, rg8 rg8Var) {
        this.b = yo2Var;
        this.a = rg8Var;
        this.c = workDatabase.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void c(UUID uuid, wo2 wo2Var, Context context) {
        String uuid2 = uuid.toString();
        dk9 h = this.c.h(uuid2);
        if (h == null || h.b.isFinished()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.b.a(uuid2, wo2Var);
        context.startService(a.d(context, ik9.a(h), wo2Var));
        return null;
    }

    @Override // defpackage.ap2
    public j64 a(final Context context, final UUID uuid, final wo2 wo2Var) {
        return ListenableFutureKt.f(this.a.c(), "setForegroundAsync", new qs2() { // from class: cj9
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Void c;
                c = dj9.this.c(uuid, wo2Var, context);
                return c;
            }
        });
    }
}
