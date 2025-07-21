package com.nytimes.android.onboarding.compose.subscribe;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.eb5;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.rl6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$SubscriptionOptionsScreenKt {
    public static final ComposableSingletons$SubscriptionOptionsScreenKt a = new ComposableSingletons$SubscriptionOptionsScreenKt();
    public static it2 b = zr0.c(-985200191, false, new it2() { // from class: com.nytimes.android.onboarding.compose.subscribe.ComposableSingletons$SubscriptionOptionsScreenKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$Button");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-985200191, i, -1, "com.nytimes.android.onboarding.compose.subscribe.ComposableSingletons$SubscriptionOptionsScreenKt.lambda-1.<anonymous> (SubscriptionOptionsScreen.kt:171)");
            }
            TextKt.c(k48.b(rl6.upsell_susbcribe_button, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).R0(), composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(1245613390, false, new it2() { // from class: com.nytimes.android.onboarding.compose.subscribe.ComposableSingletons$SubscriptionOptionsScreenKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$TextButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1245613390, i, -1, "com.nytimes.android.onboarding.compose.subscribe.ComposableSingletons$SubscriptionOptionsScreenKt.lambda-2.<anonymous> (SubscriptionOptionsScreen.kt:181)");
            }
            TextKt.c(k48.b(rl6.upsell_continue_copy, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).V0(), composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }
}
