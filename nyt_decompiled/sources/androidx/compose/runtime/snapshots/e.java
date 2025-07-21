package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.e;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.wc5;
import defpackage.ww7;
import defpackage.ww8;
import defpackage.y08;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class e {
    public static final a e = new a(null);
    public static final int f = 8;
    private SnapshotIdSet a;
    private int b;
    private boolean c;
    private int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(gt2 gt2Var) {
            List list;
            synchronized (SnapshotKt.I()) {
                list = SnapshotKt.h;
                SnapshotKt.h = kotlin.collections.i.E0(list, gt2Var);
                ww8 ww8Var = ww8.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(ss2 ss2Var) {
            List list;
            synchronized (SnapshotKt.I()) {
                list = SnapshotKt.i;
                SnapshotKt.i = kotlin.collections.i.E0(list, ss2Var);
                ww8 ww8Var = ww8.a;
            }
            SnapshotKt.B();
        }

        public final e c() {
            ww7 ww7Var;
            ww7Var = SnapshotKt.b;
            return SnapshotKt.E((e) ww7Var.a(), null, false, 6, null);
        }

        public final e d() {
            return SnapshotKt.H();
        }

        public final void e() {
            SnapshotKt.H().o();
        }

        public final Object f(ss2 ss2Var, ss2 ss2Var2, qs2 qs2Var) {
            ww7 ww7Var;
            e sVar;
            if (ss2Var == null && ss2Var2 == null) {
                return qs2Var.mo865invoke();
            }
            ww7Var = SnapshotKt.b;
            e eVar = (e) ww7Var.a();
            if (eVar == null || (eVar instanceof androidx.compose.runtime.snapshots.a)) {
                sVar = new s(eVar instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) eVar : null, ss2Var, ss2Var2, true, false);
            } else {
                if (ss2Var == null) {
                    return qs2Var.mo865invoke();
                }
                sVar = eVar.x(ss2Var);
            }
            try {
                e l = sVar.l();
                try {
                    return qs2Var.mo865invoke();
                } finally {
                    sVar.s(l);
                }
            } finally {
                sVar.d();
            }
        }

        public final wc5 g(final gt2 gt2Var) {
            ss2 ss2Var;
            List list;
            ss2Var = SnapshotKt.a;
            SnapshotKt.A(ss2Var);
            synchronized (SnapshotKt.I()) {
                list = SnapshotKt.h;
                SnapshotKt.h = kotlin.collections.i.G0(list, gt2Var);
                ww8 ww8Var = ww8.a;
            }
            return new wc5() { // from class: kw7
                @Override // defpackage.wc5
                public final void dispose() {
                    e.a.h(gt2.this);
                }
            };
        }

        public final wc5 i(final ss2 ss2Var) {
            List list;
            synchronized (SnapshotKt.I()) {
                list = SnapshotKt.i;
                SnapshotKt.i = kotlin.collections.i.G0(list, ss2Var);
                ww8 ww8Var = ww8.a;
            }
            SnapshotKt.B();
            return new wc5() { // from class: lw7
                @Override // defpackage.wc5
                public final void dispose() {
                    e.a.j(ss2.this);
                }
            };
        }

        public final void k() {
            AtomicReference atomicReference;
            boolean z;
            synchronized (SnapshotKt.I()) {
                atomicReference = SnapshotKt.j;
                IdentityArraySet E = ((GlobalSnapshot) atomicReference.get()).E();
                z = false;
                if (E != null) {
                    if (E.n()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.B();
            }
        }

        public final androidx.compose.runtime.snapshots.a l(ss2 ss2Var, ss2 ss2Var2) {
            androidx.compose.runtime.snapshots.a P;
            e H = SnapshotKt.H();
            androidx.compose.runtime.snapshots.a aVar = H instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) H : null;
            if (aVar == null || (P = aVar.P(ss2Var, ss2Var2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return P;
        }

        public final e m(ss2 ss2Var) {
            return SnapshotKt.H().x(ss2Var);
        }

        private a() {
        }
    }

    public /* synthetic */ e(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    public final void b() {
        synchronized (SnapshotKt.I()) {
            c();
            r();
            ww8 ww8Var = ww8.a;
        }
    }

    public void c() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.d;
        SnapshotKt.d = snapshotIdSet.o(f());
    }

    public void d() {
        this.c = true;
        synchronized (SnapshotKt.I()) {
            q();
            ww8 ww8Var = ww8.a;
        }
    }

    public final boolean e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public SnapshotIdSet g() {
        return this.a;
    }

    public abstract ss2 h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract ss2 k();

    public e l() {
        ww7 ww7Var;
        ww7 ww7Var2;
        ww7Var = SnapshotKt.b;
        e eVar = (e) ww7Var.a();
        ww7Var2 = SnapshotKt.b;
        ww7Var2.b(this);
        return eVar;
    }

    public abstract void m(e eVar);

    public abstract void n(e eVar);

    public abstract void o();

    public abstract void p(y08 y08Var);

    public final void q() {
        int i = this.d;
        if (i >= 0) {
            SnapshotKt.Y(i);
            this.d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(e eVar) {
        ww7 ww7Var;
        ww7Var = SnapshotKt.b;
        ww7Var.b(eVar);
    }

    public final void t(boolean z) {
        this.c = z;
    }

    public void u(int i) {
        this.b = i;
    }

    public void v(SnapshotIdSet snapshotIdSet) {
        this.a = snapshotIdSet;
    }

    public void w(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract e x(ss2 ss2Var);

    public final int y() {
        int i = this.d;
        this.d = -1;
        return i;
    }

    public final void z() {
        if (this.c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    private e(int i, SnapshotIdSet snapshotIdSet) {
        this.a = snapshotIdSet;
        this.b = i;
        this.d = i != 0 ? SnapshotKt.c0(i, g()) : -1;
    }
}
