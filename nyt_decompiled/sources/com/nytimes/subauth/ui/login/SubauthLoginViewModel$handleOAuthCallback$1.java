package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleOAuthCallback$1", f = "SubauthLoginViewModel.kt", l = {641, 665, 665, 666}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$handleOAuthCallback$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $deepLink;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$handleOAuthCallback$1(SubauthLoginViewModel subauthLoginViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$deepLink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$handleOAuthCallback$1(this.this$0, this.$deepLink, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleOAuthCallback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$handleOAuthCallback$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
