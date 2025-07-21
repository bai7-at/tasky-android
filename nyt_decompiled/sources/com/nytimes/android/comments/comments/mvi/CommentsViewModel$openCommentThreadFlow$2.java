package com.nytimes.android.comments.comments.mvi;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$openCommentThreadFlow$2", f = "CommentsViewModel.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$openCommentThreadFlow$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $commentID;
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$openCommentThreadFlow$2(CommentsViewModel commentsViewModel, long j, by0<? super CommentsViewModel$openCommentThreadFlow$2> by0Var) {
        super(2, by0Var);
        this.this$0 = commentsViewModel;
        this.$commentID = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsViewModel$openCommentThreadFlow$2(this.this$0, this.$commentID, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object commentThread;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CommentsViewModel commentsViewModel = this.this$0;
            long j = this.$commentID;
            this.label = 1;
            commentThread = commentsViewModel.getCommentThread(j, this);
            if (commentThread == h) {
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
        return ((CommentsViewModel$openCommentThreadFlow$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
