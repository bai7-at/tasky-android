package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* loaded from: classes.dex */
public final class jn5 {
    public static final jn5 a = new jn5();
    private static final ci b = di.k(500, 0, xx1.d(), 2, null);
    public static final int c = 8;

    private jn5() {
    }

    public final SnapFlingBehavior a(PagerState pagerState, un5 un5Var, ci ciVar, oc1 oc1Var, ci ciVar2, float f, Composer composer, int i, int i2) {
        dw7 b2;
        composer.z(-194065136);
        un5 a2 = (i2 & 2) != 0 ? un5.a.a(1) : un5Var;
        ci ciVar3 = (i2 & 4) != 0 ? b : ciVar;
        oc1 b3 = (i2 & 8) != 0 ? cz7.b(composer, 0) : oc1Var;
        ci i3 = (i2 & 16) != 0 ? di.i(0.0f, 400.0f, null, 5, null) : ciVar2;
        float f2 = (i2 & 32) != 0 ? 0.5f : f;
        if (b.G()) {
            b.S(-194065136, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:348)");
        }
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2).toString());
        }
        Object[] objArr = {pagerState, ciVar3, b3, i3, a2, (fm1) composer.m(CompositionLocalsKt.e())};
        composer.z(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 6; i4++) {
            z |= composer.S(objArr[i4]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            b2 = PagerKt.b(pagerState, a2, b3, f2);
            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(b2, ciVar3, b3, i3);
            composer.q(snapFlingBehavior);
            A = snapFlingBehavior;
        }
        composer.R();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return snapFlingBehavior2;
    }

    public final d35 b(PagerState pagerState, Orientation orientation) {
        return new qi1(pagerState, orientation);
    }
}
