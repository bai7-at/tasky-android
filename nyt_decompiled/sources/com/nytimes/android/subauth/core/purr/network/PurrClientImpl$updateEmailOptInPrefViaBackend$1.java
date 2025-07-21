package com.nytimes.android.subauth.core.purr.network;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purr.network.PurrClientImpl", f = "PurrClientImpl.kt", l = {326}, m = "updateEmailOptInPrefViaBackend")
/* loaded from: classes4.dex */
final class PurrClientImpl$updateEmailOptInPrefViaBackend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrClientImpl$updateEmailOptInPrefViaBackend$1(PurrClientImpl purrClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        o = this.this$0.o(false, null, false, this);
        return o;
    }
}
