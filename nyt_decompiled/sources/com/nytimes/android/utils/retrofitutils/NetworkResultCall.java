package com.nytimes.android.utils.retrofitutils;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.pm8;
import defpackage.qs2;
import defpackage.x45;
import defpackage.zq3;
import kotlin.NotImplementedError;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class NetworkResultCall implements Call {
    private final Call a;

    public NetworkResultCall(Call call) {
        zq3.h(call, "proxy");
        this.a = call;
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.a.cancel();
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback callback) {
        zq3.h(callback, "callback");
        this.a.enqueue(new Callback() { // from class: com.nytimes.android.utils.retrofitutils.NetworkResultCall$enqueue$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable th) {
                zq3.h(call, "call");
                zq3.h(th, QueryKeys.TOKEN);
                Callback.this.onResponse(this, Response.success(new FetchResult.b.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, final Response response) {
                zq3.h(call, "call");
                zq3.h(response, "response");
                Callback.this.onResponse(this, Response.success(x45.a(new qs2() { // from class: com.nytimes.android.utils.retrofitutils.NetworkResultCall$enqueue$1$onResponse$networkResult$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Response mo865invoke() {
                        return Response.this;
                    }
                })));
            }
        });
    }

    @Override // retrofit2.Call
    public Response execute() {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        return this.a.isCanceled();
    }

    @Override // retrofit2.Call
    public boolean isExecuted() {
        return this.a.isExecuted();
    }

    @Override // retrofit2.Call
    public Request request() {
        Request request = this.a.request();
        zq3.g(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    public pm8 timeout() {
        pm8 timeout = this.a.timeout();
        zq3.g(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.Call
    public Call clone() {
        Call clone = this.a.clone();
        zq3.g(clone, "clone(...)");
        return new NetworkResultCall(clone);
    }
}
