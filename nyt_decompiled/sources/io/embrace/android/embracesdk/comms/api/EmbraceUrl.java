package io.embrace.android.embracesdk.comms.api;

import defpackage.zq3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceUrl {
    public static final Companion Companion = new Companion(null);
    private final URL url;

    public static final class Companion {
        private Companion() {
        }

        public final EmbraceUrl create(String str) throws MalformedURLException {
            zq3.h(str, "url");
            return new EmbraceUrl(new URL(str));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceUrl(URL url) {
        zq3.h(url, "url");
        this.url = url;
    }

    public final Endpoint endpoint() {
        String path = this.url.getPath();
        zq3.g(path, "url.path");
        String U0 = h.U0(path, "/", null, 2, null);
        Endpoint endpoint = Endpoint.EVENTS;
        if (zq3.c(U0, endpoint.getPath())) {
            return endpoint;
        }
        Endpoint endpoint2 = Endpoint.BLOBS;
        if (zq3.c(U0, endpoint2.getPath())) {
            return endpoint2;
        }
        Endpoint endpoint3 = Endpoint.LOGGING;
        if (zq3.c(U0, endpoint3.getPath())) {
            return endpoint3;
        }
        Endpoint endpoint4 = Endpoint.LOGS;
        if (zq3.c(U0, endpoint4.getPath())) {
            return endpoint4;
        }
        Endpoint endpoint5 = Endpoint.NETWORK;
        if (zq3.c(U0, endpoint5.getPath())) {
            return endpoint5;
        }
        Endpoint endpoint6 = Endpoint.SESSIONS;
        if (zq3.c(U0, endpoint6.getPath())) {
            return endpoint6;
        }
        Endpoint endpoint7 = Endpoint.SESSIONS_V2;
        return zq3.c(U0, endpoint7.getPath()) ? endpoint7 : Endpoint.UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(EmbraceUrl.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return zq3.c(this.url, ((EmbraceUrl) obj).url);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.comms.api.EmbraceUrl");
    }

    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final EmbraceConnection openConnection() throws IOException {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection != null) {
            return new EmbraceConnectionImpl((HttpURLConnection) openConnection, this);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    public String toString() {
        String url = this.url.toString();
        zq3.g(url, "url.toString()");
        return url;
    }
}
