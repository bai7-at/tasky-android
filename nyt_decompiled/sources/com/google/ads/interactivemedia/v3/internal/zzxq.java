package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
final class zzxq implements WildcardType, Serializable {
    private final Type zza;
    private final Type zzb;

    public zzxq(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        zzxm.zza(length <= 1);
        zzxm.zza(typeArr.length == 1);
        if (length != 1) {
            Type type2 = typeArr[0];
            type2.getClass();
            zzxr.zzf(type2);
            this.zzb = null;
            this.zza = zzxr.zzc(typeArr[0]);
            return;
        }
        Type type3 = typeArr2[0];
        type3.getClass();
        zzxr.zzf(type3);
        zzxm.zza(typeArr[0] == Object.class);
        this.zzb = zzxr.zzc(typeArr2[0]);
        this.zza = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && zzxr.zzg(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type2 = this.zzb;
        return type2 != null ? new Type[]{type2} : zzxr.zza;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.zza};
    }

    public final int hashCode() {
        Type type2 = this.zzb;
        return (this.zza.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type2 = this.zzb;
        if (type2 != null) {
            return "? super ".concat(String.valueOf(zzxr.zzb(type2)));
        }
        Type type3 = this.zza;
        return type3 == Object.class ? "?" : "? extends ".concat(String.valueOf(zzxr.zzb(type3)));
    }
}
