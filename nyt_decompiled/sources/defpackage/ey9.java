package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcc;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ey9 implements nv9 {
    public static final fw9 n = new fw9() { // from class: dy9
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new ey9(0)};
        }
    };
    private static final int[] o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final int s;
    private boolean b;
    private long c;
    private int d;
    private int e;
    private boolean f;
    private int h;
    private long i;
    private sv9 j;
    private tx9 k;
    private gx9 l;
    private boolean m;
    private final byte[] a = new byte[1];
    private int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        int i = khe.a;
        Charset charset = ege.c;
        q = "#!AMR\n".getBytes(charset);
        r = "#!AMR-WB\n".getBytes(charset);
        s = iArr[8];
    }

    public ey9(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:13:0x0008, B:15:0x001c, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:12:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:13:0x0008, B:15:0x001c, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:12:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(defpackage.ov9 r12) {
        /*
            r11 = this;
            int r0 = r11.e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.zzj()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            bv9 r4 = (defpackage.bv9) r4     // Catch: java.io.EOFException -> Lb5
            r4.d(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.b     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = defpackage.ey9.p     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = defpackage.ey9.o     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.d = r0     // Catch: java.io.EOFException -> Lb5
            r11.e = r0
            int r4 = r11.g
            if (r4 != r1) goto L4e
            r11.g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.h
            int r4 = r4 + r2
            r11.h = r4
        L55:
            tx9 r4 = r11.k
            int r12 = defpackage.kx9.a(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.e
            int r0 = r0 - r12
            r11.e = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            tx9 r4 = r11.k
            long r5 = r11.c
            int r8 = r11.d
            r9 = 0
            r10 = 0
            r7 = 1
            r4.c(r5, r7, r8, r9, r10)
            long r0 = r11.c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.c = r0
            return r3
        L7a:
            java.lang.String r11 = "WB"
            java.lang.String r12 = "NB"
            if (r2 == r4) goto L81
            r11 = r12
        L81:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Illegal AMR "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r11)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r11 = " frame type "
            r12.append(r11)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r11 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.a(r11, r5)     // Catch: java.io.EOFException -> Lb5
            throw r11     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r11.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = "Invalid padding bits for frame header "
            r11.append(r12)     // Catch: java.io.EOFException -> Lb5
            r11.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r11 = r11.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.a(r11, r5)     // Catch: java.io.EOFException -> Lb5
            throw r11     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey9.a(ov9):int");
    }

    private static boolean b(ov9 ov9Var, byte[] bArr) {
        ov9Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((bv9) ov9Var).d(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(ov9 ov9Var) {
        byte[] bArr = q;
        if (b(ov9Var, bArr)) {
            this.b = false;
            ((bv9) ov9Var).l(bArr.length, false);
            return true;
        }
        byte[] bArr2 = r;
        if (!b(ov9Var, bArr2)) {
            return false;
        }
        this.b = true;
        ((bv9) ov9Var).l(bArr2.length, false);
        return true;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return c(ov9Var);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.j = sv9Var;
        this.k = sv9Var.zzw(0, 1);
        sv9Var.b();
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        wad.b(this.k);
        int i = khe.a;
        if (ov9Var.zzf() == 0 && !c(ov9Var)) {
            throw zzcc.a("Could not find AMR header.", null);
        }
        if (!this.m) {
            this.m = true;
            boolean z = this.b;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            tx9 tx9Var = this.k;
            x3a x3aVar = new x3a();
            x3aVar.w(str);
            x3aVar.o(s);
            x3aVar.k0(1);
            x3aVar.x(i2);
            tx9Var.f(x3aVar.D());
        }
        int a = a(ov9Var);
        if (this.f) {
            return a;
        }
        fx9 fx9Var = new fx9(-9223372036854775807L, 0L);
        this.l = fx9Var;
        this.j.m(fx9Var);
        this.f = true;
        return a;
    }
}
