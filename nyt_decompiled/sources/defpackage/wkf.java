package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class wkf {
    private static final byte[] g = new byte[0];
    private final tkf a;
    private final BigInteger b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private BigInteger f = BigInteger.ZERO;

    private wkf(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, tkf tkfVar) {
        this.e = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.b = bigInteger;
        this.a = tkfVar;
    }

    static wkf c(byte[] bArr, byte[] bArr2, tlf tlfVar, qkf qkfVar, tkf tkfVar, byte[] bArr3) {
        byte[] b = umf.b(tlfVar.zzb(), qkfVar.c(), tkfVar.zzb());
        byte[] bArr4 = umf.l;
        byte[] bArr5 = g;
        byte[] c = q4g.c(umf.a, qkfVar.e(bArr4, bArr5, "psk_id_hash", b), qkfVar.e(bArr4, bArr3, "info_hash", b));
        byte[] e = qkfVar.e(bArr2, bArr5, "secret", b);
        byte[] d = qkfVar.d(e, c, TransferTable.COLUMN_KEY, b, tkfVar.zza());
        byte[] d2 = qkfVar.d(e, c, "base_nonce", b, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new wkf(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), tkfVar);
    }

    private final synchronized byte[] d() {
        byte[] d;
        try {
            byte[] bArr = this.d;
            byte[] byteArray = this.f.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length != 13) {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                } else {
                    if (byteArray[0] != 0) {
                        throw new GeneralSecurityException("integer too large");
                    }
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                }
            }
            d = q4g.d(bArr, byteArray);
            if (this.f.compareTo(this.b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.f = this.f.add(BigInteger.ONE);
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    final byte[] a() {
        return this.e;
    }

    final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.a.a(this.c, d(), bArr, bArr2);
    }
}
