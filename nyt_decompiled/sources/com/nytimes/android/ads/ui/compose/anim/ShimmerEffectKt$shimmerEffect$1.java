package com.nytimes.android.ads.ui.compose.anim;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.h;
import defpackage.cz3;
import defpackage.di;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.it2;
import defpackage.nn0;
import defpackage.oj3;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yc0;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
final class ShimmerEffectKt$shimmerEffect$1 extends Lambda implements it2 {
    final /* synthetic */ List<nn0> $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShimmerEffectKt$shimmerEffect$1(List list) {
        super(3);
        this.$colors = list;
    }

    private static final long c(sy4 sy4Var) {
        return ((hn3) sy4Var.getValue()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, long j) {
        sy4Var.setValue(hn3.b(j));
    }

    private static final float g(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        zq3.h(modifier, "$this$composed");
        composer.z(-1791471444);
        if (b.G()) {
            b.S(-1791471444, i, -1, "com.nytimes.android.ads.ui.compose.anim.shimmerEffect.<anonymous> (ShimmerEffect.kt:23)");
        }
        composer.z(111839522);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(hn3.b(hn3.b.a()), null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        x08 a = InfiniteTransitionKt.a(InfiniteTransitionKt.d(composer, 0), (-2) * hn3.g(c(sy4Var)), 2 * hn3.g(c(sy4Var)), di.d(di.k(2000, 0, null, 6, null), null, 0L, 6, null), composer, (oj3.d << 9) | InfiniteTransition.f);
        Modifier b = BackgroundKt.b(modifier, yc0.a.b(yc0.b, this.$colors, hd5.a(g(a), 0.0f), hd5.a(g(a) + hn3.g(c(sy4Var)), hn3.f(c(sy4Var))), 0, 8, null), null, 0.0f, 6, null);
        composer.z(111859851);
        boolean S = composer.S(sy4Var);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new ss2() { // from class: com.nytimes.android.ads.ui.compose.anim.ShimmerEffectKt$shimmerEffect$1$1$1
                {
                    super(1);
                }

                public final void b(cz3 cz3Var) {
                    zq3.h(cz3Var, "it");
                    ShimmerEffectKt$shimmerEffect$1.d(sy4.this, cz3Var.a());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((cz3) obj);
                    return ww8.a;
                }
            };
            composer.q(A2);
        }
        composer.R();
        Modifier a2 = h.a(b, (ss2) A2);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }
}
