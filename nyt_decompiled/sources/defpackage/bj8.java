package defpackage;

/* loaded from: classes.dex */
public final class bj8 {
    private final aj8 a;
    private cz3 b;
    private cz3 c;

    public bj8(aj8 aj8Var) {
        this.a = aj8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(long r5) {
        /*
            r4 = this;
            cz3 r0 = r4.b
            if (r0 == 0) goto L1e
            boolean r1 = r0.m()
            if (r1 == 0) goto L16
            cz3 r4 = r4.c
            r1 = 0
            if (r4 == 0) goto L1c
            r2 = 0
            r3 = 2
            kt6 r1 = defpackage.cz3.C(r4, r0, r2, r3, r1)
            goto L1c
        L16:
            kt6$a r4 = defpackage.kt6.e
            kt6 r1 = r4.a()
        L1c:
            if (r1 != 0) goto L24
        L1e:
            kt6$a r4 = defpackage.kt6.e
            kt6 r1 = r4.a()
        L24:
            long r4 = defpackage.cj8.a(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj8.a(long):long");
    }

    public static /* synthetic */ int e(bj8 bj8Var, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return bj8Var.d(j, z);
    }

    public final cz3 b() {
        return this.c;
    }

    public final cz3 c() {
        return this.b;
    }

    public final int d(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.x(j(j));
    }

    public final aj8 f() {
        return this.a;
    }

    public final boolean g(long j) {
        long j2 = j(a(j));
        int r = this.a.r(fd5.p(j2));
        return fd5.o(j2) >= this.a.s(r) && fd5.o(j2) <= this.a.t(r);
    }

    public final void h(cz3 cz3Var) {
        this.c = cz3Var;
    }

    public final void i(cz3 cz3Var) {
        this.b = cz3Var;
    }

    public final long j(long j) {
        cz3 cz3Var;
        cz3 cz3Var2 = this.b;
        if (cz3Var2 != null) {
            if (!cz3Var2.m()) {
                cz3Var2 = null;
            }
            if (cz3Var2 != null && (cz3Var = this.c) != null) {
                cz3 cz3Var3 = cz3Var.m() ? cz3Var : null;
                if (cz3Var3 != null) {
                    return cz3Var2.y(cz3Var3, j);
                }
            }
        }
        return j;
    }

    public final long k(long j) {
        cz3 cz3Var;
        cz3 cz3Var2 = this.b;
        if (cz3Var2 != null) {
            if (!cz3Var2.m()) {
                cz3Var2 = null;
            }
            if (cz3Var2 != null && (cz3Var = this.c) != null) {
                cz3 cz3Var3 = cz3Var.m() ? cz3Var : null;
                if (cz3Var3 != null) {
                    return cz3Var3.y(cz3Var2, j);
                }
            }
        }
        return j;
    }
}
