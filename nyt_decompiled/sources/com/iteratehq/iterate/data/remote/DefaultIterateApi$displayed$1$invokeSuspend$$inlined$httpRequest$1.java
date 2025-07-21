package com.iteratehq.iterate.data.remote;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iteratehq.iterate.data.remote.model.ApiResponse;
import com.iteratehq.iterate.model.DisplayedResults;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gm0;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;
import zendesk.core.Constants;

@fc1(c = "com.iteratehq.iterate.data.remote.DefaultIterateApi$httpRequest$2", f = "IterateApi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DefaultIterateApi$displayed$1$invokeSuspend$$inlined$httpRequest$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $body;
    final /* synthetic */ Method $method;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ DefaultIterateApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIterateApi$displayed$1$invokeSuspend$$inlined$httpRequest$1(DefaultIterateApi defaultIterateApi, String str, Object obj, Method method, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultIterateApi;
        this.$path = str;
        this.$body = obj;
        this.$method = method;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultIterateApi$displayed$1$invokeSuspend$$inlined$httpRequest$1(this.this$0, this.$path, this.$body, this.$method, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        HttpURLConnection httpURLConnection = null;
        try {
            StringBuilder sb = new StringBuilder();
            str = this.this$0.b;
            sb.append(str);
            sb.append("/api/v1");
            sb.append(this.$path);
            URLConnection openConnection = new URL(sb.toString()).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            DefaultIterateApi defaultIterateApi = this.this$0;
            Method method = this.$method;
            httpURLConnection2.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Bearer ");
            str2 = defaultIterateApi.a;
            sb2.append(str2);
            httpURLConnection2.setRequestProperty("Authorization", sb2.toString());
            httpURLConnection2.setRequestMethod(method.getValue());
            httpURLConnection2.setDoOutput(method == Method.POST);
            try {
                Gson gson = new Gson();
                String json = gson.toJson(this.$body);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    zq3.g(json, "bodyJson");
                    Charset forName = Charset.forName("utf-8");
                    zq3.g(forName, "forName(charsetName)");
                    byte[] bytes = json.getBytes(forName);
                    zq3.g(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes, 0, bytes.length);
                    gm0.a(outputStream, null);
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        throw new Exception("Error calling API. Received HTTP status code " + responseCode);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), "utf-8"));
                    try {
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            sb3.append(h.c1(readLine).toString());
                        }
                        gm0.a(bufferedReader, null);
                        ApiResponse apiResponse = (ApiResponse) gson.fromJson(sb3.toString(), TypeToken.getParameterized(ApiResponse.class, DisplayedResults.class).getType());
                        httpURLConnection2.disconnect();
                        return apiResponse;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultIterateApi$displayed$1$invokeSuspend$$inlined$httpRequest$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
