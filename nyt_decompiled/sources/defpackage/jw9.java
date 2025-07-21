package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.ads.zzcc;

/* loaded from: classes3.dex */
public abstract class jw9 {
    public static int a(b9e b9eVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return b9eVar.B() + 1;
            case 7:
                return b9eVar.F() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH << (i - 8);
            default:
                return -1;
        }
    }

    public static long b(ov9 ov9Var, pw9 pw9Var) {
        ov9Var.zzj();
        bv9 bv9Var = (bv9) ov9Var;
        bv9Var.k(1, false);
        byte[] bArr = new byte[1];
        bv9Var.d(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        bv9Var.k(2, false);
        int i2 = 1 != i ? 6 : 7;
        b9e b9eVar = new b9e(i2);
        b9eVar.j(tv9.a(ov9Var, b9eVar.m(), 0, i2));
        ov9Var.zzj();
        hw9 hw9Var = new hw9();
        if (d(b9eVar, pw9Var, z, hw9Var)) {
            return hw9Var.a;
        }
        throw zzcc.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r3 != r22.f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r21.B() * io.embrace.android.embracesdk.config.behavior.NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r4 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.b9e r21, defpackage.pw9 r22, int r23, defpackage.hw9 r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.s()
            long r3 = r21.J()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.g
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.g
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.i
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = d(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = a(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.b
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.e
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.f
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.B()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.F()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.B()
            int r3 = r21.s()
            byte[] r0 = r21.m()
            int r3 = r3 + r15
            int r0 = defpackage.khe.t(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw9.c(b9e, pw9, int, hw9):boolean");
    }

    private static boolean d(b9e b9eVar, pw9 pw9Var, boolean z, hw9 hw9Var) {
        try {
            long L = b9eVar.L();
            if (!z) {
                L *= pw9Var.b;
            }
            hw9Var.a = L;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
