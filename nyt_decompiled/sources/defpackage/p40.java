package defpackage;

/* loaded from: classes3.dex */
final class p40 implements z02 {
    p40() {
    }

    private static char c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // defpackage.z02
    public void a(d12 d12Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!d12Var.i()) {
                break;
            }
            sb.append(d12Var.c());
            d12Var.d++;
            if (c83.n(d12Var.d(), d12Var.d, b()) != b()) {
                d12Var.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = d12Var.a() + length + 1;
        d12Var.q(a);
        boolean z = d12Var.g().a() - a > 0;
        if (d12Var.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            d12Var.r(c(sb.charAt(i), d12Var.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
