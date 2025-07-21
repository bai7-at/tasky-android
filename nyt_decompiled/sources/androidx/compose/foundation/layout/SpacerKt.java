package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class SpacerKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        composer.z(-72882467);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-72882467, i, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.a;
        composer.z(544976794);
        int a = cs0.a(composer, 0);
        Modifier d = ComposedModifierKt.d(composer, modifier);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        final qs2 a2 = companion.a();
        composer.z(1405779621);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(new qs2() { // from class: androidx.compose.foundation.layout.SpacerKt$Spacer$$inlined$Layout$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Object mo865invoke() {
                    return qs2.this.mo865invoke();
                }
            });
        } else {
            composer.p();
        }
        Composer a3 = Updater.a(composer);
        Updater.c(a3, spacerMeasurePolicy, companion.e());
        Updater.c(a3, o, companion.g());
        Updater.c(a3, d, companion.f());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        composer.t();
        composer.R();
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }
}
