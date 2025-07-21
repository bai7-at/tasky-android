package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.by0;
import defpackage.gt2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public abstract class PausingDispatcherKt {
    public static final Object a(Lifecycle lifecycle, gt2 gt2Var, by0 by0Var) {
        return c(lifecycle, Lifecycle.State.CREATED, gt2Var, by0Var);
    }

    public static final Object b(Lifecycle lifecycle, gt2 gt2Var, by0 by0Var) {
        return c(lifecycle, Lifecycle.State.RESUMED, gt2Var, by0Var);
    }

    public static final Object c(Lifecycle lifecycle, Lifecycle.State state, gt2 gt2Var, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, gt2Var, null), by0Var);
    }
}
