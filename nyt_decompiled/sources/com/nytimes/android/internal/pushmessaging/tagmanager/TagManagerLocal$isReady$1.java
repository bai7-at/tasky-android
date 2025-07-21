package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal", f = "TagManagerLocal.kt", l = {23}, m = "isReady$suspendImpl")
/* loaded from: classes4.dex */
final class TagManagerLocal$isReady$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerLocal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerLocal$isReady$1(TagManagerLocal tagManagerLocal, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TagManagerLocal.d(this.this$0, this);
    }
}
