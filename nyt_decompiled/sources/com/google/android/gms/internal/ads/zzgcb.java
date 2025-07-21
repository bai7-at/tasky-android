package com.google.android.gms.internal.ads;

import defpackage.yie;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgcb extends zzgaf {
    final transient Object c;

    zzgcb(Object obj) {
        obj.getClass();
        this.c = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int a(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final zzgaa f() {
        return zzgaa.u(this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final yie g() {
        return new p9(this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new p9(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.c.toString() + "]";
    }
}
