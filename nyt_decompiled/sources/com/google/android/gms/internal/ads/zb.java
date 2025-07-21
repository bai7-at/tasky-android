package com.google.android.gms.internal.ads;

import defpackage.ake;
import defpackage.ehe;
import defpackage.gge;
import defpackage.gke;
import defpackage.j64;
import defpackage.nke;
import defpackage.zje;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class zb extends bc {
    /* JADX WARN: Multi-variable type inference failed */
    public static yb a(Iterable iterable) {
        return new yb(false, zzgaa.p(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yb b(Iterable iterable) {
        int i = zzgaa.c;
        iterable.getClass();
        return new yb(true, zzgaa.p(iterable), null);
    }

    public static yb c(j64... j64VarArr) {
        return new yb(true, zzgaa.q(j64VarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j64 d(Iterable iterable) {
        return new qb(zzgaa.p(iterable), true);
    }

    public static j64 e(j64 j64Var, Class cls, gge ggeVar, Executor executor) {
        ra raVar = new ra(j64Var, cls, ggeVar);
        j64Var.a(raVar, lc.c(executor, raVar));
        return raVar;
    }

    public static j64 f(j64 j64Var, Class cls, ake akeVar, Executor executor) {
        qa qaVar = new qa(j64Var, cls, akeVar);
        j64Var.a(qaVar, lc.c(executor, qaVar));
        return qaVar;
    }

    public static j64 g(Throwable th) {
        th.getClass();
        return new cc(th);
    }

    public static j64 h(Object obj) {
        return obj == null ? dc.b : new dc(obj);
    }

    public static j64 i() {
        return dc.b;
    }

    public static j64 j(Callable callable, Executor executor) {
        qc qcVar = new qc(callable);
        executor.execute(qcVar);
        return qcVar;
    }

    public static j64 k(zje zjeVar, Executor executor) {
        qc qcVar = new qc(zjeVar);
        executor.execute(qcVar);
        return qcVar;
    }

    public static j64 l(j64... j64VarArr) {
        return new qb(zzgaa.q(j64VarArr), false);
    }

    public static j64 m(j64 j64Var, gge ggeVar, Executor executor) {
        hb hbVar = new hb(j64Var, ggeVar);
        j64Var.a(hbVar, lc.c(executor, hbVar));
        return hbVar;
    }

    public static j64 n(j64 j64Var, ake akeVar, Executor executor) {
        int i = ib.j;
        executor.getClass();
        gb gbVar = new gb(j64Var, akeVar);
        j64Var.a(gbVar, lc.c(executor, gbVar));
        return gbVar;
    }

    public static j64 o(j64 j64Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return j64Var.isDone() ? j64Var : pc.E(j64Var, j, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) {
        if (future.isDone()) {
            return nke.a(future);
        }
        throw new IllegalStateException(ehe.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return nke.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgec((Error) cause);
            }
            throw new zzgfo(cause);
        }
    }

    public static void r(j64 j64Var, gke gkeVar, Executor executor) {
        gkeVar.getClass();
        j64Var.a(new xb(j64Var, gkeVar), executor);
    }
}
