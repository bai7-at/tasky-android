package com.nytimes.android.comments.comments.mvi;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.nytimes.android.comments.comments.data.remote.flagcomment.FlaggedReply;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$3", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$updateWithLocalChanges$3 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$3$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ List<FlaggedReply> $flaggedReplies;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommentsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommentsViewModel commentsViewModel, List<FlaggedReply> list, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.this$0 = commentsViewModel;
            this.$flaggedReplies = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$flaggedReplies, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(Comment comment, by0<? super Comment> by0Var) {
            return ((AnonymousClass1) create(comment, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Comment updateFlaggedReply;
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            updateFlaggedReply = this.this$0.updateFlaggedReply((Comment) this.L$0, this.$flaggedReplies);
            return updateFlaggedReply;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$updateWithLocalChanges$3(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$updateWithLocalChanges$3> by0Var) {
        super(3, by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // defpackage.it2
    public final Object invoke(PagingData pagingData, List<FlaggedReply> list, by0<? super PagingData> by0Var) {
        CommentsViewModel$updateWithLocalChanges$3 commentsViewModel$updateWithLocalChanges$3 = new CommentsViewModel$updateWithLocalChanges$3(this.this$0, by0Var);
        commentsViewModel$updateWithLocalChanges$3.L$0 = pagingData;
        commentsViewModel$updateWithLocalChanges$3.L$1 = list;
        return commentsViewModel$updateWithLocalChanges$3.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData a;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        PagingData pagingData = (PagingData) this.L$0;
        List list = (List) this.L$1;
        if (list.isEmpty()) {
            return pagingData;
        }
        a = PagingDataTransforms__PagingDataTransformsKt.a(pagingData, new AnonymousClass1(this.this$0, list, null));
        return a;
    }
}
