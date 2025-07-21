package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzln extends zzmh {
    private final zzku zzi;

    public zzln(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, zzku zzkuVar) {
        super(zzktVar, "p/A/ccj2XwTk/fSo3C/ujSOOKIukuf4p49eNYdQ49ojJfAAu/oSJpyibltiC1SFr", "awBf5sggk7Iiel8IwPwvWHZPhdA85Ytk82R2/ib4oV8=", zzafVar, i, 85);
        this.zzi = zzkuVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
