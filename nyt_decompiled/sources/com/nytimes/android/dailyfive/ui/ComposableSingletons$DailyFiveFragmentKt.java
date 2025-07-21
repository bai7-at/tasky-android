package com.nytimes.android.dailyfive.ui;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import defpackage.ac0;
import defpackage.do5;
import defpackage.fk6;
import defpackage.gt2;
import defpackage.ie6;
import defpackage.it2;
import defpackage.k48;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DailyFiveFragmentKt {
    public static final ComposableSingletons$DailyFiveFragmentKt a = new ComposableSingletons$DailyFiveFragmentKt();
    public static it2 b = zr0.c(1397992474, false, new it2() { // from class: com.nytimes.android.dailyfive.ui.ComposableSingletons$DailyFiveFragmentKt$lambda-1$1
        public final void b(ac0 ac0Var, Composer composer, int i) {
            zq3.h(ac0Var, "$this$MainTopAppBar");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1397992474, i, -1, "com.nytimes.android.dailyfive.ui.ComposableSingletons$DailyFiveFragmentKt.lambda-1.<anonymous> (DailyFiveFragment.kt:109)");
            }
            TextKt.c(k48.b(fk6.daily_five_for_you_title, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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
    public static gt2 c = zr0.c(754385171, false, new gt2() { // from class: com.nytimes.android.dailyfive.ui.ComposableSingletons$DailyFiveFragmentKt$lambda-2$1
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
                androidx.compose.runtime.b.S(754385171, i, -1, "com.nytimes.android.dailyfive.ui.ComposableSingletons$DailyFiveFragmentKt.lambda-2.<anonymous> (DailyFiveFragment.kt:117)");
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
