package com.nytimes.android.subauth.core.auth.userdetails;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager", f = "UserDetailsManager.kt", l = {157}, m = "logUserDetailsError")
/* loaded from: classes4.dex */
final class UserDetailsManager$logUserDetailsError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserDetailsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailsManager$logUserDetailsError$1(UserDetailsManager userDetailsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = userDetailsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        l = this.this$0.l(null, this);
        return l;
    }
}
