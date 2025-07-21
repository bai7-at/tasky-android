package com.nytimes.android.comments.writenewcomment.mvi;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel", f = "WriteNewCommentViewModel.kt", l = {176, 177}, m = "handleSubmitNewCommentResult")
/* loaded from: classes4.dex */
final class WriteNewCommentViewModel$handleSubmitNewCommentResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WriteNewCommentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentViewModel$handleSubmitNewCommentResult$1(WriteNewCommentViewModel writeNewCommentViewModel, by0<? super WriteNewCommentViewModel$handleSubmitNewCommentResult$1> by0Var) {
        super(by0Var);
        this.this$0 = writeNewCommentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleSubmitNewCommentResult;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        handleSubmitNewCommentResult = this.this$0.handleSubmitNewCommentResult(this);
        return handleSubmitNewCommentResult;
    }
}
