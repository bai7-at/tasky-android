package com.nytimes.android.subauth.core.auth.network;

import com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.LoginWithCodeResponse;
import com.nytimes.android.subauth.core.auth.network.response.ProfileInfoResponse;
import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponse;
import defpackage.by0;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public interface UserAPI {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(UserAPI userAPI, String str, String str2, String str3, String str4, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginWithCode");
            }
            if ((i & 2) != 0) {
                str2 = "authorization_code";
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = "true";
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = null;
            }
            return userAPI.loginWithCode(str, str5, str6, str4, by0Var);
        }
    }

    @DELETE("/svc/profile/user")
    Object deleteAccount(@Header("Cookie") String str, @Header("client_id") String str2, by0<? super Response<Object>> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/email-code")
    Object emailCode(@Field("email") String str, @Header("client_id") String str2, by0<? super Response<Object>> by0Var);

    @FormUrlEncoded
    @POST("/svc/ios/status/email")
    Object emailStatus(@Field("email") String str, @Header("client_id") String str2, by0<? super EmailStatusResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/mobile/v1/status/ta-token")
    Object emailStatusWithToken(@Field("email") String str, @Field("token") String str2, @Header("client_id") String str3, by0<? super EmailStatusResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v2/login")
    Object login(@Field("login") String str, @Field("password") String str2, @Field("agentID") String str3, @Field("regi_info_interface") String str4, @Header("client_id") String str5, by0<? super LoginResponse> by0Var);

    @FormUrlEncoded
    @POST("/oauth/token")
    Object loginWithCode(@Field("code") String str, @Field("grant_type") String str2, @Field("legacy_response") String str3, @Field("client_id") String str4, by0<? super LoginWithCodeResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/onetap/login")
    Object oneTapLogin(@Field("id_token") String str, @Field("agentID") String str2, @Field("mnl_opt_in") String str3, @Header("client_id") String str4, by0<? super LoginResponse> by0Var);

    @POST("/svc/auth/v1/profileinfo")
    Object profileInfo(@Header("Cookie") String str, @Header("client_id") String str2, by0<? super ProfileInfoResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v2/register")
    Object register(@Field("email") String str, @Field("password") String str2, @Field("agentID") String str3, @Field("mnl_opt_in_default") String str4, @Field("mnl_opt_in") String str5, @Field("regi_info_interface") String str6, @Header("client_id") String str7, by0<? super LoginResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/set-password")
    Object setPassword(@Field("token") String str, @Field("password") String str2, @Header("client_id") String str3, by0<? super LoginResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/oauth/login")
    Object ssoLogin(@Field("provider") String str, @Field("agentID") String str2, @Field("mnl_opt_in") String str3, @Field("regi_info_interface") String str4, @FieldMap Map<String, String> map, @Header("client_id") String str5, by0<? super LoginResponse> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/redeem-code")
    Object verifyCode(@Field("email") String str, @Field("code") String str2, @Header("client_id") String str3, by0<? super Response<VerifyEmailWithCodeResponse>> by0Var);

    @FormUrlEncoded
    @POST("/svc/android/v1/oauth/login")
    Object webSSOLogin(@Field("provider") String str, @Field("agentID") String str2, @Field("mnl_opt_in") String str3, @Field("regi_info_interface") String str4, @Field("token") String str5, @Header("client_id") String str6, by0<? super LoginResponse> by0Var);
}
