package com.nytimes.android.ads;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ads.AdClientImpl", f = "AdClientImpl.kt", l = {81}, m = "getNytCookies")
/* loaded from: classes2.dex */
final class AdClientImpl$getNytCookies$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdClientImpl$getNytCookies$1(AdClientImpl adClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = adClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.n(this);
    }
}
