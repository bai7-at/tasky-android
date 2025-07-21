package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPagingDataKt$cachedIn$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ h4 $tracker;
    int label;

    CachedPagingDataKt$cachedIn$4(h4 h4Var, by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CachedPagingDataKt$cachedIn$4(null, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((CachedPagingDataKt$cachedIn$4) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
