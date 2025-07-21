package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class zzzh extends zzzk {
    final /* synthetic */ Method zza;
    final /* synthetic */ int zzb;

    zzzh(Method method, int i) {
        this.zza = method;
        this.zzb = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzk
    public final Object zza(Class cls) throws Exception {
        zzzk.zzb(cls);
        return this.zza.invoke(null, cls, Integer.valueOf(this.zzb));
    }
}
