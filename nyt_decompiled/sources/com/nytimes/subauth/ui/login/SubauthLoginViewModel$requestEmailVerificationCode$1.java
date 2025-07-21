package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$requestEmailVerificationCode$1", f = "SubauthLoginViewModel.kt", l = {297, 299}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$requestEmailVerificationCode$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $email;
    final /* synthetic */ boolean $isRequestOnInitialScreenLoad;
    Object L$0;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$requestEmailVerificationCode$1(SubauthLoginViewModel subauthLoginViewModel, String str, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$email = str;
        this.$isRequestOnInitialScreenLoad = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$requestEmailVerificationCode$1(this.this$0, this.$email, this.$isRequestOnInitialScreenLoad, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.L$0
            com.nytimes.android.subauth.core.auth.models.b r0 = (com.nytimes.android.subauth.core.auth.models.b) r0
            kotlin.f.b(r5)
            goto L5b
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L1e:
            kotlin.f.b(r5)
            goto L43
        L22:
            kotlin.f.b(r5)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r5)
            java.lang.Boolean r1 = defpackage.cc0.a(r3)
            r5.setValue(r1)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = r4.this$0
            o98 r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.r(r5)
            java.lang.String r1 = r4.$email
            r4.label = r3
            java.lang.Object r5 = r5.e(r1, r4)
            if (r5 != r0) goto L43
            return r0
        L43:
            com.nytimes.android.subauth.core.auth.models.b r5 = (com.nytimes.android.subauth.core.auth.models.b) r5
            boolean r1 = r4.$isRequestOnInitialScreenLoad
            if (r1 != 0) goto L5c
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r4.this$0
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r1 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.k(r1)
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.z(r4)
            if (r1 != r0) goto L5a
            return r0
        L5a:
            r0 = r5
        L5b:
            r5 = r0
        L5c:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r0 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r0 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r0)
            r1 = 0
            java.lang.Boolean r1 = defpackage.cc0.a(r1)
            r0.setValue(r1)
            boolean r5 = r5 instanceof com.nytimes.android.subauth.core.auth.models.b.a
            if (r5 == 0) goto L82
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.t(r5)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r4 = r4.this$0
            dr2 r4 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.l(r4)
            na4$b r4 = r4.h()
            r5.setValue(r4)
            goto L99
        L82:
            boolean r5 = r4.$isRequestOnInitialScreenLoad
            if (r5 != 0) goto L99
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.t(r5)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r4 = r4.this$0
            dr2 r4 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.l(r4)
            na4$d r4 = r4.c()
            r5.setValue(r4)
        L99:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$requestEmailVerificationCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$requestEmailVerificationCode$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
