package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.t0;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.ok0;
import defpackage.q72;
import defpackage.qh4;
import defpackage.up8;
import defpackage.ur;
import defpackage.us0;
import defpackage.wp8;
import defpackage.y77;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes2.dex */
final class r implements n, n.a {
    private final n[] a;
    private final us0 c;
    private n.a f;
    private wp8 g;
    private c0 i;
    private final ArrayList d = new ArrayList();
    private final HashMap e = new HashMap();
    private final IdentityHashMap b = new IdentityHashMap();
    private n[] h = new n[0];

    private static final class a implements q72 {
        private final q72 a;
        private final up8 b;

        public a(q72 q72Var, up8 up8Var) {
            this.a = q72Var;
            this.b = up8Var;
        }

        @Override // defpackage.q72
        public boolean a(int i, long j) {
            return this.a.a(i, j);
        }

        @Override // defpackage.q72
        public int b() {
            return this.a.b();
        }

        @Override // defpackage.q72
        public void c() {
            this.a.c();
        }

        @Override // defpackage.q72
        public void d() {
            this.a.d();
        }

        @Override // defpackage.q72
        public boolean e(long j, ok0 ok0Var, List list) {
            return this.a.e(j, ok0Var, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        @Override // defpackage.aq8
        public t0 f(int i) {
            return this.a.f(i);
        }

        @Override // defpackage.aq8
        public int g(int i) {
            return this.a.g(i);
        }

        @Override // defpackage.q72
        public boolean h(int i, long j) {
            return this.a.h(i, j);
        }

        public int hashCode() {
            return ((527 + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        @Override // defpackage.q72
        public void i(float f) {
            this.a.i(f);
        }

        @Override // defpackage.q72
        public Object j() {
            return this.a.j();
        }

        @Override // defpackage.q72
        public void k() {
            this.a.k();
        }

        @Override // defpackage.aq8
        public int l(int i) {
            return this.a.l(i);
        }

        @Override // defpackage.aq8
        public int length() {
            return this.a.length();
        }

        @Override // defpackage.q72
        public void m(long j, long j2, long j3, List list, qh4[] qh4VarArr) {
            this.a.m(j, j2, j3, list, qh4VarArr);
        }

        @Override // defpackage.aq8
        public up8 n() {
            return this.b;
        }

        @Override // defpackage.q72
        public void o(boolean z) {
            this.a.o(z);
        }

        @Override // defpackage.q72
        public int p(long j, List list) {
            return this.a.p(j, list);
        }

        @Override // defpackage.aq8
        public int q(t0 t0Var) {
            return this.a.q(t0Var);
        }

        @Override // defpackage.q72
        public int r() {
            return this.a.r();
        }

        @Override // defpackage.q72
        public t0 s() {
            return this.a.s();
        }

        @Override // defpackage.q72
        public int t() {
            return this.a.t();
        }

        @Override // defpackage.q72
        public void u() {
            this.a.u();
        }
    }

    private static final class b implements n, n.a {
        private final n a;
        private final long b;
        private n.a c;

        public b(n nVar, long j) {
            this.a = nVar;
            this.b = j;
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public boolean b() {
            return this.a.b();
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public long c() {
            long c = this.a.c();
            if (c == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.b + c;
        }

        @Override // com.google.android.exoplayer2.source.n
        public long d(long j, fi7 fi7Var) {
            return this.a.d(j - this.b, fi7Var) + this.b;
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public boolean f(long j) {
            return this.a.f(j - this.b);
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public long h() {
            long h = this.a.h();
            if (h == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.b + h;
        }

        @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
        public void i(long j) {
            this.a.i(j - this.b);
        }

        @Override // com.google.android.exoplayer2.source.n
        public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
            y77[] y77VarArr2 = new y77[y77VarArr.length];
            int i = 0;
            while (true) {
                y77 y77Var = null;
                if (i >= y77VarArr.length) {
                    break;
                }
                c cVar = (c) y77VarArr[i];
                if (cVar != null) {
                    y77Var = cVar.b();
                }
                y77VarArr2[i] = y77Var;
                i++;
            }
            long j2 = this.a.j(q72VarArr, zArr, y77VarArr2, zArr2, j - this.b);
            for (int i2 = 0; i2 < y77VarArr.length; i2++) {
                y77 y77Var2 = y77VarArr2[i2];
                if (y77Var2 == null) {
                    y77VarArr[i2] = null;
                } else {
                    y77 y77Var3 = y77VarArr[i2];
                    if (y77Var3 == null || ((c) y77Var3).b() != y77Var2) {
                        y77VarArr[i2] = new c(y77Var2, this.b);
                    }
                }
            }
            return j2 + this.b;
        }

        @Override // com.google.android.exoplayer2.source.n
        public long l(long j) {
            return this.a.l(j - this.b) + this.b;
        }

        @Override // com.google.android.exoplayer2.source.n
        public long m() {
            long m = this.a.m();
            if (m == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.b + m;
        }

        @Override // com.google.android.exoplayer2.source.n
        public void n(n.a aVar, long j) {
            this.c = aVar;
            this.a.n(this, j - this.b);
        }

        @Override // com.google.android.exoplayer2.source.n.a
        public void o(n nVar) {
            ((n.a) ur.e(this.c)).o(this);
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void g(n nVar) {
            ((n.a) ur.e(this.c)).g(this);
        }

        @Override // com.google.android.exoplayer2.source.n
        public void r() {
            this.a.r();
        }

        @Override // com.google.android.exoplayer2.source.n
        public wp8 t() {
            return this.a.t();
        }

        @Override // com.google.android.exoplayer2.source.n
        public void u(long j, boolean z) {
            this.a.u(j - this.b, z);
        }
    }

    private static final class c implements y77 {
        private final y77 a;
        private final long b;

        public c(y77 y77Var, long j) {
            this.a = y77Var;
            this.b = j;
        }

        @Override // defpackage.y77
        public void a() {
            this.a.a();
        }

        public y77 b() {
            return this.a;
        }

        @Override // defpackage.y77
        public boolean g() {
            return this.a.g();
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            int p = this.a.p(ep2Var, decoderInputBuffer, i);
            if (p == -4) {
                decoderInputBuffer.e = Math.max(0L, decoderInputBuffer.e + this.b);
            }
            return p;
        }

        @Override // defpackage.y77
        public int s(long j) {
            return this.a.s(j - this.b);
        }
    }

    public r(us0 us0Var, long[] jArr, n... nVarArr) {
        this.c = us0Var;
        this.a = nVarArr;
        this.i = us0Var.a(new c0[0]);
        for (int i = 0; i < nVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new b(nVarArr[i], j);
            }
        }
    }

    public n a(int i) {
        n nVar = this.a[i];
        return nVar instanceof b ? ((b) nVar).a : nVar;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.i.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return this.i.c();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        n[] nVarArr = this.h;
        return (nVarArr.length > 0 ? nVarArr[0] : this.a[0]).d(j, fi7Var);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        if (this.d.isEmpty()) {
            return this.i.f(j);
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((n) this.d.get(i)).f(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return this.i.h();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        this.i.i(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        y77 y77Var;
        int[] iArr = new int[q72VarArr.length];
        int[] iArr2 = new int[q72VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            y77Var = null;
            if (i2 >= q72VarArr.length) {
                break;
            }
            y77 y77Var2 = y77VarArr[i2];
            Integer num = y77Var2 != null ? (Integer) this.b.get(y77Var2) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            q72 q72Var = q72VarArr[i2];
            if (q72Var != null) {
                String str = q72Var.n().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.b.clear();
        int length = q72VarArr.length;
        y77[] y77VarArr2 = new y77[length];
        y77[] y77VarArr3 = new y77[q72VarArr.length];
        q72[] q72VarArr2 = new q72[q72VarArr.length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        q72[] q72VarArr3 = q72VarArr2;
        while (i3 < this.a.length) {
            for (int i4 = i; i4 < q72VarArr.length; i4++) {
                y77VarArr3[i4] = iArr[i4] == i3 ? y77VarArr[i4] : y77Var;
                if (iArr2[i4] == i3) {
                    q72 q72Var2 = (q72) ur.e(q72VarArr[i4]);
                    q72VarArr3[i4] = new a(q72Var2, (up8) ur.e((up8) this.e.get(q72Var2.n())));
                } else {
                    q72VarArr3[i4] = y77Var;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            q72[] q72VarArr4 = q72VarArr3;
            long j3 = this.a[i3].j(q72VarArr3, zArr, y77VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < q72VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    y77 y77Var3 = (y77) ur.e(y77VarArr3[i6]);
                    y77VarArr2[i6] = y77VarArr3[i6];
                    this.b.put(y77Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    ur.g(y77VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            q72VarArr3 = q72VarArr4;
            i = 0;
            y77Var = null;
        }
        int i7 = i;
        System.arraycopy(y77VarArr2, i7, y77VarArr, i7, length);
        n[] nVarArr = (n[]) arrayList.toArray(new n[i7]);
        this.h = nVarArr;
        this.i = this.c.a(nVarArr);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        long l = this.h[0].l(j);
        int i = 1;
        while (true) {
            n[] nVarArr = this.h;
            if (i >= nVarArr.length) {
                return l;
            }
            if (nVarArr[i].l(l) != l) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        long j = -9223372036854775807L;
        for (n nVar : this.h) {
            long m = nVar.m();
            if (m != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (n nVar2 : this.h) {
                        if (nVar2 == nVar) {
                            break;
                        }
                        if (nVar2.l(m) != m) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = m;
                } else if (m != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && nVar.l(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.f = aVar;
        Collections.addAll(this.d, this.a);
        for (n nVar : this.a) {
            nVar.n(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void o(n nVar) {
        this.d.remove(nVar);
        if (!this.d.isEmpty()) {
            return;
        }
        int i = 0;
        for (n nVar2 : this.a) {
            i += nVar2.t().a;
        }
        up8[] up8VarArr = new up8[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            n[] nVarArr = this.a;
            if (i2 >= nVarArr.length) {
                this.g = new wp8(up8VarArr);
                ((n.a) ur.e(this.f)).o(this);
                return;
            }
            wp8 t = nVarArr[i2].t();
            int i4 = t.a;
            int i5 = 0;
            while (i5 < i4) {
                up8 c2 = t.c(i5);
                up8 c3 = c2.c(i2 + ":" + c2.b);
                this.e.put(c3, c2);
                up8VarArr[i3] = c3;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(n nVar) {
        ((n.a) ur.e(this.f)).g(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        for (n nVar : this.a) {
            nVar.r();
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return (wp8) ur.e(this.g);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        for (n nVar : this.h) {
            nVar.u(j, z);
        }
    }
}
