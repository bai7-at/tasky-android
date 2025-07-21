package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import com.nytimes.android.comments.comments.data.remote.WrappedBaseResponse;
import com.nytimes.android.comments.writenewcomment.data.remote.ToJson;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface WriteNewCommentApi {

    public static final class DefaultImpls {
        public static /* synthetic */ Object submitNewComment$default(WriteNewCommentApi writeNewCommentApi, String str, String str2, WriteNewCommentBody writeNewCommentBody, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitNewComment");
            }
            if ((i & 1) != 0) {
                str = "post";
            }
            if ((i & 2) != 0) {
                str2 = "PostComment";
            }
            return writeNewCommentApi.submitNewComment(str, str2, writeNewCommentBody, by0Var);
        }
    }

    @WrappedBaseResponse
    @GET("svc/community/V3/requestHandler")
    Object submitNewComment(@Query("method") String str, @Query("cmd") String str2, @ToJson @Query("postdata") WriteNewCommentBody writeNewCommentBody, by0<? super FetchResult<WriteNewCommentResponse>> by0Var);
}
