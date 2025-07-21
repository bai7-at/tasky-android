package com.google.android.gms.internal.play_billing;

import defpackage.ccd;
import defpackage.cqb;
import defpackage.ehb;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class c0 extends c implements RandomAccess, cqb {
    private static final c0 c;
    public static final cqb d;
    private final List b;

    static {
        c0 c0Var = new c0(false);
        c = c0Var;
        d = c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzba ? ((zzba) obj).t(b0.b) : b0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof cqb) {
            collection = ((cqb) collection).zzh();
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
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            String t = zzbaVar.t(b0.b);
            if (zzbaVar.n()) {
                this.b.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String d2 = b0.d(bArr);
        if (l1.d(bArr)) {
            this.b.set(i, d2);
        }
        return d2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.c, java.util.AbstractList, java.util.List
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

    @Override // defpackage.ehb
    public final /* bridge */ /* synthetic */ ehb zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new c0(arrayList);
    }

    @Override // defpackage.cqb
    public final cqb zze() {
        return zzc() ? new ccd(this) : this;
    }

    @Override // defpackage.cqb
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.cqb
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    private c0(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    private c0(boolean z) {
        super(false);
        this.b = Collections.emptyList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
