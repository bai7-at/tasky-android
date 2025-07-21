package com.nytimes.android.subauth.core.auth.network;

import defpackage.by0;
import defpackage.zq3;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* loaded from: classes4.dex */
public interface NYTTargetingAPI {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final String a(String str, String str2) {
            zq3.h(str, "nytACookie");
            zq3.h(str2, "nytSCookie");
            return "nyt-a=" + str + ";NYT-S=" + str2;
        }
    }

    @GET("/svc/nyt/v2/data-layer")
    Object getTargetingData(@Header("Cookie") String str, by0<? super ResponseBody> by0Var);
}
