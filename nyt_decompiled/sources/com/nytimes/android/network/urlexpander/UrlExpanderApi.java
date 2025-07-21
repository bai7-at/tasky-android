package com.nytimes.android.network.urlexpander;

import defpackage.dz8;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface UrlExpanderApi {
    @GET("/svc/bitly/expand.json")
    Single<dz8> getExpandedUrl(@Query("url") String str);
}
