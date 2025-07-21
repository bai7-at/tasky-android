package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$WirecutterDestinationKt {
    public static final ComposableSingletons$WirecutterDestinationKt a = new ComposableSingletons$WirecutterDestinationKt();
    public static it2 b = zr0.c(-1331176334, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$xpnModule");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1331176334, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt.lambda-1.<anonymous> (WirecutterDestination.kt:157)");
            }
            XpnDividersKt.a(null, eb5.Companion.b(composer, 8).g(), null, composer, 0, 5);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-1012490583, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt$lambda-2$1
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
                b.S(-1012490583, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt.lambda-2.<anonymous> (WirecutterDestination.kt:186)");
            }
            XpnDividersKt.a(null, eb5.Companion.b(composer, 8).g(), null, composer, 0, 5);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(-1919784901, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt$lambda-3$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$item");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1919784901, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.ComposableSingletons$WirecutterDestinationKt.lambda-3.<anonymous> (WirecutterDestination.kt:233)");
            }
            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(24)), composer, 6);
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

    public final it2 c() {
        return d;
    }
}
