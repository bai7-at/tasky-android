package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.j;
import defpackage.q72;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class k8 extends h60 {
    private final l40 h;
    private final long i;
    private final long j;
    private final long k;
    private final int l;
    private final int m;
    private final float n;
    private final float o;
    private final ImmutableList p;
    private final vl0 q;
    private float r;
    private int s;
    private int t;
    private long u;
    private ph4 v;
    private long w;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public static class b implements q72.b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final float f;
        private final float g;
        private final vl0 h;

        public b() {
            this(Constants.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q72.b
        public final q72[] a(q72.a[] aVarArr, l40 l40Var, o.b bVar, g2 g2Var) {
            ImmutableList B = k8.B(aVarArr);
            q72[] q72VarArr = new q72[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                q72.a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length != 0) {
                        q72VarArr[i] = iArr.length == 1 ? new xj2(aVar.a, iArr[0], aVar.c) : b(aVar.a, iArr, aVar.c, l40Var, (ImmutableList) B.get(i));
                    }
                }
            }
            return q72VarArr;
        }

        protected k8 b(up8 up8Var, int[] iArr, int i, l40 l40Var, ImmutableList immutableList) {
            return new k8(up8Var, iArr, i, l40Var, this.a, this.b, this.c, this.d, this.e, this.f, this.g, immutableList, this.h);
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, vl0.a);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f, float f2, vl0 vl0Var) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = f;
            this.g = f2;
            this.h = vl0Var;
        }
    }

    protected k8(up8 up8Var, int[] iArr, int i, l40 l40Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, vl0 vl0Var) {
        super(up8Var, iArr, i);
        l40 l40Var2;
        long j4;
        if (j3 < j) {
            a84.j("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            l40Var2 = l40Var;
            j4 = j;
        } else {
            l40Var2 = l40Var;
            j4 = j3;
        }
        this.h = l40Var2;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j4 * 1000;
        this.l = i2;
        this.m = i3;
        this.n = f;
        this.o = f2;
        this.p = ImmutableList.t(list);
        this.q = vl0Var;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
        this.w = Long.MIN_VALUE;
    }

    private int A(long j, long j2) {
        long C = C(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !a(i2, j)) {
                t0 f = f(i2);
                if (z(f, f.h, C)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableList B(q72.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (q72.a aVar : aVarArr) {
            if (aVar == null || aVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.a p = ImmutableList.p();
                p.a(new a(0L, 0L));
                arrayList.add(p);
            }
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i = 0; i < G.length; i++) {
            long[] jArr2 = G[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        ImmutableList H = H(G);
        for (int i2 = 0; i2 < H.size(); i2++) {
            int intValue = ((Integer) H.get(i2)).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = G[intValue][i3];
            y(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        y(arrayList, jArr);
        ImmutableList.a p2 = ImmutableList.p();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.a aVar2 = (ImmutableList.a) arrayList.get(i5);
            p2.a(aVar2 == null ? ImmutableList.x() : aVar2.k());
        }
        return p2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long C(long j) {
        long I = I(j);
        if (this.p.isEmpty()) {
            return I;
        }
        int i = 1;
        while (i < this.p.size() - 1 && ((a) this.p.get(i)).a < I) {
            i++;
        }
        a aVar = (a) this.p.get(i - 1);
        a aVar2 = (a) this.p.get(i);
        long j2 = aVar.a;
        float f = (I - j2) / (aVar2.a - j2);
        return aVar.b + ((long) (f * (aVar2.b - r0)));
    }

    private long D(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        ph4 ph4Var = (ph4) j.e(list);
        long j = ph4Var.g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = ph4Var.h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    private long F(qh4[] qh4VarArr, List list) {
        int i = this.s;
        if (i < qh4VarArr.length && qh4VarArr[i].next()) {
            qh4 qh4Var = qh4VarArr[this.s];
            return qh4Var.b() - qh4Var.a();
        }
        for (qh4 qh4Var2 : qh4VarArr) {
            if (qh4Var2.next()) {
                return qh4Var2.b() - qh4Var2.a();
            }
        }
        return D(list);
    }

    private static long[][] G(q72.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            q72.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = aVar.a.d(iArr[i2]).h;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static ImmutableList H(long[][] jArr) {
        a64 e = MultimapBuilder.c().a().e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i2] = d;
                    i2++;
                }
                int i3 = length - 1;
                double d2 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d3 = dArr[i4];
                    i4++;
                    e.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i4]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.t(e.values());
    }

    private long I(long j) {
        long d = this.h.d();
        this.w = d;
        long j2 = (long) (d * this.n);
        long a2 = this.h.a();
        if (a2 == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.r);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.r) - a2, 0.0f)) / f);
    }

    private long J(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.i;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.o), this.i);
    }

    private static void y(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.a aVar = (ImmutableList.a) list.get(i);
            if (aVar != null) {
                aVar.a(new a(j, jArr[i]));
            }
        }
    }

    protected long E() {
        return this.k;
    }

    protected boolean K(long j, List list) {
        long j2 = this.u;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((ph4) j.e(list)).equals(this.v));
    }

    @Override // defpackage.q72
    public int b() {
        return this.s;
    }

    @Override // defpackage.h60, defpackage.q72
    public void c() {
        this.v = null;
    }

    @Override // defpackage.h60, defpackage.q72
    public void d() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override // defpackage.h60, defpackage.q72
    public void i(float f) {
        this.r = f;
    }

    @Override // defpackage.q72
    public Object j() {
        return null;
    }

    @Override // defpackage.q72
    public void m(long j, long j2, long j3, List list, qh4[] qh4VarArr) {
        long elapsedRealtime = this.q.elapsedRealtime();
        long F = F(qh4VarArr, list);
        int i = this.t;
        if (i == 0) {
            this.t = 1;
            this.s = A(elapsedRealtime, F);
            return;
        }
        int i2 = this.s;
        int q = list.isEmpty() ? -1 : q(((ph4) j.e(list)).d);
        if (q != -1) {
            i = ((ph4) j.e(list)).e;
            i2 = q;
        }
        int A = A(elapsedRealtime, F);
        if (A != i2 && !a(i2, elapsedRealtime)) {
            t0 f = f(i2);
            t0 f2 = f(A);
            long J = J(j3, F);
            int i3 = f2.h;
            int i4 = f.h;
            if ((i3 > i4 && j2 < J) || (i3 < i4 && j2 >= this.j)) {
                A = i2;
            }
        }
        if (A != i2) {
            i = 3;
        }
        this.t = i;
        this.s = A;
    }

    @Override // defpackage.h60, defpackage.q72
    public int p(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = this.q.elapsedRealtime();
        if (!K(elapsedRealtime, list)) {
            return list.size();
        }
        this.u = elapsedRealtime;
        this.v = list.isEmpty() ? null : (ph4) j.e(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long h0 = z19.h0(((ph4) list.get(size - 1)).g - j, this.r);
        long E = E();
        if (h0 < E) {
            return size;
        }
        t0 f = f(A(elapsedRealtime, D(list)));
        for (int i3 = 0; i3 < size; i3++) {
            ph4 ph4Var = (ph4) list.get(i3);
            t0 t0Var = ph4Var.d;
            if (z19.h0(ph4Var.g - j, this.r) >= E && t0Var.h < f.h && (i = t0Var.u) != -1 && i <= this.m && (i2 = t0Var.t) != -1 && i2 <= this.l && i < f.u) {
                return i3;
            }
        }
        return size;
    }

    @Override // defpackage.q72
    public int t() {
        return this.t;
    }

    protected boolean z(t0 t0Var, int i, long j) {
        return ((long) i) <= j;
    }
}
