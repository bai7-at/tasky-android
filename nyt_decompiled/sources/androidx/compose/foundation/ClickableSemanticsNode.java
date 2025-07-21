package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.ej7;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.n27;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class ClickableSemanticsNode extends Modifier.c implements ej7 {
    private boolean n;
    private String r;
    private n27 s;
    private qs2 t;
    private String u;
    private qs2 w;

    public /* synthetic */ ClickableSemanticsNode(boolean z, String str, n27 n27Var, qs2 qs2Var, String str2, qs2 qs2Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, n27Var, qs2Var, str2, qs2Var2);
    }

    public final void g2(boolean z, String str, n27 n27Var, qs2 qs2Var, String str2, qs2 qs2Var2) {
        this.n = z;
        this.r = str;
        this.s = n27Var;
        this.t = qs2Var;
        this.u = str2;
        this.w = qs2Var2;
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        n27 n27Var = this.s;
        if (n27Var != null) {
            zq3.e(n27Var);
            jj7.V(lj7Var, n27Var.n());
        }
        jj7.v(lj7Var, this.r, new qs2() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                qs2 qs2Var;
                qs2Var = ClickableSemanticsNode.this.t;
                qs2Var.mo865invoke();
                return Boolean.TRUE;
            }
        });
        if (this.w != null) {
            jj7.z(lj7Var, this.u, new qs2() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    qs2 qs2Var;
                    qs2Var = ClickableSemanticsNode.this.w;
                    if (qs2Var != null) {
                        qs2Var.mo865invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
        if (this.n) {
            return;
        }
        jj7.k(lj7Var);
    }

    @Override // defpackage.ej7
    public boolean x1() {
        return true;
    }

    private ClickableSemanticsNode(boolean z, String str, n27 n27Var, qs2 qs2Var, String str2, qs2 qs2Var2) {
        this.n = z;
        this.r = str;
        this.s = n27Var;
        this.t = qs2Var;
        this.u = str2;
        this.w = qs2Var2;
    }
}
