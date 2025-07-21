package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$register$2$loginResponse$1", f = "SubauthUserManager.kt", l = {620, 617}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$register$2$loginResponse$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $email;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ String $marketingOptInDefaultState;
    final /* synthetic */ String $password;
    final /* synthetic */ RegiInterface $regiInterface;
    Object L$0;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$register$2$loginResponse$1(SubauthUserManager subauthUserManager, RegiInterface regiInterface, String str, String str2, String str3, String str4, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$regiInterface = regiInterface;
        this.$email = str;
        this.$password = str2;
        this.$marketingOptInDefaultState = str3;
        this.$marketingOptIn = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$register$2$loginResponse$1(this.this$0, this.$regiInterface, this.$email, this.$password, this.$marketingOptInDefaultState, this.$marketingOptIn, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$register$2$loginResponse$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0071 A[PHI: r15
      0x0071: PHI (r15v11 java.lang.Object) = (r15v7 java.lang.Object), (r15v0 java.lang.Object) binds: [B:16:0x006e, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r15)
            goto L71
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L1b:
            java.lang.Object r1 = r14.L$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r1 = (com.nytimes.android.subauth.core.auth.network.UserAPI) r1
            kotlin.f.b(r15)
            goto L3f
        L23:
            kotlin.f.b(r15)
            com.nytimes.android.subauth.core.auth.SubauthUserManager r15 = r14.this$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r1 = r15.e0()
            com.nytimes.android.subauth.core.auth.SubauthUserManager r15 = r14.this$0
            ss2 r15 = r15.U()
            if (r15 == 0) goto L44
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = r15.invoke(r14)
            if (r15 != r0) goto L3f
            return r0
        L3f:
            java.lang.String r15 = (java.lang.String) r15
            r8 = r15
            r5 = r1
            goto L46
        L44:
            r5 = r1
            r8 = r4
        L46:
            com.nytimes.android.subauth.core.auth.SubauthUserManager r15 = r14.this$0
            java.lang.String r12 = r15.b()
            com.nytimes.android.subauth.core.auth.models.RegiInterface r15 = r14.$regiInterface
            if (r15 == 0) goto L5c
            com.nytimes.android.subauth.core.auth.SubauthUserManager r1 = r14.this$0
            android.content.res.Resources r1 = r1.c0()
            java.lang.String r15 = r15.toString(r1)
            r11 = r15
            goto L5d
        L5c:
            r11 = r4
        L5d:
            java.lang.String r6 = r14.$email
            java.lang.String r7 = r14.$password
            java.lang.String r9 = r14.$marketingOptInDefaultState
            java.lang.String r10 = r14.$marketingOptIn
            r14.L$0 = r4
            r14.label = r2
            r13 = r14
            java.lang.Object r15 = r5.register(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L71
            return r0
        L71:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$register$2$loginResponse$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
