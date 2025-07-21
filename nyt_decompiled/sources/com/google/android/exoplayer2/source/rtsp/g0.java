package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.common.primitives.Ints;
import defpackage.sq8;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
final class g0 implements b {
    private final UdpDataSource a;
    private g0 b;

    public g0(long j) {
        this.a = new UdpDataSource(2000, Ints.d(j));
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        return this.a.b(bVar);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String c() {
        int d = d();
        ur.g(d != -1);
        return z19.D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(d), Integer.valueOf(d + 1));
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.a.close();
        g0 g0Var = this.b;
        if (g0Var != null) {
            g0Var.close();
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int d() {
        int d = this.a.d();
        if (d == -1) {
            return -1;
        }
        return d;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
        this.a.i(sq8Var);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public boolean j() {
        return true;
    }

    public void k(g0 g0Var) {
        ur.a(this != g0Var);
        this.b = g0Var;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b m() {
        return null;
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
