package defpackage;

import java.util.Arrays;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class lb4 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public lb4() {
        this(0, 1, null);
    }

    public void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public lb4 clone() {
        Object clone = super.clone();
        zq3.f(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        lb4 lb4Var = (lb4) clone;
        lb4Var.b = (long[]) this.b.clone();
        lb4Var.c = (Object[]) this.c.clone();
        return lb4Var;
    }

    public boolean c(long j) {
        return e(j) >= 0;
    }

    public Object d(long j) {
        Object obj;
        int b = rv0.b(this.b, this.d, j);
        if (b >= 0) {
            Object obj2 = this.c[b];
            obj = nb4.a;
            if (obj2 != obj) {
                return this.c[b];
            }
        }
        return null;
    }

    public int e(long j) {
        Object obj;
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = nb4.a;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return rv0.b(this.b, this.d, j);
    }

    public boolean f() {
        return l() == 0;
    }

    public long g(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = nb4.a;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public void h(long j, Object obj) {
        Object obj2;
        Object obj3;
        int b = rv0.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = ~b;
        if (i < this.d) {
            Object obj4 = this.c[i];
            obj3 = nb4.a;
            if (obj4 == obj3) {
                this.b[i] = j;
                this.c[i] = obj;
                return;
            }
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj5 = objArr[i4];
                    obj2 = nb4.a;
                    if (obj5 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj5;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~rv0.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int f = rv0.f(i5 + 1);
            long[] copyOf = Arrays.copyOf(this.b, f);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, f);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr2 = this.b;
            int i7 = i + 1;
            d.j(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.c;
            d.k(objArr2, objArr2, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public void i(long j) {
        Object obj;
        Object obj2;
        int b = rv0.b(this.b, this.d, j);
        if (b >= 0) {
            Object obj3 = this.c[b];
            obj = nb4.a;
            if (obj3 != obj) {
                Object[] objArr = this.c;
                obj2 = nb4.a;
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public void k(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.c[i];
        obj = nb4.a;
        if (obj3 != obj) {
            Object[] objArr = this.c;
            obj2 = nb4.a;
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public int l() {
        Object obj;
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = nb4.a;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public Object m(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = nb4.a;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            Object m = m(i2);
            if (m != sb) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public lb4(int i) {
        if (i == 0) {
            this.b = rv0.b;
            this.c = rv0.c;
        } else {
            int f = rv0.f(i);
            this.b = new long[f];
            this.c = new Object[f];
        }
    }

    public /* synthetic */ lb4(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
