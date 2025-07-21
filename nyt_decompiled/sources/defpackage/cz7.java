package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* loaded from: classes.dex */
public abstract class cz7 {
    private static final float a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return a;
    }

    public static final oc1 b(Composer composer, int i) {
        composer.z(904445851);
        if (b.G()) {
            b.S(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        Float valueOf = Float.valueOf(fm1Var.getDensity());
        composer.z(1157296644);
        boolean S = composer.S(valueOf);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = qc1.b(new bz7(fm1Var));
            composer.q(A);
        }
        composer.R();
        oc1 oc1Var = (oc1) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return oc1Var;
    }
}
