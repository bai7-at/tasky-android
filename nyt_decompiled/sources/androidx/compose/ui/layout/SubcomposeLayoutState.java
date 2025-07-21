package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.gt2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int f = 8;
    private final m a;
    private LayoutNodeSubcompositionsState b;
    private final gt2 c;
    private final gt2 d;
    private final gt2 e;

    public interface a {
        default int a() {
            return 0;
        }

        default void b(int i, long j) {
        }

        void dispose();
    }

    public SubcomposeLayoutState(m mVar) {
        this.a = mVar;
        this.c = new gt2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            public final void b(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                LayoutNodeSubcompositionsState h;
                LayoutNodeSubcompositionsState h2;
                m mVar2;
                m mVar3;
                SubcomposeLayoutState subcomposeLayoutState2 = SubcomposeLayoutState.this;
                LayoutNodeSubcompositionsState n0 = layoutNode.n0();
                if (n0 == null) {
                    mVar3 = SubcomposeLayoutState.this.a;
                    n0 = new LayoutNodeSubcompositionsState(layoutNode, mVar3);
                    layoutNode.y1(n0);
                }
                subcomposeLayoutState2.b = n0;
                h = SubcomposeLayoutState.this.h();
                h.B();
                h2 = SubcomposeLayoutState.this.h();
                mVar2 = SubcomposeLayoutState.this.a;
                h2.J(mVar2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (SubcomposeLayoutState) obj2);
                return ww8.a;
            }
        };
        this.d = new gt2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            public final void b(LayoutNode layoutNode, androidx.compose.runtime.c cVar) {
                LayoutNodeSubcompositionsState h;
                h = SubcomposeLayoutState.this.h();
                h.I(cVar);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (androidx.compose.runtime.c) obj2);
                return ww8.a;
            }
        };
        this.e = new gt2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            public final void b(LayoutNode layoutNode, gt2 gt2Var) {
                LayoutNodeSubcompositionsState h;
                h = SubcomposeLayoutState.this.h();
                layoutNode.j(h.u(gt2Var));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (gt2) obj2);
                return ww8.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState h() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().z();
    }

    public final gt2 e() {
        return this.d;
    }

    public final gt2 f() {
        return this.e;
    }

    public final gt2 g() {
        return this.c;
    }

    public final a i(Object obj, gt2 gt2Var) {
        return h().G(obj, gt2Var);
    }

    public SubcomposeLayoutState() {
        this(g.a);
    }
}
