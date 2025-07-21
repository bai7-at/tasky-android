package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzmd extends zzmh {
    public zzmd(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "VDwQ3K5hWNPtf5dS2hlYw2Jf/kCryjtbnajPg7scO6Pnm0MnNyxr5pkYt7vqqxiC", "KDuYqpxnPd5orC8Osj1P8uHTwFCdaykyejtm4a0Jl1c=", zzafVar, i, 48);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzag(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            try {
                if (booleanValue) {
                    this.zze.zzag(2);
                } else {
                    this.zze.zzag(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
