package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.cc5;
import defpackage.cs5;
import defpackage.hs5;
import defpackage.op0;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.v54;
import defpackage.zq3;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.d;

/* loaded from: classes.dex */
public final class a extends AbstractPersistentList implements cs5 {
    private final Object[] b;
    private final Object[] c;
    private final int d;
    private final int e;

    public a(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (size() > 32) {
            op0.a(size() - c.d(size()) <= uo6.i(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] c(int i) {
        if (v() <= i) {
            return this.c;
        }
        Object[] objArr = this.b;
        for (int i2 = this.e; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[c.a(i, i2)];
            zq3.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] g(Object[] objArr, int i, int i2, Object obj, cc5 cc5Var) {
        Object[] copyOf;
        int a = c.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                zq3.g(copyOf, "copyOf(this, newSize)");
            }
            d.k(objArr, copyOf, a + 1, a, 31);
            cc5Var.b(objArr[31]);
            copyOf[a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        zq3.g(copyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        Object obj2 = objArr[a];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a] = g((Object[]) obj2, i3, i2, obj, cc5Var);
        int i4 = a + 1;
        while (i4 < 32 && copyOf2[i4] != null) {
            Object obj3 = objArr[i4];
            zq3.f(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i4] = g((Object[]) obj3, i3, 0, cc5Var.a(), cc5Var);
            i4++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    private final a j(Object[] objArr, int i, Object obj) {
        int size = size() - v();
        Object[] copyOf = Arrays.copyOf(this.c, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            d.k(this.c, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new a(objArr, copyOf, size() + 1, this.e);
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[31];
        d.k(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return p(objArr, copyOf, c.c(obj2));
    }

    private final Object[] n(Object[] objArr, int i, int i2, cc5 cc5Var) {
        Object[] n;
        int a = c.a(i2, i);
        if (i == 5) {
            cc5Var.b(objArr[a]);
            n = null;
        } else {
            Object obj = objArr[a];
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            n = n((Object[]) obj, i - 5, i2, cc5Var);
        }
        if (n == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        copyOf[a] = n;
        return copyOf;
    }

    private final cs5 o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                zq3.g(objArr, "copyOf(this, newSize)");
            }
            return new b(objArr);
        }
        cc5 cc5Var = new cc5(null);
        Object[] n = n(objArr, i2, i - 1, cc5Var);
        zq3.e(n);
        Object a = cc5Var.a();
        zq3.f(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a;
        if (n[1] != null) {
            return new a(n, objArr2, i, i2);
        }
        Object obj = n[0];
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new a((Object[]) obj, objArr2, i, i2 - 5);
    }

    private final a p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.e;
        if (size <= (1 << i)) {
            return new a(q(objArr, i, objArr2), objArr3, size() + 1, this.e);
        }
        Object[] c = c.c(objArr);
        int i2 = this.e + 5;
        return new a(q(c, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] q(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            defpackage.zq3.g(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r3 = r3.q(r2, r5, r6)
            r4[r0] = r3
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a.q(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] t(Object[] objArr, int i, int i2, cc5 cc5Var) {
        Object[] copyOf;
        int a = c.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                zq3.g(copyOf, "copyOf(this, newSize)");
            }
            d.k(objArr, copyOf, a, a + 1, 32);
            copyOf[31] = cc5Var.a();
            cc5Var.b(objArr[a]);
            return copyOf;
        }
        int a2 = objArr[31] == null ? c.a(v() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        zq3.g(copyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        int i4 = a + 1;
        if (i4 <= a2) {
            while (true) {
                Object obj = copyOf2[a2];
                zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a2] = t((Object[]) obj, i3, 0, cc5Var);
                if (a2 == i4) {
                    break;
                }
                a2--;
            }
        }
        Object obj2 = copyOf2[a];
        zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a] = t((Object[]) obj2, i3, i2, cc5Var);
        return copyOf2;
    }

    private final cs5 u(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        op0.a(i3 < size);
        if (size == 1) {
            return o(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.c, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (i3 < i4) {
            d.k(this.c, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new a(objArr, copyOf, (i + size) - 1, i2);
    }

    private final int v() {
        return c.d(size());
    }

    private final Object[] w(Object[] objArr, int i, int i2, Object obj) {
        int a = c.a(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[a] = obj;
        } else {
            Object obj2 = copyOf[a];
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a] = w((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    @Override // defpackage.cs5
    public cs5 P(int i) {
        v54.a(i, size());
        int v = v();
        return i >= v ? u(this.b, v, this.e, i - v) : u(t(this.b, this.e, i, new cc5(this.c[0])), v, this.e, 0);
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.List, defpackage.cs5
    public cs5 add(Object obj) {
        int size = size() - v();
        if (size >= 32) {
            return p(this.b, this.c, c.c(obj));
        }
        Object[] copyOf = Arrays.copyOf(this.c, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        copyOf[size] = obj;
        return new a(this.b, copyOf, size() + 1, this.e);
    }

    @Override // defpackage.cs5
    public cs5 e1(ss2 ss2Var) {
        PersistentVectorBuilder b = b();
        b.N(ss2Var);
        return b.build();
    }

    @Override // defpackage.cs5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public PersistentVectorBuilder b() {
        return new PersistentVectorBuilder(this, this.b, this.c, this.e);
    }

    @Override // kotlin.collections.a, java.util.List
    public Object get(int i) {
        v54.a(i, size());
        return c(i)[i & 31];
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator(int i) {
        v54.b(i, size());
        return new hs5(this.b, this.c, i, size(), (this.e / 5) + 1);
    }

    @Override // kotlin.collections.a, java.util.List, defpackage.cs5
    public cs5 set(int i, Object obj) {
        v54.a(i, size());
        if (v() > i) {
            return new a(w(this.b, this.e, i, obj), this.c, size(), this.e);
        }
        Object[] copyOf = Arrays.copyOf(this.c, 32);
        zq3.g(copyOf, "copyOf(this, newSize)");
        copyOf[i & 31] = obj;
        return new a(this.b, copyOf, size(), this.e);
    }

    @Override // java.util.List, defpackage.cs5
    public cs5 add(int i, Object obj) {
        v54.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        int v = v();
        if (i >= v) {
            return j(this.b, i - v, obj);
        }
        cc5 cc5Var = new cc5(null);
        return j(g(this.b, this.e, i, obj, cc5Var), 0, cc5Var.a());
    }
}
