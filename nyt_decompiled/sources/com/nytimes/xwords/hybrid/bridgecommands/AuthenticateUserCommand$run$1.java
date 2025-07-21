package com.nytimes.xwords.hybrid.bridgecommands;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.xwords.hybrid.bridgecommands.AuthenticateUserCommand", f = "AuthenticateUserCommand.kt", l = {34, 35, 47, 49, 51}, m = "run")
/* loaded from: classes4.dex */
final class AuthenticateUserCommand$run$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthenticateUserCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticateUserCommand$run$1(AuthenticateUserCommand authenticateUserCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = authenticateUserCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
