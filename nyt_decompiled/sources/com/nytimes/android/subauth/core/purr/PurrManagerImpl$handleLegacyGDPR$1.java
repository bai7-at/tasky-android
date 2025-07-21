package com.nytimes.android.subauth.core.purr;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl", f = "PurrManagerImpl.kt", l = {683, 687}, m = "handleLegacyGDPR")
/* loaded from: classes4.dex */
final class PurrManagerImpl$handleLegacyGDPR$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$handleLegacyGDPR$1(PurrManagerImpl purrManagerImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = purrManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object R;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        R = this.this$0.R(false, false, this);
        return R;
    }
}
