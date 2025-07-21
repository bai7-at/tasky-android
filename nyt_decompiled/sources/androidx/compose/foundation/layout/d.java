package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import defpackage.rg4;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class d {
    private static final rg4 a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        Arrangement arrangement = Arrangement.a;
        Arrangement.e eVar = null;
        a = new RowColumnMeasurePolicy(layoutOrientation, eVar, arrangement.g(), arrangement.g().a(), SizeMode.Wrap, f.a.a(Alignment.a.k()), null);
    }

    public static final rg4 a(Arrangement.m mVar, Alignment.b bVar, Composer composer, int i) {
        rg4 rg4Var;
        composer.z(1089876336);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:101)");
        }
        if (zq3.c(mVar, Arrangement.a.g()) && zq3.c(bVar, Alignment.a.k())) {
            rg4Var = a;
        } else {
            composer.z(511388516);
            boolean S = composer.S(mVar) | composer.S(bVar);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                Arrangement.e eVar = null;
                A = new RowColumnMeasurePolicy(LayoutOrientation.Vertical, eVar, mVar, mVar.a(), SizeMode.Wrap, f.a.a(bVar), null);
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
