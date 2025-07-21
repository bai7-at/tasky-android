package defpackage;

import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class npf {
    public static final npf c = new npf(new int[]{2}, 10);
    private static final zzgaa d = zzgaa.w(2, 5, 6);
    private static final zzgad e;
    private final int[] a;
    private final int b;

    static {
        l9 l9Var = new l9();
        l9Var.a(5, 6);
        l9Var.a(17, 6);
        l9Var.a(7, 6);
        l9Var.a(30, 10);
        l9Var.a(18, 6);
        l9Var.a(6, 8);
        l9Var.a(8, 8);
        l9Var.a(14, 8);
        e = l9Var.c();
    }

    public npf(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.a = copyOf;
        Arrays.sort(copyOf);
        this.b = 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x003e, code lost:
    
        if (c(30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(defpackage.l6a r8, defpackage.waf r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.l
            r0.getClass()
            java.lang.String r1 = r8.i
            int r0 = defpackage.qcb.a(r0, r1)
            com.google.android.gms.internal.ads.zzgad r1 = defpackage.npf.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L19
            goto Lc4
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r0 != r5) goto L2a
            boolean r0 = r7.c(r5)
            if (r0 != 0) goto L29
            r0 = r4
            goto L41
        L29:
            r0 = r5
        L2a:
            if (r0 != r3) goto L36
            boolean r0 = r7.c(r3)
            if (r0 == 0) goto L34
            r0 = r3
            goto L36
        L34:
            r0 = r2
            goto L41
        L36:
            r6 = 30
            if (r0 != r6) goto L41
            boolean r6 = r7.c(r6)
            if (r6 != 0) goto L41
            goto L34
        L41:
            boolean r7 = r7.c(r0)
            if (r7 == 0) goto Lc4
            int r7 = r8.y
            r6 = -1
            if (r7 == r6) goto L62
            if (r0 != r5) goto L4f
            goto L62
        L4f:
            java.lang.String r8 = r8.l
            java.lang.String r9 = "audio/vnd.dts.uhd;profile=p2"
            boolean r8 = r8.equals(r9)
            r9 = 10
            if (r8 == 0) goto L5f
            if (r7 <= r9) goto L8a
            goto Lc4
        L5f:
            if (r7 <= r9) goto L8a
            goto Lc4
        L62:
            int r7 = r8.z
            if (r7 != r6) goto L69
            r7 = 48000(0xbb80, float:6.7262E-41)
        L69:
            int r8 = defpackage.khe.a
            r5 = 29
            if (r8 < r5) goto L74
            int r7 = defpackage.kpf.a(r0, r7, r9)
            goto L8a
        L74:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r1.getOrDefault(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r7.getClass()
            int r7 = r7.intValue()
        L8a:
            int r8 = defpackage.khe.a
            r9 = 28
            if (r8 > r9) goto L9e
            if (r7 != r2) goto L93
            goto L9f
        L93:
            r9 = 3
            if (r7 == r9) goto L9c
            r9 = 4
            if (r7 == r9) goto L9c
            r9 = 5
            if (r7 != r9) goto L9e
        L9c:
            r3 = r4
            goto L9f
        L9e:
            r3 = r7
        L9f:
            r7 = 26
            if (r8 > r7) goto Lb1
            java.lang.String r7 = "fugu"
            java.lang.String r8 = defpackage.khe.b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lb1
            r7 = 1
            if (r3 != r7) goto Lb1
            r3 = 2
        Lb1:
            int r7 = defpackage.khe.v(r3)
            if (r7 == 0) goto Lc4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            android.util.Pair r7 = android.util.Pair.create(r8, r7)
            return r7
        Lc4:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npf.a(l6a, waf):android.util.Pair");
    }

    public final boolean c(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npf) && Arrays.equals(this.a, ((npf) obj).a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
