package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzagj implements zzafw {
    private final zzafz zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzagj(zzafz zzafzVar, String str, Object[] objArr) {
        this.zza = zzafzVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafw
    public final zzafz zza() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafw
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafw
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
