package com.nytimes.android.ribbon.destinations.opinions;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.tpl.TPLSize;
import defpackage.h04;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$OpinionLockupsKt {
    public static final ComposableSingletons$OpinionLockupsKt a = new ComposableSingletons$OpinionLockupsKt();
    public static it2 b = zr0.c(630696020, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$xpnListModule");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(630696020, i, -1, "com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt.lambda-1.<anonymous> (OpinionLockups.kt:96)");
            }
            XpnDividersKt.b("The Latest", null, false, false, null, composer, 6, 30);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-1486006880, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt$lambda-2$1
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
                b.S(-1486006880, i, -1, "com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt.lambda-2.<anonymous> (OpinionLockups.kt:111)");
            }
            SpacerKt.a(SizeKt.n(Modifier.a, TPLSize.spacing3.m765getValueD9Ej5fM()), composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(1658086217, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt$lambda-3$1
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
                b.S(1658086217, i, -1, "com.nytimes.android.ribbon.destinations.opinions.ComposableSingletons$OpinionLockupsKt.lambda-3.<anonymous> (OpinionLockups.kt:131)");
            }
            XpnDividersKt.b("The Point", null, false, false, null, composer, 6, 30);
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
