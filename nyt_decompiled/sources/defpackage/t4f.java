package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzhp;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t4f extends qve implements r5f {
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final o5f i;
    private final o5f j;
    private u1f k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private int o;
    private long p;
    private long q;

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection n(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f
            r3.setConnectTimeout(r4)
            int r4 = r2.g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            o5f r5 = r2.i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            o5f r5 = r2.j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r2 = r2.h
            if (r2 == 0) goto L8c
            java.lang.String r4 = "User-Agent"
            r3.setRequestProperty(r4, r2)
        L8c:
            r2 = 1
            if (r2 == r10) goto L92
            java.lang.String r2 = "identity"
            goto L94
        L92:
            java.lang.String r2 = "gzip"
        L94:
            java.lang.String r4 = "Accept-Encoding"
            r3.setRequestProperty(r4, r2)
            r3.setInstanceFollowRedirects(r11)
            r2 = 0
            r3.setDoOutput(r2)
            int r2 = defpackage.u1f.j
            java.lang.String r2 = "GET"
            r3.setRequestMethod(r2)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.n(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL o(URL url, String str, u1f u1fVar) {
        if (str == null) {
            throw new zzhp("Null location redirect", u1fVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), u1fVar, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", u1fVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhp(e, u1fVar, 2001, 1);
        }
    }

    private final void p() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ezd.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.l = null;
        }
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.m;
            int i3 = khe.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.q += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            u1f u1fVar = this.k;
            int i4 = khe.a;
            throw zzhp.a(e, u1fVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        if (r10 == r19) goto L35;
     */
    @Override // defpackage.kye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.u1f r27) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.e(u1f):long");
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.kye
    public final void zzd() {
        try {
            InputStream inputStream = this.m;
            if (inputStream != null) {
                if (this.l != null) {
                    int i = khe.a;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    u1f u1fVar = this.k;
                    int i2 = khe.a;
                    throw new zzhp(e, u1fVar, 2000, 3);
                }
            }
        } finally {
            this.m = null;
            p();
            if (this.n) {
                this.n = false;
                k();
            }
        }
    }

    @Override // defpackage.qve, defpackage.kye
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? zzgad.f() : new r3f(httpURLConnection.getHeaderFields());
    }

    private t4f(String str, int i, int i2, boolean z, o5f o5fVar, uge ugeVar, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = o5fVar;
        this.j = new o5f();
    }
}
