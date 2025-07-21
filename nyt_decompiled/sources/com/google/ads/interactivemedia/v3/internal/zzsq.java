package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzsq {
    Object[] zza;
    int zzb;
    zzsp zzc;

    public zzsq() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzsj.zza(length, i2));
        }
    }

    public final zzsq zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzrv.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzsq zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzsr zzc() {
        zzsp zzspVar = this.zzc;
        if (zzspVar != null) {
            throw zzspVar.zza();
        }
        zztn zzj = zztn.zzj(this.zzb, this.zza, this);
        zzsp zzspVar2 = this.zzc;
        if (zzspVar2 == null) {
            return zzj;
        }
        throw zzspVar2.zza();
    }

    zzsq(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
