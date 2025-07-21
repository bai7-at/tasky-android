package com.nytimes.android.comments.writenewcomment.mvi;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2", f = "WriteNewCommentViewModel.kt", l = {190}, m = "emit")
/* loaded from: classes4.dex */
final class WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WriteNewCommentViewModel$handleSubmitNewCommentResult$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1(WriteNewCommentViewModel$handleSubmitNewCommentResult$2<? super T> writeNewCommentViewModel$handleSubmitNewCommentResult$2, by0<? super WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1> by0Var) {
        super(by0Var);
        this.this$0 = writeNewCommentViewModel$handleSubmitNewCommentResult$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit((SubmitNewCommentResult) null, (by0<? super ww8>) this);
    }
}
