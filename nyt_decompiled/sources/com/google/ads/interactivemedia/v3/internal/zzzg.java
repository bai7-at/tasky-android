package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class zzzg extends zzzk {
    final /* synthetic */ Method zza;
    final /* synthetic */ Object zzb;

    zzzg(Method method, Object obj) {
        this.zza = method;
        this.zzb = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzk
    public final Object zza(Class cls) throws Exception {
        zzzk.zzb(cls);
        return this.zza.invoke(this.zzb, cls);
    }
}
