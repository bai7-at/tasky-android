package androidx.compose.runtime;

import defpackage.hd;
import defpackage.ov7;
import defpackage.yv3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class q {
    private final r a;
    private final int[] b;
    private final int c;
    private final Object[] d;
    private final int e;
    private HashMap f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public q(r rVar) {
        this.a = rVar;
        this.b = rVar.o();
        int p = rVar.p();
        this.c = p;
        this.d = rVar.q();
        this.e = rVar.t();
        this.i = p;
        this.j = -1;
    }

    private final Object J(int[] iArr, int i) {
        boolean N;
        int R;
        N = ov7.N(iArr, i);
        if (!N) {
            return Composer.a.a();
        }
        Object[] objArr = this.d;
        R = ov7.R(iArr, i);
        return objArr[R];
    }

    private final Object L(int[] iArr, int i) {
        boolean L;
        int S;
        L = ov7.L(iArr, i);
        if (!L) {
            return null;
        }
        Object[] objArr = this.d;
        S = ov7.S(iArr, i);
        return objArr[S];
    }

    private final Object b(int[] iArr, int i) {
        boolean J;
        int B;
        J = ov7.J(iArr, i);
        if (!J) {
            return Composer.a.a();
        }
        Object[] objArr = this.d;
        B = ov7.B(iArr, i);
        return objArr[B];
    }

    public final Object A(int i) {
        return L(this.b, i);
    }

    public final int B(int i) {
        int I;
        I = ov7.I(this.b, i);
        return I;
    }

    public final boolean C(int i) {
        boolean K;
        K = ov7.K(this.b, i);
        return K;
    }

    public final boolean D(int i) {
        boolean L;
        L = ov7.L(this.b, i);
        return L;
    }

    public final boolean E() {
        return r() || this.h == this.i;
    }

    public final boolean F() {
        boolean N;
        N = ov7.N(this.b, this.h);
        return N;
    }

    public final boolean G(int i) {
        boolean N;
        N = ov7.N(this.b, i);
        return N;
    }

    public final Object H() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            return Composer.a.a();
        }
        Object[] objArr = this.d;
        this.l = i + 1;
        return objArr[i];
    }

    public final Object I(int i) {
        boolean N;
        N = ov7.N(this.b, i);
        if (N) {
            return J(this.b, i);
        }
        return null;
    }

    public final int K(int i) {
        int Q;
        Q = ov7.Q(this.b, i);
        return Q;
    }

    public final int M(int i) {
        int T;
        T = ov7.T(this.b, i);
        return T;
    }

    public final void N(int i) {
        int I;
        if (!(this.k == 0)) {
            b.t("Cannot reposition while in an empty region");
            throw new KotlinNothingValueException();
        }
        this.h = i;
        int T = i < this.c ? ov7.T(this.b, i) : -1;
        this.j = T;
        if (T < 0) {
            this.i = this.c;
        } else {
            I = ov7.I(this.b, T);
            this.i = T + I;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void O(int i) {
        int I;
        I = ov7.I(this.b, i);
        int i2 = I + i;
        int i3 = this.h;
        if (i3 >= i && i3 <= i2) {
            this.j = i;
            this.i = i2;
            this.l = 0;
            this.m = 0;
            return;
        }
        b.t(("Index " + i + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    public final int P() {
        boolean N;
        int I;
        if (!(this.k == 0)) {
            b.t("Cannot skip while in an empty region");
            throw new KotlinNothingValueException();
        }
        N = ov7.N(this.b, this.h);
        int Q = N ? 1 : ov7.Q(this.b, this.h);
        int i = this.h;
        I = ov7.I(this.b, i);
        this.h = i + I;
        return Q;
    }

    public final void Q() {
        if (this.k == 0) {
            this.h = this.i;
        } else {
            b.t("Cannot skip the enclosing group while in an empty region");
            throw new KotlinNothingValueException();
        }
    }

    public final void R() {
        int T;
        int I;
        int V;
        if (this.k <= 0) {
            int i = this.j;
            int i2 = this.h;
            T = ov7.T(this.b, i2);
            if (T != i) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            HashMap hashMap = this.f;
            if (hashMap != null) {
            }
            this.j = i2;
            I = ov7.I(this.b, i2);
            this.i = I + i2;
            int i3 = i2 + 1;
            this.h = i3;
            V = ov7.V(this.b, i2);
            this.l = V;
            this.m = i2 >= this.c + (-1) ? this.e : ov7.F(this.b, i3);
        }
    }

    public final void S() {
        boolean N;
        if (this.k <= 0) {
            N = ov7.N(this.b, this.h);
            if (!N) {
                throw new IllegalArgumentException("Expected a node group");
            }
            R();
        }
    }

    public final hd a(int i) {
        int U;
        ArrayList n = this.a.n();
        U = ov7.U(n, i, this.c);
        if (U >= 0) {
            return (hd) n.get(U);
        }
        hd hdVar = new hd(i);
        n.add(-(U + 1), hdVar);
        return hdVar;
    }

    public final void c() {
        this.k++;
    }

    public final void d() {
        this.g = true;
        this.a.f(this, this.f);
    }

    public final boolean e(int i) {
        boolean D;
        D = ov7.D(this.b, i);
        return D;
    }

    public final void f() {
        int i = this.k;
        if (i <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.k = i - 1;
    }

    public final void g() {
        int T;
        int I;
        int i;
        if (this.k == 0) {
            if (!(this.h == this.i)) {
                b.t("endGroup() not called at the end of a group");
                throw new KotlinNothingValueException();
            }
            T = ov7.T(this.b, this.j);
            this.j = T;
            if (T < 0) {
                i = this.c;
            } else {
                I = ov7.I(this.b, T);
                i = T + I;
            }
            this.i = i;
        }
    }

    public final List h() {
        int O;
        boolean N;
        int I;
        ArrayList arrayList = new ArrayList();
        if (this.k > 0) {
            return arrayList;
        }
        int i = this.h;
        int i2 = 0;
        while (i < this.i) {
            O = ov7.O(this.b, i);
            Object L = L(this.b, i);
            N = ov7.N(this.b, i);
            arrayList.add(new yv3(O, L, i, N ? 1 : ov7.Q(this.b, i), i2));
            I = ov7.I(this.b, i);
            i += I;
            i2++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.g;
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.h;
    }

    public final Object l() {
        int i = this.h;
        if (i < this.i) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int m() {
        return this.i;
    }

    public final int n() {
        int O;
        int i = this.h;
        if (i >= this.i) {
            return 0;
        }
        O = ov7.O(this.b, i);
        return O;
    }

    public final Object o() {
        int i = this.h;
        if (i < this.i) {
            return L(this.b, i);
        }
        return null;
    }

    public final int p() {
        int I;
        I = ov7.I(this.b, this.h);
        return I;
    }

    public final int q() {
        int V;
        int i = this.l;
        V = ov7.V(this.b, this.j);
        return i - V;
    }

    public final boolean r() {
        return this.k > 0;
    }

    public final int s() {
        return this.j;
    }

    public final int t() {
        int Q;
        int i = this.j;
        if (i < 0) {
            return 0;
        }
        Q = ov7.Q(this.b, i);
        return Q;
    }

    public String toString() {
        return "SlotReader(current=" + this.h + ", key=" + n() + ", parent=" + this.j + ", end=" + this.i + ')';
    }

    public final int u() {
        return this.c;
    }

    public final r v() {
        return this.a;
    }

    public final Object w(int i) {
        return b(this.b, i);
    }

    public final Object x(int i) {
        return y(this.h, i);
    }

    public final Object y(int i, int i2) {
        int V;
        V = ov7.V(this.b, i);
        int i3 = i + 1;
        int i4 = V + i2;
        return i4 < (i3 < this.c ? ov7.F(this.b, i3) : this.e) ? this.d[i4] : Composer.a.a();
    }

    public final int z(int i) {
        int O;
        O = ov7.O(this.b, i);
        return O;
    }
}
