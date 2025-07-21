package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes3.dex */
final class xmf implements tlf {
    private final qkf a;
    private final int b;

    private xmf(qkf qkfVar, int i) {
        this.a = qkfVar;
        this.b = i;
    }

    static xmf b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new xmf(new qkf("HmacSha512"), 3) : new xmf(new qkf("HmacSha384"), 2) : new xmf(new qkf("HmacSha256"), 1);
    }

    @Override // defpackage.tlf
    public final wlf a(byte[] bArr) {
        KeyPair c = h5g.c(h5g.k(this.b));
        byte[] g = h5g.g((ECPrivateKey) c.getPrivate(), h5g.j(h5g.k(this.b), 1, bArr));
        int i = this.b;
        byte[] l = h5g.l(h5g.k(i).getCurve(), 1, ((ECPublicKey) c.getPublic()).getW());
        byte[] c2 = q4g.c(l, bArr);
        byte[] d = umf.d(zzb());
        qkf qkfVar = this.a;
        return new wlf(qkfVar.b(null, g, "eae_prk", c2, "shared_secret", d, qkfVar.a()), l);
    }

    @Override // defpackage.tlf
    public final byte[] zzb() {
        int i = this.b - 1;
        return i != 0 ? i != 1 ? umf.e : umf.d : umf.c;
    }
}
