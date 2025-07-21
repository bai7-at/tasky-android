package com.nytimes.subauth.ui.providers;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider", f = "CustomLoginWithNYTSLambda.kt", l = {58, 81}, m = "executeLambda")
/* loaded from: classes4.dex */
final class CustomLoginWithNYTSProvider$executeLambda$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomLoginWithNYTSProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomLoginWithNYTSProvider$executeLambda$1(CustomLoginWithNYTSProvider customLoginWithNYTSProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = customLoginWithNYTSProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, null, this);
    }
}
