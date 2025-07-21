package defpackage;

import java.util.Arrays;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class py7 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public py7() {
        this(0, 1, null);
    }

    public void a(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            i(i, obj);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            qy7.d(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e = rv0.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.b, e);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        this.b[i3] = i;
        this.c[i3] = obj;
        this.d = i3 + 1;
    }

    public void b() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public py7 clone() {
        Object clone = super.clone();
        zq3.f(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        py7 py7Var = (py7) clone;
        py7Var.b = (int[]) this.b.clone();
        py7Var.c = (Object[]) this.c.clone();
        return py7Var;
    }

    public boolean d(int i) {
        return f(i) >= 0;
    }

    public Object e(int i) {
        return qy7.c(this, i);
    }

    public int f(int i) {
        if (this.a) {
            qy7.d(this);
        }
        return rv0.a(this.b, this.d, i);
    }

    public int g(Object obj) {
        if (this.a) {
            qy7.d(this);
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public int h(int i) {
        if (this.a) {
            qy7.d(this);
        }
        return this.b[i];
    }

    public void i(int i, Object obj) {
        Object obj2;
        int a = rv0.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = obj;
            return;
        }
        int i2 = ~a;
        if (i2 < this.d) {
            Object obj3 = this.c[i2];
            obj2 = qy7.a;
            if (obj3 == obj2) {
                this.b[i2] = i;
                this.c[i2] = obj;
                return;
            }
        }
        if (this.a && this.d >= this.b.length) {
            qy7.d(this);
            i2 = ~rv0.a(this.b, this.d, i);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e = rv0.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.b, e);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        int i4 = this.d;
        if (i4 - i2 != 0) {
            int[] iArr = this.b;
            int i5 = i2 + 1;
            d.i(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.c;
            d.k(objArr, objArr, i5, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public void k(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.c[i];
        obj = qy7.a;
        if (obj3 != obj) {
            Object[] objArr = this.c;
            obj2 = qy7.a;
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public Object l(int i, Object obj) {
        int f = f(i);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[f];
        objArr[f] = obj;
        return obj2;
    }

    public int m() {
        if (this.a) {
            qy7.d(this);
        }
        return this.d;
    }

    public Object n(int i) {
        if (this.a) {
            qy7.d(this);
        }
        return this.c[i];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object n = n(i2);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        zq3.g(sb2, "buffer.toString()");
        return sb2;
    }

    public py7(int i) {
        if (i == 0) {
            this.b = rv0.a;
            this.c = rv0.c;
        } else {
            int e = rv0.e(i);
            this.b = new int[e];
            this.c = new Object[e];
        }
    }

    public /* synthetic */ py7(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
