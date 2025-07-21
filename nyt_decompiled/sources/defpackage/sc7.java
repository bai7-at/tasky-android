package defpackage;

import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class sc7 {
    public static final sc7 a = new sc7();
    public static final int b = 0;

    private sc7() {
    }

    public final uc0 a() {
        return uc0.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qk2 b(Composer composer, int i) {
        composer.z(1107739818);
        if (b.G()) {
            b.S(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        oc1 b2 = cz7.b(composer, 0);
        composer.z(1157296644);
        boolean S = composer.S(b2);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new DefaultFlingBehavior(b2, null, 2, 0 == true ? 1 : 0);
            composer.q(A);
        }
        composer.R();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return defaultFlingBehavior;
    }

    public final hm5 c(Composer composer, int i) {
        composer.z(1809802212);
        if (b.G()) {
            b.S(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        hm5 b2 = AndroidOverscroll_androidKt.b(composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b2;
    }

    public final boolean d(LayoutDirection layoutDirection, Orientation orientation, boolean z) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z : z;
    }
}
