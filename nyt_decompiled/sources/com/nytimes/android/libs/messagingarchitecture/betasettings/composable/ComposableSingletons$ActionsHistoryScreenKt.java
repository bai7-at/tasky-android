package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zl1;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ActionsHistoryScreenKt {
    public static final ComposableSingletons$ActionsHistoryScreenKt a = new ComposableSingletons$ActionsHistoryScreenKt();
    public static gt2 b = zr0.c(-274770953, false, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ActionsHistoryScreenKt$lambda-1$1
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
                b.S(-274770953, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ActionsHistoryScreenKt.lambda-1.<anonymous> (ActionsHistoryScreen.kt:46)");
            }
            TextKt.c("Clear history", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-237775750, false, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ActionsHistoryScreenKt$lambda-2$1
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
                b.S(-237775750, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$ActionsHistoryScreenKt.lambda-2.<anonymous> (ActionsHistoryScreen.kt:47)");
            }
            IconKt.a(zl1.a(oe3.b.a), null, null, 0L, composer, 48, 12);
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
}
