package com.nytimes.android.subauth.core.auth;

import defpackage.by0;
import defpackage.fc1;
import defpackage.lh5;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$handleOnTapLoginResult$linkResult$1", f = "SubauthUserManager.kt", l = {482, 480}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$handleOnTapLoginResult$linkResult$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ lh5 $oneTapResult;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$handleOnTapLoginResult$linkResult$1(SubauthUserManager subauthUserManager, lh5 lh5Var, String str, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$oneTapResult = lh5Var;
        this.$marketingOptIn = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$handleOnTapLoginResult$linkResult$1(this.this$0, this.$oneTapResult, this.$marketingOptIn, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$handleOnTapLoginResult$linkResult$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0079 A[PHI: r13
      0x0079: PHI (r13v12 java.lang.Object) = (r13v7 java.lang.Object), (r13v0 java.lang.Object) binds: [B:16:0x0076, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r13)
            goto L79
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1c:
            java.lang.Object r1 = r12.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r12.L$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r3 = (com.nytimes.android.subauth.core.auth.network.UserAPI) r3
            kotlin.f.b(r13)
            goto L51
        L28:
            kotlin.f.b(r13)
            com.nytimes.android.subauth.core.auth.SubauthUserManager r13 = r12.this$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r13 = r13.e0()
            lh5 r1 = r12.$oneTapResult
            lh5$c r1 = (lh5.c) r1
            java.lang.String r1 = r1.a()
            com.nytimes.android.subauth.core.auth.SubauthUserManager r5 = r12.this$0
            ss2 r5 = r5.U()
            if (r5 == 0) goto L57
            r12.L$0 = r13
            r12.L$1 = r1
            r12.label = r3
            java.lang.Object r3 = r5.invoke(r12)
            if (r3 != r0) goto L4e
            return r0
        L4e:
            r11 = r3
            r3 = r13
            r13 = r11
        L51:
            java.lang.String r13 = (java.lang.String) r13
            r7 = r13
            r6 = r1
            r5 = r3
            goto L5a
        L57:
            r5 = r13
            r6 = r1
            r7 = r4
        L5a:
            java.lang.String r13 = r12.$marketingOptIn
            if (r13 != 0) goto L64
            com.nytimes.android.subauth.core.auth.SubauthUserManager r13 = r12.this$0
            java.lang.String r13 = com.nytimes.android.subauth.core.auth.SubauthUserManager.J(r13)
        L64:
            r8 = r13
            com.nytimes.android.subauth.core.auth.SubauthUserManager r13 = r12.this$0
            java.lang.String r9 = r13.b()
            r12.L$0 = r4
            r12.L$1 = r4
            r12.label = r2
            r10 = r12
            java.lang.Object r13 = r5.oneTapLogin(r6, r7, r8, r9, r10)
            if (r13 != r0) goto L79
            return r0
        L79:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$handleOnTapLoginResult$linkResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
