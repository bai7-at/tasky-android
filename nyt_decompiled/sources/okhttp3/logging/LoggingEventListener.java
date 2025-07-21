package okhttp3.logging;

import defpackage.zq3;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            zq3.h(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            zq3.h(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "cachedResponse");
        logWithTime(zq3.q("cacheConditionalHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
        logWithTime(zq3.q("cacheHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        zq3.h(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        zq3.h(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
        logWithTime(zq3.q("callFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        zq3.h(call, "call");
        this.startNs = System.nanoTime();
        logWithTime(zq3.q("callStart: ", call.request()));
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        zq3.h(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
        logWithTime(zq3.q("connectEnd: ", protocol));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
        zq3.h(iOException, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        zq3.h(call, "call");
        zq3.h(connection, "connection");
        logWithTime(zq3.q("connectionAcquired: ", connection));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        zq3.h(call, "call");
        zq3.h(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        zq3.h(call, "call");
        zq3.h(str, "domainName");
        zq3.h(list, "inetAddressList");
        logWithTime(zq3.q("dnsEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        zq3.h(call, "call");
        zq3.h(str, "domainName");
        logWithTime(zq3.q("dnsStart: ", str));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        zq3.h(call, "call");
        zq3.h(httpUrl, "url");
        zq3.h(list, "proxies");
        logWithTime(zq3.q("proxySelectEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        zq3.h(call, "call");
        zq3.h(httpUrl, "url");
        logWithTime(zq3.q("proxySelectStart: ", httpUrl));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        zq3.h(call, "call");
        logWithTime(zq3.q("requestBodyEnd: byteCount=", Long.valueOf(j)));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        zq3.h(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
        logWithTime(zq3.q("requestFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        zq3.h(call, "call");
        zq3.h(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        zq3.h(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        zq3.h(call, "call");
        logWithTime(zq3.q("responseBodyEnd: byteCount=", Long.valueOf(j)));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        zq3.h(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
        logWithTime(zq3.q("responseFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
        logWithTime(zq3.q("responseHeadersEnd: ", response));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        zq3.h(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
        logWithTime(zq3.q("satisfactionFailure: ", response));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        zq3.h(call, "call");
        logWithTime(zq3.q("secureConnectEnd: ", handshake));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        zq3.h(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
