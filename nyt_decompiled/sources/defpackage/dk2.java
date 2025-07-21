package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.ParserException;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public abstract class dk2 {

    public static final class a {
        public long a;
    }

    private static boolean a(yo5 yo5Var, hk2 hk2Var, int i) {
        int j = j(yo5Var, i);
        return j != -1 && j <= hk2Var.b;
    }

    private static boolean b(yo5 yo5Var, int i) {
        return yo5Var.H() == z19.u(yo5Var.e(), i, yo5Var.f() - 1, 0);
    }

    private static boolean c(yo5 yo5Var, hk2 hk2Var, boolean z, a aVar) {
        try {
            long O = yo5Var.O();
            if (!z) {
                O *= hk2Var.b;
            }
            aVar.a = O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(yo5 yo5Var, hk2 hk2Var, int i, a aVar) {
        int f = yo5Var.f();
        long J = yo5Var.J();
        long j = J >>> 16;
        if (j != i) {
            return false;
        }
        return g((int) ((J >> 4) & 15), hk2Var) && f((int) ((J >> 1) & 7), hk2Var) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(yo5Var, hk2Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(yo5Var, hk2Var, (int) ((J >> 12) & 15)) && e(yo5Var, hk2Var, (int) ((J >> 8) & 15)) && b(yo5Var, f);
    }

    private static boolean e(yo5 yo5Var, hk2 hk2Var, int i) {
        int i2 = hk2Var.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == hk2Var.f;
        }
        if (i == 12) {
            return yo5Var.H() * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT == i2;
        }
        if (i > 14) {
            return false;
        }
        int N = yo5Var.N();
        if (i == 14) {
            N *= 10;
        }
        return N == i2;
    }

    private static boolean f(int i, hk2 hk2Var) {
        return i == 0 || i == hk2Var.i;
    }

    private static boolean g(int i, hk2 hk2Var) {
        return i <= 7 ? i == hk2Var.g - 1 : i <= 10 && hk2Var.g == 2;
    }

    public static boolean h(z72 z72Var, hk2 hk2Var, int i, a aVar) {
        long l = z72Var.l();
        byte[] bArr = new byte[2];
        z72Var.r(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            z72Var.g();
            z72Var.n((int) (l - z72Var.getPosition()));
            return false;
        }
        yo5 yo5Var = new yo5(16);
        System.arraycopy(bArr, 0, yo5Var.e(), 0, 2);
        yo5Var.T(b82.c(z72Var, yo5Var.e(), 2, 14));
        z72Var.g();
        z72Var.n((int) (l - z72Var.getPosition()));
        return d(yo5Var, hk2Var, i, aVar);
    }

    public static long i(z72 z72Var, hk2 hk2Var) {
        z72Var.g();
        z72Var.n(1);
        byte[] bArr = new byte[1];
        z72Var.r(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        z72Var.n(2);
        int i = z ? 7 : 6;
        yo5 yo5Var = new yo5(i);
        yo5Var.T(b82.c(z72Var, yo5Var.e(), 0, i));
        z72Var.g();
        a aVar = new a();
        if (c(yo5Var, hk2Var, z, aVar)) {
            return aVar.a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(yo5 yo5Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yo5Var.H() + 1;
            case 7:
                return yo5Var.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH << (i - 8);
            default:
                return -1;
        }
    }
}
