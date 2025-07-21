package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.h4;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ CoroutineScope $scope$inlined;
    final /* synthetic */ h4 $tracker$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(by0 by0Var, CoroutineScope coroutineScope, h4 h4Var) {
        super(3, by0Var);
        this.$scope$inlined = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            MulticastedPagingData multicastedPagingData = new MulticastedPagingData(this.$scope$inlined, (PagingData) this.L$1, null);
            this.label = 1;
            if (flowCollector.emit(multicastedPagingData, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(by0Var, this.$scope$inlined, null);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = flowCollector;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = obj;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(ww8.a);
    }
}
