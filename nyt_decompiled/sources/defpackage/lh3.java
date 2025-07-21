package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes5.dex */
public abstract class lh3 {
    private final Object[] a;
    private int b;

    protected lh3(Object[] objArr) {
        this.a = objArr;
    }

    private static int a(Object obj, Object obj2, Comparator comparator) {
        if (obj == null) {
            return obj2 == null ? 0 : -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    private static Object[] g(Object[] objArr, Comparator comparator) {
        Object obj = null;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2 += 2) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr[i2 + 1];
            if (obj2 != null) {
                if (obj != null && comparator.compare(obj2, obj) == 0) {
                    i -= 2;
                }
                if (obj3 == null) {
                    obj = null;
                } else {
                    int i3 = i + 1;
                    objArr[i] = obj2;
                    i += 2;
                    objArr[i3] = obj3;
                    obj = obj2;
                }
            }
        }
        if (objArr.length == i) {
            return objArr;
        }
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static void j(Object[] objArr, int i, int i2, int i3, Object[] objArr2, Comparator comparator) {
        int i4 = i;
        int i5 = i2;
        while (i < i3) {
            if (i4 >= i2 - 1 || (i5 < i3 - 1 && a(objArr[i4], objArr[i5], comparator) > 0)) {
                objArr2[i] = objArr[i5];
                objArr2[i + 1] = objArr[i5 + 1];
                i5 += 2;
            } else {
                objArr2[i] = objArr[i4];
                objArr2[i + 1] = objArr[i4 + 1];
                i4 += 2;
            }
            i += 2;
        }
    }

    private static void k(Object[] objArr, Comparator comparator) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        m(objArr2, 0, objArr.length, objArr, comparator);
    }

    private static Object[] l(Object[] objArr, Comparator comparator) {
        n29.a(objArr.length % 2 == 0, "You must provide an even number of key/value pair arguments.");
        if (objArr.length == 0) {
            return objArr;
        }
        k(objArr, comparator);
        return g(objArr, comparator);
    }

    private static void m(Object[] objArr, int i, int i2, Object[] objArr2, Comparator comparator) {
        if (i2 - i <= 2) {
            return;
        }
        int i3 = ((i2 + i) / 4) * 2;
        m(objArr2, i, i3, objArr, comparator);
        m(objArr2, i3, i2, objArr, comparator);
        j(objArr, i, i3, i2, objArr2, comparator);
    }

    public final Map c() {
        return gp6.i(e());
    }

    protected final List e() {
        return Arrays.asList(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lh3) {
            return Arrays.equals(this.a, ((lh3) obj).a);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a) ^ 1000003;
        this.b = hashCode;
        return hashCode;
    }

    public final Object i(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (obj.equals(objArr[i])) {
                return this.a[i + 1];
            }
            i += 2;
        }
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            Object obj2 = objArr[i + 1];
            if (obj2 instanceof String) {
                obj = '\"' + ((String) obj2) + '\"';
            } else {
                obj = obj2.toString();
            }
            sb.append(this.a[i]);
            sb.append("=");
            sb.append(obj);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    protected lh3(Object[] objArr, Comparator comparator) {
        this(l(objArr, comparator));
    }
}
