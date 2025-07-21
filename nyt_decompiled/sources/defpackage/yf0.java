package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes3.dex */
class yf0 implements z02 {
    yf0() {
    }

    private int b(d12 d12Var, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        d12Var.d--;
        int c = c(d12Var.c(), sb2);
        d12Var.k();
        return c;
    }

    private static String d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / JceEncryptionConstants.SYMMETRIC_KEY_LENGTH), (char) (charAt % JceEncryptionConstants.SYMMETRIC_KEY_LENGTH)});
    }

    static void g(d12 d12Var, StringBuilder sb) {
        d12Var.s(d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // defpackage.z02
    public void a(d12 d12Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!d12Var.i()) {
                break;
            }
            char c = d12Var.c();
            d12Var.d++;
            int c2 = c(c, sb);
            int a = d12Var.a() + ((sb.length() / 3) << 1);
            d12Var.q(a);
            int a2 = d12Var.g().a() - a;
            if (!d12Var.i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a2 < 2 || a2 > 2)) {
                    c2 = b(d12Var, sb, sb2, c2);
                }
                while (sb.length() % 3 == 1 && ((c2 <= 3 && a2 != 1) || c2 > 3)) {
                    c2 = b(d12Var, sb, sb2, c2);
                }
            } else if (sb.length() % 3 == 0 && c83.n(d12Var.d(), d12Var.d, e()) != e()) {
                d12Var.o(0);
                break;
            }
        }
        f(d12Var, sb);
    }

    int c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int e() {
        return 1;
    }

    void f(d12 d12Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int a = d12Var.a() + length;
        d12Var.q(a);
        int a2 = d12Var.g().a() - a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(d12Var, sb);
            }
            if (d12Var.i()) {
                d12Var.r((char) 254);
            }
        } else if (a2 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                g(d12Var, sb);
            }
            if (d12Var.i()) {
                d12Var.r((char) 254);
            }
            d12Var.d--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                g(d12Var, sb);
            }
            if (a2 > 0 || d12Var.i()) {
                d12Var.r((char) 254);
            }
        }
        d12Var.o(0);
    }
}
