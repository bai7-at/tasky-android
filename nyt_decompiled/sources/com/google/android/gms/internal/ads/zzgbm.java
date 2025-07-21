package com.google.android.gms.internal.ads;

import defpackage.yie;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgbm extends zzgaf {
    private final transient zzgad c;
    private final transient Object[] d;
    private final transient int e;

    zzgbm(zzgad zzgadVar, Object[] objArr, int i, int i2) {
        this.c = zzgadVar;
        this.d = objArr;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final yie g() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    final zzgaa o() {
        return new zzgbl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
