package com.nytimes.android.subauth.credentialmanager.network;

import com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse;
import defpackage.by0;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public interface SSOApi {
    @FormUrlEncoded
    @POST("/svc/android/v1/oauth/credentials")
    Object getSSOCredentials(@Field("provider") String str, by0<? super LireSSOResponse> by0Var);
}
