package com.nytimes.android.comments.comments.mvi;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel", f = "CommentsViewModel.kt", l = {714}, m = "recommendComment")
/* loaded from: classes4.dex */
final class CommentsViewModel$recommendComment$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$recommendComment$1(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$recommendComment$1> by0Var) {
        super(by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object recommendComment;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        recommendComment = this.this$0.recommendComment(0L, false, this);
        return recommendComment;
    }
}
