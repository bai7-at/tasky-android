package com.nytimes.android.comments.comments.data.remote.nytpickscomments;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSource", f = "GetNYTPicksCommentsPagingSource.kt", l = {32}, m = "load")
/* loaded from: classes4.dex */
final class GetNYTPicksCommentsPagingSource$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetNYTPicksCommentsPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetNYTPicksCommentsPagingSource$load$1(GetNYTPicksCommentsPagingSource getNYTPicksCommentsPagingSource, by0<? super GetNYTPicksCommentsPagingSource$load$1> by0Var) {
        super(by0Var);
        this.this$0 = getNYTPicksCommentsPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.load(null, this);
    }
}
