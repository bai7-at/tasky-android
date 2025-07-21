package com.nytimes.android.subauth.core.purr;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl", f = "PurrManagerImpl.kt", l = {120, 133}, m = "applyPreference")
/* loaded from: classes4.dex */
final class PurrManagerImpl$applyPreference$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$applyPreference$1(PurrManagerImpl purrManagerImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, null, this);
    }
}
