package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import android.app.Application;
import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class WriteNewCommentRemoteDataSource_Factory implements ba2 {
    private final p76 applicationProvider;
    private final p76 ioDispatcherProvider;
    private final p76 writeNewCommentApiProvider;

    public WriteNewCommentRemoteDataSource_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.writeNewCommentApiProvider = p76Var;
        this.applicationProvider = p76Var2;
        this.ioDispatcherProvider = p76Var3;
    }

    public static WriteNewCommentRemoteDataSource_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new WriteNewCommentRemoteDataSource_Factory(p76Var, p76Var2, p76Var3);
    }

    public static WriteNewCommentRemoteDataSource newInstance(WriteNewCommentApi writeNewCommentApi, Application application, CoroutineDispatcher coroutineDispatcher) {
        return new WriteNewCommentRemoteDataSource(writeNewCommentApi, application, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public WriteNewCommentRemoteDataSource get() {
        return newInstance((WriteNewCommentApi) this.writeNewCommentApiProvider.get(), (Application) this.applicationProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get());
    }
}
