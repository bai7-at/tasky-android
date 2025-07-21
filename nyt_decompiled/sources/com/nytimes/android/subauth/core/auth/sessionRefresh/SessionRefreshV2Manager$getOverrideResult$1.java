package com.nytimes.android.subauth.core.auth.sessionRefresh;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager", f = "SessionRefreshV2Manager.kt", l = {306}, m = "getOverrideResult")
/* loaded from: classes4.dex */
final class SessionRefreshV2Manager$getOverrideResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRefreshV2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRefreshV2Manager$getOverrideResult$1(SessionRefreshV2Manager sessionRefreshV2Manager, by0 by0Var) {
        super(by0Var);
        this.this$0 = sessionRefreshV2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        q = this.this$0.q(this);
        return q;
    }
}
