package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class us8 {
    public static final a e = new a(null);
    public static final int f = 8;
    private static final us8 g = new us8(0, 0, new Object[0]);
    private int a;
    private int b;
    private final wx4 c;
    private Object[] d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final us8 a() {
            return us8.g;
        }

        private a() {
        }
    }

    public static final class b {
        private us8 a;
        private final int b;

        public b(us8 us8Var, int i) {
            this.a = us8Var;
            this.b = i;
        }

        public final us8 a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(us8 us8Var) {
            this.a = us8Var;
        }
    }

    public us8(int i, int i2, Object[] objArr, wx4 wx4Var) {
        this.a = i;
        this.b = i2;
        this.c = wx4Var;
        this.d = objArr;
    }

    private final us8 A(int i, or5 or5Var) {
        Object[] h;
        Object[] h2;
        or5Var.l(or5Var.size() - 1);
        or5Var.i(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != or5Var.f()) {
            h = ys8.h(this.d, i);
            return new us8(0, 0, h, or5Var.f());
        }
        h2 = ys8.h(this.d, i);
        this.d = h2;
        return this;
    }

    private final us8 B(int i, Object obj, Object obj2, wx4 wx4Var) {
        Object[] g2;
        Object[] g3;
        int n = n(i);
        if (this.c != wx4Var) {
            g2 = ys8.g(this.d, n, obj, obj2);
            return new us8(i | this.a, this.b, g2, wx4Var);
        }
        g3 = ys8.g(this.d, n, obj, obj2);
        this.d = g3;
        this.a = i | this.a;
        return this;
    }

    private final us8 C(int i, int i2, int i3, Object obj, Object obj2, int i4, wx4 wx4Var) {
        if (this.c != wx4Var) {
            return new us8(this.a ^ i2, this.b | i2, d(i, i2, i3, obj, obj2, i4, wx4Var), wx4Var);
        }
        this.d = d(i, i2, i3, obj, obj2, i4, wx4Var);
        this.a ^= i2;
        this.b |= i2;
        return this;
    }

    private final us8 F(us8 us8Var, int i, int i2, em1 em1Var, or5 or5Var) {
        if (r(i)) {
            us8 N = N(O(i));
            if (us8Var.r(i)) {
                return N.E(us8Var.N(us8Var.O(i)), i2 + 5, em1Var, or5Var);
            }
            if (!us8Var.q(i)) {
                return N;
            }
            int n = us8Var.n(i);
            Object t = us8Var.t(n);
            Object W = us8Var.W(n);
            int size = or5Var.size();
            us8 D = N.D(t != null ? t.hashCode() : 0, t, W, i2 + 5, or5Var);
            if (or5Var.size() != size) {
                return D;
            }
            em1Var.c(em1Var.a() + 1);
            return D;
        }
        if (!us8Var.r(i)) {
            int n2 = n(i);
            Object t2 = t(n2);
            Object W2 = W(n2);
            int n3 = us8Var.n(i);
            Object t3 = us8Var.t(n3);
            return u(t2 != null ? t2.hashCode() : 0, t2, W2, t3 != null ? t3.hashCode() : 0, t3, us8Var.W(n3), i2 + 5, or5Var.f());
        }
        us8 N2 = us8Var.N(us8Var.O(i));
        if (q(i)) {
            int n4 = n(i);
            Object t4 = t(n4);
            int i3 = i2 + 5;
            if (!N2.k(t4 != null ? t4.hashCode() : 0, t4, i3)) {
                return N2.D(t4 != null ? t4.hashCode() : 0, t4, W(n4), i3, or5Var);
            }
            em1Var.c(em1Var.a() + 1);
        }
        return N2;
    }

    private final us8 I(int i, int i2, or5 or5Var) {
        Object[] h;
        Object[] h2;
        or5Var.l(or5Var.size() - 1);
        or5Var.i(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != or5Var.f()) {
            h = ys8.h(this.d, i);
            return new us8(i2 ^ this.a, this.b, h, or5Var.f());
        }
        h2 = ys8.h(this.d, i);
        this.d = h2;
        this.a ^= i2;
        return this;
    }

    private final us8 J(int i, int i2, wx4 wx4Var) {
        Object[] i3;
        Object[] i4;
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != wx4Var) {
            i3 = ys8.i(objArr, i);
            return new us8(this.a, this.b ^ i2, i3, wx4Var);
        }
        i4 = ys8.i(objArr, i);
        this.d = i4;
        this.b ^= i2;
        return this;
    }

    private final us8 K(us8 us8Var, us8 us8Var2, int i, int i2, wx4 wx4Var) {
        return us8Var2 == null ? J(i, i2, wx4Var) : (this.c == wx4Var || us8Var != us8Var2) ? L(i, us8Var2, wx4Var) : this;
    }

    private final us8 L(int i, us8 us8Var, wx4 wx4Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && us8Var.d.length == 2 && us8Var.b == 0) {
            us8Var.a = this.b;
            return us8Var;
        }
        if (this.c == wx4Var) {
            objArr[i] = us8Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        zq3.g(copyOf, "copyOf(this, size)");
        copyOf[i] = us8Var;
        return new us8(this.a, this.b, copyOf, wx4Var);
    }

    private final us8 M(int i, Object obj, or5 or5Var) {
        if (this.c == or5Var.f()) {
            this.d[i + 1] = obj;
            return this;
        }
        or5Var.h(or5Var.c() + 1);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        zq3.g(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new us8(this.a, this.b, copyOf, or5Var.f());
    }

    private final us8 R(int i, int i2) {
        Object[] h;
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        h = ys8.h(objArr, i);
        return new us8(i2 ^ this.a, this.b, h);
    }

    private final us8 S(int i, int i2) {
        Object[] i3;
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        i3 = ys8.i(objArr, i);
        return new us8(this.a, this.b ^ i2, i3);
    }

    private final us8 T(us8 us8Var, us8 us8Var2, int i, int i2) {
        return us8Var2 == null ? S(i, i2) : us8Var != us8Var2 ? U(i, i2, us8Var2) : this;
    }

    private final us8 U(int i, int i2, us8 us8Var) {
        Object[] k;
        Object[] objArr = us8Var.d;
        if (objArr.length != 2 || us8Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            zq3.g(copyOf, "copyOf(this, newSize)");
            copyOf[i] = us8Var;
            return new us8(this.a, this.b, copyOf);
        }
        if (this.d.length == 1) {
            us8Var.a = this.b;
            return us8Var;
        }
        k = ys8.k(this.d, i, n(i2), objArr[0], objArr[1]);
        return new us8(this.a ^ i2, this.b ^ i2, k);
    }

    private final us8 V(int i, Object obj) {
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        zq3.g(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new us8(this.a, this.b, copyOf);
    }

    private final Object W(int i) {
        return this.d[i + 1];
    }

    private final b b() {
        return new b(this, 1);
    }

    private final b c() {
        return new b(this, 0);
    }

    private final Object[] d(int i, int i2, int i3, Object obj, Object obj2, int i4, wx4 wx4Var) {
        Object[] j;
        Object t = t(i);
        j = ys8.j(this.d, i, O(i2) + 1, u(t != null ? t.hashCode() : 0, t, W(i), i3, obj, obj2, i4 + 5, wx4Var));
        return j;
    }

    private final int e() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += N(i).e();
        }
        return bitCount;
    }

    private final boolean f(Object obj) {
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g2 <= j) || (n < 0 && j <= g2)) {
            while (!zq3.c(obj, this.d[g2])) {
                if (g2 != j) {
                    g2 += n;
                }
            }
            return true;
        }
        return false;
    }

    private final Object g(Object obj) {
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n <= 0 || g2 > j) && (n >= 0 || j > g2)) {
            return null;
        }
        while (!zq3.c(obj, t(g2))) {
            if (g2 == j) {
                return null;
            }
            g2 += n;
        }
        return W(g2);
    }

    private final b h(Object obj, Object obj2) {
        Object[] g2;
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g3 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g3 <= j) || (n < 0 && j <= g3)) {
            while (!zq3.c(obj, t(g3))) {
                if (g3 != j) {
                    g3 += n;
                }
            }
            if (obj2 == W(g3)) {
                return null;
            }
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            zq3.g(copyOf, "copyOf(this, size)");
            copyOf[g3 + 1] = obj2;
            return new us8(0, 0, copyOf).c();
        }
        g2 = ys8.g(this.d, 0, obj, obj2);
        return new us8(0, 0, g2).b();
    }

    private final us8 i(Object obj) {
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g2 <= j) || (n < 0 && j <= g2)) {
            while (!zq3.c(obj, t(g2))) {
                if (g2 != j) {
                    g2 += n;
                }
            }
            return j(g2);
        }
        return this;
    }

    private final us8 j(int i) {
        Object[] h;
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        h = ys8.h(objArr, i);
        return new us8(0, 0, h);
    }

    private final boolean l(us8 us8Var) {
        if (this == us8Var) {
            return true;
        }
        if (this.b != us8Var.b || this.a != us8Var.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != us8Var.d[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i) {
        return (this.b & i) != 0;
    }

    private final us8 s(int i, Object obj, Object obj2) {
        Object[] g2;
        g2 = ys8.g(this.d, n(i), obj, obj2);
        return new us8(i | this.a, this.b, g2);
    }

    private final Object t(int i) {
        return this.d[i];
    }

    private final us8 u(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, wx4 wx4Var) {
        if (i3 > 30) {
            return new us8(0, 0, new Object[]{obj, obj2, obj3, obj4}, wx4Var);
        }
        int f2 = ys8.f(i, i3);
        int f3 = ys8.f(i2, i3);
        if (f2 != f3) {
            return new us8((1 << f2) | (1 << f3), 0, f2 < f3 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, wx4Var);
        }
        return new us8(0, 1 << f2, new Object[]{u(i, obj, obj2, i2, obj3, obj4, i3 + 5, wx4Var)}, wx4Var);
    }

    private final us8 v(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new us8(this.a ^ i2, this.b | i2, d(i, i2, i3, obj, obj2, i4, null));
    }

    private final us8 w(Object obj, Object obj2, or5 or5Var) {
        Object[] g2;
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g3 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g3 <= j) || (n < 0 && j <= g3)) {
            while (!zq3.c(obj, t(g3))) {
                if (g3 != j) {
                    g3 += n;
                }
            }
            or5Var.i(W(g3));
            if (this.c == or5Var.f()) {
                this.d[g3 + 1] = obj2;
                return this;
            }
            or5Var.h(or5Var.c() + 1);
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            zq3.g(copyOf, "copyOf(this, size)");
            copyOf[g3 + 1] = obj2;
            return new us8(0, 0, copyOf, or5Var.f());
        }
        or5Var.l(or5Var.size() + 1);
        g2 = ys8.g(this.d, 0, obj, obj2);
        return new us8(0, 0, g2, or5Var.f());
    }

    private final us8 x(us8 us8Var, em1 em1Var, wx4 wx4Var) {
        op0.a(this.b == 0);
        op0.a(this.a == 0);
        op0.a(us8Var.b == 0);
        op0.a(us8Var.a == 0);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + us8Var.d.length);
        zq3.g(copyOf, "copyOf(this, newSize)");
        int length = this.d.length;
        ym3 t = uo6.t(uo6.u(0, us8Var.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g2 <= j) || (n < 0 && j <= g2)) {
            while (true) {
                if (f(us8Var.d[g2])) {
                    em1Var.c(em1Var.a() + 1);
                } else {
                    Object[] objArr2 = us8Var.d;
                    copyOf[length] = objArr2[g2];
                    copyOf[length + 1] = objArr2[g2 + 1];
                    length += 2;
                }
                if (g2 == j) {
                    break;
                }
                g2 += n;
            }
        }
        if (length == this.d.length) {
            return this;
        }
        if (length == us8Var.d.length) {
            return us8Var;
        }
        if (length == copyOf.length) {
            return new us8(0, 0, copyOf, wx4Var);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        zq3.g(copyOf2, "copyOf(this, newSize)");
        return new us8(0, 0, copyOf2, wx4Var);
    }

    private final us8 y(Object obj, or5 or5Var) {
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g2 <= j) || (n < 0 && j <= g2)) {
            while (!zq3.c(obj, t(g2))) {
                if (g2 != j) {
                    g2 += n;
                }
            }
            return A(g2, or5Var);
        }
        return this;
    }

    private final us8 z(Object obj, Object obj2, or5 or5Var) {
        ym3 t = uo6.t(uo6.u(0, this.d.length), 2);
        int g2 = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g2 <= j) || (n < 0 && j <= g2)) {
            while (true) {
                if (!zq3.c(obj, t(g2)) || !zq3.c(obj2, W(g2))) {
                    if (g2 == j) {
                        break;
                    }
                    g2 += n;
                } else {
                    return A(g2, or5Var);
                }
            }
        }
        return this;
    }

    public final us8 D(int i, Object obj, Object obj2, int i2, or5 or5Var) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (zq3.c(obj, t(n))) {
                or5Var.i(W(n));
                return W(n) == obj2 ? this : M(n, obj2, or5Var);
            }
            or5Var.l(or5Var.size() + 1);
            return C(n, f2, i, obj, obj2, i2, or5Var.f());
        }
        if (!r(f2)) {
            or5Var.l(or5Var.size() + 1);
            return B(f2, obj, obj2, or5Var.f());
        }
        int O = O(f2);
        us8 N = N(O);
        us8 w = i2 == 30 ? N.w(obj, obj2, or5Var) : N.D(i, obj, obj2, i2 + 5, or5Var);
        return N == w ? this : L(O, w, or5Var.f());
    }

    public final us8 E(us8 us8Var, int i, em1 em1Var, or5 or5Var) {
        if (this == us8Var) {
            em1Var.b(e());
            return this;
        }
        if (i > 30) {
            return x(us8Var, em1Var, or5Var.f());
        }
        int i2 = this.b | us8Var.b;
        int i3 = this.a;
        int i4 = us8Var.a;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            if (zq3.c(t(n(lowestOneBit)), us8Var.t(us8Var.n(lowestOneBit)))) {
                i7 |= lowestOneBit;
            } else {
                i2 |= lowestOneBit;
            }
            i6 ^= lowestOneBit;
        }
        if ((i2 & i7) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        us8 us8Var2 = (zq3.c(this.c, or5Var.f()) && this.a == i7 && this.b == i2) ? this : new us8(i7, i2, new Object[(Integer.bitCount(i7) * 2) + Integer.bitCount(i2)]);
        int i8 = 0;
        int i9 = i2;
        int i10 = 0;
        while (i9 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i9);
            us8Var2.d[(r5.length - 1) - i10] = F(us8Var, lowestOneBit2, i, em1Var, or5Var);
            i10++;
            i9 ^= lowestOneBit2;
        }
        while (i7 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i7);
            int i11 = i8 * 2;
            if (us8Var.q(lowestOneBit3)) {
                int n = us8Var.n(lowestOneBit3);
                us8Var2.d[i11] = us8Var.t(n);
                us8Var2.d[i11 + 1] = us8Var.W(n);
                if (q(lowestOneBit3)) {
                    em1Var.c(em1Var.a() + 1);
                }
            } else {
                int n2 = n(lowestOneBit3);
                us8Var2.d[i11] = t(n2);
                us8Var2.d[i11 + 1] = W(n2);
            }
            i8++;
            i7 ^= lowestOneBit3;
        }
        return l(us8Var2) ? this : us8Var.l(us8Var2) ? us8Var : us8Var2;
    }

    public final us8 G(int i, Object obj, int i2, or5 or5Var) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return zq3.c(obj, t(n)) ? I(n, f2, or5Var) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        us8 N = N(O);
        return K(N, i2 == 30 ? N.y(obj, or5Var) : N.G(i, obj, i2 + 5, or5Var), O, f2, or5Var.f());
    }

    public final us8 H(int i, Object obj, Object obj2, int i2, or5 or5Var) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return (zq3.c(obj, t(n)) && zq3.c(obj2, W(n))) ? I(n, f2, or5Var) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        us8 N = N(O);
        return K(N, i2 == 30 ? N.z(obj, obj2, or5Var) : N.H(i, obj, obj2, i2 + 5, or5Var), O, f2, or5Var.f());
    }

    public final us8 N(int i) {
        Object obj = this.d[i];
        zq3.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (us8) obj;
    }

    public final int O(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final b P(int i, Object obj, Object obj2, int i2) {
        b P;
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (!zq3.c(obj, t(n))) {
                return v(n, f2, i, obj, obj2, i2).b();
            }
            if (W(n) == obj2) {
                return null;
            }
            return V(n, obj2).c();
        }
        if (!r(f2)) {
            return s(f2, obj, obj2).b();
        }
        int O = O(f2);
        us8 N = N(O);
        if (i2 == 30) {
            P = N.h(obj, obj2);
            if (P == null) {
                return null;
            }
        } else {
            P = N.P(i, obj, obj2, i2 + 5);
            if (P == null) {
                return null;
            }
        }
        P.c(U(O, f2, P.a()));
        return P;
    }

    public final us8 Q(int i, Object obj, int i2) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            return zq3.c(obj, t(n)) ? R(n, f2) : this;
        }
        if (!r(f2)) {
            return this;
        }
        int O = O(f2);
        us8 N = N(O);
        return T(N, i2 == 30 ? N.i(obj) : N.Q(i, obj, i2 + 5), O, f2);
    }

    public final boolean k(int i, Object obj, int i2) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            return zq3.c(obj, t(n(f2)));
        }
        if (!r(f2)) {
            return false;
        }
        us8 N = N(O(f2));
        return i2 == 30 ? N.f(obj) : N.k(i, obj, i2 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.a);
    }

    public final int n(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object o(int i, Object obj, int i2) {
        int f2 = 1 << ys8.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (zq3.c(obj, t(n))) {
                return W(n);
            }
            return null;
        }
        if (!r(f2)) {
            return null;
        }
        us8 N = N(O(f2));
        return i2 == 30 ? N.g(obj) : N.o(i, obj, i2 + 5);
    }

    public final Object[] p() {
        return this.d;
    }

    public final boolean q(int i) {
        return (this.a & i) != 0;
    }

    public us8(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
