package com.nytimes.subauth.ui.login;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager", f = "SubauthLIREFlowAnalyticsManager.kt", l = {102}, m = "onLIREPageEvent")
/* loaded from: classes4.dex */
final class SubauthLIREFlowAnalyticsManager$onLIREPageEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLIREFlowAnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLIREFlowAnalyticsManager$onLIREPageEvent$1(SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLIREFlowAnalyticsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.t(null, false, null, null, this);
    }
}
