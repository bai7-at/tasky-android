package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import defpackage.a7g;
import defpackage.acd;
import defpackage.bgf;
import defpackage.c7g;
import defpackage.ezd;
import defpackage.fhe;
import defpackage.fyb;
import defpackage.ggf;
import defpackage.hib;
import defpackage.hpf;
import defpackage.khe;
import defpackage.kod;
import defpackage.l0c;
import defpackage.l6a;
import defpackage.l8f;
import defpackage.lh4;
import defpackage.moa;
import defpackage.n1c;
import defpackage.ndf;
import defpackage.o6g;
import defpackage.p2g;
import defpackage.q7g;
import defpackage.qff;
import defpackage.qgf;
import defpackage.r2g;
import defpackage.s2g;
import defpackage.s7g;
import defpackage.sef;
import defpackage.wef;
import defpackage.wff;
import defpackage.wzf;
import defpackage.xzf;
import defpackage.y6g;
import defpackage.yff;
import defpackage.z2g;
import defpackage.zff;
import defpackage.zzf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
final class fo implements Handler.Callback, wzf, y6g, sef, l8f, wef {
    private co B;
    private boolean H;
    private boolean M;
    private boolean N;
    private boolean S;
    private boolean Z;
    private final wff[] a;
    private final Set b;
    private final zff[] c;
    private final a7g d;
    private final c7g e;
    private int e0;
    private final ndf f;
    private eo f0;
    private final q7g g;
    private long g0;
    private final kod h;
    private int h0;
    private final HandlerThread i;
    private boolean i0;
    private final Looper j;
    private zziz j0;
    private final l0c k;
    private final fyb l;
    private final ym l0;
    private final long m;
    private final um m0;
    private final vm n;
    private final ArrayList r;
    private final acd s;
    private final lo t;
    private final wo u;
    private final long w;
    private ggf x;
    private xo y;
    private int X = 0;
    private boolean Y = false;
    private boolean L = false;
    private long k0 = -9223372036854775807L;
    private long Q = -9223372036854775807L;

    public fo(wff[] wffVarArr, a7g a7gVar, c7g c7gVar, ndf ndfVar, q7g q7gVar, int i, boolean z, qgf qgfVar, ggf ggfVar, um umVar, long j, boolean z2, Looper looper, acd acdVar, ym ymVar, hpf hpfVar, Looper looper2) {
        this.l0 = ymVar;
        this.a = wffVarArr;
        this.d = a7gVar;
        this.e = c7gVar;
        this.f = ndfVar;
        this.g = q7gVar;
        this.x = ggfVar;
        this.m0 = umVar;
        this.w = j;
        this.s = acdVar;
        this.m = ndfVar.zza();
        ndfVar.zzf();
        xo g = xo.g(c7gVar);
        this.y = g;
        this.B = new co(g);
        int length = wffVarArr.length;
        this.c = new zff[2];
        yff a = a7gVar.a();
        for (int i2 = 0; i2 < 2; i2++) {
            wffVarArr[i2].u(i2, hpfVar, acdVar);
            this.c[i2] = wffVarArr[i2].zzl();
            this.c[i2].r(a);
        }
        this.n = new vm(this, acdVar);
        this.r = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.k = new l0c();
        this.l = new fyb();
        a7gVar.h(this, q7gVar);
        this.i0 = true;
        kod a2 = acdVar.a(looper, null);
        this.t = new lo(qgfVar, a2, new zn(this));
        this.u = new wo(this, qgfVar, a2, hpfVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.j = looper3;
        this.h = acdVar.a(looper3, this);
    }

    private final void A(boolean z, boolean z2) {
        q(z || !this.Z, false, true, false);
        this.B.a(z2 ? 1 : 0);
        this.f.zzd();
        y(1);
    }

    private final void B() {
        this.n.g();
        wff[] wffVarArr = this.a;
        int length = wffVarArr.length;
        for (int i = 0; i < 2; i++) {
            wff wffVar = wffVarArr[i];
            if (J(wffVar)) {
                Q(wffVar);
            }
        }
    }

    private final void C() {
        io g = this.t.g();
        boolean z = this.S || (g != null && g.a.zzp());
        xo xoVar = this.y;
        if (z != xoVar.g) {
            this.y = new xo(xoVar.a, xoVar.b, xoVar.c, xoVar.d, xoVar.e, xoVar.f, z, xoVar.h, xoVar.i, xoVar.j, xoVar.k, xoVar.l, xoVar.m, xoVar.n, xoVar.p, xoVar.q, xoVar.r, xoVar.s, false);
        }
    }

    private final void D(zzf zzfVar, z2g z2gVar, c7g c7gVar) {
        n1c n1cVar = this.y.a;
        o6g[] o6gVarArr = c7gVar.c;
        this.f.a(n1cVar, zzfVar, this.a, z2gVar, o6gVarArr);
    }

    private final void E() {
        io h = this.t.h();
        if (h == null) {
            return;
        }
        long zzd = h.d ? h.a.zzd() : -9223372036854775807L;
        if (zzd != -9223372036854775807L) {
            if (!h.r()) {
                this.t.q(h);
                i(false);
                m();
            }
            s(zzd);
            if (zzd != this.y.r) {
                xo xoVar = this.y;
                this.y = l0(xoVar.b, zzd, xoVar.c, zzd, true, 5);
            }
        } else {
            long a = this.n.a(h != this.t.i());
            this.g0 = a;
            long e = a - h.e();
            long j = this.y.r;
            if (!this.r.isEmpty() && !this.y.b.b()) {
                if (this.i0) {
                    this.i0 = false;
                }
                xo xoVar2 = this.y;
                xoVar2.a.a(xoVar2.b.a);
                int min = Math.min(this.h0, this.r.size());
                if (min > 0) {
                    lh4.a(this.r.get(min - 1));
                }
                if (min < this.r.size()) {
                    lh4.a(this.r.get(min));
                }
                this.h0 = min;
            }
            if (this.n.zzj()) {
                xo xoVar3 = this.y;
                this.y = l0(xoVar3.b, e, xoVar3.c, e, true, 6);
            } else {
                xo xoVar4 = this.y;
                xoVar4.r = e;
                xoVar4.s = SystemClock.elapsedRealtime();
            }
        }
        this.y.p = this.t.g().c();
        this.y.q = f0();
        xo xoVar5 = this.y;
        if (xoVar5.l && xoVar5.e == 3 && N(xoVar5.a, xoVar5.b)) {
            xo xoVar6 = this.y;
            if (xoVar6.n.a == 1.0f) {
                float a2 = this.m0.a(e0(xoVar6.a, xoVar6.b.a, xoVar6.r), f0());
                if (this.n.zzc().a != a2) {
                    w(new hib(a2, this.y.n.b));
                    l(this.y.n, this.n.zzc().a, false, false);
                }
            }
        }
    }

    private final void F(n1c n1cVar, zzf zzfVar, n1c n1cVar2, zzf zzfVar2, long j, boolean z) {
        if (!N(n1cVar, zzfVar)) {
            hib hibVar = zzfVar.b() ? hib.d : this.y.n;
            if (this.n.zzc().equals(hibVar)) {
                return;
            }
            w(hibVar);
            l(this.y.n, hibVar.a, false, false);
            return;
        }
        n1cVar.e(n1cVar.n(zzfVar.a, this.l).c, this.k, 0L);
        um umVar = this.m0;
        moa moaVar = this.k.j;
        int i = khe.a;
        umVar.d(moaVar);
        if (j != -9223372036854775807L) {
            this.m0.e(e0(n1cVar, zzfVar.a, j));
            return;
        }
        if (!khe.f(!n1cVar2.o() ? n1cVar2.e(n1cVar2.n(zzfVar2.a, this.l).c, this.k, 0L).a : null, this.k.a) || z) {
            this.m0.e(-9223372036854775807L);
        }
    }

    private final void G(boolean z, boolean z2) {
        this.N = z;
        this.Q = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void H(fhe fheVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((xn) fheVar).a.H && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean I() {
        io g = this.t.g();
        return (g == null || g.d() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean J(wff wffVar) {
        return wffVar.v() != 0;
    }

    private final boolean K() {
        io h = this.t.h();
        long j = h.f.e;
        if (!h.d) {
            return false;
        }
        if (j == -9223372036854775807L || this.y.r < j) {
            return true;
        }
        return !M();
    }

    private static boolean L(xo xoVar, fyb fybVar) {
        zzf zzfVar = xoVar.b;
        n1c n1cVar = xoVar.a;
        return n1cVar.o() || n1cVar.n(zzfVar.a, fybVar).f;
    }

    private final boolean M() {
        xo xoVar = this.y;
        return xoVar.l && xoVar.m == 0;
    }

    private final boolean N(n1c n1cVar, zzf zzfVar) {
        if (!zzfVar.b() && !n1cVar.o()) {
            n1cVar.e(n1cVar.n(zzfVar.a, this.l).c, this.k, 0L);
            if (this.k.b()) {
                l0c l0cVar = this.k;
                if (l0cVar.h && l0cVar.e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static l6a[] O(o6g o6gVar) {
        int zzc = o6gVar != null ? o6gVar.zzc() : 0;
        l6a[] l6aVarArr = new l6a[zzc];
        for (int i = 0; i < zzc; i++) {
            l6aVarArr[i] = o6gVar.zzd(i);
        }
        return l6aVarArr;
    }

    private static final void P(qff qffVar) {
        qffVar.j();
        try {
            qffVar.c().c(qffVar.a(), qffVar.g());
        } finally {
            qffVar.h(true);
        }
    }

    private static final void Q(wff wffVar) {
        if (wffVar.v() == 2) {
            wffVar.zzO();
        }
    }

    private static final void R(wff wffVar, long j) {
        wffVar.d();
    }

    public static /* synthetic */ io U(fo foVar, jo joVar, long j) {
        ndf ndfVar = foVar.f;
        a7g a7gVar = foVar.d;
        s7g zzi = ndfVar.zzi();
        c7g c7gVar = foVar.e;
        return new io(foVar.c, j, a7gVar, zzi, foVar.u, joVar, c7gVar);
    }

    static Object W(l0c l0cVar, fyb fybVar, int i, boolean z, Object obj, n1c n1cVar, n1c n1cVar2) {
        int a = n1cVar.a(obj);
        int b = n1cVar.b();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (true) {
            if (i2 >= b || i4 != -1) {
                break;
            }
            i3 = n1cVar.i(i3, fybVar, l0cVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = n1cVar2.a(n1cVar.f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return n1cVar2.f(i4);
    }

    static final /* synthetic */ void d0(qff qffVar) {
        try {
            P(qffVar);
        } catch (zziz e) {
            ezd.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final void e(wff wffVar) {
        if (J(wffVar)) {
            this.n.b(wffVar);
            Q(wffVar);
            wffVar.zzq();
            this.e0--;
        }
    }

    private final long e0(n1c n1cVar, Object obj, long j) {
        n1cVar.e(n1cVar.n(obj, this.l).c, this.k, 0L);
        l0c l0cVar = this.k;
        if (l0cVar.e != -9223372036854775807L && l0cVar.b()) {
            l0c l0cVar2 = this.k;
            if (l0cVar2.h) {
                long j2 = l0cVar2.f;
                return khe.F((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.k.e) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final void f() {
        int length = this.a.length;
        g(new boolean[2], this.t.i().f());
    }

    private final long f0() {
        return g0(this.y.p);
    }

    private final void g(boolean[] zArr, long j) {
        io i = this.t.i();
        c7g i2 = i.i();
        int i3 = 0;
        while (true) {
            int length = this.a.length;
            if (i3 >= 2) {
                break;
            }
            if (!i2.b(i3) && this.b.remove(this.a[i3])) {
                this.a[i3].m();
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            int length2 = this.a.length;
            if (i4 >= 2) {
                i.g = true;
                return;
            }
            if (i2.b(i4)) {
                boolean z = zArr[i4];
                wff wffVar = this.a[i4];
                if (!J(wffVar)) {
                    lo loVar = this.t;
                    io i5 = loVar.i();
                    boolean z2 = i5 == loVar.h();
                    c7g i6 = i5.i();
                    bgf bgfVar = i6.b[i4];
                    l6a[] O = O(i6.c[i4]);
                    boolean z3 = M() && this.y.e == 3;
                    boolean z4 = !z && z3;
                    this.e0++;
                    this.b.add(wffVar);
                    wffVar.w(bgfVar, O, i5.c[i4], this.g0, z4, z2, j, i5.e(), i5.f.a);
                    wffVar.c(11, new ao(this));
                    this.n.c(wffVar);
                    if (z3) {
                        wffVar.zzN();
                    }
                }
            }
            i4++;
        }
    }

    private final long g0(long j) {
        io g = this.t.g();
        if (g == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.g0 - g.e()));
    }

    private final void h(IOException iOException, int i) {
        lo loVar = this.t;
        zziz c = zziz.c(iOException, i);
        io h = loVar.h();
        if (h != null) {
            c = c.a(h.f.a);
        }
        ezd.d("ExoPlayerImplInternal", "Playback error", c);
        A(false, false);
        this.y = this.y.d(c);
    }

    private final long h0(zzf zzfVar, long j, boolean z) {
        lo loVar = this.t;
        return i0(zzfVar, j, loVar.h() != loVar.i(), z);
    }

    private final void i(boolean z) {
        io g = this.t.g();
        zzf zzfVar = g == null ? this.y.b : g.f.a;
        boolean equals = this.y.k.equals(zzfVar);
        if (!equals) {
            this.y = this.y.a(zzfVar);
        }
        xo xoVar = this.y;
        xoVar.p = g == null ? xoVar.r : g.c();
        this.y.q = f0();
        if ((!equals || z) && g != null && g.d) {
            D(g.f.a, g.h(), g.i());
        }
    }

    private final long i0(zzf zzfVar, long j, boolean z, boolean z2) {
        B();
        G(false, true);
        if (z2 || this.y.e == 3) {
            y(2);
        }
        io h = this.t.h();
        io ioVar = h;
        while (ioVar != null && !zzfVar.equals(ioVar.f.a)) {
            ioVar = ioVar.g();
        }
        if (z || h != ioVar || (ioVar != null && ioVar.e() + j < 0)) {
            wff[] wffVarArr = this.a;
            int length = wffVarArr.length;
            for (int i = 0; i < 2; i++) {
                e(wffVarArr[i]);
            }
            if (ioVar != null) {
                while (this.t.h() != ioVar) {
                    this.t.d();
                }
                this.t.q(ioVar);
                ioVar.p(1000000000000L);
                f();
            }
        }
        if (ioVar != null) {
            this.t.q(ioVar);
            if (!ioVar.d) {
                ioVar.f = ioVar.f.b(j);
            } else if (ioVar.e) {
                j = ioVar.a.f(j);
                ioVar.a.i(j - this.m, false);
            }
            s(j);
            m();
        } else {
            this.t.m();
            s(j);
        }
        i(false);
        this.h.zzi(2);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ab  */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [int] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [n1c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(defpackage.n1c r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo.j(n1c, boolean):void");
    }

    private final Pair j0(n1c n1cVar) {
        long j = 0;
        if (n1cVar.o()) {
            return Pair.create(xo.h(), 0L);
        }
        Pair l = n1cVar.l(this.k, this.l, n1cVar.g(this.Y), -9223372036854775807L);
        zzf l2 = this.t.l(n1cVar, l.first, 0L);
        long longValue = ((Long) l.second).longValue();
        if (l2.b()) {
            n1cVar.n(l2.a, this.l);
            if (l2.c == this.l.e(l2.b)) {
                this.l.j();
            }
        } else {
            j = longValue;
        }
        return Pair.create(l2, Long.valueOf(j));
    }

    private final void k(hib hibVar, boolean z) {
        l(hibVar, hibVar.a, true, z);
    }

    private static Pair k0(n1c n1cVar, eo eoVar, boolean z, int i, boolean z2, l0c l0cVar, fyb fybVar) {
        Pair l;
        n1c n1cVar2 = eoVar.a;
        if (n1cVar.o()) {
            return null;
        }
        n1c n1cVar3 = true == n1cVar2.o() ? n1cVar : n1cVar2;
        try {
            l = n1cVar3.l(l0cVar, fybVar, eoVar.b, eoVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (n1cVar.equals(n1cVar3)) {
            return l;
        }
        if (n1cVar.a(l.first) != -1) {
            return (n1cVar3.n(l.first, fybVar).f && n1cVar3.e(fybVar.c, l0cVar, 0L).n == n1cVar3.a(l.first)) ? n1cVar.l(l0cVar, fybVar, n1cVar.n(l.first, fybVar).c, eoVar.c) : l;
        }
        Object W = W(l0cVar, fybVar, i, z2, l.first, n1cVar3, n1cVar);
        if (W != null) {
            return n1cVar.l(l0cVar, fybVar, n1cVar.n(W, fybVar).c, -9223372036854775807L);
        }
        return null;
    }

    private final void l(hib hibVar, float f, boolean z, boolean z2) {
        int i;
        fo foVar = this;
        if (z) {
            if (z2) {
                foVar.B.a(1);
            }
            xo xoVar = foVar.y;
            foVar = this;
            foVar.y = new xo(xoVar.a, xoVar.b, xoVar.c, xoVar.d, xoVar.e, xoVar.f, xoVar.g, xoVar.h, xoVar.i, xoVar.j, xoVar.k, xoVar.l, xoVar.m, hibVar, xoVar.p, xoVar.q, xoVar.r, xoVar.s, false);
        }
        float f2 = hibVar.a;
        io h = foVar.t.h();
        while (true) {
            i = 0;
            if (h == null) {
                break;
            }
            o6g[] o6gVarArr = h.i().c;
            int length = o6gVarArr.length;
            while (i < length) {
                o6g o6gVar = o6gVarArr[i];
                i++;
            }
            h = h.g();
        }
        wff[] wffVarArr = foVar.a;
        int length2 = wffVarArr.length;
        while (i < 2) {
            wff wffVar = wffVarArr[i];
            if (wffVar != null) {
                wffVar.s(f, hibVar.a);
            }
            i++;
        }
    }

    private final xo l0(zzf zzfVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        z2g z2gVar;
        c7g c7gVar;
        z2g z2gVar2;
        int i2 = 0;
        this.i0 = (!this.i0 && j == this.y.r && zzfVar.equals(this.y.b)) ? false : true;
        r();
        xo xoVar = this.y;
        z2g z2gVar3 = xoVar.h;
        c7g c7gVar2 = xoVar.i;
        List list2 = xoVar.j;
        if (this.u.j()) {
            io h = this.t.h();
            z2g h2 = h == null ? z2g.d : h.h();
            c7g i3 = h == null ? this.e : h.i();
            o6g[] o6gVarArr = i3.c;
            h9 h9Var = new h9();
            int length = o6gVarArr.length;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                o6g o6gVar = o6gVarArr[i4];
                if (o6gVar != null) {
                    zzby zzbyVar = o6gVar.zzd(0).j;
                    if (zzbyVar == null) {
                        z2gVar2 = h2;
                        h9Var.g(new zzby(-9223372036854775807L, new zzbx[0]));
                    } else {
                        z2gVar2 = h2;
                        h9Var.g(zzbyVar);
                        z2 = true;
                    }
                } else {
                    z2gVar2 = h2;
                }
                i4++;
                h2 = z2gVar2;
            }
            z2g z2gVar4 = h2;
            zzgaa j4 = z2 ? h9Var.j() : zzgaa.t();
            if (h != null) {
                jo joVar = h.f;
                if (joVar.c != j2) {
                    h.f = joVar.a(j2);
                }
            }
            io h3 = this.t.h();
            if (h3 != null) {
                c7g i5 = h3.i();
                while (true) {
                    int length2 = this.a.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (i5.b(i2)) {
                        if (this.a[i2].b() != 1) {
                            break;
                        }
                        int i6 = i5.b[i2].a;
                    }
                    i2++;
                }
            }
            list = j4;
            c7gVar = i3;
            z2gVar = z2gVar4;
        } else if (zzfVar.equals(this.y.b)) {
            list = list2;
            z2gVar = z2gVar3;
            c7gVar = c7gVar2;
        } else {
            c7gVar = this.e;
            z2gVar = z2g.d;
            list = zzgaa.t();
        }
        if (z) {
            this.B.d(i);
        }
        return this.y.b(zzfVar, j, j2, j3, f0(), z2gVar, c7gVar, list);
    }

    private final void m() {
        long e;
        long j;
        boolean z = false;
        if (I()) {
            io g = this.t.g();
            long g0 = g0(g.d());
            if (g == this.t.h()) {
                e = this.g0;
                j = g.e();
            } else {
                e = this.g0 - g.e();
                j = g.f.b;
            }
            long j2 = e - j;
            boolean c = this.f.c(j2, g0, this.n.zzc().a);
            if (c || g0 >= 500000 || this.m <= 0) {
                z = c;
            } else {
                this.t.h().a.i(this.y.r, false);
                z = this.f.c(j2, g0, this.n.zzc().a);
            }
        }
        this.S = z;
        if (z) {
            this.t.g().k(this.g0, this.n.zzc().a, this.Q);
        }
        C();
    }

    private final void n() {
        boolean z;
        this.B.c(this.y);
        z = this.B.a;
        if (z) {
            ym ymVar = this.l0;
            ymVar.a.D(this.B);
            this.B = new co(this.y);
        }
    }

    private final void o() {
        int i;
        float f = this.n.zzc().a;
        lo loVar = this.t;
        io i2 = loVar.i();
        boolean z = true;
        for (io h = loVar.h(); h != null && h.d; h = h.g()) {
            c7g j = h.j(f, this.y.a);
            c7g i3 = h.i();
            boolean z2 = false;
            if (i3 != null) {
                if (i3.c.length == j.c.length) {
                    for (int i4 = 0; i4 < j.c.length; i4++) {
                        if (j.a(i3, i4)) {
                        }
                    }
                    if (h != i2) {
                        z2 = true;
                    }
                    z &= z2;
                }
            }
            if (z) {
                lo loVar2 = this.t;
                io h2 = loVar2.h();
                boolean q = loVar2.q(h2);
                int length = this.a.length;
                boolean[] zArr = new boolean[2];
                long b = h2.b(j, this.y.r, q, zArr);
                xo xoVar = this.y;
                boolean z3 = (xoVar.e == 4 || b == xoVar.r) ? false : true;
                xo xoVar2 = this.y;
                i = 2;
                this.y = l0(xoVar2.b, b, xoVar2.c, xoVar2.d, z3, 5);
                if (z3) {
                    s(b);
                }
                int length2 = this.a.length;
                boolean[] zArr2 = new boolean[2];
                int i5 = 0;
                while (true) {
                    wff[] wffVarArr = this.a;
                    int length3 = wffVarArr.length;
                    if (i5 >= 2) {
                        break;
                    }
                    wff wffVar = wffVarArr[i5];
                    boolean J = J(wffVar);
                    zArr2[i5] = J;
                    p2g p2gVar = h2.c[i5];
                    if (J) {
                        if (p2gVar != wffVar.zzo()) {
                            e(wffVar);
                        } else if (zArr[i5]) {
                            wffVar.t(this.g0);
                        }
                    }
                    i5++;
                }
                g(zArr2, this.g0);
            } else {
                i = 2;
                this.t.q(h);
                if (h.d) {
                    h.a(j, Math.max(h.f.b, this.g0 - h.e()), false);
                }
            }
            i(true);
            if (this.y.e != 4) {
                m();
                E();
                this.h.zzi(i);
                return;
            }
            return;
        }
    }

    private final void p() {
        o();
        v(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r2.equals(r32.y.b) == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo.q(boolean, boolean, boolean, boolean):void");
    }

    private final void r() {
        io h = this.t.h();
        boolean z = false;
        if (h != null && h.f.h && this.L) {
            z = true;
        }
        this.M = z;
    }

    private final void s(long j) {
        io h = this.t.h();
        long e = j + (h == null ? 1000000000000L : h.e());
        this.g0 = e;
        this.n.d(e);
        wff[] wffVarArr = this.a;
        int length = wffVarArr.length;
        for (int i = 0; i < 2; i++) {
            wff wffVar = wffVarArr[i];
            if (J(wffVar)) {
                wffVar.t(this.g0);
            }
        }
        for (io h2 = this.t.h(); h2 != null; h2 = h2.g()) {
            for (o6g o6gVar : h2.i().c) {
            }
        }
    }

    private final void t(n1c n1cVar, n1c n1cVar2) {
        if (n1cVar.o() && n1cVar2.o()) {
            return;
        }
        int size = this.r.size() - 1;
        if (size < 0) {
            Collections.sort(this.r);
        } else {
            lh4.a(this.r.get(size));
            throw null;
        }
    }

    private final void u(long j, long j2) {
        this.h.d(2, j + j2);
    }

    private final void v(boolean z) {
        zzf zzfVar = this.t.h().f.a;
        long i0 = i0(zzfVar, this.y.r, true, false);
        if (i0 != this.y.r) {
            xo xoVar = this.y;
            this.y = l0(zzfVar, i0, xoVar.c, xoVar.d, z, 5);
        }
    }

    private final void w(hib hibVar) {
        this.h.zzf(16);
        this.n.e(hibVar);
    }

    private final void x(boolean z, int i, boolean z2, int i2) {
        this.B.a(z2 ? 1 : 0);
        this.B.b(i2);
        this.y = this.y.c(z, i);
        G(false, false);
        for (io h = this.t.h(); h != null; h = h.g()) {
            for (o6g o6gVar : h.i().c) {
            }
        }
        if (!M()) {
            B();
            E();
            return;
        }
        int i3 = this.y.e;
        if (i3 == 3) {
            z();
            this.h.zzi(2);
        } else if (i3 == 2) {
            this.h.zzi(2);
        }
    }

    private final void y(int i) {
        xo xoVar = this.y;
        if (xoVar.e != i) {
            if (i != 2) {
                this.k0 = -9223372036854775807L;
            }
            this.y = xoVar.e(i);
        }
    }

    private final void z() {
        G(false, false);
        this.n.f();
        wff[] wffVarArr = this.a;
        int length = wffVarArr.length;
        for (int i = 0; i < 2; i++) {
            wff wffVar = wffVarArr[i];
            if (J(wffVar)) {
                wffVar.zzN();
            }
        }
    }

    public final Looper S() {
        return this.j;
    }

    final /* synthetic */ Boolean V() {
        return Boolean.valueOf(this.H);
    }

    public final void X() {
        this.h.zzb(0).zza();
    }

    public final void Y(n1c n1cVar, int i, long j) {
        this.h.b(3, new eo(n1cVar, i, j)).zza();
    }

    public final void Z(boolean z, int i) {
        this.h.f(1, z ? 1 : 0, i).zza();
    }

    @Override // defpackage.l8f
    public final void a(hib hibVar) {
        this.h.b(16, hibVar).zza();
    }

    public final void a0() {
        this.h.zzb(6).zza();
    }

    @Override // defpackage.q2g
    public final /* bridge */ /* synthetic */ void b(r2g r2gVar) {
        this.h.b(9, (xzf) r2gVar).zza();
    }

    public final synchronized boolean b0() {
        if (!this.H && this.j.getThread().isAlive()) {
            this.h.zzi(7);
            H(new xn(this), this.w);
            return this.H;
        }
        return true;
    }

    @Override // defpackage.wef
    public final synchronized void c(qff qffVar) {
        if (!this.H && this.j.getThread().isAlive()) {
            this.h.b(14, qffVar).zza();
            return;
        }
        ezd.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        qffVar.h(false);
    }

    public final void c0(List list, int i, long j, s2g s2gVar) {
        this.h.b(17, new bo(list, s2gVar, i, j, null)).zza();
    }

    @Override // defpackage.wzf
    public final void d(xzf xzfVar) {
        this.h.b(8, xzfVar).zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:412:0x07f1, code lost:
    
        if (K() != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0893, code lost:
    
        if (r3 == false) goto L458;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0613 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zztt -> 0x0036, zzgx -> 0x003a, zzcc -> 0x003e, zzrq -> 0x0042, zziz -> 0x0046, TryCatch #2 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00b5, B:27:0x00b6, B:29:0x00c5, B:30:0x00c9, B:31:0x00da, B:33:0x00e9, B:34:0x0105, B:35:0x0118, B:36:0x0121, B:38:0x0133, B:39:0x013f, B:40:0x014f, B:42:0x015b, B:45:0x0166, B:46:0x016d, B:47:0x017a, B:50:0x0181, B:52:0x0189, B:54:0x018d, B:56:0x0193, B:58:0x019b, B:60:0x01a3, B:62:0x01a6, B:67:0x01aa, B:76:0x01b7, B:78:0x01b8, B:81:0x01bf, B:83:0x01cd, B:84:0x01d0, B:86:0x01d5, B:88:0x01e5, B:89:0x01e8, B:90:0x01ed, B:91:0x01f2, B:93:0x01fe, B:94:0x020a, B:96:0x0216, B:98:0x0242, B:99:0x0262, B:100:0x0267, B:101:0x026b, B:103:0x0270, B:105:0x0280, B:107:0x028c, B:108:0x028f, B:117:0x029a, B:118:0x029b, B:119:0x02a0, B:120:0x02a8, B:121:0x02ba, B:123:0x02e1, B:131:0x0405, B:132:0x03c8, B:159:0x03c4, B:174:0x0411, B:175:0x041e, B:188:0x0303, B:191:0x0316, B:193:0x0326, B:195:0x033d, B:197:0x0347, B:204:0x041f, B:206:0x0433, B:208:0x0442, B:210:0x0451, B:212:0x045d, B:214:0x0472, B:215:0x0477, B:216:0x047b, B:218:0x047f, B:219:0x048c, B:222:0x05ec, B:224:0x05f4, B:226:0x05fc, B:229:0x0601, B:230:0x060d, B:232:0x0613, B:234:0x061b, B:239:0x062b, B:241:0x0631, B:243:0x0651, B:245:0x0657, B:238:0x065c, B:252:0x0661, B:254:0x0665, B:256:0x066b, B:258:0x066f, B:260:0x0677, B:262:0x067d, B:264:0x0687, B:267:0x068d, B:268:0x0690, B:270:0x0698, B:272:0x06aa, B:274:0x06b2, B:276:0x06ba, B:279:0x06c3, B:280:0x06ec, B:282:0x06f2, B:284:0x06f8, B:286:0x06ff, B:293:0x0707, B:296:0x070a, B:300:0x0715, B:302:0x071f, B:303:0x0726, B:305:0x0736, B:306:0x074e, B:308:0x0754, B:310:0x075c, B:312:0x0763, B:315:0x076c, B:319:0x077b, B:324:0x0788, B:326:0x078e, B:333:0x07a0, B:335:0x07a3, B:344:0x07ad, B:346:0x07b3, B:350:0x07bb, B:352:0x07c3, B:354:0x07c7, B:355:0x07d2, B:357:0x07d8, B:358:0x08c9, B:361:0x08d1, B:363:0x08d6, B:365:0x08de, B:367:0x08ec, B:369:0x08f3, B:373:0x08f7, B:375:0x08fd, B:377:0x0906, B:379:0x090c, B:381:0x0912, B:382:0x0931, B:384:0x0937, B:387:0x0940, B:390:0x0961, B:395:0x0954, B:397:0x0958, B:399:0x095e, B:401:0x0919, B:404:0x0927, B:405:0x092e, B:406:0x092f, B:407:0x07e2, B:409:0x07e9, B:411:0x07ed, B:414:0x0872, B:416:0x087e, B:419:0x07fc, B:421:0x0800, B:423:0x0814, B:424:0x081f, B:426:0x082b, B:429:0x0834, B:431:0x083e, B:436:0x0849, B:443:0x0882, B:445:0x0888, B:447:0x088c, B:450:0x0895, B:452:0x08a5, B:454:0x08ad, B:456:0x08b7, B:458:0x08bc, B:460:0x08c1, B:461:0x08c6, B:463:0x07a6, B:469:0x049d, B:471:0x04a3, B:473:0x04b0, B:476:0x04bb, B:478:0x04c0, B:481:0x04ce, B:484:0x04d4, B:486:0x04dc, B:490:0x04df, B:492:0x04e7, B:494:0x04f5, B:496:0x0532, B:498:0x053c, B:501:0x0547, B:503:0x054f, B:505:0x0552, B:508:0x0555, B:510:0x055b, B:512:0x056a, B:514:0x0570, B:516:0x057a, B:518:0x0584, B:520:0x0595, B:523:0x059e, B:525:0x05aa, B:528:0x05ac, B:530:0x05b2, B:533:0x05b7, B:535:0x05bd, B:537:0x05c5, B:539:0x05cb, B:541:0x05d1, B:545:0x05df, B:546:0x05e6, B:548:0x05e9, B:554:0x0489, B:556:0x0966, B:559:0x096d, B:561:0x0975, B:564:0x0993), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x065f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x068d A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zztt -> 0x0036, zzgx -> 0x003a, zzcc -> 0x003e, zzrq -> 0x0042, zziz -> 0x0046, TryCatch #2 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00b5, B:27:0x00b6, B:29:0x00c5, B:30:0x00c9, B:31:0x00da, B:33:0x00e9, B:34:0x0105, B:35:0x0118, B:36:0x0121, B:38:0x0133, B:39:0x013f, B:40:0x014f, B:42:0x015b, B:45:0x0166, B:46:0x016d, B:47:0x017a, B:50:0x0181, B:52:0x0189, B:54:0x018d, B:56:0x0193, B:58:0x019b, B:60:0x01a3, B:62:0x01a6, B:67:0x01aa, B:76:0x01b7, B:78:0x01b8, B:81:0x01bf, B:83:0x01cd, B:84:0x01d0, B:86:0x01d5, B:88:0x01e5, B:89:0x01e8, B:90:0x01ed, B:91:0x01f2, B:93:0x01fe, B:94:0x020a, B:96:0x0216, B:98:0x0242, B:99:0x0262, B:100:0x0267, B:101:0x026b, B:103:0x0270, B:105:0x0280, B:107:0x028c, B:108:0x028f, B:117:0x029a, B:118:0x029b, B:119:0x02a0, B:120:0x02a8, B:121:0x02ba, B:123:0x02e1, B:131:0x0405, B:132:0x03c8, B:159:0x03c4, B:174:0x0411, B:175:0x041e, B:188:0x0303, B:191:0x0316, B:193:0x0326, B:195:0x033d, B:197:0x0347, B:204:0x041f, B:206:0x0433, B:208:0x0442, B:210:0x0451, B:212:0x045d, B:214:0x0472, B:215:0x0477, B:216:0x047b, B:218:0x047f, B:219:0x048c, B:222:0x05ec, B:224:0x05f4, B:226:0x05fc, B:229:0x0601, B:230:0x060d, B:232:0x0613, B:234:0x061b, B:239:0x062b, B:241:0x0631, B:243:0x0651, B:245:0x0657, B:238:0x065c, B:252:0x0661, B:254:0x0665, B:256:0x066b, B:258:0x066f, B:260:0x0677, B:262:0x067d, B:264:0x0687, B:267:0x068d, B:268:0x0690, B:270:0x0698, B:272:0x06aa, B:274:0x06b2, B:276:0x06ba, B:279:0x06c3, B:280:0x06ec, B:282:0x06f2, B:284:0x06f8, B:286:0x06ff, B:293:0x0707, B:296:0x070a, B:300:0x0715, B:302:0x071f, B:303:0x0726, B:305:0x0736, B:306:0x074e, B:308:0x0754, B:310:0x075c, B:312:0x0763, B:315:0x076c, B:319:0x077b, B:324:0x0788, B:326:0x078e, B:333:0x07a0, B:335:0x07a3, B:344:0x07ad, B:346:0x07b3, B:350:0x07bb, B:352:0x07c3, B:354:0x07c7, B:355:0x07d2, B:357:0x07d8, B:358:0x08c9, B:361:0x08d1, B:363:0x08d6, B:365:0x08de, B:367:0x08ec, B:369:0x08f3, B:373:0x08f7, B:375:0x08fd, B:377:0x0906, B:379:0x090c, B:381:0x0912, B:382:0x0931, B:384:0x0937, B:387:0x0940, B:390:0x0961, B:395:0x0954, B:397:0x0958, B:399:0x095e, B:401:0x0919, B:404:0x0927, B:405:0x092e, B:406:0x092f, B:407:0x07e2, B:409:0x07e9, B:411:0x07ed, B:414:0x0872, B:416:0x087e, B:419:0x07fc, B:421:0x0800, B:423:0x0814, B:424:0x081f, B:426:0x082b, B:429:0x0834, B:431:0x083e, B:436:0x0849, B:443:0x0882, B:445:0x0888, B:447:0x088c, B:450:0x0895, B:452:0x08a5, B:454:0x08ad, B:456:0x08b7, B:458:0x08bc, B:460:0x08c1, B:461:0x08c6, B:463:0x07a6, B:469:0x049d, B:471:0x04a3, B:473:0x04b0, B:476:0x04bb, B:478:0x04c0, B:481:0x04ce, B:484:0x04d4, B:486:0x04dc, B:490:0x04df, B:492:0x04e7, B:494:0x04f5, B:496:0x0532, B:498:0x053c, B:501:0x0547, B:503:0x054f, B:505:0x0552, B:508:0x0555, B:510:0x055b, B:512:0x056a, B:514:0x0570, B:516:0x057a, B:518:0x0584, B:520:0x0595, B:523:0x059e, B:525:0x05aa, B:528:0x05ac, B:530:0x05b2, B:533:0x05b7, B:535:0x05bd, B:537:0x05c5, B:539:0x05cb, B:541:0x05d1, B:545:0x05df, B:546:0x05e6, B:548:0x05e9, B:554:0x0489, B:556:0x0966, B:559:0x096d, B:561:0x0975, B:564:0x0993), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0698 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zztt -> 0x0036, zzgx -> 0x003a, zzcc -> 0x003e, zzrq -> 0x0042, zziz -> 0x0046, TryCatch #2 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00b5, B:27:0x00b6, B:29:0x00c5, B:30:0x00c9, B:31:0x00da, B:33:0x00e9, B:34:0x0105, B:35:0x0118, B:36:0x0121, B:38:0x0133, B:39:0x013f, B:40:0x014f, B:42:0x015b, B:45:0x0166, B:46:0x016d, B:47:0x017a, B:50:0x0181, B:52:0x0189, B:54:0x018d, B:56:0x0193, B:58:0x019b, B:60:0x01a3, B:62:0x01a6, B:67:0x01aa, B:76:0x01b7, B:78:0x01b8, B:81:0x01bf, B:83:0x01cd, B:84:0x01d0, B:86:0x01d5, B:88:0x01e5, B:89:0x01e8, B:90:0x01ed, B:91:0x01f2, B:93:0x01fe, B:94:0x020a, B:96:0x0216, B:98:0x0242, B:99:0x0262, B:100:0x0267, B:101:0x026b, B:103:0x0270, B:105:0x0280, B:107:0x028c, B:108:0x028f, B:117:0x029a, B:118:0x029b, B:119:0x02a0, B:120:0x02a8, B:121:0x02ba, B:123:0x02e1, B:131:0x0405, B:132:0x03c8, B:159:0x03c4, B:174:0x0411, B:175:0x041e, B:188:0x0303, B:191:0x0316, B:193:0x0326, B:195:0x033d, B:197:0x0347, B:204:0x041f, B:206:0x0433, B:208:0x0442, B:210:0x0451, B:212:0x045d, B:214:0x0472, B:215:0x0477, B:216:0x047b, B:218:0x047f, B:219:0x048c, B:222:0x05ec, B:224:0x05f4, B:226:0x05fc, B:229:0x0601, B:230:0x060d, B:232:0x0613, B:234:0x061b, B:239:0x062b, B:241:0x0631, B:243:0x0651, B:245:0x0657, B:238:0x065c, B:252:0x0661, B:254:0x0665, B:256:0x066b, B:258:0x066f, B:260:0x0677, B:262:0x067d, B:264:0x0687, B:267:0x068d, B:268:0x0690, B:270:0x0698, B:272:0x06aa, B:274:0x06b2, B:276:0x06ba, B:279:0x06c3, B:280:0x06ec, B:282:0x06f2, B:284:0x06f8, B:286:0x06ff, B:293:0x0707, B:296:0x070a, B:300:0x0715, B:302:0x071f, B:303:0x0726, B:305:0x0736, B:306:0x074e, B:308:0x0754, B:310:0x075c, B:312:0x0763, B:315:0x076c, B:319:0x077b, B:324:0x0788, B:326:0x078e, B:333:0x07a0, B:335:0x07a3, B:344:0x07ad, B:346:0x07b3, B:350:0x07bb, B:352:0x07c3, B:354:0x07c7, B:355:0x07d2, B:357:0x07d8, B:358:0x08c9, B:361:0x08d1, B:363:0x08d6, B:365:0x08de, B:367:0x08ec, B:369:0x08f3, B:373:0x08f7, B:375:0x08fd, B:377:0x0906, B:379:0x090c, B:381:0x0912, B:382:0x0931, B:384:0x0937, B:387:0x0940, B:390:0x0961, B:395:0x0954, B:397:0x0958, B:399:0x095e, B:401:0x0919, B:404:0x0927, B:405:0x092e, B:406:0x092f, B:407:0x07e2, B:409:0x07e9, B:411:0x07ed, B:414:0x0872, B:416:0x087e, B:419:0x07fc, B:421:0x0800, B:423:0x0814, B:424:0x081f, B:426:0x082b, B:429:0x0834, B:431:0x083e, B:436:0x0849, B:443:0x0882, B:445:0x0888, B:447:0x088c, B:450:0x0895, B:452:0x08a5, B:454:0x08ad, B:456:0x08b7, B:458:0x08bc, B:460:0x08c1, B:461:0x08c6, B:463:0x07a6, B:469:0x049d, B:471:0x04a3, B:473:0x04b0, B:476:0x04bb, B:478:0x04c0, B:481:0x04ce, B:484:0x04d4, B:486:0x04dc, B:490:0x04df, B:492:0x04e7, B:494:0x04f5, B:496:0x0532, B:498:0x053c, B:501:0x0547, B:503:0x054f, B:505:0x0552, B:508:0x0555, B:510:0x055b, B:512:0x056a, B:514:0x0570, B:516:0x057a, B:518:0x0584, B:520:0x0595, B:523:0x059e, B:525:0x05aa, B:528:0x05ac, B:530:0x05b2, B:533:0x05b7, B:535:0x05bd, B:537:0x05c5, B:539:0x05cb, B:541:0x05d1, B:545:0x05df, B:546:0x05e6, B:548:0x05e9, B:554:0x0489, B:556:0x0966, B:559:0x096d, B:561:0x0975, B:564:0x0993), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06f2 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zztt -> 0x0036, zzgx -> 0x003a, zzcc -> 0x003e, zzrq -> 0x0042, zziz -> 0x0046, TryCatch #2 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00b5, B:27:0x00b6, B:29:0x00c5, B:30:0x00c9, B:31:0x00da, B:33:0x00e9, B:34:0x0105, B:35:0x0118, B:36:0x0121, B:38:0x0133, B:39:0x013f, B:40:0x014f, B:42:0x015b, B:45:0x0166, B:46:0x016d, B:47:0x017a, B:50:0x0181, B:52:0x0189, B:54:0x018d, B:56:0x0193, B:58:0x019b, B:60:0x01a3, B:62:0x01a6, B:67:0x01aa, B:76:0x01b7, B:78:0x01b8, B:81:0x01bf, B:83:0x01cd, B:84:0x01d0, B:86:0x01d5, B:88:0x01e5, B:89:0x01e8, B:90:0x01ed, B:91:0x01f2, B:93:0x01fe, B:94:0x020a, B:96:0x0216, B:98:0x0242, B:99:0x0262, B:100:0x0267, B:101:0x026b, B:103:0x0270, B:105:0x0280, B:107:0x028c, B:108:0x028f, B:117:0x029a, B:118:0x029b, B:119:0x02a0, B:120:0x02a8, B:121:0x02ba, B:123:0x02e1, B:131:0x0405, B:132:0x03c8, B:159:0x03c4, B:174:0x0411, B:175:0x041e, B:188:0x0303, B:191:0x0316, B:193:0x0326, B:195:0x033d, B:197:0x0347, B:204:0x041f, B:206:0x0433, B:208:0x0442, B:210:0x0451, B:212:0x045d, B:214:0x0472, B:215:0x0477, B:216:0x047b, B:218:0x047f, B:219:0x048c, B:222:0x05ec, B:224:0x05f4, B:226:0x05fc, B:229:0x0601, B:230:0x060d, B:232:0x0613, B:234:0x061b, B:239:0x062b, B:241:0x0631, B:243:0x0651, B:245:0x0657, B:238:0x065c, B:252:0x0661, B:254:0x0665, B:256:0x066b, B:258:0x066f, B:260:0x0677, B:262:0x067d, B:264:0x0687, B:267:0x068d, B:268:0x0690, B:270:0x0698, B:272:0x06aa, B:274:0x06b2, B:276:0x06ba, B:279:0x06c3, B:280:0x06ec, B:282:0x06f2, B:284:0x06f8, B:286:0x06ff, B:293:0x0707, B:296:0x070a, B:300:0x0715, B:302:0x071f, B:303:0x0726, B:305:0x0736, B:306:0x074e, B:308:0x0754, B:310:0x075c, B:312:0x0763, B:315:0x076c, B:319:0x077b, B:324:0x0788, B:326:0x078e, B:333:0x07a0, B:335:0x07a3, B:344:0x07ad, B:346:0x07b3, B:350:0x07bb, B:352:0x07c3, B:354:0x07c7, B:355:0x07d2, B:357:0x07d8, B:358:0x08c9, B:361:0x08d1, B:363:0x08d6, B:365:0x08de, B:367:0x08ec, B:369:0x08f3, B:373:0x08f7, B:375:0x08fd, B:377:0x0906, B:379:0x090c, B:381:0x0912, B:382:0x0931, B:384:0x0937, B:387:0x0940, B:390:0x0961, B:395:0x0954, B:397:0x0958, B:399:0x095e, B:401:0x0919, B:404:0x0927, B:405:0x092e, B:406:0x092f, B:407:0x07e2, B:409:0x07e9, B:411:0x07ed, B:414:0x0872, B:416:0x087e, B:419:0x07fc, B:421:0x0800, B:423:0x0814, B:424:0x081f, B:426:0x082b, B:429:0x0834, B:431:0x083e, B:436:0x0849, B:443:0x0882, B:445:0x0888, B:447:0x088c, B:450:0x0895, B:452:0x08a5, B:454:0x08ad, B:456:0x08b7, B:458:0x08bc, B:460:0x08c1, B:461:0x08c6, B:463:0x07a6, B:469:0x049d, B:471:0x04a3, B:473:0x04b0, B:476:0x04bb, B:478:0x04c0, B:481:0x04ce, B:484:0x04d4, B:486:0x04dc, B:490:0x04df, B:492:0x04e7, B:494:0x04f5, B:496:0x0532, B:498:0x053c, B:501:0x0547, B:503:0x054f, B:505:0x0552, B:508:0x0555, B:510:0x055b, B:512:0x056a, B:514:0x0570, B:516:0x057a, B:518:0x0584, B:520:0x0595, B:523:0x059e, B:525:0x05aa, B:528:0x05ac, B:530:0x05b2, B:533:0x05b7, B:535:0x05bd, B:537:0x05c5, B:539:0x05cb, B:541:0x05d1, B:545:0x05df, B:546:0x05e6, B:548:0x05e9, B:554:0x0489, B:556:0x0966, B:559:0x096d, B:561:0x0975, B:564:0x0993), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0937 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zztt -> 0x0036, zzgx -> 0x003a, zzcc -> 0x003e, zzrq -> 0x0042, zziz -> 0x0046, TryCatch #2 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00b5, B:27:0x00b6, B:29:0x00c5, B:30:0x00c9, B:31:0x00da, B:33:0x00e9, B:34:0x0105, B:35:0x0118, B:36:0x0121, B:38:0x0133, B:39:0x013f, B:40:0x014f, B:42:0x015b, B:45:0x0166, B:46:0x016d, B:47:0x017a, B:50:0x0181, B:52:0x0189, B:54:0x018d, B:56:0x0193, B:58:0x019b, B:60:0x01a3, B:62:0x01a6, B:67:0x01aa, B:76:0x01b7, B:78:0x01b8, B:81:0x01bf, B:83:0x01cd, B:84:0x01d0, B:86:0x01d5, B:88:0x01e5, B:89:0x01e8, B:90:0x01ed, B:91:0x01f2, B:93:0x01fe, B:94:0x020a, B:96:0x0216, B:98:0x0242, B:99:0x0262, B:100:0x0267, B:101:0x026b, B:103:0x0270, B:105:0x0280, B:107:0x028c, B:108:0x028f, B:117:0x029a, B:118:0x029b, B:119:0x02a0, B:120:0x02a8, B:121:0x02ba, B:123:0x02e1, B:131:0x0405, B:132:0x03c8, B:159:0x03c4, B:174:0x0411, B:175:0x041e, B:188:0x0303, B:191:0x0316, B:193:0x0326, B:195:0x033d, B:197:0x0347, B:204:0x041f, B:206:0x0433, B:208:0x0442, B:210:0x0451, B:212:0x045d, B:214:0x0472, B:215:0x0477, B:216:0x047b, B:218:0x047f, B:219:0x048c, B:222:0x05ec, B:224:0x05f4, B:226:0x05fc, B:229:0x0601, B:230:0x060d, B:232:0x0613, B:234:0x061b, B:239:0x062b, B:241:0x0631, B:243:0x0651, B:245:0x0657, B:238:0x065c, B:252:0x0661, B:254:0x0665, B:256:0x066b, B:258:0x066f, B:260:0x0677, B:262:0x067d, B:264:0x0687, B:267:0x068d, B:268:0x0690, B:270:0x0698, B:272:0x06aa, B:274:0x06b2, B:276:0x06ba, B:279:0x06c3, B:280:0x06ec, B:282:0x06f2, B:284:0x06f8, B:286:0x06ff, B:293:0x0707, B:296:0x070a, B:300:0x0715, B:302:0x071f, B:303:0x0726, B:305:0x0736, B:306:0x074e, B:308:0x0754, B:310:0x075c, B:312:0x0763, B:315:0x076c, B:319:0x077b, B:324:0x0788, B:326:0x078e, B:333:0x07a0, B:335:0x07a3, B:344:0x07ad, B:346:0x07b3, B:350:0x07bb, B:352:0x07c3, B:354:0x07c7, B:355:0x07d2, B:357:0x07d8, B:358:0x08c9, B:361:0x08d1, B:363:0x08d6, B:365:0x08de, B:367:0x08ec, B:369:0x08f3, B:373:0x08f7, B:375:0x08fd, B:377:0x0906, B:379:0x090c, B:381:0x0912, B:382:0x0931, B:384:0x0937, B:387:0x0940, B:390:0x0961, B:395:0x0954, B:397:0x0958, B:399:0x095e, B:401:0x0919, B:404:0x0927, B:405:0x092e, B:406:0x092f, B:407:0x07e2, B:409:0x07e9, B:411:0x07ed, B:414:0x0872, B:416:0x087e, B:419:0x07fc, B:421:0x0800, B:423:0x0814, B:424:0x081f, B:426:0x082b, B:429:0x0834, B:431:0x083e, B:436:0x0849, B:443:0x0882, B:445:0x0888, B:447:0x088c, B:450:0x0895, B:452:0x08a5, B:454:0x08ad, B:456:0x08b7, B:458:0x08bc, B:460:0x08c1, B:461:0x08c6, B:463:0x07a6, B:469:0x049d, B:471:0x04a3, B:473:0x04b0, B:476:0x04bb, B:478:0x04c0, B:481:0x04ce, B:484:0x04d4, B:486:0x04dc, B:490:0x04df, B:492:0x04e7, B:494:0x04f5, B:496:0x0532, B:498:0x053c, B:501:0x0547, B:503:0x054f, B:505:0x0552, B:508:0x0555, B:510:0x055b, B:512:0x056a, B:514:0x0570, B:516:0x057a, B:518:0x0584, B:520:0x0595, B:523:0x059e, B:525:0x05aa, B:528:0x05ac, B:530:0x05b2, B:533:0x05b7, B:535:0x05bd, B:537:0x05c5, B:539:0x05cb, B:541:0x05d1, B:545:0x05df, B:546:0x05e6, B:548:0x05e9, B:554:0x0489, B:556:0x0966, B:559:0x096d, B:561:0x0975, B:564:0x0993), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x094a  */
    /* JADX WARN: Type inference failed for: r3v11, types: [f6f, q7g] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r36) {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo.handleMessage(android.os.Message):boolean");
    }

    @Override // defpackage.sef
    public final void zzh() {
        this.h.zzi(22);
    }

    @Override // defpackage.y6g
    public final void zzj() {
        this.h.zzi(10);
    }
}
