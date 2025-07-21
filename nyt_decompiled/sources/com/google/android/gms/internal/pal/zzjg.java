package com.google.android.gms.internal.pal;

import defpackage.o9f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzjg extends zzjd {
    private final transient zzjc c;
    private final transient Object[] d;
    private final transient int e;

    zzjg(zzjc zzjcVar, Object[] objArr, int i, int i2) {
        this.c = zzjcVar;
        this.d = objArr;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int a(Object[] objArr, int i) {
        return j().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.pal.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzjd
    public final o9f g() {
        return j().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.pal.zzjd
    final zziz k() {
        return new zzjf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
