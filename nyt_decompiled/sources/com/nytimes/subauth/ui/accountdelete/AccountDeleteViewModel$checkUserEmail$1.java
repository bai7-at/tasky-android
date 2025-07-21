package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$checkUserEmail$1", f = "AccountDeleteViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteViewModel$checkUserEmail$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AccountDeleteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteViewModel$checkUserEmail$1(AccountDeleteViewModel accountDeleteViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteViewModel$checkUserEmail$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean o;
        NYTUser nYTUser;
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        o = this.this$0.o();
        if (o) {
            return ww8.a;
        }
        nYTUser = this.this$0.a;
        String d = nYTUser.d();
        if (d == null) {
            mutableStateFlow2 = this.this$0.e;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, AccountDeleteViewModel.a.c((AccountDeleteViewModel.a) value2, "", AccountDeleteViewModel.AccountDeleteDialogState.ERROR_GENERAL, false, false, 12, null)));
        } else {
            mutableStateFlow = this.this$0.e;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, AccountDeleteViewModel.a.c((AccountDeleteViewModel.a) value, d, null, false, false, 14, null)));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountDeleteViewModel$checkUserEmail$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
