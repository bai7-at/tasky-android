package androidx.compose.runtime.snapshots;

import defpackage.ss2;
import defpackage.y08;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class d extends e {
    private final ss2 g;
    private int h;

    public d(int i, SnapshotIdSet snapshotIdSet, ss2 ss2Var) {
        super(i, snapshotIdSet, null);
        this.g = ss2Var;
        this.h = 1;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void d() {
        if (e()) {
            return;
        }
        n(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 h() {
        return this.g;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public boolean i() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 k() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void m(e eVar) {
        this.h++;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void n(e eVar) {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void o() {
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void p(y08 y08Var) {
        SnapshotKt.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public e x(ss2 ss2Var) {
        SnapshotKt.g0(this);
        return new NestedReadonlySnapshot(f(), g(), ss2Var, this);
    }
}
