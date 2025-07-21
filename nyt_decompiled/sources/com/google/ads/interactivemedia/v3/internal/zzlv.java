package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzlv extends zzmh {
    public zzlv(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "oO7O1Zl5qT4fINnjJ7MV1sXlC0751dKi+CTVAZ3uChrb+KKgGKlAteAw3z2VJc9W", "gTKnyiSsL9wEtXGUctwuGP3+C7j3LIUQCJa2bazWM2k=", zzafVar, i, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) zznc.zzc().zzb(zznr.zzcr);
        bool.booleanValue();
        zzjz zzjzVar = new zzjz((String) this.zzf.invoke(null, this.zzb.zzb(), bool));
        synchronized (this.zze) {
            this.zze.zzj(zzjzVar.zza);
            this.zze.zzC(zzjzVar.zzb);
        }
    }
}
