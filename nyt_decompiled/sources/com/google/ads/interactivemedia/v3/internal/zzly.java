package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzly extends zzmh {
    private final boolean zzi;

    public zzly(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "JJbNN7XyofoYaARMXQW5DKeTyphTd+fR1lwPgm3YPVKPRzCxxynyFTxvoAQx19eb", "B3bWp0EAkYrByBBJaWCAWLXOEGZHdUcl2VYPVWjxp/Y=", zzafVar, i, 61);
        this.zzi = zzktVar.zzs();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
