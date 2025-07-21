package com.nytimes.subauth.ui.login;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel", f = "SubauthLoginViewModel.kt", l = {1166, 1173, 1177, 1184, 1188, 1191}, m = "checkAndSendFinalLIREResultForSuccess")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$checkAndSendFinalLIREResultForSuccess$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$checkAndSendFinalLIREResultForSuccess$1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object L;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        L = this.this$0.L(this);
        return L;
    }
}
