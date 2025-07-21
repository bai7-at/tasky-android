package defpackage;

import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface vu1 {
    static /* synthetic */ Object a(vu1 vu1Var, MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return vu1Var.b(mutatePriority, gt2Var, by0Var);
    }

    Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var);
}
