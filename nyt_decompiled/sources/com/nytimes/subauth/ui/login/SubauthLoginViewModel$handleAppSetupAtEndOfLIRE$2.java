package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.cc0;
import defpackage.e15;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2", f = "SubauthLoginViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(e15 e15Var, by0 by0Var) {
        return ((SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2) create(e15Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2 subauthLoginViewModel$handleAppSetupAtEndOfLIRE$2 = new SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2(by0Var);
        subauthLoginViewModel$handleAppSetupAtEndOfLIRE$2.L$0 = obj;
        return subauthLoginViewModel$handleAppSetupAtEndOfLIRE$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return cc0.a(((e15) this.L$0) != null);
    }
}
