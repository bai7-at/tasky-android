package defpackage;

import androidx.compose.runtime.Composer;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import dev.chrisbanes.snapper.b;

/* loaded from: classes4.dex */
public abstract class hw7 {
    public static final SnapperFlingBehavior a(b bVar, oc1 oc1Var, ci ciVar, it2 it2Var, Composer composer, int i, int i2) {
        zq3.h(bVar, "layoutInfo");
        zq3.h(it2Var, "snapIndex");
        composer.z(-632874525);
        int i3 = 0;
        if ((i2 & 2) != 0) {
            oc1Var = cz7.b(composer, 0);
        }
        if ((i2 & 4) != 0) {
            ciVar = SnapperFlingBehaviorDefaults.a.b();
        }
        Object[] objArr = {bVar, oc1Var, ciVar, it2Var};
        composer.z(-3685570);
        boolean z = false;
        while (i3 < 4) {
            Object obj = objArr[i3];
            i3++;
            z |= composer.S(obj);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new SnapperFlingBehavior(bVar, oc1Var, ciVar, it2Var);
            composer.q(A);
        }
        composer.R();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) A;
        composer.R();
        return snapperFlingBehavior;
    }
}
