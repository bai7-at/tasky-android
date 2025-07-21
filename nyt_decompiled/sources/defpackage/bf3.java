package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class bf3 {
    private final WorkDatabase a;

    public bf3(WorkDatabase workDatabase) {
        zq3.h(workDatabase, "workDatabase");
        this.a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(bf3 bf3Var) {
        int d;
        d = cf3.d(bf3Var.a, "next_alarm_manager_id");
        return Integer.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(bf3 bf3Var, int i, int i2) {
        int d;
        d = cf3.d(bf3Var.a, "next_job_scheduler_id");
        if (i > d || d > i2) {
            cf3.e(bf3Var.a, "next_job_scheduler_id", i + 1);
        } else {
            i = d;
        }
        return Integer.valueOf(i);
    }

    public final int c() {
        Object runInTransaction = this.a.runInTransaction((Callable<Object>) new Callable() { // from class: ze3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d;
                d = bf3.d(bf3.this);
                return d;
            }
        });
        zq3.g(runInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) runInTransaction).intValue();
    }

    public final int e(final int i, final int i2) {
        Object runInTransaction = this.a.runInTransaction((Callable<Object>) new Callable() { // from class: af3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f;
                f = bf3.f(bf3.this, i, i2);
                return f;
            }
        });
        zq3.g(runInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) runInTransaction).intValue();
    }
}
