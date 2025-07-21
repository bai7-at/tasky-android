package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import androidx.compose.ui.node.k;

/* loaded from: classes.dex */
public abstract class ul1 extends Modifier.c {
    private final int n = b85.g(this);
    private Modifier.c r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void h2(int i, boolean z) {
        Modifier.c C1;
        int G1 = G1();
        Y1(i);
        if (G1 != i) {
            if (rl1.f(this)) {
                U1(i);
            }
            if (L1()) {
                Modifier.c c0 = c0();
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.G1();
                    r2.Y1(i);
                    if (r2 == c0) {
                        break;
                    } else {
                        r2 = r2.I1();
                    }
                }
                if (z && r2 == c0) {
                    i = b85.h(c0);
                    c0.Y1(i);
                }
                int B1 = i | ((r2 == 0 || (C1 = r2.C1()) == null) ? 0 : C1.B1());
                for (Modifier.c cVar = r2; cVar != null; cVar = cVar.I1()) {
                    B1 |= cVar.G1();
                    cVar.U1(B1);
                }
            }
        }
    }

    private final void i2(int i, Modifier.c cVar) {
        int G1 = G1();
        if ((i & a85.a(2)) == 0 || (a85.a(2) & G1) == 0 || (this instanceof c)) {
            return;
        }
        throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar).toString());
    }

    @Override // androidx.compose.ui.Modifier.c
    public void M1() {
        super.M1();
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.d2(D1());
            if (!f2.L1()) {
                f2.M1();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void N1() {
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.N1();
        }
        super.N1();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void R1() {
        super.R1();
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.R1();
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void S1() {
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.S1();
        }
        super.S1();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void T1() {
        super.T1();
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.T1();
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void d2(NodeCoordinator nodeCoordinator) {
        super.d2(nodeCoordinator);
        for (Modifier.c f2 = f2(); f2 != null; f2 = f2.C1()) {
            f2.d2(nodeCoordinator);
        }
    }

    protected final ql1 e2(ql1 ql1Var) {
        Modifier.c c0 = ql1Var.c0();
        if (c0 != ql1Var) {
            Modifier.c cVar = ql1Var instanceof Modifier.c ? (Modifier.c) ql1Var : null;
            Modifier.c I1 = cVar != null ? cVar.I1() : null;
            if (c0 == c0() && zq3.c(I1, this)) {
                return ql1Var;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (c0.L1()) {
            throw new IllegalStateException("Cannot delegate to an already attached node");
        }
        c0.V1(c0());
        int G1 = G1();
        int h = b85.h(c0);
        c0.Y1(h);
        i2(h, c0);
        c0.W1(this.r);
        this.r = c0;
        c0.a2(this);
        h2(G1() | h, false);
        if (L1()) {
            if ((h & a85.a(2)) == 0 || (G1 & a85.a(2)) != 0) {
                d2(D1());
            } else {
                k h0 = rl1.k(this).h0();
                c0().d2(null);
                h0.C();
            }
            c0.M1();
            c0.S1();
            b85.a(c0);
        }
        return ql1Var;
    }

    public final Modifier.c f2() {
        return this.r;
    }

    public final int g2() {
        return this.n;
    }
}
