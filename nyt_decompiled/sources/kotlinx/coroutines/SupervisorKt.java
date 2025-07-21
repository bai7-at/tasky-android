package kotlinx.coroutines;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* loaded from: classes5.dex */
public final class SupervisorKt {
    public static final CompletableJob SupervisorJob(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static /* synthetic */ CompletableJob SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }

    public static final <R> Object supervisorScope(gt2 gt2Var, by0<? super R> by0Var) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(by0Var.getContext(), by0Var);
        Object startUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(supervisorCoroutine, supervisorCoroutine, gt2Var);
        if (startUndispatchedOrReturn == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return startUndispatchedOrReturn;
    }

    /* renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ Job m880SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }
}
