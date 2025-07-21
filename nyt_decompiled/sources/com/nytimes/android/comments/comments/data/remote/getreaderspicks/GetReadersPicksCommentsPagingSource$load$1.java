package com.nytimes.android.comments.comments.data.remote.getreaderspicks;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSource", f = "GetReadersPicksCommentsPagingSource.kt", l = {31}, m = "load")
/* loaded from: classes4.dex */
final class GetReadersPicksCommentsPagingSource$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetReadersPicksCommentsPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetReadersPicksCommentsPagingSource$load$1(GetReadersPicksCommentsPagingSource getReadersPicksCommentsPagingSource, by0<? super GetReadersPicksCommentsPagingSource$load$1> by0Var) {
        super(by0Var);
        this.this$0 = getReadersPicksCommentsPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.load(null, this);
    }
}
