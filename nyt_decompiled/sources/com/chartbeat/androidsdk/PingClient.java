package com.chartbeat.androidsdk;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/* loaded from: classes2.dex */
class PingClient {
    private static String TAG = "PingClient";
    private Retrofit retrofit;

    PingClient(String str, String str2, String str3) {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.interceptors().add(getLoggingInterceptor());
            builder.interceptors().add(new RequestInterceptor(str2, str3));
            this.retrofit = new Retrofit.Builder().baseUrl(str).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).client(builder.build()).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static HttpLoggingInterceptor getLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.chartbeat.androidsdk.PingClient.1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Logger.d(PingClient.TAG, str);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return httpLoggingInterceptor;
    }

    <S> S createService(Class<S> cls) {
        return (S) this.retrofit.create(cls);
    }
}
