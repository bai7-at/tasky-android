package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;

/* loaded from: classes.dex */
public final class fw8 extends z0 {
    public fw8(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // defpackage.ln
    public void a(int i, int i2) {
        ((LayoutNode) b()).c1(i, i2);
    }

    @Override // defpackage.ln
    public void c(int i, int i2, int i3) {
        ((LayoutNode) b()).T0(i, i2, i3);
    }

    @Override // defpackage.ln
    public void e() {
        super.e();
        m j0 = ((LayoutNode) j()).j0();
        if (j0 != null) {
            j0.t();
        }
    }

    @Override // defpackage.z0
    protected void k() {
        ((LayoutNode) j()).b1();
    }

    @Override // defpackage.ln
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void f(int i, LayoutNode layoutNode) {
        ((LayoutNode) b()).x0(i, layoutNode);
    }

    @Override // defpackage.ln
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(int i, LayoutNode layoutNode) {
    }
}
