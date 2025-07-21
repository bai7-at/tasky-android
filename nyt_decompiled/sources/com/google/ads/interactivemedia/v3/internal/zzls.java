package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzls extends zzmh {
    private final zzjw zzi;
    private final long zzj;
    private final long zzk;

    public zzls(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, zzjw zzjwVar, long j, long j2) {
        super(zzktVar, "pWAUg19KAgbwvVb08UZ+WRVtI+wSJ32ythZZQ+2Q8wdPNCcfyqxe0xECFWJWfihd", "co+8KyXO1IB0hjlJbthCyJFCHnQQRnPimPVhit2qc2E=", zzafVar, i, 11);
        this.zzi = zzjwVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzjw zzjwVar = this.zzi;
        if (zzjwVar != null) {
            zzju zzjuVar = new zzju((String) this.zzf.invoke(null, zzjwVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                try {
                    this.zze.zzz(zzjuVar.zza.longValue());
                    if (zzjuVar.zzb.longValue() >= 0) {
                        this.zze.zzQ(zzjuVar.zzb.longValue());
                    }
                    if (zzjuVar.zzc.longValue() >= 0) {
                        this.zze.zzf(zzjuVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
