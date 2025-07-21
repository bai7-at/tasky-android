package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.bo3;
import defpackage.dy4;
import defpackage.sl2;
import defpackage.tl2;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class FocusableInteractionNode extends Modifier.c {
    private dy4 n;
    private sl2 r;

    public FocusableInteractionNode(dy4 dy4Var) {
        this.n = dy4Var;
    }

    private final void e2() {
        sl2 sl2Var;
        dy4 dy4Var = this.n;
        if (dy4Var != null && (sl2Var = this.r) != null) {
            dy4Var.c(new tl2(sl2Var));
        }
        this.r = null;
    }

    private final void f2(dy4 dy4Var, bo3 bo3Var) {
        if (L1()) {
            BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new FocusableInteractionNode$emitWithFallback$1(dy4Var, bo3Var, null), 3, null);
        } else {
            dy4Var.c(bo3Var);
        }
    }

    public final void g2(boolean z) {
        dy4 dy4Var = this.n;
        if (dy4Var != null) {
            if (!z) {
                sl2 sl2Var = this.r;
                if (sl2Var != null) {
                    f2(dy4Var, new tl2(sl2Var));
                    this.r = null;
                    return;
                }
                return;
            }
            sl2 sl2Var2 = this.r;
            if (sl2Var2 != null) {
                f2(dy4Var, new tl2(sl2Var2));
                this.r = null;
            }
            sl2 sl2Var3 = new sl2();
            f2(dy4Var, sl2Var3);
            this.r = sl2Var3;
        }
    }

    public final void h2(dy4 dy4Var) {
        if (zq3.c(this.n, dy4Var)) {
            return;
        }
        e2();
        this.n = dy4Var;
    }
}
