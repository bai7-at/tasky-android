package com.google.android.gms.internal.pal;

import defpackage.mw9;
import defpackage.sz9;
import defpackage.vw9;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class g0 extends e implements RandomAccess, vw9 {
    private static final g0 c;
    public static final vw9 d;
    private final List b;

    static {
        g0 g0Var = new g0(10);
        c = g0Var;
        g0Var.zzb();
        d = g0Var;
    }

    public g0(int i) {
        this.b = new ArrayList(i);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzaby ? ((zzaby) obj).y(f0.b) : f0.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.e, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof vw9) {
            collection = ((vw9) collection).zzh();
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
        if (obj instanceof zzaby) {
            zzaby zzabyVar = (zzaby) obj;
            String y = zzabyVar.y(f0.b);
            if (zzabyVar.p()) {
                this.b.set(i, y);
            }
            return y;
        }
        byte[] bArr = (byte[]) obj;
        String h = f0.h(bArr);
        if (f0.i(bArr)) {
            this.b.set(i, h);
        }
        return h;
    }

    @Override // defpackage.vw9
    public final void c0(zzaby zzabyVar) {
        a();
        this.b.add(zzabyVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.e, java.util.AbstractList, java.util.List
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

    @Override // defpackage.mw9
    public final /* bridge */ /* synthetic */ mw9 zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new g0(arrayList);
    }

    @Override // defpackage.vw9
    public final vw9 zze() {
        return zzc() ? new sz9(this) : this;
    }

    @Override // defpackage.vw9
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.vw9
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    private g0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.pal.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
