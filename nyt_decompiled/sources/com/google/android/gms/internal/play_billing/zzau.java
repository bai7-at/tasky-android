package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzau extends zzax {
    private final int zzc;

    zzau(byte[] bArr, int i, int i2) {
        super(bArr);
        zzba.o(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
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

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
    final byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
    public final int e() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzax
    protected final int u() {
        return 0;
    }
}
