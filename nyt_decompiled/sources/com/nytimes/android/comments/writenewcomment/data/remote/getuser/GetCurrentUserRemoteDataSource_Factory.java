package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import defpackage.ba2;
import defpackage.p76;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetCurrentUserRemoteDataSource_Factory implements ba2 {
    private final p76 getCurrentUserAPIProvider;
    private final p76 ioDispatcherProvider;

    public GetCurrentUserRemoteDataSource_Factory(p76 p76Var, p76 p76Var2) {
        this.getCurrentUserAPIProvider = p76Var;
        this.ioDispatcherProvider = p76Var2;
    }

    public static GetCurrentUserRemoteDataSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new GetCurrentUserRemoteDataSource_Factory(p76Var, p76Var2);
    }

    public static GetCurrentUserRemoteDataSource newInstance(GetCurrentUserApi getCurrentUserApi, CoroutineDispatcher coroutineDispatcher) {
        return new GetCurrentUserRemoteDataSource(getCurrentUserApi, coroutineDispatcher);
    }

    @Override // defpackage.p76
    public GetCurrentUserRemoteDataSource get() {
        return newInstance((GetCurrentUserApi) this.getCurrentUserAPIProvider.get(), (CoroutineDispatcher) this.ioDispatcherProvider.get());
    }
}
