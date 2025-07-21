package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.amazonaws.services.s3.internal.Constants;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.d;
import com.google.android.exoplayer2.d2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.h0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q1;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import com.google.common.collect.ImmutableList;
import defpackage.a84;
import defpackage.ad;
import defpackage.bq8;
import defpackage.bu7;
import defpackage.c41;
import defpackage.cx6;
import defpackage.d72;
import defpackage.dx6;
import defpackage.fh0;
import defpackage.fi7;
import defpackage.hq8;
import defpackage.ik2;
import defpackage.jj8;
import defpackage.jq8;
import defpackage.l40;
import defpackage.lh4;
import defpackage.n72;
import defpackage.nc;
import defpackage.pt0;
import defpackage.q72;
import defpackage.qr7;
import defpackage.r63;
import defpackage.r64;
import defpackage.sk4;
import defpackage.sv5;
import defpackage.u64;
import defpackage.u79;
import defpackage.ur;
import defpackage.v89;
import defpackage.vl0;
import defpackage.wc1;
import defpackage.wp8;
import defpackage.xs4;
import defpackage.yc1;
import defpackage.z19;
import defpackage.z89;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class h0 extends com.google.android.exoplayer2.e implements v1 {
    private final com.google.android.exoplayer2.d A;
    private final d2 B;
    private final i2 C;
    private final j2 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private fi7 L;
    private qr7 M;
    private boolean N;
    private v1.b O;
    private x0 P;
    private x0 Q;
    private t0 R;
    private t0 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private zy7 X;
    private boolean Y;
    private TextureView Z;
    private int a0;
    final jq8 b;
    private int b0;
    final v1.b c;
    private bu7 c0;
    private final pt0 d;
    private wc1 d0;
    private final Context e;
    private wc1 e0;
    private final v1 f;
    private int f0;
    private final z1[] g;
    private com.google.android.exoplayer2.audio.a g0;
    private final hq8 h;
    private float h0;
    private final r63 i;
    private boolean i0;
    private final s0.f j;
    private c41 j0;
    private final s0 k;
    private boolean k0;
    private final r64 l;
    private boolean l0;
    private final CopyOnWriteArraySet m;
    private boolean m0;
    private final g2.b n;
    private boolean n0;
    private final List o;
    private j o0;
    private final boolean p;
    private z89 p0;
    private final o.a q;
    private x0 q0;
    private final nc r;
    private t1 r0;
    private final Looper s;
    private int s0;
    private final l40 t;
    private int t0;
    private final long u;
    private long u0;
    private final long v;
    private final vl0 w;
    private final c x;
    private final d y;
    private final com.google.android.exoplayer2.b z;

    private static final class b {
        public static sv5 a(Context context, h0 h0Var, boolean z) {
            LogSessionId logSessionId;
            sk4 u0 = sk4.u0(context);
            if (u0 == null) {
                a84.j("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new sv5(logSessionId);
            }
            if (z) {
                h0Var.F0(u0);
            }
            return new sv5(u0.B0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements v89, com.google.android.exoplayer2.audio.e, jj8, xs4, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zy7.b, d.b, b.InterfaceC0180b, d2.b, d72 {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(v1.d dVar) {
            dVar.I(h0.this.P);
        }

        @Override // zy7.b
        public void A(Surface surface) {
            h0.this.R1(surface);
        }

        @Override // com.google.android.exoplayer2.d2.b
        public void B(final int i, final boolean z) {
            h0.this.l.l(30, new r64.a() { // from class: com.google.android.exoplayer2.m0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).N(i, z);
                }
            });
        }

        @Override // defpackage.d72
        public void E(boolean z) {
            h0.this.b2();
        }

        @Override // com.google.android.exoplayer2.d.b
        public void F(float f) {
            h0.this.I1();
        }

        @Override // com.google.android.exoplayer2.d.b
        public void G(int i) {
            boolean p = h0.this.p();
            h0.this.Y1(p, i, h0.V0(p, i));
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void a(final boolean z) {
            if (h0.this.i0 == z) {
                return;
            }
            h0.this.i0 = z;
            h0.this.l.l(23, new r64.a() { // from class: com.google.android.exoplayer2.o0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).a(z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void b(Exception exc) {
            h0.this.r.b(exc);
        }

        @Override // com.google.android.exoplayer2.d2.b
        public void c(int i) {
            final j K0 = h0.K0(h0.this.B);
            if (K0.equals(h0.this.o0)) {
                return;
            }
            h0.this.o0 = K0;
            h0.this.l.l(29, new r64.a() { // from class: com.google.android.exoplayer2.n0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).G(j.this);
                }
            });
        }

        @Override // defpackage.v89
        public void d(String str) {
            h0.this.r.d(str);
        }

        @Override // defpackage.v89
        public void e(String str, long j, long j2) {
            h0.this.r.e(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void f(String str) {
            h0.this.r.f(str);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void g(String str, long j, long j2) {
            h0.this.r.g(str, j, j2);
        }

        @Override // defpackage.xs4
        public void h(final Metadata metadata) {
            h0 h0Var = h0.this;
            h0Var.q0 = h0Var.q0.c().K(metadata).H();
            x0 I0 = h0.this.I0();
            if (!I0.equals(h0.this.P)) {
                h0.this.P = I0;
                h0.this.l.i(14, new r64.a() { // from class: com.google.android.exoplayer2.k0
                    @Override // r64.a
                    public final void invoke(Object obj) {
                        h0.c.this.S((v1.d) obj);
                    }
                });
            }
            h0.this.l.i(28, new r64.a() { // from class: com.google.android.exoplayer2.l0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).h(Metadata.this);
                }
            });
            h0.this.l.f();
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void i(t0 t0Var, yc1 yc1Var) {
            h0.this.S = t0Var;
            h0.this.r.i(t0Var, yc1Var);
        }

        @Override // defpackage.jj8
        public void j(final List list) {
            h0.this.l.l(27, new r64.a() { // from class: com.google.android.exoplayer2.i0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).j(list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void k(long j) {
            h0.this.r.k(j);
        }

        @Override // defpackage.v89
        public void l(Exception exc) {
            h0.this.r.l(exc);
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0180b
        public void m() {
            h0.this.Y1(false, -1, 3);
        }

        @Override // defpackage.v89
        public void n(final z89 z89Var) {
            h0.this.p0 = z89Var;
            h0.this.l.l(25, new r64.a() { // from class: com.google.android.exoplayer2.p0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).n(z89.this);
                }
            });
        }

        @Override // defpackage.v89
        public void o(wc1 wc1Var) {
            h0.this.r.o(wc1Var);
            h0.this.R = null;
            h0.this.d0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            h0.this.Q1(surfaceTexture);
            h0.this.B1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h0.this.R1(null);
            h0.this.B1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            h0.this.B1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // defpackage.v89
        public void p(wc1 wc1Var) {
            h0.this.d0 = wc1Var;
            h0.this.r.p(wc1Var);
        }

        @Override // zy7.b
        public void q(Surface surface) {
            h0.this.R1(null);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void r(wc1 wc1Var) {
            h0.this.r.r(wc1Var);
            h0.this.S = null;
            h0.this.e0 = null;
        }

        @Override // defpackage.jj8
        public void s(final c41 c41Var) {
            h0.this.j0 = c41Var;
            h0.this.l.l(27, new r64.a() { // from class: com.google.android.exoplayer2.j0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).s(c41.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            h0.this.B1(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (h0.this.Y) {
                h0.this.R1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (h0.this.Y) {
                h0.this.R1(null);
            }
            h0.this.B1(0, 0);
        }

        @Override // defpackage.v89
        public void t(int i, long j) {
            h0.this.r.t(i, j);
        }

        @Override // defpackage.v89
        public void u(Object obj, long j) {
            h0.this.r.u(obj, j);
            if (h0.this.U == obj) {
                h0.this.l.l(26, new r64.a() { // from class: m72
                    @Override // r64.a
                    public final void invoke(Object obj2) {
                        ((v1.d) obj2).Q();
                    }
                });
            }
        }

        @Override // defpackage.v89
        public void v(t0 t0Var, yc1 yc1Var) {
            h0.this.R = t0Var;
            h0.this.r.v(t0Var, yc1Var);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void w(Exception exc) {
            h0.this.r.w(exc);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void x(int i, long j, long j2) {
            h0.this.r.x(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void y(wc1 wc1Var) {
            h0.this.e0 = wc1Var;
            h0.this.r.y(wc1Var);
        }

        @Override // defpackage.v89
        public void z(long j, int i) {
            h0.this.r.z(j, i);
        }
    }

    private static final class d implements u79, fh0, w1.b {
        private u79 a;
        private fh0 b;
        private u79 c;
        private fh0 d;

        private d() {
        }

        @Override // defpackage.u79
        public void b(long j, long j2, t0 t0Var, MediaFormat mediaFormat) {
            u79 u79Var = this.c;
            if (u79Var != null) {
                u79Var.b(j, j2, t0Var, mediaFormat);
            }
            u79 u79Var2 = this.a;
            if (u79Var2 != null) {
                u79Var2.b(j, j2, t0Var, mediaFormat);
            }
        }

        @Override // defpackage.fh0
        public void e(long j, float[] fArr) {
            fh0 fh0Var = this.d;
            if (fh0Var != null) {
                fh0Var.e(j, fArr);
            }
            fh0 fh0Var2 = this.b;
            if (fh0Var2 != null) {
                fh0Var2.e(j, fArr);
            }
        }

        @Override // defpackage.fh0
        public void i() {
            fh0 fh0Var = this.d;
            if (fh0Var != null) {
                fh0Var.i();
            }
            fh0 fh0Var2 = this.b;
            if (fh0Var2 != null) {
                fh0Var2.i();
            }
        }

        @Override // com.google.android.exoplayer2.w1.b
        public void s(int i, Object obj) {
            if (i == 7) {
                this.a = (u79) obj;
                return;
            }
            if (i == 8) {
                this.b = (fh0) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            zy7 zy7Var = (zy7) obj;
            if (zy7Var == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = zy7Var.getVideoFrameMetadataListener();
                this.d = zy7Var.getCameraMotionListener();
            }
        }
    }

    private static final class e implements c1 {
        private final Object a;
        private g2 b;

        public e(Object obj, g2 g2Var) {
            this.a = obj;
            this.b = g2Var;
        }

        @Override // com.google.android.exoplayer2.c1
        public Object a() {
            return this.a;
        }

        @Override // com.google.android.exoplayer2.c1
        public g2 b() {
            return this.b;
        }
    }

    static {
        n72.a("goog.exo.exoplayer");
    }

    public h0(k kVar, v1 v1Var) {
        pt0 pt0Var = new pt0();
        this.d = pt0Var;
        try {
            a84.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + z19.e + "]");
            Context applicationContext = kVar.a.getApplicationContext();
            this.e = applicationContext;
            nc ncVar = (nc) kVar.i.apply(kVar.b);
            this.r = ncVar;
            this.g0 = kVar.k;
            this.a0 = kVar.q;
            this.b0 = kVar.r;
            this.i0 = kVar.o;
            this.E = kVar.y;
            c cVar = new c();
            this.x = cVar;
            d dVar = new d();
            this.y = dVar;
            Handler handler = new Handler(kVar.j);
            z1[] a2 = ((dx6) kVar.d.get()).a(handler, cVar, cVar, cVar, cVar);
            this.g = a2;
            ur.g(a2.length > 0);
            hq8 hq8Var = (hq8) kVar.f.get();
            this.h = hq8Var;
            this.q = (o.a) kVar.e.get();
            l40 l40Var = (l40) kVar.h.get();
            this.t = l40Var;
            this.p = kVar.s;
            this.L = kVar.t;
            this.u = kVar.u;
            this.v = kVar.v;
            this.N = kVar.z;
            Looper looper = kVar.j;
            this.s = looper;
            vl0 vl0Var = kVar.b;
            this.w = vl0Var;
            v1 v1Var2 = v1Var == null ? this : v1Var;
            this.f = v1Var2;
            this.l = new r64(looper, vl0Var, new r64.b() { // from class: com.google.android.exoplayer2.s
                @Override // r64.b
                public final void a(Object obj, ik2 ik2Var) {
                    h0.this.e1((v1.d) obj, ik2Var);
                }
            });
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.M = new qr7.a(0);
            jq8 jq8Var = new jq8(new cx6[a2.length], new q72[a2.length], h2.b, null);
            this.b = jq8Var;
            this.n = new g2.b();
            v1.b e2 = new v1.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).d(29, hq8Var.g()).d(23, kVar.p).d(25, kVar.p).d(33, kVar.p).d(26, kVar.p).d(34, kVar.p).e();
            this.c = e2;
            this.O = new v1.b.a().b(e2).a(4).a(10).e();
            this.i = vl0Var.b(looper, null);
            s0.f fVar = new s0.f() { // from class: com.google.android.exoplayer2.t
                @Override // com.google.android.exoplayer2.s0.f
                public final void a(s0.e eVar) {
                    h0.this.g1(eVar);
                }
            };
            this.j = fVar;
            this.r0 = t1.k(jq8Var);
            ncVar.K(v1Var2, looper);
            int i = z19.a;
            s0 s0Var = new s0(a2, hq8Var, jq8Var, (u64) kVar.g.get(), l40Var, this.F, this.G, ncVar, this.L, kVar.w, kVar.x, this.N, looper, vl0Var, fVar, i < 31 ? new sv5() : b.a(applicationContext, this, kVar.A), kVar.B);
            this.k = s0Var;
            this.h0 = 1.0f;
            this.F = 0;
            x0 x0Var = x0.h0;
            this.P = x0Var;
            this.Q = x0Var;
            this.q0 = x0Var;
            this.s0 = -1;
            if (i < 21) {
                this.f0 = c1(0);
            } else {
                this.f0 = z19.G(applicationContext);
            }
            this.j0 = c41.c;
            this.k0 = true;
            u(ncVar);
            l40Var.f(new Handler(looper), ncVar);
            G0(cVar);
            long j = kVar.c;
            if (j > 0) {
                s0Var.w(j);
            }
            com.google.android.exoplayer2.b bVar = new com.google.android.exoplayer2.b(kVar.a, handler, cVar);
            this.z = bVar;
            bVar.b(kVar.n);
            com.google.android.exoplayer2.d dVar2 = new com.google.android.exoplayer2.d(kVar.a, handler, cVar);
            this.A = dVar2;
            dVar2.m(kVar.l ? this.g0 : null);
            if (kVar.p) {
                d2 d2Var = new d2(kVar.a, handler, cVar);
                this.B = d2Var;
                d2Var.h(z19.i0(this.g0.c));
            } else {
                this.B = null;
            }
            i2 i2Var = new i2(kVar.a);
            this.C = i2Var;
            i2Var.a(kVar.m != 0);
            j2 j2Var = new j2(kVar.a);
            this.D = j2Var;
            j2Var.a(kVar.m == 2);
            this.o0 = K0(this.B);
            this.p0 = z89.e;
            this.c0 = bu7.c;
            hq8Var.k(this.g0);
            H1(1, 10, Integer.valueOf(this.f0));
            H1(2, 10, Integer.valueOf(this.f0));
            H1(1, 3, this.g0);
            H1(2, 4, Integer.valueOf(this.a0));
            H1(2, 5, Integer.valueOf(this.b0));
            H1(1, 9, Boolean.valueOf(this.i0));
            H1(2, 7, dVar);
            H1(6, 8, dVar);
            pt0Var.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    private Pair A1(g2 g2Var, int i, long j) {
        if (g2Var.v()) {
            this.s0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.u0 = j;
            this.t0 = 0;
            return null;
        }
        if (i == -1 || i >= g2Var.u()) {
            i = g2Var.f(this.G);
            j = g2Var.s(i, this.a).e();
        }
        return g2Var.o(this.a, this.n, i, z19.D0(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1(final int i, final int i2) {
        if (i == this.c0.b() && i2 == this.c0.a()) {
            return;
        }
        this.c0 = new bu7(i, i2);
        this.l.l(24, new r64.a() { // from class: com.google.android.exoplayer2.v
            @Override // r64.a
            public final void invoke(Object obj) {
                ((v1.d) obj).R(i, i2);
            }
        });
        H1(2, 14, new bu7(i, i2));
    }

    private long C1(g2 g2Var, o.b bVar, long j) {
        g2Var.m(bVar.a, this.n);
        return j + this.n.s();
    }

    private void F1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.o.remove(i3);
        }
        this.M = this.M.a(i, i2);
    }

    private void G1() {
        if (this.X != null) {
            M0(this.y).n(Constants.MAXIMUM_UPLOAD_PARTS).m(null).l();
            this.X.i(this.x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.x) {
                a84.j("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.x);
            this.W = null;
        }
    }

    private List H0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            q1.c cVar = new q1.c((com.google.android.exoplayer2.source.o) list.get(i2), this.p);
            arrayList.add(cVar);
            this.o.add(i2 + i, new e(cVar.b, cVar.a.Z()));
        }
        this.M = this.M.g(i, arrayList.size());
        return arrayList;
    }

    private void H1(int i, int i2, Object obj) {
        for (z1 z1Var : this.g) {
            if (z1Var.f() == i) {
                M0(z1Var).n(i2).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x0 I0() {
        g2 m = m();
        if (m.v()) {
            return this.q0;
        }
        return this.q0.c().J(m.s(x(), this.a).c.e).H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1() {
        H1(1, 2, Float.valueOf(this.h0 * this.A.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j K0(d2 d2Var) {
        return new j.b(0).g(d2Var != null ? d2Var.d() : 0).f(d2Var != null ? d2Var.c() : 0).e();
    }

    private g2 L0() {
        return new x1(this.o, this.M);
    }

    private w1 M0(w1.b bVar) {
        int U0 = U0(this.r0);
        s0 s0Var = this.k;
        g2 g2Var = this.r0.a;
        if (U0 == -1) {
            U0 = 0;
        }
        return new w1(s0Var, bVar, g2Var, U0, this.w, s0Var.D());
    }

    private void M1(List list, int i, long j, boolean z) {
        int i2 = i;
        int U0 = U0(this.r0);
        long z2 = z();
        this.H++;
        if (!this.o.isEmpty()) {
            F1(0, this.o.size());
        }
        List H0 = H0(0, list);
        g2 L0 = L0();
        if (!L0.v() && i2 >= L0.u()) {
            throw new IllegalSeekPositionException(L0, i2, j);
        }
        long j2 = j;
        if (z) {
            i2 = L0.f(this.G);
            j2 = -9223372036854775807L;
        } else if (i2 == -1) {
            i2 = U0;
            j2 = z2;
        }
        t1 z1 = z1(this.r0, L0, A1(L0, i2, j2));
        int i3 = z1.e;
        if (i2 != -1 && i3 != 1) {
            i3 = (L0.v() || i2 >= L0.u()) ? 4 : 2;
        }
        t1 h = z1.h(i3);
        this.k.Q0(H0, i2, z19.D0(j2), this.M);
        Z1(h, 0, 1, (this.r0.b.a.equals(h.b.a) || this.r0.a.v()) ? false : true, 4, S0(h), -1, false);
    }

    private Pair N0(t1 t1Var, t1 t1Var2, boolean z, int i, boolean z2, boolean z3) {
        g2 g2Var = t1Var2.a;
        g2 g2Var2 = t1Var.a;
        if (g2Var2.v() && g2Var.v()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (g2Var2.v() != g2Var.v()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (g2Var.s(g2Var.m(t1Var2.b.a, this.n).c, this.a).a.equals(g2Var2.s(g2Var2.m(t1Var.b.a, this.n).c, this.a).a)) {
            return (z && i == 0 && t1Var2.b.d < t1Var.b.d) ? new Pair(Boolean.TRUE, 0) : (z && i == 1 && z3) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i2));
    }

    private void N1(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            B1(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            B1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        R1(surface);
        this.V = surface;
    }

    private long R0(t1 t1Var) {
        if (!t1Var.b.b()) {
            return z19.h1(S0(t1Var));
        }
        t1Var.a.m(t1Var.b.a, this.n);
        if (t1Var.c == -9223372036854775807L) {
            return t1Var.a.s(U0(t1Var), this.a).e();
        }
        return z19.h1(t1Var.c) + this.n.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (z1 z1Var : this.g) {
            if (z1Var.f() == 2) {
                arrayList.add(M0(z1Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.U;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((w1) it2.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z) {
            W1(ExoPlaybackException.j(new ExoTimeoutException(3), ContentMediaFormat.FULL_CONTENT_MOVIE));
        }
    }

    private long S0(t1 t1Var) {
        if (t1Var.a.v()) {
            return z19.D0(this.u0);
        }
        long m = t1Var.o ? t1Var.m() : t1Var.r;
        return t1Var.b.b() ? m : C1(t1Var.a, t1Var.b, m);
    }

    private int U0(t1 t1Var) {
        return t1Var.a.v() ? this.s0 : t1Var.a.m(t1Var.b.a, this.n).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int V0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private void W1(ExoPlaybackException exoPlaybackException) {
        t1 t1Var = this.r0;
        t1 c2 = t1Var.c(t1Var.b);
        c2.p = c2.r;
        c2.q = 0L;
        t1 h = c2.h(1);
        if (exoPlaybackException != null) {
            h = h.f(exoPlaybackException);
        }
        this.H++;
        this.k.i1();
        Z1(h, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    private v1.e X0(long j) {
        w0 w0Var;
        Object obj;
        int i;
        Object obj2;
        int x = x();
        if (this.r0.a.v()) {
            w0Var = null;
            obj = null;
            i = -1;
            obj2 = null;
        } else {
            t1 t1Var = this.r0;
            Object obj3 = t1Var.b.a;
            t1Var.a.m(obj3, this.n);
            i = this.r0.a.g(obj3);
            obj = obj3;
            obj2 = this.r0.a.s(x, this.a).a;
            w0Var = this.a.c;
        }
        long h1 = z19.h1(j);
        long h12 = this.r0.b.b() ? z19.h1(a1(this.r0)) : h1;
        o.b bVar = this.r0.b;
        return new v1.e(obj2, x, w0Var, obj, i, h1, h12, bVar.b, bVar.c);
    }

    private void X1() {
        v1.b bVar = this.O;
        v1.b I = z19.I(this.f, this.c);
        this.O = I;
        if (I.equals(bVar)) {
            return;
        }
        this.l.i(13, new r64.a() { // from class: com.google.android.exoplayer2.y
            @Override // r64.a
            public final void invoke(Object obj) {
                h0.this.k1((v1.d) obj);
            }
        });
    }

    private v1.e Y0(int i, t1 t1Var, int i2) {
        int i3;
        Object obj;
        w0 w0Var;
        Object obj2;
        int i4;
        long j;
        long a1;
        g2.b bVar = new g2.b();
        if (t1Var.a.v()) {
            i3 = i2;
            obj = null;
            w0Var = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = t1Var.b.a;
            t1Var.a.m(obj3, bVar);
            int i5 = bVar.c;
            int g = t1Var.a.g(obj3);
            Object obj4 = t1Var.a.s(i5, this.a).a;
            w0Var = this.a.c;
            obj2 = obj3;
            i4 = g;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (t1Var.b.b()) {
                o.b bVar2 = t1Var.b;
                j = bVar.f(bVar2.b, bVar2.c);
                a1 = a1(t1Var);
            } else {
                j = t1Var.b.e != -1 ? a1(this.r0) : bVar.e + bVar.d;
                a1 = j;
            }
        } else if (t1Var.b.b()) {
            j = t1Var.r;
            a1 = a1(t1Var);
        } else {
            j = bVar.e + t1Var.r;
            a1 = j;
        }
        long h1 = z19.h1(j);
        long h12 = z19.h1(a1);
        o.b bVar3 = t1Var.b;
        return new v1.e(obj, i3, w0Var, obj2, i4, h1, h12, bVar3.b, bVar3.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        t1 t1Var = this.r0;
        if (t1Var.l == z2 && t1Var.m == i3) {
            return;
        }
        this.H++;
        if (t1Var.o) {
            t1Var = t1Var.a();
        }
        t1 e2 = t1Var.e(z2, i3);
        this.k.T0(z2, i3);
        Z1(e2, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    private void Z1(final t1 t1Var, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        t1 t1Var2 = this.r0;
        this.r0 = t1Var;
        boolean equals = t1Var2.a.equals(t1Var.a);
        Pair N0 = N0(t1Var, t1Var2, z, i3, !equals, z2);
        boolean booleanValue = ((Boolean) N0.first).booleanValue();
        final int intValue = ((Integer) N0.second).intValue();
        x0 x0Var = this.P;
        if (booleanValue) {
            r3 = t1Var.a.v() ? null : t1Var.a.s(t1Var.a.m(t1Var.b.a, this.n).c, this.a).c;
            this.q0 = x0.h0;
        }
        if (booleanValue || !t1Var2.j.equals(t1Var.j)) {
            this.q0 = this.q0.c().L(t1Var.j).H();
            x0Var = I0();
        }
        boolean equals2 = x0Var.equals(this.P);
        this.P = x0Var;
        boolean z3 = t1Var2.l != t1Var.l;
        boolean z4 = t1Var2.e != t1Var.e;
        if (z4 || z3) {
            b2();
        }
        boolean z5 = t1Var2.g;
        boolean z6 = t1Var.g;
        boolean z7 = z5 != z6;
        if (z7) {
            a2(z6);
        }
        if (!equals) {
            this.l.i(0, new r64.a() { // from class: com.google.android.exoplayer2.l
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.l1(t1.this, i, (v1.d) obj);
                }
            });
        }
        if (z) {
            final v1.e Y0 = Y0(i3, t1Var2, i4);
            final v1.e X0 = X0(j);
            this.l.i(11, new r64.a() { // from class: com.google.android.exoplayer2.c0
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.m1(i3, Y0, X0, (v1.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.l.i(1, new r64.a() { // from class: com.google.android.exoplayer2.d0
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).k0(w0.this, intValue);
                }
            });
        }
        if (t1Var2.f != t1Var.f) {
            this.l.i(10, new r64.a() { // from class: com.google.android.exoplayer2.e0
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.o1(t1.this, (v1.d) obj);
                }
            });
            if (t1Var.f != null) {
                this.l.i(10, new r64.a() { // from class: com.google.android.exoplayer2.f0
                    @Override // r64.a
                    public final void invoke(Object obj) {
                        h0.p1(t1.this, (v1.d) obj);
                    }
                });
            }
        }
        jq8 jq8Var = t1Var2.i;
        jq8 jq8Var2 = t1Var.i;
        if (jq8Var != jq8Var2) {
            this.h.h(jq8Var2.e);
            this.l.i(2, new r64.a() { // from class: com.google.android.exoplayer2.g0
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.q1(t1.this, (v1.d) obj);
                }
            });
        }
        if (!equals2) {
            final x0 x0Var2 = this.P;
            this.l.i(14, new r64.a() { // from class: com.google.android.exoplayer2.m
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).I(x0.this);
                }
            });
        }
        if (z7) {
            this.l.i(3, new r64.a() { // from class: com.google.android.exoplayer2.n
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.s1(t1.this, (v1.d) obj);
                }
            });
        }
        if (z4 || z3) {
            this.l.i(-1, new r64.a() { // from class: com.google.android.exoplayer2.o
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.t1(t1.this, (v1.d) obj);
                }
            });
        }
        if (z4) {
            this.l.i(4, new r64.a() { // from class: com.google.android.exoplayer2.p
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.u1(t1.this, (v1.d) obj);
                }
            });
        }
        if (z3) {
            this.l.i(5, new r64.a() { // from class: com.google.android.exoplayer2.w
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.v1(t1.this, i2, (v1.d) obj);
                }
            });
        }
        if (t1Var2.m != t1Var.m) {
            this.l.i(6, new r64.a() { // from class: com.google.android.exoplayer2.z
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.w1(t1.this, (v1.d) obj);
                }
            });
        }
        if (t1Var2.n() != t1Var.n()) {
            this.l.i(7, new r64.a() { // from class: com.google.android.exoplayer2.a0
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.x1(t1.this, (v1.d) obj);
                }
            });
        }
        if (!t1Var2.n.equals(t1Var.n)) {
            this.l.i(12, new r64.a() { // from class: com.google.android.exoplayer2.b0
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.y1(t1.this, (v1.d) obj);
                }
            });
        }
        X1();
        this.l.f();
        if (t1Var2.o != t1Var.o) {
            Iterator it2 = this.m.iterator();
            while (it2.hasNext()) {
                ((d72) it2.next()).E(t1Var.o);
            }
        }
    }

    private static long a1(t1 t1Var) {
        g2.d dVar = new g2.d();
        g2.b bVar = new g2.b();
        t1Var.a.m(t1Var.b.a, bVar);
        return t1Var.c == -9223372036854775807L ? t1Var.a.s(bVar.c, dVar).f() : bVar.s() + t1Var.c;
    }

    private void a2(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public void f1(s0.e eVar) {
        long j;
        int i = this.H - eVar.c;
        this.H = i;
        boolean z = true;
        if (eVar.d) {
            this.I = eVar.e;
            this.J = true;
        }
        if (eVar.f) {
            this.K = eVar.g;
        }
        if (i == 0) {
            g2 g2Var = eVar.b.a;
            if (!this.r0.a.v() && g2Var.v()) {
                this.s0 = -1;
                this.u0 = 0L;
                this.t0 = 0;
            }
            if (!g2Var.v()) {
                List K = ((x1) g2Var).K();
                ur.g(K.size() == this.o.size());
                for (int i2 = 0; i2 < K.size(); i2++) {
                    ((e) this.o.get(i2)).b = (g2) K.get(i2);
                }
            }
            long j2 = -9223372036854775807L;
            if (this.J) {
                if (eVar.b.b.equals(this.r0.b) && eVar.b.d == this.r0.r) {
                    z = false;
                }
                if (z) {
                    if (g2Var.v() || eVar.b.b.b()) {
                        j = eVar.b.d;
                    } else {
                        t1 t1Var = eVar.b;
                        j = C1(g2Var, t1Var.b, t1Var.d);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.J = false;
            Z1(eVar.b, 1, this.K, z, this.I, j2, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        int w = w();
        if (w != 1) {
            if (w == 2 || w == 3) {
                this.C.b(p() && !O0());
                this.D.b(p());
                return;
            } else if (w != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private int c1(int i) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.T.getAudioSessionId();
    }

    private void c2() {
        this.d.b();
        if (Thread.currentThread() != n().getThread()) {
            String D = z19.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), n().getThread().getName());
            if (this.k0) {
                throw new IllegalStateException(D);
            }
            a84.k("ExoPlayerImpl", D, this.l0 ? null : new IllegalStateException());
            this.l0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(v1.d dVar, ik2 ik2Var) {
        dVar.f0(this.f, new v1.c(ik2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(final s0.e eVar) {
        this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.x
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.f1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h1(v1.d dVar) {
        dVar.Y(ExoPlaybackException.j(new ExoTimeoutException(1), ContentMediaFormat.FULL_CONTENT_MOVIE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(v1.d dVar) {
        dVar.D(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l1(t1 t1Var, int i, v1.d dVar) {
        dVar.E(t1Var.a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m1(int i, v1.e eVar, v1.e eVar2, v1.d dVar) {
        dVar.U(i);
        dVar.A(eVar, eVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o1(t1 t1Var, v1.d dVar) {
        dVar.S(t1Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p1(t1 t1Var, v1.d dVar) {
        dVar.Y(t1Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q1(t1 t1Var, v1.d dVar) {
        dVar.W(t1Var.i.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s1(t1 t1Var, v1.d dVar) {
        dVar.C(t1Var.g);
        dVar.X(t1Var.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t1(t1 t1Var, v1.d dVar) {
        dVar.j0(t1Var.l, t1Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u1(t1 t1Var, v1.d dVar) {
        dVar.F(t1Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v1(t1 t1Var, int i, v1.d dVar) {
        dVar.o0(t1Var.l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w1(t1 t1Var, v1.d dVar) {
        dVar.B(t1Var.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x1(t1 t1Var, v1.d dVar) {
        dVar.p0(t1Var.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y1(t1 t1Var, v1.d dVar) {
        dVar.m(t1Var.n);
    }

    private t1 z1(t1 t1Var, g2 g2Var, Pair pair) {
        ur.a(g2Var.v() || pair != null);
        g2 g2Var2 = t1Var.a;
        long R0 = R0(t1Var);
        t1 j = t1Var.j(g2Var);
        if (g2Var.v()) {
            o.b l = t1.l();
            long D0 = z19.D0(this.u0);
            t1 c2 = j.d(l, D0, D0, D0, 0L, wp8.d, this.b, ImmutableList.x()).c(l);
            c2.p = c2.r;
            return c2;
        }
        Object obj = j.b.a;
        boolean equals = obj.equals(((Pair) z19.j(pair)).first);
        o.b bVar = !equals ? new o.b(pair.first) : j.b;
        long longValue = ((Long) pair.second).longValue();
        long D02 = z19.D0(R0);
        if (!g2Var2.v()) {
            D02 -= g2Var2.m(obj, this.n).s();
        }
        if (!equals || longValue < D02) {
            ur.g(!bVar.b());
            t1 c3 = j.d(bVar, longValue, longValue, longValue, 0L, !equals ? wp8.d : j.h, !equals ? this.b : j.i, !equals ? ImmutableList.x() : j.j).c(bVar);
            c3.p = longValue;
            return c3;
        }
        if (longValue != D02) {
            ur.g(!bVar.b());
            long max = Math.max(0L, j.q - (longValue - D02));
            long j2 = j.p;
            if (j.k.equals(j.b)) {
                j2 = longValue + max;
            }
            t1 d2 = j.d(bVar, longValue, longValue, longValue, max, j.h, j.i, j.j);
            d2.p = j2;
            return d2;
        }
        int g = g2Var.g(j.k.a);
        if (g != -1 && g2Var.k(g, this.n).c == g2Var.m(bVar.a, this.n).c) {
            return j;
        }
        g2Var.m(bVar.a, this.n);
        long f = bVar.b() ? this.n.f(bVar.b, bVar.c) : this.n.d;
        t1 c4 = j.d(bVar, j.r, j.r, j.d, f - j.r, j.h, j.i, j.j).c(bVar);
        c4.p = f;
        return c4;
    }

    @Override // com.google.android.exoplayer2.e
    public void D(int i, long j, int i2, boolean z) {
        c2();
        ur.a(i >= 0);
        this.r.H();
        g2 g2Var = this.r0.a;
        if (g2Var.v() || i < g2Var.u()) {
            this.H++;
            if (c()) {
                a84.j("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                s0.e eVar = new s0.e(this.r0);
                eVar.b(1);
                this.j.a(eVar);
                return;
            }
            t1 t1Var = this.r0;
            int i3 = t1Var.e;
            if (i3 == 3 || (i3 == 4 && !g2Var.v())) {
                t1Var = this.r0.h(2);
            }
            int x = x();
            t1 z1 = z1(t1Var, g2Var, A1(g2Var, i, j));
            this.k.D0(g2Var, i, z19.D0(j));
            Z1(z1, 0, 1, true, 1, S0(z1), x, z);
        }
    }

    public void D1() {
        c2();
        boolean p = p();
        int p2 = this.A.p(p, 2);
        Y1(p, p2, V0(p, p2));
        t1 t1Var = this.r0;
        if (t1Var.e != 1) {
            return;
        }
        t1 f = t1Var.f(null);
        t1 h = f.h(f.a.v() ? 4 : 2);
        this.H++;
        this.k.k0();
        Z1(h, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public void E1() {
        AudioTrack audioTrack;
        a84.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + z19.e + "] [" + n72.b() + "]");
        c2();
        if (z19.a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.z.b(false);
        d2 d2Var = this.B;
        if (d2Var != null) {
            d2Var.g();
        }
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.k.m0()) {
            this.l.l(10, new r64.a() { // from class: com.google.android.exoplayer2.q
                @Override // r64.a
                public final void invoke(Object obj) {
                    h0.h1((v1.d) obj);
                }
            });
        }
        this.l.j();
        this.i.d(null);
        this.t.h(this.r);
        t1 t1Var = this.r0;
        if (t1Var.o) {
            this.r0 = t1Var.a();
        }
        t1 h = this.r0.h(1);
        this.r0 = h;
        t1 c2 = h.c(h.b);
        this.r0 = c2;
        c2.p = c2.r;
        this.r0.q = 0L;
        this.r.release();
        this.h.i();
        G1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.m0) {
            lh4.a(ur.e(null));
            throw null;
        }
        this.j0 = c41.c;
        this.n0 = true;
    }

    public void F0(ad adVar) {
        this.r.h0((ad) ur.e(adVar));
    }

    public void G0(d72 d72Var) {
        this.m.add(d72Var);
    }

    public void J0() {
        c2();
        G1();
        R1(null);
        B1(0, 0);
    }

    public void J1(com.google.android.exoplayer2.source.o oVar) {
        c2();
        K1(Collections.singletonList(oVar));
    }

    public void K1(List list) {
        c2();
        L1(list, true);
    }

    public void L1(List list, boolean z) {
        c2();
        M1(list, -1, -9223372036854775807L, z);
    }

    public boolean O0() {
        c2();
        return this.r0.o;
    }

    public void O1(boolean z) {
        c2();
        int p = this.A.p(z, w());
        Y1(z, p, V0(z, p));
    }

    public long P0() {
        c2();
        if (!c()) {
            return Q0();
        }
        t1 t1Var = this.r0;
        return t1Var.k.equals(t1Var.b) ? z19.h1(this.r0.p) : getDuration();
    }

    public void P1(final int i) {
        c2();
        if (this.F != i) {
            this.F = i;
            this.k.W0(i);
            this.l.i(8, new r64.a() { // from class: com.google.android.exoplayer2.u
                @Override // r64.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).i0(i);
                }
            });
            X1();
            this.l.f();
        }
    }

    public long Q0() {
        c2();
        if (this.r0.a.v()) {
            return this.u0;
        }
        t1 t1Var = this.r0;
        if (t1Var.k.d != t1Var.b.d) {
            return t1Var.a.s(x(), this.a).g();
        }
        long j = t1Var.p;
        if (this.r0.k.b()) {
            t1 t1Var2 = this.r0;
            g2.b m = t1Var2.a.m(t1Var2.k.a, this.n);
            long j2 = m.j(this.r0.k.b);
            j = j2 == Long.MIN_VALUE ? m.d : j2;
        }
        t1 t1Var3 = this.r0;
        return z19.h1(C1(t1Var3.a, t1Var3.k, j));
    }

    public void S1(SurfaceHolder surfaceHolder) {
        c2();
        if (surfaceHolder == null) {
            J0();
            return;
        }
        G1();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            R1(null);
            B1(0, 0);
        } else {
            R1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            B1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public bq8 T0() {
        c2();
        return new bq8(this.r0.i.c);
    }

    public void T1(SurfaceView surfaceView) {
        c2();
        if (!(surfaceView instanceof zy7)) {
            S1(surfaceView == null ? null : surfaceView.getHolder());
            return;
        }
        G1();
        this.X = (zy7) surfaceView;
        M0(this.y).n(Constants.MAXIMUM_UPLOAD_PARTS).m(this.X).l();
        this.X.d(this.x);
        R1(this.X.getVideoSurface());
        N1(surfaceView.getHolder());
    }

    public void U1(TextureView textureView) {
        c2();
        if (textureView == null) {
            J0();
            return;
        }
        G1();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            a84.j("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            R1(null);
            B1(0, 0);
        } else {
            Q1(surfaceTexture);
            B1(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void V1(float f) {
        c2();
        final float p = z19.p(f, 0.0f, 1.0f);
        if (this.h0 == p) {
            return;
        }
        this.h0 = p;
        I1();
        this.l.l(22, new r64.a() { // from class: com.google.android.exoplayer2.r
            @Override // r64.a
            public final void invoke(Object obj) {
                ((v1.d) obj).Z(p);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException f() {
        c2();
        return this.r0.f;
    }

    public int Z0(int i) {
        c2();
        return this.g[i].f();
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean c() {
        c2();
        return this.r0.b.b();
    }

    @Override // com.google.android.exoplayer2.v1
    public long d() {
        c2();
        return z19.h1(this.r0.q);
    }

    @Override // com.google.android.exoplayer2.v1
    public void e(v1.d dVar) {
        c2();
        this.l.k((v1.d) ur.e(dVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public h2 g() {
        c2();
        return this.r0.i.d;
    }

    @Override // com.google.android.exoplayer2.v1
    public long getDuration() {
        c2();
        if (!c()) {
            return a();
        }
        t1 t1Var = this.r0;
        o.b bVar = t1Var.b;
        t1Var.a.m(bVar.a, this.n);
        return z19.h1(this.n.f(bVar.b, bVar.c));
    }

    @Override // com.google.android.exoplayer2.v1
    public float getVolume() {
        c2();
        return this.h0;
    }

    @Override // com.google.android.exoplayer2.v1
    public int i() {
        c2();
        if (c()) {
            return this.r0.b.b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public int l() {
        c2();
        return this.r0.m;
    }

    @Override // com.google.android.exoplayer2.v1
    public g2 m() {
        c2();
        return this.r0.a;
    }

    @Override // com.google.android.exoplayer2.v1
    public Looper n() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.v1
    public v1.b o() {
        c2();
        return this.O;
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean p() {
        c2();
        return this.r0.l;
    }

    @Override // com.google.android.exoplayer2.v1
    public int q() {
        c2();
        if (this.r0.a.v()) {
            return this.t0;
        }
        t1 t1Var = this.r0;
        return t1Var.a.g(t1Var.b.a);
    }

    @Override // com.google.android.exoplayer2.v1
    public int q0() {
        c2();
        return this.F;
    }

    @Override // com.google.android.exoplayer2.v1
    public int s() {
        c2();
        if (c()) {
            return this.r0.b.c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public long t() {
        c2();
        return R0(this.r0);
    }

    @Override // com.google.android.exoplayer2.v1
    public void u(v1.d dVar) {
        this.l.c((v1.d) ur.e(dVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public int w() {
        c2();
        return this.r0.e;
    }

    @Override // com.google.android.exoplayer2.v1
    public int x() {
        c2();
        int U0 = U0(this.r0);
        if (U0 == -1) {
            return 0;
        }
        return U0;
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean y() {
        c2();
        return this.G;
    }

    @Override // com.google.android.exoplayer2.v1
    public long z() {
        c2();
        return z19.h1(S0(this.r0));
    }
}
