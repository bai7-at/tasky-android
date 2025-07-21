package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.x0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j;
import defpackage.ad;
import defpackage.r64;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class dg1 implements nc {
    private final vl0 a;
    private final g2.b b;
    private final g2.d c;
    private final a d;
    private final SparseArray e;
    private r64 f;
    private v1 g;
    private r63 h;
    private boolean i;

    private static final class a {
        private final g2.b a;
        private ImmutableList b = ImmutableList.x();
        private ImmutableMap c = ImmutableMap.o();
        private o.b d;
        private o.b e;
        private o.b f;

        public a(g2.b bVar) {
            this.a = bVar;
        }

        private void b(ImmutableMap.a aVar, o.b bVar, g2 g2Var) {
            if (bVar == null) {
                return;
            }
            if (g2Var.g(bVar.a) != -1) {
                aVar.f(bVar, g2Var);
                return;
            }
            g2 g2Var2 = (g2) this.c.get(bVar);
            if (g2Var2 != null) {
                aVar.f(bVar, g2Var2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static o.b c(v1 v1Var, ImmutableList immutableList, o.b bVar, g2.b bVar2) {
            g2 m = v1Var.m();
            int q = v1Var.q();
            Object r = m.v() ? null : m.r(q);
            int h = (v1Var.c() || m.v()) ? -1 : m.k(q, bVar2).h(z19.D0(v1Var.z()) - bVar2.s());
            for (int i = 0; i < immutableList.size(); i++) {
                o.b bVar3 = (o.b) immutableList.get(i);
                if (i(bVar3, r, v1Var.c(), v1Var.i(), v1Var.s(), h)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (i(bVar, r, v1Var.c(), v1Var.i(), v1Var.s(), h)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(o.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            if (bVar.a.equals(obj)) {
                return (z && bVar.b == i && bVar.c == i2) || (!z && bVar.b == -1 && bVar.e == i3);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(g2 g2Var) {
            ImmutableMap.a a = ImmutableMap.a();
            if (this.b.isEmpty()) {
                b(a, this.e, g2Var);
                if (!hc5.a(this.f, this.e)) {
                    b(a, this.f, g2Var);
                }
                if (!hc5.a(this.d, this.e) && !hc5.a(this.d, this.f)) {
                    b(a, this.d, g2Var);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    b(a, (o.b) this.b.get(i), g2Var);
                }
                if (!this.b.contains(this.d)) {
                    b(a, this.d, g2Var);
                }
            }
            this.c = a.c();
        }

        public o.b d() {
            return this.d;
        }

        public o.b e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (o.b) j.e(this.b);
        }

        public g2 f(o.b bVar) {
            return (g2) this.c.get(bVar);
        }

        public o.b g() {
            return this.e;
        }

        public o.b h() {
            return this.f;
        }

        public void j(v1 v1Var) {
            this.d = c(v1Var, this.b, this.e, this.a);
        }

        public void k(List list, o.b bVar, v1 v1Var) {
            this.b = ImmutableList.t(list);
            if (!list.isEmpty()) {
                this.e = (o.b) list.get(0);
                this.f = (o.b) ur.e(bVar);
            }
            if (this.d == null) {
                this.d = c(v1Var, this.b, this.e, this.a);
            }
            m(v1Var.m());
        }

        public void l(v1 v1Var) {
            this.d = c(v1Var, this.b, this.e, this.a);
            m(v1Var.m());
        }
    }

    public dg1(vl0 vl0Var) {
        this.a = (vl0) ur.e(vl0Var);
        this.f = new r64(z19.R(), vl0Var, new r64.b() { // from class: re1
            @Override // r64.b
            public final void a(Object obj, ik2 ik2Var) {
                dg1.F1((ad) obj, ik2Var);
            }
        });
        g2.b bVar = new g2.b();
        this.b = bVar;
        this.c = new g2.d();
        this.d = new a(bVar);
        this.e = new SparseArray();
    }

    private ad.a A1() {
        return z1(this.d.e());
    }

    private ad.a B1(int i, o.b bVar) {
        ur.e(this.g);
        if (bVar != null) {
            return this.d.f(bVar) != null ? z1(bVar) : y1(g2.a, i, bVar);
        }
        g2 m = this.g.m();
        if (i >= m.u()) {
            m = g2.a;
        }
        return y1(m, i, null);
    }

    private ad.a C1() {
        return z1(this.d.g());
    }

    private ad.a D1() {
        return z1(this.d.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D2(ad.a aVar, String str, long j, long j2, ad adVar) {
        adVar.A(aVar, str, j);
        adVar.R(aVar, str, j2, j);
    }

    private ad.a E1(PlaybackException playbackException) {
        bl4 bl4Var;
        return (!(playbackException instanceof ExoPlaybackException) || (bl4Var = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? x1() : z1(new o.b(bl4Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1(ad adVar, ik2 ik2Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I1(ad.a aVar, String str, long j, long j2, ad adVar) {
        adVar.V(aVar, str, j);
        adVar.M(aVar, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I2(ad.a aVar, t0 t0Var, yc1 yc1Var, ad adVar) {
        adVar.L(aVar, t0Var);
        adVar.i0(aVar, t0Var, yc1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J2(ad.a aVar, z89 z89Var, ad adVar) {
        adVar.o(aVar, z89Var);
        adVar.p(aVar, z89Var.a, z89Var.b, z89Var.c, z89Var.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M1(ad.a aVar, t0 t0Var, yc1 yc1Var, ad adVar) {
        adVar.I(aVar, t0Var);
        adVar.r(aVar, t0Var, yc1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(v1 v1Var, ad adVar, ik2 ik2Var) {
        adVar.s0(v1Var, new ad.b(ik2Var, this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        final ad.a x1 = x1();
        O2(x1, 1028, new r64.a() { // from class: vf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).k(ad.a.this);
            }
        });
        this.f.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a2(ad.a aVar, int i, ad adVar) {
        adVar.J(aVar);
        adVar.X(aVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e2(ad.a aVar, boolean z, ad adVar) {
        adVar.p0(aVar, z);
        adVar.j0(aVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u2(ad.a aVar, int i, v1.e eVar, v1.e eVar2, ad adVar) {
        adVar.z(aVar, i);
        adVar.C(aVar, eVar, eVar2, i);
    }

    private ad.a z1(o.b bVar) {
        ur.e(this.g);
        g2 f = bVar == null ? null : this.d.f(bVar);
        if (bVar != null && f != null) {
            return y1(f, f.m(bVar.a, this.b).c, bVar);
        }
        int x = this.g.x();
        g2 m = this.g.m();
        if (x >= m.u()) {
            m = g2.a;
        }
        return y1(m, x, null);
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void A(final v1.e eVar, final v1.e eVar2, final int i) {
        if (i == 1) {
            this.i = false;
        }
        this.d.j((v1) ur.e(this.g));
        final ad.a x1 = x1();
        O2(x1, 11, new r64.a() { // from class: hf1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.u2(ad.a.this, i, eVar, eVar2, (ad) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void B(final int i) {
        final ad.a x1 = x1();
        O2(x1, 6, new r64.a() { // from class: cf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).q0(ad.a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void C(boolean z) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void D(final v1.b bVar) {
        final ad.a x1 = x1();
        O2(x1, 13, new r64.a() { // from class: le1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).k0(ad.a.this, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void E(g2 g2Var, final int i) {
        this.d.l((v1) ur.e(this.g));
        final ad.a x1 = x1();
        O2(x1, 0, new r64.a() { // from class: jf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).P(ad.a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void F(final int i) {
        final ad.a x1 = x1();
        O2(x1, 4, new r64.a() { // from class: oe1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).H(ad.a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void G(final com.google.android.exoplayer2.j jVar) {
        final ad.a x1 = x1();
        O2(x1, 29, new r64.a() { // from class: nf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).e0(ad.a.this, jVar);
            }
        });
    }

    @Override // defpackage.nc
    public final void H() {
        if (this.i) {
            return;
        }
        final ad.a x1 = x1();
        this.i = true;
        O2(x1, -1, new r64.a() { // from class: ce1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).K(ad.a.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void I(final x0 x0Var) {
        final ad.a x1 = x1();
        O2(x1, 14, new r64.a() { // from class: xd1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).B(ad.a.this, x0Var);
            }
        });
    }

    @Override // defpackage.nc
    public void K(final v1 v1Var, Looper looper) {
        ur.g(this.g == null || this.d.b.isEmpty());
        this.g = (v1) ur.e(v1Var);
        this.h = this.a.b(looper, null);
        this.f = this.f.e(looper, new r64.b() { // from class: de1
            @Override // r64.b
            public final void a(Object obj, ik2 ik2Var) {
                dg1.this.M2(v1Var, (ad) obj, ik2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void L(int i, o.b bVar) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1026, new r64.a() { // from class: rf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).E(ad.a.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void N(final int i, final boolean z) {
        final ad.a x1 = x1();
        O2(x1, 30, new r64.a() { // from class: of1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).f0(ad.a.this, i, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void O(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1001, new r64.a() { // from class: ae1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).Z(ad.a.this, v64Var, pi4Var);
            }
        });
    }

    protected final void O2(ad.a aVar, int i, r64.a aVar2) {
        this.e.put(i, aVar);
        this.f.l(i, aVar2);
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void P(int i, o.b bVar, final pi4 pi4Var) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1005, new r64.a() { // from class: ff1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).l(ad.a.this, pi4Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void Q() {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void R(final int i, final int i2) {
        final ad.a D1 = D1();
        O2(D1, 24, new r64.a() { // from class: ge1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).m(ad.a.this, i, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void S(final PlaybackException playbackException) {
        final ad.a E1 = E1(playbackException);
        O2(E1, 10, new r64.a() { // from class: af1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).q(ad.a.this, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void T(int i, o.b bVar, final Exception exc) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1024, new r64.a() { // from class: gf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).o0(ad.a.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void U(int i) {
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void V(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, ContentMediaFormat.FULL_CONTENT_EPISODE, new r64.a() { // from class: zf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).y(ad.a.this, v64Var, pi4Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void W(final h2 h2Var) {
        final ad.a x1 = x1();
        O2(x1, 2, new r64.a() { // from class: ye1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).w(ad.a.this, h2Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void X(final boolean z) {
        final ad.a x1 = x1();
        O2(x1, 3, new r64.a() { // from class: xf1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.e2(ad.a.this, z, (ad) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void Y(final PlaybackException playbackException) {
        final ad.a E1 = E1(playbackException);
        O2(E1, 10, new r64.a() { // from class: ie1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).t(ad.a.this, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void Z(final float f) {
        final ad.a D1 = D1();
        O2(D1, 22, new r64.a() { // from class: lf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).a0(ad.a.this, f);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void a(final boolean z) {
        final ad.a D1 = D1();
        O2(D1, 23, new r64.a() { // from class: uf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).f(ad.a.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void a0(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, new r64.a() { // from class: mf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).j(ad.a.this, v64Var, pi4Var);
            }
        });
    }

    @Override // defpackage.nc
    public final void b(final Exception exc) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.FULL_CONTENT_PODCAST, new r64.a() { // from class: df1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).d(ad.a.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void b0(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var, final IOException iOException, final boolean z) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, ContentMediaFormat.FULL_CONTENT_MOVIE, new r64.a() { // from class: he1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).g(ad.a.this, v64Var, pi4Var, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void c(int i, o.b bVar, final pi4 pi4Var) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, ContentMediaFormat.PARTIAL_CONTENT_GENERIC, new r64.a() { // from class: ee1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).d0(ad.a.this, pi4Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void c0(int i, o.b bVar) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1023, new r64.a() { // from class: wf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).a(ad.a.this);
            }
        });
    }

    @Override // defpackage.nc
    public final void d(final String str) {
        final ad.a D1 = D1();
        O2(D1, 1019, new r64.a() { // from class: qf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).U(ad.a.this, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void d0(int i, o.b bVar, final int i2) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1022, new r64.a() { // from class: kf1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.a2(ad.a.this, i2, (ad) obj);
            }
        });
    }

    @Override // defpackage.nc
    public final void e(final String str, final long j, final long j2) {
        final ad.a D1 = D1();
        O2(D1, 1016, new r64.a() { // from class: pe1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.D2(ad.a.this, str, j2, j, (ad) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void e0(int i, o.b bVar) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1027, new r64.a() { // from class: we1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).g0(ad.a.this);
            }
        });
    }

    @Override // defpackage.nc
    public final void f(final String str) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.EXTRA_EPISODE, new r64.a() { // from class: te1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).F(ad.a.this, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void f0(v1 v1Var, v1.c cVar) {
    }

    @Override // defpackage.nc
    public final void g(final String str, final long j, final long j2) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.PREVIEW_EPISODE, new r64.a() { // from class: ud1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.I1(ad.a.this, str, j2, j, (ad) obj);
            }
        });
    }

    @Override // defpackage.nc
    public final void g0(List list, o.b bVar) {
        this.d.k(list, bVar, (v1) ur.e(this.g));
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void h(final Metadata metadata) {
        final ad.a x1 = x1();
        O2(x1, 28, new r64.a() { // from class: pf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).Y(ad.a.this, metadata);
            }
        });
    }

    @Override // defpackage.nc
    public void h0(ad adVar) {
        ur.e(adVar);
        this.f.c(adVar);
    }

    @Override // defpackage.nc
    public final void i(final t0 t0Var, final yc1 yc1Var) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.PREVIEW_MOVIE, new r64.a() { // from class: vd1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.M1(ad.a.this, t0Var, yc1Var, (ad) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void i0(final int i) {
        final ad.a x1 = x1();
        O2(x1, 8, new r64.a() { // from class: ue1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).N(ad.a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void j(final List list) {
        final ad.a x1 = x1();
        O2(x1, 27, new r64.a() { // from class: xe1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).e(ad.a.this, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void j0(final boolean z, final int i) {
        final ad.a x1 = x1();
        O2(x1, -1, new r64.a() { // from class: be1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).T(ad.a.this, z, i);
            }
        });
    }

    @Override // defpackage.nc
    public final void k(final long j) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.EXTRA_GENERIC, new r64.a() { // from class: ve1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).i(ad.a.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void k0(final w0 w0Var, final int i) {
        final ad.a x1 = x1();
        O2(x1, 1, new r64.a() { // from class: je1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).m0(ad.a.this, w0Var, i);
            }
        });
    }

    @Override // defpackage.nc
    public final void l(final Exception exc) {
        final ad.a D1 = D1();
        O2(D1, 1030, new r64.a() { // from class: bg1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).O(ad.a.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.h
    public final void l0(int i, o.b bVar) {
        final ad.a B1 = B1(i, bVar);
        O2(B1, 1025, new r64.a() { // from class: yf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).r0(ad.a.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void m(final u1 u1Var) {
        final ad.a x1 = x1();
        O2(x1, 12, new r64.a() { // from class: zd1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).Q(ad.a.this, u1Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void n(final z89 z89Var) {
        final ad.a D1 = D1();
        O2(D1, 25, new r64.a() { // from class: sf1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.J2(ad.a.this, z89Var, (ad) obj);
            }
        });
    }

    @Override // defpackage.nc
    public final void o(final wc1 wc1Var) {
        final ad.a C1 = C1();
        O2(C1, 1020, new r64.a() { // from class: bf1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).v(ad.a.this, wc1Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public final void o0(final boolean z, final int i) {
        final ad.a x1 = x1();
        O2(x1, 5, new r64.a() { // from class: fe1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).l0(ad.a.this, z, i);
            }
        });
    }

    @Override // defpackage.nc
    public final void p(final wc1 wc1Var) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.PARTIAL_CONTENT_PODCAST, new r64.a() { // from class: ne1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).W(ad.a.this, wc1Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void p0(final boolean z) {
        final ad.a x1 = x1();
        O2(x1, 7, new r64.a() { // from class: ag1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).b(ad.a.this, z);
            }
        });
    }

    @Override // l40.a
    public final void q(final int i, final long j, final long j2) {
        final ad.a A1 = A1();
        O2(A1, ContentMediaFormat.PARTIAL_CONTENT_MOVIE, new r64.a() { // from class: qe1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).c0(ad.a.this, i, j, j2);
            }
        });
    }

    @Override // defpackage.nc
    public final void r(final wc1 wc1Var) {
        final ad.a C1 = C1();
        O2(C1, ContentMediaFormat.EXTRA_MOVIE, new r64.a() { // from class: se1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).n0(ad.a.this, wc1Var);
            }
        });
    }

    @Override // defpackage.nc
    public void release() {
        ((r63) ur.i(this.h)).h(new Runnable() { // from class: yd1
            @Override // java.lang.Runnable
            public final void run() {
                dg1.this.N2();
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void s(final c41 c41Var) {
        final ad.a x1 = x1();
        O2(x1, 27, new r64.a() { // from class: ke1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).x(ad.a.this, c41Var);
            }
        });
    }

    @Override // defpackage.nc
    public final void t(final int i, final long j) {
        final ad.a C1 = C1();
        O2(C1, 1018, new r64.a() { // from class: ze1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).h0(ad.a.this, i, j);
            }
        });
    }

    @Override // defpackage.nc
    public final void u(final Object obj, final long j) {
        final ad.a D1 = D1();
        O2(D1, 26, new r64.a() { // from class: tf1
            @Override // r64.a
            public final void invoke(Object obj2) {
                ((ad) obj2).s(ad.a.this, obj, j);
            }
        });
    }

    @Override // defpackage.nc
    public final void v(final t0 t0Var, final yc1 yc1Var) {
        final ad.a D1 = D1();
        O2(D1, 1017, new r64.a() { // from class: me1
            @Override // r64.a
            public final void invoke(Object obj) {
                dg1.I2(ad.a.this, t0Var, yc1Var, (ad) obj);
            }
        });
    }

    @Override // defpackage.nc
    public final void w(final Exception exc) {
        final ad.a D1 = D1();
        O2(D1, 1029, new r64.a() { // from class: cg1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).c(ad.a.this, exc);
            }
        });
    }

    @Override // defpackage.nc
    public final void x(final int i, final long j, final long j2) {
        final ad.a D1 = D1();
        O2(D1, 1011, new r64.a() { // from class: wd1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).b0(ad.a.this, i, j, j2);
            }
        });
    }

    protected final ad.a x1() {
        return z1(this.d.d());
    }

    @Override // defpackage.nc
    public final void y(final wc1 wc1Var) {
        final ad.a D1 = D1();
        O2(D1, ContentMediaFormat.PREVIEW_GENERIC, new r64.a() { // from class: if1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).S(ad.a.this, wc1Var);
            }
        });
    }

    protected final ad.a y1(g2 g2Var, int i, o.b bVar) {
        long t;
        o.b bVar2 = g2Var.v() ? null : bVar;
        long elapsedRealtime = this.a.elapsedRealtime();
        boolean z = g2Var.equals(this.g.m()) && i == this.g.x();
        long j = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                t = this.g.t();
                return new ad.a(elapsedRealtime, g2Var, i, bVar2, t, this.g.m(), this.g.x(), this.d.d(), this.g.z(), this.g.d());
            }
            if (!g2Var.v()) {
                j = g2Var.s(i, this.c).e();
            }
        } else if (z && this.g.i() == bVar2.b && this.g.s() == bVar2.c) {
            j = this.g.z();
        }
        t = j;
        return new ad.a(elapsedRealtime, g2Var, i, bVar2, t, this.g.m(), this.g.x(), this.d.d(), this.g.z(), this.g.d());
    }

    @Override // defpackage.nc
    public final void z(final long j, final int i) {
        final ad.a C1 = C1();
        O2(C1, 1021, new r64.a() { // from class: ef1
            @Override // r64.a
            public final void invoke(Object obj) {
                ((ad) obj).h(ad.a.this, j, i);
            }
        });
    }
}
