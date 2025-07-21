package com.nytimes.android.messaging.regibundle;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$listenForSuccessfulPurchaseEvent$1", f = "RegibundleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegibundleFragment$listenForSuccessfulPurchaseEvent$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ RegibundleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegibundleFragment$listenForSuccessfulPurchaseEvent$1(RegibundleFragment regibundleFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = regibundleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RegibundleFragment$listenForSuccessfulPurchaseEvent$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.dismissAllowingStateLoss();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RegibundleFragment$listenForSuccessfulPurchaseEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
