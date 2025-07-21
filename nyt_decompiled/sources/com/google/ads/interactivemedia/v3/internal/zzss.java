package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes2.dex */
abstract class zzss extends zzst {
    zzss() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = zzh().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzts.zza(zzh().entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzh().size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return zzh().zzi();
    }

    abstract zzsr zzh();

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    final boolean zzi() {
        return false;
    }
}
