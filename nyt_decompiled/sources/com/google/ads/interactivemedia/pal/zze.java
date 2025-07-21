package com.google.ads.interactivemedia.pal;

/* loaded from: classes2.dex */
final class zze extends zzp {
    private String zza;
    private String zzb;
    private String zzc;

    zze() {
    }

    @Override // com.google.ads.interactivemedia.pal.zzp
    final zzp zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null correlator");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzp
    final zzp zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null palVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzp
    final zzp zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzp
    final zzq zzd() {
        String str;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzb) != null && (str2 = this.zzc) != null) {
            return new zzg(str3, str, str2, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" palVersion");
        }
        if (this.zzb == null) {
            sb.append(" sdkVersion");
        }
        if (this.zzc == null) {
            sb.append(" correlator");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
