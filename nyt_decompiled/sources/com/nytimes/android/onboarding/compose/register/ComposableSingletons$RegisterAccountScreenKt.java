package com.nytimes.android.onboarding.compose.register;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.eb5;
import defpackage.it2;
import defpackage.m37;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$RegisterAccountScreenKt {
    public static final ComposableSingletons$RegisterAccountScreenKt a = new ComposableSingletons$RegisterAccountScreenKt();
    public static it2 b = zr0.c(-1994825623, false, new it2() { // from class: com.nytimes.android.onboarding.compose.register.ComposableSingletons$RegisterAccountScreenKt$lambda-1$1
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
                b.S(-1994825623, i, -1, "com.nytimes.android.onboarding.compose.register.ComposableSingletons$RegisterAccountScreenKt.lambda-1.<anonymous> (RegisterAccountScreen.kt:76)");
            }
            TextKt.c("Create a free account", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).L0(), composer, 6, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-1818814276, false, new it2() { // from class: com.nytimes.android.onboarding.compose.register.ComposableSingletons$RegisterAccountScreenKt$lambda-2$1
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
                b.S(-1818814276, i, -1, "com.nytimes.android.onboarding.compose.register.ComposableSingletons$RegisterAccountScreenKt.lambda-2.<anonymous> (RegisterAccountScreen.kt:86)");
            }
            TextKt.c("Not now", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).O0(), composer, 6, 0, 65534);
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
