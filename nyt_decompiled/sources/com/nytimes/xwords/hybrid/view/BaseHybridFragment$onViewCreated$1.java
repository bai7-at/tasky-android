package com.nytimes.xwords.hybrid.view;

import android.os.Bundle;
import android.view.View;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.xwords.hybrid.view.BaseHybridFragment$onViewCreated$1", f = "BaseHybridFragment.kt", l = {266, 267, 268}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseHybridFragment$onViewCreated$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ View $view;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BaseHybridFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseHybridFragment$onViewCreated$1(BaseHybridFragment baseHybridFragment, Bundle bundle, View view, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = baseHybridFragment;
        this.$savedInstanceState = bundle;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BaseHybridFragment$onViewCreated$1(this.this$0, this.$savedInstanceState, this.$view, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r6.L$1
            wu2 r0 = (defpackage.wu2) r0
            java.lang.Object r1 = r6.L$0
            zu2 r1 = (defpackage.zu2) r1
            kotlin.f.b(r7)
            goto L6b
        L1d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L25:
            java.lang.Object r1 = r6.L$0
            zu2 r1 = (defpackage.zu2) r1
            kotlin.f.b(r7)
            goto L59
        L2d:
            kotlin.f.b(r7)
            goto L43
        L31:
            kotlin.f.b(r7)
            com.nytimes.xwords.hybrid.GamesHybridManager r7 = com.nytimes.xwords.hybrid.GamesHybridManager.a
            kotlinx.coroutines.flow.Flow r7 = r7.f()
            r6.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r6)
            if (r7 != r0) goto L43
            return r0
        L43:
            zu2 r7 = (defpackage.zu2) r7
            com.nytimes.xwords.hybrid.GamesHybridManager r1 = com.nytimes.xwords.hybrid.GamesHybridManager.a
            kotlinx.coroutines.flow.Flow r1 = r1.d()
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r6)
            if (r1 != r0) goto L56
            return r0
        L56:
            r5 = r1
            r1 = r7
            r7 = r5
        L59:
            wu2 r7 = (defpackage.wu2) r7
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r3 = r6.this$0
            r6.L$0 = r1
            r6.L$1 = r7
            r6.label = r2
            java.lang.Object r2 = com.nytimes.xwords.hybrid.view.BaseHybridFragment.i1(r3, r6)
            if (r2 != r0) goto L6a
            return r0
        L6a:
            r0 = r7
        L6b:
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.os.Bundle r2 = r6.$savedInstanceState
            java.lang.String r3 = r7.z1()
            r7.P1(r2, r1, r0, r3)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            java.lang.String r0 = r7.z1()
            r7.l1(r0)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.view.View r0 = r6.$view
            int r1 = defpackage.bh6.hybrid_container
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "findViewById(...)"
            defpackage.zq3.g(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.V1(r0)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.widget.FrameLayout r7 = r7.x1()
            r7.removeAllViews()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.widget.FrameLayout r7 = r7.x1()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r0 = r6.this$0
            od3 r0 = r0.N1()
            r7.addView(r0)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            r7.j1()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.widget.FrameLayout r7 = r7.x1()
            r7.requestFocus()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            android.widget.FrameLayout r7 = r7.x1()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r0 = r6.this$0
            r7.setOnKeyListener(r0)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r7 = r6.this$0
            od3 r7 = r7.N1()
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r0 = r6.this$0
            r7.setOnKeyListener(r0)
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r6 = r6.this$0
            kotlinx.coroutines.CompletableDeferred r6 = com.nytimes.xwords.hybrid.view.BaseHybridFragment.f1(r6)
            ww8 r7 = defpackage.ww8.a
            r6.complete(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.view.BaseHybridFragment$onViewCreated$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BaseHybridFragment$onViewCreated$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
