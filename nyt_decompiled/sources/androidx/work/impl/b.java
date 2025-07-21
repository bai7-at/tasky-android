package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.b;
import androidx.work.impl.background.systemjob.SystemJobService;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.ek9;
import defpackage.gb7;
import defpackage.h94;
import defpackage.n62;
import defpackage.te8;
import defpackage.vm5;
import defpackage.zl0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class b {
    private static final String a = h94.i("Schedulers");

    static gb7 c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        te8 te8Var = new te8(context, workDatabase, aVar);
        vm5.c(context, SystemJobService.class, true);
        h94.e().a(a, "Created SystemJobScheduler and enabled SystemJobService");
        return te8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(List list, ej9 ej9Var, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((gb7) it2.next()).b(ej9Var.b());
        }
        h(aVar, workDatabase, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Executor executor, final List list, final androidx.work.a aVar, final WorkDatabase workDatabase, final ej9 ej9Var, boolean z) {
        executor.execute(new Runnable() { // from class: lb7
            @Override // java.lang.Runnable
            public final void run() {
                b.d(list, ej9Var, aVar, workDatabase);
            }
        });
    }

    private static void f(ek9 ek9Var, zl0 zl0Var, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = zl0Var.currentTimeMillis();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ek9Var.p(((dk9) it2.next()).a, currentTimeMillis);
            }
        }
    }

    public static void g(final List list, a aVar, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar2) {
        aVar.e(new n62() { // from class: kb7
            @Override // defpackage.n62
            public final void a(ej9 ej9Var, boolean z) {
                b.e(executor, list, aVar2, workDatabase, ej9Var, z);
            }
        });
    }

    public static void h(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ek9 i = workDatabase.i();
        workDatabase.beginTransaction();
        try {
            List x = i.x();
            f(i, aVar.a(), x);
            List s = i.s(aVar.h());
            f(i, aVar.a(), s);
            if (x != null) {
                s.addAll(x);
            }
            List n = i.n(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (s.size() > 0) {
                dk9[] dk9VarArr = (dk9[]) s.toArray(new dk9[s.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    gb7 gb7Var = (gb7) it2.next();
                    if (gb7Var.d()) {
                        gb7Var.c(dk9VarArr);
                    }
                }
            }
            if (n.size() > 0) {
                dk9[] dk9VarArr2 = (dk9[]) n.toArray(new dk9[n.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    gb7 gb7Var2 = (gb7) it3.next();
                    if (!gb7Var2.d()) {
                        gb7Var2.c(dk9VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
