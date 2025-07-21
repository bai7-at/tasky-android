package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.m;
import defpackage.a85;
import defpackage.dm2;
import defpackage.em2;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.rl2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class FocusTransactionsKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode f = h.f(focusTargetNode);
        if (f != null) {
            return c(f, z, z2);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return a(focusTargetNode, z, z2);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = a.b[focusTargetNode.l2().ordinal()];
        if (i == 1) {
            focusTargetNode.o2(FocusStateImpl.Inactive);
            if (z2) {
                rl2.c(focusTargetNode);
            }
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                focusTargetNode.o2(FocusStateImpl.Inactive);
                if (!z2) {
                    return z;
                }
                rl2.c(focusTargetNode);
                return z;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!a(focusTargetNode, z, z2)) {
                    return false;
                }
                focusTargetNode.o2(FocusStateImpl.Inactive);
                if (z2) {
                    rl2.c(focusTargetNode);
                }
            }
        }
        return true;
    }

    private static final boolean d(final FocusTargetNode focusTargetNode) {
        l.a(focusTargetNode, new qs2() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m69invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69invoke() {
                FocusTargetNode.this.j2();
            }
        });
        int i = a.b[focusTargetNode.l2().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetNode.o2(FocusStateImpl.Active);
        return true;
    }

    public static final CustomDestinationResult e(FocusTargetNode focusTargetNode, int i) {
        int i2 = a.b[focusTargetNode.l2().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                CustomDestinationResult e = e(m(focusTargetNode), i);
                if (e == CustomDestinationResult.None) {
                    e = null;
                }
                return e == null ? g(focusTargetNode, i) : e;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    private static final CustomDestinationResult f(FocusTargetNode focusTargetNode, int i) {
        boolean z;
        z = focusTargetNode.r;
        if (!z) {
            focusTargetNode.r = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.j2().h().invoke(d.i(i));
                FocusRequester.a aVar = FocusRequester.b;
                if (focusRequester != aVar.b()) {
                    if (focusRequester == aVar.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequester.c() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.r = false;
            }
        }
        return CustomDestinationResult.None;
    }

    private static final CustomDestinationResult g(FocusTargetNode focusTargetNode, int i) {
        boolean z;
        z = focusTargetNode.n;
        if (!z) {
            focusTargetNode.n = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.j2().c().invoke(d.i(i));
                FocusRequester.a aVar = FocusRequester.b;
                if (focusRequester != aVar.b()) {
                    if (focusRequester == aVar.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequester.c() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.n = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult h(FocusTargetNode focusTargetNode, int i) {
        Modifier.c cVar;
        k h0;
        int i2 = a.b[focusTargetNode.l2().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return e(m(focusTargetNode), i);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = focusTargetNode.c0().I1();
        LayoutNode k = rl1.k(focusTargetNode);
        loop0: while (true) {
            if (k == null) {
                cVar = null;
                break;
            }
            if ((k.h0().k().B1() & a2) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a2) != 0) {
                        cVar = I1;
                        vy4 vy4Var = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i3 = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var == null) {
                                                vy4Var = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var.b(f2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = a.b[focusTargetNode2.l2().ordinal()];
        if (i4 == 1) {
            return f(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return h(focusTargetNode2, i);
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult h = h(focusTargetNode2, i);
        CustomDestinationResult customDestinationResult = h != CustomDestinationResult.None ? h : null;
        return customDestinationResult == null ? f(focusTargetNode2, i) : customDestinationResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d7, code lost:
    
        if (d(r11) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f4, code lost:
    
        if (d(r11) != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        boolean z;
        em2 d = dm2.d(focusTargetNode);
        try {
            z = d.c;
            if (z) {
                d.g();
            }
            d.f();
            int i = a.a[h(focusTargetNode, d.b.b()).ordinal()];
            boolean z2 = true;
            if (i == 1) {
                z2 = i(focusTargetNode);
            } else if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = false;
            }
            return z2;
        } finally {
            d.h();
        }
    }

    private static final boolean k(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.c cVar;
        Modifier.c cVar2;
        k h0;
        k h02;
        int a2 = a85.a(1024);
        if (!focusTargetNode2.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = focusTargetNode2.c0().I1();
        LayoutNode k = rl1.k(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (k == null) {
                cVar2 = null;
                break;
            }
            if ((k.h0().k().B1() & a2) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a2) != 0) {
                        cVar2 = I1;
                        vy4 vy4Var = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
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
            I1 = (k == null || (h02 = k.h0()) == null) ? null : h02.o();
        }
        if (!zq3.c(cVar2, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i2 = a.b[focusTargetNode.l2().ordinal()];
        if (i2 == 1) {
            boolean d = d(focusTargetNode2);
            if (!d) {
                return d;
            }
            focusTargetNode.o2(FocusStateImpl.ActiveParent);
            return d;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                m(focusTargetNode);
                if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                    return true;
                }
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int a3 = a85.a(1024);
                if (!focusTargetNode.c0().L1()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.c I12 = focusTargetNode.c0().I1();
                LayoutNode k2 = rl1.k(focusTargetNode);
                loop4: while (true) {
                    if (k2 == null) {
                        break;
                    }
                    if ((k2.h0().k().B1() & a3) != 0) {
                        while (I12 != null) {
                            if ((I12.G1() & a3) != 0) {
                                Modifier.c cVar3 = I12;
                                vy4 vy4Var2 = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof FocusTargetNode) {
                                        cVar = cVar3;
                                        break loop4;
                                    }
                                    if ((cVar3.G1() & a3) != 0 && (cVar3 instanceof ul1)) {
                                        int i3 = 0;
                                        for (Modifier.c f22 = ((ul1) cVar3).f2(); f22 != null; f22 = f22.C1()) {
                                            if ((f22.G1() & a3) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVar3 = f22;
                                                } else {
                                                    if (vy4Var2 == null) {
                                                        vy4Var2 = new vy4(new Modifier.c[16], 0);
                                                    }
                                                    if (cVar3 != null) {
                                                        vy4Var2.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    vy4Var2.b(f22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    cVar3 = rl1.g(vy4Var2);
                                }
                            }
                            I12 = I12.I1();
                        }
                    }
                    k2 = k2.k0();
                    I12 = (k2 == null || (h0 = k2.h0()) == null) ? null : h0.o();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && l(focusTargetNode)) {
                    focusTargetNode.o2(FocusStateImpl.Active);
                    return k(focusTargetNode, focusTargetNode2);
                }
                if (focusTargetNode3 != null && k(focusTargetNode3, focusTargetNode)) {
                    boolean k3 = k(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.l2() != FocusStateImpl.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (!k3) {
                        return k3;
                    }
                    rl2.c(focusTargetNode3);
                    return k3;
                }
            }
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode) {
        LayoutNode f2;
        m j0;
        NodeCoordinator D1 = focusTargetNode.D1();
        if (D1 == null || (f2 = D1.f2()) == null || (j0 = f2.j0()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return j0.requestFocus();
    }

    private static final FocusTargetNode m(FocusTargetNode focusTargetNode) {
        FocusTargetNode f = h.f(focusTargetNode);
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
