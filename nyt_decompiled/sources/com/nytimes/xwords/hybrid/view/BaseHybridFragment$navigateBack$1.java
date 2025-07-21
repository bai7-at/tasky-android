package com.nytimes.xwords.hybrid.view;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.xwords.hybrid.view.BaseHybridFragment$navigateBack$1", f = "BaseHybridFragment.kt", l = {469, 470}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseHybridFragment$navigateBack$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ BaseHybridFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseHybridFragment$navigateBack$1(BaseHybridFragment baseHybridFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = baseHybridFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BaseHybridFragment$navigateBack$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L45
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L1a:
            kotlin.f.b(r5)
            goto L30
        L1e:
            kotlin.f.b(r5)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r5 = r4.this$0
            kotlinx.coroutines.CompletableDeferred r5 = com.nytimes.xwords.hybrid.view.BaseHybridFragment.f1(r5)
            r4.label = r3
            java.lang.Object r5 = r5.await(r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r5 = r4.this$0
            od3 r5 = r5.N1()
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r1 = defpackage.g25.a()
            r4.label = r2
            java.lang.Class<com.nytimes.xwords.hybrid.bridgecommands.reponse.OnNavigateBackResponse> r2 = com.nytimes.xwords.hybrid.bridgecommands.reponse.OnNavigateBackResponse.class
            java.lang.Object r5 = r5.e(r1, r2, r4)
            if (r5 != r0) goto L45
            return r0
        L45:
            com.nytimes.xwords.hybrid.bridgecommands.reponse.OnNavigateBackResponse r5 = (com.nytimes.xwords.hybrid.bridgecommands.reponse.OnNavigateBackResponse) r5
            if (r5 == 0) goto L5f
            boolean r5 = r5.a()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r4 = r4.this$0
            if (r5 != 0) goto L5f
            androidx.fragment.app.f r4 = r4.requireActivity()
            java.lang.String r5 = "null cannot be cast to non-null type com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity"
            defpackage.zq3.f(r4, r5)
            com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity r4 = (com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity) r4
            r4.L()
        L5f:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.view.BaseHybridFragment$navigateBack$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BaseHybridFragment$navigateBack$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
