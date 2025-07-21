package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public class l26 implements md4 {
    private final i26 a;
    private final int b;

    public l26(i26 i26Var, int i) {
        this.a = i26Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        i26Var.a(new byte[0], i);
    }

    @Override // defpackage.md4
    public void a(byte[] bArr, byte[] bArr2) {
        if (!uf0.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // defpackage.md4
    public byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
