package com.google.android.gms.internal.icing;

import defpackage.k2e;
import defpackage.rlc;
import defpackage.vcc;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class c0 extends g implements RandomAccess, rlc {
    private static final c0 c;
    public static final rlc d;
    private final List b;

    static {
        c0 c0Var = new c0(10);
        c = c0Var;
        c0Var.zzb();
        d = c0Var;
    }

    public c0(int i) {
        this.b = new ArrayList(i);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzcf ? ((zzcf) obj).p(b0.a) : b0.d((byte[]) obj);
    }

    @Override // defpackage.rlc
    public final void G(zzcf zzcfVar) {
        a();
        this.b.add(zzcfVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.icing.g, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof rlc) {
            collection = ((rlc) collection).zzh();
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
        if (obj instanceof zzcf) {
            zzcf zzcfVar = (zzcf) obj;
            String p = zzcfVar.p(b0.a);
            if (zzcfVar.k()) {
                this.b.set(i, p);
            }
            return p;
        }
        byte[] bArr = (byte[]) obj;
        String d2 = b0.d(bArr);
        if (b0.c(bArr)) {
            this.b.set(i, d2);
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.icing.g, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.vcc
    public final /* bridge */ /* synthetic */ vcc i(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new c0(arrayList);
    }

    @Override // com.google.android.gms.internal.icing.g, java.util.AbstractList, java.util.List
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

    @Override // defpackage.rlc
    public final Object zzg(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.rlc
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.rlc
    public final rlc zzi() {
        return zza() ? new k2e(this) : this;
    }

    private c0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.icing.g, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
