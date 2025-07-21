package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q1;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z1;
import com.google.common.collect.ImmutableList;
import defpackage.a84;
import defpackage.cx6;
import defpackage.fi7;
import defpackage.gc8;
import defpackage.hq8;
import defpackage.jq8;
import defpackage.l40;
import defpackage.lh4;
import defpackage.nc;
import defpackage.q72;
import defpackage.qj8;
import defpackage.qr7;
import defpackage.r63;
import defpackage.sv5;
import defpackage.u64;
import defpackage.ur;
import defpackage.vl0;
import defpackage.wp8;
import defpackage.y77;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class s0 implements Handler.Callback, n.a, hq8.a, q1.d, i.a, w1.a {
    private final long B;
    private fi7 H;
    private t1 L;
    private e M;
    private boolean N;
    private boolean Q;
    private boolean S;
    private boolean X;
    private boolean Y;
    private int Z;
    private final z1[] a;
    private final Set b;
    private final a2[] c;
    private final hq8 d;
    private final jq8 e;
    private boolean e0;
    private final u64 f;
    private boolean f0;
    private final l40 g;
    private boolean g0;
    private final r63 h;
    private boolean h0;
    private final HandlerThread i;
    private int i0;
    private final Looper j;
    private h j0;
    private final g2.d k;
    private long k0;
    private final g2.b l;
    private int l0;
    private final long m;
    private boolean m0;
    private final boolean n;
    private ExoPlaybackException n0;
    private long o0;
    private long p0 = -9223372036854775807L;
    private final i r;
    private final ArrayList s;
    private final vl0 t;
    private final f u;
    private final b1 w;
    private final q1 x;
    private final v0 y;

    class a implements z1.a {
        a() {
        }

        @Override // com.google.android.exoplayer2.z1.a
        public void a() {
            s0.this.g0 = true;
        }

        @Override // com.google.android.exoplayer2.z1.a
        public void b() {
            s0.this.h.i(2);
        }
    }

    private static final class b {
        private final List a;
        private final qr7 b;
        private final int c;
        private final long d;

        /* synthetic */ b(List list, qr7 qr7Var, int i, long j, a aVar) {
            this(list, qr7Var, i, j);
        }

        private b(List list, qr7 qr7Var, int i, long j) {
            this.a = list;
            this.b = qr7Var;
            this.c = i;
            this.d = j;
        }
    }

    private static class c {
    }

    private static final class d implements Comparable {
        public final w1 a;
        public int b;
        public long c;
        public Object d;

        public d(w1 w1Var) {
            this.a = w1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - dVar.b;
            return i != 0 ? i : z19.o(this.c, dVar.c);
        }

        public void b(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }
    }

    public static final class e {
        private boolean a;
        public t1 b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(t1 t1Var) {
            this.b = t1Var;
        }

        public void b(int i) {
            this.a |= i > 0;
            this.c += i;
        }

        public void c(int i) {
            this.a = true;
            this.f = true;
            this.g = i;
        }

        public void d(t1 t1Var) {
            this.a |= this.b != t1Var;
            this.b = t1Var;
        }

        public void e(int i) {
            if (this.d && this.e != 5) {
                ur.a(i == 5);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = i;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {
        public final o.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(o.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    private static final class h {
        public final g2 a;
        public final int b;
        public final long c;

        public h(g2 g2Var, int i, long j) {
            this.a = g2Var;
            this.b = i;
            this.c = j;
        }
    }

    public s0(z1[] z1VarArr, hq8 hq8Var, jq8 jq8Var, u64 u64Var, l40 l40Var, int i, boolean z, nc ncVar, fi7 fi7Var, v0 v0Var, long j, boolean z2, Looper looper, vl0 vl0Var, f fVar, sv5 sv5Var, Looper looper2) {
        this.u = fVar;
        this.a = z1VarArr;
        this.d = hq8Var;
        this.e = jq8Var;
        this.f = u64Var;
        this.g = l40Var;
        this.Z = i;
        this.e0 = z;
        this.H = fi7Var;
        this.y = v0Var;
        this.B = j;
        this.o0 = j;
        this.Q = z2;
        this.t = vl0Var;
        this.m = u64Var.i();
        this.n = u64Var.g();
        t1 k = t1.k(jq8Var);
        this.L = k;
        this.M = new e(k);
        this.c = new a2[z1VarArr.length];
        a2.a c2 = hq8Var.c();
        for (int i2 = 0; i2 < z1VarArr.length; i2++) {
            z1VarArr[i2].B(i2, sv5Var);
            this.c[i2] = z1VarArr[i2].x();
            if (c2 != null) {
                this.c[i2].H(c2);
            }
        }
        this.r = new i(this, vl0Var);
        this.s = new ArrayList();
        this.b = com.google.common.collect.s.h();
        this.k = new g2.d();
        this.l = new g2.b();
        hq8Var.d(this, l40Var);
        this.m0 = true;
        r63 b2 = vl0Var.b(looper, null);
        this.w = new b1(ncVar, b2);
        this.x = new q1(this, ncVar, b2, sv5Var);
        if (looper2 != null) {
            this.i = null;
            this.j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.i = handlerThread;
            handlerThread.start();
            this.j = handlerThread.getLooper();
        }
        this.h = vl0Var.b(this.j, this);
    }

    private long A(g2 g2Var, Object obj, long j) {
        g2Var.s(g2Var.m(obj, this.l).c, this.k);
        g2.d dVar = this.k;
        if (dVar.f != -9223372036854775807L && dVar.i()) {
            g2.d dVar2 = this.k;
            if (dVar2.i) {
                return z19.D0(dVar2.d() - this.k.f) - (j + this.l.s());
            }
        }
        return -9223372036854775807L;
    }

    private static Pair A0(g2 g2Var, h hVar, boolean z, int i, boolean z2, g2.d dVar, g2.b bVar) {
        Pair o;
        Object B0;
        g2 g2Var2 = hVar.a;
        if (g2Var.v()) {
            return null;
        }
        g2 g2Var3 = g2Var2.v() ? g2Var : g2Var2;
        try {
            o = g2Var3.o(dVar, bVar, hVar.b, hVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g2Var.equals(g2Var3)) {
            return o;
        }
        if (g2Var.g(o.first) != -1) {
            return (g2Var3.m(o.first, bVar).f && g2Var3.s(bVar.c, dVar).r == g2Var3.g(o.first)) ? g2Var.o(dVar, bVar, g2Var.m(o.first, bVar).c, hVar.c) : o;
        }
        if (z && (B0 = B0(dVar, bVar, i, z2, o.first, g2Var3, g2Var)) != null) {
            return g2Var.o(dVar, bVar, g2Var.m(B0, bVar).c, -9223372036854775807L);
        }
        return null;
    }

    private long B() {
        y0 s = this.w.s();
        if (s == null) {
            return 0L;
        }
        long l = s.l();
        if (!s.d) {
            return l;
        }
        int i = 0;
        while (true) {
            z1[] z1VarArr = this.a;
            if (i >= z1VarArr.length) {
                return l;
            }
            if (S(z1VarArr[i]) && this.a[i].h() == s.c[i]) {
                long E = this.a[i].E();
                if (E == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(E, l);
            }
            i++;
        }
    }

    static Object B0(g2.d dVar, g2.b bVar, int i, boolean z, Object obj, g2 g2Var, g2 g2Var2) {
        int g2 = g2Var.g(obj);
        int n = g2Var.n();
        int i2 = g2;
        int i3 = -1;
        for (int i4 = 0; i4 < n && i3 == -1; i4++) {
            i2 = g2Var.i(i2, bVar, dVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = g2Var2.g(g2Var.r(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return g2Var2.r(i3);
    }

    private Pair C(g2 g2Var) {
        if (g2Var.v()) {
            return Pair.create(t1.l(), 0L);
        }
        Pair o = g2Var.o(this.k, this.l, g2Var.f(this.e0), -9223372036854775807L);
        o.b F = this.w.F(g2Var, o.first, 0L);
        long longValue = ((Long) o.second).longValue();
        if (F.b()) {
            g2Var.m(F.a, this.l);
            longValue = F.c == this.l.p(F.b) ? this.l.k() : 0L;
        }
        return Pair.create(F, Long.valueOf(longValue));
    }

    private void C0(long j, long j2) {
        this.h.j(2, j + j2);
    }

    private long E() {
        return F(this.L.p);
    }

    private void E0(boolean z) {
        o.b bVar = this.w.r().f.a;
        long H0 = H0(bVar, this.L.r, true, false);
        if (H0 != this.L.r) {
            t1 t1Var = this.L;
            this.L = N(bVar, H0, t1Var.c, t1Var.d, z, 5);
        }
    }

    private long F(long j) {
        y0 l = this.w.l();
        if (l == null) {
            return 0L;
        }
        return Math.max(0L, j - l.y(this.k0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b6, B:17:0x00bc, B:18:0x00bf, B:19:0x00c5, B:21:0x00cf, B:23:0x00d7, B:27:0x00df, B:28:0x00e9, B:30:0x00f9, B:34:0x0103, B:37:0x0115, B:40:0x011e), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F0(com.google.android.exoplayer2.s0.h r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.F0(com.google.android.exoplayer2.s0$h):void");
    }

    private void G(com.google.android.exoplayer2.source.n nVar) {
        if (this.w.y(nVar)) {
            this.w.C(this.k0);
            X();
        }
    }

    private long G0(o.b bVar, long j, boolean z) {
        return H0(bVar, j, this.w.r() != this.w.s(), z);
    }

    private void H(IOException iOException, int i) {
        ExoPlaybackException h2 = ExoPlaybackException.h(iOException, i);
        y0 r = this.w.r();
        if (r != null) {
            h2 = h2.f(r.f.a);
        }
        a84.e("ExoPlayerImplInternal", "Playback error", h2);
        j1(false, false);
        this.L = this.L.f(h2);
    }

    private long H0(o.b bVar, long j, boolean z, boolean z2) {
        k1();
        this.X = false;
        if (z2 || this.L.e == 3) {
            b1(2);
        }
        y0 r = this.w.r();
        y0 y0Var = r;
        while (y0Var != null && !bVar.equals(y0Var.f.a)) {
            y0Var = y0Var.j();
        }
        if (z || r != y0Var || (y0Var != null && y0Var.z(j) < 0)) {
            for (z1 z1Var : this.a) {
                q(z1Var);
            }
            if (y0Var != null) {
                while (this.w.r() != y0Var) {
                    this.w.b();
                }
                this.w.D(y0Var);
                y0Var.x(1000000000000L);
                t();
            }
        }
        if (y0Var != null) {
            this.w.D(y0Var);
            if (!y0Var.d) {
                y0Var.f = y0Var.f.b(j);
            } else if (y0Var.e) {
                j = y0Var.a.l(j);
                y0Var.a.u(j - this.m, this.n);
            }
            v0(j);
            X();
        } else {
            this.w.f();
            v0(j);
        }
        I(false);
        this.h.i(2);
        return j;
    }

    private void I(boolean z) {
        y0 l = this.w.l();
        o.b bVar = l == null ? this.L.b : l.f.a;
        boolean equals = this.L.k.equals(bVar);
        if (!equals) {
            this.L = this.L.c(bVar);
        }
        t1 t1Var = this.L;
        t1Var.p = l == null ? t1Var.r : l.i();
        this.L.q = E();
        if ((!equals || z) && l != null && l.d) {
            m1(l.f.a, l.n(), l.o());
        }
    }

    private void I0(w1 w1Var) {
        if (w1Var.f() == -9223372036854775807L) {
            J0(w1Var);
            return;
        }
        if (this.L.a.v()) {
            this.s.add(new d(w1Var));
            return;
        }
        d dVar = new d(w1Var);
        g2 g2Var = this.L.a;
        if (!x0(dVar, g2Var, g2Var, this.Z, this.e0, this.k, this.l)) {
            w1Var.k(false);
        } else {
            this.s.add(dVar);
            Collections.sort(this.s);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x007c: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:110:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J(com.google.android.exoplayer2.g2 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.J(com.google.android.exoplayer2.g2, boolean):void");
    }

    private void J0(w1 w1Var) {
        if (w1Var.c() != this.j) {
            this.h.c(15, w1Var).a();
            return;
        }
        p(w1Var);
        int i = this.L.e;
        if (i == 3 || i == 2) {
            this.h.i(2);
        }
    }

    private void K(com.google.android.exoplayer2.source.n nVar) {
        if (this.w.y(nVar)) {
            y0 l = this.w.l();
            l.p(this.r.e().a, this.L.a);
            m1(l.f.a, l.n(), l.o());
            if (l == this.w.r()) {
                v0(l.f.b);
                t();
                t1 t1Var = this.L;
                o.b bVar = t1Var.b;
                long j = l.f.b;
                this.L = N(bVar, j, t1Var.c, j, false, 5);
            }
            X();
        }
    }

    private void K0(final w1 w1Var) {
        Looper c2 = w1Var.c();
        if (c2.getThread().isAlive()) {
            this.t.b(c2, null).h(new Runnable() { // from class: com.google.android.exoplayer2.r0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.this.W(w1Var);
                }
            });
        } else {
            a84.j("TAG", "Trying to send message on a dead thread.");
            w1Var.k(false);
        }
    }

    private void L(u1 u1Var, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.M.b(1);
            }
            this.L = this.L.g(u1Var);
        }
        q1(u1Var.a);
        for (z1 z1Var : this.a) {
            if (z1Var != null) {
                z1Var.A(f2, u1Var.a);
            }
        }
    }

    private void L0(long j) {
        for (z1 z1Var : this.a) {
            if (z1Var.h() != null) {
                M0(z1Var, j);
            }
        }
    }

    private void M(u1 u1Var, boolean z) {
        L(u1Var, u1Var.a, true, z);
    }

    private void M0(z1 z1Var, long j) {
        z1Var.m();
        if (z1Var instanceof qj8) {
            ((qj8) z1Var).n0(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    private t1 N(o.b bVar, long j, long j2, long j3, boolean z, int i) {
        ImmutableList immutableList;
        wp8 wp8Var;
        jq8 jq8Var;
        this.m0 = (!this.m0 && j == this.L.r && bVar.equals(this.L.b)) ? false : true;
        u0();
        t1 t1Var = this.L;
        wp8 wp8Var2 = t1Var.h;
        jq8 jq8Var2 = t1Var.i;
        ?? r2 = t1Var.j;
        if (this.x.t()) {
            y0 r = this.w.r();
            wp8 n = r == null ? wp8.d : r.n();
            jq8 o = r == null ? this.e : r.o();
            ImmutableList x = x(o.c);
            if (r != null) {
                z0 z0Var = r.f;
                if (z0Var.c != j2) {
                    r.f = z0Var.a(j2);
                }
            }
            wp8Var = n;
            jq8Var = o;
            immutableList = x;
        } else if (bVar.equals(this.L.b)) {
            immutableList = r2;
            wp8Var = wp8Var2;
            jq8Var = jq8Var2;
        } else {
            wp8Var = wp8.d;
            jq8Var = this.e;
            immutableList = ImmutableList.x();
        }
        if (z) {
            this.M.e(i);
        }
        return this.L.d(bVar, j, j2, j3, E(), wp8Var, jq8Var, immutableList);
    }

    private void N0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f0 != z) {
            this.f0 = z;
            if (!z) {
                for (z1 z1Var : this.a) {
                    if (!S(z1Var) && this.b.remove(z1Var)) {
                        z1Var.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private boolean O(z1 z1Var, y0 y0Var) {
        y0 j = y0Var.j();
        return y0Var.f.f && j.d && ((z1Var instanceof qj8) || (z1Var instanceof com.google.android.exoplayer2.metadata.a) || z1Var.E() >= j.m());
    }

    private void O0(u1 u1Var) {
        this.h.k(16);
        this.r.i(u1Var);
    }

    private boolean P() {
        y0 s = this.w.s();
        if (!s.d) {
            return false;
        }
        int i = 0;
        while (true) {
            z1[] z1VarArr = this.a;
            if (i >= z1VarArr.length) {
                return true;
            }
            z1 z1Var = z1VarArr[i];
            y77 y77Var = s.c[i];
            if (z1Var.h() != y77Var || (y77Var != null && !z1Var.k() && !O(z1Var, s))) {
                break;
            }
            i++;
        }
        return false;
    }

    private void P0(b bVar) {
        this.M.b(1);
        if (bVar.c != -1) {
            this.j0 = new h(new x1(bVar.a, bVar.b), bVar.c, bVar.d);
        }
        J(this.x.C(bVar.a, bVar.b), false);
    }

    private static boolean Q(boolean z, o.b bVar, long j, o.b bVar2, g2.b bVar3, long j2) {
        if (!z && j == j2 && bVar.a.equals(bVar2.a)) {
            return (bVar.b() && bVar3.w(bVar.b)) ? (bVar3.l(bVar.b, bVar.c) == 4 || bVar3.l(bVar.b, bVar.c) == 2) ? false : true : bVar2.b() && bVar3.w(bVar2.b);
        }
        return false;
    }

    private boolean R() {
        y0 l = this.w.l();
        return (l == null || l.k() == Long.MIN_VALUE) ? false : true;
    }

    private void R0(boolean z) {
        if (z == this.h0) {
            return;
        }
        this.h0 = z;
        if (z || !this.L.o) {
            return;
        }
        this.h.i(2);
    }

    private static boolean S(z1 z1Var) {
        return z1Var.getState() != 0;
    }

    private void S0(boolean z) {
        this.Q = z;
        u0();
        if (!this.S || this.w.s() == this.w.r()) {
            return;
        }
        E0(true);
        I(false);
    }

    private boolean T() {
        y0 r = this.w.r();
        long j = r.f.e;
        return r.d && (j == -9223372036854775807L || this.L.r < j || !e1());
    }

    private static boolean U(t1 t1Var, g2.b bVar) {
        o.b bVar2 = t1Var.b;
        g2 g2Var = t1Var.a;
        return g2Var.v() || g2Var.m(bVar2.a, bVar).f;
    }

    private void U0(boolean z, int i, boolean z2, int i2) {
        this.M.b(z2 ? 1 : 0);
        this.M.c(i2);
        this.L = this.L.e(z, i);
        this.X = false;
        h0(z);
        if (!e1()) {
            k1();
            o1();
            return;
        }
        int i3 = this.L.e;
        if (i3 == 3) {
            h1();
            this.h.i(2);
        } else if (i3 == 2) {
            this.h.i(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean V() {
        return Boolean.valueOf(this.N);
    }

    private void V0(u1 u1Var) {
        O0(u1Var);
        M(this.r.e(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(w1 w1Var) {
        try {
            p(w1Var);
        } catch (ExoPlaybackException e2) {
            a84.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void X() {
        boolean d1 = d1();
        this.Y = d1;
        if (d1) {
            this.w.l().d(this.k0);
        }
        l1();
    }

    private void X0(int i) {
        this.Z = i;
        if (!this.w.K(this.L.a, i)) {
            E0(true);
        }
        I(false);
    }

    private void Y() {
        this.M.d(this.L);
        if (this.M.a) {
            this.u.a(this.M);
            this.M = new e(this.L);
        }
    }

    private void Y0(fi7 fi7Var) {
        this.H = fi7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Z(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.Z(long, long):void");
    }

    private void Z0(boolean z) {
        this.e0 = z;
        if (!this.w.L(this.L.a, z)) {
            E0(true);
        }
        I(false);
    }

    private void a0() {
        z0 q;
        this.w.C(this.k0);
        if (this.w.H() && (q = this.w.q(this.k0, this.L)) != null) {
            y0 g2 = this.w.g(this.c, this.d, this.f.j(), this.x, q, this.e);
            g2.a.n(this, q.b);
            if (this.w.r() == g2) {
                v0(q.b);
            }
            I(false);
        }
        if (!this.Y) {
            X();
        } else {
            this.Y = R();
            l1();
        }
    }

    private void a1(qr7 qr7Var) {
        this.M.b(1);
        J(this.x.D(qr7Var), false);
    }

    private void b0() {
        boolean z;
        boolean z2 = false;
        while (c1()) {
            if (z2) {
                Y();
            }
            y0 y0Var = (y0) ur.e(this.w.b());
            if (this.L.b.a.equals(y0Var.f.a.a)) {
                o.b bVar = this.L.b;
                if (bVar.b == -1) {
                    o.b bVar2 = y0Var.f.a;
                    if (bVar2.b == -1 && bVar.e != bVar2.e) {
                        z = true;
                        z0 z0Var = y0Var.f;
                        o.b bVar3 = z0Var.a;
                        long j = z0Var.b;
                        this.L = N(bVar3, j, z0Var.c, j, !z, 0);
                        u0();
                        o1();
                        z2 = true;
                    }
                }
            }
            z = false;
            z0 z0Var2 = y0Var.f;
            o.b bVar32 = z0Var2.a;
            long j2 = z0Var2.b;
            this.L = N(bVar32, j2, z0Var2.c, j2, !z, 0);
            u0();
            o1();
            z2 = true;
        }
    }

    private void b1(int i) {
        t1 t1Var = this.L;
        if (t1Var.e != i) {
            if (i != 2) {
                this.p0 = -9223372036854775807L;
            }
            this.L = t1Var.h(i);
        }
    }

    private void c0() {
        y0 s = this.w.s();
        if (s == null) {
            return;
        }
        int i = 0;
        if (s.j() != null && !this.S) {
            if (P()) {
                if (s.j().d || this.k0 >= s.j().m()) {
                    jq8 o = s.o();
                    y0 c2 = this.w.c();
                    jq8 o2 = c2.o();
                    g2 g2Var = this.L.a;
                    p1(g2Var, c2.f.a, g2Var, s.f.a, -9223372036854775807L, false);
                    if (c2.d && c2.a.m() != -9223372036854775807L) {
                        L0(c2.m());
                        return;
                    }
                    for (int i2 = 0; i2 < this.a.length; i2++) {
                        boolean c3 = o.c(i2);
                        boolean c4 = o2.c(i2);
                        if (c3 && !this.a[i2].v()) {
                            boolean z = this.c[i2].f() == -2;
                            cx6 cx6Var = o.b[i2];
                            cx6 cx6Var2 = o2.b[i2];
                            if (!c4 || !cx6Var2.equals(cx6Var) || z) {
                                M0(this.a[i2], c2.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!s.f.i && !this.S) {
            return;
        }
        while (true) {
            z1[] z1VarArr = this.a;
            if (i >= z1VarArr.length) {
                return;
            }
            z1 z1Var = z1VarArr[i];
            y77 y77Var = s.c[i];
            if (y77Var != null && z1Var.h() == y77Var && z1Var.k()) {
                long j = s.f.e;
                M0(z1Var, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : s.l() + s.f.e);
            }
            i++;
        }
    }

    private boolean c1() {
        y0 r;
        y0 j;
        return e1() && !this.S && (r = this.w.r()) != null && (j = r.j()) != null && this.k0 >= j.m() && j.g;
    }

    private void d0() {
        y0 s = this.w.s();
        if (s == null || this.w.r() == s || s.g || !q0()) {
            return;
        }
        t();
    }

    private boolean d1() {
        if (!R()) {
            return false;
        }
        y0 l = this.w.l();
        long F = F(l.k());
        long y = l == this.w.r() ? l.y(this.k0) : l.y(this.k0) - l.f.b;
        boolean m = this.f.m(y, F, this.r.e().a);
        if (m || F >= 500000) {
            return m;
        }
        if (this.m <= 0 && !this.n) {
            return m;
        }
        this.w.r().a.u(this.L.r, false);
        return this.f.m(y, F, this.r.e().a);
    }

    private void e0() {
        J(this.x.i(), true);
    }

    private boolean e1() {
        t1 t1Var = this.L;
        return t1Var.l && t1Var.m == 0;
    }

    private void f0(c cVar) {
        this.M.b(1);
        throw null;
    }

    private boolean f1(boolean z) {
        if (this.i0 == 0) {
            return T();
        }
        if (!z) {
            return false;
        }
        if (!this.L.g) {
            return true;
        }
        y0 r = this.w.r();
        long c2 = g1(this.L.a, r.f.a) ? this.y.c() : -9223372036854775807L;
        y0 l = this.w.l();
        return (l.q() && l.f.i) || (l.f.a.b() && !l.d) || this.f.k(this.L.a, r.f.a, E(), this.r.e().a, this.X, c2);
    }

    private void g0() {
        for (y0 r = this.w.r(); r != null; r = r.j()) {
            for (q72 q72Var : r.o().c) {
                if (q72Var != null) {
                    q72Var.k();
                }
            }
        }
    }

    private boolean g1(g2 g2Var, o.b bVar) {
        if (bVar.b() || g2Var.v()) {
            return false;
        }
        g2Var.s(g2Var.m(bVar.a, this.l).c, this.k);
        if (!this.k.i()) {
            return false;
        }
        g2.d dVar = this.k;
        return dVar.i && dVar.f != -9223372036854775807L;
    }

    private void h0(boolean z) {
        for (y0 r = this.w.r(); r != null; r = r.j()) {
            for (q72 q72Var : r.o().c) {
                if (q72Var != null) {
                    q72Var.o(z);
                }
            }
        }
    }

    private void h1() {
        this.X = false;
        this.r.f();
        for (z1 z1Var : this.a) {
            if (S(z1Var)) {
                z1Var.start();
            }
        }
    }

    private void i0() {
        for (y0 r = this.w.r(); r != null; r = r.j()) {
            for (q72 q72Var : r.o().c) {
                if (q72Var != null) {
                    q72Var.u();
                }
            }
        }
    }

    private void j1(boolean z, boolean z2) {
        t0(z || !this.f0, false, true, false);
        this.M.b(z2 ? 1 : 0);
        this.f.f();
        b1(1);
    }

    private void k1() {
        this.r.g();
        for (z1 z1Var : this.a) {
            if (S(z1Var)) {
                v(z1Var);
            }
        }
    }

    private void l(b bVar, int i) {
        this.M.b(1);
        q1 q1Var = this.x;
        if (i == -1) {
            i = q1Var.r();
        }
        J(q1Var.f(i, bVar.a, bVar.b), false);
    }

    private void l0() {
        this.M.b(1);
        t0(false, false, false, true);
        this.f.e();
        b1(this.L.a.v() ? 4 : 2);
        this.x.w(this.g.c());
        this.h.i(2);
    }

    private void l1() {
        y0 l = this.w.l();
        boolean z = this.Y || (l != null && l.a.b());
        t1 t1Var = this.L;
        if (z != t1Var.g) {
            this.L = t1Var.b(z);
        }
    }

    private void m1(o.b bVar, wp8 wp8Var, jq8 jq8Var) {
        this.f.h(this.L.a, bVar, this.a, wp8Var, jq8Var.c);
    }

    private void n() {
        s0();
    }

    private void n0() {
        t0(true, false, true, false);
        o0();
        this.f.l();
        b1(1);
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.N = true;
            notifyAll();
        }
    }

    private void n1() {
        if (this.L.a.v() || !this.x.t()) {
            return;
        }
        a0();
        c0();
        d0();
        b0();
    }

    private void o0() {
        for (int i = 0; i < this.a.length; i++) {
            this.c[i].j();
            this.a[i].release();
        }
    }

    private void o1() {
        y0 r = this.w.r();
        if (r == null) {
            return;
        }
        long m = r.d ? r.a.m() : -9223372036854775807L;
        if (m != -9223372036854775807L) {
            v0(m);
            if (m != this.L.r) {
                t1 t1Var = this.L;
                this.L = N(t1Var.b, m, t1Var.c, m, true, 5);
            }
        } else {
            long h2 = this.r.h(r != this.w.s());
            this.k0 = h2;
            long y = r.y(h2);
            Z(this.L.r, y);
            this.L.o(y);
        }
        this.L.p = this.w.l().i();
        this.L.q = E();
        t1 t1Var2 = this.L;
        if (t1Var2.l && t1Var2.e == 3 && g1(t1Var2.a, t1Var2.b) && this.L.n.a == 1.0f) {
            float b2 = this.y.b(y(), E());
            if (this.r.e().a != b2) {
                O0(this.L.n.e(b2));
                L(this.L.n, this.r.e().a, false, false);
            }
        }
    }

    private void p(w1 w1Var) {
        if (w1Var.j()) {
            return;
        }
        try {
            w1Var.g().s(w1Var.i(), w1Var.e());
        } finally {
            w1Var.k(true);
        }
    }

    private void p0(int i, int i2, qr7 qr7Var) {
        this.M.b(1);
        J(this.x.A(i, i2, qr7Var), false);
    }

    private void p1(g2 g2Var, o.b bVar, g2 g2Var2, o.b bVar2, long j, boolean z) {
        if (!g1(g2Var, bVar)) {
            u1 u1Var = bVar.b() ? u1.d : this.L.n;
            if (this.r.e().equals(u1Var)) {
                return;
            }
            O0(u1Var);
            L(this.L.n, u1Var.a, false, false);
            return;
        }
        g2Var.s(g2Var.m(bVar.a, this.l).c, this.k);
        this.y.a((w0.g) z19.j(this.k.k));
        if (j != -9223372036854775807L) {
            this.y.e(A(g2Var, bVar.a, j));
            return;
        }
        if (!z19.c(!g2Var2.v() ? g2Var2.s(g2Var2.m(bVar2.a, this.l).c, this.k).a : null, this.k.a) || z) {
            this.y.e(-9223372036854775807L);
        }
    }

    private void q(z1 z1Var) {
        if (S(z1Var)) {
            this.r.a(z1Var);
            v(z1Var);
            z1Var.c();
            this.i0--;
        }
    }

    private boolean q0() {
        y0 s = this.w.s();
        jq8 o = s.o();
        int i = 0;
        boolean z = false;
        while (true) {
            z1[] z1VarArr = this.a;
            if (i >= z1VarArr.length) {
                return !z;
            }
            z1 z1Var = z1VarArr[i];
            if (S(z1Var)) {
                boolean z2 = z1Var.h() != s.c[i];
                if (!o.c(i) || z2) {
                    if (!z1Var.v()) {
                        z1Var.t(z(o.c[i]), s.c[i], s.m(), s.l());
                    } else if (z1Var.d()) {
                        q(z1Var);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void q1(float f2) {
        for (y0 r = this.w.r(); r != null; r = r.j()) {
            for (q72 q72Var : r.o().c) {
                if (q72Var != null) {
                    q72Var.i(f2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.r():void");
    }

    private void r0() {
        float f2 = this.r.e().a;
        y0 s = this.w.s();
        boolean z = true;
        for (y0 r = this.w.r(); r != null && r.d; r = r.j()) {
            jq8 v = r.v(f2, this.L.a);
            if (!v.a(r.o())) {
                if (z) {
                    y0 r2 = this.w.r();
                    boolean D = this.w.D(r2);
                    boolean[] zArr = new boolean[this.a.length];
                    long b2 = r2.b(v, this.L.r, D, zArr);
                    t1 t1Var = this.L;
                    boolean z2 = (t1Var.e == 4 || b2 == t1Var.r) ? false : true;
                    t1 t1Var2 = this.L;
                    this.L = N(t1Var2.b, b2, t1Var2.c, t1Var2.d, z2, 5);
                    if (z2) {
                        v0(b2);
                    }
                    boolean[] zArr2 = new boolean[this.a.length];
                    int i = 0;
                    while (true) {
                        z1[] z1VarArr = this.a;
                        if (i >= z1VarArr.length) {
                            break;
                        }
                        z1 z1Var = z1VarArr[i];
                        boolean S = S(z1Var);
                        zArr2[i] = S;
                        y77 y77Var = r2.c[i];
                        if (S) {
                            if (y77Var != z1Var.h()) {
                                q(z1Var);
                            } else if (zArr[i]) {
                                z1Var.F(this.k0);
                            }
                        }
                        i++;
                    }
                    u(zArr2);
                } else {
                    this.w.D(r);
                    if (r.d) {
                        r.a(v, Math.max(r.f.b, r.y(this.k0)), false);
                    }
                }
                I(true);
                if (this.L.e != 4) {
                    X();
                    o1();
                    this.h.i(2);
                    return;
                }
                return;
            }
            if (r == s) {
                z = false;
            }
        }
    }

    private synchronized void r1(gc8 gc8Var, long j) {
        long elapsedRealtime = this.t.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) gc8Var.get()).booleanValue() && j > 0) {
            try {
                this.t.c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.t.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private void s(int i, boolean z) {
        z1 z1Var = this.a[i];
        if (S(z1Var)) {
            return;
        }
        y0 s = this.w.s();
        boolean z2 = s == this.w.r();
        jq8 o = s.o();
        cx6 cx6Var = o.b[i];
        t0[] z3 = z(o.c[i]);
        boolean z4 = e1() && this.L.e == 3;
        boolean z5 = !z && z4;
        this.i0++;
        this.b.add(z1Var);
        z1Var.o(cx6Var, z3, s.c[i], this.k0, z5, z2, s.m(), s.l());
        z1Var.s(11, new a());
        this.r.b(z1Var);
        if (z4) {
            z1Var.start();
        }
    }

    private void s0() {
        r0();
        E0(true);
    }

    private void t() {
        u(new boolean[this.a.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.t0(boolean, boolean, boolean, boolean):void");
    }

    private void u(boolean[] zArr) {
        y0 s = this.w.s();
        jq8 o = s.o();
        for (int i = 0; i < this.a.length; i++) {
            if (!o.c(i) && this.b.remove(this.a[i])) {
                this.a[i].a();
            }
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (o.c(i2)) {
                s(i2, zArr[i2]);
            }
        }
        s.g = true;
    }

    private void u0() {
        y0 r = this.w.r();
        this.S = r != null && r.f.h && this.Q;
    }

    private void v(z1 z1Var) {
        if (z1Var.getState() == 2) {
            z1Var.stop();
        }
    }

    private void v0(long j) {
        y0 r = this.w.r();
        long z = r == null ? j + 1000000000000L : r.z(j);
        this.k0 = z;
        this.r.c(z);
        for (z1 z1Var : this.a) {
            if (S(z1Var)) {
                z1Var.F(this.k0);
            }
        }
        g0();
    }

    private static void w0(g2 g2Var, d dVar, g2.d dVar2, g2.b bVar) {
        int i = g2Var.s(g2Var.m(dVar.d, bVar).c, dVar2).s;
        Object obj = g2Var.l(i, bVar, true).b;
        long j = bVar.d;
        dVar.b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private ImmutableList x(q72[] q72VarArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z = false;
        for (q72 q72Var : q72VarArr) {
            if (q72Var != null) {
                Metadata metadata = q72Var.f(0).j;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z = true;
                }
            }
        }
        return z ? aVar.k() : ImmutableList.x();
    }

    private static boolean x0(d dVar, g2 g2Var, g2 g2Var2, int i, boolean z, g2.d dVar2, g2.b bVar) {
        Object obj = dVar.d;
        if (obj == null) {
            Pair A0 = A0(g2Var, new h(dVar.a.h(), dVar.a.d(), dVar.a.f() == Long.MIN_VALUE ? -9223372036854775807L : z19.D0(dVar.a.f())), false, i, z, dVar2, bVar);
            if (A0 == null) {
                return false;
            }
            dVar.b(g2Var.g(A0.first), ((Long) A0.second).longValue(), A0.first);
            if (dVar.a.f() == Long.MIN_VALUE) {
                w0(g2Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int g2 = g2Var.g(obj);
        if (g2 == -1) {
            return false;
        }
        if (dVar.a.f() == Long.MIN_VALUE) {
            w0(g2Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.b = g2;
        g2Var2.m(dVar.d, bVar);
        if (bVar.f && g2Var2.s(bVar.c, dVar2).r == g2Var2.g(dVar.d)) {
            Pair o = g2Var.o(dVar2, bVar, g2Var.m(dVar.d, bVar).c, dVar.c + bVar.s());
            dVar.b(g2Var.g(o.first), ((Long) o.second).longValue(), o.first);
        }
        return true;
    }

    private long y() {
        t1 t1Var = this.L;
        return A(t1Var.a, t1Var.b.a, t1Var.r);
    }

    private void y0(g2 g2Var, g2 g2Var2) {
        if (g2Var.v() && g2Var2.v()) {
            return;
        }
        for (int size = this.s.size() - 1; size >= 0; size--) {
            if (!x0((d) this.s.get(size), g2Var, g2Var2, this.Z, this.e0, this.k, this.l)) {
                ((d) this.s.get(size)).a.k(false);
                this.s.remove(size);
            }
        }
        Collections.sort(this.s);
    }

    private static t0[] z(q72 q72Var) {
        int length = q72Var != null ? q72Var.length() : 0;
        t0[] t0VarArr = new t0[length];
        for (int i = 0; i < length; i++) {
            t0VarArr[i] = q72Var.f(i);
        }
        return t0VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.s0.g z0(com.google.android.exoplayer2.g2 r30, com.google.android.exoplayer2.t1 r31, com.google.android.exoplayer2.s0.h r32, com.google.android.exoplayer2.b1 r33, int r34, boolean r35, com.google.android.exoplayer2.g2.d r36, com.google.android.exoplayer2.g2.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.z0(com.google.android.exoplayer2.g2, com.google.android.exoplayer2.t1, com.google.android.exoplayer2.s0$h, com.google.android.exoplayer2.b1, int, boolean, com.google.android.exoplayer2.g2$d, com.google.android.exoplayer2.g2$b):com.google.android.exoplayer2.s0$g");
    }

    public Looper D() {
        return this.j;
    }

    public void D0(g2 g2Var, int i, long j) {
        this.h.c(3, new h(g2Var, i, j)).a();
    }

    public void Q0(List list, int i, long j, qr7 qr7Var) {
        this.h.c(17, new b(list, qr7Var, i, j, null)).a();
    }

    public void T0(boolean z, int i) {
        this.h.f(1, z ? 1 : 0, i).a();
    }

    public void W0(int i) {
        this.h.f(11, i, 0).a();
    }

    @Override // hq8.a
    public void a(z1 z1Var) {
        this.h.i(26);
    }

    @Override // hq8.a
    public void b() {
        this.h.i(10);
    }

    @Override // com.google.android.exoplayer2.q1.d
    public void c() {
        this.h.i(22);
    }

    @Override // com.google.android.exoplayer2.w1.a
    public synchronized void d(w1 w1Var) {
        if (!this.N && this.j.getThread().isAlive()) {
            this.h.c(14, w1Var).a();
            return;
        }
        a84.j("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        w1Var.k(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i;
        y0 s;
        int i2 = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        try {
            switch (message.what) {
                case 0:
                    l0();
                    break;
                case 1:
                    U0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    r();
                    break;
                case 3:
                    F0((h) message.obj);
                    break;
                case 4:
                    V0((u1) message.obj);
                    break;
                case 5:
                    Y0((fi7) message.obj);
                    break;
                case 6:
                    j1(false, true);
                    break;
                case 7:
                    n0();
                    return true;
                case 8:
                    K((com.google.android.exoplayer2.source.n) message.obj);
                    break;
                case 9:
                    G((com.google.android.exoplayer2.source.n) message.obj);
                    break;
                case 10:
                    r0();
                    break;
                case 11:
                    X0(message.arg1);
                    break;
                case 12:
                    Z0(message.arg1 != 0);
                    break;
                case 13:
                    N0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    I0((w1) message.obj);
                    break;
                case 15:
                    K0((w1) message.obj);
                    break;
                case 16:
                    M((u1) message.obj, false);
                    break;
                case 17:
                    P0((b) message.obj);
                    break;
                case 18:
                    l((b) message.obj, message.arg1);
                    break;
                case 19:
                    lh4.a(message.obj);
                    f0(null);
                    break;
                case 20:
                    p0(message.arg1, message.arg2, (qr7) message.obj);
                    break;
                case 21:
                    a1((qr7) message.obj);
                    break;
                case 22:
                    e0();
                    break;
                case 23:
                    S0(message.arg1 != 0);
                    break;
                case 24:
                    R0(message.arg1 == 1);
                    break;
                case EventType.SUBS /* 25 */:
                    n();
                    break;
                case EventType.CDN /* 26 */:
                    s0();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.f45type == 1 && (s = this.w.s()) != null) {
                e = e.f(s.f.a);
            }
            if (e.isRecoverable && this.n0 == null) {
                a84.k("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.n0 = e;
                r63 r63Var = this.h;
                r63Var.g(r63Var.c(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.n0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.n0;
                }
                a84.e("ExoPlayerImplInternal", "Playback error", e);
                if (e.f45type == 1 && this.w.r() != this.w.s()) {
                    while (this.w.r() != this.w.s()) {
                        this.w.b();
                    }
                    z0 z0Var = ((y0) ur.e(this.w.r())).f;
                    o.b bVar = z0Var.a;
                    long j = z0Var.b;
                    this.L = N(bVar, j, z0Var.c, j, true, 0);
                }
                j1(true, false);
                this.L = this.L.f(e);
            }
        } catch (ParserException e3) {
            int i3 = e3.dataType;
            if (i3 == 1) {
                i = e3.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i = e3.contentIsMalformed ? 3002 : 3004;
                }
                H(e3, i2);
            }
            i2 = i;
            H(e3, i2);
        } catch (DrmSession.DrmSessionException e4) {
            H(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            H(e5, ContentMediaFormat.FULL_CONTENT_EPISODE);
        } catch (DataSourceException e6) {
            H(e6, e6.reason);
        } catch (IOException e7) {
            H(e7, 2000);
        } catch (RuntimeException e8) {
            if ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) {
                i2 = ContentMediaFormat.PARTIAL_CONTENT_GENERIC;
            }
            ExoPlaybackException j2 = ExoPlaybackException.j(e8, i2);
            a84.e("ExoPlayerImplInternal", "Playback error", j2);
            j1(true, false);
            this.L = this.L.f(j2);
        }
        Y();
        return true;
    }

    public void i1() {
        this.h.a(6).a();
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void g(com.google.android.exoplayer2.source.n nVar) {
        this.h.c(9, nVar).a();
    }

    public void k0() {
        this.h.a(0).a();
    }

    @Override // com.google.android.exoplayer2.i.a
    public void m(u1 u1Var) {
        this.h.c(16, u1Var).a();
    }

    public synchronized boolean m0() {
        if (!this.N && this.j.getThread().isAlive()) {
            this.h.i(7);
            r1(new gc8() { // from class: com.google.android.exoplayer2.q0
                @Override // defpackage.gc8
                public final Object get() {
                    Boolean V;
                    V = s0.this.V();
                    return V;
                }
            }, this.B);
            return this.N;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void o(com.google.android.exoplayer2.source.n nVar) {
        this.h.c(8, nVar).a();
    }

    public void w(long j) {
        this.o0 = j;
    }
}
