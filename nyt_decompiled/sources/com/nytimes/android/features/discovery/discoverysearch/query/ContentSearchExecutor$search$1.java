package com.nytimes.android.features.discovery.discoverysearch.query;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor", f = "ContentSearchExecutor.kt", l = {38}, m = "search")
/* loaded from: classes4.dex */
final class ContentSearchExecutor$search$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContentSearchExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentSearchExecutor$search$1(ContentSearchExecutor contentSearchExecutor, by0 by0Var) {
        super(by0Var);
        this.this$0 = contentSearchExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, this);
    }
}
