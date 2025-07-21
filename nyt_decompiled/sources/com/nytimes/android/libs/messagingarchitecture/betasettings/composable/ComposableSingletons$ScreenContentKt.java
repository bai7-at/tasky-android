package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ScreenContentKt {
    public static final ComposableSingletons$ScreenContentKt a = new ComposableSingletons$ScreenContentKt();
    public static it2 b = zr0.c(1115651497, false, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt$lambda-1$1
        public final void b(Throwable th, Composer composer, int i) {
            if (b.G()) {
                b.S(1115651497, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt.lambda-1.<anonymous> (ScreenContent.kt:8)");
            }
            TextComposablesKt.a("Error: " + th, composer, 0);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((Throwable) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static gt2 c = zr0.c(1190280039, false, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt$lambda-2$1
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
            if (b.G()) {
                b.S(1190280039, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt.lambda-2.<anonymous> (ScreenContent.kt:9)");
            }
            TextComposablesKt.a("Loading", composer, 6);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(1617127917, false, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt$lambda-3$1
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
            if (b.G()) {
                b.S(1617127917, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ScreenContentKt.lambda-3.<anonymous> (ScreenContent.kt:10)");
            }
            TextComposablesKt.a("Empty", composer, 6);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }

    public final gt2 c() {
        return d;
    }
}
