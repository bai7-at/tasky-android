package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes2.dex */
final class zzyg implements zzyz {
    final /* synthetic */ Type zza;

    zzyg(Type type2) {
        this.zza = type2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        Type type2 = this.zza;
        if (!(type2 instanceof ParameterizedType)) {
            throw new zzws("Invalid EnumSet type: ".concat(String.valueOf(type2.toString())));
        }
        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
        if (type3 instanceof Class) {
            return EnumSet.noneOf((Class) type3);
        }
        throw new zzws("Invalid EnumSet type: ".concat(String.valueOf(this.zza.toString())));
    }
}
