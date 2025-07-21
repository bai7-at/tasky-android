package com.chartbeat.androidsdk;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
class RequestInterceptor implements Interceptor {
    private static final String TAG = "RequestInterceptor";
    private final String host;
    private final String userAgent;

    RequestInterceptor(String str, String str2) {
        this.host = str;
        this.userAgent = str2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return chain.proceed(request.newBuilder().header("HOST", this.host).header("User-Agent", this.userAgent).method(request.method(), request.body()).build());
    }
}
