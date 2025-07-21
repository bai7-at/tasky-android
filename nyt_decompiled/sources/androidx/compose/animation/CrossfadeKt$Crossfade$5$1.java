package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.hu8;
import defpackage.it2;
import defpackage.ju7;
import defpackage.ph2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.wk2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements gt2 {
    final /* synthetic */ ph2 $animationSpec;
    final /* synthetic */ it2 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ Transition $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$5$1(Transition transition, ph2 ph2Var, Object obj, it2 it2Var) {
        super(2);
        this.$this_Crossfade = transition;
        this.$animationSpec = ph2Var;
        this.$stateForContent = obj;
        this.$content = it2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.i()) {
            composer.K();
            return;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1426421288, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:128)");
        }
        Transition transition = this.$this_Crossfade;
        final ph2 ph2Var = this.$animationSpec;
        it2 it2Var = new it2() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            {
                super(3);
            }

            public final ph2 b(Transition.b bVar, Composer composer2, int i2) {
                composer2.z(438406499);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(438406499, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                ph2 ph2Var2 = ph2.this;
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer2.R();
                return ph2Var2;
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((Transition.b) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        Object obj = this.$stateForContent;
        composer.z(-1338768149);
        hu8 d = VectorConvertersKt.d(wk2.a);
        composer.z(-142660079);
        Object h = transition.h();
        composer.z(-438678252);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f = zq3.c(h, obj) ? 1.0f : 0.0f;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        Float valueOf = Float.valueOf(f);
        Object n = transition.n();
        composer.z(-438678252);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f2 = zq3.c(n, obj) ? 1.0f : 0.0f;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        final x08 c = TransitionKt.c(transition, valueOf, Float.valueOf(f2), (ph2) it2Var.invoke(transition.l(), composer, 0), d, "FloatAnimation", composer, 0);
        composer.R();
        composer.R();
        Modifier.a aVar = Modifier.a;
        composer.z(317054099);
        boolean S = composer.S(c);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new ss2() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.graphics.c cVar) {
                    float c2;
                    c2 = CrossfadeKt$Crossfade$5$1.c(x08.this);
                    cVar.c(c2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((androidx.compose.ui.graphics.c) obj2);
                    return ww8.a;
                }
            };
            composer.q(A);
        }
        composer.R();
        Modifier a = androidx.compose.ui.graphics.b.a(aVar, (ss2) A);
        it2 it2Var2 = this.$content;
        Object obj2 = this.$stateForContent;
        composer.z(733328855);
        rg4 g = BoxKt.g(Alignment.a.o(), false, composer, 0);
        composer.z(-1323940314);
        int a2 = cs0.a(composer, 0);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c2 = LayoutKt.c(a);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a3);
        } else {
            composer.p();
        }
        Composer a4 = Updater.a(composer);
        Updater.c(a4, g, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        it2Var2.invoke(obj2, composer, 0);
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
    }
}
