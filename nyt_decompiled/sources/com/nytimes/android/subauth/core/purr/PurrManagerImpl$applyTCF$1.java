package com.nytimes.android.subauth.core.purr;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl", f = "PurrManagerImpl.kt", l = {168, 181, 185}, m = "applyTCF")
/* loaded from: classes4.dex */
final class PurrManagerImpl$applyTCF$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$applyTCF$1(PurrManagerImpl purrManagerImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.t(null, false, false, this);
    }
}
