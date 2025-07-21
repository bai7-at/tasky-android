package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsManager", f = "InterestsManager.kt", l = {80, 81, 85}, m = "removeInterest")
/* loaded from: classes4.dex */
final class InterestsManager$removeInterest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$removeInterest$1(InterestsManager interestsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.k(null, null, null, this);
    }
}
