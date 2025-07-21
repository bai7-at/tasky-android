package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class zzst<E> extends zzsk<E> implements Set<E> {
    private transient zzso zza;

    zzst() {
    }

    private static zzst zzh(int i, Object... objArr) {
        if (i == 0) {
            return zzto.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zztt(obj);
        }
        int zzj = zzj(i);
        Object[] objArr2 = new Object[zzj];
        int i2 = zzj - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zztg.zza(obj2, i5);
            int hashCode = obj2.hashCode();
            int zzb = zzsi.zzb(hashCode);
            while (true) {
                int i6 = zzb & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zzb++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zztt(obj4);
        }
        if (zzj(i4) < zzj / 2) {
            return zzh(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzto(objArr, i3, objArr2, i2, i4);
    }

    static int zzj(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            zzrm.zze(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzst zzl(Collection collection) {
        if ((collection instanceof zzst) && !(collection instanceof SortedSet)) {
            zzst zzstVar = (zzst) collection;
            if (!zzstVar.zzf()) {
                return zzstVar;
            }
        }
        Object[] array = collection.toArray();
        return zzh(array.length, array);
    }

    public static zzst zzm(Object obj) {
        return new zztt(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzst) && zzi() && ((zzst) obj).zzi() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzts.zza(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public zzso zzd() {
        zzso zzsoVar = this.zza;
        if (zzsoVar != null) {
            return zzsoVar;
        }
        zzso zzk = zzk();
        this.zza = zzk;
        return zzk;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zztw iterator();

    boolean zzi() {
        return false;
    }

    zzso zzk() {
        Object[] array = toArray();
        int i = zzso.zzd;
        return zzso.zzj(array, array.length);
    }
}
