package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
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

@fc1(c = "com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentDataSource$recommendComment$2", f = "RecommendCommentDataSource.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecommendCommentDataSource$recommendComment$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ long $commentID;
    final /* synthetic */ boolean $recommended;
    int label;
    final /* synthetic */ RecommendCommentDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendCommentDataSource$recommendComment$2(boolean z, String str, long j, RecommendCommentDataSource recommendCommentDataSource, by0<? super RecommendCommentDataSource$recommendComment$2> by0Var) {
        super(2, by0Var);
        this.$recommended = z;
        this.$articleUrl = str;
        this.$commentID = j;
        this.this$0 = recommendCommentDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new RecommendCommentDataSource$recommendComment$2(this.$recommended, this.$articleUrl, this.$commentID, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommentsApi commentsApi;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            RecommendCommentBody recommendCommentBody = new RecommendCommentBody(this.$articleUrl, this.$commentID, this.$recommended ? 1 : 0);
            commentsApi = this.this$0.commentsApi;
            this.label = 1;
            obj = CommentsApi.DefaultImpls.recommendComment$default(commentsApi, null, null, recommendCommentBody, this, 3, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        final boolean z = this.$recommended;
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentDataSource$recommendComment$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final RecommendCommentResult invoke(RecommendationCommentResponse recommendationCommentResponse) {
                zq3.h(recommendationCommentResponse, "recommendedComment");
                return new RecommendCommentResult(recommendationCommentResponse.getCommentID(), z, recommendationCommentResponse.getRecommendations());
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<RecommendCommentResult>> by0Var) {
        return ((RecommendCommentDataSource$recommendComment$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
