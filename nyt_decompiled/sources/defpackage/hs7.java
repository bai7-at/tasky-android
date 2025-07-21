package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class hs7 {
    private int[] a;
    private Object[] b;
    private int c;

    public hs7() {
        this(0, 1, null);
    }

    private final int d(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = rv0.a(this.a, i2, i);
        if (a < 0 || zq3.c(obj, this.b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (zq3.c(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (zq3.c(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int h() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = rv0.a(this.a, i, 0);
        if (a < 0 || this.b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (zq3.c(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void c(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i * 2);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.c > 0) {
            this.a = rv0.a;
            this.b = rv0.c;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof hs7) {
                if (size() != ((hs7) obj).size()) {
                    return false;
                }
                hs7 hs7Var = (hs7) obj;
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    Object i3 = i(i2);
                    Object n = n(i2);
                    Object obj2 = hs7Var.get(i3);
                    if (n == null) {
                        if (obj2 != null || !hs7Var.containsKey(i3)) {
                            return false;
                        }
                    } else if (!zq3.c(n, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object i6 = i(i5);
                Object n2 = n(i5);
                Object obj3 = ((Map) obj).get(i6);
                if (n2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(i6)) {
                        return false;
                    }
                } else if (!zq3.c(n2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? h() : d(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return this.b[(f << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f = f(obj);
        return f >= 0 ? this.b[(f << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public Object i(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public void j(hs7 hs7Var) {
        zq3.h(hs7Var, "map");
        int i = hs7Var.c;
        c(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(hs7Var.i(i2), hs7Var.n(i2));
            }
        } else if (i > 0) {
            d.i(hs7Var.a, this.a, 0, 0, i);
            d.k(hs7Var.b, this.b, 0, 0, i << 1);
            this.c = i;
        }
    }

    public Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.a;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    d.i(iArr, iArr, i, i5, i2);
                    Object[] objArr2 = this.b;
                    d.k(objArr2, objArr2, i3, i5 << 1, i2 << 1);
                }
                Object[] objArr3 = this.b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i7);
                zq3.g(copyOf, "copyOf(this, newSize)");
                this.a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.b, i7 << 1);
                zq3.g(copyOf2, "copyOf(this, newSize)");
                this.b = copyOf2;
                if (i2 != this.c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    d.i(iArr, this.a, 0, 0, i);
                    d.k(objArr, this.b, 0, 0, i3);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    d.i(iArr, this.a, i, i8, i2);
                    d.k(objArr, this.b, i3, i8 << 1, i2 << 1);
                }
            }
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            this.c = i4;
        }
        return obj;
    }

    public Object m(int i, Object obj) {
        if (i < 0 || i >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object n(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[(i << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d = obj != null ? d(obj, hashCode) : h();
        if (d >= 0) {
            int i2 = (d << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~d;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 << 1);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            d.i(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            d.k(objArr2, objArr2, i5 << 1, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return l(f);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            return m(f, obj2);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object n = n(i2);
            if (n != sb) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public hs7(int i) {
        this.a = i == 0 ? rv0.a : new int[i];
        this.b = i == 0 ? rv0.c : new Object[i << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f < 0 || !zq3.c(obj2, n(f))) {
            return false;
        }
        l(f);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f = f(obj);
        if (f < 0 || !zq3.c(obj2, n(f))) {
            return false;
        }
        m(f, obj3);
        return true;
    }

    public /* synthetic */ hs7(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public hs7(hs7 hs7Var) {
        this(0, 1, null);
        if (hs7Var != null) {
            j(hs7Var);
        }
    }
}
