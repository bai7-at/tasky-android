package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes2.dex */
abstract class yc9 {

    private static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(z72 z72Var, yo5 yo5Var) {
            z72Var.r(yo5Var.e(), 0, 8);
            yo5Var.U(0);
            return new a(yo5Var.q(), yo5Var.x());
        }
    }

    public static boolean a(z72 z72Var) {
        yo5 yo5Var = new yo5(8);
        int i = a.a(z72Var, yo5Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        z72Var.r(yo5Var.e(), 0, 4);
        yo5Var.U(0);
        int q = yo5Var.q();
        if (q == 1463899717) {
            return true;
        }
        a84.d("WavHeaderReader", "Unsupported form type: " + q);
        return false;
    }

    public static xc9 b(z72 z72Var) {
        byte[] bArr;
        yo5 yo5Var = new yo5(16);
        a d = d(1718449184, z72Var, yo5Var);
        ur.g(d.b >= 16);
        z72Var.r(yo5Var.e(), 0, 16);
        yo5Var.U(0);
        int z = yo5Var.z();
        int z2 = yo5Var.z();
        int y = yo5Var.y();
        int y2 = yo5Var.y();
        int z3 = yo5Var.z();
        int z4 = yo5Var.z();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            z72Var.r(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = z19.f;
        }
        z72Var.p((int) (z72Var.l() - z72Var.getPosition()));
        return new xc9(z, z2, y, y2, z3, z4, bArr);
    }

    public static long c(z72 z72Var) {
        yo5 yo5Var = new yo5(8);
        a a2 = a.a(z72Var, yo5Var);
        if (a2.a != 1685272116) {
            z72Var.g();
            return -1L;
        }
        z72Var.n(8);
        yo5Var.U(0);
        z72Var.r(yo5Var.e(), 0, 8);
        long v = yo5Var.v();
        z72Var.p(((int) a2.b) + 8);
        return v;
    }

    private static a d(int i, z72 z72Var, yo5 yo5Var) {
        a a2 = a.a(z72Var, yo5Var);
        while (a2.a != i) {
            a84.j("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.a);
            long j = a2.b + 8;
            if (j > 2147483647L) {
                throw ParserException.e("Chunk is too large (~2GB+) to skip; id: " + a2.a);
            }
            z72Var.p((int) j);
            a2 = a.a(z72Var, yo5Var);
        }
        return a2;
    }

    public static Pair e(z72 z72Var) {
        z72Var.g();
        a d = d(1684108385, z72Var, new yo5(8));
        z72Var.p(8);
        return Pair.create(Long.valueOf(z72Var.getPosition()), Long.valueOf(d.b));
    }
}
