package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class c83 {
    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    public static String b(String str, SymbolShapeHint symbolShapeHint, pq1 pq1Var, pq1 pq1Var2) {
        int i = 0;
        z02[] z02VarArr = {new c0(), new yf0(), new ci8(), new rl9(), new ey1(), new p40()};
        d12 d12Var = new d12(str);
        d12Var.n(symbolShapeHint);
        d12Var.l(pq1Var, pq1Var2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            d12Var.r((char) 236);
            d12Var.m(2);
            d12Var.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            d12Var.r((char) 237);
            d12Var.m(2);
            d12Var.d += 7;
        }
        while (d12Var.i()) {
            z02VarArr[i].a(d12Var);
            if (d12Var.e() >= 0) {
                i = d12Var.e();
                d12Var.j();
            }
        }
        int a = d12Var.a();
        d12Var.p();
        int a2 = d12Var.g().a();
        if (a < a2 && i != 0 && i != 5 && i != 4) {
            d12Var.r((char) 254);
        }
        StringBuilder b = d12Var.b();
        if (b.length() < a2) {
            b.append((char) 129);
        }
        while (b.length() < a2) {
            b.append(o((char) 129, b.length() + 1));
        }
        return d12Var.b().toString();
    }

    private static int c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    private static int d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    static void e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean g(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean i(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean k(char c) {
        if (m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean l(char c) {
        return false;
    }

    private static boolean m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    static int n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        int i3;
        int i4;
        if (i >= charSequence.length()) {
            return i2;
        }
        float f = 2.0f;
        int i5 = 6;
        int i6 = 4;
        int i7 = 3;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i8 = 0;
        while (true) {
            int i9 = i + i8;
            if (i9 == charSequence.length()) {
                byte[] bArr = new byte[i5];
                int[] iArr = new int[i5];
                int c = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d = d(bArr);
                if (iArr[0] == c) {
                    return 0;
                }
                if (d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d == 1 && bArr[i6] > 0) {
                    return i6;
                }
                if (d == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (d != 1 || bArr[i7] <= 0) {
                    return 1;
                }
                return i7;
            }
            char charAt = charSequence.charAt(i9);
            i8++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i8 >= 4) {
                int[] iArr2 = new int[i5];
                byte[] bArr2 = new byte[i5];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d2 = d(bArr2);
                int i10 = iArr2[0];
                int i11 = iArr2[5];
                if (i10 < i11 && i10 < iArr2[1] && i10 < iArr2[2] && i10 < iArr2[3] && i10 < iArr2[4]) {
                    return 0;
                }
                if (i11 < i10) {
                    break;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    break;
                }
                if (d2 == 1 && b4 > 0) {
                    return 4;
                }
                if (d2 == 1 && b2 > 0) {
                    return 2;
                }
                if (d2 == 1 && b3 > 0) {
                    return 3;
                }
                int i12 = iArr2[1];
                if (i12 + 1 >= i10 || i12 + 1 >= i11) {
                    i4 = 3;
                    i3 = 4;
                    i6 = i3;
                    i5 = 6;
                    i7 = i4;
                    f = 2.0f;
                } else {
                    i3 = 4;
                    if (i12 + 1 < iArr2[4] && i12 + 1 < iArr2[2]) {
                        int i13 = iArr2[3];
                        if (i12 < i13) {
                            return 1;
                        }
                        if (i12 == i13) {
                            for (int i14 = i + i8 + 1; i14 < charSequence.length(); i14++) {
                                char charAt2 = charSequence.charAt(i14);
                                if (m(charAt2)) {
                                    return 3;
                                }
                                if (!k(charAt2)) {
                                    break;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } else {
                i3 = 4;
            }
            i4 = 3;
            i6 = i3;
            i5 = 6;
            i7 = i4;
            f = 2.0f;
        }
        return 5;
    }

    private static char o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
