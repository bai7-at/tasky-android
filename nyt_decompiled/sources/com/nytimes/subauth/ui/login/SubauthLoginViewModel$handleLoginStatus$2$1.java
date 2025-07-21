package com.nytimes.subauth.ui.login;

import com.nytimes.subauth.ui.models.LoginType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.na4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleLoginStatus$2$1", f = "SubauthLoginViewModel.kt", l = {727}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$handleLoginStatus$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ na4.b $loginError;
    final /* synthetic */ LoginType $loginType;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$handleLoginStatus$2$1(SubauthLoginViewModel subauthLoginViewModel, LoginType loginType, na4.b bVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$loginType = loginType;
        this.$loginError = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$handleLoginStatus$2$1(this.this$0, this.$loginType, this.$loginError, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
            LoginType loginType = this.$loginType;
            na4.b bVar = this.$loginError;
            this.label = 1;
            if (subauthLIREFlowAnalyticsManager.u(loginType, bVar, this) == h) {
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
        return ((SubauthLoginViewModel$handleLoginStatus$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
