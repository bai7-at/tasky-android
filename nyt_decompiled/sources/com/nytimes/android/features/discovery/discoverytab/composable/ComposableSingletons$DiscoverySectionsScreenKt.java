package com.nytimes.android.features.discovery.discoverytab.composable;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.ac0;
import defpackage.it2;
import defpackage.k48;
import defpackage.qk6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DiscoverySectionsScreenKt {
    public static final ComposableSingletons$DiscoverySectionsScreenKt a = new ComposableSingletons$DiscoverySectionsScreenKt();
    public static it2 b = zr0.c(-1189170900, false, new it2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.ComposableSingletons$DiscoverySectionsScreenKt$lambda-1$1
        public final void b(ac0 ac0Var, Composer composer, int i) {
            zq3.h(ac0Var, "$this$MainTopAppBar");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1189170900, i, -1, "com.nytimes.android.features.discovery.discoverytab.composable.ComposableSingletons$DiscoverySectionsScreenKt.lambda-1.<anonymous> (DiscoverySectionsScreen.kt:109)");
            }
            TextKt.c(k48.b(qk6.browse_tab_name, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
