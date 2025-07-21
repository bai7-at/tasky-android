package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import defpackage.a85;
import defpackage.an3;
import defpackage.b80;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class OneDimensionalFocusSearchKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, ss2 ss2Var) {
        FocusStateImpl l2 = focusTargetNode.l2();
        int[] iArr = a.a;
        int i = iArr[l2.ordinal()];
        if (i == 1) {
            FocusTargetNode f = h.f(focusTargetNode);
            if (f == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i2 = iArr[f.l2().ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return d(focusTargetNode, f, d.b.f(), ss2Var);
                }
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!b(f, ss2Var) && !d(focusTargetNode, f, d.b.f(), ss2Var) && (!f.j2().i() || !((Boolean) ss2Var.invoke(f)).booleanValue())) {
                return false;
            }
        } else {
            if (i == 2 || i == 3) {
                return g(focusTargetNode, ss2Var);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!g(focusTargetNode, ss2Var)) {
                if (!(focusTargetNode.j2().i() ? ((Boolean) ss2Var.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, ss2 ss2Var) {
        int i = a.a[focusTargetNode.l2().ordinal()];
        if (i == 1) {
            FocusTargetNode f = h.f(focusTargetNode);
            if (f != null) {
                return c(f, ss2Var) || d(focusTargetNode, f, d.b.e(), ss2Var);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i == 2 || i == 3) {
            return h(focusTargetNode, ss2Var);
        }
        if (i == 4) {
            return focusTargetNode.j2().i() ? ((Boolean) ss2Var.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, ss2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean d(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final ss2 ss2Var) {
        if (i(focusTargetNode, focusTargetNode2, i, ss2Var)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new ss2() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(b80.a aVar) {
                boolean i2;
                i2 = OneDimensionalFocusSearchKt.i(FocusTargetNode.this, focusTargetNode2, i, ss2Var);
                Boolean valueOf = Boolean.valueOf(i2);
                if (i2 || !aVar.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        Modifier.c cVar;
        k h0;
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = focusTargetNode.c0().I1();
        LayoutNode k = rl1.k(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (k == null) {
                break;
            }
            if ((k.h0().k().B1() & a2) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a2) != 0) {
                        Modifier.c cVar2 = I1;
                        vy4 vy4Var = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
                                cVar = cVar2;
                                break loop0;
                            }
                            if ((cVar2.G1() & a2) != 0 && (cVar2 instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar2).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar2 = f2;
                                        } else {
                                            if (vy4Var == null) {
                                                vy4Var = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar2 != null) {
                                                vy4Var.b(cVar2);
                                                cVar2 = null;
                                            }
                                            vy4Var.b(f2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar2 = rl1.g(vy4Var);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i, ss2 ss2Var) {
        d.a aVar = d.b;
        if (d.l(i, aVar.e())) {
            return c(focusTargetNode, ss2Var);
        }
        if (d.l(i, aVar.f())) {
            return b(focusTargetNode, ss2Var);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, ss2 ss2Var) {
        vy4 vy4Var = new vy4(new FocusTargetNode[16], 0);
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var2 = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = focusTargetNode.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var2, focusTargetNode.c0());
        } else {
            vy4Var2.b(C1);
        }
        while (vy4Var2.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
            if ((cVar.B1() & a2) == 0) {
                rl1.c(vy4Var2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a2) != 0) {
                        vy4 vy4Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                vy4Var.b((FocusTargetNode) cVar);
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var3 == null) {
                                                vy4Var3 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var3.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var3.b(f2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var3);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
        vy4Var.D(i.a);
        int q = vy4Var.q();
        if (q > 0) {
            int i2 = q - 1;
            Object[] p = vy4Var.p();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) p[i2];
                if (h.g(focusTargetNode2) && b(focusTargetNode2, ss2Var)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, ss2 ss2Var) {
        vy4 vy4Var = new vy4(new FocusTargetNode[16], 0);
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var2 = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = focusTargetNode.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var2, focusTargetNode.c0());
        } else {
            vy4Var2.b(C1);
        }
        while (vy4Var2.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
            if ((cVar.B1() & a2) == 0) {
                rl1.c(vy4Var2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a2) != 0) {
                        vy4 vy4Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                vy4Var.b((FocusTargetNode) cVar);
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var3 == null) {
                                                vy4Var3 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var3.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var3.b(f2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var3);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
        vy4Var.D(i.a);
        int q = vy4Var.q();
        if (q <= 0) {
            return false;
        }
        Object[] p = vy4Var.p();
        int i2 = 0;
        do {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) p[i2];
            if (h.g(focusTargetNode2) && c(focusTargetNode2, ss2Var)) {
                return true;
            }
            i2++;
        } while (i2 < q);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ss2 ss2Var) {
        if (focusTargetNode.l2() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        vy4 vy4Var = new vy4(new FocusTargetNode[16], 0);
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var2 = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = focusTargetNode.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var2, focusTargetNode.c0());
        } else {
            vy4Var2.b(C1);
        }
        while (vy4Var2.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
            if ((cVar.B1() & a2) == 0) {
                rl1.c(vy4Var2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a2) != 0) {
                        vy4 vy4Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                vy4Var.b((FocusTargetNode) cVar);
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i2 = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var3 == null) {
                                                vy4Var3 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var3.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var3.b(f2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var3);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
        vy4Var.D(i.a);
        d.a aVar = d.b;
        if (d.l(i, aVar.e())) {
            an3 an3Var = new an3(0, vy4Var.q() - 1);
            int g = an3Var.g();
            int j = an3Var.j();
            if (g <= j) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) vy4Var.p()[g];
                        if (h.g(focusTargetNode3) && c(focusTargetNode3, ss2Var)) {
                            return true;
                        }
                    }
                    if (zq3.c(vy4Var.p()[g], focusTargetNode2)) {
                        z = true;
                    }
                    if (g == j) {
                        break;
                    }
                    g++;
                }
            }
        } else {
            if (!d.l(i, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            an3 an3Var2 = new an3(0, vy4Var.q() - 1);
            int g2 = an3Var2.g();
            int j2 = an3Var2.j();
            if (g2 <= j2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) vy4Var.p()[j2];
                        if (h.g(focusTargetNode4) && b(focusTargetNode4, ss2Var)) {
                            return true;
                        }
                    }
                    if (zq3.c(vy4Var.p()[j2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (j2 == g2) {
                        break;
                    }
                    j2--;
                }
            }
        }
        if (d.l(i, d.b.e()) || !focusTargetNode.j2().i() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) ss2Var.invoke(focusTargetNode)).booleanValue();
    }
}
