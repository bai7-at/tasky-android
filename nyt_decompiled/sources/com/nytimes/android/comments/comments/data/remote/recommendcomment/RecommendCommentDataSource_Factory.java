package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class RecommendCommentDataSource_Factory implements ba2 {
    private final p76 commentsApiProvider;
    private final p76 ioDispatcherProvider;

    public RecommendCommentDataSource_Factory(p76 p76Var, p76 p76Var2) {
        this.commentsApiProvider = p76Var;
        this.ioDispatcherProvider = p76Var2;
    }

    public static RecommendCommentDataSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new RecommendCommentDataSource_Factory(p76Var, p76Var2);
    }

    public static RecommendCommentDataSource newInstance(CommentsApi commentsApi, CoroutineDispatcher coroutineDispatcher) {
        return new RecommendCommentDataSource(commentsApi, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public RecommendCommentDataSource get() {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get());
    }
}
