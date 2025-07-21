package com.google.accompanist.swiperefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.b0;
import defpackage.by0;
import defpackage.gh;
import defpackage.sy4;
import defpackage.ww8;

/* loaded from: classes2.dex */
public final class SwipeRefreshState {
    private final sy4 c;
    private final Animatable a = gh.b(0.0f, 0.0f, 2, null);
    private final MutatorMutex b = new MutatorMutex();
    private final sy4 d = b0.e(Boolean.FALSE, null, 2, null);

    public SwipeRefreshState(boolean z) {
        this.c = b0.e(Boolean.valueOf(z), null, 2, null);
    }

    public final Object b(float f, by0 by0Var) {
        Object e = MutatorMutex.e(this.b, null, new SwipeRefreshState$animateOffsetTo$2(this, f, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    public final Object c(float f, by0 by0Var) {
        Object d = this.b.d(MutatePriority.UserInput, new SwipeRefreshState$dispatchScrollDelta$2(this, f, null), by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    public final float d() {
        return ((Number) this.a.m()).floatValue();
    }

    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void g(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    public final void h(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }
}
