package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
final class zztp extends zzsy {
    static final zztp zzc;
    final transient zzso zzd;

    static {
        int i = zzso.zzd;
        zzc = new zztp(zzti.zza, zztf.zza);
    }

    zztp(zzso zzsoVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzsoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int zzv = zzv(obj, true);
        if (zzv == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzsy) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzte) {
            collection = ((zzte) collection).zza();
        }
        if (!zztv.zza(((zzsy) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zztx listIterator = this.zzd.listIterator(0);
        Iterator it2 = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = listIterator.next();
        while (true) {
            try {
                int compare = ((zzsy) this).zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zztv.zza(((zzsy) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it2 = set.iterator();
        try {
            zztx listIterator = this.zzd.listIterator(0);
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                Object next2 = it2.next();
                if (next2 == null || ((zzsy) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object floor(Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object higher(Object obj) {
        int zzv = zzv(obj, false);
        if (zzv == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r1.size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object lower(Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zzso zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    /* renamed from: zze */
    public final zztw iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return this.zzd.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsy zzh() {
        Comparator reverseOrder = Collections.reverseOrder(((zzsy) this).zza);
        return isEmpty() ? zzsy.zzs(reverseOrder) : new zztp(this.zzd.zzh(), reverseOrder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsy zzo(Object obj, boolean z) {
        return zzw(0, zzu(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsy zzq(Object obj, boolean z, Object obj2, boolean z2) {
        return zzr(obj, z).zzo(obj2, z2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsy zzr(Object obj, boolean z) {
        return zzw(zzv(obj, z), this.zzd.size());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    /* renamed from: zzt */
    public final zztw descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    final int zzu(Object obj, boolean z) {
        zzso zzsoVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzsoVar, obj, ((zzsy) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int zzv(Object obj, boolean z) {
        zzso zzsoVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzsoVar, obj, ((zzsy) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    final zztp zzw(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        return i < i2 ? new zztp(this.zzd.subList(i, i2), ((zzsy) this).zza) : zzsy.zzs(((zzsy) this).zza);
    }
}
