package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.h;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class hj8 {
    private static final int a = 8;

    public static final h a(int i, Composer composer, int i2, int i3) {
        composer.z(1538166871);
        if ((i3 & 1) != 0) {
            i = a;
        }
        if (b.G()) {
            b.S(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        e.b bVar = (e.b) composer.m(CompositionLocalsKt.g());
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) composer.m(CompositionLocalsKt.j());
        Object[] objArr = {bVar, fm1Var, layoutDirection, Integer.valueOf(i)};
        composer.z(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 4; i4++) {
            z |= composer.S(objArr[i4]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new h(bVar, fm1Var, layoutDirection, i);
            composer.q(A);
        }
        composer.R();
        h hVar = (h) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return hVar;
    }
}
