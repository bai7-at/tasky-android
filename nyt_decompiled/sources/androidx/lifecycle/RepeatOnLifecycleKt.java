package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.by0;
import defpackage.d44;
import defpackage.gt2;
import defpackage.ww8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public abstract class RepeatOnLifecycleKt {
    public static final Object a(d44 d44Var, Lifecycle.State state, gt2 gt2Var, by0 by0Var) {
        Object b = b(d44Var.getLifecycle(), state, gt2Var, by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    public static final Object b(Lifecycle lifecycle, Lifecycle.State state, gt2 gt2Var, by0 by0Var) {
        Object coroutineScope;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.b() != Lifecycle.State.DESTROYED && (coroutineScope = CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, gt2Var, null), by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? coroutineScope : ww8.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
