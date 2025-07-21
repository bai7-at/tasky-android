package androidx.work.impl.utils;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.impl.WorkerWrapperKt;
import defpackage.ap2;
import defpackage.by0;
import defpackage.dk9;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h94;
import defpackage.j64;
import defpackage.wo2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ ap2 $foregroundUpdater;
    final /* synthetic */ dk9 $spec;
    final /* synthetic */ androidx.work.b $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkForegroundKt$workForeground$2(androidx.work.b bVar, dk9 dk9Var, ap2 ap2Var, Context context, by0 by0Var) {
        super(2, by0Var);
        this.$worker = bVar;
        this.$spec = dk9Var;
        this.$foregroundUpdater = ap2Var;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WorkForegroundKt$workForeground$2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            j64 foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            zq3.g(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
            androidx.work.b bVar = this.$worker;
            this.label = 1;
            obj = WorkerWrapperKt.d(foregroundInfoAsync, bVar, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    f.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        wo2 wo2Var = (wo2) obj;
        if (wo2Var == null) {
            throw new IllegalStateException("Worker was marked important (" + this.$spec.c + ") but did not provide ForegroundInfo");
        }
        str = WorkForegroundKt.a;
        dk9 dk9Var = this.$spec;
        h94.e().a(str, "Updating notification for " + dk9Var.c);
        j64 a = this.$foregroundUpdater.a(this.$context, this.$worker.getId(), wo2Var);
        zq3.g(a, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
        this.label = 2;
        obj = ListenableFutureKt.b(a, this);
        return obj == h ? h : obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WorkForegroundKt$workForeground$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
