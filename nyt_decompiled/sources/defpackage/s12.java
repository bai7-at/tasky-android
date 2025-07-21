package defpackage;

import androidx.work.Data;
import androidx.work.a;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class s12 {
    public static final void a(WorkDatabase workDatabase, a aVar, xi9 xi9Var) {
        int i;
        zq3.h(workDatabase, "workDatabase");
        zq3.h(aVar, "configuration");
        zq3.h(xi9Var, "continuation");
        List r = i.r(xi9Var);
        int i2 = 0;
        while (!r.isEmpty()) {
            xi9 xi9Var2 = (xi9) i.L(r);
            List g = xi9Var2.g();
            zq3.g(g, "current.work");
            List list = g;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((d) it2.next()).d().j.g() && (i = i + 1) < 0) {
                        i.u();
                    }
                }
            }
            i2 += i;
            List f = xi9Var2.f();
            if (f != null) {
                r.addAll(f);
            }
        }
        if (i2 == 0) {
            return;
        }
        int A = workDatabase.i().A();
        int b = aVar.b();
        if (A + i2 <= b) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b + ";\nalready enqueued count: " + A + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final dk9 b(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        boolean h = dk9Var.e.h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean h2 = dk9Var.e.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean h3 = dk9Var.e.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (h || !h2 || !h3) {
            return dk9Var;
        }
        return dk9.e(dk9Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new Data.a().c(dk9Var.e).p("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", dk9Var.c).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    public static final dk9 c(List list, dk9 dk9Var) {
        zq3.h(list, "schedulers");
        zq3.h(dk9Var, "workSpec");
        return b(dk9Var);
    }
}
