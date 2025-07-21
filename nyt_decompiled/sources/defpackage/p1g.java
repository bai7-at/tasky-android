package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.ho;
import com.google.android.gms.internal.ads.zzaga;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class p1g implements xzf, sv9, k8g, t8g, n2g {
    private static final Map l0;
    private static final l6a m0;
    private o1g B;
    private gx9 H;
    private long L;
    private boolean M;
    private int N;
    private boolean Q;
    private boolean S;
    private int X;
    private boolean Y;
    private long Z;
    private final Uri a;
    private final kye b;
    private final kwf c;
    private final x0g d;
    private final ewf e;
    private long e0;
    private final k1g f;
    private boolean f0;
    private final long g;
    private int g0;
    private final w8g h = new w8g("ProgressiveMediaPeriod");
    private boolean h0;
    private final c1g i;
    private boolean i0;
    private final jfd j;
    private final j8g j0;
    private final Runnable k;
    private final s7g k0;
    private final Runnable l;
    private final Handler m;
    private final boolean n;
    private wzf r;
    private zzaga s;
    private o2g[] t;
    private n1g[] u;
    private boolean w;
    private boolean x;
    private boolean y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        l0 = Collections.unmodifiableMap(hashMap);
        x3a x3aVar = new x3a();
        x3aVar.k("icy");
        x3aVar.w("application/x-icy");
        m0 = x3aVar.D();
    }

    public p1g(Uri uri, kye kyeVar, c1g c1gVar, kwf kwfVar, ewf ewfVar, j8g j8gVar, x0g x0gVar, k1g k1gVar, s7g s7gVar, String str, int i, long j) {
        this.a = uri;
        this.b = kyeVar;
        this.c = kwfVar;
        this.e = ewfVar;
        this.j0 = j8gVar;
        this.d = x0gVar;
        this.f = k1gVar;
        this.k0 = s7gVar;
        this.g = i;
        this.i = c1gVar;
        this.L = j;
        this.n = j != -9223372036854775807L;
        this.j = new jfd(acd.a);
        this.k = new Runnable() { // from class: e1g
            @Override // java.lang.Runnable
            public final void run() {
                p1g.this.C();
            }
        };
        this.l = new Runnable() { // from class: f1g
            @Override // java.lang.Runnable
            public final void run() {
                p1g.this.q();
            }
        };
        this.m = khe.L(null);
        this.u = new n1g[0];
        this.t = new o2g[0];
        this.e0 = -9223372036854775807L;
        this.N = 1;
    }

    private final tx9 A(n1g n1gVar) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (n1gVar.equals(this.u[i])) {
                return this.t[i];
            }
        }
        o2g o2gVar = new o2g(this.k0, this.c, this.e);
        o2gVar.J(this);
        int i2 = length + 1;
        n1g[] n1gVarArr = (n1g[]) Arrays.copyOf(this.u, i2);
        n1gVarArr[length] = n1gVar;
        int i3 = khe.a;
        this.u = n1gVarArr;
        o2g[] o2gVarArr = (o2g[]) Arrays.copyOf(this.t, i2);
        o2gVarArr[length] = o2gVar;
        this.t = o2gVarArr;
        return o2gVar;
    }

    private final void B() {
        wad.f(this.x);
        this.B.getClass();
        this.H.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        int i;
        if (this.i0 || this.x || !this.w || this.H == null) {
            return;
        }
        for (o2g o2gVar : this.t) {
            if (o2gVar.A() == null) {
                return;
            }
        }
        this.j.c();
        int length = this.t.length;
        v3c[] v3cVarArr = new v3c[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            l6a A = this.t[i2].A();
            A.getClass();
            String str = A.l;
            boolean g = qcb.g(str);
            boolean z = g || qcb.h(str);
            zArr[i2] = z;
            this.y = z | this.y;
            zzaga zzagaVar = this.s;
            if (zzagaVar != null) {
                if (g || this.u[i2].b) {
                    zzby zzbyVar = A.j;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzagaVar) : zzbyVar.c(zzagaVar);
                    x3a b = A.b();
                    b.p(zzbyVar2);
                    A = b.D();
                }
                if (g && A.f == -1 && A.g == -1 && (i = zzagaVar.zza) != -1) {
                    x3a b2 = A.b();
                    b2.j0(i);
                    A = b2.D();
                }
            }
            v3cVarArr[i2] = new v3c(Integer.toString(i2), A.c(this.c.a(A)));
        }
        this.B = new o1g(new z2g(v3cVarArr), zArr);
        this.x = true;
        wzf wzfVar = this.r;
        wzfVar.getClass();
        wzfVar.d(this);
    }

    private final void D(int i) {
        B();
        o1g o1gVar = this.B;
        boolean[] zArr = o1gVar.d;
        if (zArr[i]) {
            return;
        }
        l6a b = o1gVar.a.b(i).b(0);
        this.d.c(new vzf(1, qcb.b(b.l), b, 0, null, khe.I(this.Z), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void E(int i) {
        B();
        boolean[] zArr = this.B.b;
        if (this.f0 && zArr[i] && !this.t[i].M(false)) {
            this.e0 = 0L;
            this.f0 = false;
            this.S = true;
            this.Z = 0L;
            this.g0 = 0;
            for (o2g o2gVar : this.t) {
                o2gVar.H(false);
            }
            wzf wzfVar = this.r;
            wzfVar.getClass();
            wzfVar.b(this);
        }
    }

    private final void F() {
        u1f u1fVar;
        long j;
        long j2;
        i1g i1gVar = new i1g(this, this.a, this.b, this.i, this, this.j);
        if (this.x) {
            wad.f(G());
            long j3 = this.L;
            if (j3 != -9223372036854775807L && this.e0 > j3) {
                this.h0 = true;
                this.e0 = -9223372036854775807L;
                return;
            }
            gx9 gx9Var = this.H;
            gx9Var.getClass();
            i1g.f(i1gVar, gx9Var.a(this.e0).a.b, this.e0);
            for (o2g o2gVar : this.t) {
                o2gVar.I(this.e0);
            }
            this.e0 = -9223372036854775807L;
        }
        this.g0 = y();
        long a = this.h.a(i1gVar, this, j8g.a(this.N));
        u1fVar = i1gVar.k;
        x0g x0gVar = this.d;
        j = i1gVar.a;
        mzf mzfVar = new mzf(j, u1fVar, u1fVar.a, Collections.emptyMap(), a, 0L, 0L);
        j2 = i1gVar.j;
        x0gVar.g(mzfVar, new vzf(1, -1, null, 0, null, khe.I(j2), khe.I(this.L)));
    }

    private final boolean G() {
        return this.e0 != -9223372036854775807L;
    }

    private final boolean H() {
        return this.S || G();
    }

    static /* bridge */ /* synthetic */ long M(p1g p1gVar, boolean z) {
        return p1gVar.z(true);
    }

    static /* bridge */ /* synthetic */ void p(final p1g p1gVar) {
        p1gVar.m.post(new Runnable() { // from class: d1g
            @Override // java.lang.Runnable
            public final void run() {
                p1g.this.r();
            }
        });
    }

    private final int y() {
        int i = 0;
        for (o2g o2gVar : this.t) {
            i += o2gVar.x();
        }
        return i;
    }

    private final long z(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            o2g[] o2gVarArr = this.t;
            if (i >= o2gVarArr.length) {
                return j;
            }
            if (!z) {
                o1g o1gVar = this.B;
                o1gVar.getClass();
                i = o1gVar.c[i] ? 0 : i + 1;
            }
            j = Math.max(j, o2gVarArr[i].z());
        }
    }

    final int I(int i, kdf kdfVar, n7f n7fVar, int i2) {
        if (H()) {
            return -3;
        }
        D(i);
        int y = this.t[i].y(kdfVar, n7fVar, i2, this.h0);
        if (y == -3) {
            E(i);
        }
        return y;
    }

    final int J(int i, long j) {
        if (H()) {
            return 0;
        }
        D(i);
        o2g o2gVar = this.t[i];
        int w = o2gVar.w(j, this.h0);
        o2gVar.K(w);
        if (w != 0) {
            return w;
        }
        E(i);
        return 0;
    }

    final tx9 P() {
        return A(new n1g(0, true));
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean a(ho hoVar) {
        if (this.h0) {
            return false;
        }
        w8g w8gVar = this.h;
        if (w8gVar.k() || this.f0) {
            return false;
        }
        if (this.x && this.X == 0) {
            return false;
        }
        boolean e = this.j.e();
        if (w8gVar.l()) {
            return e;
        }
        F();
        return true;
    }

    @Override // defpackage.sv9
    public final void b() {
        this.w = true;
        this.m.post(this.k);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final void c(long j) {
    }

    @Override // defpackage.k8g
    public final /* bridge */ /* synthetic */ void d(r8g r8gVar, long j, long j2) {
        c6f c6fVar;
        long j3;
        u1f u1fVar;
        long j4;
        gx9 gx9Var;
        long unused;
        if (this.L == -9223372036854775807L && (gx9Var = this.H) != null) {
            boolean zzh = gx9Var.zzh();
            long z = z(true);
            long j5 = z == Long.MIN_VALUE ? 0L : z + 10000;
            this.L = j5;
            this.f.b(j5, zzh, this.M);
        }
        i1g i1gVar = (i1g) r8gVar;
        c6fVar = i1gVar.c;
        j3 = i1gVar.a;
        u1fVar = i1gVar.k;
        mzf mzfVar = new mzf(j3, u1fVar, c6fVar.l(), c6fVar.m(), j, j2, c6fVar.k());
        unused = i1gVar.a;
        x0g x0gVar = this.d;
        j4 = i1gVar.j;
        x0gVar.e(mzfVar, new vzf(1, -1, null, 0, null, khe.I(j4), khe.I(this.L)));
        this.h0 = true;
        wzf wzfVar = this.r;
        wzfVar.getClass();
        wzfVar.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    @Override // defpackage.xzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.o6g[] r8, boolean[] r9, defpackage.p2g[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1g.e(o6g[], boolean[], p2g[], boolean[], long):long");
    }

    @Override // defpackage.xzf
    public final long f(long j) {
        int i;
        B();
        boolean[] zArr = this.B.b;
        if (true != this.H.zzh()) {
            j = 0;
        }
        this.S = false;
        this.Z = j;
        if (G()) {
            this.e0 = j;
            return j;
        }
        if (this.N != 7) {
            int length = this.t.length;
            for (0; i < length; i + 1) {
                o2g o2gVar = this.t[i];
                i = ((this.n ? o2gVar.N(o2gVar.u()) : o2gVar.g(j, false)) || (!zArr[i] && this.y)) ? i + 1 : 0;
            }
            return j;
        }
        this.f0 = false;
        this.e0 = j;
        this.h0 = false;
        w8g w8gVar = this.h;
        if (w8gVar.l()) {
            for (o2g o2gVar2 : this.t) {
                o2gVar2.C();
            }
            this.h.g();
        } else {
            w8gVar.h();
            for (o2g o2gVar3 : this.t) {
                o2gVar3.H(false);
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // defpackage.k8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.n8g g(defpackage.r8g r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1g.g(r8g, long, long, java.io.IOException, int):n8g");
    }

    @Override // defpackage.n2g
    public final void h(l6a l6aVar) {
        this.m.post(this.k);
    }

    @Override // defpackage.xzf
    public final void i(long j, boolean z) {
        if (this.n) {
            return;
        }
        B();
        if (G()) {
            return;
        }
        boolean[] zArr = this.B.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].B(j, false, zArr[i]);
        }
    }

    @Override // defpackage.xzf
    public final long j(long j, ggf ggfVar) {
        B();
        if (!this.H.zzh()) {
            return 0L;
        }
        ex9 a = this.H.a(j);
        hx9 hx9Var = a.a;
        hx9 hx9Var2 = a.b;
        long j2 = ggfVar.a;
        if (j2 == 0) {
            if (ggfVar.b == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = hx9Var.a;
        int i = khe.a;
        long j4 = j - j2;
        long j5 = ggfVar.b;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j2 ^ j) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = hx9Var2.a;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // defpackage.k8g
    public final /* bridge */ /* synthetic */ void k(r8g r8gVar, long j, long j2, boolean z) {
        c6f c6fVar;
        long j3;
        u1f u1fVar;
        long j4;
        long unused;
        i1g i1gVar = (i1g) r8gVar;
        c6fVar = i1gVar.c;
        j3 = i1gVar.a;
        u1fVar = i1gVar.k;
        mzf mzfVar = new mzf(j3, u1fVar, c6fVar.l(), c6fVar.m(), j, j2, c6fVar.k());
        unused = i1gVar.a;
        j4 = i1gVar.j;
        this.d.d(mzfVar, new vzf(1, -1, null, 0, null, khe.I(j4), khe.I(this.L)));
        if (z) {
            return;
        }
        for (o2g o2gVar : this.t) {
            o2gVar.H(false);
        }
        if (this.X > 0) {
            wzf wzfVar = this.r;
            wzfVar.getClass();
            wzfVar.b(this);
        }
    }

    @Override // defpackage.xzf
    public final void l(wzf wzfVar, long j) {
        this.r = wzfVar;
        this.j.e();
        F();
    }

    @Override // defpackage.sv9
    public final void m(final gx9 gx9Var) {
        this.m.post(new Runnable() { // from class: g1g
            @Override // java.lang.Runnable
            public final void run() {
                p1g.this.s(gx9Var);
            }
        });
    }

    final /* synthetic */ void q() {
        if (this.i0) {
            return;
        }
        wzf wzfVar = this.r;
        wzfVar.getClass();
        wzfVar.b(this);
    }

    final /* synthetic */ void r() {
        this.Y = true;
    }

    final /* synthetic */ void s(gx9 gx9Var) {
        this.H = this.s == null ? gx9Var : new fx9(-9223372036854775807L, 0L);
        if (gx9Var.zza() == -9223372036854775807L && this.L != -9223372036854775807L) {
            this.H = new h1g(this, this.H);
        }
        this.L = this.H.zza();
        boolean z = false;
        if (!this.Y && gx9Var.zza() == -9223372036854775807L) {
            z = true;
        }
        this.M = z;
        this.N = true == z ? 7 : 1;
        this.f.b(this.L, gx9Var.zzh(), this.M);
        if (this.x) {
            return;
        }
        C();
    }

    final void t() {
        this.h.i(j8g.a(this.N));
    }

    @Override // defpackage.t8g
    public final void u() {
        for (o2g o2gVar : this.t) {
            o2gVar.G();
        }
        this.i.zze();
    }

    final void v(int i) {
        this.t[i].E();
        t();
    }

    public final void w() {
        if (this.x) {
            for (o2g o2gVar : this.t) {
                o2gVar.F();
            }
        }
        this.h.j(this);
        this.m.removeCallbacksAndMessages(null);
        this.r = null;
        this.i0 = true;
    }

    final boolean x(int i) {
        return !H() && this.t[i].M(this.h0);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzb() {
        long j;
        B();
        if (this.h0 || this.X == 0) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.e0;
        }
        if (this.y) {
            int length = this.t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                o1g o1gVar = this.B;
                if (o1gVar.b[i] && o1gVar.c[i] && !this.t[i].L()) {
                    j = Math.min(j, this.t[i].z());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = z(false);
        }
        return j == Long.MIN_VALUE ? this.Z : j;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzc() {
        return zzb();
    }

    @Override // defpackage.xzf
    public final long zzd() {
        if (!this.S) {
            return -9223372036854775807L;
        }
        if (!this.h0 && y() <= this.g0) {
            return -9223372036854775807L;
        }
        this.S = false;
        return this.Z;
    }

    @Override // defpackage.xzf
    public final z2g zzh() {
        B();
        return this.B.a;
    }

    @Override // defpackage.xzf
    public final void zzk() {
        t();
        if (this.h0 && !this.x) {
            throw zzcc.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean zzp() {
        return this.h.l() && this.j.d();
    }

    @Override // defpackage.sv9
    public final tx9 zzw(int i, int i2) {
        return A(new n1g(i, false));
    }
}
