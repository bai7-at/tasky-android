package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzli extends zzmh {
    public zzli(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "xROrTzATo2RpEUZnqjmzz/KxV50V2Zu/NCSSTz9KL4aCDCRzHSZ6wXUPoT05wTK4", "570CSH2ThsTn5d3BraANFK/v79ts3BH8wAiSy3z3JGg=", zzafVar, i, 5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            try {
                this.zze.zzm(iArr[0]);
                this.zze.zzl(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.zze.zzk(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
