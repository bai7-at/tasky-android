package com.nytimes.subauth.ui.login;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel", f = "SubauthLoginViewModel.kt", l = {515, 524, 534, 534}, m = "attemptRegistration")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$attemptRegistration$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$attemptRegistration$1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        K = this.this$0.K(null, null, false, null, this);
        return K;
    }
}
