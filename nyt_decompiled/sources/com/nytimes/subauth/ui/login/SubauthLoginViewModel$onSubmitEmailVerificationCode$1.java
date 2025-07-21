package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSubmitEmailVerificationCode$1", f = "SubauthLoginViewModel.kt", l = {315, 317, 321, 325, 329}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onSubmitEmailVerificationCode$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $email;
    final /* synthetic */ String $verificationCode;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onSubmitEmailVerificationCode$1(SubauthLoginViewModel subauthLoginViewModel, String str, String str2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$verificationCode = str;
        this.$email = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onSubmitEmailVerificationCode$1(this.this$0, this.$verificationCode, this.$email, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
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
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
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
            goto Ld9
        L25:
            kotlin.f.b(r8)
            goto L91
        L29:
            kotlin.f.b(r8)
            goto L5d
        L2d:
            kotlin.f.b(r8)
            goto L43
        L31:
            kotlin.f.b(r8)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.k(r8)
            r7.label = r6
            java.lang.Object r8 = r8.x(r7)
            if (r8 != r0) goto L43
            return r0
        L43:
            java.lang.String r8 = r7.$verificationCode
            int r8 = r8.length()
            r1 = 6
            if (r8 >= r1) goto L71
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.k(r8)
            r7.label = r5
            java.lang.String r1 = "parameter-invalid:code"
            java.lang.Object r8 = r8.y(r1, r7)
            if (r8 != r0) goto L5d
            return r0
        L5d:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.t(r8)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r7 = r7.this$0
            dr2 r7 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.l(r7)
            na4$b r7 = r7.j()
            r8.setValue(r7)
            goto Ld9
        L71:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r8)
            java.lang.Boolean r1 = defpackage.cc0.a(r6)
            r8.setValue(r1)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = r7.this$0
            o98 r8 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.r(r8)
            java.lang.String r1 = r7.$email
            java.lang.String r5 = r7.$verificationCode
            r7.label = r4
            java.lang.Object r8 = r8.y(r1, r5, r7)
            if (r8 != r0) goto L91
            return r0
        L91:
            com.nytimes.android.subauth.core.auth.models.c r8 = (com.nytimes.android.subauth.core.auth.models.c) r8
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r1)
            r4 = 0
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            r1.setValue(r4)
            boolean r1 = r8 instanceof com.nytimes.android.subauth.core.auth.models.c.b
            if (r1 == 0) goto Lc8
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            java.lang.String r2 = r7.$email
            com.nytimes.android.subauth.core.auth.models.c$b r8 = (com.nytimes.android.subauth.core.auth.models.c.b) r8
            com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponse r8 = r8.a()
            com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponseData r8 = r8.a()
            if (r8 == 0) goto Lba
            java.lang.String r8 = r8.a()
            goto Lbb
        Lba:
            r8 = 0
        Lbb:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.label = r3
            java.lang.Object r7 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.E(r1, r2, r8, r7)
            if (r7 != r0) goto Ld9
            return r0
        Lc8:
            boolean r1 = r8 instanceof com.nytimes.android.subauth.core.auth.models.c.a
            if (r1 == 0) goto Ld9
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r7.this$0
            com.nytimes.android.subauth.core.auth.models.c$a r8 = (com.nytimes.android.subauth.core.auth.models.c.a) r8
            r7.label = r2
            java.lang.Object r7 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.D(r1, r8, r7)
            if (r7 != r0) goto Ld9
            return r0
        Ld9:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSubmitEmailVerificationCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$onSubmitEmailVerificationCode$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
