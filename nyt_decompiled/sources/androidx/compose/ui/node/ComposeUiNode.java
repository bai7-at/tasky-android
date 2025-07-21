package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.et0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;

/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion F = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();
        private static final qs2 b = LayoutNode.j0.a();
        private static final qs2 c = new qs2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LayoutNode mo865invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final gt2 d = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            public final void b(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.k(modifier);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (Modifier) obj2);
                return ww8.a;
            }
        };
        private static final gt2 e = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            public final void b(ComposeUiNode composeUiNode, fm1 fm1Var) {
                composeUiNode.h(fm1Var);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (fm1) obj2);
                return ww8.a;
            }
        };
        private static final gt2 f = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            public final void b(ComposeUiNode composeUiNode, et0 et0Var) {
                composeUiNode.m(et0Var);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (et0) obj2);
                return ww8.a;
            }
        };
        private static final gt2 g = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            public final void b(ComposeUiNode composeUiNode, rg4 rg4Var) {
                composeUiNode.j(rg4Var);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (rg4) obj2);
                return ww8.a;
            }
        };
        private static final gt2 h = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            public final void b(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.a(layoutDirection);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (LayoutDirection) obj2);
                return ww8.a;
            }
        };
        private static final gt2 i = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            public final void b(ComposeUiNode composeUiNode, r99 r99Var) {
                composeUiNode.n(r99Var);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, (r99) obj2);
                return ww8.a;
            }
        };
        private static final gt2 j = new gt2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            public final void b(ComposeUiNode composeUiNode, int i2) {
                composeUiNode.c(i2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ComposeUiNode) obj, ((Number) obj2).intValue());
                return ww8.a;
            }
        };

        private Companion() {
        }

        public final qs2 a() {
            return b;
        }

        public final gt2 b() {
            return j;
        }

        public final gt2 c() {
            return e;
        }

        public final gt2 d() {
            return h;
        }

        public final gt2 e() {
            return g;
        }

        public final gt2 f() {
            return d;
        }

        public final gt2 g() {
            return f;
        }

        public final gt2 h() {
            return i;
        }
    }

    void a(LayoutDirection layoutDirection);

    void c(int i);

    void h(fm1 fm1Var);

    void j(rg4 rg4Var);

    void k(Modifier modifier);

    void m(et0 et0Var);

    void n(r99 r99Var);
}
