package com.nytimes.subauth.ui.accountdelete;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase", f = "AccountDeleteUseCase.kt", l = {88}, m = "requestDelete$suspendImpl")
/* loaded from: classes4.dex */
final class AccountDeleteMainUseCase$requestDelete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountDeleteMainUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteMainUseCase$requestDelete$1(AccountDeleteMainUseCase accountDeleteMainUseCase, by0 by0Var) {
        super(by0Var);
        this.this$0 = accountDeleteMainUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return AccountDeleteMainUseCase.d(this.this$0, null, this);
    }
}
