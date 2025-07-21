package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.amazonaws.event.ProgressEvent;
import defpackage.f6f;
import defpackage.fgb;
import defpackage.khe;
import defpackage.o5f;
import defpackage.qve;
import defpackage.r5f;
import defpackage.u1f;
import defpackage.wad;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
final class g6 extends qve implements r5f {
    private static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference v = new AtomicReference();
    private final SSLSocketFactory e;
    private final int f;
    private final int g;
    private final String h;
    private final o5f i;
    private u1f j;
    private HttpURLConnection k;
    private InputStream l;
    private boolean m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private int s;
    private final Set t;

    g6(String str, f6f f6fVar, int i, int i2, int i3) {
        super(true);
        this.e = new f6(this);
        this.t = new HashSet();
        wad.c(str);
        this.h = str;
        this.i = new o5f();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (f6fVar != null) {
            h(f6fVar);
        }
    }

    private final void q() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                fgb.e("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        try {
            if (this.q != this.o) {
                byte[] bArr2 = (byte[]) v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        v.set(bArr2);
                        break;
                    }
                    int read = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.q += read;
                    zzg(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzhp(e, this.j, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0243 A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0238, B:102:0x0243, B:104:0x0254, B:110:0x025d, B:111:0x026c, B:114:0x0274, B:115:0x027b, B:118:0x027c, B:119:0x0292), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0238, B:102:0x0243, B:104:0x0254, B:110:0x025d, B:111:0x026c, B:114:0x0274, B:115:0x027b, B:118:0x027c, B:119:0x0292), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    @Override // defpackage.kye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.u1f r21) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g6.e(u1f):long");
    }

    final void p(int i) {
        this.s = i;
        for (Socket socket : this.t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.s);
                } catch (SocketException e) {
                    fgb.h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
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
                int i = khe.a;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.j, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            q();
            if (this.m) {
                this.m = false;
                k();
            }
            this.t.clear();
        }
    }

    @Override // defpackage.qve, defpackage.kye
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
