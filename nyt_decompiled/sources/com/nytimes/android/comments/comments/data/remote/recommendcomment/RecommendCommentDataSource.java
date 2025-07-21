package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class RecommendCommentDataSource {
    public static final int $stable = 8;
    private final CommentsApi commentsApi;
    private final CoroutineDispatcher ioDispatcher;

    public RecommendCommentDataSource(CommentsApi commentsApi, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.commentsApi = commentsApi;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object recommendComment(long j, String str, boolean z, by0<? super FetchResult<RecommendCommentResult>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new RecommendCommentDataSource$recommendComment$2(z, str, j, this, null), by0Var);
    }
}
