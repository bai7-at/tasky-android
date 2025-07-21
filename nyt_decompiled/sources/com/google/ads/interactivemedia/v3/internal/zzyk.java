package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
final class zzyk implements zzyz {
    final /* synthetic */ Constructor zza;

    zzyk(Constructor constructor) {
        this.zza = constructor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        try {
            return this.zza.newInstance(null);
        } catch (IllegalAccessException e) {
            throw zzacg.zzb(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + zzacg.zzc(this.zza) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + zzacg.zzc(this.zza) + "' with no args", e3.getCause());
        }
    }
}
