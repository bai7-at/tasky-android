package com.nytimes.android.features.home.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import defpackage.ac0;
import defpackage.do5;
import defpackage.gt2;
import defpackage.he6;
import defpackage.ie6;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeFragmentKt {
    public static final ComposableSingletons$HomeFragmentKt a = new ComposableSingletons$HomeFragmentKt();
    public static it2 b = zr0.c(-617322055, false, new it2() { // from class: com.nytimes.android.features.home.ui.ComposableSingletons$HomeFragmentKt$lambda-1$1
        public final void b(ac0 ac0Var, Composer composer, int i) {
            zq3.h(ac0Var, "$this$MainTopAppBar");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-617322055, i, -1, "com.nytimes.android.features.home.ui.ComposableSingletons$HomeFragmentKt.lambda-1.<anonymous> (HomeFragment.kt:299)");
            }
            ImageKt.b(do5.d(he6.nyt_nameplate, composer, 0), null, null, null, null, 0.0f, null, composer, 56, 124);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static gt2 c = zr0.c(-1714685189, false, new gt2() { // from class: com.nytimes.android.features.home.ui.ComposableSingletons$HomeFragmentKt$lambda-2$1
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
                androidx.compose.runtime.b.S(-1714685189, i, -1, "com.nytimes.android.features.home.ui.ComposableSingletons$HomeFragmentKt.lambda-2.<anonymous> (HomeFragment.kt:315)");
            }
            IconKt.b(do5.d(ie6.ic_account, composer, 0), "account", null, 0L, composer, 56, 12);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }
}
