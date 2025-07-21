package okhttp3.internal.http;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        zq3.h(str, "method");
        return (zq3.c(str, "GET") || zq3.c(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        zq3.h(str, "method");
        return zq3.c(str, "POST") || zq3.c(str, "PUT") || zq3.c(str, "PATCH") || zq3.c(str, "PROPPATCH") || zq3.c(str, "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        zq3.h(str, "method");
        return zq3.c(str, "POST") || zq3.c(str, "PATCH") || zq3.c(str, "PUT") || zq3.c(str, "DELETE") || zq3.c(str, "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        zq3.h(str, "method");
        return !zq3.c(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        zq3.h(str, "method");
        return zq3.c(str, "PROPFIND");
    }
}
