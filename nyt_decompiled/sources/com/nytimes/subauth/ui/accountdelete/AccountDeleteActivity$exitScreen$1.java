package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$exitScreen$1", f = "AccountDeleteActivity.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteActivity$exitScreen$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AccountDeleteViewModel.AccountDeleteDialogState $dialogState;
    int label;
    final /* synthetic */ AccountDeleteActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteActivity$exitScreen$1(AccountDeleteActivity accountDeleteActivity, AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountDeleteActivity;
        this.$dialogState = accountDeleteDialogState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteActivity$exitScreen$1(this.this$0, this.$dialogState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AccountDeleteViewModel accountDeleteViewModel;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            accountDeleteViewModel = this.this$0.b;
            if (accountDeleteViewModel == null) {
                zq3.z("viewModel");
                accountDeleteViewModel = null;
            }
            accountDeleteViewModel.k(this.$dialogState);
            this.label = 1;
            if (DelayKt.delay(200L, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.this$0.finishAfterTransition();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountDeleteActivity$exitScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
