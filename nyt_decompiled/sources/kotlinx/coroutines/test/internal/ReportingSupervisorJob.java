package kotlinx.coroutines.test.internal;

import defpackage.g62;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* loaded from: classes5.dex */
public final class ReportingSupervisorJob extends JobImpl {
    private final ss2 onChildCancellation;

    public /* synthetic */ ReportingSupervisorJob(Job job, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job, ss2Var);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        try {
            this.onChildCancellation.invoke(th);
        } catch (Throwable th2) {
            g62.a(th, th2);
            CoroutineExceptionHandlerKt.handleCoroutineException(this, th);
        }
        ww8 ww8Var = ww8.a;
        return false;
    }

    public final ss2 getOnChildCancellation() {
        return this.onChildCancellation;
    }

    public ReportingSupervisorJob(Job job, ss2 ss2Var) {
        super(job);
        this.onChildCancellation = ss2Var;
    }
}
