package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import defpackage.eo3;
import defpackage.gt2;
import defpackage.py1;
import defpackage.sy4;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class FocusInteractionKt {
    public static final x08 a(eo3 eo3Var, Composer composer, int i) {
        composer.z(-1805515472);
        if (b.G()) {
            b.S(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        composer.z(-1414746436);
        boolean S = composer.S(eo3Var) | composer.S(sy4Var);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(eo3Var, sy4Var, null);
            composer.q(A2);
        }
        composer.R();
        py1.d(eo3Var, (gt2) A2, composer, (i & 14) | 64);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sy4Var;
    }
}
