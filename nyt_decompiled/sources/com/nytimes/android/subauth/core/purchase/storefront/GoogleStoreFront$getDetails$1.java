package com.nytimes.android.subauth.core.purchase.storefront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.http.StatusLine;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront", f = "GoogleStoreFront.kt", l = {StatusLine.HTTP_PERM_REDIRECT, 310}, m = "getDetails")
/* loaded from: classes4.dex */
final class GoogleStoreFront$getDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$getDetails$1(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        n = this.this$0.n(null, 0, this);
        return n;
    }
}
