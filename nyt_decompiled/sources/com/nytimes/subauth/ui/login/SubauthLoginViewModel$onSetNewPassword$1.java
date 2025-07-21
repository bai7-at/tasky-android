package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPassword$1", f = "SubauthLoginViewModel.kt", l = {358, 359, 365, 367, 377}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onSetNewPassword$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $email;
    final /* synthetic */ String $password;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onSetNewPassword$1(SubauthLoginViewModel subauthLoginViewModel, String str, String str2, String str3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$token = str;
        this.$password = str2;
        this.$email = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onSetNewPassword$1(this.this$0, this.$token, this.$password, this.$email, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L20
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L20:
            kotlin.f.b(r8)
            goto Lb8
        L25:
            kotlin.f.b(r8)
            goto L5f
        L29:
            kotlin.f.b(r8)
            goto L4c
        L2d:
            kotlin.f.b(r8)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r8)
            java.lang.Boolean r1 = defpackage.cc0.a(r6)
            r8.setValue(r1)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.k(r8)
            r7.label = r6
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L4c
            return r0
        L4c:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            o98 r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.r(r8)
            java.lang.String r1 = r7.$token
            java.lang.String r6 = r7.$password
            r7.label = r5
            java.lang.Object r8 = r8.u(r1, r6, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            yl7 r8 = (defpackage.yl7) r8
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r1)
            r5 = 0
            java.lang.Boolean r5 = defpackage.cc0.a(r5)
            r1.setValue(r5)
            boolean r1 = r8 instanceof yl7.b
            if (r1 == 0) goto La0
            yl7$b r8 = (yl7.b) r8
            com.nytimes.android.subauth.core.auth.network.response.LoginResponse r8 = r8.a()
            if (r8 == 0) goto L88
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            java.lang.String r2 = r7.$email
            r7.label = r4
            java.lang.Object r7 = r1.D0(r2, r8, r7)
            if (r7 != r0) goto Lb8
            return r0
        L88:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            yl7$a$b r1 = new yl7$a$b
            java.lang.String r2 = "No login response returned with set password with token"
            r1.<init>(r2)
            java.lang.String r2 = r7.$password
            int r2 = r2.length()
            r7.label = r3
            java.lang.Object r7 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.C(r8, r1, r2, r7)
            if (r7 != r0) goto Lb8
            return r0
        La0:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            java.lang.String r3 = "null cannot be cast to non-null type com.nytimes.android.subauth.core.auth.models.SetPasswordWithTokenStatus.Error"
            defpackage.zq3.f(r8, r3)
            yl7$a r8 = (yl7.a) r8
            java.lang.String r3 = r7.$password
            int r3 = r3.length()
            r7.label = r2
            java.lang.Object r7 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.C(r1, r8, r3, r7)
            if (r7 != r0) goto Lb8
            return r0
        Lb8:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPassword$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$onSetNewPassword$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
