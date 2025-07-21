package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import defpackage.h63;
import defpackage.qd0;
import defpackage.qs2;
import defpackage.wd5;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class GzipRequestInterceptor implements Interceptor {
    public static final a b = new a(null);
    private final InternalLogger a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RequestBody {
        final /* synthetic */ RequestBody a;

        b(RequestBody requestBody) {
            this.a = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.a.contentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(qd0 qd0Var) {
            zq3.h(qd0Var, "sink");
            qd0 c = wd5.c(new h63(qd0Var));
            this.a.writeTo(c);
            c.close();
        }
    }

    public GzipRequestInterceptor(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
    }

    private final RequestBody a(RequestBody requestBody) {
        return new b(requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        if (body == null || request.header("Content-Encoding") != null || (body instanceof MultipartBody)) {
            return chain.proceed(request);
        }
        try {
            request = request.newBuilder().header("Content-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP).method(request.method(), a(body)).build();
        } catch (Exception e) {
            InternalLogger.b.b(this.a, InternalLogger.Level.WARN, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor$intercept$compressedRequest$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unable to gzip request body";
                }
            }, e, false, null, 48, null);
        }
        return chain.proceed(request);
    }
}
