package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import defpackage.ss2;
import defpackage.vw7;
import defpackage.y08;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class s extends a {
    private final a s;
    private final boolean t;
    private final boolean u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(androidx.compose.runtime.snapshots.a r3, defpackage.ss2 r4, defpackage.ss2 r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.e
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.a()
            if (r3 == 0) goto Le
            ss2 r1 = r3.h()
            if (r1 != 0) goto L1c
        Le:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            ss2 r1 = r1.h()
        L1c:
            ss2 r4 = androidx.compose.runtime.snapshots.SnapshotKt.l(r4, r1, r6)
            if (r3 == 0) goto L28
            ss2 r1 = r3.k()
            if (r1 != 0) goto L36
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            ss2 r1 = r1.k()
        L36:
            ss2 r5 = androidx.compose.runtime.snapshots.SnapshotKt.m(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.s = r3
            r2.t = r6
            r2.u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.s.<init>(androidx.compose.runtime.snapshots.a, ss2, ss2, boolean, boolean):void");
    }

    private final a S() {
        AtomicReference atomicReference;
        a aVar = this.s;
        if (aVar != null) {
            return aVar;
        }
        atomicReference = SnapshotKt.j;
        return (a) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public f C() {
        return S().C();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public IdentityArraySet E() {
        return S().E();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public void O(IdentityArraySet identityArraySet) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public a P(ss2 ss2Var, ss2 ss2Var2) {
        ss2 M;
        ss2 L = SnapshotKt.L(ss2Var, h(), false, 4, null);
        M = SnapshotKt.M(ss2Var2, k());
        return !this.t ? new s(S().P(null, M), L, M, false, true) : S().P(L, M);
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void d() {
        a aVar;
        t(true);
        if (!this.u || (aVar = this.s) == null) {
            return;
        }
        aVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public int f() {
        return S().f();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public SnapshotIdSet g() {
        return S().g();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public boolean i() {
        return S().i();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public int j() {
        return S().j();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void o() {
        S().o();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void p(y08 y08Var) {
        S().p(y08Var);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void u(int i) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void v(SnapshotIdSet snapshotIdSet) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public void w(int i) {
        S().w(i);
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.e
    public e x(ss2 ss2Var) {
        e D;
        ss2 L = SnapshotKt.L(ss2Var, h(), false, 4, null);
        if (this.t) {
            return S().x(L);
        }
        D = SnapshotKt.D(S().x(null), L, true);
        return D;
    }
}
