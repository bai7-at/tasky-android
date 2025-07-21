package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.k;

/* loaded from: classes.dex */
public abstract class ms8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ss2] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void a(ls8 ls8Var, ss2 ss2Var) {
        k h0;
        int a = a85.a(262144);
        if (!ls8Var.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = ls8Var.c0().I1();
        LayoutNode k = rl1.k(ls8Var);
        while (k != null) {
            if ((k.h0().k().B1() & a) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a) != 0) {
                        ul1 ul1Var = I1;
                        ?? r5 = 0;
                        while (ul1Var != 0) {
                            boolean z = true;
                            if (ul1Var instanceof ls8) {
                                ls8 ls8Var2 = (ls8) ul1Var;
                                if (zq3.c(ls8Var.y(), ls8Var2.y()) && v5.a(ls8Var, ls8Var2)) {
                                    z = ((Boolean) ss2Var.invoke(ls8Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else {
                                if (((ul1Var.G1() & a) != 0) && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i = 0;
                                    ul1Var = ul1Var;
                                    r5 = r5;
                                    while (f2 != null) {
                                        if ((f2.G1() & a) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r5.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r5.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            ul1Var = rl1.g(r5);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x002f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ss2] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ls8 r11, defpackage.ss2 r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = defpackage.a85.a(r0)
            androidx.compose.ui.Modifier$c r1 = r11.c0()
            boolean r1 = r1.L1()
            if (r1 == 0) goto Ld4
            vy4 r1 = new vy4
            r2 = 16
            androidx.compose.ui.Modifier$c[] r3 = new androidx.compose.ui.Modifier.c[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$c r3 = r11.c0()
            androidx.compose.ui.Modifier$c r3 = r3.C1()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$c r3 = r11.c0()
            defpackage.rl1.a(r1, r3)
            goto L2f
        L2c:
            r1.b(r3)
        L2f:
            boolean r3 = r1.t()
            if (r3 == 0) goto Ld3
            int r3 = r1.q()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.y(r3)
            androidx.compose.ui.Modifier$c r3 = (androidx.compose.ui.Modifier.c) r3
            int r6 = r3.B1()
            r6 = r6 & r0
            if (r6 != 0) goto L4c
            defpackage.rl1.a(r1, r3)
            goto L2f
        L4c:
            if (r3 == 0) goto L2f
            int r6 = r3.G1()
            r6 = r6 & r0
            if (r6 == 0) goto Lcd
            r6 = 0
            r7 = r6
        L57:
            if (r3 == 0) goto L2f
            boolean r8 = r3 instanceof defpackage.ls8
            if (r8 == 0) goto L82
            ls8 r3 = (defpackage.ls8) r3
            java.lang.Object r8 = r11.y()
            java.lang.Object r9 = r3.y()
            boolean r8 = defpackage.zq3.c(r8, r9)
            if (r8 == 0) goto L7e
            boolean r8 = defpackage.v5.a(r11, r3)
            if (r8 == 0) goto L7e
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L7f
        L7e:
            r3 = r5
        L7f:
            if (r3 != 0) goto Lc8
            return
        L82:
            int r8 = r3.G1()
            r8 = r8 & r0
            if (r8 == 0) goto L8b
            r8 = r5
            goto L8c
        L8b:
            r8 = r4
        L8c:
            if (r8 == 0) goto Lc8
            boolean r8 = r3 instanceof defpackage.ul1
            if (r8 == 0) goto Lc8
            r8 = r3
            ul1 r8 = (defpackage.ul1) r8
            androidx.compose.ui.Modifier$c r8 = r8.f2()
            r9 = r4
        L9a:
            if (r8 == 0) goto Lc5
            int r10 = r8.G1()
            r10 = r10 & r0
            if (r10 == 0) goto La5
            r10 = r5
            goto La6
        La5:
            r10 = r4
        La6:
            if (r10 == 0) goto Lc0
            int r9 = r9 + 1
            if (r9 != r5) goto Lae
            r3 = r8
            goto Lc0
        Lae:
            if (r7 != 0) goto Lb7
            vy4 r7 = new vy4
            androidx.compose.ui.Modifier$c[] r10 = new androidx.compose.ui.Modifier.c[r2]
            r7.<init>(r10, r4)
        Lb7:
            if (r3 == 0) goto Lbd
            r7.b(r3)
            r3 = r6
        Lbd:
            r7.b(r8)
        Lc0:
            androidx.compose.ui.Modifier$c r8 = r8.C1()
            goto L9a
        Lc5:
            if (r9 != r5) goto Lc8
            goto L57
        Lc8:
            androidx.compose.ui.Modifier$c r3 = defpackage.rl1.b(r7)
            goto L57
        Lcd:
            androidx.compose.ui.Modifier$c r3 = r3.C1()
            goto L4c
        Ld3:
            return
        Ld4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms8.b(ls8, ss2):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ss2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void c(ql1 ql1Var, Object obj, ss2 ss2Var) {
        int a = a85.a(262144);
        if (!ql1Var.c0().L1()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        vy4 vy4Var = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = ql1Var.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var, ql1Var.c0());
        } else {
            vy4Var.b(C1);
        }
        while (vy4Var.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var.y(vy4Var.q() - 1);
            if ((cVar.B1() & a) != 0) {
                for (Modifier.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.C1()) {
                    if ((cVar2.G1() & a) != 0) {
                        ul1 ul1Var = cVar2;
                        ?? r8 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof ls8) {
                                ls8 ls8Var = (ls8) ul1Var;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = zq3.c(obj, ls8Var.y()) ? (TraversableNode$Companion$TraverseDescendantsAction) ss2Var.invoke(ls8Var) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r8 = r8;
                                while (f2 != null) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r8.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r8.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r8);
                        }
                    }
                }
            }
            rl1.c(vy4Var, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ss2] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void d(ls8 ls8Var, ss2 ss2Var) {
        int a = a85.a(262144);
        if (!ls8Var.c0().L1()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        vy4 vy4Var = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = ls8Var.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var, ls8Var.c0());
        } else {
            vy4Var.b(C1);
        }
        while (vy4Var.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var.y(vy4Var.q() - 1);
            if ((cVar.B1() & a) != 0) {
                for (Modifier.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.C1()) {
                    if ((cVar2.G1() & a) != 0) {
                        ul1 ul1Var = cVar2;
                        ?? r9 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof ls8) {
                                ls8 ls8Var2 = (ls8) ul1Var;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (zq3.c(ls8Var.y(), ls8Var2.y()) && v5.a(ls8Var, ls8Var2)) ? (TraversableNode$Companion$TraverseDescendantsAction) ss2Var.invoke(ls8Var2) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r9 = r9;
                                while (f2 != null) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        r9 = r9;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r9.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r9.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r9 = r9;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r9);
                        }
                    }
                }
            }
            rl1.c(vy4Var, cVar);
        }
    }
}
