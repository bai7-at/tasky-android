package com.nytimes.android.comments.comments.mvi;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel", f = "CommentsViewModel.kt", l = {791}, m = "recommendReply")
/* loaded from: classes4.dex */
final class CommentsViewModel$recommendReply$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$recommendReply$1(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$recommendReply$1> by0Var) {
        super(by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object recommendReply;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        recommendReply = this.this$0.recommendReply(0L, 0L, false, this);
        return recommendReply;
    }
}
