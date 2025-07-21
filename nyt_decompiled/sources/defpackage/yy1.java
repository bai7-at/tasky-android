package defpackage;

import androidx.compose.animation.core.Animatable;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes.dex */
public abstract class yy1 {
    private static final eu8 a = new eu8(120, 0, xx1.c(), 2, null);
    private static final eu8 b = new eu8(150, 0, new v31(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final eu8 c = new eu8(120, 0, new v31(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(Animatable animatable, float f, bo3 bo3Var, bo3 bo3Var2, by0 by0Var) {
        ci a2 = bo3Var2 != null ? wy1.a.a(bo3Var2) : bo3Var != null ? wy1.a.b(bo3Var) : null;
        if (a2 != null) {
            Object f2 = Animatable.f(animatable, bu1.d(f), a2, null, null, by0Var, 12, null);
            return f2 == a.h() ? f2 : ww8.a;
        }
        Object t = animatable.t(bu1.d(f), by0Var);
        return t == a.h() ? t : ww8.a;
    }
}
