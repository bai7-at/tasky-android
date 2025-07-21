package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.network.CacheResponse;
import defpackage.c04;
import defpackage.g62;
import defpackage.mg0;
import defpackage.qd0;
import defpackage.qr1;
import defpackage.s;
import defpackage.sd0;
import defpackage.uk5;
import defpackage.vd2;
import defpackage.wd5;
import defpackage.we2;
import defpackage.ww8;
import defpackage.yg3;
import defpackage.zg3;
import defpackage.zq3;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class HttpUriFetcher implements vd2 {
    public static final a f = new a(null);
    private static final CacheControl g = new CacheControl.Builder().noCache().noStore().build();
    private static final CacheControl h = new CacheControl.Builder().noCache().onlyIfCached().build();
    private final String a;
    private final uk5 b;
    private final c04 c;
    private final c04 d;
    private final boolean e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements vd2.a {
        private final c04 a;
        private final c04 b;
        private final boolean c;

        public b(c04 c04Var, c04 c04Var2, boolean z) {
            this.a = c04Var;
            this.b = c04Var2;
            this.c = z;
        }

        private final boolean c(Uri uri) {
            return zq3.c(uri.getScheme(), "http") || zq3.c(uri.getScheme(), "https");
        }

        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Uri uri, uk5 uk5Var, ImageLoader imageLoader) {
            if (c(uri)) {
                return new HttpUriFetcher(uri.toString(), uk5Var, this.a, this.b, this.c);
            }
            return null;
        }
    }

    public HttpUriFetcher(String str, uk5 uk5Var, c04 c04Var, c04 c04Var2, boolean z) {
        this.a = str;
        this.b = uk5Var;
        this.c = c04Var;
        this.d = c04Var2;
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.Request r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            boolean r6 = defpackage.s.r()
            if (r6 == 0) goto L5d
            uk5 r6 = r4.b
            coil.request.CachePolicy r6 = r6.k()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            c04 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            okhttp3.Call$Factory r4 = (okhttp3.Call.Factory) r4
            okhttp3.Call r4 = r4.newCall(r5)
            okhttp3.Response r4 = r4.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r4 = new android.os.NetworkOnMainThreadException
            r4.<init>()
            throw r4
        L5d:
            c04 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            okhttp3.Call$Factory r4 = (okhttp3.Call.Factory) r4
            okhttp3.Call r4 = r4.newCall(r5)
            r0.label = r3
            java.lang.Object r6 = defpackage.d.a(r4, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r4 = r6
            okhttp3.Response r4 = (okhttp3.Response) r4
        L75:
            boolean r5 = r4.isSuccessful()
            if (r5 != 0) goto L92
            int r5 = r4.code()
            r6 = 304(0x130, float:4.26E-43)
            if (r5 == r6) goto L92
            okhttp3.ResponseBody r5 = r4.body()
            if (r5 == 0) goto L8c
            defpackage.s.d(r5)
        L8c:
            coil.network.HttpException r5 = new coil.network.HttpException
            r5.<init>(r4)
            throw r5
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.c(okhttp3.Request, by0):java.lang.Object");
    }

    private final String d() {
        String h2 = this.b.h();
        return h2 == null ? this.a : h2;
    }

    private final we2 e() {
        Object value = this.d.getValue();
        zq3.e(value);
        return ((qr1) value).a();
    }

    private final boolean g(Request request, Response response) {
        return this.b.i().getWriteEnabled() && (!this.e || mg0.c.c(request, response));
    }

    private final Request h() {
        Request.Builder headers = new Request.Builder().url(this.a).headers(this.b.j());
        for (Map.Entry entry : this.b.p().a().entrySet()) {
            Object key = entry.getKey();
            zq3.f(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, entry.getValue());
        }
        boolean readEnabled = this.b.i().getReadEnabled();
        boolean readEnabled2 = this.b.k().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                headers.cacheControl(h);
            }
        } else if (this.b.i().getWriteEnabled()) {
            headers.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(g);
        }
        return headers.build();
    }

    private final qr1.c i() {
        qr1 qr1Var;
        if (!this.b.i().getReadEnabled() || (qr1Var = (qr1) this.d.getValue()) == null) {
            return null;
        }
        return qr1Var.get(d());
    }

    private final ResponseBody j(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null");
    }

    private final CacheResponse k(qr1.c cVar) {
        CacheResponse cacheResponse;
        try {
            sd0 d = wd5.d(e().q(cVar.getMetadata()));
            try {
                cacheResponse = new CacheResponse(d);
                th = null;
            } catch (Throwable th) {
                th = th;
                cacheResponse = null;
            }
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    } else {
                        g62.a(th, th2);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            zq3.e(cacheResponse);
            return cacheResponse;
        } catch (IOException unused) {
            return null;
        }
    }

    private final DataSource l(Response response) {
        return response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    private final yg3 m(qr1.c cVar) {
        return zg3.c(cVar.getData(), e(), d(), cVar);
    }

    private final yg3 n(ResponseBody responseBody) {
        return zg3.a(responseBody.source(), this.b.g());
    }

    private final qr1.c o(qr1.c cVar, Request request, Response response, CacheResponse cacheResponse) {
        qr1.b b2;
        ww8 ww8Var;
        Long l;
        ww8 ww8Var2;
        Throwable th = null;
        if (!g(request, response)) {
            if (cVar != null) {
                s.d(cVar);
            }
            return null;
        }
        if (cVar != null) {
            b2 = cVar.Y0();
        } else {
            qr1 qr1Var = (qr1) this.d.getValue();
            b2 = qr1Var != null ? qr1Var.b(d()) : null;
        }
        try {
            if (b2 == null) {
                return null;
            }
            try {
                if (response.code() != 304 || cacheResponse == null) {
                    qd0 c = wd5.c(e().p(b2.getMetadata(), false));
                    try {
                        new CacheResponse(response).g(c);
                        ww8Var = ww8.a;
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        ww8Var = null;
                    }
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th3) {
                            if (th == null) {
                                th = th3;
                            } else {
                                g62.a(th, th3);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    zq3.e(ww8Var);
                    qd0 c2 = wd5.c(e().p(b2.getData(), false));
                    try {
                        ResponseBody body = response.body();
                        zq3.e(body);
                        l = Long.valueOf(body.source().S0(c2));
                    } catch (Throwable th4) {
                        th = th4;
                        l = null;
                    }
                    if (c2 != null) {
                        try {
                            c2.close();
                        } catch (Throwable th5) {
                            if (th == null) {
                                th = th5;
                            } else {
                                g62.a(th, th5);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    zq3.e(l);
                } else {
                    Response build = response.newBuilder().headers(mg0.c.a(cacheResponse.d(), response.headers())).build();
                    qd0 c3 = wd5.c(e().p(b2.getMetadata(), false));
                    try {
                        new CacheResponse(build).g(c3);
                        ww8Var2 = ww8.a;
                    } catch (Throwable th6) {
                        th = th6;
                        ww8Var2 = null;
                    }
                    if (c3 != null) {
                        try {
                            c3.close();
                        } catch (Throwable th7) {
                            if (th == null) {
                                th = th7;
                            } else {
                                g62.a(th, th7);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    zq3.e(ww8Var2);
                }
                qr1.c a2 = b2.a();
                s.d(response);
                return a2;
            } catch (Exception e) {
                s.a(b2);
                throw e;
            }
        } catch (Throwable th8) {
            s.d(response);
            throw th8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[Catch: Exception -> 0x0136, TRY_ENTER, TryCatch #4 {Exception -> 0x0136, blocks: (B:43:0x0123, B:45:0x0131, B:46:0x013c, B:48:0x0146, B:50:0x014e, B:52:0x0166), top: B:41:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146 A[Catch: Exception -> 0x0136, TryCatch #4 {Exception -> 0x0136, blocks: (B:43:0x0123, B:45:0x0131, B:46:0x013c, B:48:0x0146, B:50:0x014e, B:52:0x0166), top: B:41:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // defpackage.vd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.a(by0):java.lang.Object");
    }

    public final String f(String str, MediaType mediaType) {
        String j;
        String mediaType2 = mediaType != null ? mediaType.toString() : null;
        if ((mediaType2 == null || h.K(mediaType2, "text/plain", false, 2, null)) && (j = s.j(MimeTypeMap.getSingleton(), str)) != null) {
            return j;
        }
        if (mediaType2 != null) {
            return h.X0(mediaType2, ';', null, 2, null);
        }
        return null;
    }
}
