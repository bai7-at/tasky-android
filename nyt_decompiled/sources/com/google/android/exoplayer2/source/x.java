package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.h;
import defpackage.a82;
import defpackage.aa1;
import defpackage.e06;
import defpackage.ei7;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.ku4;
import defpackage.ob;
import defpackage.pi4;
import defpackage.pt0;
import defpackage.q72;
import defpackage.s91;
import defpackage.t18;
import defpackage.up8;
import defpackage.ur;
import defpackage.v64;
import defpackage.wp8;
import defpackage.y77;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.z19;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class x implements n, a82, Loader.b, Loader.f, b0.d {
    private static final Map l0 = L();
    private static final t0 m0 = new t0.b().U("icy").g0("application/x-icy").G();
    private boolean B;
    private boolean H;
    private e L;
    private ei7 M;
    private boolean Q;
    private boolean X;
    private boolean Y;
    private int Z;
    private final Uri a;
    private final com.google.android.exoplayer2.upstream.a b;
    private final com.google.android.exoplayer2.drm.i c;
    private final com.google.android.exoplayer2.upstream.h d;
    private final p.a e;
    private boolean e0;
    private final h.a f;
    private long f0;
    private final b g;
    private final ob h;
    private boolean h0;
    private final String i;
    private int i0;
    private final long j;
    private boolean j0;
    private boolean k0;
    private final s l;
    private n.a t;
    private IcyHeaders u;
    private boolean y;
    private final Loader k = new Loader("ProgressiveMediaPeriod");
    private final pt0 m = new pt0();
    private final Runnable n = new Runnable() { // from class: com.google.android.exoplayer2.source.t
        @Override // java.lang.Runnable
        public final void run() {
            x.this.U();
        }
    };
    private final Runnable r = new Runnable() { // from class: com.google.android.exoplayer2.source.u
        @Override // java.lang.Runnable
        public final void run() {
            x.this.R();
        }
    };
    private final Handler s = z19.w();
    private d[] x = new d[0];
    private b0[] w = new b0[0];
    private long g0 = -9223372036854775807L;
    private long N = -9223372036854775807L;
    private int S = 1;

    final class a implements Loader.e, k.a {
        private final Uri b;
        private final t18 c;
        private final s d;
        private final a82 e;
        private final pt0 f;
        private volatile boolean h;
        private long j;
        private yp8 l;
        private boolean m;
        private final e06 g = new e06();
        private boolean i = true;
        private final long a = v64.a();
        private com.google.android.exoplayer2.upstream.b k = i(0);

        public a(Uri uri, com.google.android.exoplayer2.upstream.a aVar, s sVar, a82 a82Var, pt0 pt0Var) {
            this.b = uri;
            this.c = new t18(aVar);
            this.d = sVar;
            this.e = a82Var;
            this.f = pt0Var;
        }

        private com.google.android.exoplayer2.upstream.b i(long j) {
            return new b.C0195b().i(this.b).h(j).f(x.this.i).b(6).e(x.l0).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j, long j2) {
            this.g.a = j;
            this.j = j2;
            this.i = true;
            this.m = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            int i = 0;
            while (i == 0 && !this.h) {
                try {
                    long j = this.g.a;
                    com.google.android.exoplayer2.upstream.b i2 = i(j);
                    this.k = i2;
                    long b = this.c.b(i2);
                    if (b != -1) {
                        b += j;
                        x.this.Z();
                    }
                    long j2 = b;
                    x.this.u = IcyHeaders.a(this.c.f());
                    s91 s91Var = this.c;
                    if (x.this.u != null && x.this.u.metadataInterval != -1) {
                        s91Var = new k(this.c, x.this.u.metadataInterval, this);
                        yp8 O = x.this.O();
                        this.l = O;
                        O.d(x.m0);
                    }
                    long j3 = j;
                    this.d.c(s91Var, this.b, this.c.f(), j, j2, this.e);
                    if (x.this.u != null) {
                        this.d.b();
                    }
                    if (this.i) {
                        this.d.a(j3, this.j);
                        this.i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.h) {
                            try {
                                this.f.a();
                                i = this.d.e(this.g);
                                j3 = this.d.d();
                                if (j3 > x.this.j + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f.c();
                        x.this.s.post(x.this.r);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.d.d() != -1) {
                        this.g.a = this.d.d();
                    }
                    aa1.a(this.c);
                } catch (Throwable th) {
                    if (i != 1 && this.d.d() != -1) {
                        this.g.a = this.d.d();
                    }
                    aa1.a(this.c);
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.k.a
        public void b(yo5 yo5Var) {
            long max = !this.m ? this.j : Math.max(x.this.N(true), this.j);
            int a = yo5Var.a();
            yp8 yp8Var = (yp8) ur.e(this.l);
            yp8Var.a(yo5Var, a);
            yp8Var.b(max, 1, a, 0, null);
            this.m = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
            this.h = true;
        }
    }

    interface b {
        void l(long j, boolean z, boolean z2);
    }

    private final class c implements y77 {
        private final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // defpackage.y77
        public void a() {
            x.this.Y(this.a);
        }

        @Override // defpackage.y77
        public boolean g() {
            return x.this.Q(this.a);
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            return x.this.e0(this.a, ep2Var, decoderInputBuffer, i);
        }

        @Override // defpackage.y77
        public int s(long j) {
            return x.this.i0(this.a, j);
        }
    }

    private static final class d {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    private static final class e {
        public final wp8 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(wp8 wp8Var, boolean[] zArr) {
            this.a = wp8Var;
            this.b = zArr;
            int i = wp8Var.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    public x(Uri uri, com.google.android.exoplayer2.upstream.a aVar, s sVar, com.google.android.exoplayer2.drm.i iVar, h.a aVar2, com.google.android.exoplayer2.upstream.h hVar, p.a aVar3, b bVar, ob obVar, String str, int i) {
        this.a = uri;
        this.b = aVar;
        this.c = iVar;
        this.f = aVar2;
        this.d = hVar;
        this.e = aVar3;
        this.g = bVar;
        this.h = obVar;
        this.i = str;
        this.j = i;
        this.l = sVar;
    }

    private void J() {
        ur.g(this.B);
        ur.e(this.L);
        ur.e(this.M);
    }

    private boolean K(a aVar, int i) {
        ei7 ei7Var;
        if (this.e0 || !((ei7Var = this.M) == null || ei7Var.i() == -9223372036854775807L)) {
            this.i0 = i;
            return true;
        }
        if (this.B && !k0()) {
            this.h0 = true;
            return false;
        }
        this.Y = this.B;
        this.f0 = 0L;
        this.i0 = 0;
        for (b0 b0Var : this.w) {
            b0Var.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map L() {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return Collections.unmodifiableMap(hashMap);
    }

    private int M() {
        int i = 0;
        for (b0 b0Var : this.w) {
            i += b0Var.G();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.w.length; i++) {
            if (z || ((e) ur.e(this.L)).c[i]) {
                j = Math.max(j, this.w[i].z());
            }
        }
        return j;
    }

    private boolean P() {
        return this.g0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (this.k0) {
            return;
        }
        ((n.a) ur.e(this.t)).g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.e0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.k0 || this.B || !this.y || this.M == null) {
            return;
        }
        for (b0 b0Var : this.w) {
            if (b0Var.F() == null) {
                return;
            }
        }
        this.m.c();
        int length = this.w.length;
        up8[] up8VarArr = new up8[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            t0 t0Var = (t0) ur.e(this.w[i].F());
            String str = t0Var.l;
            boolean o = ku4.o(str);
            boolean z = o || ku4.s(str);
            zArr[i] = z;
            this.H = z | this.H;
            IcyHeaders icyHeaders = this.u;
            if (icyHeaders != null) {
                if (o || this.x[i].b) {
                    Metadata metadata = t0Var.j;
                    t0Var = t0Var.c().Z(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders)).G();
                }
                if (o && t0Var.f == -1 && t0Var.g == -1 && icyHeaders.bitrate != -1) {
                    t0Var = t0Var.c().I(icyHeaders.bitrate).G();
                }
            }
            up8VarArr[i] = new up8(Integer.toString(i), t0Var.d(this.c.a(t0Var)));
        }
        this.L = new e(new wp8(up8VarArr), zArr);
        this.B = true;
        ((n.a) ur.e(this.t)).o(this);
    }

    private void V(int i) {
        J();
        e eVar = this.L;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        t0 d2 = eVar.a.c(i).d(0);
        this.e.h(ku4.k(d2.l), d2, 0, null, this.f0);
        zArr[i] = true;
    }

    private void W(int i) {
        J();
        boolean[] zArr = this.L.b;
        if (this.h0 && zArr[i]) {
            if (this.w[i].K(false)) {
                return;
            }
            this.g0 = 0L;
            this.h0 = false;
            this.Y = true;
            this.f0 = 0L;
            this.i0 = 0;
            for (b0 b0Var : this.w) {
                b0Var.V();
            }
            ((n.a) ur.e(this.t)).g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.s.post(new Runnable() { // from class: com.google.android.exoplayer2.source.v
            @Override // java.lang.Runnable
            public final void run() {
                x.this.S();
            }
        });
    }

    private yp8 d0(d dVar) {
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.x[i])) {
                return this.w[i];
            }
        }
        b0 k = b0.k(this.h, this.c, this.f);
        k.d0(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.x, i2);
        dVarArr[length] = dVar;
        this.x = (d[]) z19.k(dVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.w, i2);
        b0VarArr[length] = k;
        this.w = (b0[]) z19.k(b0VarArr);
        return k;
    }

    private boolean g0(boolean[] zArr, long j) {
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            if (!this.w[i].Z(j, false) && (zArr[i] || !this.H)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void T(ei7 ei7Var) {
        this.M = this.u == null ? ei7Var : new ei7.b(-9223372036854775807L);
        this.N = ei7Var.i();
        boolean z = !this.e0 && ei7Var.i() == -9223372036854775807L;
        this.Q = z;
        this.S = z ? 7 : 1;
        this.g.l(this.N, ei7Var.h(), this.Q);
        if (this.B) {
            return;
        }
        U();
    }

    private void j0() {
        a aVar = new a(this.a, this.b, this.l, this, this.m);
        if (this.B) {
            ur.g(P());
            long j = this.N;
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            aVar.j(((ei7) ur.e(this.M)).f(this.g0).a.b, this.g0);
            for (b0 b0Var : this.w) {
                b0Var.b0(this.g0);
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = M();
        this.e.z(new v64(aVar.a, aVar.k, this.k.n(aVar, this, this.d.b(this.S))), 1, -1, null, 0, null, aVar.j, this.N);
    }

    private boolean k0() {
        return this.Y || P();
    }

    yp8 O() {
        return d0(new d(0, true));
    }

    boolean Q(int i) {
        return !k0() && this.w[i].K(this.j0);
    }

    void X() {
        this.k.k(this.d.b(this.S));
    }

    void Y(int i) {
        this.w[i].N();
        X();
    }

    @Override // defpackage.a82
    public yp8 a(int i, int i2) {
        return d0(new d(i, false));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void e(a aVar, long j, long j2, boolean z) {
        t18 t18Var = aVar.c;
        v64 v64Var = new v64(aVar.a, aVar.k, t18Var.s(), t18Var.t(), j, j2, t18Var.k());
        this.d.d(aVar.a);
        this.e.q(v64Var, 1, -1, null, 0, null, aVar.j, this.N);
        if (z) {
            return;
        }
        for (b0 b0Var : this.w) {
            b0Var.V();
        }
        if (this.Z > 0) {
            ((n.a) ur.e(this.t)).g(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.k.j() && this.m.d();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void k(a aVar, long j, long j2) {
        ei7 ei7Var;
        if (this.N == -9223372036854775807L && (ei7Var = this.M) != null) {
            boolean h = ei7Var.h();
            long N = N(true);
            long j3 = N == Long.MIN_VALUE ? 0L : N + 10000;
            this.N = j3;
            this.g.l(j3, h, this.Q);
        }
        t18 t18Var = aVar.c;
        v64 v64Var = new v64(aVar.a, aVar.k, t18Var.s(), t18Var.t(), j, j2, t18Var.k());
        this.d.d(aVar.a);
        this.e.t(v64Var, 1, -1, null, 0, null, aVar.j, this.N);
        this.j0 = true;
        ((n.a) ur.e(this.t)).g(this);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return h();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public Loader.c o(a aVar, long j, long j2, IOException iOException, int i) {
        Loader.c h;
        t18 t18Var = aVar.c;
        v64 v64Var = new v64(aVar.a, aVar.k, t18Var.s(), t18Var.t(), j, j2, t18Var.k());
        long a2 = this.d.a(new h.c(v64Var, new pi4(1, -1, null, 0, null, z19.h1(aVar.j), z19.h1(this.N)), iOException, i));
        if (a2 == -9223372036854775807L) {
            h = Loader.g;
        } else {
            int M = M();
            h = K(aVar, M) ? Loader.h(M > this.i0, a2) : Loader.f;
        }
        boolean c2 = h.c();
        this.e.v(v64Var, 1, -1, null, 0, null, aVar.j, this.N, iOException, !c2);
        if (!c2) {
            this.d.d(aVar.a);
        }
        return h;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        J();
        if (!this.M.h()) {
            return 0L;
        }
        ei7.a f = this.M.f(j);
        return fi7Var.a(j, f.a.a, f.b.a);
    }

    int e0(int i, ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (k0()) {
            return -3;
        }
        V(i);
        int S = this.w[i].S(ep2Var, decoderInputBuffer, i2, this.j0);
        if (S == -3) {
            W(i);
        }
        return S;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        if (this.j0 || this.k.i() || this.h0) {
            return false;
        }
        if (this.B && this.Z == 0) {
            return false;
        }
        boolean e2 = this.m.e();
        if (this.k.j()) {
            return e2;
        }
        j0();
        return true;
    }

    public void f0() {
        if (this.B) {
            for (b0 b0Var : this.w) {
                b0Var.R();
            }
        }
        this.k.m(this);
        this.s.removeCallbacksAndMessages(null);
        this.t = null;
        this.k0 = true;
    }

    @Override // com.google.android.exoplayer2.source.b0.d
    public void g(t0 t0Var) {
        this.s.post(this.n);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        long j;
        J();
        if (this.j0 || this.Z == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.g0;
        }
        if (this.H) {
            int length = this.w.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.L;
                if (eVar.b[i] && eVar.c[i] && !this.w[i].J()) {
                    j = Math.min(j, this.w[i].z());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = N(false);
        }
        return j == Long.MIN_VALUE ? this.f0 : j;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
    }

    int i0(int i, long j) {
        if (k0()) {
            return 0;
        }
        V(i);
        b0 b0Var = this.w[i];
        int E = b0Var.E(j, this.j0);
        b0Var.e0(E);
        if (E == 0) {
            W(i);
        }
        return E;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        q72 q72Var;
        J();
        e eVar = this.L;
        wp8 wp8Var = eVar.a;
        boolean[] zArr3 = eVar.c;
        int i = this.Z;
        int i2 = 0;
        for (int i3 = 0; i3 < q72VarArr.length; i3++) {
            y77 y77Var = y77VarArr[i3];
            if (y77Var != null && (q72VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) y77Var).a;
                ur.g(zArr3[i4]);
                this.Z--;
                zArr3[i4] = false;
                y77VarArr[i3] = null;
            }
        }
        boolean z = !this.X ? j == 0 : i != 0;
        for (int i5 = 0; i5 < q72VarArr.length; i5++) {
            if (y77VarArr[i5] == null && (q72Var = q72VarArr[i5]) != null) {
                ur.g(q72Var.length() == 1);
                ur.g(q72Var.g(0) == 0);
                int d2 = wp8Var.d(q72Var.n());
                ur.g(!zArr3[d2]);
                this.Z++;
                zArr3[d2] = true;
                y77VarArr[i5] = new c(d2);
                zArr2[i5] = true;
                if (!z) {
                    b0 b0Var = this.w[d2];
                    z = (b0Var.Z(j, true) || b0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.Z == 0) {
            this.h0 = false;
            this.Y = false;
            if (this.k.j()) {
                b0[] b0VarArr = this.w;
                int length = b0VarArr.length;
                while (i2 < length) {
                    b0VarArr[i2].r();
                    i2++;
                }
                this.k.f();
            } else {
                b0[] b0VarArr2 = this.w;
                int length2 = b0VarArr2.length;
                while (i2 < length2) {
                    b0VarArr2[i2].V();
                    i2++;
                }
            }
        } else if (z) {
            j = l(j);
            while (i2 < y77VarArr.length) {
                if (y77VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.X = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        J();
        boolean[] zArr = this.L.b;
        if (!this.M.h()) {
            j = 0;
        }
        int i = 0;
        this.Y = false;
        this.f0 = j;
        if (P()) {
            this.g0 = j;
            return j;
        }
        if (this.S != 7 && g0(zArr, j)) {
            return j;
        }
        this.h0 = false;
        this.g0 = j;
        this.j0 = false;
        if (this.k.j()) {
            b0[] b0VarArr = this.w;
            int length = b0VarArr.length;
            while (i < length) {
                b0VarArr[i].r();
                i++;
            }
            this.k.f();
        } else {
            this.k.g();
            b0[] b0VarArr2 = this.w;
            int length2 = b0VarArr2.length;
            while (i < length2) {
                b0VarArr2[i].V();
                i++;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        if (!this.Y) {
            return -9223372036854775807L;
        }
        if (!this.j0 && M() <= this.i0) {
            return -9223372036854775807L;
        }
        this.Y = false;
        return this.f0;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.t = aVar;
        this.m.e();
        j0();
    }

    @Override // defpackage.a82
    public void p(final ei7 ei7Var) {
        this.s.post(new Runnable() { // from class: com.google.android.exoplayer2.source.w
            @Override // java.lang.Runnable
            public final void run() {
                x.this.T(ei7Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        for (b0 b0Var : this.w) {
            b0Var.T();
        }
        this.l.release();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        X();
        if (this.j0 && !this.B) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // defpackage.a82
    public void s() {
        this.y = true;
        this.s.post(this.n);
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        J();
        return this.L.a;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.L.c;
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            this.w[i].q(j, z, zArr[i]);
        }
    }
}
