package defpackage;

import defpackage.i80;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
final class s76 extends i80 {

    private static final class b implements i80.f {
        private final qm8 a;
        private final yo5 b;

        private i80.e c(yo5 yo5Var, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (yo5Var.a() >= 4) {
                if (s76.k(yo5Var.e(), yo5Var.f()) != 442) {
                    yo5Var.V(1);
                } else {
                    yo5Var.V(4);
                    long l = t76.l(yo5Var);
                    if (l != -9223372036854775807L) {
                        long b = this.a.b(l);
                        if (b > j) {
                            return j3 == -9223372036854775807L ? i80.e.d(b, j2) : i80.e.e(j2 + i2);
                        }
                        if (100000 + b > j) {
                            return i80.e.e(j2 + yo5Var.f());
                        }
                        i2 = yo5Var.f();
                        j3 = b;
                    }
                    d(yo5Var);
                    i = yo5Var.f();
                }
            }
            return j3 != -9223372036854775807L ? i80.e.f(j3, j2 + i) : i80.e.d;
        }

        private static void d(yo5 yo5Var) {
            int k;
            int g = yo5Var.g();
            if (yo5Var.a() < 10) {
                yo5Var.U(g);
                return;
            }
            yo5Var.V(9);
            int H = yo5Var.H() & 7;
            if (yo5Var.a() < H) {
                yo5Var.U(g);
                return;
            }
            yo5Var.V(H);
            if (yo5Var.a() < 4) {
                yo5Var.U(g);
                return;
            }
            if (s76.k(yo5Var.e(), yo5Var.f()) == 443) {
                yo5Var.V(4);
                int N = yo5Var.N();
                if (yo5Var.a() < N) {
                    yo5Var.U(g);
                    return;
                }
                yo5Var.V(N);
            }
            while (yo5Var.a() >= 4 && (k = s76.k(yo5Var.e(), yo5Var.f())) != 442 && k != 441 && (k >>> 8) == 1) {
                yo5Var.V(4);
                if (yo5Var.a() < 2) {
                    yo5Var.U(g);
                    return;
                }
                yo5Var.U(Math.min(yo5Var.g(), yo5Var.f() + yo5Var.N()));
            }
        }

        @Override // i80.f
        public i80.e a(z72 z72Var, long j) {
            long position = z72Var.getPosition();
            int min = (int) Math.min(20000L, z72Var.getLength() - position);
            this.b.Q(min);
            z72Var.r(this.b.e(), 0, min);
            return c(this.b, j, position);
        }

        @Override // i80.f
        public void b() {
            this.b.R(z19.f);
        }

        private b(qm8 qm8Var) {
            this.a = qm8Var;
            this.b = new yo5();
        }
    }

    public s76(qm8 qm8Var, long j, long j2) {
        super(new i80.b(), new b(qm8Var), j, 0L, j + 1, 0L, j2, 188L, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
