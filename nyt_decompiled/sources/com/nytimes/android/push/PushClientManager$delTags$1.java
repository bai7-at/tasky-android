package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.PushClientManager", f = "PushClientManager.kt", l = {63}, m = "delTags")
/* loaded from: classes4.dex */
final class PushClientManager$delTags$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushClientManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushClientManager$delTags$1(PushClientManager pushClientManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = pushClientManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(null, this);
    }
}
