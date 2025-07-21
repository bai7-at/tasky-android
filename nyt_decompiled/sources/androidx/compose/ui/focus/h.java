package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.k;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a85;
import defpackage.ez3;
import defpackage.kt6;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class h {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final FocusRequester a(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester e;
        FocusProperties j2 = focusTargetNode.j2();
        d.a aVar = d.b;
        if (d.l(i, aVar.e())) {
            return j2.getNext();
        }
        if (d.l(i, aVar.f())) {
            return j2.j();
        }
        if (d.l(i, aVar.h())) {
            return j2.b();
        }
        if (d.l(i, aVar.a())) {
            return j2.f();
        }
        if (d.l(i, aVar.d())) {
            int i2 = a.a[layoutDirection.ordinal()];
            if (i2 == 1) {
                e = j2.a();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e = j2.e();
            }
            if (e == FocusRequester.b.b()) {
                e = null;
            }
            if (e == null) {
                return j2.d();
            }
        } else {
            if (!d.l(i, aVar.g())) {
                if (d.l(i, aVar.b())) {
                    return (FocusRequester) j2.h().invoke(d.i(i));
                }
                if (d.l(i, aVar.c())) {
                    return (FocusRequester) j2.c().invoke(d.i(i));
                }
                throw new IllegalStateException("invalid FocusDirection");
            }
            int i3 = a.a[layoutDirection.ordinal()];
            if (i3 == 1) {
                e = j2.e();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e = j2.a();
            }
            if (e == FocusRequester.b.b()) {
                e = null;
            }
            if (e == null) {
                return j2.y();
            }
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.l2()
            int[] r1 = androidx.compose.ui.focus.h.a.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ld3
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Ld3
            r10 = 4
            if (r0 != r10) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L20:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = defpackage.a85.a(r0)
            androidx.compose.ui.Modifier$c r2 = r10.c0()
            boolean r2 = r2.L1()
            if (r2 == 0) goto Lcb
            vy4 r2 = new vy4
            r4 = 16
            androidx.compose.ui.Modifier$c[] r5 = new androidx.compose.ui.Modifier.c[r4]
            r6 = 0
            r2.<init>(r5, r6)
            androidx.compose.ui.Modifier$c r5 = r10.c0()
            androidx.compose.ui.Modifier$c r5 = r5.C1()
            if (r5 != 0) goto L4c
            androidx.compose.ui.Modifier$c r10 = r10.c0()
            defpackage.rl1.a(r2, r10)
            goto L4f
        L4c:
            r2.b(r5)
        L4f:
            boolean r10 = r2.t()
            if (r10 == 0) goto Lca
            int r10 = r2.q()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.y(r10)
            androidx.compose.ui.Modifier$c r10 = (androidx.compose.ui.Modifier.c) r10
            int r5 = r10.B1()
            r5 = r5 & r0
            if (r5 != 0) goto L6b
            defpackage.rl1.a(r2, r10)
            goto L4f
        L6b:
            if (r10 == 0) goto L4f
            int r5 = r10.G1()
            r5 = r5 & r0
            if (r5 == 0) goto Lc5
            r5 = r3
        L75:
            if (r10 == 0) goto L4f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L84
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = b(r10)
            if (r10 == 0) goto Lc0
            return r10
        L84:
            int r7 = r10.G1()
            r7 = r7 & r0
            if (r7 == 0) goto Lc0
            boolean r7 = r10 instanceof defpackage.ul1
            if (r7 == 0) goto Lc0
            r7 = r10
            ul1 r7 = (defpackage.ul1) r7
            androidx.compose.ui.Modifier$c r7 = r7.f2()
            r8 = r6
        L97:
            if (r7 == 0) goto Lbd
            int r9 = r7.G1()
            r9 = r9 & r0
            if (r9 == 0) goto Lb8
            int r8 = r8 + 1
            if (r8 != r1) goto La6
            r10 = r7
            goto Lb8
        La6:
            if (r5 != 0) goto Laf
            vy4 r5 = new vy4
            androidx.compose.ui.Modifier$c[] r9 = new androidx.compose.ui.Modifier.c[r4]
            r5.<init>(r9, r6)
        Laf:
            if (r10 == 0) goto Lb5
            r5.b(r10)
            r10 = r3
        Lb5:
            r5.b(r7)
        Lb8:
            androidx.compose.ui.Modifier$c r7 = r7.C1()
            goto L97
        Lbd:
            if (r8 != r1) goto Lc0
            goto L75
        Lc0:
            androidx.compose.ui.Modifier$c r10 = defpackage.rl1.b(r5)
            goto L75
        Lc5:
            androidx.compose.ui.Modifier$c r10 = r10.C1()
            goto L6b
        Lca:
            return r3
        Lcb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        Ld3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        k h0;
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = focusTargetNode.c0().I1();
        LayoutNode k = rl1.k(focusTargetNode);
        while (k != null) {
            if ((k.h0().k().B1() & a2) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a2) != 0) {
                        Modifier.c cVar = I1;
                        vy4 vy4Var = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                if (focusTargetNode2.j2().i()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
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
        return null;
    }

    public static final kt6 d(FocusTargetNode focusTargetNode) {
        kt6 z;
        NodeCoordinator D1 = focusTargetNode.D1();
        return (D1 == null || (z = ez3.d(D1).z(D1, false)) == null) ? kt6.e.a() : z;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, ss2 ss2Var) {
        int g;
        Boolean t;
        d.a aVar = d.b;
        if (d.l(i, aVar.e()) ? true : d.l(i, aVar.f())) {
            return OneDimensionalFocusSearchKt.f(focusTargetNode, i, ss2Var);
        }
        if (d.l(i, aVar.d()) ? true : d.l(i, aVar.g()) ? true : d.l(i, aVar.h()) ? true : d.l(i, aVar.a())) {
            Boolean t2 = TwoDimensionalFocusSearchKt.t(focusTargetNode, i, ss2Var);
            if (t2 != null) {
                return t2.booleanValue();
            }
        } else if (d.l(i, aVar.b())) {
            int i2 = a.a[layoutDirection.ordinal()];
            if (i2 == 1) {
                g = aVar.g();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                g = aVar.d();
            }
            FocusTargetNode b = b(focusTargetNode);
            if (b != null && (t = TwoDimensionalFocusSearchKt.t(b, g, ss2Var)) != null) {
                return t.booleanValue();
            }
        } else {
            if (!d.l(i, aVar.c())) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.n(i))).toString());
            }
            FocusTargetNode b2 = b(focusTargetNode);
            FocusTargetNode c = b2 != null ? c(b2) : null;
            if (c != null && !zq3.c(c, focusTargetNode)) {
                return ((Boolean) ss2Var.invoke(c)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$c r0 = r10.c0()
            boolean r0 = r0.L1()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = defpackage.a85.a(r0)
            androidx.compose.ui.Modifier$c r2 = r10.c0()
            boolean r2 = r2.L1()
            if (r2 == 0) goto Ld1
            vy4 r2 = new vy4
            r3 = 16
            androidx.compose.ui.Modifier$c[] r4 = new androidx.compose.ui.Modifier.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$c r4 = r10.c0()
            androidx.compose.ui.Modifier$c r4 = r4.C1()
            if (r4 != 0) goto L38
            androidx.compose.ui.Modifier$c r10 = r10.c0()
            defpackage.rl1.a(r2, r10)
            goto L3b
        L38:
            r2.b(r4)
        L3b:
            boolean r10 = r2.t()
            if (r10 == 0) goto Ld0
            int r10 = r2.q()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.y(r10)
            androidx.compose.ui.Modifier$c r10 = (androidx.compose.ui.Modifier.c) r10
            int r6 = r10.B1()
            r6 = r6 & r0
            if (r6 != 0) goto L58
            defpackage.rl1.a(r2, r10)
            goto L3b
        L58:
            if (r10 == 0) goto L3b
            int r6 = r10.G1()
            r6 = r6 & r0
            if (r6 == 0) goto Lcb
            r6 = r1
        L62:
            if (r10 == 0) goto L3b
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8a
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.Modifier$c r7 = r10.c0()
            boolean r7 = r7.L1()
            if (r7 == 0) goto Lc6
            androidx.compose.ui.focus.FocusStateImpl r7 = r10.l2()
            int[] r8 = androidx.compose.ui.focus.h.a.b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L89
            r8 = 2
            if (r7 == r8) goto L89
            r8 = 3
            if (r7 == r8) goto L89
            goto Lc6
        L89:
            return r10
        L8a:
            int r7 = r10.G1()
            r7 = r7 & r0
            if (r7 == 0) goto Lc6
            boolean r7 = r10 instanceof defpackage.ul1
            if (r7 == 0) goto Lc6
            r7 = r10
            ul1 r7 = (defpackage.ul1) r7
            androidx.compose.ui.Modifier$c r7 = r7.f2()
            r8 = r5
        L9d:
            if (r7 == 0) goto Lc3
            int r9 = r7.G1()
            r9 = r9 & r0
            if (r9 == 0) goto Lbe
            int r8 = r8 + 1
            if (r8 != r4) goto Lac
            r10 = r7
            goto Lbe
        Lac:
            if (r6 != 0) goto Lb5
            vy4 r6 = new vy4
            androidx.compose.ui.Modifier$c[] r9 = new androidx.compose.ui.Modifier.c[r3]
            r6.<init>(r9, r5)
        Lb5:
            if (r10 == 0) goto Lbb
            r6.b(r10)
            r10 = r1
        Lbb:
            r6.b(r7)
        Lbe:
            androidx.compose.ui.Modifier$c r7 = r7.C1()
            goto L9d
        Lc3:
            if (r8 != r4) goto Lc6
            goto L62
        Lc6:
            androidx.compose.ui.Modifier$c r10 = defpackage.rl1.b(r6)
            goto L62
        Lcb:
            androidx.compose.ui.Modifier$c r10 = r10.C1()
            goto L58
        Ld0:
            return r1
        Ld1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        LayoutNode f2;
        NodeCoordinator D1;
        LayoutNode f22;
        NodeCoordinator D12 = focusTargetNode.D1();
        return (D12 == null || (f2 = D12.f2()) == null || !f2.e() || (D1 = focusTargetNode.D1()) == null || (f22 = D1.f2()) == null || !f22.G0()) ? false : true;
    }
}
