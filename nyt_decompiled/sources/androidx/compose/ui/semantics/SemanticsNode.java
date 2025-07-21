package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.a85;
import defpackage.bj7;
import defpackage.cz3;
import defpackage.ej7;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fj7;
import defpackage.gj7;
import defpackage.hn3;
import defpackage.jj7;
import defpackage.kt6;
import defpackage.kz3;
import defpackage.lj7;
import defpackage.n27;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.vy4;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class SemanticsNode {
    private final Modifier.c a;
    private final boolean b;
    private final LayoutNode c;
    private final bj7 d;
    private boolean e;
    private SemanticsNode f;
    private final int g;

    public static final class a extends Modifier.c implements ej7 {
        final /* synthetic */ ss2 n;

        a(ss2 ss2Var) {
            this.n = ss2Var;
        }

        @Override // defpackage.ej7
        public void u0(lj7 lj7Var) {
            this.n.invoke(lj7Var);
        }
    }

    public SemanticsNode(Modifier.c cVar, boolean z, LayoutNode layoutNode, bj7 bj7Var) {
        this.a = cVar;
        this.b = z;
        this.c = layoutNode;
        this.d = bj7Var;
        this.g = layoutNode.m0();
    }

    private final void A(bj7 bj7Var) {
        if (this.d.q()) {
            return;
        }
        List C = C(this, false, 1, null);
        int size = C.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) C.get(i);
            if (!semanticsNode.x()) {
                bj7Var.u(semanticsNode.d);
                semanticsNode.A(bj7Var);
            }
        }
    }

    public static /* synthetic */ List C(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.B(z);
    }

    private final void b(List list) {
        final n27 h;
        h = gj7.h(this);
        if (h != null && this.d.t() && !list.isEmpty()) {
            list.add(c(h, new ss2() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                public final void b(lj7 lj7Var) {
                    jj7.V(lj7Var, n27.this.n());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((lj7) obj);
                    return ww8.a;
                }
            }));
        }
        bj7 bj7Var = this.d;
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (bj7Var.f(semanticsProperties.c()) && !list.isEmpty() && this.d.t()) {
            List list2 = (List) SemanticsConfigurationKt.a(this.d, semanticsProperties.c());
            final String str = list2 != null ? (String) i.m0(list2) : null;
            if (str != null) {
                list.add(0, c(null, new ss2() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        jj7.O(lj7Var, str);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                }));
            }
        }
    }

    private final SemanticsNode c(n27 n27Var, ss2 ss2Var) {
        bj7 bj7Var = new bj7();
        bj7Var.w(false);
        bj7Var.v(false);
        ss2Var.invoke(bj7Var);
        SemanticsNode semanticsNode = new SemanticsNode(new a(ss2Var), false, new LayoutNode(true, n27Var != null ? gj7.i(this) : gj7.e(this)), bj7Var);
        semanticsNode.e = true;
        semanticsNode.f = this;
        return semanticsNode;
    }

    private final void d(LayoutNode layoutNode, List list) {
        vy4 r0 = layoutNode.r0();
        int q = r0.q();
        if (q > 0) {
            Object[] p = r0.p();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) p[i];
                if (layoutNode2.G0()) {
                    if (layoutNode2.h0().q(a85.a(8))) {
                        list.add(gj7.a(layoutNode2, this.b));
                    } else {
                        d(layoutNode2, list);
                    }
                }
                i++;
            } while (i < q);
        }
    }

    private final List f(List list) {
        List C = C(this, false, 1, null);
        int size = C.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) C.get(i);
            if (semanticsNode.x()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.d.q()) {
                semanticsNode.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ List g(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.f(list);
    }

    private final List l(boolean z, boolean z2) {
        return (z || !this.d.q()) ? x() ? g(this, null, 1, null) : B(z2) : i.l();
    }

    private final boolean x() {
        return this.b && this.d.t();
    }

    public final List B(boolean z) {
        if (this.e) {
            return i.l();
        }
        ArrayList arrayList = new ArrayList();
        d(this.c, arrayList);
        if (z) {
            b(arrayList);
        }
        return arrayList;
    }

    public final SemanticsNode a() {
        return new SemanticsNode(this.a, true, this.c, this.d);
    }

    public final NodeCoordinator e() {
        if (this.e) {
            SemanticsNode q = q();
            if (q != null) {
                return q.e();
            }
            return null;
        }
        ql1 g = gj7.g(this.c);
        if (g == null) {
            g = this.a;
        }
        return rl1.h(g, a85.a(8));
    }

    public final kt6 h() {
        cz3 b2;
        SemanticsNode q = q();
        if (q == null) {
            return kt6.e.a();
        }
        NodeCoordinator e = e();
        if (e != null) {
            if (!e.m()) {
                e = null;
            }
            if (e != null && (b2 = e.b2()) != null) {
                return cz3.C(rl1.h(q.a, a85.a(8)), b2, false, 2, null);
            }
        }
        return kt6.e.a();
    }

    public final kt6 i() {
        kt6 b;
        NodeCoordinator e = e();
        if (e != null) {
            if (!e.m()) {
                e = null;
            }
            if (e != null && (b = ez3.b(e)) != null) {
                return b;
            }
        }
        return kt6.e.a();
    }

    public final kt6 j() {
        kt6 c;
        NodeCoordinator e = e();
        if (e != null) {
            if (!e.m()) {
                e = null;
            }
            if (e != null && (c = ez3.c(e)) != null) {
                return c;
            }
        }
        return kt6.e.a();
    }

    public final List k() {
        return l(!this.b, false);
    }

    public final bj7 m() {
        if (!x()) {
            return this.d;
        }
        bj7 j = this.d.j();
        A(j);
        return j;
    }

    public final int n() {
        return this.g;
    }

    public final kz3 o() {
        return this.c;
    }

    public final LayoutNode p() {
        return this.c;
    }

    public final SemanticsNode q() {
        SemanticsNode semanticsNode = this.f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode f = this.b ? gj7.f(this.c, new ss2() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(LayoutNode layoutNode) {
                bj7 G = layoutNode.G();
                boolean z = false;
                if (G != null && G.t()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) : null;
        if (f == null) {
            f = gj7.f(this.c, new ss2() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.h0().q(a85.a(8)));
                }
            });
        }
        if (f == null) {
            return null;
        }
        return gj7.a(f, this.b);
    }

    public final long r() {
        NodeCoordinator e = e();
        if (e != null) {
            if (!e.m()) {
                e = null;
            }
            if (e != null) {
                return ez3.e(e);
            }
        }
        return fd5.b.c();
    }

    public final List s() {
        return l(false, true);
    }

    public final long t() {
        NodeCoordinator e = e();
        return e != null ? e.a() : hn3.b.a();
    }

    public final kt6 u() {
        ql1 ql1Var;
        if (this.d.t()) {
            ql1Var = gj7.g(this.c);
            if (ql1Var == null) {
                ql1Var = this.a;
            }
        } else {
            ql1Var = this.a;
        }
        return fj7.c(ql1Var.c0(), fj7.a(this.d));
    }

    public final bj7 v() {
        return this.d;
    }

    public final boolean w() {
        return this.e;
    }

    public final boolean y() {
        NodeCoordinator e = e();
        if (e != null) {
            return e.x2();
        }
        return false;
    }

    public final boolean z() {
        return !this.e && s().isEmpty() && gj7.f(this.c, new ss2() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(LayoutNode layoutNode) {
                bj7 G = layoutNode.G();
                boolean z = false;
                if (G != null && G.t()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) == null;
    }
}
