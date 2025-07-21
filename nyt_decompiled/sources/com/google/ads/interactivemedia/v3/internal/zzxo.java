package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
final class zzxo implements GenericArrayType, Serializable {
    private final Type zza;

    public zzxo(Type type2) {
        type2.getClass();
        this.zza = zzxr.zzc(type2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && zzxr.zzg(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return String.valueOf(zzxr.zzb(this.zza)).concat("[]");
    }
}
