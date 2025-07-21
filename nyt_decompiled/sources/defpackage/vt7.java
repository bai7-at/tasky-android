package defpackage;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.colorspace.c;

/* loaded from: classes.dex */
public abstract class vt7 {
    private static final qz7 a = di.i(0.0f, 0.0f, null, 7, null);

    public static final x08 a(long j, ci ciVar, String str, ss2 ss2Var, Composer composer, int i, int i2) {
        composer.z(-451899108);
        ci ciVar2 = (i2 & 2) != 0 ? a : ciVar;
        String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        ss2 ss2Var2 = (i2 & 8) != 0 ? null : ss2Var;
        if (b.G()) {
            b.S(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        c w = nn0.w(j);
        composer.z(1157296644);
        boolean S = composer.S(w);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = (hu8) ColorVectorConverterKt.a(nn0.b).invoke(nn0.w(j));
            composer.q(A);
        }
        composer.R();
        int i3 = i << 6;
        x08 e = AnimateAsStateKt.e(nn0.j(j), (hu8) A, ciVar2, null, str2, ss2Var2, composer, (i & 14) | 576 | (57344 & i3) | (i3 & 458752), 8);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e;
    }
}
