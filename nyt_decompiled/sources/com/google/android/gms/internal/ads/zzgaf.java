package com.google.android.gms.internal.ads;

import defpackage.tge;
import defpackage.yie;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzgaf extends zzfzv implements Set {
    private transient zzgaa b;

    zzgaf() {
    }

    public static zzgaf A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return D(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgaf D(int i, Object... objArr) {
        if (i == 0) {
            return zzgbq.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        int n = n(i);
        Object[] objArr2 = new Object[n];
        int i2 = n - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            fa.a(obj2, i5);
            int hashCode = obj2.hashCode();
            int a = e9.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgcb(obj4);
        }
        if (n(i4) < n / 2) {
            return D(i4, objArr);
        }
        if (E(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgbq(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int n(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            tge.f(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static m9 p(int i) {
        return new m9(i);
    }

    public static zzgaf t(Collection collection) {
        Object[] array = collection.toArray();
        return D(array.length, array);
    }

    public static zzgaf u(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? D(length, (Object[]) objArr.clone()) : new zzgcb(objArr[0]) : zzgbq.i;
    }

    public static zzgaf v() {
        return zzgbq.i;
    }

    public static zzgaf w(Object obj) {
        return new zzgcb(obj);
    }

    public static zzgaf x(Object obj, Object obj2) {
        return D(2, obj, obj2);
    }

    public static zzgaf y(Object obj, Object obj2, Object obj3) {
        return D(3, obj, obj2, obj3);
    }

    public static zzgaf z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return D(5, obj, obj2, obj3, obj4, obj5);
    }

    boolean C() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgaf) && C() && ((zzgaf) obj).C() && hashCode() != obj.hashCode()) {
            return false;
        }
        return na.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public zzgaa f() {
        zzgaa zzgaaVar = this.b;
        if (zzgaaVar != null) {
            return zzgaaVar;
        }
        zzgaa o = o();
        this.b = o;
        return o;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public abstract yie g();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return na.a(this);
    }

    zzgaa o() {
        Object[] array = toArray();
        int i = zzgaa.c;
        return zzgaa.o(array, array.length);
    }
}
