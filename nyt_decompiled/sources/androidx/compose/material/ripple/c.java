package androidx.compose.material.ripple;

import defpackage.bo3;
import defpackage.e26;
import defpackage.fj3;
import defpackage.fv1;
import defpackage.x08;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class c implements fj3 {
    private final StateLayer a;

    public c(boolean z, x08 x08Var) {
        this.a = new StateLayer(z, x08Var);
    }

    public abstract void b(e26 e26Var, CoroutineScope coroutineScope);

    public final void f(fv1 fv1Var, float f, long j) {
        this.a.b(fv1Var, f, j);
    }

    public abstract void g(e26 e26Var);

    public final void h(bo3 bo3Var, CoroutineScope coroutineScope) {
        this.a.c(bo3Var, coroutineScope);
    }
}
