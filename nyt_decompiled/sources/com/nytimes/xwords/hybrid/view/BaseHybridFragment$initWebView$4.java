package com.nytimes.xwords.hybrid.view;

import defpackage.by0;
import defpackage.fc1;
import defpackage.sb3;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.xwords.hybrid.view.BaseHybridFragment$initWebView$4", f = "BaseHybridFragment.kt", l = {424}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseHybridFragment$initWebView$4 extends SuspendLambda implements ss2 {
    int label;
    final /* synthetic */ BaseHybridFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseHybridFragment$initWebView$4(BaseHybridFragment baseHybridFragment, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = baseHybridFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new BaseHybridFragment$initWebView$4(this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((BaseHybridFragment$initWebView$4) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            sb3 o1 = this.this$0.o1();
            this.label = 1;
            if (o1.b(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
