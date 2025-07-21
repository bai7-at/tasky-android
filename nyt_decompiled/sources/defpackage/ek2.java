package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import defpackage.hk2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ek2 {

    public static final class a {
        public hk2 a;

        public a(hk2 hk2Var) {
            this.a = hk2Var;
        }
    }

    public static boolean a(z72 z72Var) {
        yo5 yo5Var = new yo5(4);
        z72Var.r(yo5Var.e(), 0, 4);
        return yo5Var.J() == 1716281667;
    }

    public static int b(z72 z72Var) {
        z72Var.g();
        yo5 yo5Var = new yo5(2);
        z72Var.r(yo5Var.e(), 0, 2);
        int N = yo5Var.N();
        if ((N >> 2) == 16382) {
            z72Var.g();
            return N;
        }
        z72Var.g();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static Metadata c(z72 z72Var, boolean z) {
        Metadata a2 = new se3().a(z72Var, z ? null : re3.b);
        if (a2 == null || a2.e() == 0) {
            return null;
        }
        return a2;
    }

    public static Metadata d(z72 z72Var, boolean z) {
        z72Var.g();
        long l = z72Var.l();
        Metadata c = c(z72Var, z);
        z72Var.p((int) (z72Var.l() - l));
        return c;
    }

    public static boolean e(z72 z72Var, a aVar) {
        z72Var.g();
        xo5 xo5Var = new xo5(new byte[4]);
        z72Var.r(xo5Var.a, 0, 4);
        boolean g = xo5Var.g();
        int h = xo5Var.h(7);
        int h2 = xo5Var.h(24) + 4;
        if (h == 0) {
            aVar.a = h(z72Var);
        } else {
            hk2 hk2Var = aVar.a;
            if (hk2Var == null) {
                throw new IllegalArgumentException();
            }
            if (h == 3) {
                aVar.a = hk2Var.b(f(z72Var, h2));
            } else if (h == 4) {
                aVar.a = hk2Var.c(j(z72Var, h2));
            } else if (h == 6) {
                yo5 yo5Var = new yo5(h2);
                z72Var.readFully(yo5Var.e(), 0, h2);
                yo5Var.V(4);
                aVar.a = hk2Var.a(ImmutableList.y(PictureFrame.a(yo5Var)));
            } else {
                z72Var.p(h2);
            }
        }
        return g;
    }

    private static hk2.a f(z72 z72Var, int i) {
        yo5 yo5Var = new yo5(i);
        z72Var.readFully(yo5Var.e(), 0, i);
        return g(yo5Var);
    }

    public static hk2.a g(yo5 yo5Var) {
        yo5Var.V(1);
        int K = yo5Var.K();
        long f = yo5Var.f() + K;
        int i = K / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A = yo5Var.A();
            if (A == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A;
            jArr2[i2] = yo5Var.A();
            yo5Var.V(2);
            i2++;
        }
        yo5Var.V((int) (f - yo5Var.f()));
        return new hk2.a(jArr, jArr2);
    }

    private static hk2 h(z72 z72Var) {
        byte[] bArr = new byte[38];
        z72Var.readFully(bArr, 0, 38);
        return new hk2(bArr, 4);
    }

    public static void i(z72 z72Var) {
        yo5 yo5Var = new yo5(4);
        z72Var.readFully(yo5Var.e(), 0, 4);
        if (yo5Var.J() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(z72 z72Var, int i) {
        yo5 yo5Var = new yo5(i);
        z72Var.readFully(yo5Var.e(), 0, i);
        yo5Var.V(4);
        return Arrays.asList(oc9.i(yo5Var, false, false).b);
    }
}
