package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class zzabs extends zzabv {
    private final int zzc;

    zzabs(byte[] bArr, int i, int i2) {
        super(bArr);
        zzaby.q(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.pal.zzabv
    protected final int B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final byte a(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    final byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final int e() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    protected final void f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }
}
