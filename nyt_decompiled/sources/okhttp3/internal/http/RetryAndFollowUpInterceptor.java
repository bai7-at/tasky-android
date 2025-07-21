package okhttp3.internal.http;

import com.amazonaws.http.HttpHeader;
import com.comscore.streaming.ContentFeedType;
import defpackage.zq3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes5.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "client");
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, HttpHeader.LOCATION, null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!zq3.c(resolve.scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            int code = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z = httpMethod.redirectsWithBody(str) || code == 308 || code == 307;
            if (!httpMethod.redirectsToGet(str) || code == 308 || code == 307) {
                newBuilder.method(str, z ? response.request().body() : null);
            } else {
                newBuilder.method("GET", null);
            }
            if (!z) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.authenticator().authenticate(route, response);
            }
            if (code == 421) {
                RequestBody body = response.request().body();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return response.request();
            }
            if (code == 503) {
                Response priorResponse = response.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                }
                return null;
            }
            if (code == 407) {
                zq3.e(route);
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody body2 = response.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = response.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                    return response.request();
                }
                return null;
            }
            switch (code) {
                case ContentFeedType.OTHER /* 300 */:
                case 301:
                case ContentFeedType.WEST_HD /* 302 */:
                case ContentFeedType.EAST_SD /* 303 */:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (this.client.retryOnConnectionFailure()) {
            return !(z && requestIsOneShot(iOException, request)) && isRecoverable(iOException, z) && realCall.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (header$default == null) {
            return i;
        }
        if (!new Regex("\\d+").d(header$default)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(header$default);
        zq3.g(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 > 20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r0.isDuplex$okhttp() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r7;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            defpackage.zq3.h(r11, r0)
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r1 = r11.getCall$okhttp()
            java.util.List r2 = kotlin.collections.i.l()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.enterNetworkInterceptorExchange(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Ld3
            okhttp3.Response r0 = r11.proceed(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb4
            if (r7 == 0) goto L40
            okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r6 = r7.newBuilder()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r6 = r6.body(r4)     // Catch: java.lang.Throwable -> L42
            okhttp3.Response r6 = r6.build()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L42
            okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r10 = move-exception
            goto Ldb
        L45:
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> L42
            okhttp3.Request r6 = r10.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r10 = r0.isDuplex$okhttp()     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto L5a
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L5e:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L6e:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r0 = r6
            goto L18
        L82:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r11.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Too many follow-up requests: "
            r11.append(r0)     // Catch: java.lang.Throwable -> L42
            r11.append(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L42
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L42
            throw r10     // Catch: java.lang.Throwable -> L42
        L99:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.recover(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Laf
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.i.G0(r2, r6)     // Catch: java.lang.Throwable -> L42
        La9:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r6 = r3
            goto L19
        Laf:
            java.lang.Throwable r10 = okhttp3.internal.Util.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r10     // Catch: java.lang.Throwable -> L42
        Lb4:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.recover(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.i.G0(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La9
        Lca:
            java.io.IOException r10 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r10 = okhttp3.internal.Util.withSuppressed(r10, r2)     // Catch: java.lang.Throwable -> L42
            throw r10     // Catch: java.lang.Throwable -> L42
        Ld3:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r11 = "Canceled"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L42
            throw r10     // Catch: java.lang.Throwable -> L42
        Ldb:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
