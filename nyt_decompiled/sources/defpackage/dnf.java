package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class dnf implements tlf {
    private final qkf a;

    dnf(qkf qkfVar) {
        this.a = qkfVar;
    }

    @Override // defpackage.tlf
    public final wlf a(byte[] bArr) {
        byte[] b = j7g.b();
        byte[] a = j7g.a(b, bArr);
        byte[] c = j7g.c(b);
        byte[] c2 = q4g.c(c, bArr);
        byte[] d = umf.d(umf.b);
        qkf qkfVar = this.a;
        return new wlf(qkfVar.b(null, a, "eae_prk", c2, "shared_secret", d, qkfVar.a()), c);
    }

    @Override // defpackage.tlf
    public final byte[] zzb() {
        if (Arrays.equals(this.a.c(), umf.f)) {
            return umf.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
