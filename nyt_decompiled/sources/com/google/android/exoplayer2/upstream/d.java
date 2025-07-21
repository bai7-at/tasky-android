package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.Headers;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.d;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.s;
import defpackage.a84;
import defpackage.d50;
import defpackage.i16;
import defpackage.ib3;
import defpackage.ra3;
import defpackage.sq8;
import defpackage.ur;
import defpackage.z19;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class d extends d50 implements com.google.android.exoplayer2.upstream.a {
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final ra3 i;
    private final ra3 j;
    private final boolean k;
    private i16 l;
    private com.google.android.exoplayer2.upstream.b m;
    private HttpURLConnection n;
    private InputStream o;
    private boolean p;
    private int q;
    private long r;
    private long s;

    public static final class b implements a.InterfaceC0194a {
        private sq8 b;
        private i16 c;
        private String d;
        private boolean g;
        private boolean h;
        private final ra3 a = new ra3();
        private int e = 8000;
        private int f = 8000;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a() {
            d dVar = new d(this.d, this.e, this.f, this.g, this.a, this.c, this.h);
            sq8 sq8Var = this.b;
            if (sq8Var != null) {
                dVar.i(sq8Var);
            }
            return dVar;
        }

        public b c(String str) {
            this.d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends com.google.common.collect.h {
        private final Map a;

        public c(Map map) {
            this.a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean m(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean n(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.mp2
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.a;
        }

        @Override // com.google.common.collect.h, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.d(obj);
        }

        @Override // com.google.common.collect.h, java.util.Map
        public Set entrySet() {
            return s.b(super.entrySet(), new i16() { // from class: com.google.android.exoplayer2.upstream.f
                @Override // defpackage.i16
                public final boolean apply(Object obj) {
                    boolean m;
                    m = d.c.m((Map.Entry) obj);
                    return m;
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.f(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.h();
        }

        @Override // com.google.common.collect.h, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.h, java.util.Map
        public Set keySet() {
            return s.b(super.keySet(), new i16() { // from class: com.google.android.exoplayer2.upstream.e
                @Override // defpackage.i16
                public final boolean apply(Object obj) {
                    boolean n;
                    n = d.c.n((String) obj);
                    return n;
                }
            });
        }

        @Override // com.google.common.collect.h, java.util.Map
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.h, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private HttpURLConnection A(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection C = C(url);
        C.setConnectTimeout(this.f);
        C.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        ra3 ra3Var = this.i;
        if (ra3Var != null) {
            hashMap.putAll(ra3Var.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            C.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = ib3.a(j, j2);
        if (a2 != null) {
            C.setRequestProperty(Headers.RANGE, a2);
        }
        String str = this.h;
        if (str != null) {
            C.setRequestProperty("User-Agent", str);
        }
        C.setRequestProperty("Accept-Encoding", z ? EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP : "identity");
        C.setInstanceFollowRedirects(z2);
        C.setDoOutput(bArr != null);
        C.setRequestMethod(com.google.android.exoplayer2.upstream.b.c(i));
        if (bArr != null) {
            C.setFixedLengthStreamingMode(bArr.length);
            C.connect();
            OutputStream outputStream = C.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            C.connect();
        }
        return C;
    }

    private static void B(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = z19.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) ur.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int D(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.r;
        if (j != -1) {
            long j2 = j - this.s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) z19.j(this.o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.s += read;
        s(read);
        return read;
    }

    private void E(long j, com.google.android.exoplayer2.upstream.b bVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        while (j > 0) {
            int read = ((InputStream) z19.j(this.o)).read(bArr, 0, (int) Math.min(j, ProgressEvent.PART_FAILED_EVENT_CODE));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), bVar, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(bVar, 2008, 1);
            }
            j -= read;
            s(read);
        }
    }

    private void w() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                a84.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    private URL x(URL url, String str, com.google.android.exoplayer2.upstream.b bVar) {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", bVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, bVar, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", bVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, bVar, 2001, 1);
        }
    }

    private static boolean y(HttpURLConnection httpURLConnection) {
        return EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection z(com.google.android.exoplayer2.upstream.b r26) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.d.z(com.google.android.exoplayer2.upstream.b):java.net.HttpURLConnection");
    }

    HttpURLConnection C(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        byte[] bArr;
        this.m = bVar;
        long j = 0;
        this.s = 0L;
        this.r = 0L;
        u(bVar);
        try {
            HttpURLConnection z = z(bVar);
            this.n = z;
            this.q = z.getResponseCode();
            String responseMessage = z.getResponseMessage();
            int i = this.q;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = z.getHeaderFields();
                if (this.q == 416) {
                    if (bVar.g == ib3.c(z.getHeaderField(Headers.CONTENT_RANGE))) {
                        this.p = true;
                        v(bVar);
                        long j2 = bVar.h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = z.getErrorStream();
                try {
                    bArr = errorStream != null ? z19.a1(errorStream) : z19.f;
                } catch (IOException unused) {
                    bArr = z19.f;
                }
                byte[] bArr2 = bArr;
                w();
                throw new HttpDataSource$InvalidResponseCodeException(this.q, responseMessage, this.q == 416 ? new DataSourceException(2008) : null, headerFields, bVar, bArr2);
            }
            String contentType = z.getContentType();
            i16 i16Var = this.l;
            if (i16Var != null && !i16Var.apply(contentType)) {
                w();
                throw new HttpDataSource$InvalidContentTypeException(contentType, bVar);
            }
            if (this.q == 200) {
                long j3 = bVar.g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean y = y(z);
            if (y) {
                this.r = bVar.h;
            } else {
                long j4 = bVar.h;
                if (j4 != -1) {
                    this.r = j4;
                } else {
                    long b2 = ib3.b(z.getHeaderField("Content-Length"), z.getHeaderField(Headers.CONTENT_RANGE));
                    this.r = b2 != -1 ? b2 - j : -1L;
                }
            }
            try {
                this.o = z.getInputStream();
                if (y) {
                    this.o = new GZIPInputStream(this.o);
                }
                this.p = true;
                v(bVar);
                try {
                    E(j, bVar);
                    return this.r;
                } catch (IOException e) {
                    w();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, bVar, 2000, 1);
                }
            } catch (IOException e2) {
                w();
                throw new HttpDataSource$HttpDataSourceException(e2, bVar, 2000, 1);
            }
        } catch (IOException e3) {
            w();
            throw HttpDataSource$HttpDataSourceException.c(e3, bVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        try {
            InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                B(this.n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource$HttpDataSourceException(e, (com.google.android.exoplayer2.upstream.b) z19.j(this.m), 2000, 3);
                }
            }
        } finally {
            this.o = null;
            w();
            if (this.p) {
                this.p = false;
                t();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? ImmutableMap.o() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        try {
            return D(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.c(e, (com.google.android.exoplayer2.upstream.b) z19.j(this.m), 2);
        }
    }

    private d(String str, int i, int i2, boolean z, ra3 ra3Var, i16 i16Var, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = ra3Var;
        this.l = i16Var;
        this.j = new ra3();
        this.k = z2;
    }
}
