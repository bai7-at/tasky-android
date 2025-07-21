package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class g4g implements haf {
    private final sgf a;

    public g4g(byte[] bArr) {
        if (!cif.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new sgf(bArr, true);
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return this.a.a(d7g.a(12), bArr, bArr2);
    }
}
