package com.nytimes.android.libs.messagingarchitecture.network.local;

import defpackage.by0;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface OMAApiService {
    @GET("/v1/units")
    Object allUnits(@Query("name") String str, by0<? super Response<Object>> by0Var);
}
