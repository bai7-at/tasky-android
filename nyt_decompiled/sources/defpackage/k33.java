package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public class k33 implements gb7, oe5, n62 {
    private static final String r = h94.i("GreedyScheduler");
    private final Context a;
    private pl1 c;
    private boolean d;
    private final androidx.work.impl.a g;
    private final jj9 h;
    private final androidx.work.a i;
    Boolean k;
    private final WorkConstraintsTracker l;
    private final rg8 m;
    private final yl8 n;
    private final Map b = new HashMap();
    private final Object e = new Object();
    private final r08 f = r08.a();
    private final Map j = new HashMap();

    private static class b {
        final int a;
        final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public k33(Context context, androidx.work.a aVar, kq8 kq8Var, androidx.work.impl.a aVar2, jj9 jj9Var, rg8 rg8Var) {
        this.a = context;
        i47 k = aVar.k();
        this.c = new pl1(this, k, aVar.a());
        this.n = new yl8(k, jj9Var);
        this.m = rg8Var;
        this.l = new WorkConstraintsTracker(kq8Var);
        this.i = aVar;
        this.g = aVar2;
        this.h = jj9Var;
    }

    private void f() {
        this.k = Boolean.valueOf(v36.b(this.a, this.i));
    }

    private void g() {
        if (this.d) {
            return;
        }
        this.g.e(this);
        this.d = true;
    }

    private void h(ej9 ej9Var) {
        Job job;
        synchronized (this.e) {
            job = (Job) this.b.remove(ej9Var);
        }
        if (job != null) {
            h94.e().a(r, "Stopping tracking for " + ej9Var);
            job.cancel((CancellationException) null);
        }
    }

    private long i(dk9 dk9Var) {
        long max;
        synchronized (this.e) {
            try {
                ej9 a2 = ik9.a(dk9Var);
                b bVar = (b) this.j.get(a2);
                if (bVar == null) {
                    bVar = new b(dk9Var.k, this.i.a().currentTimeMillis());
                    this.j.put(a2, bVar);
                }
                max = bVar.b + (Math.max((dk9Var.k - bVar.a) - 5, 0) * 30000);
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }

    @Override // defpackage.n62
    public void a(ej9 ej9Var, boolean z) {
        q08 c = this.f.c(ej9Var);
        if (c != null) {
            this.n.b(c);
        }
        h(ej9Var);
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(ej9Var);
        }
    }

    @Override // defpackage.gb7
    public void b(String str) {
        if (this.k == null) {
            f();
        }
        if (!this.k.booleanValue()) {
            h94.e().f(r, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        h94.e().a(r, "Cancelling work ID " + str);
        pl1 pl1Var = this.c;
        if (pl1Var != null) {
            pl1Var.b(str);
        }
        for (q08 q08Var : this.f.remove(str)) {
            this.n.b(q08Var);
            this.h.a(q08Var);
        }
    }

    @Override // defpackage.gb7
    public void c(dk9... dk9VarArr) {
        if (this.k == null) {
            f();
        }
        if (!this.k.booleanValue()) {
            h94.e().f(r, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<dk9> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (dk9 dk9Var : dk9VarArr) {
            if (!this.f.e(ik9.a(dk9Var))) {
                long max = Math.max(dk9Var.c(), i(dk9Var));
                long currentTimeMillis = this.i.a().currentTimeMillis();
                if (dk9Var.b == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < max) {
                        pl1 pl1Var = this.c;
                        if (pl1Var != null) {
                            pl1Var.a(dk9Var, max);
                        }
                    } else if (dk9Var.l()) {
                        gv0 gv0Var = dk9Var.j;
                        if (gv0Var.j()) {
                            h94.e().a(r, "Ignoring " + dk9Var + ". Requires device idle.");
                        } else if (gv0Var.g()) {
                            h94.e().a(r, "Ignoring " + dk9Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(dk9Var);
                            hashSet2.add(dk9Var.a);
                        }
                    } else if (!this.f.e(ik9.a(dk9Var))) {
                        h94.e().a(r, "Starting work for " + dk9Var.a);
                        q08 b2 = this.f.b(dk9Var);
                        this.n.c(b2);
                        this.h.e(b2);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    h94.e().a(r, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (dk9 dk9Var2 : hashSet) {
                        ej9 a2 = ik9.a(dk9Var2);
                        if (!this.b.containsKey(a2)) {
                            this.b.put(a2, WorkConstraintsTrackerKt.d(this.l, dk9Var2, this.m.b(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gb7
    public boolean d() {
        return false;
    }

    @Override // defpackage.oe5
    public void e(dk9 dk9Var, androidx.work.impl.constraints.a aVar) {
        ej9 a2 = ik9.a(dk9Var);
        if (aVar instanceof a.C0124a) {
            if (this.f.e(a2)) {
                return;
            }
            h94.e().a(r, "Constraints met: Scheduling work ID " + a2);
            q08 f = this.f.f(a2);
            this.n.c(f);
            this.h.e(f);
            return;
        }
        h94.e().a(r, "Constraints not met: Cancelling work ID " + a2);
        q08 c = this.f.c(a2);
        if (c != null) {
            this.n.b(c);
            this.h.b(c, ((a.b) aVar).a());
        }
    }
}
