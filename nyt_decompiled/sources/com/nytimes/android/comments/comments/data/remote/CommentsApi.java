package com.nytimes.android.comments.comments.data.remote;

import com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentBody;
import com.nytimes.android.comments.comments.data.remote.flagcomment.FlaggedCommentResponse;
import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentSummaryResponse;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentBody;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendationCommentResponse;
import com.nytimes.android.comments.writenewcomment.data.remote.ToJson;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface CommentsApi {

    public static final class DefaultImpls {
        public static /* synthetic */ Object flagComment$default(CommentsApi commentsApi, String str, String str2, FlagCommentBody flagCommentBody, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flagComment");
            }
            if ((i & 1) != 0) {
                str = "post";
            }
            if ((i & 2) != 0) {
                str2 = "FlagComment";
            }
            return commentsApi.flagComment(str, str2, flagCommentBody, by0Var);
        }

        public static /* synthetic */ Object getAllComments$default(CommentsApi commentsApi, String str, String str2, String str3, int i, String str4, Long l, by0 by0Var, int i2, Object obj) {
            if (obj == null) {
                return commentsApi.getAllComments((i2 & 1) != 0 ? "get" : str, (i2 & 2) != 0 ? "GetCommentsAll" : str2, str3, i, str4, l, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllComments");
        }

        public static /* synthetic */ Object getCommentByPermId$default(CommentsApi commentsApi, String str, String str2, String str3, long j, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommentByPermId");
            }
            if ((i & 1) != 0) {
                str = "get";
            }
            String str4 = str;
            if ((i & 2) != 0) {
                str2 = "GetCommentByPermid";
            }
            return commentsApi.getCommentByPermId(str4, str2, str3, j, by0Var);
        }

        public static /* synthetic */ Object getCommentsSummary$default(CommentsApi commentsApi, String str, String str2, String str3, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommentsSummary");
            }
            if ((i & 1) != 0) {
                str = "get";
            }
            if ((i & 2) != 0) {
                str2 = "GetCommentSummary";
            }
            return commentsApi.getCommentsSummary(str, str2, str3, by0Var);
        }

        public static /* synthetic */ Object getNYTPicks$default(CommentsApi commentsApi, String str, String str2, String str3, int i, Long l, by0 by0Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNYTPicks");
            }
            if ((i2 & 1) != 0) {
                str = "get";
            }
            String str4 = str;
            if ((i2 & 2) != 0) {
                str2 = "GetCommentsNYTPicks";
            }
            return commentsApi.getNYTPicks(str4, str2, str3, i, l, by0Var);
        }

        public static /* synthetic */ Object getReaderPicks$default(CommentsApi commentsApi, String str, String str2, String str3, int i, Long l, by0 by0Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReaderPicks");
            }
            if ((i2 & 1) != 0) {
                str = "get";
            }
            String str4 = str;
            if ((i2 & 2) != 0) {
                str2 = "GetCommentsReadersPicks";
            }
            return commentsApi.getReaderPicks(str4, str2, str3, i, l, by0Var);
        }

        public static /* synthetic */ Object getRepliesBySequence$default(CommentsApi commentsApi, String str, String str2, String str3, long j, int i, int i2, by0 by0Var, int i3, Object obj) {
            if (obj == null) {
                return commentsApi.getRepliesBySequence((i3 & 1) != 0 ? "get" : str, (i3 & 2) != 0 ? "GetRepliesBySequence" : str2, str3, j, i, i2, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRepliesBySequence");
        }

        public static /* synthetic */ Object getReporterReplies$default(CommentsApi commentsApi, String str, String str2, String str3, int i, Long l, by0 by0Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReporterReplies");
            }
            if ((i2 & 1) != 0) {
                str = "get";
            }
            String str4 = str;
            if ((i2 & 2) != 0) {
                str2 = "GetCommentsNYTReplies";
            }
            return commentsApi.getReporterReplies(str4, str2, str3, i, l, by0Var);
        }

        public static /* synthetic */ Object recommendComment$default(CommentsApi commentsApi, String str, String str2, RecommendCommentBody recommendCommentBody, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recommendComment");
            }
            if ((i & 1) != 0) {
                str = "post";
            }
            if ((i & 2) != 0) {
                str2 = "PostRecommend";
            }
            return commentsApi.recommendComment(str, str2, recommendCommentBody, by0Var);
        }
    }

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object flagComment(@Query("method") String str, @Query("cmd") String str2, @ToJson @Query("postdata") FlagCommentBody flagCommentBody, by0<? super FetchResult<FlaggedCommentResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getAllComments(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("limit") int i, @Query("sort") String str4, @Query("commentSequence") Long l, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getCommentByPermId(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("permID") long j, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getCommentsSummary(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, by0<? super FetchResult<CommentSummaryResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getNYTPicks(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("limit") int i, @Query("commentSequence") Long l, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getReaderPicks(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("limit") int i, @Query("commentSequence") Long l, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getRepliesBySequence(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("commentSequence") long j, @Query("limit") int i, @Query("offset") int i2, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object getReporterReplies(@Query("method") String str, @Query("cmd") String str2, @Query("url") String str3, @Query("limit") int i, @Query("commentSequence") Long l, by0<? super FetchResult<CommentsResponse>> by0Var);

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object recommendComment(@Query("method") String str, @Query("cmd") String str2, @ToJson @Query("postdata") RecommendCommentBody recommendCommentBody, by0<? super FetchResult<RecommendationCommentResponse>> by0Var);
}
