package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.e58;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$requestDeleteAccount$1", f = "AccountDeleteViewModel.kt", l = {108, 110}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteViewModel$requestDeleteAccount$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AccountDeleteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteViewModel$requestDeleteAccount$1(AccountDeleteViewModel accountDeleteViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteViewModel$requestDeleteAccount$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean o;
        a aVar;
        MutableStateFlow mutableStateFlow;
        AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState;
        MutableStateFlow mutableStateFlow2;
        Object value;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            MutableSharedFlow m = this.this$0.m();
            e58.b.C0479b c0479b = e58.b.C0479b.g;
            this.label = 1;
            if (m.emit(c0479b, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                accountDeleteDialogState = (AccountDeleteViewModel.AccountDeleteDialogState) obj;
                mutableStateFlow2 = this.this$0.e;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, AccountDeleteViewModel.a.c((AccountDeleteViewModel.a) value, null, accountDeleteDialogState, false, false, 13, null)));
                return ww8.a;
            }
            f.b(obj);
        }
        o = this.this$0.o();
        if (o) {
            return ww8.a;
        }
        aVar = this.this$0.c;
        mutableStateFlow = this.this$0.e;
        this.label = 2;
        obj = aVar.b(mutableStateFlow, this);
        if (obj == h) {
            return h;
        }
        accountDeleteDialogState = (AccountDeleteViewModel.AccountDeleteDialogState) obj;
        mutableStateFlow2 = this.this$0.e;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, AccountDeleteViewModel.a.c((AccountDeleteViewModel.a) value, null, accountDeleteDialogState, false, false, 13, null)));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountDeleteViewModel$requestDeleteAccount$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
