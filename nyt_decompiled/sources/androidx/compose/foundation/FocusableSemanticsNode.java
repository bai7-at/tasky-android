package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import defpackage.bj7;
import defpackage.ej7;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.qs2;
import defpackage.yl2;

/* loaded from: classes.dex */
final class FocusableSemanticsNode extends Modifier.c implements ej7, yl2 {
    private bj7 n = new bj7();
    private boolean r;

    public final void e2(boolean z) {
        this.r = z;
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        jj7.Q(lj7Var, this.r);
        jj7.G(lj7Var, null, new qs2() { // from class: androidx.compose.foundation.FocusableSemanticsNode$applySemantics$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(FocusRequesterModifierNodeKt.a(FocusableSemanticsNode.this));
            }
        }, 1, null);
    }
}
