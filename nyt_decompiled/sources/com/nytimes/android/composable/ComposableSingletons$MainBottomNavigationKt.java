package com.nytimes.android.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.d37;
import defpackage.eb5;
import defpackage.it2;
import defpackage.wh;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MainBottomNavigationKt {
    public static final ComposableSingletons$MainBottomNavigationKt a = new ComposableSingletons$MainBottomNavigationKt();
    public static it2 b = zr0.c(1933177663, false, new it2() { // from class: com.nytimes.android.composable.ComposableSingletons$MainBottomNavigationKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(wh whVar, Composer composer, int i) {
            zq3.h(whVar, "$this$AnimatedVisibility");
            if (b.G()) {
                b.S(1933177663, i, -1, "com.nytimes.android.composable.ComposableSingletons$MainBottomNavigationKt.lambda-1.<anonymous> (MainBottomNavigation.kt:174)");
            }
            eb5.a aVar = eb5.Companion;
            TextKt.c("NEW", PaddingKt.j(BackgroundKt.c(OffsetKt.b(Modifier.a, bu1.g(16), bu1.g(-2)), aVar.a(composer, 8).J(), d37.c(bu1.g(4))), bu1.g(3), bu1.g(1)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.c(composer, 8).p0(), composer, 6, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
