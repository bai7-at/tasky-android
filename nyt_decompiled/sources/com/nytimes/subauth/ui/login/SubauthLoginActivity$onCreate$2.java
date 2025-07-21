package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.na4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginActivity$onCreate$2", f = "SubauthLoginActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginActivity$onCreate$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SubauthLoginActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginActivity$onCreate$2(SubauthLoginActivity subauthLoginActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginActivity;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(na4 na4Var, by0 by0Var) {
        return ((SubauthLoginActivity$onCreate$2) create(na4Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SubauthLoginActivity$onCreate$2 subauthLoginActivity$onCreate$2 = new SubauthLoginActivity$onCreate$2(this.this$0, by0Var);
        subauthLoginActivity$onCreate$2.L$0 = obj;
        return subauthLoginActivity$onCreate$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.O((na4) this.L$0);
        return ww8.a;
    }
}
