package com.nytimes.android.subauth.core.purchase.storefront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront", f = "GoogleStoreFront.kt", l = {98, 100}, m = "getProductDetails")
/* loaded from: classes4.dex */
final class GoogleStoreFront$getProductDetails$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$getProductDetails$1(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.o(null, 0, this);
    }
}
