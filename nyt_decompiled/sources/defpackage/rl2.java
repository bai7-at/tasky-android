package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import com.amazonaws.event.ProgressEvent;

/* loaded from: classes.dex */
public abstract class rl2 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0095, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zl2 a(defpackage.ql2 r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl2.a(ql2):zl2");
    }

    public static final void b(ql2 ql2Var) {
        rl1.l(ql2Var).getFocusOwner().d(ql2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$c] */
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
    public static final void c(FocusTargetNode focusTargetNode) {
        k h0;
        int a2 = a85.a(ProgressEvent.PART_FAILED_EVENT_CODE);
        int a3 = a85.a(1024);
        Modifier.c c0 = focusTargetNode.c0();
        int i = a2 | a3;
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c c02 = focusTargetNode.c0();
        LayoutNode k = rl1.k(focusTargetNode);
        while (k != null) {
            if ((k.h0().k().B1() & i) != 0) {
                while (c02 != null) {
                    if ((c02.G1() & i) != 0) {
                        if (c02 != c0 && (c02.G1() & a3) != 0) {
                            return;
                        }
                        if ((c02.G1() & a2) != 0) {
                            ul1 ul1Var = c02;
                            ?? r7 = 0;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof ql2) {
                                    ql2 ql2Var = (ql2) ul1Var;
                                    ql2Var.h1(a(ql2Var));
                                } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i2 = 0;
                                    ul1Var = ul1Var;
                                    r7 = r7;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r7.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r7.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r7);
                            }
                        }
                    }
                    c02 = c02.I1();
                }
            }
            k = k.k0();
            c02 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
    }
}
