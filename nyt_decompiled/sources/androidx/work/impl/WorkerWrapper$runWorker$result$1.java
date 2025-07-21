package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.utils.WorkForegroundKt;
import com.comscore.streaming.ContentFeedType;
import defpackage.ap2;
import defpackage.by0;
import defpackage.dk9;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h94;
import defpackage.j64;
import defpackage.rg8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {ContentFeedType.OTHER, 311}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ap2 $foregroundUpdater;
    final /* synthetic */ androidx.work.b $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, androidx.work.b bVar, ap2 ap2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = workerWrapper;
        this.$worker = bVar;
        this.$foregroundUpdater = ap2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        rg8 rg8Var;
        String str;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            context = this.this$0.b;
            dk9 m = this.this$0.m();
            androidx.work.b bVar = this.$worker;
            ap2 ap2Var = this.$foregroundUpdater;
            rg8Var = this.this$0.f;
            this.label = 1;
            if (WorkForegroundKt.b(context, m, bVar, ap2Var, rg8Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.f.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        str = WorkerWrapperKt.a;
        WorkerWrapper workerWrapper = this.this$0;
        h94.e().a(str, "Starting work for " + workerWrapper.m().c);
        j64 startWork = this.$worker.startWork();
        zq3.g(startWork, "worker.startWork()");
        androidx.work.b bVar2 = this.$worker;
        this.label = 2;
        obj = WorkerWrapperKt.d(startWork, bVar2, this);
        return obj == h ? h : obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WorkerWrapper$runWorker$result$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
