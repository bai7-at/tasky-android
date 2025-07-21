package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
abstract class mg4 {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, ContentType.LONG_FORM_ON_DEMAND, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(l80 l80Var, ErrorCorrectionLevel errorCorrectionLevel, c59 c59Var, int i, of0 of0Var) {
        c(of0Var);
        d(c59Var, of0Var);
        l(errorCorrectionLevel, i, of0Var);
        s(c59Var, of0Var);
        f(l80Var, i, of0Var);
    }

    static int b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int n = n(i2);
        int i3 = i << (n - 1);
        while (n(i3) >= n) {
            i3 ^= i2 << (n(i3) - n);
        }
        return i3;
    }

    static void c(of0 of0Var) {
        of0Var.a((byte) -1);
    }

    static void d(c59 c59Var, of0 of0Var) {
        j(of0Var);
        e(of0Var);
        r(c59Var, of0Var);
        k(of0Var);
    }

    private static void e(of0 of0Var) {
        if (of0Var.b(8, of0Var.d() - 8) == 0) {
            throw new WriterException();
        }
        of0Var.f(8, of0Var.d() - 8, 1);
    }

    static void f(l80 l80Var, int i, of0 of0Var) {
        boolean z;
        int e = of0Var.e() - 1;
        int d2 = of0Var.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d2 >= 0 && d2 < of0Var.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (o(of0Var.b(i5, d2))) {
                        if (i2 < l80Var.g()) {
                            z = l80Var.f(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && ef4.f(i, i5, d2)) {
                            z = !z;
                        }
                        of0Var.g(i5, d2, z);
                    }
                }
                d2 += i3;
            }
            i3 = -i3;
            d2 += i3;
            e -= 2;
        }
        if (i2 == l80Var.g()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + '/' + l80Var.g());
    }

    private static void g(int i, int i2, of0 of0Var) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!o(of0Var.b(i4, i2))) {
                throw new WriterException();
            }
            of0Var.f(i4, i2, 0);
        }
    }

    private static void h(int i, int i2, of0 of0Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                of0Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void i(int i, int i2, of0 of0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                of0Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void j(of0 of0Var) {
        int length = a[0].length;
        i(0, 0, of0Var);
        i(of0Var.e() - length, 0, of0Var);
        i(0, of0Var.e() - length, of0Var);
        g(0, 7, of0Var);
        g(of0Var.e() - 8, 7, of0Var);
        g(0, of0Var.e() - 8, of0Var);
        m(7, 0, of0Var);
        m(of0Var.d() - 8, 0, of0Var);
        m(7, of0Var.d() - 7, of0Var);
    }

    private static void k(of0 of0Var) {
        int i = 8;
        while (i < of0Var.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(of0Var.b(i, 6))) {
                of0Var.f(i, 6, i3);
            }
            if (o(of0Var.b(6, i))) {
                of0Var.f(6, i, i3);
            }
            i = i2;
        }
    }

    static void l(ErrorCorrectionLevel errorCorrectionLevel, int i, of0 of0Var) {
        l80 l80Var = new l80();
        p(errorCorrectionLevel, i, l80Var);
        for (int i2 = 0; i2 < l80Var.g(); i2++) {
            boolean f = l80Var.f((l80Var.g() - 1) - i2);
            int[] iArr = d[i2];
            of0Var.g(iArr[0], iArr[1], f);
            if (i2 < 8) {
                of0Var.g((of0Var.e() - i2) - 1, 8, f);
            } else {
                of0Var.g(8, (of0Var.d() - 7) + (i2 - 8), f);
            }
        }
    }

    private static void m(int i, int i2, of0 of0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!o(of0Var.b(i, i4))) {
                throw new WriterException();
            }
            of0Var.f(i, i4, 0);
        }
    }

    static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static boolean o(int i) {
        return i == -1;
    }

    static void p(ErrorCorrectionLevel errorCorrectionLevel, int i, l80 l80Var) {
        if (!db6.b(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        l80Var.c(bits, 5);
        l80Var.c(b(bits, 1335), 10);
        l80 l80Var2 = new l80();
        l80Var2.c(21522, 15);
        l80Var.l(l80Var2);
        if (l80Var.g() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + l80Var.g());
    }

    static void q(c59 c59Var, l80 l80Var) {
        l80Var.c(c59Var.f(), 6);
        l80Var.c(b(c59Var.f(), 7973), 12);
        if (l80Var.g() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + l80Var.g());
    }

    private static void r(c59 c59Var, of0 of0Var) {
        if (c59Var.f() < 2) {
            return;
        }
        int[] iArr = c[c59Var.f() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && o(of0Var.b(i2, i))) {
                        h(i2 - 2, i - 2, of0Var);
                    }
                }
            }
        }
    }

    static void s(c59 c59Var, of0 of0Var) {
        if (c59Var.f() < 7) {
            return;
        }
        l80 l80Var = new l80();
        q(c59Var, l80Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean f = l80Var.f(i);
                i--;
                of0Var.g(i2, (of0Var.d() - 11) + i3, f);
                of0Var.g((of0Var.d() - 11) + i3, i2, f);
            }
        }
    }
}
