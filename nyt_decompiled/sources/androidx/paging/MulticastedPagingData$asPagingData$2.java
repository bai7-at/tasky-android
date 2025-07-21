package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import zendesk.core.BuildConfig;

@fc1(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MulticastedPagingData$asPagingData$2 extends SuspendLambda implements it2 {
    int label;
    final /* synthetic */ MulticastedPagingData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastedPagingData$asPagingData$2(MulticastedPagingData multicastedPagingData, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = multicastedPagingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.this$0.d();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        return new MulticastedPagingData$asPagingData$2(this.this$0, by0Var).invokeSuspend(ww8.a);
    }
}
