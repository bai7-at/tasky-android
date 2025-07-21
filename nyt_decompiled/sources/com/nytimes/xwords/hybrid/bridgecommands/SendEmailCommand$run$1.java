package com.nytimes.xwords.hybrid.bridgecommands;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand", f = "SendEmailCommand.kt", l = {24}, m = "run")
/* loaded from: classes4.dex */
final class SendEmailCommand$run$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendEmailCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendEmailCommand$run$1(SendEmailCommand sendEmailCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = sendEmailCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
