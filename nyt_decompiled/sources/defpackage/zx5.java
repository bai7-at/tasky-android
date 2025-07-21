package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public final class zx5 {
    private final LayoutNode a;
    private final y83 b;
    private final wx5 c = new wx5();
    private final z83 d = new z83();
    private boolean e;

    public zx5(LayoutNode layoutNode) {
        this.a = layoutNode;
        this.b = new y83(layoutNode.l());
    }

    public final int a(xx5 xx5Var, d06 d06Var, boolean z) {
        boolean z2;
        if (this.e) {
            return ay5.a(false, false);
        }
        boolean z3 = true;
        try {
            this.e = true;
            pq3 b = this.c.b(xx5Var, d06Var);
            int l = b.a().l();
            for (int i = 0; i < l; i++) {
                vx5 vx5Var = (vx5) b.a().m(i);
                if (!vx5Var.j() && !vx5Var.m()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int l2 = b.a().l();
            for (int i2 = 0; i2 < l2; i2++) {
                vx5 vx5Var2 = (vx5) b.a().m(i2);
                if (z2 || nx5.b(vx5Var2)) {
                    LayoutNode.u0(this.a, vx5Var2.i(), this.d, iy5.g(vx5Var2.o(), iy5.a.d()), false, 8, null);
                    if (!this.d.isEmpty()) {
                        this.b.a(vx5Var2.g(), this.d);
                        this.d.clear();
                    }
                }
            }
            this.b.d();
            boolean b2 = this.b.b(b, z);
            if (!b.c()) {
                int l3 = b.a().l();
                for (int i3 = 0; i3 < l3; i3++) {
                    vx5 vx5Var3 = (vx5) b.a().m(i3);
                    if (nx5.j(vx5Var3) && vx5Var3.q()) {
                        break;
                    }
                }
            }
            z3 = false;
            int a = ay5.a(b2, z3);
            this.e = false;
            return a;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.c.a();
        this.b.c();
    }
}
