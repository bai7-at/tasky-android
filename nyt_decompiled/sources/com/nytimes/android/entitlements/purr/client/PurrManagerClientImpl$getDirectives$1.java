package com.nytimes.android.entitlements.purr.client;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl", f = "PurrManagerClientImpl.kt", l = {105}, m = "getDirectives")
/* loaded from: classes4.dex */
final class PurrManagerClientImpl$getDirectives$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrManagerClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerClientImpl$getDirectives$1(PurrManagerClientImpl purrManagerClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrManagerClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
