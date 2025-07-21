package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzail implements Map.Entry, Comparable, Serializable {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzail zzailVar = (zzail) obj;
        zzaid zzaidVar = new zzaid();
        zzaidVar.zzb(zza(), zzailVar.zza(), null);
        zzaidVar.zzb(zzb(), zzailVar.zzb(), null);
        return zzaidVar.zza();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzaik.zza(zza(), entry.getKey()) && zzaik.zza(zzb(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return zza();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return zzb();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (zza() == null ? 0 : zza().hashCode()) ^ (zzb() != null ? zzb().hashCode() : 0);
    }

    public final String toString() {
        return "(" + String.valueOf(zza()) + "," + String.valueOf(zzb()) + ")";
    }

    public abstract Object zza();

    public abstract Object zzb();
}
