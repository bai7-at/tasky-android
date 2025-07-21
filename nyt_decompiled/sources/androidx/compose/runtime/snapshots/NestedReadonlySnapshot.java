package androidx.compose.runtime.snapshots;

import defpackage.ss2;
import defpackage.vw7;
import defpackage.ww8;
import defpackage.y08;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends e {
    private final e g;
    private final ss2 h;

    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, final ss2 ss2Var, e eVar) {
        super(i, snapshotIdSet, null);
        this.g = eVar;
        eVar.m(this);
        if (ss2Var != null) {
            final ss2 h = eVar.h();
            if (h != null) {
                ss2Var = new ss2() { // from class: androidx.compose.runtime.snapshots.NestedReadonlySnapshot$readObserver$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m61invoke(obj);
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m61invoke(Object obj) {
                        ss2.this.invoke(obj);
                        h.invoke(obj);
                    }
                };
            }
        } else {
            ss2Var = eVar.h();
        }
        this.h = ss2Var;
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void m(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void n(e eVar) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void p(y08 y08Var) {
        SnapshotKt.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.e
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public NestedReadonlySnapshot x(ss2 ss2Var) {
        return new NestedReadonlySnapshot(f(), g(), ss2Var, this.g);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.g.f()) {
            b();
        }
        this.g.n(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 h() {
        return this.h;
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
    public void o() {
    }
}
