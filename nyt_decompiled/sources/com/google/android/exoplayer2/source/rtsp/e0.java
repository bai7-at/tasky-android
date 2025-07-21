package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.s;
import defpackage.d50;
import defpackage.ur;
import defpackage.z19;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class e0 extends d50 implements b, s.b {
    private final LinkedBlockingQueue e;
    private final long f;
    private byte[] g;
    private int h;

    public e0(long j) {
        super(true);
        this.f = j;
        this.e = new LinkedBlockingQueue();
        this.g = new byte[0];
        this.h = -1;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        this.h = bVar.a.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String c() {
        ur.g(this.h != -1);
        return z19.D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.h), Integer.valueOf(this.h + 1));
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int d() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public boolean j() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.s.b
    public void k(byte[] bArr) {
        this.e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b m() {
        return this;
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.g.length);
        System.arraycopy(this.g, 0, bArr, i, min);
        byte[] bArr2 = this.g;
        this.g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i2) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.e.poll(this.f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i2 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + min, min2);
            if (min2 < bArr3.length) {
                this.g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
