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

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$intent$2", f = "CommentsViewModel.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$intent$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ CommentsIntent $commentsIntent;
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$intent$2(CommentsViewModel commentsViewModel, CommentsIntent commentsIntent, by0<? super CommentsViewModel$intent$2> by0Var) {
        super(2, by0Var);
        this.this$0 = commentsViewModel;
        this.$commentsIntent = commentsIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsViewModel$intent$2(this.this$0, this.$commentsIntent, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object recommendReply;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CommentsViewModel commentsViewModel = this.this$0;
            long commentID = ((CommentsIntent.RecommendReply) this.$commentsIntent).getCommentID();
            long replyID = ((CommentsIntent.RecommendReply) this.$commentsIntent).getReplyID();
            boolean recommended = ((CommentsIntent.RecommendReply) this.$commentsIntent).getRecommended();
            this.label = 1;
            recommendReply = commentsViewModel.recommendReply(commentID, replyID, recommended, this);
            if (recommendReply == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((CommentsViewModel$intent$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
