package defpackage;

import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface tc7 {
    static /* synthetic */ Object e(tc7 tc7Var, MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return tc7Var.b(mutatePriority, gt2Var, by0Var);
    }

    default boolean a() {
        return true;
    }

    Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var);

    boolean c();

    default boolean d() {
        return true;
    }

    float f(float f);
}
