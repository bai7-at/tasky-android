package com.nytimes.subauth.ui.login;

import androidx.fragment.app.f;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onFacebookSSOPressed$1", f = "SubauthLoginViewModel.kt", l = {583, 596, ContentDeliverySubscriptionType.TRADITIONAL_MVPD, ContentDeliverySubscriptionType.TRADITIONAL_MVPD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onFacebookSSOPressed$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ f $activity;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onFacebookSSOPressed$1(SubauthLoginViewModel subauthLoginViewModel, f fVar, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthLoginViewModel$onFacebookSSOPressed$1(this.this$0, this.$activity, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthLoginViewModel$onFacebookSSOPressed$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onFacebookSSOPressed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
