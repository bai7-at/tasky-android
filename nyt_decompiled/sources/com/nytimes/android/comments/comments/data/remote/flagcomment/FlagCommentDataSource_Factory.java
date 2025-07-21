package com.nytimes.android.comments.comments.data.remote.flagcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class FlagCommentDataSource_Factory implements ba2 {
    private final p76 commentsApiProvider;
    private final p76 ioDispatcherProvider;

    public FlagCommentDataSource_Factory(p76 p76Var, p76 p76Var2) {
        this.commentsApiProvider = p76Var;
        this.ioDispatcherProvider = p76Var2;
    }

    public static FlagCommentDataSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new FlagCommentDataSource_Factory(p76Var, p76Var2);
    }

    public static FlagCommentDataSource newInstance(CommentsApi commentsApi, CoroutineDispatcher coroutineDispatcher) {
        return new FlagCommentDataSource(commentsApi, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public FlagCommentDataSource get() {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get());
    }
}
