package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.km5;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int i = SnapshotStateObserver.k;
    private final SnapshotStateObserver a;
    private final ss2 b = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.h1(layoutNode, false, false, 3, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 c = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.l1(layoutNode, false, false, 3, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 d = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                layoutNode.E0();
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 e = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.j1(layoutNode, false, 1, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 f = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.j1(layoutNode, false, 1, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 g = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.f1(layoutNode, false, 1, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };
    private final ss2 h = new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void b(LayoutNode layoutNode) {
            if (layoutNode.M0()) {
                LayoutNode.f1(layoutNode, false, 1, null);
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LayoutNode) obj);
            return ww8.a;
        }
    };

    public OwnerSnapshotObserver(ss2 ss2Var) {
        this.a = new SnapshotStateObserver(ss2Var);
    }

    public static /* synthetic */ void d(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, qs2 qs2Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.c(layoutNode, z, qs2Var);
    }

    public static /* synthetic */ void f(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, qs2 qs2Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.e(layoutNode, z, qs2Var);
    }

    public static /* synthetic */ void h(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, qs2 qs2Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.g(layoutNode, z, qs2Var);
    }

    public final void a(Object obj) {
        this.a.k(obj);
    }

    public final void b() {
        this.a.l(new ss2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((km5) obj).M0());
            }
        });
    }

    public final void c(LayoutNode layoutNode, boolean z, qs2 qs2Var) {
        if (!z || layoutNode.Y() == null) {
            i(layoutNode, this.f, qs2Var);
        } else {
            i(layoutNode, this.g, qs2Var);
        }
    }

    public final void e(LayoutNode layoutNode, boolean z, qs2 qs2Var) {
        if (!z || layoutNode.Y() == null) {
            i(layoutNode, this.e, qs2Var);
        } else {
            i(layoutNode, this.h, qs2Var);
        }
    }

    public final void g(LayoutNode layoutNode, boolean z, qs2 qs2Var) {
        if (!z || layoutNode.Y() == null) {
            i(layoutNode, this.c, qs2Var);
        } else {
            i(layoutNode, this.b, qs2Var);
        }
    }

    public final void i(km5 km5Var, ss2 ss2Var, qs2 qs2Var) {
        this.a.o(km5Var, ss2Var, qs2Var);
    }

    public final void j(LayoutNode layoutNode, qs2 qs2Var) {
        i(layoutNode, this.d, qs2Var);
    }

    public final void k() {
        this.a.s();
    }

    public final void l() {
        this.a.t();
        this.a.j();
    }
}
