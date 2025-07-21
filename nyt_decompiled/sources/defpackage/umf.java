package defpackage;

import com.google.android.gms.internal.pal.x6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class umf {
    public static final byte[] a = c(1, 0);
    public static final byte[] b = c(2, 32);
    public static final byte[] c = c(2, 16);
    public static final byte[] d = c(2, 17);
    public static final byte[] e = c(2, 18);
    public static final byte[] f = c(2, 1);
    public static final byte[] g = c(2, 2);
    public static final byte[] h = c(2, 3);
    public static final byte[] i = c(2, 1);
    public static final byte[] j = c(2, 2);
    public static final byte[] k = c(2, 3);
    public static final byte[] l = new byte[0];
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        Charset charset = StandardCharsets.UTF_8;
        m = "KEM".getBytes(charset);
        n = "HPKE".getBytes(charset);
        o = "HPKE-v1".getBytes(charset);
    }

    static void a(x6 x6Var) {
        if (x6Var.x() == 2 || x6Var.x() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(g0g.a(x6Var.x())));
        }
        String str = "UNRECOGNIZED";
        if (x6Var.w() == 2 || x6Var.w() == 1) {
            int w = x6Var.w();
            if (w == 2) {
                str = "KDF_UNKNOWN";
            } else if (w == 3) {
                str = "HKDF_SHA256";
            } else if (w == 4) {
                str = "HKDF_SHA384";
            } else if (w == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        if (x6Var.v() == 2 || x6Var.v() == 1) {
            int v = x6Var.v();
            if (v == 2) {
                str = "AEAD_UNKNOWN";
            } else if (v == 3) {
                str = "AES_128_GCM";
            } else if (v == 4) {
                str = "AES_256_GCM";
            } else if (v == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return q4g.c(n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) {
        return q4g.c(m, bArr);
    }

    static byte[] e(String str, byte[] bArr, byte[] bArr2) {
        return q4g.c(o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static byte[] f(String str, byte[] bArr, byte[] bArr2, int i2) {
        return q4g.c(c(2, i2), o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
