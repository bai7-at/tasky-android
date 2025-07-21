package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface h04 {
    static /* synthetic */ Modifier a(h04 h04Var, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return h04Var.c(modifier, f);
    }

    static /* synthetic */ Modifier d(h04 h04Var, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return h04Var.e(modifier, f);
    }

    static /* synthetic */ Modifier f(h04 h04Var, Modifier modifier, ph2 ph2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, vm3.b(ic9.c(vm3.b)), 1, null);
        }
        return h04Var.b(modifier, ph2Var);
    }

    Modifier b(Modifier modifier, ph2 ph2Var);

    Modifier c(Modifier modifier, float f);

    Modifier e(Modifier modifier, float f);
}
