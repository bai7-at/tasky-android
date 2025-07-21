package com.nytimes.android.comments.comments.data.remote.getcommentbypermid;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetCommentThreadDataSource {
    public static final int $stable = 8;
    private final CommentsApi commentsApi;
    private final CoroutineDispatcher ioDispatcher;
    private final TimeStampUtil timeStampUtil;

    public GetCommentThreadDataSource(CommentsApi commentsApi, TimeStampUtil timeStampUtil, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.commentsApi = commentsApi;
        this.timeStampUtil = timeStampUtil;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object getCommentThread(long j, String str, by0<? super FetchResult<CommentThreadResult>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new GetCommentThreadDataSource$getCommentThread$2(this, str, j, null), by0Var);
    }
}
