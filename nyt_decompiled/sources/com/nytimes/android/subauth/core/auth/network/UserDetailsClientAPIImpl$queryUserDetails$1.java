package com.nytimes.android.subauth.core.auth.network;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl", f = "UserDetailsClientAPIImpl.kt", l = {46}, m = "queryUserDetails")
/* loaded from: classes4.dex */
final class UserDetailsClientAPIImpl$queryUserDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserDetailsClientAPIImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailsClientAPIImpl$queryUserDetails$1(UserDetailsClientAPIImpl userDetailsClientAPIImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = userDetailsClientAPIImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
