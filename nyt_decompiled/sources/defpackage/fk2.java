package defpackage;

import defpackage.hk2;
import defpackage.r38;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class fk2 extends r38 {
    private hk2 n;
    private a o;

    private static final class a implements pd5 {
        private hk2 a;
        private hk2.a b;
        private long c = -1;
        private long d = -1;

        public a(hk2 hk2Var, hk2.a aVar) {
            this.a = hk2Var;
            this.b = aVar;
        }

        @Override // defpackage.pd5
        public ei7 a() {
            ur.g(this.c != -1);
            return new gk2(this.a, this.c);
        }

        @Override // defpackage.pd5
        public long b(z72 z72Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // defpackage.pd5
        public void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[z19.i(jArr, j, true, true)];
        }

        public void d(long j) {
            this.c = j;
        }
    }

    fk2() {
    }

    private int n(yo5 yo5Var) {
        int i = (yo5Var.e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yo5Var.V(4);
            yo5Var.O();
        }
        int j = dk2.j(yo5Var, i);
        yo5Var.U(0);
        return j;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(yo5 yo5Var) {
        return yo5Var.a() >= 5 && yo5Var.H() == 127 && yo5Var.J() == 1179402563;
    }

    @Override // defpackage.r38
    protected long f(yo5 yo5Var) {
        if (o(yo5Var.e())) {
            return n(yo5Var);
        }
        return -1L;
    }

    @Override // defpackage.r38
    protected boolean i(yo5 yo5Var, long j, r38.b bVar) {
        byte[] e = yo5Var.e();
        hk2 hk2Var = this.n;
        if (hk2Var == null) {
            hk2 hk2Var2 = new hk2(e, 17);
            this.n = hk2Var2;
            bVar.a = hk2Var2.g(Arrays.copyOfRange(e, 9, yo5Var.g()), null);
            return true;
        }
        if ((e[0] & Byte.MAX_VALUE) == 3) {
            hk2.a g = ek2.g(yo5Var);
            hk2 b = hk2Var.b(g);
            this.n = b;
            this.o = new a(b, g);
            return true;
        }
        if (!o(e)) {
            return true;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.d(j);
            bVar.b = this.o;
        }
        ur.e(bVar.a);
        return false;
    }

    @Override // defpackage.r38
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
