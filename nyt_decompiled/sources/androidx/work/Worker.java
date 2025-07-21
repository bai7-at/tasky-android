package androidx.work;

import android.content.Context;
import androidx.work.b;
import defpackage.j64;
import defpackage.qs2;
import defpackage.wo2;
import defpackage.zk9;
import defpackage.zq3;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Worker extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
    }

    public abstract b.a doWork();

    public wo2 getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.b
    public j64 getForegroundInfoAsync() {
        j64 e;
        Executor backgroundExecutor = getBackgroundExecutor();
        zq3.g(backgroundExecutor, "backgroundExecutor");
        e = zk9.e(backgroundExecutor, new qs2() { // from class: androidx.work.Worker$getForegroundInfoAsync$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final wo2 mo865invoke() {
                return Worker.this.getForegroundInfo();
            }
        });
        return e;
    }

    @Override // androidx.work.b
    public final j64 startWork() {
        j64 e;
        Executor backgroundExecutor = getBackgroundExecutor();
        zq3.g(backgroundExecutor, "backgroundExecutor");
        e = zk9.e(backgroundExecutor, new qs2() { // from class: androidx.work.Worker$startWork$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b.a mo865invoke() {
                return Worker.this.doWork();
            }
        });
        return e;
    }
}
