package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzac extends zzy {
    private final transient zzx c;
    private final transient Object[] d;
    private final transient int e;

    zzac(zzx zzxVar, Object[] objArr, int i, int i2) {
        this.c = zzxVar;
        this.d = objArr;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int a(Object[] objArr, int i) {
        return f().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // com.google.android.gms.internal.play_billing.zzy
    final zzu k() {
        return new zzab(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
