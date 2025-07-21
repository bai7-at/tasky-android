package defpackage;

import defpackage.i80;

/* loaded from: classes2.dex */
final class ot8 extends i80 {

    private static final class a implements i80.f {
        private final qm8 a;
        private final yo5 b = new yo5();
        private final int c;
        private final int d;

        public a(int i, qm8 qm8Var, int i2) {
            this.c = i;
            this.a = qm8Var;
            this.d = i2;
        }

        private i80.e c(yo5 yo5Var, long j, long j2) {
            int a;
            int a2;
            int g = yo5Var.g();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (yo5Var.a() >= 188 && (a2 = (a = tt8.a(yo5Var.e(), yo5Var.f(), g)) + 188) <= g) {
                long c = tt8.c(yo5Var, a, this.c);
                if (c != -9223372036854775807L) {
                    long b = this.a.b(c);
                    if (b > j) {
                        return j5 == -9223372036854775807L ? i80.e.d(b, j2) : i80.e.e(j2 + j4);
                    }
                    if (100000 + b > j) {
                        return i80.e.e(a + j2);
                    }
                    j4 = a;
                    j5 = b;
                }
                yo5Var.U(a2);
                j3 = a2;
            }
            return j5 != -9223372036854775807L ? i80.e.f(j5, j2 + j3) : i80.e.d;
        }

        @Override // i80.f
        public i80.e a(z72 z72Var, long j) {
            long position = z72Var.getPosition();
            int min = (int) Math.min(this.d, z72Var.getLength() - position);
            this.b.Q(min);
            z72Var.r(this.b.e(), 0, min);
            return c(this.b, j, position);
        }

        @Override // i80.f
        public void b() {
            this.b.R(z19.f);
        }
    }

    public ot8(qm8 qm8Var, long j, long j2, int i, int i2) {
        super(new i80.b(), new a(i, qm8Var, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
