package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes2.dex */
public abstract class d0 {
    private static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        private b(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static byte[] a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return b(2, i4, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    public static byte[] b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int c(xo5 xo5Var) {
        int h = xo5Var.h(5);
        return h == 31 ? xo5Var.h(6) + 32 : h;
    }

    private static int d(xo5 xo5Var) {
        int h = xo5Var.h(4);
        if (h == 15) {
            if (xo5Var.b() >= 24) {
                return xo5Var.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (h < 13) {
            return a[h];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(xo5 xo5Var, boolean z) {
        int c = c(xo5Var);
        int d = d(xo5Var);
        int h = xo5Var.h(4);
        String str = "mp4a.40." + c;
        if (c == 5 || c == 29) {
            d = d(xo5Var);
            c = c(xo5Var);
            if (c == 22) {
                h = xo5Var.h(4);
            }
        }
        if (z) {
            if (c != 1 && c != 2 && c != 3 && c != 4 && c != 6 && c != 7 && c != 17) {
                switch (c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.e("Unsupported audio object type: " + c);
                }
            }
            g(xo5Var, c, h);
            switch (c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = xo5Var.h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw ParserException.e("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = b[h];
        if (i != -1) {
            return new b(d, i, str);
        }
        throw ParserException.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new xo5(bArr), false);
    }

    private static void g(xo5 xo5Var, int i, int i2) {
        if (xo5Var.g()) {
            a84.j("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xo5Var.g()) {
            xo5Var.r(14);
        }
        boolean g = xo5Var.g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            xo5Var.r(3);
        }
        if (g) {
            if (i == 22) {
                xo5Var.r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                xo5Var.r(3);
            }
            xo5Var.r(1);
        }
    }
}
