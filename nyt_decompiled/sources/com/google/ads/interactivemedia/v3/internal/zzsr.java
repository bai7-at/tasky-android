package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class zzsr<K, V> implements Map<K, V>, Serializable {
    private transient zzst zza;
    private transient zzst zzb;
    private transient zzsk zzc;

    zzsr() {
    }

    public static zzsr zzc(Map map) {
        if ((map instanceof zzsr) && !(map instanceof SortedMap)) {
            zzsr zzsrVar = (zzsr) map;
            if (!zzsrVar.zzi()) {
                return zzsrVar;
            }
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        zzsq zzsqVar = new zzsq(entrySet instanceof Collection ? entrySet.size() : 4);
        zzsqVar.zzb(entrySet);
        return zzsqVar.zzc();
    }

    public static zzsr zzd(Object obj, Object obj2) {
        zzrv.zzb("adBreakTime", obj2);
        return zztn.zzj(1, new Object[]{"adBreakTime", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzts.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzrv.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, Constants.GB));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzsk zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzsk values() {
        zzsk zzskVar = this.zzc;
        if (zzskVar != null) {
            return zzskVar;
        }
        zzsk zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzst zze();

    abstract zzst zzf();

    @Override // java.util.Map
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzst entrySet() {
        zzst zzstVar = this.zza;
        if (zzstVar != null) {
            return zzstVar;
        }
        zzst zze = zze();
        this.zza = zze;
        return zze;
    }

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzst keySet() {
        zzst zzstVar = this.zzb;
        if (zzstVar != null) {
            return zzstVar;
        }
        zzst zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }

    abstract boolean zzi();
}
