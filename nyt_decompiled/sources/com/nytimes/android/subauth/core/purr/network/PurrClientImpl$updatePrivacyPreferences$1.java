package com.nytimes.android.subauth.core.purr.network;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purr.network.PurrClientImpl", f = "PurrClientImpl.kt", l = {157, 169}, m = "updatePrivacyPreferences")
/* loaded from: classes4.dex */
final class PurrClientImpl$updatePrivacyPreferences$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrClientImpl$updatePrivacyPreferences$1(PurrClientImpl purrClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, null, this);
    }
}
