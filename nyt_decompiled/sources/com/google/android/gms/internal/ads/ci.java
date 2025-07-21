package com.google.android.gms.internal.ads;

import defpackage.h2f;
import defpackage.n1f;
import defpackage.o1f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ci extends tg implements RandomAccess, o1f {
    private static final ci c;
    public static final o1f d;
    private final List b;

    static {
        ci ciVar = new ci(false);
        c = ciVar;
        d = ciVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgyl ? ((zzgyl) obj).F(ai.b) : ai.d((byte[]) obj);
    }

    @Override // defpackage.o1f
    public final void W0(zzgyl zzgylVar) {
        a();
        this.b.add(zzgylVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.tg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof o1f) {
            collection = ((o1f) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgyl) {
            zzgyl zzgylVar = (zzgyl) obj;
            String F = zzgylVar.F(ai.b);
            if (zzgylVar.x()) {
                this.b.set(i, F);
            }
            return F;
        }
        byte[] bArr = (byte[]) obj;
        String d2 = ai.d(bArr);
        if (qj.i(bArr)) {
            this.b.set(i, d2);
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.tg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.tg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return e(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        a();
        return e(this.b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.n1f
    public final /* bridge */ /* synthetic */ n1f zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new ci(arrayList);
    }

    @Override // defpackage.o1f
    public final o1f zze() {
        return zzc() ? new h2f(this) : this;
    }

    @Override // defpackage.o1f
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.o1f
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    private ci(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    private ci(boolean z) {
        super(false);
        this.b = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.tg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
