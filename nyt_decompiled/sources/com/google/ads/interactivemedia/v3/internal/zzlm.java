package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzlm implements Callable {
    private final zzkt zza;
    private final zzaf zzb;

    public zzlm(zzkt zzktVar, zzaf zzafVar) {
        this.zza = zzktVar;
        this.zzb = zzafVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzbc zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzaf zzafVar = this.zzb;
                byte[] zzav = zzc.zzav();
                zzafVar.zzaj(zzav, 0, zzav.length, zzaef.zza());
            }
            return null;
        } catch (zzafc | NullPointerException unused) {
            return null;
        }
    }
}
