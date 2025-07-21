package com.nytimes.android.subauth.credentialmanager.network;

import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse;
import defpackage.by0;
import defpackage.zq3;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public final class SSONetworkManager implements SSOApi {
    private final /* synthetic */ SSOApi a;

    public SSONetworkManager(SubauthEnvironment subauthEnvironment, Retrofit.Builder builder) {
        zq3.h(subauthEnvironment, "subauthEnvironment");
        zq3.h(builder, "retrofitBuilder");
        this.a = (SSOApi) builder.baseUrl(subauthEnvironment.c()).build().create(SSOApi.class);
    }

    @Override // com.nytimes.android.subauth.credentialmanager.network.SSOApi
    @FormUrlEncoded
    @POST("/svc/android/v1/oauth/credentials")
    public Object getSSOCredentials(@Field("provider") String str, by0<? super LireSSOResponse> by0Var) {
        return this.a.getSSOCredentials(str, by0Var);
    }
}
