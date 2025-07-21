package com.nytimes.android.comments.comments.data.remote.getreplies;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetRepliesDataSource_Factory implements ba2 {
    private final p76 commentsApiProvider;
    private final p76 ioDispatcherProvider;
    private final p76 timeStampUtilProvider;

    public GetRepliesDataSource_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.commentsApiProvider = p76Var;
        this.timeStampUtilProvider = p76Var2;
        this.ioDispatcherProvider = p76Var3;
    }

    public static GetRepliesDataSource_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new GetRepliesDataSource_Factory(p76Var, p76Var2, p76Var3);
    }

    public static GetRepliesDataSource newInstance(CommentsApi commentsApi, TimeStampUtil timeStampUtil, CoroutineDispatcher coroutineDispatcher) {
        return new GetRepliesDataSource(commentsApi, timeStampUtil, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public GetRepliesDataSource get() {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (TimeStampUtil) this.timeStampUtilProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get());
    }
}
