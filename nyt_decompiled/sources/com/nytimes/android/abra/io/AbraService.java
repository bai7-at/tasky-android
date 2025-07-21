package com.nytimes.android.abra.io;

import defpackage.by0;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* loaded from: classes2.dex */
public interface AbraService {
    @Headers({"Cache-Control: no-cache"})
    @GET
    Object getAbraCode(@Url String str, by0<? super ResponseBody> by0Var);

    @Headers({"Cache-Control: no-cache"})
    @GET("/abra-config/current/{integration}.json")
    Object getAbraRules(@Path("integration") String str, by0<? super ResponseBody> by0Var);
}
