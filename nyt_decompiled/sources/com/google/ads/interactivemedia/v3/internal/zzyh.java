package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes2.dex */
final class zzyh implements zzyz {
    final /* synthetic */ Type zza;

    zzyh(Type type2) {
        this.zza = type2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        Type type2 = this.zza;
        if (!(type2 instanceof ParameterizedType)) {
            throw new zzws("Invalid EnumMap type: ".concat(String.valueOf(type2.toString())));
        }
        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
        if (type3 instanceof Class) {
            return new EnumMap((Class) type3);
        }
        throw new zzws("Invalid EnumMap type: ".concat(String.valueOf(this.zza.toString())));
    }
}
