package com.nytimes.android.ads.network.api;

import com.nytimes.android.ads.network.model.AlsTargetingData;
import defpackage.by0;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* loaded from: classes2.dex */
public interface AlsApi {
    @GET("/als")
    Object getAlsTargeting(@Header("Cookie") String str, @Query("prop") String str2, @Query("plat") String str3, @Query("uri") String str4, @Query("url") String str5, @Query("typ") String str6, by0<? super Response<AlsTargetingData>> by0Var);
}
