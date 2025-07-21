package com.nytimes.android.comments.comments.mvi;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$2", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$updateWithLocalChanges$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$2$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Set<Long> $flaggedComments;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommentsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommentsViewModel commentsViewModel, Set<Long> set, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.this$0 = commentsViewModel;
            this.$flaggedComments = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$flaggedComments, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(Comment comment, by0<? super Comment> by0Var) {
            return ((AnonymousClass1) create(comment, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Comment updateFlaggedComment;
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            updateFlaggedComment = this.this$0.updateFlaggedComment((Comment) this.L$0, this.$flaggedComments);
            return updateFlaggedComment;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModel$updateWithLocalChanges$2(CommentsViewModel commentsViewModel, by0<? super CommentsViewModel$updateWithLocalChanges$2> by0Var) {
        super(3, by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // defpackage.it2
    public final Object invoke(PagingData pagingData, Set<Long> set, by0<? super PagingData> by0Var) {
        CommentsViewModel$updateWithLocalChanges$2 commentsViewModel$updateWithLocalChanges$2 = new CommentsViewModel$updateWithLocalChanges$2(this.this$0, by0Var);
        commentsViewModel$updateWithLocalChanges$2.L$0 = pagingData;
        commentsViewModel$updateWithLocalChanges$2.L$1 = set;
        return commentsViewModel$updateWithLocalChanges$2.invokeSuspend(ww8.a);
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
        Set set = (Set) this.L$1;
        if (set.isEmpty()) {
            return pagingData;
        }
        a = PagingDataTransforms__PagingDataTransformsKt.a(pagingData, new AnonymousClass1(this.this$0, set, null));
        return a;
    }
}
