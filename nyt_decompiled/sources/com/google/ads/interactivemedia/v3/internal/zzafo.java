package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzafo extends zzadc implements RandomAccess, zzaez, zzagg {
    private static final zzafo zza = new zzafo(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzafo() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzafa.zzd;
        collection.getClass();
        if (!(collection instanceof zzafo)) {
            return super.addAll(collection);
        }
        zzafo zzafoVar = (zzafo) collection;
        int i = zzafoVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzafoVar.zzb, 0, this.zzb, this.zzc, zzafoVar.zzc);
        this.zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzafo)) {
            return super.equals(obj);
        }
        zzafo zzafoVar = (zzafo) obj;
        if (this.zzc != zzafoVar.zzc) {
            return false;
        }
        long[] jArr = zzafoVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long j = this.zzb[i2];
            byte[] bArr = zzafa.zzd;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final /* bridge */ /* synthetic */ zzaez zzd(int i) {
        if (i >= this.zzc) {
            return new zzafo(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzh(i);
        return this.zzb[i];
    }

    public final void zzf(long j) {
        zza();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = j;
    }

    private zzafo(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
