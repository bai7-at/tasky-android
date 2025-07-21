package com.nytimes.xwords.hybrid.rest;

import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

/* loaded from: classes4.dex */
public interface PageService {
    @GET
    Call<Page> get(@Header("cookie") String str, @Url HttpUrl httpUrl);
}
