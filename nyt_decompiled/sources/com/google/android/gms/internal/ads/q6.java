package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.Headers;
import defpackage.f6f;
import defpackage.fgb;
import defpackage.o5f;
import defpackage.qve;
import defpackage.r5f;
import defpackage.u1f;
import defpackage.wad;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class q6 extends qve implements r5f {
    private static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int e;
    private final int f;
    private final String g;
    private final o5f h;
    private u1f i;
    private HttpURLConnection j;
    private final Queue k;
    private InputStream l;
    private boolean m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private final long t;
    private final long u;

    q6(String str, f6f f6fVar, int i, int i2, long j, long j2) {
        super(true);
        wad.c(str);
        this.g = str;
        this.h = new o5f();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (f6fVar != null) {
            h(f6fVar);
        }
    }

    private final void o() {
        while (!this.k.isEmpty()) {
            try {
                ((HttpURLConnection) this.k.remove()).disconnect();
            } catch (Exception e) {
                fgb.e("Unexpected error while disconnecting", e);
            }
        }
        this.j = null;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.q + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.u;
            long j6 = this.s;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.r;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.t + j7) - r3) - 1, (-1) + j7 + j4));
                    n(j7, min, 2);
                    this.s = min;
                    j6 = min;
                }
            }
            int read = this.l.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.q) - this.p));
            if (read == -1) {
                throw new EOFException();
            }
            this.p += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            throw new zzhp(e, this.i, 2000, 2);
        }
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        this.i = u1fVar;
        this.p = 0L;
        long j = u1fVar.f;
        long j2 = u1fVar.g;
        long min = j2 == -1 ? this.t : Math.min(this.t, j2);
        this.q = j;
        HttpURLConnection n = n(j, (min + j) - 1, 1);
        this.j = n;
        String headerField = n.getHeaderField(Headers.CONTENT_RANGE);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = u1fVar.g;
                    if (j3 != -1) {
                        this.o = j3;
                        this.r = Math.max(parseLong, (this.q + j3) - 1);
                    } else {
                        this.o = parseLong2 - this.q;
                        this.r = parseLong2 - 1;
                    }
                    this.s = parseLong;
                    this.m = true;
                    m(u1fVar);
                    return this.o;
                } catch (NumberFormatException unused) {
                    fgb.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzciy(headerField, u1fVar);
    }

    final HttpURLConnection n(long j, long j2, int i) {
        String uri = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(Headers.RANGE, "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String uri2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    o();
                    throw new zzciz(this.n, headerFields, this.i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    o();
                    throw new zzhp(e, this.i, 2000, i);
                }
            } catch (IOException e2) {
                o();
                throw new zzhp("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.i, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(uri)), e3, this.i, 2000, i);
        }
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.kye
    public final void zzd() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.i, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            o();
            if (this.m) {
                this.m = false;
                k();
            }
        }
    }

    @Override // defpackage.qve, defpackage.kye
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
