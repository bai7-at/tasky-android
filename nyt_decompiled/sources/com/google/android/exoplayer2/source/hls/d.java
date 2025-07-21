package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.aa1;
import defpackage.c93;
import defpackage.d93;
import defpackage.hh1;
import defpackage.nm0;
import defpackage.ph4;
import defpackage.qm8;
import defpackage.re3;
import defpackage.rm8;
import defpackage.sv5;
import defpackage.tr;
import defpackage.ur;
import defpackage.yo5;
import defpackage.yy8;
import defpackage.z72;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
final class d extends ph4 {
    private static final AtomicInteger N = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final sv5 C;
    private final long D;
    private d93 E;
    private i F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private ImmutableList K;
    private boolean L;
    private boolean M;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    private final com.google.android.exoplayer2.upstream.a p;
    private final com.google.android.exoplayer2.upstream.b q;
    private final d93 r;
    private final boolean s;
    private final boolean t;
    private final qm8 u;
    private final c93 v;
    private final List w;
    private final DrmInitData x;
    private final re3 y;
    private final yo5 z;

    private d(c93 c93Var, com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, t0 t0Var, boolean z, com.google.android.exoplayer2.upstream.a aVar2, com.google.android.exoplayer2.upstream.b bVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, qm8 qm8Var, long j4, DrmInitData drmInitData, d93 d93Var, re3 re3Var, yo5 yo5Var, boolean z6, sv5 sv5Var) {
        super(aVar, bVar, t0Var, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.M = z3;
        this.l = i3;
        this.q = bVar2;
        this.p = aVar2;
        this.H = bVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = qm8Var;
        this.D = j4;
        this.t = z4;
        this.v = c93Var;
        this.w = list;
        this.x = drmInitData;
        this.r = d93Var;
        this.y = re3Var;
        this.z = yo5Var;
        this.n = z6;
        this.C = sv5Var;
        this.K = ImmutableList.x();
        this.k = N.getAndIncrement();
    }

    private static com.google.android.exoplayer2.upstream.a i(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        ur.e(bArr2);
        return new a(aVar, bArr, bArr2);
    }

    public static d j(c93 c93Var, com.google.android.exoplayer2.upstream.a aVar, t0 t0Var, long j, com.google.android.exoplayer2.source.hls.playlist.c cVar, b.e eVar, Uri uri, List list, int i, Object obj, boolean z, rm8 rm8Var, long j2, d dVar, byte[] bArr, byte[] bArr2, boolean z2, sv5 sv5Var, nm0 nm0Var) {
        com.google.android.exoplayer2.upstream.b bVar;
        com.google.android.exoplayer2.upstream.a aVar2;
        boolean z3;
        re3 re3Var;
        yo5 yo5Var;
        d93 d93Var;
        c.e eVar2 = eVar.a;
        com.google.android.exoplayer2.upstream.b a = new b.C0195b().i(yy8.e(cVar.a, eVar2.a)).h(eVar2.i).g(eVar2.j).b(eVar.d ? 8 : 0).e(ImmutableMap.o()).a();
        boolean z4 = bArr != null;
        com.google.android.exoplayer2.upstream.a i2 = i(aVar, bArr, z4 ? l((String) ur.e(eVar2.h)) : null);
        c.d dVar2 = eVar2.b;
        if (dVar2 != null) {
            boolean z5 = bArr2 != null;
            byte[] l = z5 ? l((String) ur.e(dVar2.h)) : null;
            bVar = new b.C0195b().i(yy8.e(cVar.a, dVar2.a)).h(dVar2.i).g(dVar2.j).e(ImmutableMap.o()).a();
            aVar2 = i(aVar, bArr2, l);
            z3 = z5;
        } else {
            bVar = null;
            aVar2 = null;
            z3 = false;
        }
        long j3 = j + eVar2.e;
        long j4 = j3 + eVar2.c;
        int i3 = cVar.j + eVar2.d;
        if (dVar != null) {
            com.google.android.exoplayer2.upstream.b bVar2 = dVar.q;
            boolean z6 = bVar == bVar2 || (bVar != null && bVar2 != null && bVar.a.equals(bVar2.a) && bVar.g == dVar.q.g);
            boolean z7 = uri.equals(dVar.m) && dVar.J;
            re3 re3Var2 = dVar.y;
            yo5 yo5Var2 = dVar.z;
            d93Var = (z6 && z7 && !dVar.L && dVar.l == i3) ? dVar.E : null;
            re3Var = re3Var2;
            yo5Var = yo5Var2;
        } else {
            re3Var = new re3();
            yo5Var = new yo5(10);
            d93Var = null;
        }
        return new d(c93Var, i2, a, t0Var, z4, aVar2, bVar, z3, uri, list, i, obj, j3, j4, eVar.b, eVar.c, !eVar.d, i3, eVar2.k, z, rm8Var.a(i3), j2, eVar2.f, d93Var, re3Var, yo5Var, z2, sv5Var);
    }

    private void k(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z, boolean z2) {
        com.google.android.exoplayer2.upstream.b e;
        long position;
        long j;
        if (z) {
            r0 = this.G != 0;
            e = bVar;
        } else {
            e = bVar.e(this.G);
        }
        try {
            hh1 u = u(aVar, e, z2);
            if (r0) {
                u.p(this.G);
            }
            while (!this.I && this.E.b(u)) {
                try {
                    try {
                    } catch (EOFException e2) {
                        if ((this.d.e & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e2;
                        }
                        this.E.a();
                        position = u.getPosition();
                        j = bVar.g;
                    }
                } catch (Throwable th) {
                    this.G = (int) (u.getPosition() - bVar.g);
                    throw th;
                }
            }
            position = u.getPosition();
            j = bVar.g;
            this.G = (int) (position - j);
        } finally {
            aa1.a(aVar);
        }
    }

    private static byte[] l(String str) {
        if (tr.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(b.e eVar, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        c.e eVar2 = eVar.a;
        return eVar2 instanceof c.b ? ((c.b) eVar2).l || (eVar.c == 0 && cVar.c) : cVar.c;
    }

    private void r() {
        k(this.i, this.b, this.A, true);
    }

    private void s() {
        if (this.H) {
            ur.e(this.p);
            ur.e(this.q);
            k(this.p, this.q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long t(z72 z72Var) {
        z72Var.g();
        try {
            this.z.Q(10);
            z72Var.r(this.z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.z.K() != 4801587) {
            return -9223372036854775807L;
        }
        this.z.V(3);
        int G = this.z.G();
        int i = G + 10;
        if (i > this.z.b()) {
            byte[] e = this.z.e();
            this.z.Q(i);
            System.arraycopy(e, 0, this.z.e(), 0, 10);
        }
        z72Var.r(this.z.e(), 10, G);
        Metadata e2 = this.y.e(this.z.e(), G);
        if (e2 == null) {
            return -9223372036854775807L;
        }
        int e3 = e2.e();
        for (int i2 = 0; i2 < e3; i2++) {
            Metadata.Entry d = e2.d(i2);
            if (d instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) d;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.z.e(), 0, 8);
                    this.z.U(0);
                    this.z.T(8);
                    return this.z.A() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private hh1 u(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        long b = aVar.b(bVar);
        if (z) {
            try {
                this.u.i(this.s, this.g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        hh1 hh1Var = new hh1(aVar, bVar.g, b);
        if (this.E == null) {
            long t = t(hh1Var);
            hh1Var.g();
            d93 d93Var = this.r;
            d93 f = d93Var != null ? d93Var.f() : this.v.a(bVar.a, this.d, this.w, this.u, aVar.f(), hh1Var, this.C);
            this.E = f;
            if (f.e()) {
                this.F.n0(t != -9223372036854775807L ? this.u.b(t) : this.g);
            } else {
                this.F.n0(0L);
            }
            this.F.Z();
            this.E.c(this.F);
        }
        this.F.k0(this.x);
        return hh1Var;
    }

    public static boolean w(d dVar, Uri uri, com.google.android.exoplayer2.source.hls.playlist.c cVar, b.e eVar, long j) {
        if (dVar == null) {
            return false;
        }
        if (uri.equals(dVar.m) && dVar.J) {
            return false;
        }
        return !p(eVar, cVar) || j + eVar.a.e < dVar.h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        d93 d93Var;
        ur.e(this.F);
        if (this.E == null && (d93Var = this.r) != null && d93Var.d()) {
            this.E = this.r;
            this.H = false;
        }
        s();
        if (this.I) {
            return;
        }
        if (!this.t) {
            r();
        }
        this.J = !this.I;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.I = true;
    }

    @Override // defpackage.ph4
    public boolean h() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(int i) {
        ur.g(!this.n);
        if (i >= this.K.size()) {
            return 0;
        }
        return ((Integer) this.K.get(i)).intValue();
    }

    public void n(i iVar, ImmutableList immutableList) {
        this.F = iVar;
        this.K = immutableList;
    }

    public void o() {
        this.L = true;
    }

    public boolean q() {
        return this.M;
    }

    public void v() {
        this.M = true;
    }
}
