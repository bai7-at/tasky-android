package com.nytimes.android.comments.comments.data.remote.getcommentssummary;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetCommentsSummaryDataSource {
    public static final int $stable = 8;
    private final CommentsApi commentsApi;
    private final CoroutineDispatcher ioDispatcher;

    public GetCommentsSummaryDataSource(CommentsApi commentsApi, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.commentsApi = commentsApi;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object getCommentsSummary(String str, by0<? super FetchResult<CommentsSummary>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new GetCommentsSummaryDataSource$getCommentsSummary$2(this, str, null), by0Var);
    }
}
