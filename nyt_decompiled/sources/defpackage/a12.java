package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class a12 {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Mode.values().length];
            a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, l80 l80Var, String str2) {
        try {
            for (byte b : str.getBytes(str2)) {
                l80Var.c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    static void b(CharSequence charSequence, l80 l80Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = p(charSequence.charAt(i));
            if (p == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int p2 = p(charSequence.charAt(i2));
                if (p2 == -1) {
                    throw new WriterException();
                }
                l80Var.c((p * 45) + p2, 11);
                i += 2;
            } else {
                l80Var.c(p, 6);
                i = i2;
            }
        }
    }

    static void c(String str, Mode mode, l80 l80Var, String str2) {
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            h(str, l80Var);
            return;
        }
        if (i == 2) {
            b(str, l80Var);
        } else if (i == 3) {
            a(str, l80Var, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            e(str, l80Var);
        }
    }

    private static void d(CharacterSetECI characterSetECI, l80 l80Var) {
        l80Var.c(Mode.ECI.getBits(), 4);
        l80Var.c(characterSetECI.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(java.lang.String r6, defpackage.l80 r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = r4
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.e(java.lang.String, l80):void");
    }

    static void f(int i, c59 c59Var, Mode mode, l80 l80Var) {
        int characterCountBits = mode.getCharacterCountBits(c59Var);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            l80Var.c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    static void g(Mode mode, l80 l80Var) {
        l80Var.c(mode.getBits(), 4);
    }

    static void h(CharSequence charSequence, l80 l80Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                l80Var.c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    l80Var.c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    l80Var.c(charAt, 4);
                }
            }
        }
    }

    private static int i(Mode mode, l80 l80Var, l80 l80Var2, c59 c59Var) {
        return l80Var.g() + mode.getCharacterCountBits(c59Var) + l80Var2.g();
    }

    private static int j(of0 of0Var) {
        return ef4.a(of0Var) + ef4.c(of0Var) + ef4.d(of0Var) + ef4.e(of0Var);
    }

    private static int k(l80 l80Var, ErrorCorrectionLevel errorCorrectionLevel, c59 c59Var, of0 of0Var) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            mg4.a(l80Var, errorCorrectionLevel, c59Var, i3, of0Var);
            int j = j(of0Var);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    private static Mode l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (p(charAt) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
        }
        return z ? Mode.ALPHANUMERIC : z2 ? Mode.NUMERIC : Mode.BYTE;
    }

    private static c59 m(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            c59 e = c59.e(i2);
            if (v(i, e, errorCorrectionLevel)) {
                return e;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.db6 n(java.lang.String r6, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r7, java.util.Map r8) {
        /*
            if (r8 == 0) goto Lc
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1a
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "ISO-8859-1"
        L1c:
            com.google.zxing.qrcode.decoder.Mode r2 = l(r6, r1)
            l80 r3 = new l80
            r3.<init>()
            com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r2 != r4) goto L34
            if (r0 == 0) goto L34
            com.google.zxing.common.CharacterSetECI r0 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r1)
            if (r0 == 0) goto L34
            d(r0, r3)
        L34:
            if (r8 == 0) goto L55
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L55
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            com.google.zxing.qrcode.decoder.Mode r0 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            g(r0, r3)
        L55:
            g(r2, r3)
            l80 r0 = new l80
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L8d
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L8d
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            c59 r8 = defpackage.c59.e(r8)
            int r1 = i(r2, r3, r0, r8)
            boolean r1 = v(r1, r8, r7)
            if (r1 == 0) goto L85
            goto L91
        L85:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L8d:
            c59 r8 = t(r7, r2, r3, r0)
        L91:
            l80 r1 = new l80
            r1.<init>()
            r1.b(r3)
            if (r2 != r4) goto La0
            int r6 = r0.h()
            goto La4
        La0:
            int r6 = r6.length()
        La4:
            f(r6, r8, r2, r1)
            r1.b(r0)
            c59$b r6 = r8.c(r7)
            int r0 = r8.d()
            int r3 = r6.d()
            int r0 = r0 - r3
            u(r0, r1)
            int r3 = r8.d()
            int r6 = r6.c()
            l80 r6 = r(r1, r3, r0, r6)
            db6 r0 = new db6
            r0.<init>()
            r0.c(r7)
            r0.f(r2)
            r0.g(r8)
            int r1 = r8.b()
            of0 r2 = new of0
            r2.<init>(r1, r1)
            int r1 = k(r6, r7, r8, r2)
            r0.d(r1)
            defpackage.mg4.a(r6, r7, r8, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.n(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):db6");
    }

    static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new st6(lx2.l).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static int p(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    static l80 r(l80 l80Var, int i, int i2, int i3) {
        if (l80Var.h() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i, i2, i3, i7, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            l80Var.k(i4 << 3, bArr, 0, i8);
            byte[] o = o(bArr, iArr2[0]);
            arrayList.add(new j90(bArr, o));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, o.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new WriterException("Data bytes does not match offset");
        }
        l80 l80Var2 = new l80();
        for (int i9 = 0; i9 < i5; i9++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] a2 = ((j90) it2.next()).a();
                if (i9 < a2.length) {
                    l80Var2.c(a2[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                byte[] b = ((j90) it3.next()).b();
                if (i10 < b.length) {
                    l80Var2.c(b[i10], 8);
                }
            }
        }
        if (i == l80Var2.h()) {
            return l80Var2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + l80Var2.h() + " differ.");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static c59 t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, l80 l80Var, l80 l80Var2) {
        return m(i(mode, l80Var, l80Var2, m(i(mode, l80Var, l80Var2, c59.e(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    static void u(int i, l80 l80Var) {
        int i2 = i << 3;
        if (l80Var.g() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + l80Var.g() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && l80Var.g() < i2; i3++) {
            l80Var.a(false);
        }
        int g = l80Var.g() & 7;
        if (g > 0) {
            while (g < 8) {
                l80Var.a(false);
                g++;
            }
        }
        int h = i - l80Var.h();
        for (int i4 = 0; i4 < h; i4++) {
            l80Var.c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (l80Var.g() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i, c59 c59Var, ErrorCorrectionLevel errorCorrectionLevel) {
        return c59Var.d() - c59Var.c(errorCorrectionLevel).d() >= (i + 7) / 8;
    }
}
