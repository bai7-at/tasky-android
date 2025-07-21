package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hd;
import defpackage.kn3;
import defpackage.ov7;
import defpackage.q33;
import defpackage.yu3;
import defpackage.z26;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t {
    public static final a w = new a(null);
    public static final int x = 8;
    private final r a;
    private int[] b;
    private Object[] c;
    private ArrayList d;
    private HashMap e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int r;
    private int s;
    private boolean u;
    private z26 v;
    private final kn3 o = new kn3();
    private final kn3 p = new kn3();
    private final kn3 q = new kn3();
    private int t = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List b(androidx.compose.runtime.t r23, int r24, androidx.compose.runtime.t r25, boolean r26, boolean r27, boolean r28) {
            /*
                Method dump skipped, instructions count: 457
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.t.a.b(androidx.compose.runtime.t, int, androidx.compose.runtime.t, boolean, boolean, boolean):java.util.List");
        }

        static /* synthetic */ List c(a aVar, t tVar, int i, t tVar2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return aVar.b(tVar, i, tVar2, z, z2, z3);
        }

        private a() {
        }
    }

    public static final class b implements Iterator, yu3 {
        private int a;
        final /* synthetic */ int b;
        final /* synthetic */ t c;

        b(int i, int i2, t tVar) {
            this.b = i2;
            this.c = tVar;
            this.a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.c.c;
            t tVar = this.c;
            int i = this.a;
            this.a = i + 1;
            return objArr[tVar.R(i)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(r rVar) {
        this.a = rVar;
        this.b = rVar.o();
        this.c = rVar.q();
        this.d = rVar.n();
        this.e = rVar.u();
        this.f = rVar.p();
        this.g = (this.b.length / 5) - rVar.p();
        this.j = rVar.t();
        this.k = this.c.length - rVar.t();
        this.l = rVar.p();
        this.s = rVar.p();
    }

    private final int D0(int[] iArr, int i) {
        return Q(iArr, i);
    }

    private final int F0(int[] iArr, int i) {
        int T;
        T = ov7.T(iArr, g0(i));
        return G0(T);
    }

    private final int G0(int i) {
        return i > -2 ? i : d0() + i + 2;
    }

    private final int H(int[] iArr, int i) {
        int H;
        int E;
        int Q = Q(iArr, i);
        H = ov7.H(iArr, i);
        E = ov7.E(H >> 29);
        return Q + E;
    }

    private final int H0(int i, int i2) {
        return i < i2 ? i : -((d0() - i) + 2);
    }

    private final void I0() {
        z26 z26Var = this.v;
        if (z26Var != null) {
            while (z26Var.b()) {
                k1(z26Var.d(), z26Var);
            }
        }
    }

    private final boolean J(int i) {
        boolean C;
        int i2 = i + 1;
        int j0 = i + j0(i);
        while (i2 < j0) {
            C = ov7.C(this.b, g0(i2));
            if (C) {
                return true;
            }
            i2 += j0(i2);
        }
        return false;
    }

    private final boolean J0(int i, int i2, HashMap hashMap) {
        int P;
        int i3 = i2 + i;
        P = ov7.P(this.d, i3, Y() - this.g);
        if (P >= this.d.size()) {
            P--;
        }
        int i4 = P + 1;
        int i5 = 0;
        while (P >= 0) {
            hd hdVar = (hd) this.d.get(P);
            int G = G(hdVar);
            if (G < i) {
                break;
            }
            if (G < i3) {
                hdVar.c(RecyclerView.UNDEFINED_DURATION);
                if (hashMap != null) {
                }
                if (i5 == 0) {
                    i5 = P + 1;
                }
                i4 = P;
            }
            P--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.d.subList(i4, i5).clear();
        }
        return z;
    }

    private final void K() {
        int i = this.j;
        kotlin.collections.d.t(this.c, null, i, this.k + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L0(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            x0(i);
            r0 = arrayList.isEmpty() ? false : J0(i, i2, this.e);
            this.f = i;
            this.g += i2;
            int i3 = this.l;
            if (i3 > i) {
                this.l = Math.max(i, i3 - i2);
            }
            int i4 = this.s;
            if (i4 >= this.f) {
                this.s = i4 - i2;
            }
            int i5 = this.t;
            if (N(i5)) {
                j1(i5);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int i) {
        boolean C;
        if (i >= 0) {
            C = ov7.C(this.b, g0(i));
            if (C) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            z0(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            kotlin.collections.d.t(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    private final boolean N(int i) {
        boolean D;
        if (i >= 0) {
            D = ov7.D(this.b, g0(i));
            if (D) {
                return true;
            }
        }
        return false;
    }

    private final int O(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    private final int O0() {
        int Y = (Y() - this.g) - this.p.h();
        this.s = Y;
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int i) {
        return Q(this.b, g0(i));
    }

    private final void P0() {
        this.p.i((Y() - this.g) - this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i) {
        int F;
        if (i >= Y()) {
            return this.c.length - this.k;
        }
        F = ov7.F(iArr, i);
        return O(F, this.k, this.c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i) {
        return i < this.j ? i : i + this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    private final void X(int i, int i2, int i3) {
        int I;
        int H0 = H0(i, this.f);
        while (i3 < i2) {
            ov7.b0(this.b, g0(i3), H0);
            I = ov7.I(this.b, g0(i3));
            int i4 = I + i3;
            X(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    private final int Y() {
        return this.b.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Y0(int[] iArr, int i) {
        int V;
        if (i >= Y()) {
            return this.c.length - this.k;
        }
        V = ov7.V(iArr, i);
        return O(V, this.k, this.c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q33 Z0(int i) {
        hd f1;
        HashMap hashMap = this.e;
        if (hashMap == null || (f1 = f1(i)) == null) {
            return null;
        }
        return (q33) hashMap.get(f1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d1(int i, Object obj, boolean z, Object obj2) {
        int Q;
        int I;
        int i2;
        int i3 = this.t;
        Object[] objArr = this.m > 0;
        this.q.i(this.n);
        if (objArr == true) {
            o0(1);
            int i4 = this.r;
            int g0 = g0(i4);
            Composer.a aVar = Composer.a;
            int i5 = obj != aVar.a() ? 1 : 0;
            int i6 = (z || obj2 == aVar.a()) ? 0 : 1;
            ov7.M(this.b, g0, i, z, i5, i6, this.t, this.h);
            this.i = this.h;
            int i7 = (z ? 1 : 0) + i5 + i6;
            if (i7 > 0) {
                p0(i7, i4);
                Object[] objArr2 = this.c;
                int i8 = this.h;
                if (z) {
                    objArr2[i8] = obj2;
                    i8++;
                }
                if (i5 != 0) {
                    objArr2[i8] = obj;
                    i8++;
                }
                if (i6 != 0) {
                    objArr2[i8] = obj2;
                    i8++;
                }
                this.h = i8;
            }
            this.n = 0;
            i2 = i4 + 1;
            this.t = i4;
            this.r = i2;
            if (i3 >= 0) {
                Z0(i3);
            }
        } else {
            this.o.i(i3);
            P0();
            int i9 = this.r;
            int g02 = g0(i9);
            if (!zq3.c(obj2, Composer.a.a())) {
                if (z) {
                    n1(obj2);
                } else {
                    i1(obj2);
                }
            }
            this.h = Y0(this.b, g02);
            this.i = Q(this.b, g0(this.r + 1));
            Q = ov7.Q(this.b, g02);
            this.n = Q;
            this.t = i9;
            this.r = i9 + 1;
            I = ov7.I(this.b, g02);
            i2 = i9 + I;
        }
        this.s = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g0(int i) {
        return i < this.f ? i : i + this.g;
    }

    private final void h1(int i, int i2) {
        int P;
        hd hdVar;
        int a2;
        int P2;
        hd hdVar2;
        int a3;
        int i3;
        int Y = Y() - this.g;
        if (i >= i2) {
            for (P = ov7.P(this.d, i2, Y); P < this.d.size() && (a2 = (hdVar = (hd) this.d.get(P)).a()) >= 0; P++) {
                hdVar.c(-(Y - a2));
            }
            return;
        }
        for (P2 = ov7.P(this.d, i, Y); P2 < this.d.size() && (a3 = (hdVar2 = (hd) this.d.get(P2)).a()) < 0 && (i3 = a3 + Y) < i2; P2++) {
            hdVar2.c(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j1(int i) {
        if (i >= 0) {
            z26 z26Var = this.v;
            if (z26Var == null) {
                z26Var = new z26(null, 1, 0 == true ? 1 : 0);
                this.v = z26Var;
            }
            z26Var.a(i);
        }
    }

    private final void k1(int i, z26 z26Var) {
        boolean D;
        int g0 = g0(i);
        boolean J = J(i);
        D = ov7.D(this.b, g0);
        if (D != J) {
            ov7.W(this.b, g0, J);
            int E0 = E0(i);
            if (E0 >= 0) {
                z26Var.a(E0);
            }
        }
    }

    private final void l1(int[] iArr, int i, int i2) {
        ov7.X(iArr, i, S(i2, this.j, this.k, this.c.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(int i) {
        if (i > 0) {
            int i2 = this.r;
            x0(i2);
            int i3 = this.f;
            int i4 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                kotlin.collections.d.i(iArr, iArr2, 0, 0, i3 * 5);
                kotlin.collections.d.i(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.s;
            if (i7 >= i3) {
                this.s = i7 + i;
            }
            int i8 = i3 + i;
            this.f = i8;
            this.g = i4 - i;
            int S = S(i5 > 0 ? P(i2 + i) : 0, this.l >= i3 ? this.j : 0, this.k, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                ov7.X(this.b, i9, S);
            }
            int i10 = this.l;
            if (i10 >= i3) {
                this.l = i10 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o1(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.g0(r4)
            int[] r1 = r3.b
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = defpackage.ov7.m(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.c
            int[] r1 = r3.b
            int r0 = r3.D0(r1, r0)
            int r3 = r3.R(r0)
            r4[r3] = r5
            return
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Updating the node of a group at "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.toString()
            androidx.compose.runtime.b.t(r3)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.t.o1(int, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i, int i2) {
        if (i > 0) {
            z0(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                kotlin.collections.d.k(objArr, objArr2, 0, 0, i3);
                kotlin.collections.d.k(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public static /* synthetic */ void t0(t tVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tVar.t;
        }
        tVar.s0(i);
    }

    private final void u0(int i, int i2, int i3) {
        int P;
        int P2;
        hd hdVar;
        int G;
        int i4 = i3 + i;
        int d0 = d0();
        P = ov7.P(this.d, i, d0);
        ArrayList arrayList = new ArrayList();
        if (P >= 0) {
            while (P < this.d.size() && (G = G((hdVar = (hd) this.d.get(P)))) >= i && G < i4) {
                arrayList.add(hdVar);
                this.d.remove(P);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            hd hdVar2 = (hd) arrayList.get(i6);
            int G2 = G(hdVar2) + i5;
            if (G2 >= this.f) {
                hdVar2.c(-(d0 - G2));
            } else {
                hdVar2.c(G2);
            }
            P2 = ov7.P(this.d, G2, d0);
            this.d.add(P2, hdVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i) {
        int T;
        int i2 = this.g;
        int i3 = this.f;
        if (i3 != i) {
            if (!this.d.isEmpty()) {
                h1(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    kotlin.collections.d.i(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    kotlin.collections.d.i(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int Y = Y();
            androidx.compose.runtime.b.Q(i3 < Y);
            while (i3 < Y) {
                T = ov7.T(this.b, i3);
                int H0 = H0(G0(T), i);
                if (H0 != T) {
                    ov7.b0(this.b, i3, H0);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int i, int i2) {
        int F;
        int F2;
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                kotlin.collections.d.k(objArr, objArr, i + i3, i, i4);
            } else {
                kotlin.collections.d.k(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, d0());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int g0 = g0(min);
                int g02 = g0(i5);
                int i6 = this.f;
                while (g0 < g02) {
                    F2 = ov7.F(this.b, g0);
                    if (!(F2 >= 0)) {
                        androidx.compose.runtime.b.t("Unexpected anchor value, expected a positive anchor");
                        throw new KotlinNothingValueException();
                    }
                    ov7.X(this.b, g0, -((length - F2) + 1));
                    g0++;
                    if (g0 == i6) {
                        g0 += this.g;
                    }
                }
            } else {
                int g03 = g0(i5);
                int g04 = g0(min);
                while (g03 < g04) {
                    F = ov7.F(this.b, g03);
                    if (!(F < 0)) {
                        androidx.compose.runtime.b.t("Unexpected anchor value, expected a negative anchor");
                        throw new KotlinNothingValueException();
                    }
                    ov7.X(this.b, g03, F + length + 1);
                    g03++;
                    if (g03 == this.f) {
                        g03 += this.g;
                    }
                }
            }
            this.l = min;
        }
        this.j = i;
    }

    public final Object A0(int i) {
        boolean N;
        int g0 = g0(i);
        N = ov7.N(this.b, g0);
        if (N) {
            return this.c[R(D0(this.b, g0))];
        }
        return null;
    }

    public final Object B0(hd hdVar) {
        return A0(hdVar.e(this));
    }

    public final int C0(int i) {
        int Q;
        Q = ov7.Q(this.b, g0(i));
        return Q;
    }

    public final void E(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            androidx.compose.runtime.b.t("Cannot seek backwards");
            throw new KotlinNothingValueException();
        }
        if (this.m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r + i;
        if (i2 >= this.t && i2 <= this.s) {
            z = true;
        }
        if (z) {
            this.r = i2;
            int Q = Q(this.b, g0(i2));
            this.h = Q;
            this.i = Q;
            return;
        }
        androidx.compose.runtime.b.t(("Cannot seek outside the current group (" + this.t + '-' + this.s + ')').toString());
        throw new KotlinNothingValueException();
    }

    public final int E0(int i) {
        return F0(this.b, i);
    }

    public final hd F(int i) {
        int U;
        ArrayList arrayList = this.d;
        U = ov7.U(arrayList, i, d0());
        if (U >= 0) {
            return (hd) arrayList.get(U);
        }
        if (i > this.f) {
            i = -(d0() - i);
        }
        hd hdVar = new hd(i);
        arrayList.add(-(U + 1), hdVar);
        return hdVar;
    }

    public final int G(hd hdVar) {
        int a2 = hdVar.a();
        return a2 < 0 ? a2 + d0() : a2;
    }

    public final void I() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            P0();
        }
    }

    public final boolean K0() {
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("Cannot remove group while inserting");
            throw new KotlinNothingValueException();
        }
        int i = this.r;
        int i2 = this.h;
        int U0 = U0();
        Z0(this.t);
        z26 z26Var = this.v;
        if (z26Var != null) {
            while (z26Var.b() && z26Var.c() >= i) {
                z26Var.d();
            }
        }
        boolean L0 = L0(i, this.r - i);
        M0(i2, this.h - i2, i - 1);
        this.r = i;
        this.h = i2;
        this.n -= U0;
        return L0;
    }

    public final void L() {
        this.u = true;
        if (this.o.d()) {
            x0(d0());
            z0(this.c.length - this.k, this.f);
            K();
            I0();
        }
        this.a.g(this, this.b, this.f, this.c, this.j, this.d, this.e);
    }

    public final void N0() {
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("Cannot reset when inserting");
            throw new KotlinNothingValueException();
        }
        I0();
        this.r = 0;
        this.s = Y() - this.g;
        this.h = 0;
        this.i = 0;
        this.n = 0;
    }

    public final Object Q0(int i, int i2, Object obj) {
        int Y0 = Y0(this.b, g0(i));
        int i3 = Y0 + i2;
        if (i3 >= Y0 && i3 < Q(this.b, g0(i + 1))) {
            int R = R(i3);
            Object[] objArr = this.c;
            Object obj2 = objArr[R];
            objArr[R] = obj;
            return obj2;
        }
        androidx.compose.runtime.b.t(("Write to an invalid slot index " + i2 + " for group " + i).toString());
        throw new KotlinNothingValueException();
    }

    public final Object R0(int i, Object obj) {
        return Q0(this.r, i, obj);
    }

    public final void S0(Object obj) {
        int i = this.h;
        if (i <= this.i) {
            this.c[R(i - 1)] = obj;
        } else {
            androidx.compose.runtime.b.t("Writing to an invalid slot");
            throw new KotlinNothingValueException();
        }
    }

    public final int T() {
        boolean N;
        int I;
        int Q;
        boolean N2;
        int Q2;
        int I2;
        boolean z = this.m > 0;
        int i = this.r;
        int i2 = this.s;
        int i3 = this.t;
        int g0 = g0(i3);
        int i4 = this.n;
        int i5 = i - i3;
        N = ov7.N(this.b, g0);
        if (z) {
            ov7.Y(this.b, g0, i5);
            ov7.a0(this.b, g0, i4);
            this.n = this.q.h() + (N ? 1 : i4);
            this.t = F0(this.b, i3);
        } else {
            if ((i != i2 ? 0 : 1) == 0) {
                androidx.compose.runtime.b.t("Expected to be at the end of a group");
                throw new KotlinNothingValueException();
            }
            I = ov7.I(this.b, g0);
            Q = ov7.Q(this.b, g0);
            ov7.Y(this.b, g0, i5);
            ov7.a0(this.b, g0, i4);
            int h = this.o.h();
            O0();
            this.t = h;
            int F0 = F0(this.b, i3);
            int h2 = this.q.h();
            this.n = h2;
            if (F0 == h) {
                this.n = h2 + (N ? 0 : i4 - Q);
            } else {
                int i6 = i5 - I;
                int i7 = N ? 0 : i4 - Q;
                if (i6 != 0 || i7 != 0) {
                    while (F0 != 0 && F0 != h && (i7 != 0 || i6 != 0)) {
                        int g02 = g0(F0);
                        if (i6 != 0) {
                            I2 = ov7.I(this.b, g02);
                            ov7.Y(this.b, g02, I2 + i6);
                        }
                        if (i7 != 0) {
                            int[] iArr = this.b;
                            Q2 = ov7.Q(iArr, g02);
                            ov7.a0(iArr, g02, Q2 + i7);
                        }
                        N2 = ov7.N(this.b, g02);
                        if (N2) {
                            i7 = 0;
                        }
                        F0 = F0(this.b, F0);
                    }
                }
                this.n += i7;
            }
        }
        return i4;
    }

    public final Object T0() {
        if (this.m > 0) {
            p0(1, this.t);
        }
        Object[] objArr = this.c;
        int i = this.h;
        this.h = i + 1;
        return objArr[R(i)];
    }

    public final void U() {
        int i = this.m;
        if (i <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        int i2 = i - 1;
        this.m = i2;
        if (i2 == 0) {
            if (this.q.b() == this.o.b()) {
                O0();
            } else {
                androidx.compose.runtime.b.t("startGroup/endGroup mismatch while inserting");
                throw new KotlinNothingValueException();
            }
        }
    }

    public final int U0() {
        int I;
        boolean N;
        int Q;
        int g0 = g0(this.r);
        int i = this.r;
        I = ov7.I(this.b, g0);
        int i2 = i + I;
        this.r = i2;
        this.h = Q(this.b, g0(i2));
        N = ov7.N(this.b, g0);
        if (N) {
            return 1;
        }
        Q = ov7.Q(this.b, g0);
        return Q;
    }

    public final void V(int i) {
        boolean z = false;
        if (!(this.m <= 0)) {
            androidx.compose.runtime.b.t("Cannot call ensureStarted() while inserting");
            throw new KotlinNothingValueException();
        }
        int i2 = this.t;
        if (i2 != i) {
            if (i >= i2 && i < this.s) {
                z = true;
            }
            if (!z) {
                androidx.compose.runtime.b.t(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            int i3 = this.r;
            int i4 = this.h;
            int i5 = this.i;
            this.r = i;
            b1();
            this.r = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void V0() {
        int i = this.s;
        this.r = i;
        this.h = Q(this.b, g0(i));
    }

    public final void W(hd hdVar) {
        V(hdVar.e(this));
    }

    public final Object W0(int i, int i2) {
        int Y0 = Y0(this.b, g0(i));
        int Q = Q(this.b, g0(i + 1));
        int i3 = i2 + Y0;
        if (Y0 > i3 || i3 >= Q) {
            return Composer.a.a();
        }
        return this.c[R(i3)];
    }

    public final Object X0(hd hdVar, int i) {
        return W0(G(hdVar), i);
    }

    public final boolean Z() {
        return this.u;
    }

    public final int a0() {
        return this.r;
    }

    public final void a1(int i, Object obj, Object obj2) {
        d1(i, obj, false, obj2);
    }

    public final int b0() {
        return this.s;
    }

    public final void b1() {
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("Key must be supplied when inserting");
            throw new KotlinNothingValueException();
        }
        Composer.a aVar = Composer.a;
        d1(0, aVar.a(), false, aVar.a());
    }

    public final int c0() {
        return this.t;
    }

    public final void c1(int i, Object obj) {
        d1(i, obj, false, Composer.a.a());
    }

    public final int d0() {
        return Y() - this.g;
    }

    public final r e0() {
        return this.a;
    }

    public final void e1(int i, Object obj) {
        d1(i, obj, true, Composer.a.a());
    }

    public final Object f0(int i) {
        boolean J;
        int g0 = g0(i);
        J = ov7.J(this.b, g0);
        return J ? this.c[H(this.b, g0)] : Composer.a.a();
    }

    public final hd f1(int i) {
        hd G;
        if (i < 0 || i >= d0()) {
            return null;
        }
        G = ov7.G(this.d, i, d0());
        return G;
    }

    public final Object g1(Object obj) {
        Object T0 = T0();
        S0(obj);
        return T0;
    }

    public final int h0(int i) {
        int O;
        O = ov7.O(this.b, g0(i));
        return O;
    }

    public final Object i0(int i) {
        boolean L;
        int S;
        int g0 = g0(i);
        L = ov7.L(this.b, g0);
        if (!L) {
            return null;
        }
        Object[] objArr = this.c;
        S = ov7.S(this.b, g0);
        return objArr[S];
    }

    public final void i1(Object obj) {
        boolean J;
        int g0 = g0(this.r);
        J = ov7.J(this.b, g0);
        if (J) {
            this.c[R(H(this.b, g0))] = obj;
        } else {
            androidx.compose.runtime.b.t("Updating the data of a group that was not created with a data slot");
            throw new KotlinNothingValueException();
        }
    }

    public final int j0(int i) {
        int I;
        I = ov7.I(this.b, g0(i));
        return I;
    }

    public final Iterator k0() {
        int Q = Q(this.b, g0(this.r));
        int[] iArr = this.b;
        int i = this.r;
        return new b(Q, Q(iArr, g0(i + j0(i))), this);
    }

    public final boolean l0(int i) {
        return m0(i, this.r);
    }

    public final boolean m0(int i, int i2) {
        int Y;
        int j0;
        if (i2 == this.t) {
            Y = this.s;
        } else {
            if (i2 > this.o.g(0)) {
                j0 = j0(i2);
            } else {
                int c = this.o.c(i2);
                if (c < 0) {
                    j0 = j0(i2);
                } else {
                    Y = (Y() - this.g) - this.p.f(c);
                }
            }
            Y = j0 + i2;
        }
        return i > i2 && i < Y;
    }

    public final void m1(hd hdVar, Object obj) {
        o1(hdVar.e(this), obj);
    }

    public final boolean n0(int i) {
        int i2 = this.t;
        return (i > i2 && i < this.s) || (i2 == 0 && i == 0);
    }

    public final void n1(Object obj) {
        o1(this.r, obj);
    }

    public final boolean q0() {
        boolean N;
        int i = this.r;
        if (i < this.s) {
            N = ov7.N(this.b, g0(i));
            if (N) {
                return true;
            }
        }
        return false;
    }

    public final boolean r0(int i) {
        boolean N;
        N = ov7.N(this.b, g0(i));
        return N;
    }

    public final void s0(int i) {
        boolean K;
        boolean D;
        int g0 = g0(i);
        K = ov7.K(this.b, g0);
        if (K) {
            return;
        }
        ov7.Z(this.b, g0, true);
        D = ov7.D(this.b, g0);
        if (D) {
            return;
        }
        j1(E0(i));
    }

    public String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.s + " size = " + d0() + " gap=" + this.f + '-' + (this.f + this.g) + ')';
    }

    public final List v0(r rVar, int i, boolean z) {
        int I;
        androidx.compose.runtime.b.Q(this.m > 0);
        if (i == 0 && this.r == 0 && this.a.p() == 0) {
            I = ov7.I(rVar.o(), i);
            if (I == rVar.p()) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                int[] o = rVar.o();
                int p = rVar.p();
                Object[] q = rVar.q();
                int t = rVar.t();
                HashMap u = rVar.u();
                this.b = o;
                this.c = q;
                this.d = rVar.n();
                this.f = p;
                this.g = (o.length / 5) - p;
                this.j = t;
                this.k = q.length - t;
                this.l = p;
                this.e = u;
                rVar.B(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.d;
            }
        }
        t z2 = rVar.z();
        try {
            return w.b(z2, i, this, true, true, z);
        } finally {
            z2.L();
        }
    }

    public final void w0(int i) {
        int I;
        int I2;
        if (!(this.m == 0)) {
            androidx.compose.runtime.b.t("Cannot move a group while inserting");
            throw new KotlinNothingValueException();
        }
        if (!(i >= 0)) {
            androidx.compose.runtime.b.t("Parameter offset is out of bounds");
            throw new KotlinNothingValueException();
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r;
        int i3 = this.t;
        int i4 = this.s;
        int i5 = i2;
        for (int i6 = i; i6 > 0; i6--) {
            I2 = ov7.I(this.b, g0(i5));
            i5 += I2;
            if (!(i5 <= i4)) {
                androidx.compose.runtime.b.t("Parameter offset is out of bounds");
                throw new KotlinNothingValueException();
            }
        }
        I = ov7.I(this.b, g0(i5));
        int i7 = this.h;
        int Q = Q(this.b, g0(i5));
        int i8 = i5 + I;
        int Q2 = Q(this.b, g0(i8));
        int i9 = Q2 - Q;
        p0(i9, Math.max(this.r - 1, 0));
        o0(I);
        int[] iArr = this.b;
        int g0 = g0(i8) * 5;
        kotlin.collections.d.i(iArr, iArr, g0(i2) * 5, g0, (I * 5) + g0);
        if (i9 > 0) {
            Object[] objArr = this.c;
            kotlin.collections.d.k(objArr, objArr, i7, R(Q + i9), R(Q2 + i9));
        }
        int i10 = Q + i9;
        int i11 = i10 - i7;
        int i12 = this.j;
        int i13 = this.k;
        int length = this.c.length;
        int i14 = this.l;
        int i15 = i2 + I;
        int i16 = i2;
        while (i16 < i15) {
            int g02 = g0(i16);
            int i17 = i12;
            int i18 = i11;
            l1(iArr, g02, S(Q(iArr, g02) - i11, i14 < g02 ? 0 : i17, i13, length));
            i16++;
            i12 = i17;
            i11 = i18;
        }
        u0(i8, i2, I);
        if (L0(i8, I)) {
            androidx.compose.runtime.b.t("Unexpectedly removed anchors");
            throw new KotlinNothingValueException();
        }
        X(i3, this.s, i2);
        if (i9 > 0) {
            M0(i10, i9, i8 - 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (j0(r12.r + r13) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y0(int r13, androidx.compose.runtime.r r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.m
            if (r0 > 0) goto Lf
            int r0 = r12.r
            int r0 = r0 + r13
            int r0 = r12.j0(r0)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.compose.runtime.b.Q(r1)
            int r0 = r12.r
            int r1 = r12.h
            int r2 = r12.i
            r12.E(r13)
            r12.b1()
            r12.I()
            androidx.compose.runtime.t r13 = r14.z()
            androidx.compose.runtime.t$a r3 = androidx.compose.runtime.t.w     // Catch: java.lang.Throwable -> L45
            r10 = 32
            r11 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.t.a.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L45
            r13.L()
            r12.U()
            r12.T()
            r12.r = r0
            r12.h = r1
            r12.i = r2
            return r14
        L45:
            r12 = move-exception
            r13.L()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.t.y0(int, androidx.compose.runtime.r, int):java.util.List");
    }
}
