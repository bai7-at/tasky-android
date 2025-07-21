package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public abstract class zzbs extends zzbr {
    private boolean zza;

    protected zzbs(zzbv zzbvVar) {
        super(zzbvVar);
    }

    protected final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        zzd();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    protected abstract void zzd();
}
