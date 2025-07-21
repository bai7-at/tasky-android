package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzmc extends zzmh {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzmc(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "G4HwREIoiCx6D6Knjk8GQVRbuasfQrt56+TObFi9Ix4nWk1CG0hj6JTdJX3CIa7h", "t/7YlZ4nfipM+/xy58jm5M2tTyuTDvSiYT2ZDkTlVNY=", zzafVar, i, 33);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (Long) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
