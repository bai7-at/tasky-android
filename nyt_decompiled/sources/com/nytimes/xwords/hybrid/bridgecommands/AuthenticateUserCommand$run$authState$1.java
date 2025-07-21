package com.nytimes.xwords.hybrid.bridgecommands;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zu2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.xwords.hybrid.bridgecommands.AuthenticateUserCommand$run$authState$1", f = "AuthenticateUserCommand.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AuthenticateUserCommand$run$authState$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ zu2 $currentAuthState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticateUserCommand$run$authState$1(zu2 zu2Var, by0 by0Var) {
        super(2, by0Var);
        this.$currentAuthState = zu2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(zu2 zu2Var, by0 by0Var) {
        return ((AuthenticateUserCommand$run$authState$1) create(zu2Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AuthenticateUserCommand$run$authState$1 authenticateUserCommand$run$authState$1 = new AuthenticateUserCommand$run$authState$1(this.$currentAuthState, by0Var);
        authenticateUserCommand$run$authState$1.L$0 = obj;
        return authenticateUserCommand$run$authState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return cc0.a(((zu2) this.L$0).d() > this.$currentAuthState.d());
    }
}
