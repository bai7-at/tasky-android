package defpackage;

/* loaded from: classes2.dex */
public abstract class ri0 {
    public static void a(long j, yo5 yo5Var, yp8[] yp8VarArr) {
        while (true) {
            if (yo5Var.a() <= 1) {
                return;
            }
            int c = c(yo5Var);
            int c2 = c(yo5Var);
            int f = yo5Var.f() + c2;
            if (c2 == -1 || c2 > yo5Var.a()) {
                a84.j("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f = yo5Var.g();
            } else if (c == 4 && c2 >= 8) {
                int H = yo5Var.H();
                int N = yo5Var.N();
                int q = N == 49 ? yo5Var.q() : 0;
                int H2 = yo5Var.H();
                if (N == 47) {
                    yo5Var.V(1);
                }
                boolean z = H == 181 && (N == 49 || N == 47) && H2 == 3;
                if (N == 49) {
                    z &= q == 1195456820;
                }
                if (z) {
                    b(j, yo5Var, yp8VarArr);
                }
            }
            yo5Var.U(f);
        }
    }

    public static void b(long j, yo5 yo5Var, yp8[] yp8VarArr) {
        int H = yo5Var.H();
        if ((H & 64) != 0) {
            yo5Var.V(1);
            int i = (H & 31) * 3;
            int f = yo5Var.f();
            for (yp8 yp8Var : yp8VarArr) {
                yo5Var.U(f);
                yp8Var.a(yo5Var, i);
                if (j != -9223372036854775807L) {
                    yp8Var.b(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int c(yo5 yo5Var) {
        int i = 0;
        while (yo5Var.a() != 0) {
            int H = yo5Var.H();
            i += H;
            if (H != 255) {
                return i;
            }
        }
        return -1;
    }
}
