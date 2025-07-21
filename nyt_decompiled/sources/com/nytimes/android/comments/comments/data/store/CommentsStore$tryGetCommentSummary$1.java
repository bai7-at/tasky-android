package com.nytimes.android.comments.comments.data.store;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.data.store.CommentsStore", f = "CommentsStore.kt", l = {34}, m = "tryGetCommentSummary")
/* loaded from: classes4.dex */
final class CommentsStore$tryGetCommentSummary$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsStore$tryGetCommentSummary$1(CommentsStore commentsStore, by0<? super CommentsStore$tryGetCommentSummary$1> by0Var) {
        super(by0Var);
        this.this$0 = commentsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryGetCommentSummary;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        tryGetCommentSummary = this.this$0.tryGetCommentSummary(null, this);
        return tryGetCommentSummary;
    }
}
