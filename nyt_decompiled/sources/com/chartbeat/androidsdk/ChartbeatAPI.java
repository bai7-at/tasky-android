package com.chartbeat.androidsdk;

import defpackage.jc5;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* loaded from: classes2.dex */
interface ChartbeatAPI {
    public static final String ENDPOINT = "https://ping.chartbeat.net";
    public static final String HOST = "ping.chartbeat.net";

    @GET("ping")
    jc5<Response<Void>> ping(@QueryMap Map<String, String> map);
}
