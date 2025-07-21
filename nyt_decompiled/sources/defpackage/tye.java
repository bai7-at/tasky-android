package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class tye implements qke {
    private final mze a;
    private final ole b;
    private final int c;
    private final byte[] d;

    private tye(mze mzeVar, ole oleVar, int i, byte[] bArr) {
        this.a = mzeVar;
        this.b = oleVar;
        this.c = i;
        this.d = bArr;
    }

    public static qke a(qme qmeVar) {
        mye myeVar = new mye(qmeVar.c().d(ale.a()), qmeVar.a().d());
        String valueOf = String.valueOf(qmeVar.a().f());
        return new tye(myeVar, new qze(new pze("HMAC".concat(valueOf), new SecretKeySpec(qmeVar.d().d(ale.a()), "HMAC")), qmeVar.a().e()), qmeVar.a().e(), qmeVar.b().c());
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        int i = this.c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!bve.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.d.length, length2 - this.c);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((qze) this.b).c(rye.b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.a.a(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
