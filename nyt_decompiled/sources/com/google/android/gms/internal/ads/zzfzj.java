package com.google.android.gms.internal.ads;

import defpackage.mge;
import defpackage.oje;
import defpackage.tge;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
final class zzfzj extends AbstractMap implements Serializable {
    private static final Object j = new Object();
    private transient Object a;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    private transient int e;
    private transient int f;
    private transient Set g;
    private transient Set h;
    private transient Collection i;

    zzfzj(int i) {
        x(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D() {
        return (1 << (this.e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(Object obj) {
        if (z()) {
            return -1;
        }
        int b = e9.b(obj);
        int D = D();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int c = c9.c(obj2, b & D);
        if (c != 0) {
            int i = ~D;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = a()[i3];
                if ((i4 & i) == i2 && mge.a(obj, c()[i3])) {
                    return i3;
                }
                c = i4 & D;
            } while (c != 0);
        }
        return -1;
    }

    private final int F(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object d = c9.d(i2);
        if (i4 != 0) {
            c9.e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] a = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = c9.c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = c9.c(d, i10);
                c9.e(d, i10, c);
                a[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.a = d;
        H(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(Object obj) {
        if (!z()) {
            int D = D();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int b = c9.b(obj, null, D, obj2, a(), c(), null);
            if (b != -1) {
                Object obj3 = d()[b];
                y(b, D);
                this.f--;
                w();
                return obj3;
            }
        }
        return j;
    }

    private final void H(int i) {
        this.e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] d() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object n(zzfzj zzfzjVar, int i) {
        return zzfzjVar.c()[i];
    }

    static /* synthetic */ Object q(zzfzj zzfzjVar) {
        Object obj = zzfzjVar.a;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object r(zzfzj zzfzjVar, int i) {
        return zzfzjVar.d()[i];
    }

    static /* synthetic */ void v(zzfzj zzfzjVar, int i, Object obj) {
        zzfzjVar.d()[i] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (z()) {
            return;
        }
        w();
        Map t = t();
        if (t != null) {
            this.e = oje.b(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            t.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(c(), 0, this.f, (Object) null);
        Arrays.fill(d(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map t = t();
        return t != null ? t.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map t = t();
        if (t != null) {
            return t.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (mge.a(obj, d()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        x8 x8Var = new x8(this);
        this.h = x8Var;
        return x8Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map t = t();
        if (t != null) {
            return t.get(obj);
        }
        int E = E(obj);
        if (E == -1) {
            return null;
        }
        return d()[E];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        z8 z8Var = new z8(this);
        this.g = z8Var;
        return z8Var;
    }

    final int l() {
        return isEmpty() ? -1 : 0;
    }

    final int m(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (z()) {
            tge.j(z(), "Arrays already allocated");
            int i = this.e;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = c9.d(max2);
            H(max2 - 1);
            this.b = new int[i];
            this.c = new Object[i];
            this.d = new Object[i];
        }
        Map t = t();
        if (t != null) {
            return t.put(obj, obj2);
        }
        int[] a = a();
        Object[] c = c();
        Object[] d = d();
        int i2 = this.f;
        int i3 = i2 + 1;
        int b = e9.b(obj);
        int D = D();
        int i4 = b & D;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int c2 = c9.c(obj3, i4);
        if (c2 != 0) {
            int i5 = ~D;
            int i6 = b & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = a[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && mge.a(obj, c[i8])) {
                    Object obj4 = d[i8];
                    d[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & D;
                i7++;
                if (i11 != 0) {
                    c2 = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(D() + 1, 1.0f);
                        int l = l();
                        while (l >= 0) {
                            linkedHashMap.put(c()[l], d()[l]);
                            l = m(l);
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        w();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > D) {
                        D = F(D, c9.a(D), b, i2);
                    } else {
                        a[i8] = (i3 & D) | i10;
                    }
                }
            }
        } else if (i3 > D) {
            D = F(D, c9.a(D), b, i2);
        } else {
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            c9.e(obj5, i4, i3);
        }
        int length = a().length;
        if (i3 > length && (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(a(), min);
            this.c = Arrays.copyOf(c(), min);
            this.d = Arrays.copyOf(d(), min);
        }
        a()[i2] = (~D) & b;
        c()[i2] = obj;
        d()[i2] = obj2;
        this.f = i3;
        w();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map t = t();
        if (t != null) {
            return t.remove(obj);
        }
        Object G = G(obj);
        if (G == j) {
            return null;
        }
        return G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map t = t();
        return t != null ? t.size() : this.f;
    }

    final Map t() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        b9 b9Var = new b9(this);
        this.i = b9Var;
        return b9Var;
    }

    final void w() {
        this.e += 32;
    }

    final void x(int i) {
        this.e = oje.b(8, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void y(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] a = a();
        Object[] c = c();
        Object[] d = d();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            c[i] = null;
            d[i] = null;
            a[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = c[i3];
        c[i] = obj2;
        d[i] = d[i3];
        c[i3] = null;
        d[i3] = null;
        a[i] = a[i3];
        a[i3] = 0;
        int b = e9.b(obj2) & i2;
        int c2 = c9.c(obj, b);
        if (c2 == size) {
            c9.e(obj, b, i4);
            return;
        }
        while (true) {
            int i5 = c2 - 1;
            int i6 = a[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                a[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            c2 = i7;
        }
    }

    final boolean z() {
        return this.a == null;
    }
}
