package androidx.compose.ui.input.pointer;

import defpackage.by5;
import defpackage.cy5;
import defpackage.hy6;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class PointerInteropFilter implements cy5 {
    public ss2 b;
    private hy6 c;
    private boolean d;
    private final by5 e = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public final boolean l() {
        return this.d;
    }

    @Override // defpackage.cy5
    public by5 q() {
        return this.e;
    }

    public final ss2 r() {
        ss2 ss2Var = this.b;
        if (ss2Var != null) {
            return ss2Var;
        }
        zq3.z("onTouchEvent");
        return null;
    }

    public final void t(boolean z) {
        this.d = z;
    }

    public final void v(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public final void x(hy6 hy6Var) {
        hy6 hy6Var2 = this.c;
        if (hy6Var2 != null) {
            hy6Var2.c(null);
        }
        this.c = hy6Var;
        if (hy6Var == null) {
            return;
        }
        hy6Var.c(this);
    }
}
