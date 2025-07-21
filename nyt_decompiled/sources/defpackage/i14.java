package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import dev.chrisbanes.snapper.LazyListSnapperLayoutInfo;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;

/* loaded from: classes4.dex */
public abstract class i14 {
    public static final LazyListSnapperLayoutInfo a(LazyListState lazyListState, gt2 gt2Var, float f, Composer composer, int i, int i2) {
        zq3.h(lazyListState, "lazyListState");
        composer.z(-1050829263);
        if ((i2 & 2) != 0) {
            gt2Var = SnapOffsets.a.a();
        }
        gt2 gt2Var2 = gt2Var;
        if ((i2 & 4) != 0) {
            f = bu1.g(0);
        }
        composer.z(-3686552);
        boolean S = composer.S(lazyListState) | composer.S(gt2Var2);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new LazyListSnapperLayoutInfo(lazyListState, gt2Var2, 0, 4, null);
            composer.q(A);
        }
        composer.R();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = (LazyListSnapperLayoutInfo) A;
        lazyListSnapperLayoutInfo.o(((fm1) composer.m(CompositionLocalsKt.e())).l0(f));
        composer.R();
        return lazyListSnapperLayoutInfo;
    }

    public static final SnapperFlingBehavior b(LazyListState lazyListState, gt2 gt2Var, float f, oc1 oc1Var, ci ciVar, it2 it2Var, Composer composer, int i, int i2) {
        zq3.h(lazyListState, "lazyListState");
        zq3.h(it2Var, "snapIndex");
        composer.z(-632875458);
        SnapperFlingBehavior a = hw7.a(a(lazyListState, (i2 & 2) != 0 ? SnapOffsets.a.a() : gt2Var, (i2 & 4) != 0 ? bu1.g(0) : f, composer, i & 1022, 0), (i2 & 8) != 0 ? cz7.b(composer, 0) : oc1Var, (i2 & 16) != 0 ? SnapperFlingBehaviorDefaults.a.b() : ciVar, it2Var, composer, ((i >> 6) & 7168) | 576, 0);
        composer.R();
        return a;
    }
}
