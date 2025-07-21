package defpackage;

/* loaded from: classes3.dex */
final class rl9 extends yf0 {
    rl9() {
    }

    @Override // defpackage.yf0, defpackage.z02
    public void a(d12 d12Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!d12Var.i()) {
                break;
            }
            char c = d12Var.c();
            d12Var.d++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                yf0.g(d12Var, sb);
                if (c83.n(d12Var.d(), d12Var.d, e()) != e()) {
                    d12Var.o(0);
                    break;
                }
            }
        }
        f(d12Var, sb);
    }

    @Override // defpackage.yf0
    int c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c < 'A' || c > 'Z') {
            c83.e(c);
        } else {
            sb.append((char) (c - '3'));
        }
        return 1;
    }

    @Override // defpackage.yf0
    public int e() {
        return 3;
    }

    @Override // defpackage.yf0
    void f(d12 d12Var, StringBuilder sb) {
        d12Var.p();
        int a = d12Var.g().a() - d12Var.a();
        d12Var.d -= sb.length();
        if (d12Var.f() > 1 || a > 1 || d12Var.f() != a) {
            d12Var.r((char) 254);
        }
        if (d12Var.e() < 0) {
            d12Var.o(0);
        }
    }
}
