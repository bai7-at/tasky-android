package defpackage;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public interface jj9 {
    default void a(q08 q08Var) {
        zq3.h(q08Var, "workSpecId");
        d(q08Var, -512);
    }

    default void b(q08 q08Var, int i) {
        zq3.h(q08Var, "workSpecId");
        d(q08Var, i);
    }

    void c(q08 q08Var, WorkerParameters.a aVar);

    void d(q08 q08Var, int i);

    default void e(q08 q08Var) {
        zq3.h(q08Var, "workSpecId");
        c(q08Var, null);
    }
}
