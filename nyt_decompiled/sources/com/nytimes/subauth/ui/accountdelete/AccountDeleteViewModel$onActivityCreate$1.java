package com.nytimes.subauth.ui.accountdelete;

import defpackage.by0;
import defpackage.e58;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$onActivityCreate$1", f = "AccountDeleteViewModel.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteViewModel$onActivityCreate$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AccountDeleteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteViewModel$onActivityCreate$1(AccountDeleteViewModel accountDeleteViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteViewModel$onActivityCreate$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            MutableSharedFlow m = this.this$0.m();
            e58.c.a aVar = e58.c.a.c;
            this.label = 1;
            if (m.emit(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountDeleteViewModel$onActivityCreate$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
