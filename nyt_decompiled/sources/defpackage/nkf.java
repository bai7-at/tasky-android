package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
final class nkf implements tkf {
    nkf() {
    }

    @Override // defpackage.tkf
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new ygf(bArr).c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.tkf
    public final int zza() {
        return 32;
    }

    @Override // defpackage.tkf
    public final byte[] zzb() {
        return umf.k;
    }
}
