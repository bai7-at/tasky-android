package defpackage;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class tk0 implements y77, c0, Loader.b, Loader.f {
    private s50 B;
    boolean H;
    public final int a;
    private final int[] b;
    private final t0[] c;
    private final boolean[] d;
    private final uk0 e;
    private final c0.a f;
    private final p.a g;
    private final h h;
    private final Loader i;
    private final qk0 j;
    private final ArrayList k;
    private final List l;
    private final b0 m;
    private final b0[] n;
    private final u50 r;
    private ok0 s;
    private t0 t;
    private b u;
    private long w;
    private long x;
    private int y;

    public final class a implements y77 {
        public final tk0 a;
        private final b0 b;
        private final int c;
        private boolean d;

        public a(tk0 tk0Var, b0 b0Var, int i) {
            this.a = tk0Var;
            this.b = b0Var;
            this.c = i;
        }

        private void b() {
            if (this.d) {
                return;
            }
            tk0.this.g.h(tk0.this.b[this.c], tk0.this.c[this.c], 0, null, tk0.this.x);
            this.d = true;
        }

        @Override // defpackage.y77
        public void a() {
        }

        public void c() {
            ur.g(tk0.this.d[this.c]);
            tk0.this.d[this.c] = false;
        }

        @Override // defpackage.y77
        public boolean g() {
            return !tk0.this.I() && this.b.K(tk0.this.H);
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            if (tk0.this.I()) {
                return -3;
            }
            if (tk0.this.B != null && tk0.this.B.i(this.c + 1) <= this.b.C()) {
                return -3;
            }
            b();
            return this.b.S(ep2Var, decoderInputBuffer, i, tk0.this.H);
        }

        @Override // defpackage.y77
        public int s(long j) {
            if (tk0.this.I()) {
                return 0;
            }
            int E = this.b.E(j, tk0.this.H);
            if (tk0.this.B != null) {
                E = Math.min(E, tk0.this.B.i(this.c + 1) - this.b.C());
            }
            this.b.e0(E);
            if (E > 0) {
                b();
            }
            return E;
        }
    }

    public interface b {
        void a(tk0 tk0Var);
    }

    public tk0(int i, int[] iArr, t0[] t0VarArr, uk0 uk0Var, c0.a aVar, ob obVar, long j, i iVar, h.a aVar2, com.google.android.exoplayer2.upstream.h hVar, p.a aVar3) {
        this.a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = t0VarArr == null ? new t0[0] : t0VarArr;
        this.e = uk0Var;
        this.f = aVar;
        this.g = aVar3;
        this.h = hVar;
        this.i = new Loader("ChunkSampleStream");
        this.j = new qk0();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new b0[length];
        this.d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        b0[] b0VarArr = new b0[i3];
        b0 k = b0.k(obVar, iVar, aVar2);
        this.m = k;
        iArr2[0] = i;
        b0VarArr[0] = k;
        while (i2 < length) {
            b0 l = b0.l(obVar);
            this.n[i2] = l;
            int i4 = i2 + 1;
            b0VarArr[i4] = l;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.r = new u50(iArr2, b0VarArr);
        this.w = j;
        this.x = j;
    }

    private void B(int i) {
        int min = Math.min(O(i, 0), this.y);
        if (min > 0) {
            z19.O0(this.k, 0, min);
            this.y -= min;
        }
    }

    private void C(int i) {
        ur.g(!this.i.j());
        int size = this.k.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!G(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = F().h;
        s50 D = D(i);
        if (this.k.isEmpty()) {
            this.w = this.x;
        }
        this.H = false;
        this.g.C(this.a, D.g, j);
    }

    private s50 D(int i) {
        s50 s50Var = (s50) this.k.get(i);
        ArrayList arrayList = this.k;
        z19.O0(arrayList, i, arrayList.size());
        this.y = Math.max(this.y, this.k.size());
        int i2 = 0;
        this.m.u(s50Var.i(0));
        while (true) {
            b0[] b0VarArr = this.n;
            if (i2 >= b0VarArr.length) {
                return s50Var;
            }
            b0 b0Var = b0VarArr[i2];
            i2++;
            b0Var.u(s50Var.i(i2));
        }
    }

    private s50 F() {
        return (s50) this.k.get(r1.size() - 1);
    }

    private boolean G(int i) {
        int C;
        s50 s50Var = (s50) this.k.get(i);
        if (this.m.C() > s50Var.i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            b0[] b0VarArr = this.n;
            if (i2 >= b0VarArr.length) {
                return false;
            }
            C = b0VarArr[i2].C();
            i2++;
        } while (C <= s50Var.i(i2));
        return true;
    }

    private boolean H(ok0 ok0Var) {
        return ok0Var instanceof s50;
    }

    private void J() {
        int O = O(this.m.C(), this.y - 1);
        while (true) {
            int i = this.y;
            if (i > O) {
                return;
            }
            this.y = i + 1;
            K(i);
        }
    }

    private void K(int i) {
        s50 s50Var = (s50) this.k.get(i);
        t0 t0Var = s50Var.d;
        if (!t0Var.equals(this.t)) {
            this.g.h(this.a, t0Var, s50Var.e, s50Var.f, s50Var.g);
        }
        this.t = t0Var;
    }

    private int O(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.k.size()) {
                return this.k.size() - 1;
            }
        } while (((s50) this.k.get(i2)).i(0) <= i);
        return i2 - 1;
    }

    private void R() {
        this.m.V();
        for (b0 b0Var : this.n) {
            b0Var.V();
        }
    }

    public uk0 E() {
        return this.e;
    }

    boolean I() {
        return this.w != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void e(ok0 ok0Var, long j, long j2, boolean z) {
        this.s = null;
        this.B = null;
        v64 v64Var = new v64(ok0Var.a, ok0Var.b, ok0Var.f(), ok0Var.e(), j, j2, ok0Var.b());
        this.h.d(ok0Var.a);
        this.g.q(v64Var, ok0Var.c, this.a, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        if (z) {
            return;
        }
        if (I()) {
            R();
        } else if (H(ok0Var)) {
            D(this.k.size() - 1);
            if (this.k.isEmpty()) {
                this.w = this.x;
            }
        }
        this.f.g(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void k(ok0 ok0Var, long j, long j2) {
        this.s = null;
        this.e.e(ok0Var);
        v64 v64Var = new v64(ok0Var.a, ok0Var.b, ok0Var.f(), ok0Var.e(), j, j2, ok0Var.b());
        this.h.d(ok0Var.a);
        this.g.t(v64Var, ok0Var.c, this.a, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        this.f.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.upstream.Loader.c o(defpackage.ok0 r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk0.o(ok0, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    public void P() {
        Q(null);
    }

    public void Q(b bVar) {
        this.u = bVar;
        this.m.R();
        for (b0 b0Var : this.n) {
            b0Var.R();
        }
        this.i.m(this);
    }

    public void S(long j) {
        s50 s50Var;
        this.x = j;
        if (I()) {
            this.w = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            s50Var = (s50) this.k.get(i2);
            long j2 = s50Var.g;
            if (j2 == j && s50Var.k == -9223372036854775807L) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        s50Var = null;
        if (s50Var != null ? this.m.Y(s50Var.i(0)) : this.m.Z(j, j < c())) {
            this.y = O(this.m.C(), 0);
            b0[] b0VarArr = this.n;
            int length = b0VarArr.length;
            while (i < length) {
                b0VarArr[i].Z(j, true);
                i++;
            }
            return;
        }
        this.w = j;
        this.H = false;
        this.k.clear();
        this.y = 0;
        if (!this.i.j()) {
            this.i.g();
            R();
            return;
        }
        this.m.r();
        b0[] b0VarArr2 = this.n;
        int length2 = b0VarArr2.length;
        while (i < length2) {
            b0VarArr2[i].r();
            i++;
        }
        this.i.f();
    }

    public a T(long j, int i) {
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.b[i2] == i) {
                ur.g(!this.d[i2]);
                this.d[i2] = true;
                this.n[i2].Z(j, true);
                return new a(this, this.n[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.y77
    public void a() {
        this.i.a();
        this.m.N();
        if (this.i.j()) {
            return;
        }
        this.e.a();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.i.j();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long c() {
        if (I()) {
            return this.w;
        }
        if (this.H) {
            return Long.MIN_VALUE;
        }
        return F().h;
    }

    public long d(long j, fi7 fi7Var) {
        return this.e.d(j, fi7Var);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        List list;
        long j2;
        if (this.H || this.i.j() || this.i.i()) {
            return false;
        }
        boolean I = I();
        if (I) {
            list = Collections.emptyList();
            j2 = this.w;
        } else {
            list = this.l;
            j2 = F().h;
        }
        this.e.i(j, j2, list, this.j);
        qk0 qk0Var = this.j;
        boolean z = qk0Var.b;
        ok0 ok0Var = qk0Var.a;
        qk0Var.a();
        if (z) {
            this.w = -9223372036854775807L;
            this.H = true;
            return true;
        }
        if (ok0Var == null) {
            return false;
        }
        this.s = ok0Var;
        if (H(ok0Var)) {
            s50 s50Var = (s50) ok0Var;
            if (I) {
                long j3 = s50Var.g;
                long j4 = this.w;
                if (j3 != j4) {
                    this.m.b0(j4);
                    for (b0 b0Var : this.n) {
                        b0Var.b0(this.w);
                    }
                }
                this.w = -9223372036854775807L;
            }
            s50Var.k(this.r);
            this.k.add(s50Var);
        } else if (ok0Var instanceof sj3) {
            ((sj3) ok0Var).g(this.r);
        }
        this.g.z(new v64(ok0Var.a, ok0Var.b, this.i.n(ok0Var, this, this.h.b(ok0Var.c))), ok0Var.c, this.a, ok0Var.d, ok0Var.e, ok0Var.f, ok0Var.g, ok0Var.h);
        return true;
    }

    @Override // defpackage.y77
    public boolean g() {
        return !I() && this.m.K(this.H);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h() {
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.w;
        }
        long j = this.x;
        s50 F = F();
        if (!F.h()) {
            if (this.k.size() > 1) {
                F = (s50) this.k.get(r2.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j = Math.max(j, F.h);
        }
        return Math.max(j, this.m.z());
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void i(long j) {
        if (this.i.i() || I()) {
            return;
        }
        if (!this.i.j()) {
            int j2 = this.e.j(j, this.l);
            if (j2 < this.k.size()) {
                C(j2);
                return;
            }
            return;
        }
        ok0 ok0Var = (ok0) ur.e(this.s);
        if (!(H(ok0Var) && G(this.k.size() - 1)) && this.e.f(j, ok0Var, this.l)) {
            this.i.f();
            if (H(ok0Var)) {
                this.B = (s50) ok0Var;
            }
        }
    }

    @Override // defpackage.y77
    public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
        if (I()) {
            return -3;
        }
        s50 s50Var = this.B;
        if (s50Var != null && s50Var.i(0) <= this.m.C()) {
            return -3;
        }
        J();
        return this.m.S(ep2Var, decoderInputBuffer, i, this.H);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        this.m.T();
        for (b0 b0Var : this.n) {
            b0Var.T();
        }
        this.e.release();
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // defpackage.y77
    public int s(long j) {
        if (I()) {
            return 0;
        }
        int E = this.m.E(j, this.H);
        s50 s50Var = this.B;
        if (s50Var != null) {
            E = Math.min(E, s50Var.i(0) - this.m.C());
        }
        this.m.e0(E);
        J();
        return E;
    }

    public void u(long j, boolean z) {
        if (I()) {
            return;
        }
        int x = this.m.x();
        this.m.q(j, z, true);
        int x2 = this.m.x();
        if (x2 > x) {
            long y = this.m.y();
            int i = 0;
            while (true) {
                b0[] b0VarArr = this.n;
                if (i >= b0VarArr.length) {
                    break;
                }
                b0VarArr[i].q(y, z, this.d[i]);
                i++;
            }
        }
        B(x2);
    }
}
