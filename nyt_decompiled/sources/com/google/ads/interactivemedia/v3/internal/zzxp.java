package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzxp implements ParameterizedType, Serializable {
    private final Type zza;
    private final Type zzb;
    private final Type[] zzc;

    public zzxp(Type type2, Type type3, Type... typeArr) {
        type3.getClass();
        if (type3 instanceof Class) {
            Class cls = (Class) type3;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type2 == null && !z2) {
                z = false;
            }
            zzxm.zza(z);
        }
        this.zza = type2 == null ? null : zzxr.zzc(type2);
        this.zzb = zzxr.zzc(type3);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.zzc = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type type4 = this.zzc[i];
            type4.getClass();
            zzxr.zzf(type4);
            Type[] typeArr3 = this.zzc;
            typeArr3[i] = zzxr.zzc(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && zzxr.zzg(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.zzc.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.zza;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzc) ^ this.zzb.hashCode();
        Type type2 = this.zza;
        return (type2 != null ? type2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        int length = this.zzc.length;
        if (length == 0) {
            return zzxr.zzb(this.zzb);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(zzxr.zzb(this.zzb));
        sb.append("<");
        sb.append(zzxr.zzb(this.zzc[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(zzxr.zzb(this.zzc[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
