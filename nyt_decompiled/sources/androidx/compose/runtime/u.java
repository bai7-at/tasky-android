package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.ww8;
import defpackage.yx4;
import defpackage.z08;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class u extends z08 implements yx4, sw7 {
    public static final int $stable = 0;
    private a next;

    private static final class a extends androidx.compose.runtime.snapshots.q {
        private float c;

        public a(float f) {
            this.c = f;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(androidx.compose.runtime.snapshots.q qVar) {
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.c = ((a) qVar).c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public androidx.compose.runtime.snapshots.q d() {
            return new a(this.c);
        }

        public final float i() {
            return this.c;
        }

        public final void j(float f) {
            this.c = f;
        }
    }

    public u(float f) {
        this.next = new a(f);
    }

    @Override // defpackage.sy4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Float y() {
        return Float.valueOf(a());
    }

    @Override // defpackage.yx4, defpackage.dl2
    public float a() {
        return ((a) SnapshotKt.X(this.next, this)).i();
    }

    @Override // defpackage.sw7
    public tw7 c() {
        return y.q();
    }

    @Override // defpackage.y08
    public void n(androidx.compose.runtime.snapshots.q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) qVar;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q o() {
        return this.next;
    }

    @Override // defpackage.yx4
    public void r(float f) {
        androidx.compose.runtime.snapshots.e d;
        a aVar = (a) SnapshotKt.F(this.next);
        if (aVar.i() == f) {
            return;
        }
        a aVar2 = this.next;
        SnapshotKt.J();
        synchronized (SnapshotKt.I()) {
            d = androidx.compose.runtime.snapshots.e.e.d();
            ((a) SnapshotKt.S(aVar2, this, d, aVar)).j(f);
            ww8 ww8Var = ww8.a;
        }
        SnapshotKt.Q(d, this);
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q t(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        zq3.f(qVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        zq3.f(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) qVar2).i() == ((a) qVar3).i()) {
            return qVar2;
        }
        return null;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) SnapshotKt.F(this.next)).i() + ")@" + hashCode();
    }
}
