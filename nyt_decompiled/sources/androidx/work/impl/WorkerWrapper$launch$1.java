package androidx.work.impl;

import androidx.work.impl.WorkerWrapper;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h94;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkerWrapper$launch$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$launch$1(WorkerWrapper workerWrapper, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = workerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean c(WorkerWrapper.b bVar, WorkerWrapper workerWrapper) {
        boolean u;
        if (bVar instanceof WorkerWrapper.b.C0123b) {
            u = workerWrapper.r(((WorkerWrapper.b.C0123b) bVar).a());
        } else if (bVar instanceof WorkerWrapper.b.a) {
            workerWrapper.x(((WorkerWrapper.b.a) bVar).a());
            u = false;
        } else {
            if (!(bVar instanceof WorkerWrapper.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            u = workerWrapper.u(((WorkerWrapper.b.c) bVar).a());
        }
        return Boolean.valueOf(u);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WorkerWrapper$launch$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        final WorkerWrapper.b aVar;
        WorkDatabase workDatabase;
        CompletableJob completableJob;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                completableJob = this.this$0.o;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(this.this$0, null);
                this.label = 1;
                obj = BuildersKt.withContext(completableJob, workerWrapper$launch$1$resolution$1, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            aVar = (WorkerWrapper.b) obj;
        } catch (WorkerStoppedException e) {
            aVar = new WorkerWrapper.b.c(e.a());
        } catch (CancellationException unused) {
            aVar = new WorkerWrapper.b.a(null, 1, null);
        } catch (Throwable th) {
            str = WorkerWrapperKt.a;
            h94.e().d(str, "Unexpected error in WorkerWrapper", th);
            aVar = new WorkerWrapper.b.a(null, 1, null);
        }
        workDatabase = this.this$0.j;
        final WorkerWrapper workerWrapper = this.this$0;
        Object runInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean c;
                c = WorkerWrapper$launch$1.c(WorkerWrapper.b.this, workerWrapper);
                return c;
            }
        });
        zq3.g(runInTransaction, "workDatabase.runInTransa…          }\n            )");
        return runInTransaction;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WorkerWrapper$launch$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
