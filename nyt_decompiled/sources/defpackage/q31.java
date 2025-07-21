package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.security.PrivateKey;
import java.security.Signature;

/* loaded from: classes4.dex */
public final class q31 {
    public static final q31 a = new q31();

    private q31() {
    }

    public final byte[] a(PrivateKey privateKey, byte[] bArr) {
        zq3.h(privateKey, TransferTable.COLUMN_KEY);
        zq3.h(bArr, "data");
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(bArr);
        byte[] sign = signature.sign();
        zq3.g(sign, "sign(...)");
        return sign;
    }
}
