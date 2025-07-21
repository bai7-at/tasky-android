package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzsa extends zzsg {
    final /* synthetic */ zzsh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzsa(zzsh zzshVar) {
        super(zzshVar);
        this.zza = zzshVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int zzc = this.zza.zzc(key, zzsi.zzc(key));
            if (zzc != -1 && zzri.zza(value, this.zza.zzb[zzc])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int zzc = zzsi.zzc(key);
        int zzc2 = this.zza.zzc(key, zzc);
        if (zzc2 == -1 || !zzri.zza(value, this.zza.zzb[zzc2])) {
            return false;
        }
        this.zza.zzl(zzc2, zzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsg
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzry(this.zza, i);
    }
}
