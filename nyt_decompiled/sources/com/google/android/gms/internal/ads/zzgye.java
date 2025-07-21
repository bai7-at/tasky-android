package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgye extends zzgyh {
    private final int zzc;
    private final int zzd;

    zzgye(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgyl.y(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final int K() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final byte c(int i) {
        zzgyl.H(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    final byte e(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final int g() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    protected final void j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
