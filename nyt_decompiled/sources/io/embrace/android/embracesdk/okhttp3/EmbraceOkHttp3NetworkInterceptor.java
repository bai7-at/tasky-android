package io.embrace.android.embracesdk.okhttp3;

import defpackage.ad0;
import defpackage.i63;
import defpackage.sd0;
import defpackage.wd5;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.network.http.EmbraceHttpPathOverride;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceOkHttp3NetworkInterceptor implements Interceptor {
    public static final String CONTENT_ENCODING_HEADER_NAME = "Content-Encoding";
    public static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    public static final String CONTENT_TYPE_EVENT_STREAM = "text/event-stream";
    public static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    public static final String ENCODING_GZIP = "gzip";
    public static final String TRACEPARENT_HEADER_NAME = "traceparent";
    private final Embrace embrace;
    private final Clock systemClock;
    public static final Companion Companion = new Companion(null);
    private static final String[] networkCallDataParts = {"Response Headers", "Request Headers", "Query Parameters", "Request Body", "Response Body"};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceOkHttp3NetworkInterceptor(Embrace embrace, Clock clock) {
        zq3.h(embrace, "embrace");
        zq3.h(clock, "systemClock");
        this.embrace = embrace;
        this.systemClock = clock;
    }

    private final Long getContentLengthFromBody(Response response, String str) {
        if (str != null && h.K(str, CONTENT_TYPE_EVENT_STREAM, false, 2, null)) {
            return null;
        }
        try {
            ResponseBody body = response.body();
            if (body == null) {
                return null;
            }
            sd0 source = body.source();
            source.request(Long.MAX_VALUE);
            return Long.valueOf(source.g().h1());
        } catch (Exception unused) {
            return null;
        }
    }

    private final Long getContentLengthFromHeader(Response response) {
        String header = response.header("Content-Length", null);
        if (header == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(header));
        } catch (Exception unused) {
            return null;
        }
    }

    private final NetworkCaptureData getNetworkCaptureData(Request request, Response response) {
        Exception exc;
        Map<String, String> map;
        Map<String, String> map2;
        String str;
        byte[] bArr;
        Map<String, String> map3;
        String str2;
        byte[] bArr2;
        ResponseBody body;
        int i = 0;
        try {
            Map<String, String> processedHeaders = getProcessedHeaders(response.headers().toMultimap());
            try {
                map2 = getProcessedHeaders(request.headers().toMultimap());
                try {
                    str = request.url().query();
                    try {
                        bArr = getRequestBody(request);
                    } catch (Exception e) {
                        exc = e;
                        map = processedHeaders;
                        i = 3;
                        bArr = null;
                    }
                    try {
                        if (!HttpHeaders.promisesBody(response) || (body = response.body()) == null) {
                            bArr2 = null;
                            str2 = null;
                        } else {
                            sd0 source = body.source();
                            source.request(Integer.MAX_VALUE);
                            bArr2 = source.g().u1().J();
                            str2 = null;
                        }
                        map3 = processedHeaders;
                    } catch (Exception e2) {
                        exc = e2;
                        map = processedHeaders;
                        i = 4;
                        StringBuilder sb = new StringBuilder();
                        while (i < 5) {
                            sb.append("'");
                            sb.append(networkCallDataParts[i]);
                            sb.append("'");
                            if (i != 4) {
                                sb.append(", ");
                            }
                            i++;
                        }
                        String str3 = "There were errors in capturing the following part(s) of the network call: %s" + ((Object) sb);
                        this.embrace.getInternalInterface().logInternalError(new RuntimeException("Failure during the building of NetworkCaptureData. " + str3, exc));
                        map3 = map;
                        str2 = str3;
                        bArr2 = null;
                        return new NetworkCaptureData(map2, str, bArr, map3, bArr2, str2);
                    }
                } catch (Exception e3) {
                    exc = e3;
                    bArr = null;
                    map = processedHeaders;
                    i = 2;
                    str = null;
                }
            } catch (Exception e4) {
                exc = e4;
                str = null;
                bArr = null;
                map = processedHeaders;
                i = 1;
                map2 = null;
            }
        } catch (Exception e5) {
            exc = e5;
            map = null;
            map2 = null;
            str = null;
            bArr = null;
        }
        return new NetworkCaptureData(map2, str, bArr, map3, bArr2, str2);
    }

    private final Map<String, String> getProcessedHeaders(Map<String, ? extends List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = value.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "builder.toString()");
            hashMap.put(key, sb2);
        }
        return hashMap;
    }

    private final byte[] getRequestBody(Request request) {
        try {
            RequestBody body = request.newBuilder().build().body();
            if (body == null) {
                return null;
            }
            ad0 ad0Var = new ad0();
            body.writeTo(ad0Var);
            return ad0Var.B0();
        } catch (IOException e) {
            this.embrace.getInternalInterface().logInternalError("Failed to capture okhttp request body.", e.getClass().toString());
            return null;
        }
    }

    private final long sdkClockOffset() {
        long sdkCurrentTime = this.embrace.getInternalInterface().getSdkCurrentTime() - this.systemClock.now();
        long sdkCurrentTime2 = this.embrace.getInternalInterface().getSdkCurrentTime() - this.systemClock.now();
        if (Math.abs(sdkCurrentTime - sdkCurrentTime2) <= 1) {
            return (sdkCurrentTime + sdkCurrentTime2) / 2;
        }
        return 0L;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        NetworkCaptureData networkCaptureData;
        ResponseBody body;
        zq3.h(chain, "chain");
        Request request = chain.request();
        if (!this.embrace.isStarted() || this.embrace.getInternalInterface().isInternalNetworkCaptureDisabled()) {
            return chain.proceed(request);
        }
        boolean isNetworkSpanForwardingEnabled = this.embrace.getInternalInterface().isNetworkSpanForwardingEnabled();
        String generateW3cTraceparent = (isNetworkSpanForwardingEnabled && request.header("traceparent") == null) ? this.embrace.generateW3cTraceparent() : null;
        if (generateW3cTraceparent != null) {
            request = request.newBuilder().header("traceparent", generateW3cTraceparent).build();
        }
        long sdkClockOffset = sdkClockOffset();
        Response proceed = chain.proceed(request);
        Long contentLengthFromHeader = getContentLengthFromHeader(proceed);
        if (contentLengthFromHeader == null) {
            contentLengthFromHeader = getContentLengthFromBody(proceed, proceed.header("Content-Type", null));
        }
        if (contentLengthFromHeader == null) {
            contentLengthFromHeader = 0L;
        }
        if (this.embrace.getInternalInterface().shouldCaptureNetworkBody(request.url().toString(), request.method())) {
            if (h.w(ENCODING_GZIP, proceed.header("Content-Encoding", null), true) && HttpHeaders.promisesBody(proceed) && (body = proceed.body()) != null) {
                Headers build = proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
                RealResponseBody realResponseBody = new RealResponseBody(proceed.header("Content-Type", null), -1L, wd5.d(new i63(body.source())));
                Response.Builder request2 = proceed.newBuilder().request(request);
                request2.headers(build);
                request2.body(realResponseBody);
                proceed = request2.build();
            }
            networkCaptureData = getNetworkCaptureData(request, proceed);
        } else {
            networkCaptureData = null;
        }
        Embrace embrace = this.embrace;
        String uRLString = EmbraceHttpPathOverride.getURLString(new EmbraceOkHttp3PathOverrideRequest(request));
        HttpMethod fromString = HttpMethod.fromString(request.method());
        long sentRequestAtMillis = proceed.sentRequestAtMillis() + sdkClockOffset;
        long receivedResponseAtMillis = proceed.receivedResponseAtMillis() + sdkClockOffset;
        RequestBody body2 = request.body();
        long contentLength = body2 != null ? body2.contentLength() : 0L;
        long longValue = contentLengthFromHeader.longValue();
        int code = proceed.code();
        String traceIdHeader = this.embrace.getTraceIdHeader();
        zq3.g(traceIdHeader, "embrace.traceIdHeader");
        embrace.recordNetworkRequest(EmbraceNetworkRequest.fromCompletedRequest(uRLString, fromString, sentRequestAtMillis, receivedResponseAtMillis, contentLength, longValue, code, request.header(traceIdHeader), isNetworkSpanForwardingEnabled ? request.header("traceparent") : null, networkCaptureData));
        return proceed;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmbraceOkHttp3NetworkInterceptor() {
        /*
            r2 = this;
            io.embrace.android.embracesdk.Embrace r0 = io.embrace.android.embracesdk.Embrace.getInstance()
            java.lang.String r1 = "Embrace.getInstance()"
            defpackage.zq3.g(r0, r1)
            io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor$1 r1 = new io.embrace.android.embracesdk.internal.clock.Clock() { // from class: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.1
                static {
                    /*
                        io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor$1 r0 = new io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor$1) io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.1.INSTANCE io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.AnonymousClass1.<init>():void");
                }

                @Override // io.embrace.android.embracesdk.internal.clock.Clock
                public final long now() {
                    /*
                        r2 = this;
                        long r0 = java.lang.System.currentTimeMillis()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.AnonymousClass1.now():long");
                }

                @Override // io.embrace.android.embracesdk.internal.clock.Clock
                public long nowInNanos() {
                    /*
                        r2 = this;
                        long r0 = io.embrace.android.embracesdk.internal.clock.Clock.DefaultImpls.nowInNanos(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.AnonymousClass1.nowInNanos():long");
                }
            }
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor.<init>():void");
    }
}
