package defpackage;

/* loaded from: classes3.dex */
public final class uzf extends c3g {
    private final boolean l;
    private final l0c m;
    private final fyb n;
    private qzf o;
    private ozf p;
    private boolean q;
    private boolean r;
    private boolean s;

    public uzf(b0g b0gVar, boolean z) {
        super(b0gVar);
        boolean z2;
        if (z) {
            b0gVar.a();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new l0c();
        this.n = new fyb();
        b0gVar.H();
        this.o = qzf.q(b0gVar.d());
    }

    private final Object L(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.o.h;
        if (obj2 == null || !obj.equals(qzf.i)) {
            return obj;
        }
        obj3 = this.o.h;
        return obj3;
    }

    private final void M(long j) {
        ozf ozfVar = this.p;
        int a = this.o.a(ozfVar.a.a);
        if (a == -1) {
            return;
        }
        qzf qzfVar = this.o;
        fyb fybVar = this.n;
        qzfVar.d(a, fybVar, false);
        long j2 = fybVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ozfVar.m(j);
    }

    @Override // defpackage.c3g
    protected final zzf F(zzf zzfVar) {
        Object obj;
        Object obj2;
        obj = this.o.h;
        Object obj3 = zzfVar.a;
        if (obj != null) {
            obj2 = this.o.h;
            if (obj2.equals(obj3)) {
                obj3 = qzf.i;
            }
        }
        return zzfVar.a(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // defpackage.c3g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void G(defpackage.n1c r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            r1 = 0
            if (r0 == 0) goto L1a
            qzf r0 = r14.o
            qzf r15 = r0.p(r15)
            r14.o = r15
            ozf r15 = r14.p
            if (r15 == 0) goto L9b
            long r2 = r15.g()
            r14.M(r2)
            goto L9b
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.s
            if (r0 == 0) goto L2b
            qzf r0 = r14.o
            qzf r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = defpackage.l0c.p
            java.lang.Object r2 = defpackage.qzf.i
            qzf r15 = defpackage.qzf.r(r15, r0, r2)
        L33:
            r14.o = r15
            goto L9b
        L36:
            l0c r0 = r14.m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            l0c r0 = r14.m
            java.lang.Object r0 = r0.a
            ozf r5 = r14.p
            if (r5 == 0) goto L62
            long r6 = r5.h()
            qzf r8 = r14.o
            fyb r9 = r14.n
            zzf r5 = r5.a
            java.lang.Object r5 = r5.a
            r8.n(r5, r9)
            qzf r5 = r14.o
            l0c r8 = r14.m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            l0c r9 = r14.m
            fyb r10 = r14.n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.s
            if (r2 == 0) goto L82
            qzf r0 = r14.o
            qzf r15 = r0.p(r15)
            goto L86
        L82:
            qzf r15 = defpackage.qzf.r(r15, r0, r3)
        L86:
            r14.o = r15
            ozf r15 = r14.p
            if (r15 == 0) goto L9b
            r14.M(r4)
            zzf r15 = r15.a
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.L(r0)
            zzf r1 = r15.a(r0)
        L9b:
            r15 = 1
            r14.s = r15
            r14.r = r15
            qzf r15 = r14.o
            r14.w(r15)
            if (r1 == 0) goto Laf
            ozf r14 = r14.p
            r14.getClass()
            r14.k(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzf.G(n1c):void");
    }

    @Override // defpackage.c3g
    public final void I() {
        if (this.l) {
            return;
        }
        this.q = true;
        B(null, this.k);
    }

    public final n1c J() {
        return this.o;
    }

    @Override // defpackage.b0g
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final ozf l(zzf zzfVar, s7g s7gVar, long j) {
        ozf ozfVar = new ozf(zzfVar, s7gVar, j);
        ozfVar.o(this.k);
        if (this.r) {
            ozfVar.k(zzfVar.a(L(zzfVar.a)));
        } else {
            this.p = ozfVar;
            if (!this.q) {
                this.q = true;
                B(null, this.k);
            }
        }
        return ozfVar;
    }

    @Override // defpackage.nyf, defpackage.b0g
    public final void h(cza czaVar) {
        if (this.s) {
            this.o = this.o.p(new x2g(this.o.f, czaVar));
        } else {
            this.o = qzf.q(czaVar);
        }
        this.k.h(czaVar);
    }

    @Override // defpackage.c3g, defpackage.b0g
    public final void j(xzf xzfVar) {
        ((ozf) xzfVar).n();
        if (xzfVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.dzf, defpackage.nyf
    public final void x() {
        this.r = false;
        this.q = false;
        super.x();
    }

    @Override // defpackage.dzf, defpackage.b0g
    public final void z() {
    }
}
