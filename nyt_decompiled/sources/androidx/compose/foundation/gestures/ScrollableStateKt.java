package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class ScrollableStateKt {
    public static final tc7 a(ss2 ss2Var) {
        return new DefaultScrollableState(ss2Var);
    }

    public static final tc7 b(ss2 ss2Var, Composer composer, int i) {
        composer.z(-180460798);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        final x08 o = y.o(ss2Var, composer, i & 14);
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = a(new ss2() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                {
                    super(1);
                }

                public final Float b(float f) {
                    return (Float) ((ss2) x08.this.getValue()).invoke(Float.valueOf(f));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).floatValue());
                }
            });
            composer.q(A);
        }
        composer.R();
        tc7 tc7Var = (tc7) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return tc7Var;
    }
}
