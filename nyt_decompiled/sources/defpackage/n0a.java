package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class n0a {
    public static final l0a a = new l0a() { // from class: k0a
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzby a(byte[] r11, int r12, defpackage.l0a r13, defpackage.xz9 r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0a.a(byte[], int, l0a, xz9):com.google.android.gms.internal.ads.zzby");
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int c(byte[] bArr, int i, int i2) {
        int d = d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return d;
        }
        while (true) {
            int length = bArr.length;
            if (d >= length - 1) {
                return length;
            }
            int i3 = d + 1;
            if ((d - i) % 2 == 0 && bArr[i3] == 0) {
                return d;
            }
            d = d(bArr, i3);
        }
    }

    private static int d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int e(b9e b9eVar, int i) {
        byte[] m = b9eVar.m();
        int s = b9eVar.s();
        int i2 = s;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= s + i) {
                return i;
            }
            if ((m[i2] & 255) == 255 && m[i3] == 0) {
                System.arraycopy(m, i2 + 2, m, i3, (i - (i2 - s)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzagr f(int r35, defpackage.b9e r36, boolean r37, int r38, defpackage.l0a r39) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0a.f(int, b9e, boolean, int, l0a):com.google.android.gms.internal.ads.zzagr");
    }

    private static zzgaa g(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgaa.u("");
        }
        h9 h9Var = new h9();
        int c = c(bArr, i2, i);
        while (i2 < c) {
            h9Var.g(new String(bArr, i2, c - i2, j(i)));
            i2 = b(i) + c;
            c = c(bArr, i2, i);
        }
        zzgaa j = h9Var.j();
        return j.isEmpty() ? zzgaa.u("") : j;
    }

    private static String h(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset j(int i) {
        return i != 1 ? i != 2 ? i != 3 ? ege.b : ege.c : ege.d : ege.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(defpackage.b9e r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.s()
        L8:
            int r3 = r21.q()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r21.v()     // Catch: java.lang.Throwable -> L22
            long r8 = r21.J()     // Catch: java.lang.Throwable -> L22
            int r10 = r21.F()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r21.D()     // Catch: java.lang.Throwable -> L22
            int r8 = r21.D()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r21.q()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.l(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.k(r2)
            return r4
        Lab:
            r1.k(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0a.k(b9e, int, int, boolean):boolean");
    }

    private static byte[] l(byte[] bArr, int i, int i2) {
        return i2 <= i ? khe.f : Arrays.copyOfRange(bArr, i, i2);
    }
}
