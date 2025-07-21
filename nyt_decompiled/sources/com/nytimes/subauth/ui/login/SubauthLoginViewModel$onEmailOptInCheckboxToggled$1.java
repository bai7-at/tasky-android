package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.p54;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailOptInCheckboxToggled$1", f = "SubauthLoginViewModel.kt", l = {825}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onEmailOptInCheckboxToggled$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onEmailOptInCheckboxToggled$1(SubauthLoginViewModel subauthLoginViewModel, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$isChecked = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onEmailOptInCheckboxToggled$1(this.this$0, this.$isChecked, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
            boolean z = this.$isChecked;
            p54 T = this.this$0.T();
            this.label = 1;
            if (subauthLIREFlowAnalyticsManager.a(z, T, this) == h) {
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
        return ((SubauthLoginViewModel$onEmailOptInCheckboxToggled$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
