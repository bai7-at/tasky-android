package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithWebSSO$2$response$1", f = "SubauthUserManager.kt", l = {315, 313}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$loginWithWebSSO$2$response$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ RegiInterface $regiInterface;
    final /* synthetic */ String $ssoProvider;
    Object L$0;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$loginWithWebSSO$2$response$1(SubauthUserManager subauthUserManager, RegiInterface regiInterface, String str, String str2, String str3, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$regiInterface = regiInterface;
        this.$ssoProvider = str;
        this.$marketingOptIn = str2;
        this.$accessToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$loginWithWebSSO$2$response$1(this.this$0, this.$regiInterface, this.$ssoProvider, this.$marketingOptIn, this.$accessToken, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$loginWithWebSSO$2$response$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006f A[PHI: r14
      0x006f: PHI (r14v11 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:16:0x006c, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r14)
            goto L6f
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1b:
            java.lang.Object r1 = r13.L$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r1 = (com.nytimes.android.subauth.core.auth.network.UserAPI) r1
            kotlin.f.b(r14)
            goto L3f
        L23:
            kotlin.f.b(r14)
            com.nytimes.android.subauth.core.auth.SubauthUserManager r14 = r13.this$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r1 = r14.e0()
            com.nytimes.android.subauth.core.auth.SubauthUserManager r14 = r13.this$0
            ss2 r14 = r14.U()
            if (r14 == 0) goto L44
            r13.L$0 = r1
            r13.label = r3
            java.lang.Object r14 = r14.invoke(r13)
            if (r14 != r0) goto L3f
            return r0
        L3f:
            java.lang.String r14 = (java.lang.String) r14
            r7 = r14
            r5 = r1
            goto L46
        L44:
            r5 = r1
            r7 = r4
        L46:
            com.nytimes.android.subauth.core.auth.SubauthUserManager r14 = r13.this$0
            java.lang.String r11 = r14.b()
            com.nytimes.android.subauth.core.auth.models.RegiInterface r14 = r13.$regiInterface
            if (r14 == 0) goto L5c
            com.nytimes.android.subauth.core.auth.SubauthUserManager r1 = r13.this$0
            android.content.res.Resources r1 = r1.c0()
            java.lang.String r14 = r14.toString(r1)
            r9 = r14
            goto L5d
        L5c:
            r9 = r4
        L5d:
            java.lang.String r6 = r13.$ssoProvider
            java.lang.String r8 = r13.$marketingOptIn
            java.lang.String r10 = r13.$accessToken
            r13.L$0 = r4
            r13.label = r2
            r12 = r13
            java.lang.Object r14 = r5.webSSOLogin(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L6f
            return r0
        L6f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithWebSSO$2$response$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
