package com.nytimes.android.comments.comments.data.remote.getreplies;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetRepliesDataSource {
    public static final int $stable = 8;
    private final CommentsApi commentsApi;
    private final CoroutineDispatcher ioDispatcher;
    private final TimeStampUtil timeStampUtil;

    public GetRepliesDataSource(CommentsApi commentsApi, TimeStampUtil timeStampUtil, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.commentsApi = commentsApi;
        this.timeStampUtil = timeStampUtil;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object getReplies(long j, String str, int i, int i2, by0<? super FetchResult<RepliesResult>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new GetRepliesDataSource$getReplies$2(this, str, j, i2, i, null), by0Var);
    }
}
