package com.nytimes.android.entitlements;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl", f = "ECommClientImpl.kt", l = {267}, m = "reAuth")
/* loaded from: classes4.dex */
final class ECommClientImpl$reAuth$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$reAuth$1(ECommClientImpl eCommClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = eCommClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.j(null, null, null, this);
    }
}
