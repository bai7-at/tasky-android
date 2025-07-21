package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class z6g implements ecf {
    private final wvf a;
    private final int b;

    public z6g(wvf wvfVar, int i) {
        this.a = wvfVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        wvfVar.a(new byte[0], i);
    }

    @Override // defpackage.ecf
    public final byte[] a(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
