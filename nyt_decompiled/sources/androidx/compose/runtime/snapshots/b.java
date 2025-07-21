package androidx.compose.runtime.snapshots;

import defpackage.ss2;

/* loaded from: classes.dex */
public final class b extends a {
    private final a s;
    private boolean t;

    public b(int i, SnapshotIdSet snapshotIdSet, ss2 ss2Var, ss2 ss2Var2, a aVar) {
        super(i, snapshotIdSet, ss2Var, ss2Var2);
        this.s = aVar;
        aVar.m(this);
    }

    private final void S() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.s.n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:11:0x002e, B:13:0x0033, B:16:0x003a, B:21:0x0054, B:23:0x005c, B:24:0x006e, B:26:0x0076, B:27:0x007b, B:32:0x0062, B:33:0x006b), top: B:10:0x002e }] */
    @Override // androidx.compose.runtime.snapshots.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.f C() {
        /*
            r7 = this;
            androidx.compose.runtime.snapshots.a r0 = r7.s
            boolean r0 = r0.D()
            if (r0 != 0) goto Lbf
            androidx.compose.runtime.snapshots.a r0 = r7.s
            boolean r0 = r0.e()
            if (r0 == 0) goto L12
            goto Lbf
        L12:
            androidx.compose.runtime.collection.IdentityArraySet r0 = r7.E()
            int r1 = r7.f()
            r2 = 0
            if (r0 == 0) goto L28
            androidx.compose.runtime.snapshots.a r3 = r7.s
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r3.g()
            java.util.Map r3 = androidx.compose.runtime.snapshots.SnapshotKt.n(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.I()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.y(r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L6b
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L3a
            goto L6b
        L3a:
            androidx.compose.runtime.snapshots.a r5 = r7.s     // Catch: java.lang.Throwable -> L60
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.a r6 = r7.s     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r6.g()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.f r3 = r7.H(r5, r3, r6)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.f$b r5 = androidx.compose.runtime.snapshots.f.b.a     // Catch: java.lang.Throwable -> L60
            boolean r5 = defpackage.zq3.c(r3, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            androidx.compose.runtime.snapshots.a r3 = r7.s     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.collection.IdentityArraySet r3 = r3.E()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            r3.a(r0)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L60:
            r7 = move-exception
            goto Lbd
        L62:
            androidx.compose.runtime.snapshots.a r3 = r7.s     // Catch: java.lang.Throwable -> L60
            r3.O(r0)     // Catch: java.lang.Throwable -> L60
            r7.O(r2)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L6b:
            r7.b()     // Catch: java.lang.Throwable -> L60
        L6e:
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int r0 = r0.f()     // Catch: java.lang.Throwable -> L60
            if (r0 >= r1) goto L7b
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            r0.B()     // Catch: java.lang.Throwable -> L60
        L7b:
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.g()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.o(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r7.F()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.n(r3)     // Catch: java.lang.Throwable -> L60
            r0.v(r2)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            r0.I(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int r1 = r7.y()     // Catch: java.lang.Throwable -> L60
            r0.K(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r7.F()     // Catch: java.lang.Throwable -> L60
            r0.J(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.a r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int[] r1 = r7.G()     // Catch: java.lang.Throwable -> L60
            r0.L(r1)     // Catch: java.lang.Throwable -> L60
            ww8 r0 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            r0 = 1
            r7.N(r0)
            r7.S()
            androidx.compose.runtime.snapshots.f$b r7 = androidx.compose.runtime.snapshots.f.b.a
            return r7
        Lbd:
            monitor-exit(r4)
            throw r7
        Lbf:
            androidx.compose.runtime.snapshots.f$a r0 = new androidx.compose.runtime.snapshots.f$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.b.C():androidx.compose.runtime.snapshots.f");
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        S();
    }
}
