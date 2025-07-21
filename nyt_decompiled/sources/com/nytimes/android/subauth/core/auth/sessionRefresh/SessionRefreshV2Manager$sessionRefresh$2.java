package com.nytimes.android.subauth.core.auth.sessionRefresh;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager", f = "SessionRefreshV2Manager.kt", l = {ContentType.LONG_FORM_ON_DEMAND, 140}, m = "sessionRefresh")
/* loaded from: classes4.dex */
final class SessionRefreshV2Manager$sessionRefresh$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRefreshV2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRefreshV2Manager$sessionRefresh$2(SessionRefreshV2Manager sessionRefreshV2Manager, by0 by0Var) {
        super(by0Var);
        this.this$0 = sessionRefreshV2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object v;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        v = this.this$0.v(false, this);
        return v;
    }
}
