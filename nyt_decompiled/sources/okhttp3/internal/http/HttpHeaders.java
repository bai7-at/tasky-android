package okhttp3.internal.http;

import defpackage.ad0;
import defpackage.zq3;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.h;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.a aVar = ByteString.c;
        QUOTED_STRING_DELIMITERS = aVar.d("\"\\");
        TOKEN_DELIMITERS = aVar.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        zq3.h(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        zq3.h(headers, "<this>");
        zq3.h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (h.w(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new ad0().V(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        zq3.h(response, "<this>");
        if (zq3.c(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !h.w("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(defpackage.ad0 r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.C0()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.t.i()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.C0()
            if (r2 == 0) goto L67
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.h.B(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            defpackage.zq3.g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lba
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = readQuotedString(r7)
            goto L9f
        L9b:
            java.lang.String r6 = readToken(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.C0()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(ad0, java.util.List):void");
    }

    private static final String readQuotedString(ad0 ad0Var) throws EOFException {
        if (ad0Var.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ad0 ad0Var2 = new ad0();
        while (true) {
            long N = ad0Var.N(QUOTED_STRING_DELIMITERS);
            if (N == -1) {
                return null;
            }
            if (ad0Var.r(N) == 34) {
                ad0Var2.write(ad0Var, N);
                ad0Var.readByte();
                return ad0Var2.i1();
            }
            if (ad0Var.h1() == N + 1) {
                return null;
            }
            ad0Var2.write(ad0Var, N);
            ad0Var.readByte();
            ad0Var2.write(ad0Var, 1L);
        }
    }

    private static final String readToken(ad0 ad0Var) {
        long N = ad0Var.N(TOKEN_DELIMITERS);
        if (N == -1) {
            N = ad0Var.h1();
        }
        if (N != 0) {
            return ad0Var.s0(N);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        zq3.h(cookieJar, "<this>");
        zq3.h(httpUrl, "url");
        zq3.h(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(ad0 ad0Var) {
        boolean z = false;
        while (!ad0Var.C0()) {
            byte r = ad0Var.r(0L);
            if (r == 44) {
                ad0Var.readByte();
                z = true;
            } else {
                if (r != 32 && r != 9) {
                    break;
                }
                ad0Var.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(ad0 ad0Var, byte b) {
        return !ad0Var.C0() && ad0Var.r(0L) == b;
    }
}
