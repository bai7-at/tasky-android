package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal", f = "TagManagerLocal.kt", l = {15, 19}, m = "refreshTagMetadata$suspendImpl")
/* loaded from: classes4.dex */
final class TagManagerLocal$refreshTagMetadata$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerLocal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerLocal$refreshTagMetadata$1(TagManagerLocal tagManagerLocal, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TagManagerLocal.e(this.this$0, this);
    }
}
