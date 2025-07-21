package androidx.compose.runtime.snapshots;

import defpackage.ss2;
import defpackage.vw7;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class GlobalSnapshot extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GlobalSnapshot(int r4, androidx.compose.runtime.snapshots.SnapshotIdSet r5) {
        /*
            r3 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.I()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.h()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = kotlin.collections.i.K0(r1)     // Catch: java.lang.Throwable -> L17
            ss2 r2 = (defpackage.ss2) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r2 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L1f
        L19:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L1f:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @Override // androidx.compose.runtime.snapshots.a
    public f C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.a
    public a P(final ss2 ss2Var, final ss2 ss2Var2) {
        e b0;
        b0 = SnapshotKt.b0(new ss2() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(SnapshotIdSet snapshotIdSet) {
                int i;
                synchronized (SnapshotKt.I()) {
                    i = SnapshotKt.e;
                    SnapshotKt.e = i + 1;
                }
                return new a(i, snapshotIdSet, ss2.this, ss2Var2);
            }
        });
        return (a) b0;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Void m(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void n(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void d() {
        synchronized (SnapshotKt.I()) {
            q();
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void o() {
        SnapshotKt.B();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public e x(final ss2 ss2Var) {
        e b0;
        b0 = SnapshotKt.b0(new ss2() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(SnapshotIdSet snapshotIdSet) {
                int i;
                synchronized (SnapshotKt.I()) {
                    i = SnapshotKt.e;
                    SnapshotKt.e = i + 1;
                }
                return new d(i, snapshotIdSet, ss2.this);
            }
        });
        return b0;
    }
}
