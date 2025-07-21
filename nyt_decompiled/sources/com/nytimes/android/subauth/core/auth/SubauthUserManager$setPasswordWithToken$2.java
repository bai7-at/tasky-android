package com.nytimes.android.subauth.core.auth;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$setPasswordWithToken$2", f = "SubauthUserManager.kt", l = {1058, 1061}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$setPasswordWithToken$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $password;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$setPasswordWithToken$2(SubauthUserManager subauthUserManager, String str, String str2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
        this.$token = str;
        this.$password = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$setPasswordWithToken$2(this.this$0, this.$token, this.$password, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0013, B:8:0x0067, B:10:0x006d, B:14:0x0073, B:16:0x0077, B:19:0x009a, B:21:0x0085, B:23:0x008d, B:24:0x00a6, B:26:0x00aa, B:27:0x00be, B:28:0x00c3, B:31:0x0022, B:32:0x0051, B:40:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0013, B:8:0x0067, B:10:0x006d, B:14:0x0073, B:16:0x0077, B:19:0x009a, B:21:0x0085, B:23:0x008d, B:24:0x00a6, B:26:0x00aa, B:27:0x00be, B:28:0x00c3, B:31:0x0022, B:32:0x0051, B:40:0x0039), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$setPasswordWithToken$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$setPasswordWithToken$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
