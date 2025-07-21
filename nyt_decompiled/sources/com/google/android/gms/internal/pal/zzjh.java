package com.google.android.gms.internal.pal;

import defpackage.o9f;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzjh extends zzjd {
    private final transient zzjc c;
    private final transient zziz d;

    zzjh(zzjc zzjcVar, zziz zzizVar) {
        this.c = zzjcVar;
        this.d = zzizVar;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int a(Object[] objArr, int i) {
        return this.d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.pal.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.pal.zzjd
    public final o9f g() {
        return this.d.listIterator(0);
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
