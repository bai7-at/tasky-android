package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import com.nytimes.android.comments.comments.data.remote.WrappedBaseResponse;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import retrofit2.http.GET;

/* loaded from: classes4.dex */
public interface GetCurrentUserApi {
    @WrappedBaseResponse
    @GET("v1/current/user.json")
    Object getCurrentUser(by0<? super FetchResult<GetCurrentUserResponse>> by0Var);
}
