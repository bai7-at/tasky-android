package com.nytimes.subauth.ui;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.SubauthUserUIManager", f = "SubauthUserUIManager.kt", l = {128}, m = "getOpenAccountDeleteFlowIntent")
/* loaded from: classes4.dex */
final class SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserUIManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1(SubauthUserUIManager subauthUserUIManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserUIManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, this);
    }
}
