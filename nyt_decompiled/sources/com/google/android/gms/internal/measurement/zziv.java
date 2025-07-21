package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zziv extends zziy {
    private final int zzc;

    zziv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzjb.o(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
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

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    final byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final int e() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final int v() {
        return 0;
    }
}
