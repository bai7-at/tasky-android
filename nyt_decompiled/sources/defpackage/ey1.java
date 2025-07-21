package defpackage;

/* loaded from: classes3.dex */
final class ey1 implements z02 {
    ey1() {
    }

    private static void b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            c83.e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((charAt >> 16) & 255);
        char c2 = (char) ((charAt >> 8) & 255);
        char c3 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    private static void e(d12 d12Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                d12Var.p();
                int a = d12Var.g().a() - d12Var.a();
                int f = d12Var.f();
                if (f > a) {
                    d12Var.q(d12Var.a() + 1);
                    a = d12Var.g().a() - d12Var.a();
                }
                if (f <= a && a <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String c = c(charSequence, 0);
            if (d12Var.i() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                d12Var.q(d12Var.a() + i);
                if (d12Var.g().a() - d12Var.a() >= 3) {
                    d12Var.q(d12Var.a() + c.length());
                    z = false;
                }
            }
            if (z) {
                d12Var.k();
                d12Var.d -= i;
            } else {
                d12Var.s(c);
            }
        } finally {
            d12Var.o(0);
        }
    }

    @Override // defpackage.z02
    public void a(d12 d12Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!d12Var.i()) {
                break;
            }
            b(d12Var.c(), sb);
            d12Var.d++;
            if (sb.length() >= 4) {
                d12Var.s(c(sb, 0));
                sb.delete(0, 4);
                if (c83.n(d12Var.d(), d12Var.d, d()) != d()) {
                    d12Var.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(d12Var, sb);
    }

    public int d() {
        return 4;
    }
}
