package com.nytimes.android.subauth.core.auth.userdetails;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zendesk.core.BuildConfig;

@fc1(c = "com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager", f = "UserDetailsManager.kt", l = {43, 47, 50, BuildConfig.VERSION_CODE}, m = "queryUserDetails")
/* loaded from: classes4.dex */
final class UserDetailsManager$queryUserDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserDetailsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailsManager$queryUserDetails$1(UserDetailsManager userDetailsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = userDetailsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(false, this);
    }
}
