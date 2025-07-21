package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzsb extends AbstractMap implements Serializable, zzrt {
    private final zzsh zza;
    private transient Set zzb;

    zzsb(zzsh zzshVar) {
        this.zza = zzshVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.zza.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        zzsc zzscVar = new zzsc(this.zza);
        this.zzb = zzscVar;
        return zzscVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzsh zzshVar = this.zza;
        int zzd = zzshVar.zzd(obj, zzsi.zzc(obj));
        if (zzd == -1) {
            return null;
        }
        return zzshVar.zza[zzd];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.zza.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.zza.zzh(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzsh zzshVar = this.zza;
        int zzc = zzsi.zzc(obj);
        int zzd = zzshVar.zzd(obj, zzc);
        if (zzd == -1) {
            return null;
        }
        Object obj2 = zzshVar.zza[zzd];
        zzshVar.zzm(zzd, zzc);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zza.keySet();
    }
}
