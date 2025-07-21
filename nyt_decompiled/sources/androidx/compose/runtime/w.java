package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import defpackage.hy4;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.ww8;
import defpackage.z08;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class w extends z08 implements hy4, sw7 {
    public static final int $stable = 0;
    private a next;

    private static final class a extends androidx.compose.runtime.snapshots.q {
        private long c;

        public a(long j) {
            this.c = j;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(androidx.compose.runtime.snapshots.q qVar) {
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.c = ((a) qVar).c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public androidx.compose.runtime.snapshots.q d() {
            return new a(this.c);
        }

        public final long i() {
            return this.c;
        }

        public final void j(long j) {
            this.c = j;
        }
    }

    public w(long j) {
        this.next = new a(j);
    }

    @Override // defpackage.sy4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Long y() {
        return Long.valueOf(b());
    }

    @Override // defpackage.hy4, defpackage.ob4
    public long b() {
        return ((a) SnapshotKt.X(this.next, this)).i();
    }

    @Override // defpackage.sw7
    public tw7 c() {
        return y.q();
    }

    @Override // defpackage.y08
    public void n(androidx.compose.runtime.snapshots.q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (a) qVar;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q o() {
        return this.next;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q t(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        zq3.f(qVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        zq3.f(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) qVar2).i() == ((a) qVar3).i()) {
            return qVar2;
        }
        return null;
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) SnapshotKt.F(this.next)).i() + ")@" + hashCode();
    }

    @Override // defpackage.hy4
    public void x(long j) {
        androidx.compose.runtime.snapshots.e d;
        a aVar = (a) SnapshotKt.F(this.next);
        if (aVar.i() != j) {
            a aVar2 = this.next;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = androidx.compose.runtime.snapshots.e.e.d();
                ((a) SnapshotKt.S(aVar2, this, d, aVar)).j(j);
                ww8 ww8Var = ww8.a;
            }
            SnapshotKt.Q(d, this);
        }
    }
}
