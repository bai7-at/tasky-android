package com.nytimes.android.comments.comments.data.remote.getcommentbypermid;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.comments.comments.data.remote.CommentsResponse;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
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
import okhttp3.internal.http2.Http2;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.getcommentbypermid.GetCommentThreadDataSource$getCommentThread$2", f = "GetCommentThreadDataSource.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GetCommentThreadDataSource$getCommentThread$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ long $commentID;
    int label;
    final /* synthetic */ GetCommentThreadDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCommentThreadDataSource$getCommentThread$2(GetCommentThreadDataSource getCommentThreadDataSource, String str, long j, by0<? super GetCommentThreadDataSource$getCommentThread$2> by0Var) {
        super(2, by0Var);
        this.this$0 = getCommentThreadDataSource;
        this.$articleUrl = str;
        this.$commentID = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new GetCommentThreadDataSource$getCommentThread$2(this.this$0, this.$articleUrl, this.$commentID, by0Var);
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
            this.label = 1;
            obj = CommentsApi.DefaultImpls.getCommentByPermId$default(commentsApi, null, null, str, j, this, 3, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        final GetCommentThreadDataSource getCommentThreadDataSource = this.this$0;
        final long j2 = this.$commentID;
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.comments.data.remote.getcommentbypermid.GetCommentThreadDataSource$getCommentThread$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final CommentThreadResult invoke(CommentsResponse commentsResponse) {
                TimeStampUtil timeStampUtil;
                Comment copy;
                zq3.h(commentsResponse, "commentResponse");
                CommentResponse commentResponse = (CommentResponse) i.k0(commentsResponse.getComments());
                timeStampUtil = GetCommentThreadDataSource.this.timeStampUtil;
                Comment mapToComment = CommentKt.mapToComment(commentResponse, timeStampUtil);
                long j3 = j2;
                List<Comment> replies = mapToComment.getReplies();
                long j4 = j2;
                ArrayList arrayList = new ArrayList(i.w(replies, 10));
                for (Comment comment : replies) {
                    if (comment.getCommentID() == j4) {
                        comment = comment.copy((r36 & 1) != 0 ? comment.commentID : 0L, (r36 & 2) != 0 ? comment.userDisplayName : null, (r36 & 4) != 0 ? comment.parentUserDisplayName : null, (r36 & 8) != 0 ? comment.userLocation : null, (r36 & 16) != 0 ? comment.userTitle : null, (r36 & 32) != 0 ? comment.commentBody : null, (r36 & 64) != 0 ? comment.approveDate : null, (r36 & 128) != 0 ? comment.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment.editorsSelection : false, (r36 & 512) != 0 ? comment.recommendations : 0, (r36 & 1024) != 0 ? comment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment.isReporterReply : false, (r36 & 8192) != 0 ? comment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment.isCommentFlagged : false, (r36 & 32768) != 0 ? comment.isRecommended : false, (r36 & 65536) != 0 ? comment.focusedInThread : true);
                    }
                    arrayList.add(comment);
                }
                copy = mapToComment.copy((r36 & 1) != 0 ? mapToComment.commentID : 0L, (r36 & 2) != 0 ? mapToComment.userDisplayName : null, (r36 & 4) != 0 ? mapToComment.parentUserDisplayName : null, (r36 & 8) != 0 ? mapToComment.userLocation : null, (r36 & 16) != 0 ? mapToComment.userTitle : null, (r36 & 32) != 0 ? mapToComment.commentBody : null, (r36 & 64) != 0 ? mapToComment.approveDate : null, (r36 & 128) != 0 ? mapToComment.replies : arrayList, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? mapToComment.editorsSelection : false, (r36 & 512) != 0 ? mapToComment.recommendations : 0, (r36 & 1024) != 0 ? mapToComment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? mapToComment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? mapToComment.isReporterReply : false, (r36 & 8192) != 0 ? mapToComment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? mapToComment.isCommentFlagged : false, (r36 & 32768) != 0 ? mapToComment.isRecommended : false, (r36 & 65536) != 0 ? mapToComment.focusedInThread : false);
                return new CommentThreadResult(j3, copy);
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<CommentThreadResult>> by0Var) {
        return ((GetCommentThreadDataSource$getCommentThread$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
