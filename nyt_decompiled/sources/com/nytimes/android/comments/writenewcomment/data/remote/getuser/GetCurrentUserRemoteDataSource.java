package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class GetCurrentUserRemoteDataSource {
    public static final int $stable = 8;
    private final GetCurrentUserApi getCurrentUserAPI;
    private final CoroutineDispatcher ioDispatcher;

    public GetCurrentUserRemoteDataSource(GetCurrentUserApi getCurrentUserApi, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(getCurrentUserApi, "getCurrentUserAPI");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.getCurrentUserAPI = getCurrentUserApi;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object getCurrentUser(by0<? super FetchResult<User>> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new GetCurrentUserRemoteDataSource$getCurrentUser$2(this, null), by0Var);
    }
}
