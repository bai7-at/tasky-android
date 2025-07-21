package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public class zzaff {
    private static final zzaef zzb = zzaef.zza;
    protected volatile zzafz zza;
    private volatile zzadr zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaff)) {
            return false;
        }
        zzaff zzaffVar = (zzaff) obj;
        zzafz zzafzVar = this.zza;
        zzafz zzafzVar2 = zzaffVar.zza;
        if (zzafzVar == null && zzafzVar2 == null) {
            return zzb().equals(zzaffVar.zzb());
        }
        if (zzafzVar != null && zzafzVar2 != null) {
            return zzafzVar.equals(zzafzVar2);
        }
        if (zzafzVar != null) {
            zzaffVar.zzc(zzafzVar.zzaR());
            return zzafzVar.equals(zzaffVar.zza);
        }
        zzc(zzafzVar2.zzaR());
        return this.zza.equals(zzafzVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzado) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzax();
        }
        return 0;
    }

    public final zzadr zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return this.zzc;
                }
                if (this.zza == null) {
                    this.zzc = zzadr.zzb;
                } else {
                    this.zzc = this.zza.zzau();
                }
                return this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void zzc(zzafz zzafzVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzafzVar;
                    this.zzc = zzadr.zzb;
                } catch (zzafc unused) {
                    this.zza = zzafzVar;
                    this.zzc = zzadr.zzb;
                }
            }
        }
    }
}
