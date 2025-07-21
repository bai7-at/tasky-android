package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ff3 {
    private Object[] a;
    private Object[] b;
    private int c;

    public ff3(int i) {
        this.a = new Object[i];
        this.b = new Object[i];
    }

    private final int c(Object obj) {
        int c = u5.c(obj);
        int i = this.c - 1;
        Object[] objArr = this.a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int c2 = u5.c(obj2);
            if (c2 < c) {
                i2 = i3 + 1;
            } else {
                if (c2 <= c) {
                    return obj == obj2 ? i3 : d(i3, obj, c);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int d(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.a;
        int i3 = this.c;
        for (int i4 = i - 1; -1 < i4; i4--) {
            Object obj3 = objArr[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (u5.c(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -(i3 + 1);
            }
            obj2 = objArr[i];
            if (obj2 == obj) {
                return i;
            }
        } while (u5.c(obj2) == i2);
        return -(i + 1);
    }

    public final void a() {
        this.c = 0;
        d.w(this.a, null, 0, 0, 6, null);
        d.w(this.b, null, 0, 0, 6, null);
    }

    public final boolean b(Object obj) {
        return c(obj) >= 0;
    }

    public final Object e(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.b[c];
        }
        return null;
    }

    public final Object[] f() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    public final Object[] h() {
        return this.b;
    }

    public final boolean i() {
        return this.c > 0;
    }

    public final void j(Object obj, Object obj2) {
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i = this.c;
        int c = c(obj);
        if (c >= 0) {
            objArr2[c] = obj2;
            return;
        }
        int i2 = -(c + 1);
        boolean z = i == objArr.length;
        Object[] objArr3 = z ? new Object[i * 2] : objArr;
        int i3 = i2 + 1;
        d.k(objArr, objArr3, i3, i2, i);
        if (z) {
            d.o(objArr, objArr3, 0, 0, i2, 6, null);
        }
        objArr3[i2] = obj;
        this.a = objArr3;
        Object[] objArr4 = z ? new Object[i * 2] : objArr2;
        d.k(objArr2, objArr4, i3, i2, i);
        if (z) {
            d.o(objArr2, objArr4, 0, 0, i2, 6, null);
        }
        objArr4[i2] = obj2;
        this.b = objArr4;
        this.c++;
    }

    public /* synthetic */ ff3(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
