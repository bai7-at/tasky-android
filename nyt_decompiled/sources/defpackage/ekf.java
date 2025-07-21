package defpackage;

import com.google.android.gms.internal.pal.x5;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
abstract class ekf {
    public static void a(x5 x5Var) {
        h5g.k(c(x5Var.w().x()));
        b(x5Var.w().C());
        if (x5Var.E() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        rdf.c(x5Var.s().v());
    }

    public static String b(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(tzf.a(i))));
    }

    public static int c(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(pzf.a(i))));
    }

    public static int d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(kyf.a(i))));
            }
        }
        return i3;
    }
}
