package defpackage;

/* loaded from: classes3.dex */
final class c0 implements z02 {
    c0() {
    }

    private static char b(char c, char c2) {
        if (c83.f(c) && c83.f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // defpackage.z02
    public void a(d12 d12Var) {
        if (c83.a(d12Var.d(), d12Var.d) >= 2) {
            d12Var.r(b(d12Var.d().charAt(d12Var.d), d12Var.d().charAt(d12Var.d + 1)));
            d12Var.d += 2;
            return;
        }
        char c = d12Var.c();
        int n = c83.n(d12Var.d(), d12Var.d, c());
        if (n == c()) {
            if (!c83.g(c)) {
                d12Var.r((char) (c + 1));
                d12Var.d++;
                return;
            } else {
                d12Var.r((char) 235);
                d12Var.r((char) (c - 127));
                d12Var.d++;
                return;
            }
        }
        if (n == 1) {
            d12Var.r((char) 230);
            d12Var.o(1);
            return;
        }
        if (n == 2) {
            d12Var.r((char) 239);
            d12Var.o(2);
            return;
        }
        if (n == 3) {
            d12Var.r((char) 238);
            d12Var.o(3);
        } else if (n == 4) {
            d12Var.r((char) 240);
            d12Var.o(4);
        } else {
            if (n != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n)));
            }
            d12Var.r((char) 231);
            d12Var.o(5);
        }
    }

    public int c() {
        return 0;
    }
}
