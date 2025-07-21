package defpackage;

/* loaded from: classes5.dex */
public final class uq5 implements px7 {
    private final sd0 a;
    private final ad0 b;
    private ji7 c;
    private int d;
    private boolean e;
    private long f;

    public uq5(sd0 sd0Var) {
        zq3.h(sd0Var, "upstream");
        this.a = sd0Var;
        ad0 g = sd0Var.g();
        this.b = g;
        ji7 ji7Var = g.a;
        this.c = ji7Var;
        this.d = ji7Var != null ? ji7Var.b : -1;
    }

    @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    public void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r4.b) goto L15;
     */
    @Override // defpackage.px7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(defpackage.ad0 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            defpackage.zq3.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L75
            boolean r3 = r8.e
            if (r3 != 0) goto L6d
            ji7 r3 = r8.c
            if (r3 == 0) goto L2b
            ad0 r4 = r8.b
            ji7 r4 = r4.a
            if (r3 != r4) goto L23
            int r3 = r8.d
            defpackage.zq3.e(r4)
            int r4 = r4.b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            r8.<init>(r9)
            throw r8
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            sd0 r0 = r8.a
            long r1 = r8.f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r8 = -1
            return r8
        L3e:
            ji7 r0 = r8.c
            if (r0 != 0) goto L51
            ad0 r0 = r8.b
            ji7 r0 = r0.a
            if (r0 == 0) goto L51
            r8.c = r0
            defpackage.zq3.e(r0)
            int r0 = r0.b
            r8.d = r0
        L51:
            ad0 r0 = r8.b
            long r0 = r0.h1()
            long r2 = r8.f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            ad0 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r6 = r10
            r2.i(r3, r4, r6)
            long r0 = r8.f
            long r0 = r0 + r10
            r8.f = r0
            return r10
        L6d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        L75:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "byteCount < 0: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq5.read(ad0, long):long");
    }

    @Override // defpackage.px7, defpackage.yt7
    public pm8 timeout() {
        return this.a.timeout();
    }
}
