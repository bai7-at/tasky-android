package com.nytimes.android.comments.comments.data.remote.getcommentssummary;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentSummaryResponse;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.coroutinesutils.FetchResultKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource$getCommentsSummary$2", f = "GetCommentsSummaryDataSource.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GetCommentsSummaryDataSource$getCommentsSummary$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    int label;
    final /* synthetic */ GetCommentsSummaryDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCommentsSummaryDataSource$getCommentsSummary$2(GetCommentsSummaryDataSource getCommentsSummaryDataSource, String str, by0<? super GetCommentsSummaryDataSource$getCommentsSummary$2> by0Var) {
        super(2, by0Var);
        this.this$0 = getCommentsSummaryDataSource;
        this.$articleUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new GetCommentsSummaryDataSource$getCommentsSummary$2(this.this$0, this.$articleUrl, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommentsApi commentsApi;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            commentsApi = this.this$0.commentsApi;
            String str = this.$articleUrl;
            this.label = 1;
            obj = CommentsApi.DefaultImpls.getCommentsSummary$default(commentsApi, null, null, str, this, 3, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource$getCommentsSummary$2.1
            @Override // defpackage.ss2
            public final CommentsSummary invoke(CommentSummaryResponse commentSummaryResponse) {
                zq3.h(commentSummaryResponse, "commentSummaryResponse");
                return new CommentsSummary(commentSummaryResponse.getTotalCommentsFound(), commentSummaryResponse.getTotalReplyCommentsFound(), commentSummaryResponse.getTotalReporterReplyCommentsFound(), commentSummaryResponse.getTotalParentCommentsFound(), commentSummaryResponse.getTotalEditorsSelectionFound(), commentSummaryResponse.getTotalRecommendationsFound(), commentSummaryResponse.getCanSubmit() == 1, commentSummaryResponse.getSortBy());
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<CommentsSummary>> by0Var) {
        return ((GetCommentsSummaryDataSource$getCommentsSummary$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
