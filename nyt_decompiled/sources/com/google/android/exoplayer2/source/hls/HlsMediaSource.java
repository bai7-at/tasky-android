package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.w0;
import defpackage.b93;
import defpackage.c93;
import defpackage.f93;
import defpackage.fw1;
import defpackage.lh2;
import defpackage.mm0;
import defpackage.n72;
import defpackage.ob;
import defpackage.rg1;
import defpackage.rh1;
import defpackage.rt7;
import defpackage.sq8;
import defpackage.th1;
import defpackage.ur;
import defpackage.us0;
import defpackage.z19;
import java.util.List;

/* loaded from: classes2.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {
    private sq8 B;
    private final c93 h;
    private final w0.h i;
    private final b93 j;
    private final us0 k;
    private final com.google.android.exoplayer2.drm.i l;
    private final com.google.android.exoplayer2.upstream.h m;
    private final boolean n;
    private final int r;
    private final boolean s;
    private final HlsPlaylistTracker t;
    private final long u;
    private final w0 w;
    private final long x;
    private w0.g y;

    public static final class Factory implements q {
        public static final /* synthetic */ int o = 0;
        private final b93 c;
        private c93 d;
        private f93 e;
        private HlsPlaylistTracker.a f;
        private us0 g;
        private fw1 h;
        private com.google.android.exoplayer2.upstream.h i;
        private boolean j;
        private int k;
        private boolean l;
        private long m;
        private long n;

        public Factory(a.InterfaceC0194a interfaceC0194a) {
            this(new rh1(interfaceC0194a));
        }

        @Override // com.google.android.exoplayer2.source.o.a
        public int[] b() {
            return new int[]{2};
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource a(w0 w0Var) {
            ur.e(w0Var.b);
            f93 f93Var = this.e;
            List list = w0Var.b.e;
            f93 lh2Var = !list.isEmpty() ? new lh2(f93Var, list) : f93Var;
            b93 b93Var = this.c;
            c93 c93Var = this.d;
            us0 us0Var = this.g;
            com.google.android.exoplayer2.drm.i a = this.h.a(w0Var);
            com.google.android.exoplayer2.upstream.h hVar = this.i;
            return new HlsMediaSource(w0Var, b93Var, c93Var, us0Var, null, a, hVar, this.f.a(this.c, hVar, lh2Var), this.m, this.j, this.k, this.l, this.n);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(fw1 fw1Var) {
            this.h = (fw1) ur.f(fw1Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory d(com.google.android.exoplayer2.upstream.h hVar) {
            this.i = (com.google.android.exoplayer2.upstream.h) ur.f(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(b93 b93Var) {
            this.c = (b93) ur.e(b93Var);
            this.h = new com.google.android.exoplayer2.drm.g();
            this.e = new th1();
            this.f = com.google.android.exoplayer2.source.hls.playlist.a.s;
            this.d = c93.a;
            this.i = new com.google.android.exoplayer2.upstream.g();
            this.g = new rg1();
            this.k = 1;
            this.m = -9223372036854775807L;
            this.j = true;
        }
    }

    static {
        n72.a("goog.exo.hls");
    }

    private rt7 E(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, long j2, c cVar2) {
        long c = cVar.h - this.t.c();
        long j3 = cVar.o ? c + cVar.u : -9223372036854775807L;
        long I = I(cVar);
        long j4 = this.y.a;
        L(cVar, z19.r(j4 != -9223372036854775807L ? z19.D0(j4) : K(cVar, I), I, cVar.u + I));
        return new rt7(j, j2, -9223372036854775807L, j3, cVar.u, c, J(cVar, I), true, !cVar.o, cVar.d == 2 && cVar.f, cVar2, this.w, this.y);
    }

    private rt7 F(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, long j2, c cVar2) {
        long j3;
        if (cVar.e == -9223372036854775807L || cVar.r.isEmpty()) {
            j3 = 0;
        } else {
            if (!cVar.g) {
                long j4 = cVar.e;
                if (j4 != cVar.u) {
                    j3 = H(cVar.r, j4).e;
                }
            }
            j3 = cVar.e;
        }
        long j5 = j3;
        long j6 = cVar.u;
        return new rt7(j, j2, -9223372036854775807L, j6, j6, 0L, j5, true, false, true, cVar2, this.w, null);
    }

    private static c.b G(List list, long j) {
        c.b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            c.b bVar2 = (c.b) list.get(i);
            long j2 = bVar2.e;
            if (j2 > j || !bVar2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static c.d H(List list, long j) {
        return (c.d) list.get(z19.g(list, Long.valueOf(j), true, true));
    }

    private long I(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        if (cVar.p) {
            return z19.D0(z19.d0(this.u)) - cVar.e();
        }
        return 0L;
    }

    private long J(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j) {
        long j2 = cVar.e;
        if (j2 == -9223372036854775807L) {
            j2 = (cVar.u + j) - z19.D0(this.y.a);
        }
        if (cVar.g) {
            return j2;
        }
        c.b G = G(cVar.s, j2);
        if (G != null) {
            return G.e;
        }
        if (cVar.r.isEmpty()) {
            return 0L;
        }
        c.d H = H(cVar.r, j2);
        c.b G2 = G(H.m, j2);
        return G2 != null ? G2.e : H.e;
    }

    private static long K(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j) {
        long j2;
        c.f fVar = cVar.v;
        long j3 = cVar.e;
        if (j3 != -9223372036854775807L) {
            j2 = cVar.u - j3;
        } else {
            long j4 = fVar.d;
            if (j4 == -9223372036854775807L || cVar.n == -9223372036854775807L) {
                long j5 = fVar.c;
                j2 = j5 != -9223372036854775807L ? j5 : cVar.m * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(com.google.android.exoplayer2.source.hls.playlist.c r5, long r6) {
        /*
            r4 = this;
            com.google.android.exoplayer2.w0 r0 = r4.w
            com.google.android.exoplayer2.w0$g r0 = r0.d
            float r1 = r0.d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            com.google.android.exoplayer2.source.hls.playlist.c$f r5 = r5.v
            long r0 = r5.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            com.google.android.exoplayer2.w0$g$a r0 = new com.google.android.exoplayer2.w0$g$a
            r0.<init>()
            long r6 = defpackage.z19.h1(r6)
            com.google.android.exoplayer2.w0$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3c
            r0 = r7
            goto L40
        L3c:
            com.google.android.exoplayer2.w0$g r0 = r4.y
            float r0 = r0.d
        L40:
            com.google.android.exoplayer2.w0$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L47
            goto L4b
        L47:
            com.google.android.exoplayer2.w0$g r5 = r4.y
            float r7 = r5.e
        L4b:
            com.google.android.exoplayer2.w0$g$a r5 = r6.h(r7)
            com.google.android.exoplayer2.w0$g r5 = r5.f()
            r4.y = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.L(com.google.android.exoplayer2.source.hls.playlist.c, long):void");
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.B = sq8Var;
        this.l.b((Looper) ur.e(Looper.myLooper()), z());
        this.l.Z();
        this.t.j(this.i.a, w(null), this);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
        this.t.stop();
        this.l.release();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void b(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        long h1 = cVar.p ? z19.h1(cVar.h) : -9223372036854775807L;
        int i = cVar.d;
        long j = (i == 2 || i == 1) ? h1 : -9223372036854775807L;
        c cVar2 = new c((com.google.android.exoplayer2.source.hls.playlist.d) ur.e(this.t.d()), cVar);
        C(this.t.isLive() ? E(cVar, j, h1, cVar2) : F(cVar, j, h1, cVar2));
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.w;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        p.a w = w(bVar);
        return new e(this.h, this.t, this.j, this.B, null, this.l, u(bVar), this.m, w, obVar, this.k, this.n, this.r, this.s, z(), this.x);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ((e) nVar).B();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
        this.t.l();
    }

    private HlsMediaSource(w0 w0Var, b93 b93Var, c93 c93Var, us0 us0Var, mm0 mm0Var, com.google.android.exoplayer2.drm.i iVar, com.google.android.exoplayer2.upstream.h hVar, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2, long j2) {
        this.i = (w0.h) ur.e(w0Var.b);
        this.w = w0Var;
        this.y = w0Var.d;
        this.j = b93Var;
        this.h = c93Var;
        this.k = us0Var;
        this.l = iVar;
        this.m = hVar;
        this.t = hlsPlaylistTracker;
        this.u = j;
        this.n = z;
        this.r = i;
        this.s = z2;
        this.x = j2;
    }
}
