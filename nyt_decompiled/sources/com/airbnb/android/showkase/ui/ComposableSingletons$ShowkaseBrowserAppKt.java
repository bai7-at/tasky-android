package com.airbnb.android.showkase.ui;

import android.content.Context;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.em0;
import defpackage.gm6;
import defpackage.gt2;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.yd7;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ShowkaseBrowserAppKt {
    public static final ComposableSingletons$ShowkaseBrowserAppKt a = new ComposableSingletons$ShowkaseBrowserAppKt();
    public static gt2 b = zr0.c(1662328616, false, new gt2() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-1$1
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
                b.S(1662328616, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-1.<anonymous> (ShowkaseBrowserApp.kt:306)");
            }
            String string = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getString(gm6.search_label);
            zq3.g(string, "LocalContext.current.get…ng(R.string.search_label)");
            TextKt.e(string, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-396295222, false, new gt2() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-2$1
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
                b.S(-396295222, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-2.<anonymous> (ShowkaseBrowserApp.kt:322)");
            }
            IconKt.a(yd7.a(oe3.a.a), "Search Icon", null, 0L, composer, 48, 12);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 d = zr0.c(-227151447, false, new gt2() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-3$1
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
                b.S(-227151447, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-3.<anonymous> (ShowkaseBrowserApp.kt:332)");
            }
            IconKt.a(em0.a(oe3.a.a), "Clear Search Field", null, 0L, composer, 48, 12);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 e = zr0.c(1818908679, false, new gt2() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-4$1
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
                b.S(1818908679, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-4.<anonymous> (ShowkaseBrowserApp.kt:357)");
            }
            IconKt.a(yd7.a(oe3.a.a), "Search Icon", null, 0L, composer, 48, 12);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }

    public final gt2 c() {
        return d;
    }

    public final gt2 d() {
        return e;
    }
}
