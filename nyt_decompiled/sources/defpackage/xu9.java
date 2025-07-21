package defpackage;

/* loaded from: classes3.dex */
public abstract class xu9 {
    public static void a(long j, b9e b9eVar, tx9[] tx9VarArr) {
        int i;
        while (true) {
            if (b9eVar.q() <= 1) {
                return;
            }
            int c = c(b9eVar);
            int c2 = c(b9eVar);
            int s = b9eVar.s() + c2;
            if (c2 == -1 || c2 > b9eVar.q()) {
                ezd.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                s = b9eVar.t();
            } else if (c == 4 && c2 >= 8) {
                int B = b9eVar.B();
                int F = b9eVar.F();
                if (F == 49) {
                    i = b9eVar.v();
                    F = 49;
                } else {
                    i = 0;
                }
                int B2 = b9eVar.B();
                if (F == 47) {
                    b9eVar.l(1);
                    F = 47;
                }
                boolean z = B == 181 && (F == 49 || F == 47) && B2 == 3;
                if (F == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    b(j, b9eVar, tx9VarArr);
                }
            }
            b9eVar.k(s);
        }
    }

    public static void b(long j, b9e b9eVar, tx9[] tx9VarArr) {
        int B = b9eVar.B();
        if ((B & 64) != 0) {
            int i = B & 31;
            b9eVar.l(1);
            int s = b9eVar.s();
            for (tx9 tx9Var : tx9VarArr) {
                int i2 = i * 3;
                b9eVar.k(s);
                tx9Var.b(b9eVar, i2);
                wad.f(j != -9223372036854775807L);
                tx9Var.c(j, 1, i2, 0, null);
            }
        }
    }

    private static int c(b9e b9eVar) {
        int i = 0;
        while (b9eVar.q() != 0) {
            int B = b9eVar.B();
            i += B;
            if (B != 255) {
                return i;
            }
        }
        return -1;
    }
}
