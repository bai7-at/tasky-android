package defpackage;

import androidx.work.NetworkType;
import com.nytimes.android.logging.remote.worker.LogRetryUploadWorker;
import defpackage.gv0;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class h17 implements g17 {
    private final t05 a;

    public h17(t05 t05Var) {
        zq3.h(t05Var, "androidJobProxy");
        this.a = t05Var;
    }

    @Override // defpackage.g17
    public void a(i84 i84Var) {
        zq3.h(i84Var, "logId");
        t05 t05Var = this.a;
        String simpleName = LogRetryUploadWorker.class.getSimpleName();
        zq3.g(simpleName, "getSimpleName(...)");
        t05Var.b(LogRetryUploadWorker.class, simpleName, TimeUnit.MINUTES.toMillis(2L), t.f(du8.a("logId", String.valueOf(i84Var))), new gv0.a().b(NetworkType.UNMETERED).c(true).a());
    }
}
