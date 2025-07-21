package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import defpackage.ek9;
import defpackage.h94;
import defpackage.kk9;
import defpackage.le8;
import defpackage.pj9;
import defpackage.uj9;
import defpackage.yp1;
import defpackage.zq3;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public b.a doWork() {
        String str;
        String str2;
        String d;
        String str3;
        String str4;
        String d2;
        String str5;
        String str6;
        String d3;
        pj9 p = pj9.p(getApplicationContext());
        zq3.g(p, "getInstance(applicationContext)");
        WorkDatabase u = p.u();
        zq3.g(u, "workManager.workDatabase");
        ek9 i = u.i();
        uj9 g = u.g();
        kk9 j = u.j();
        le8 f = u.f();
        List c = i.c(p.n().a().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List w = i.w();
        List n = i.n(200);
        if (!c.isEmpty()) {
            h94 e = h94.e();
            str5 = yp1.a;
            e.f(str5, "Recently completed work:\n\n");
            h94 e2 = h94.e();
            str6 = yp1.a;
            d3 = yp1.d(g, j, f, c);
            e2.f(str6, d3);
        }
        if (!w.isEmpty()) {
            h94 e3 = h94.e();
            str3 = yp1.a;
            e3.f(str3, "Running work:\n\n");
            h94 e4 = h94.e();
            str4 = yp1.a;
            d2 = yp1.d(g, j, f, w);
            e4.f(str4, d2);
        }
        if (!n.isEmpty()) {
            h94 e5 = h94.e();
            str = yp1.a;
            e5.f(str, "Enqueued work:\n\n");
            h94 e6 = h94.e();
            str2 = yp1.a;
            d = yp1.d(g, j, f, n);
            e6.f(str2, d);
        }
        b.a c2 = b.a.c();
        zq3.g(c2, "success()");
        return c2;
    }
}
