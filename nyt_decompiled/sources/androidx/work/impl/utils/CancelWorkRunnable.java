package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.ek7;
import defpackage.ek9;
import defpackage.gb7;
import defpackage.hi5;
import defpackage.ip8;
import defpackage.mm1;
import defpackage.pi5;
import defpackage.pj9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class CancelWorkRunnable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(pj9 pj9Var, String str) {
        WorkDatabase u = pj9Var.u();
        zq3.g(u, "workManagerImpl.workDatabase");
        j(u, str);
        androidx.work.impl.a r = pj9Var.r();
        zq3.g(r, "workManagerImpl.processor");
        r.t(str, 1);
        Iterator it2 = pj9Var.s().iterator();
        while (it2.hasNext()) {
            ((gb7) it2.next()).b(str);
        }
    }

    public static final hi5 e(UUID uuid, pj9 pj9Var) {
        zq3.h(uuid, "id");
        zq3.h(pj9Var, "workManagerImpl");
        ip8 n = pj9Var.n().n();
        ek7 c = pj9Var.v().c();
        zq3.g(c, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return pi5.c(n, "CancelWorkById", c, new CancelWorkRunnable$forId$1(pj9Var, uuid));
    }

    public static final hi5 f(final String str, final pj9 pj9Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(pj9Var, "workManagerImpl");
        ip8 n = pj9Var.n().n();
        String str2 = "CancelWorkByName_" + str;
        ek7 c = pj9Var.v().c();
        zq3.g(c, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return pi5.c(n, str2, c, new qs2() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m133invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m133invoke() {
                CancelWorkRunnable.g(str, pj9Var);
                CancelWorkRunnable.k(pj9Var);
            }
        });
    }

    public static final void g(final String str, final pj9 pj9Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(pj9Var, "workManagerImpl");
        final WorkDatabase u = pj9Var.u();
        zq3.g(u, "workManagerImpl.workDatabase");
        u.runInTransaction(new Runnable() { // from class: jh0
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.h(WorkDatabase.this, str, pj9Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(WorkDatabase workDatabase, String str, pj9 pj9Var) {
        Iterator it2 = workDatabase.i().f(str).iterator();
        while (it2.hasNext()) {
            d(pj9Var, (String) it2.next());
        }
    }

    public static final hi5 i(String str, pj9 pj9Var) {
        zq3.h(str, "tag");
        zq3.h(pj9Var, "workManagerImpl");
        ip8 n = pj9Var.n().n();
        String str2 = "CancelWorkByTag_" + str;
        ek7 c = pj9Var.v().c();
        zq3.g(c, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return pi5.c(n, str2, c, new CancelWorkRunnable$forTag$1(pj9Var, str));
    }

    private static final void j(WorkDatabase workDatabase, String str) {
        ek9 i = workDatabase.i();
        mm1 d = workDatabase.d();
        List r = i.r(str);
        while (!r.isEmpty()) {
            String str2 = (String) i.L(r);
            WorkInfo.State g = i.g(str2);
            if (g != WorkInfo.State.SUCCEEDED && g != WorkInfo.State.FAILED) {
                i.j(str2);
            }
            r.addAll(d.a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(pj9 pj9Var) {
        androidx.work.impl.b.h(pj9Var.n(), pj9Var.u(), pj9Var.s());
    }
}
