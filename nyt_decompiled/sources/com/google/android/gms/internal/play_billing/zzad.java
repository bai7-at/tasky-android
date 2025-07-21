package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzad extends zzy {
    private final transient zzx c;
    private final transient zzu d;

    zzad(zzx zzxVar, zzu zzuVar) {
        this.c = zzxVar;
        this.d = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int a(Object[] objArr, int i) {
        return this.d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    public final zzu f() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }
}
