package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
final class kkf implements tkf {
    private final int a;

    kkf(int i) {
        if (i == 16 || i == 32) {
            this.a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    @Override // defpackage.tkf
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            return new sgf(bArr, false).a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // defpackage.tkf
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.tkf
    public final byte[] zzb() {
        int i = this.a;
        if (i == 16) {
            return umf.i;
        }
        if (i == 32) {
            return umf.j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
