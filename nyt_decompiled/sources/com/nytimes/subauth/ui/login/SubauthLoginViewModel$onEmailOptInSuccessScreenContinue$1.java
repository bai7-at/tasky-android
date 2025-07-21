package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1", f = "SubauthLoginViewModel.kt", l = {836, 840, 844}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Boolean $isOptIn;
    Object L$0;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1(SubauthLoginViewModel subauthLoginViewModel, Boolean bool, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$isOptIn = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1(this.this$0, this.$isOptIn, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r6)
            goto L98
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1e:
            java.lang.Object r1 = r5.L$0
            r54 r1 = (defpackage.r54) r1
            kotlin.f.b(r6)
            goto L73
        L26:
            kotlin.f.b(r6)
            goto L42
        L2a:
            kotlin.f.b(r6)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.k(r6)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r1 = r5.this$0
            p54 r1 = r1.T()
            r5.label = r4
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto L42
            return r0
        L42:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.u(r6)
            java.lang.Object r6 = r6.getValue()
            r1 = r6
            r54 r1 = (defpackage.r54) r1
            boolean r6 = r1 instanceof r54.f
            if (r6 == 0) goto L8b
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r6)
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            r6.setValue(r4)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            com.nytimes.android.subauth.core.purr.a r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.p(r6)
            java.lang.Boolean r4 = r5.$isOptIn
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.y(r4, r5)
            if (r6 != r0) goto L73
            return r0
        L73:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            r54$f r1 = (r54.f) r1
            na4 r3 = r1.c()
            boolean r1 = r1.e()
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.w(r6, r3, r1, r5)
            if (r5 != r0) goto L98
            return r0
        L8b:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "Calling onEmailOptInSuccessScreenContinue while not in SuccessRegiliteScreen state"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "SUBAUTH"
            r5.u(r0, r6)
        L98:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
