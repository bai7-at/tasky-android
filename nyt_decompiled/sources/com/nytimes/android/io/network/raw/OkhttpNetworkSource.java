package com.nytimes.android.io.network.raw;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.io.network.ex.NetworkingException;
import com.nytimes.android.io.network.raw.OkhttpNetworkSource;
import defpackage.sd0;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class OkhttpNetworkSource implements CachedNetworkSource {
    public static final Companion Companion = new Companion(null);
    private static final int FORCE_CACHE = 504;
    private final OkHttpClient httpClient;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OkhttpNetworkSource(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "httpClient");
        this.httpClient = okHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asyncFetch$lambda$0(final String str, OkhttpNetworkSource okhttpNetworkSource, final ObservableEmitter observableEmitter) {
        zq3.h(str, "$url");
        zq3.h(okhttpNetworkSource, "this$0");
        zq3.h(observableEmitter, "subscriber");
        if (observableEmitter.isDisposed()) {
            return;
        }
        okhttpNetworkSource.httpClient.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: com.nytimes.android.io.network.raw.OkhttpNetworkSource$asyncFetch$1$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                zq3.h(call, "call");
                zq3.h(iOException, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
                observableEmitter.onError(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                zq3.h(call, "call");
                zq3.h(response, "response");
                if (!observableEmitter.isDisposed() && response.isSuccessful()) {
                    ObservableEmitter<sd0> observableEmitter2 = observableEmitter;
                    ResponseBody body = response.body();
                    zq3.e(body);
                    observableEmitter2.onNext(body.source());
                    observableEmitter.onComplete();
                    return;
                }
                ResponseBody body2 = response.body();
                zq3.e(body2);
                body2.close();
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onError(new NetworkingException("fail to load resource " + str, new Object[0]));
            }
        });
    }

    @Override // com.nytimes.android.io.network.raw.NetworkSource
    public Observable<sd0> asyncFetch(final String str) {
        zq3.h(str, "url");
        Observable<sd0> create = Observable.create(new ObservableOnSubscribe() { // from class: vd5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                OkhttpNetworkSource.asyncFetch$lambda$0(str, this, observableEmitter);
            }
        });
        zq3.g(create, "create(...)");
        return create;
    }

    @Override // com.nytimes.android.io.network.raw.CachedNetworkSource
    public sd0 cacheFetch(String str) throws IOException {
        zq3.h(str, "url");
        Response execute = this.httpClient.newCall(new Request.Builder().url(str).cacheControl(CacheControl.FORCE_CACHE).build()).execute();
        if (execute.code() == FORCE_CACHE) {
            return fetch(str);
        }
        if (!execute.isSuccessful()) {
            throw new NetworkingException("url %s is not in cache", str);
        }
        ResponseBody body = execute.body();
        zq3.e(body);
        return body.source();
    }

    @Override // com.nytimes.android.io.network.raw.NetworkSource
    public sd0 fetch(String str) throws IOException {
        zq3.h(str, "url");
        Response execute = this.httpClient.newCall(new Request.Builder().url(str).build()).execute();
        if (!execute.isSuccessful()) {
            throw new NetworkingException("fail to load url %s with http code %s", str, Integer.valueOf(execute.code()));
        }
        ResponseBody body = execute.body();
        zq3.e(body);
        return body.source();
    }
}
