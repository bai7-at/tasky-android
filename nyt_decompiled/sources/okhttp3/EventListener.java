package okhttp3;

import defpackage.zq3;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
    }

    public void cacheMiss(Call call) {
        zq3.h(call, "call");
    }

    public void callEnd(Call call) {
        zq3.h(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
    }

    public void callStart(Call call) {
        zq3.h(call, "call");
    }

    public void canceled(Call call) {
        zq3.h(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
        zq3.h(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        zq3.h(call, "call");
        zq3.h(inetSocketAddress, "inetSocketAddress");
        zq3.h(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        zq3.h(call, "call");
        zq3.h(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        zq3.h(call, "call");
        zq3.h(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        zq3.h(call, "call");
        zq3.h(str, "domainName");
        zq3.h(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        zq3.h(call, "call");
        zq3.h(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        zq3.h(call, "call");
        zq3.h(httpUrl, "url");
        zq3.h(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        zq3.h(call, "call");
        zq3.h(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        zq3.h(call, "call");
    }

    public void requestBodyStart(Call call) {
        zq3.h(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        zq3.h(call, "call");
        zq3.h(request, "request");
    }

    public void requestHeadersStart(Call call) {
        zq3.h(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        zq3.h(call, "call");
    }

    public void responseBodyStart(Call call) {
        zq3.h(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        zq3.h(call, "call");
        zq3.h(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
    }

    public void responseHeadersStart(Call call) {
        zq3.h(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        zq3.h(call, "call");
        zq3.h(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        zq3.h(call, "call");
    }

    public void secureConnectStart(Call call) {
        zq3.h(call, "call");
    }
}
