package androidx.compose.foundation;

import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import defpackage.cz3;
import defpackage.dy4;
import defpackage.ej7;
import defpackage.f13;
import defpackage.fj7;
import defpackage.fm2;
import defpackage.lj7;
import defpackage.qc0;
import defpackage.ql2;
import defpackage.ul1;
import defpackage.zl2;
import defpackage.zq3;
import defpackage.zy3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class FocusableNode extends ul1 implements ql2, zy3, ej7, f13 {
    private final BringIntoViewRequesterNode B;
    private zl2 s;
    private final FocusableInteractionNode u;
    private final qc0 y;
    private final FocusableSemanticsNode t = (FocusableSemanticsNode) e2(new FocusableSemanticsNode());
    private final FocusablePinnableContainerNode w = (FocusablePinnableContainerNode) e2(new FocusablePinnableContainerNode());
    private final fm2 x = (fm2) e2(new fm2());

    public FocusableNode(dy4 dy4Var) {
        this.u = (FocusableInteractionNode) e2(new FocusableInteractionNode(dy4Var));
        qc0 a = androidx.compose.foundation.relocation.b.a();
        this.y = a;
        this.B = (BringIntoViewRequesterNode) e2(new BringIntoViewRequesterNode(a));
    }

    @Override // defpackage.zy3
    public void F0(cz3 cz3Var) {
        this.B.F0(cz3Var);
    }

    @Override // defpackage.ql2
    public void h1(zl2 zl2Var) {
        if (zq3.c(this.s, zl2Var)) {
            return;
        }
        boolean isFocused = zl2Var.isFocused();
        if (isFocused) {
            BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new FocusableNode$onFocusEvent$1(this, null), 3, null);
        }
        if (L1()) {
            fj7.b(this);
        }
        this.u.g2(isFocused);
        this.x.g2(isFocused);
        this.w.f2(isFocused);
        this.t.e2(isFocused);
        this.s = zl2Var;
    }

    @Override // defpackage.f13
    public void k(cz3 cz3Var) {
        this.x.k(cz3Var);
    }

    public final void k2(dy4 dy4Var) {
        this.u.h2(dy4Var);
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        this.t.u0(lj7Var);
    }
}
