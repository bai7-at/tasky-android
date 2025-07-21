package com.google.android.tv.ads;

/* renamed from: com.google.android.tv.ads.$AutoValue_IconClickFallbackImage, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_IconClickFallbackImage extends IconClickFallbackImage {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    C$AutoValue_IconClickFallbackImage(int i, int i2, String str, String str2, String str3) {
        this.zza = i;
        this.zzb = i2;
        if (str == null) {
            throw new NullPointerException("Null altText");
        }
        this.zzc = str;
        if (str2 == null) {
            throw new NullPointerException("Null creativeType");
        }
        this.zzd = str2;
        if (str3 == null) {
            throw new NullPointerException("Null staticResourceUri");
        }
        this.zze = str3;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String b() {
        return this.zzc;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String c() {
        return this.zzd;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public int d() {
        return this.zzb;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String e() {
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImage) {
            IconClickFallbackImage iconClickFallbackImage = (IconClickFallbackImage) obj;
            if (this.zza == iconClickFallbackImage.f() && this.zzb == iconClickFallbackImage.d() && this.zzc.equals(iconClickFallbackImage.b()) && this.zzd.equals(iconClickFallbackImage.c()) && this.zze.equals(iconClickFallbackImage.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public int f() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zze.hashCode() ^ ((((((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003);
    }

    public final String toString() {
        return "IconClickFallbackImage{width=" + this.zza + ", height=" + this.zzb + ", altText=" + this.zzc + ", creativeType=" + this.zzd + ", staticResourceUri=" + this.zze + "}";
    }
}
