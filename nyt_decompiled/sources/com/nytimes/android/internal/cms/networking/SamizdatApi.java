package com.nytimes.android.internal.cms.networking;

import defpackage.by0;
import defpackage.sd0;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* loaded from: classes4.dex */
public interface SamizdatApi {
    @GET
    Object fetch(@Url String str, @Header("NYT-Device-Id") String str2, @Header("NYT-Timestamp") String str3, @Header("NYT-Local-Timezone") String str4, @Header("NYT-Sprinkle") String str5, @Header("NYT-Language") String str6, @Header("NYT-Signature") String str7, @Header("Cookie") String str8, @Query("did") String str9, @Query("template") String str10, by0<? super Response<sd0>> by0Var);
}
