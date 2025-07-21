package com.nytimes.android.fragment.article;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.fragment.article.WebContentLoader", f = "WebContentLoader.kt", l = {33}, m = "handleOnlineView")
/* loaded from: classes4.dex */
final class WebContentLoader$handleOnlineView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebContentLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebContentLoader$handleOnlineView$1(WebContentLoader webContentLoader, by0 by0Var) {
        super(by0Var);
        this.this$0 = webContentLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        e = this.this$0.e(null, this);
        return e;
    }
}
