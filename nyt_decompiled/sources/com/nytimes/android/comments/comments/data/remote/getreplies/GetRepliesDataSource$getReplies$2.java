package com.nytimes.android.comments.comments.data.remote.getreplies;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.comments.comments.data.remote.CommentsResponse;
import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentKt;
import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentResponse;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.coroutinesutils.FetchResultKt;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.getreplies.GetRepliesDataSource$getReplies$2", f = "GetRepliesDataSource.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GetRepliesDataSource$getReplies$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ long $commentID;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $repliesNumber;
    int label;
    final /* synthetic */ GetRepliesDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRepliesDataSource$getReplies$2(GetRepliesDataSource getRepliesDataSource, String str, long j, int i, int i2, by0<? super GetRepliesDataSource$getReplies$2> by0Var) {
        super(2, by0Var);
        this.this$0 = getRepliesDataSource;
        this.$articleUrl = str;
        this.$commentID = j;
        this.$repliesNumber = i;
        this.$offset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new GetRepliesDataSource$getReplies$2(this.this$0, this.$articleUrl, this.$commentID, this.$repliesNumber, this.$offset, by0Var);
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
            long j = this.$commentID;
            int i2 = this.$repliesNumber;
            int i3 = this.$offset;
            this.label = 1;
            obj = CommentsApi.DefaultImpls.getRepliesBySequence$default(commentsApi, null, null, str, j, i2, i3, this, 3, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        final GetRepliesDataSource getRepliesDataSource = this.this$0;
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.comments.data.remote.getreplies.GetRepliesDataSource$getReplies$2.1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final RepliesResult invoke(CommentsResponse commentsResponse) {
                TimeStampUtil timeStampUtil;
                TimeStampUtil timeStampUtil2;
                zq3.h(commentsResponse, "commentResponse");
                List<CommentResponse> replies = ((CommentResponse) i.k0(commentsResponse.getComments())).getReplies();
                GetRepliesDataSource getRepliesDataSource2 = GetRepliesDataSource.this;
                ArrayList arrayList = new ArrayList(i.w(replies, 10));
                for (CommentResponse commentResponse : replies) {
                    timeStampUtil2 = getRepliesDataSource2.timeStampUtil;
                    arrayList.add(CommentKt.mapToComment(commentResponse, timeStampUtil2));
                }
                CommentResponse commentResponse2 = (CommentResponse) i.k0(commentsResponse.getComments());
                timeStampUtil = GetRepliesDataSource.this.timeStampUtil;
                return new RepliesResult(CommentKt.mapToComment(commentResponse2, timeStampUtil), arrayList);
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<RepliesResult>> by0Var) {
        return ((GetRepliesDataSource$getReplies$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
