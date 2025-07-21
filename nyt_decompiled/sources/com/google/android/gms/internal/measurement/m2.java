package com.google.android.gms.internal.measurement;

import defpackage.gcf;
import defpackage.rgf;
import defpackage.tbf;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class m2 extends q1 implements RandomAccess, gcf {
    private static final m2 c;
    public static final gcf d;
    private final List b;

    static {
        m2 m2Var = new m2(10);
        c = m2Var;
        m2Var.zzb();
        d = m2Var;
    }

    public m2(int i) {
        this.b = new ArrayList(i);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzjb ? ((zzjb) obj).u(l2.b) : l2.h((byte[]) obj);
    }

    @Override // defpackage.gcf
    public final void X(zzjb zzjbVar) {
        a();
        this.b.add(zzjbVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.q1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof gcf) {
            collection = ((gcf) collection).zzh();
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
        if (obj instanceof zzjb) {
            zzjb zzjbVar = (zzjb) obj;
            String u = zzjbVar.u(l2.b);
            if (zzjbVar.n()) {
                this.b.set(i, u);
            }
            return u;
        }
        byte[] bArr = (byte[]) obj;
        String h = l2.h(bArr);
        if (l2.i(bArr)) {
            this.b.set(i, h);
        }
        return h;
    }

    @Override // com.google.android.gms.internal.measurement.q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.q1, java.util.AbstractList, java.util.List
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

    @Override // defpackage.tbf
    public final /* bridge */ /* synthetic */ tbf zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new m2(arrayList);
    }

    @Override // defpackage.gcf
    public final gcf zze() {
        return zzc() ? new rgf(this) : this;
    }

    @Override // defpackage.gcf
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.gcf
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    private m2(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
