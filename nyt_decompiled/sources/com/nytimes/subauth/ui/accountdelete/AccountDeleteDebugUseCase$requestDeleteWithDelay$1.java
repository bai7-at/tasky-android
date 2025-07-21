package com.nytimes.subauth.ui.accountdelete;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteDebugUseCase", f = "AccountDeleteUseCase.kt", l = {35, 43}, m = "requestDeleteWithDelay")
/* loaded from: classes4.dex */
final class AccountDeleteDebugUseCase$requestDeleteWithDelay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountDeleteDebugUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteDebugUseCase$requestDeleteWithDelay$1(AccountDeleteDebugUseCase accountDeleteDebugUseCase, by0 by0Var) {
        super(by0Var);
        this.this$0 = accountDeleteDebugUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        f = this.this$0.f(null, this);
        return f;
    }
}
