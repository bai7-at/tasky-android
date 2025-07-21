package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.w0;
import defpackage.fw1;
import defpackage.mh2;
import defpackage.mm0;
import defpackage.n72;
import defpackage.ob;
import defpackage.pi4;
import defpackage.rg1;
import defpackage.rt7;
import defpackage.sq8;
import defpackage.ur;
import defpackage.us0;
import defpackage.v64;
import defpackage.x64;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class SsMediaSource extends com.google.android.exoplayer2.source.a implements Loader.b {
    private Loader B;
    private x64 H;
    private sq8 L;
    private long M;
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a N;
    private Handler Q;
    private final boolean h;
    private final Uri i;
    private final w0.h j;
    private final w0 k;
    private final a.InterfaceC0194a l;
    private final b.a m;
    private final us0 n;
    private final i r;
    private final h s;
    private final long t;
    private final p.a u;
    private final i.a w;
    private final ArrayList x;
    private com.google.android.exoplayer2.upstream.a y;

    public static final class Factory implements q {
        public static final /* synthetic */ int j = 0;
        private final b.a c;
        private final a.InterfaceC0194a d;
        private us0 e;
        private fw1 f;
        private h g;
        private long h;
        private i.a i;

        public Factory(a.InterfaceC0194a interfaceC0194a) {
            this(new a.C0191a(interfaceC0194a), interfaceC0194a);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        public int[] b() {
            return new int[]{1};
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public SsMediaSource a(w0 w0Var) {
            ur.e(w0Var.b);
            i.a aVar = this.i;
            if (aVar == null) {
                aVar = new SsManifestParser();
            }
            List list = w0Var.b.e;
            return new SsMediaSource(w0Var, null, this.d, !list.isEmpty() ? new mh2(aVar, list) : aVar, this.c, this.e, null, this.f.a(w0Var), this.g, this.h);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(fw1 fw1Var) {
            this.f = (fw1) ur.f(fw1Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory d(h hVar) {
            this.g = (h) ur.f(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(b.a aVar, a.InterfaceC0194a interfaceC0194a) {
            this.c = (b.a) ur.e(aVar);
            this.d = interfaceC0194a;
            this.f = new g();
            this.g = new com.google.android.exoplayer2.upstream.g();
            this.h = 30000L;
            this.e = new rg1();
        }
    }

    static {
        n72.a("goog.exo.smoothstreaming");
    }

    private void I() {
        rt7 rt7Var;
        for (int i = 0; i < this.x.size(); i++) {
            ((c) this.x.get(i)).w(this.N);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (a.b bVar : this.N.f) {
            if (bVar.k > 0) {
                j2 = Math.min(j2, bVar.e(0));
                j = Math.max(j, bVar.e(bVar.k - 1) + bVar.c(bVar.k - 1));
            }
        }
        if (j2 == Long.MAX_VALUE) {
            long j3 = this.N.d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.N;
            boolean z = aVar.d;
            rt7Var = new rt7(j3, 0L, 0L, 0L, true, z, z, aVar, this.k);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.N;
            if (aVar2.d) {
                long j4 = aVar2.h;
                if (j4 != -9223372036854775807L && j4 > 0) {
                    j2 = Math.max(j2, j - j4);
                }
                long j5 = j2;
                long j6 = j - j5;
                long D0 = j6 - z19.D0(this.t);
                if (D0 < 5000000) {
                    D0 = Math.min(5000000L, j6 / 2);
                }
                rt7Var = new rt7(-9223372036854775807L, j6, j5, D0, true, true, true, this.N, this.k);
            } else {
                long j7 = aVar2.g;
                long j8 = j7 != -9223372036854775807L ? j7 : j - j2;
                rt7Var = new rt7(j2 + j8, j8, j2, 0L, true, false, false, this.N, this.k);
            }
        }
        C(rt7Var);
    }

    private void J() {
        if (this.N.d) {
            this.Q.postDelayed(new Runnable() { // from class: zz7
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.K();
                }
            }, Math.max(0L, (this.M + BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.B.i()) {
            return;
        }
        com.google.android.exoplayer2.upstream.i iVar = new com.google.android.exoplayer2.upstream.i(this.y, this.i, 4, this.w);
        this.u.y(new v64(iVar.a, iVar.b, this.B.n(iVar, this, this.s.b(iVar.c))), iVar.c);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.L = sq8Var;
        this.r.b(Looper.myLooper(), z());
        this.r.Z();
        if (this.h) {
            this.H = new x64.a();
            I();
            return;
        }
        this.y = this.l.a();
        Loader loader = new Loader("SsMediaSource");
        this.B = loader;
        this.H = loader;
        this.Q = z19.w();
        K();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
        this.N = this.h ? this.N : null;
        this.y = null;
        this.M = 0L;
        Loader loader = this.B;
        if (loader != null) {
            loader.l();
            this.B = null;
        }
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Q = null;
        }
        this.r.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void e(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, boolean z) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.s.d(iVar.a);
        this.u.p(v64Var, iVar.c);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void k(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.s.d(iVar.a);
        this.u.s(v64Var, iVar.c);
        this.N = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) iVar.e();
        this.M = j - j2;
        I();
        J();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Loader.c o(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, IOException iOException, int i) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        long a2 = this.s.a(new h.c(v64Var, new pi4(iVar.c), iOException, i));
        Loader.c h = a2 == -9223372036854775807L ? Loader.g : Loader.h(false, a2);
        boolean c = h.c();
        this.u.w(v64Var, iVar.c, iOException, !c);
        if (!c) {
            this.s.d(iVar.a);
        }
        return h;
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.k;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        p.a w = w(bVar);
        c cVar = new c(this.N, this.m, this.L, this.n, null, this.r, u(bVar), this.s, w, this.H, obVar);
        this.x.add(cVar);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ((c) nVar).v();
        this.x.remove(nVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
        this.H.a();
    }

    private SsMediaSource(w0 w0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, a.InterfaceC0194a interfaceC0194a, i.a aVar2, b.a aVar3, us0 us0Var, mm0 mm0Var, com.google.android.exoplayer2.drm.i iVar, h hVar, long j) {
        ur.g(aVar == null || !aVar.d);
        this.k = w0Var;
        w0.h hVar2 = (w0.h) ur.e(w0Var.b);
        this.j = hVar2;
        this.N = aVar;
        this.i = hVar2.a.equals(Uri.EMPTY) ? null : z19.C(hVar2.a);
        this.l = interfaceC0194a;
        this.w = aVar2;
        this.m = aVar3;
        this.n = us0Var;
        this.r = iVar;
        this.s = hVar;
        this.t = j;
        this.u = w(null);
        this.h = aVar != null;
        this.x = new ArrayList();
    }
}
