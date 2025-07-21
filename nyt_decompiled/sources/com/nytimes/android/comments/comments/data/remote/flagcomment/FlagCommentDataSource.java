package com.nytimes.android.comments.comments.data.remote.flagcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class FlagCommentDataSource {
    public static final int $stable = 8;
    private final CommentsApi commentsApi;
    private final CoroutineDispatcher ioDispatcher;

    public FlagCommentDataSource(CommentsApi commentsApi, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.commentsApi = commentsApi;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object flagComment(long j, String str, String str2, by0<? super FetchResult<Integer>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new FlagCommentDataSource$flagComment$2(str, j, str2, this, null), by0Var);
    }
}
