package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    CachedPagingDataKt$cachedIn$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MulticastedPagingData multicastedPagingData, MulticastedPagingData multicastedPagingData2, by0 by0Var) {
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(by0Var);
        cachedPagingDataKt$cachedIn$2.L$0 = multicastedPagingData;
        cachedPagingDataKt$cachedIn$2.L$1 = multicastedPagingData2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$0;
            kotlin.f.b(obj);
            return multicastedPagingData;
        }
        kotlin.f.b(obj);
        MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
        MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.L$1;
        this.L$0 = multicastedPagingData3;
        this.label = 1;
        return multicastedPagingData2.c(this) == h ? h : multicastedPagingData3;
    }
}
