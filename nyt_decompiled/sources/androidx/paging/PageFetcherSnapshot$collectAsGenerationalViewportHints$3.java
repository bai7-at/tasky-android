package androidx.paging;

import defpackage.by0;
import defpackage.en5;
import defpackage.fc1;
import defpackage.it2;
import defpackage.kx2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements it2 {
    final /* synthetic */ LoadType $loadType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, by0 by0Var) {
        super(3, by0Var);
        this.$loadType = loadType;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kx2 kx2Var, kx2 kx2Var2, by0 by0Var) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.$loadType, by0Var);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$0 = kx2Var;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$1 = kx2Var2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        kx2 kx2Var = (kx2) this.L$0;
        kx2 kx2Var2 = (kx2) this.L$1;
        return en5.a(kx2Var2, kx2Var, this.$loadType) ? kx2Var2 : kx2Var;
    }
}
