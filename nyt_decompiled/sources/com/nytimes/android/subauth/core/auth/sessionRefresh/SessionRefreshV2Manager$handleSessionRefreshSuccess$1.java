package com.nytimes.android.subauth.core.auth.sessionRefresh;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager", f = "SessionRefreshV2Manager.kt", l = {278, 281}, m = "handleSessionRefreshSuccess")
/* loaded from: classes4.dex */
final class SessionRefreshV2Manager$handleSessionRefreshSuccess$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRefreshV2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRefreshV2Manager$handleSessionRefreshSuccess$1(SessionRefreshV2Manager sessionRefreshV2Manager, by0 by0Var) {
        super(by0Var);
        this.this$0 = sessionRefreshV2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object t;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        t = this.this$0.t(null, this);
        return t;
    }
}
