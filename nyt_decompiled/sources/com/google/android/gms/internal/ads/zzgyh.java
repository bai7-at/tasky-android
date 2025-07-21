package com.google.android.gms.internal.ads;

import defpackage.yze;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zzgyh extends zzgyg {
    protected final byte[] zza;

    zzgyh(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final boolean J(zzgyl zzgylVar, int i, int i2) {
        if (i2 > zzgylVar.g()) {
            throw new IllegalArgumentException("Length too large: " + i2 + g());
        }
        int i3 = i + i2;
        if (i3 > zzgylVar.g()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgylVar.g());
        }
        if (!(zzgylVar instanceof zzgyh)) {
            return zzgylVar.q(i, i3).equals(q(0, i2));
        }
        zzgyh zzgyhVar = (zzgyh) zzgylVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgyhVar.zza;
        int K = K() + i2;
        int K2 = K();
        int K3 = zzgyhVar.K() + i;
        while (K2 < K) {
            if (bArr[K2] != bArr2[K3]) {
                return false;
            }
            K2++;
            K3++;
        }
        return true;
    }

    protected int K() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    byte e(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyl) || g() != ((zzgyl) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof zzgyh)) {
            return obj.equals(this);
        }
        zzgyh zzgyhVar = (zzgyh) obj;
        int z = z();
        int z2 = zzgyhVar.z();
        if (z == 0 || z2 == 0 || z == z2) {
            return J(zzgyhVar, 0, g());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public int g() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected void j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final int o(int i, int i2, int i3) {
        return ai.b(i, this.zza, K() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final int p(int i, int i2, int i3) {
        int K = K() + i2;
        return qj.f(i, this.zza, K, i3 + K);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl q(int i, int i2) {
        int y = zzgyl.y(i, i2, g());
        return y == 0 ? zzgyl.a : new zzgye(this.zza, K() + i, y);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final gh t() {
        return gh.h(this.zza, K(), g(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final String u(Charset charset) {
        return new String(this.zza, K(), g(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final ByteBuffer v() {
        return ByteBuffer.wrap(this.zza, K(), g()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    final void w(yze yzeVar) {
        yzeVar.a(this.zza, K(), g());
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean x() {
        int K = K();
        return qj.j(this.zza, K, g() + K);
    }
}
