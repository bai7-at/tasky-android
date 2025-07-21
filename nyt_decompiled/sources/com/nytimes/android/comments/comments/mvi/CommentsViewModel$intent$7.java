package com.nytimes.android.comments.comments.mvi;

import com.nytimes.android.comments.comments.mvi.CommentsIntent;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$intent$7", f = "CommentsViewModel.kt", l = {205, 210}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$intent$7 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$intent$7(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$intent$7> by0Var) {
        super(2, by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsViewModel$intent$7(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommentsIntent commentsIntent;
        Object flagReply;
        Object flagComment;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            commentsIntent = this.this$0.tempCommentsIntent;
            if (commentsIntent != null) {
                CommentsViewModel commentsViewModel = this.this$0;
                if (commentsIntent instanceof CommentsIntent.FlagComment) {
                    CommentsIntent.FlagComment flagComment2 = (CommentsIntent.FlagComment) commentsIntent;
                    long commentID = flagComment2.getCommentID();
                    String flagOption = flagComment2.getFlagOption();
                    this.label = 1;
                    flagComment = commentsViewModel.flagComment(commentID, flagOption, this);
                    if (flagComment == h) {
                        return h;
                    }
                } else if (commentsIntent instanceof CommentsIntent.FlagReply) {
                    CommentsIntent.FlagReply flagReply2 = (CommentsIntent.FlagReply) commentsIntent;
                    long commentID2 = flagReply2.getCommentID();
                    long replyID = flagReply2.getReplyID();
                    String flagOption2 = flagReply2.getFlagOption();
                    this.label = 2;
                    flagReply = commentsViewModel.flagReply(commentID2, replyID, flagOption2, this);
                    if (flagReply == h) {
                        return h;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.this$0.tempCommentsIntent = null;
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((CommentsViewModel$intent$7) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
