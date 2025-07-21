package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qye implements qke {
    private final rre a;
    private final byte[] b;

    private qye(byte[] bArr, tze tzeVar) {
        if (!gse.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new rre(bArr, true);
        this.b = tzeVar.c();
    }

    public static qke a(coe coeVar) {
        coeVar.b();
        coeVar.b();
        return new qye(coeVar.d().d(ale.a()), coeVar.c());
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        if (!bve.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.b;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
        return this.a.a(Arrays.copyOf(copyOfRange, 12), copyOfRange, bArr2);
    }
}
