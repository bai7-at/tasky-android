package com.nytimes.android.ribbon.composable;

import androidx.compose.runtime.Composer;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$XpnModuleKt {
    public static final ComposableSingletons$XpnModuleKt a = new ComposableSingletons$XpnModuleKt();
    public static gt2 b = zr0.c(1261486843, false, new gt2() { // from class: com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt$lambda-1$1
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
                androidx.compose.runtime.b.S(1261486843, i, -1, "com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt.lambda-1.<anonymous> (XpnModule.kt:39)");
            }
            XpnDividersKt.a(null, 0L, null, composer, 0, 7);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });
    public static gt2 c = zr0.c(2112634776, false, new gt2() { // from class: com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt$lambda-2$1
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
                androidx.compose.runtime.b.S(2112634776, i, -1, "com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt.lambda-2.<anonymous> (XpnModule.kt:89)");
            }
            XpnDividersKt.a(null, 0L, null, composer, 0, 7);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }
}
