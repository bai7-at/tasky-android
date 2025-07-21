package com.nytimes.android.network.logshare;

import defpackage.by0;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface LogShareApi {
    @GET("/svc/log-share/pageview")
    Object logShare(@Query("id") String str, by0<? super Response<String>> by0Var);
}
