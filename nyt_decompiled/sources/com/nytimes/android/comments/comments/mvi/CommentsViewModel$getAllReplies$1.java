package com.nytimes.android.comments.comments.mvi;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel", f = "CommentsViewModel.kt", l = {884}, m = "getAllReplies")
/* loaded from: classes4.dex */
final class CommentsViewModel$getAllReplies$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$getAllReplies$1(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$getAllReplies$1> by0Var) {
        super(by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object allReplies;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        allReplies = this.this$0.getAllReplies(0L, this);
        return allReplies;
    }
}
