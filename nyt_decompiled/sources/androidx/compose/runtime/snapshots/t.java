package androidx.compose.runtime.snapshots;

import defpackage.ss2;
import defpackage.vw7;
import defpackage.y08;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class t extends e {
    private final e g;
    private final boolean h;
    private final boolean i;
    private final ss2 j;
    private final ss2 k;
    private final e l;

    public t(e eVar, ss2 ss2Var, boolean z, boolean z2) {
        super(0, SnapshotIdSet.e.a(), null);
        AtomicReference atomicReference;
        ss2 h;
        ss2 K;
        this.g = eVar;
        this.h = z;
        this.i = z2;
        if (eVar == null || (h = eVar.h()) == null) {
            atomicReference = SnapshotKt.j;
            h = ((GlobalSnapshot) atomicReference.get()).h();
        }
        K = SnapshotKt.K(ss2Var, h, z);
        this.j = K;
        this.l = this;
    }

    private final e A() {
        AtomicReference atomicReference;
        e eVar = this.g;
        if (eVar != null) {
            return eVar;
        }
        atomicReference = SnapshotKt.j;
        return (e) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void d() {
        e eVar;
        t(true);
        if (!this.i || (eVar = this.g) == null) {
            return;
        }
        eVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public int f() {
        return A().f();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public SnapshotIdSet g() {
        return A().g();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 h() {
        return this.j;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public boolean i() {
        return A().i();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 k() {
        return this.k;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void o() {
        A().o();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void p(y08 y08Var) {
        A().p(y08Var);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public e x(ss2 ss2Var) {
        e D;
        ss2 L = SnapshotKt.L(ss2Var, h(), false, 4, null);
        if (this.h) {
            return A().x(L);
        }
        D = SnapshotKt.D(A().x(null), L, true);
        return D;
    }
}
