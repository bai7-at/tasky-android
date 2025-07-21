package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bu1;
import defpackage.do5;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.oe3;
import defpackage.p8;
import defpackage.qn0;
import defpackage.ww8;
import defpackage.ye6;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommonContentKt {
    public static final ComposableSingletons$CommonContentKt a = new ComposableSingletons$CommonContentKt();
    public static it2 b = zr0.c(-1866196695, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1866196695, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt.lambda-1.<anonymous> (CommonContent.kt:129)");
            }
            TextKt.c(k48.b(yk6.see_all, composer, 0), PaddingKt.k(Modifier.a, 0.0f, bu1.g(8), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).z1(), composer, 48, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(431925627, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt$lambda-2$1
        public final void b(String str, Composer composer, int i) {
            zq3.h(str, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(431925627, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt.lambda-2.<anonymous> (CommonContent.kt:147)");
            }
            float F = ((fm1) composer.m(CompositionLocalsKt.e())).F(ek8.e(19.5d));
            ImageKt.b(do5.d(ye6.ic_saved_outline, composer, 0), "Saved for Later", SizeKt.m(Modifier.a, F, F), Alignment.a.e(), null, 0.0f, qn0.a.b(qn0.b, eb5.Companion.a(composer, 8).r(), 0, 2, null), composer, 3128, 48);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static it2 d = zr0.c(1216441495, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt$lambda-3$1
        public final void b(String str, Composer composer, int i) {
            zq3.h(str, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1216441495, i, -1, "com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt.lambda-3.<anonymous> (CommonContent.kt:170)");
            }
            float F = ((fm1) composer.m(CompositionLocalsKt.e())).F(ek8.e(19.5d));
            ImageKt.a(p8.a(oe3.a.a()), "Add", SizeKt.m(Modifier.a, F, F), Alignment.a.e(), null, 0.0f, qn0.a.b(qn0.b, eb5.Companion.a(composer, 8).r(), 0, 2, null), composer, 3120, 48);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return c;
    }

    public final it2 b() {
        return d;
    }
}
