package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.w0;

/* loaded from: classes2.dex */
public final class rt7 extends g2 {
    private static final Object w = new Object();
    private static final w0 x = new w0.c().d("SinglePeriodTimeline").g(Uri.EMPTY).a();
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean r;
    private final Object s;
    private final w0 t;
    private final w0.g u;

    public rt7(long j, boolean z, boolean z2, boolean z3, Object obj, w0 w0Var) {
        this(j, j, 0L, 0L, z, z2, z3, obj, w0Var);
    }

    @Override // com.google.android.exoplayer2.g2
    public int g(Object obj) {
        return w.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.g2
    public g2.b l(int i, g2.b bVar, boolean z) {
        ur.c(i, 0, 1);
        return bVar.x(null, z ? w : null, 0, this.i, -this.k);
    }

    @Override // com.google.android.exoplayer2.g2
    public int n() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.g2
    public Object r(int i) {
        ur.c(i, 0, 1);
        return w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // com.google.android.exoplayer2.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.g2.d t(int r25, com.google.android.exoplayer2.g2.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            defpackage.ur.c(r3, r1, r2)
            long r1 = r0.l
            boolean r14 = r0.n
            if (r14 == 0) goto L2e
            boolean r3 = r0.r
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.g2.d.u
            com.google.android.exoplayer2.w0 r5 = r0.t
            java.lang.Object r6 = r0.s
            long r7 = r0.f
            long r9 = r0.g
            long r11 = r0.h
            boolean r13 = r0.m
            com.google.android.exoplayer2.w0$g r15 = r0.u
            long r1 = r0.j
            r18 = r1
            r21 = 0
            long r0 = r0.k
            r22 = r0
            r20 = 0
            r3 = r26
            com.google.android.exoplayer2.g2$d r0 = r3.j(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt7.t(int, com.google.android.exoplayer2.g2$d, long):com.google.android.exoplayer2.g2$d");
    }

    @Override // com.google.android.exoplayer2.g2
    public int u() {
        return 1;
    }

    public rt7(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, w0 w0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, w0Var, z3 ? w0Var.d : null);
    }

    public rt7(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, w0 w0Var, w0.g gVar) {
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = j7;
        this.m = z;
        this.n = z2;
        this.r = z3;
        this.s = obj;
        this.t = (w0) ur.e(w0Var);
        this.u = gVar;
    }
}
