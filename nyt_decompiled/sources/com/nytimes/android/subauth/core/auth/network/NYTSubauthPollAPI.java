package com.nytimes.android.subauth.core.auth.network;

import defpackage.by0;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public interface NYTSubauthPollAPI {
    @FormUrlEncoded
    @POST("/svc/mobile/v2/session/refresh")
    Object sessionRefreshV2(@FieldMap Map<String, String> map, @Header("Cookie") String str, @Header("client_id") String str2, @Header("force_update") String str3, by0<? super Response<Object>> by0Var);
}
