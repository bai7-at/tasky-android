package com.nytimes.android.meter;

import android.os.Build;
import defpackage.by0;
import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* loaded from: classes4.dex */
public interface MeterServiceApi {
    public static final a Companion = a.a;

    public static final class MeterServiceException extends Exception {
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final String b = Build.MANUFACTURER + " " + Build.MODEL;

        private a() {
        }

        public final String a() {
            return b;
        }
    }

    public static final class b {
        public static /* synthetic */ Single a(MeterServiceApi meterServiceApi, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, Object obj) {
            if (obj == null) {
                return meterServiceApi.canView(str, str2, str3, str4, str5, (i & 32) != 0 ? true : z, str6, (i & 128) != 0 ? MeterServiceApi.Companion.a() : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canView");
        }

        public static /* synthetic */ Single b(MeterServiceApi meterServiceApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj == null) {
                return meterServiceApi.willView(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? MeterServiceApi.Companion.a() : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: willView");
        }
    }

    @GET
    Single<Response<MeterServiceResponse>> canView(@Url String str, @Header("Cookie") String str2, @Query("url") String str3, @Query("rid") String str4, @Query("pageviewID") String str5, @Query("peek") boolean z, @Query("sourceApp") String str6, @Query("deviceType") String str7);

    @GET
    Object canViewAsync(@Url String str, @Header("Cookie") String str2, @Query("url") String str3, @Query("rid") String str4, @Query("pageviewID") String str5, @Query("peek") boolean z, @Query("sourceApp") String str6, @Query("deviceType") String str7, by0<? super Response<MeterServiceResponse>> by0Var);

    @GET
    Object getUserRequestKey(@Url String str, @Header("x-api-key") String str2, @Query("regiID") String str3, @Query("section") String str4, by0<? super Response<MeterServiceResponse>> by0Var);

    @FormUrlEncoded
    @PUT
    Object setRegiWallCount(@Url String str, @Header("x-api-key") String str2, @Field("key") String str3, @Field("views") int i, @Field("cleanLastList") int i2, by0<? super Response<MeterServiceResponse>> by0Var);

    @GET
    Single<Response<MeterServiceResponse>> willView(@Url String str, @Header("Cookie") String str2, @Query("url") String str3, @Query("rid") String str4, @Query("pageviewID") String str5, @Query("sourceApp") String str6, @Query("deviceType") String str7);
}
