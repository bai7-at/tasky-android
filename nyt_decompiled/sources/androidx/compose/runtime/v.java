package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import defpackage.cy4;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.ww8;
import defpackage.z08;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class v extends z08 implements cy4, sw7 {
    public static final int $stable = 0;
    private a next;

    private static final class a extends androidx.compose.runtime.snapshots.q {
        private int c;

        public a(int i) {
            this.c = i;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(androidx.compose.runtime.snapshots.q qVar) {
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.c = ((a) qVar).c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public androidx.compose.runtime.snapshots.q d() {
            return new a(this.c);
        }

        public final int i() {
            return this.c;
        }

        public final void j(int i) {
            this.c = i;
        }
    }

    public v(int i) {
        this.next = new a(i);
    }

    @Override // defpackage.sy4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Integer y() {
        return Integer.valueOf(d());
    }

    @Override // defpackage.sw7
    public tw7 c() {
        return y.q();
    }

    @Override // defpackage.cy4, defpackage.ln3
    public int d() {
        return ((a) SnapshotKt.X(this.next, this)).i();
    }

    @Override // defpackage.cy4
    public void f(int i) {
        androidx.compose.runtime.snapshots.e d;
        a aVar = (a) SnapshotKt.F(this.next);
        if (aVar.i() != i) {
            a aVar2 = this.next;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = androidx.compose.runtime.snapshots.e.e.d();
                ((a) SnapshotKt.S(aVar2, this, d, aVar)).j(i);
                ww8 ww8Var = ww8.a;
            }
            SnapshotKt.Q(d, this);
        }
    }

    @Override // defpackage.y08
    public void n(androidx.compose.runtime.snapshots.q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (a) qVar;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q o() {
        return this.next;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q t(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        zq3.f(qVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        zq3.f(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) qVar2).i() == ((a) qVar3).i()) {
            return qVar2;
        }
        return null;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) SnapshotKt.F(this.next)).i() + ")@" + hashCode();
    }
}
