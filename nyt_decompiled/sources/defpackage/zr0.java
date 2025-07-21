package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes.dex */
public abstract class zr0 {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final yr0 b(Composer composer, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.z(Integer.rotateLeft(i, 1));
        Object A = composer.A();
        if (A == Composer.a.a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z, obj);
            composer.q(composableLambdaImpl);
        } else {
            zq3.f(A, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) A;
            composableLambdaImpl.q(obj);
        }
        composer.R();
        return composableLambdaImpl;
    }

    public static final yr0 c(int i, boolean z, Object obj) {
        return new ComposableLambdaImpl(i, z, obj);
    }

    public static final int d(int i) {
        return a(2, i);
    }

    public static final boolean e(ft6 ft6Var, ft6 ft6Var2) {
        if (ft6Var != null) {
            if ((ft6Var instanceof RecomposeScopeImpl) && (ft6Var2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) ft6Var;
                if (!recomposeScopeImpl.s() || zq3.c(ft6Var, ft6Var2) || zq3.c(recomposeScopeImpl.j(), ((RecomposeScopeImpl) ft6Var2).j())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i) {
        return a(1, i);
    }
}
