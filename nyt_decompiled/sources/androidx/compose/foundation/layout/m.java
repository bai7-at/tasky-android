package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import defpackage.rg4;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class m {
    private static final rg4 a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        Arrangement arrangement = Arrangement.a;
        Arrangement.m mVar = null;
        a = new RowColumnMeasurePolicy(layoutOrientation, arrangement.f(), mVar, arrangement.f().a(), SizeMode.Wrap, f.a.b(Alignment.a.l()), null);
    }

    public static final rg4 a(Arrangement.e eVar, Alignment.c cVar, Composer composer, int i) {
        rg4 rg4Var;
        composer.z(-837807694);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (zq3.c(eVar, Arrangement.a.f()) && zq3.c(cVar, Alignment.a.l())) {
            rg4Var = a;
        } else {
            composer.z(511388516);
            boolean S = composer.S(eVar) | composer.S(cVar);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                Arrangement.m mVar = null;
                A = new RowColumnMeasurePolicy(LayoutOrientation.Horizontal, eVar, mVar, eVar.a(), SizeMode.Wrap, f.a.b(cVar), null);
                composer.q(A);
            }
            composer.R();
            rg4Var = (rg4) A;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return rg4Var;
    }
}
