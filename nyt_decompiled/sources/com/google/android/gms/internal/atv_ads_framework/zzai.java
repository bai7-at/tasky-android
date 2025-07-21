package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzai extends zzaf {
    private final transient zzae c;
    private final transient Object[] d;
    private final transient int e;

    zzai(zzae zzaeVar, Object[] objArr, int i, int i2) {
        this.c = zzaeVar;
        this.d = objArr;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int a(Object[] objArr, int i) {
        return f().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf
    final zzab k() {
        return new zzah(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
