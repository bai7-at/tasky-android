package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.i77;
import defpackage.ss2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$linkWithSSO$response$1", f = "SubauthUserManager.kt", l = {420, 418}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$linkWithSSO$response$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Map<String, String> $fieldMap;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ RegiInterface $regiInterface;
    final /* synthetic */ i77 $ssoType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$linkWithSSO$response$1(SubauthUserManager subauthUserManager, i77 i77Var, RegiInterface regiInterface, String str, Map map, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthUserManager;
        this.$ssoType = i77Var;
        this.$regiInterface = regiInterface;
        this.$marketingOptIn = str;
        this.$fieldMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$linkWithSSO$response$1(this.this$0, this.$ssoType, this.$regiInterface, this.$marketingOptIn, this.$fieldMap, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$linkWithSSO$response$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008a A[PHI: r15
      0x008a: PHI (r15v10 java.lang.Object) = (r15v6 java.lang.Object), (r15v0 java.lang.Object) binds: [B:16:0x0087, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
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
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r15)
            goto L8a
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L1c:
            java.lang.Object r1 = r14.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r14.L$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r3 = (com.nytimes.android.subauth.core.auth.network.UserAPI) r3
            kotlin.f.b(r15)
            goto L58
        L28:
            kotlin.f.b(r15)
            com.nytimes.android.subauth.core.auth.SubauthUserManager r15 = r14.this$0
            com.nytimes.android.subauth.core.auth.network.UserAPI r15 = r15.e0()
            i77 r1 = r14.$ssoType
            java.lang.String r1 = r1.a()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r5 = "toLowerCase(...)"
            defpackage.zq3.g(r1, r5)
            com.nytimes.android.subauth.core.auth.SubauthUserManager r5 = r14.this$0
            ss2 r5 = r5.U()
            if (r5 == 0) goto L5e
            r14.L$0 = r15
            r14.L$1 = r1
            r14.label = r3
            java.lang.Object r3 = r5.invoke(r14)
            if (r3 != r0) goto L55
            return r0
        L55:
            r13 = r3
            r3 = r15
            r15 = r13
        L58:
            java.lang.String r15 = (java.lang.String) r15
            r7 = r15
            r6 = r1
            r5 = r3
            goto L61
        L5e:
            r5 = r15
            r6 = r1
            r7 = r4
        L61:
            com.nytimes.android.subauth.core.auth.SubauthUserManager r15 = r14.this$0
            java.lang.String r11 = r15.b()
            com.nytimes.android.subauth.core.auth.models.RegiInterface r15 = r14.$regiInterface
            if (r15 == 0) goto L77
            com.nytimes.android.subauth.core.auth.SubauthUserManager r1 = r14.this$0
            android.content.res.Resources r1 = r1.c0()
            java.lang.String r15 = r15.toString(r1)
            r9 = r15
            goto L78
        L77:
            r9 = r4
        L78:
            java.lang.String r8 = r14.$marketingOptIn
            java.util.Map<java.lang.String, java.lang.String> r10 = r14.$fieldMap
            r14.L$0 = r4
            r14.L$1 = r4
            r14.label = r2
            r12 = r14
            java.lang.Object r15 = r5.ssoLogin(r6, r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L8a
            return r0
        L8a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$linkWithSSO$response$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
