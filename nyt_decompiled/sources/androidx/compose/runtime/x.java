package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.ww8;
import defpackage.z08;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class x extends z08 implements sw7 {
    public static final int $stable = 0;
    private a next;
    private final tw7 policy;

    private static final class a extends androidx.compose.runtime.snapshots.q {
        private Object c;

        public a(Object obj) {
            this.c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(androidx.compose.runtime.snapshots.q qVar) {
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.c = ((a) qVar).c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public androidx.compose.runtime.snapshots.q d() {
            return new a(this.c);
        }

        public final Object i() {
            return this.c;
        }

        public final void j(Object obj) {
            this.c = obj;
        }
    }

    public x(Object obj, tw7 tw7Var) {
        this.policy = tw7Var;
        this.next = new a(obj);
    }

    @Override // defpackage.sw7
    public tw7 c() {
        return this.policy;
    }

    @Override // defpackage.sy4, defpackage.x08
    public Object getValue() {
        return ((a) SnapshotKt.X(this.next, this)).i();
    }

    @Override // defpackage.y08
    public void n(androidx.compose.runtime.snapshots.q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) qVar;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q o() {
        return this.next;
    }

    @Override // defpackage.sy4
    public void setValue(Object obj) {
        androidx.compose.runtime.snapshots.e d;
        a aVar = (a) SnapshotKt.F(this.next);
        if (c().b(aVar.i(), obj)) {
            return;
        }
        a aVar2 = this.next;
        SnapshotKt.J();
        synchronized (SnapshotKt.I()) {
            d = androidx.compose.runtime.snapshots.e.e.d();
            ((a) SnapshotKt.S(aVar2, this, d, aVar)).j(obj);
            ww8 ww8Var = ww8.a;
        }
        SnapshotKt.Q(d, this);
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q t(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) qVar;
        zq3.f(qVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) qVar2;
        zq3.f(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) qVar3;
        if (c().b(aVar2.i(), aVar3.i())) {
            return qVar2;
        }
        Object a2 = c().a(aVar.i(), aVar2.i(), aVar3.i());
        if (a2 == null) {
            return null;
        }
        androidx.compose.runtime.snapshots.q d = aVar3.d();
        zq3.f(d, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((a) d).j(a2);
        return d;
    }

    public String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.F(this.next)).i() + ")@" + hashCode();
    }

    @Override // defpackage.sy4
    public Object y() {
        return getValue();
    }
}
