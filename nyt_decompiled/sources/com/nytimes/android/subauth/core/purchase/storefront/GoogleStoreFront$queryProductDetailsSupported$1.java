package com.nytimes.android.subauth.core.purchase.storefront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront", f = "GoogleStoreFront.kt", l = {289}, m = "queryProductDetailsSupported-IoAF18A")
/* loaded from: classes4.dex */
final class GoogleStoreFront$queryProductDetailsSupported$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$queryProductDetailsSupported$1(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object s = this.this$0.s(this);
        return s == kotlin.coroutines.intrinsics.a.h() ? s : Result.a(s);
    }
}
