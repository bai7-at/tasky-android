package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import com.facebook.AuthenticationTokenClaims;
import defpackage.dk9;
import defpackage.ek7;
import defpackage.j64;
import defpackage.qs2;
import defpackage.rg8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StatusRunnable {
    public static final j64 a(WorkDatabase workDatabase, rg8 rg8Var, final String str) {
        zq3.h(workDatabase, "<this>");
        zq3.h(rg8Var, "executor");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return b(workDatabase, rg8Var, new ss2() { // from class: androidx.work.impl.utils.StatusRunnable$forUniqueWork$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List invoke(WorkDatabase workDatabase2) {
                zq3.h(workDatabase2, "db");
                Object apply = dk9.A.apply(workDatabase2.i().m(str));
                zq3.g(apply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return (List) apply;
            }
        });
    }

    private static final j64 b(final WorkDatabase workDatabase, rg8 rg8Var, final ss2 ss2Var) {
        ek7 c = rg8Var.c();
        zq3.g(c, "executor.serialTaskExecutor");
        return ListenableFutureKt.f(c, "loadStatusFuture", new qs2() { // from class: androidx.work.impl.utils.StatusRunnable$loadStatusFuture$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                return ss2.this.invoke(workDatabase);
            }
        });
    }
}
