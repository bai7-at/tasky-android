package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class f5g {
    private final ECPublicKey a;

    public f5g(ECPublicKey eCPublicKey) {
        this.a = eCPublicKey;
    }

    public final e5g a(String str, byte[] bArr, byte[] bArr2, int i, int i2) {
        KeyPair c = h5g.c(this.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) c.getPublic();
        byte[] g = h5g.g((ECPrivateKey) c.getPrivate(), this.a);
        byte[] l = h5g.l(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        byte[] c2 = q4g.c(l, g);
        Mac mac = (Mac) l5g.f.a(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(c2), str));
        byte[] bArr4 = new byte[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i3);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i5 = i4 + length;
            if (i5 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i4, i - i4);
                return new e5g(l, bArr3);
            }
            System.arraycopy(bArr4, 0, bArr3, i4, length);
            i3++;
            i4 = i5;
        }
    }
}
