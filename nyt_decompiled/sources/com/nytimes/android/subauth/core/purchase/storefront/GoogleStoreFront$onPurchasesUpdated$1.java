package com.nytimes.android.subauth.core.purchase.storefront;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.y28;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$onPurchasesUpdated$1", f = "GoogleStoreFront.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$onPurchasesUpdated$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ y28 $purchaseStatus;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$onPurchasesUpdated$1(GoogleStoreFront googleStoreFront, y28 y28Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleStoreFront;
        this.$purchaseStatus = y28Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$onPurchasesUpdated$1(this.this$0, this.$purchaseStatus, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.h;
            y28 y28Var = this.$purchaseStatus;
            this.label = 1;
            if (mutableSharedFlow.emit(y28Var, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$onPurchasesUpdated$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
