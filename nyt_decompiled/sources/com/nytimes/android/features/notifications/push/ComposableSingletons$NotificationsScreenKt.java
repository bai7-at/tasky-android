package com.nytimes.android.features.notifications.push;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.uk6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$NotificationsScreenKt {
    public static final ComposableSingletons$NotificationsScreenKt a = new ComposableSingletons$NotificationsScreenKt();
    public static gt2 b = zr0.c(839203211, false, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt$lambda-1$1
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
                androidx.compose.runtime.b.S(839203211, i, -1, "com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt.lambda-1.<anonymous> (NotificationsScreen.kt:33)");
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });
    public static gt2 c = zr0.c(-942244314, false, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt$lambda-2$1
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
                androidx.compose.runtime.b.S(-942244314, i, -1, "com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt.lambda-2.<anonymous> (NotificationsScreen.kt:52)");
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });
    public static it2 d = zr0.c(-1178075402, false, new it2() { // from class: com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt$lambda-3$1
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
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1178075402, i, -1, "com.nytimes.android.features.notifications.push.ComposableSingletons$NotificationsScreenKt.lambda-3.<anonymous> (NotificationsScreen.kt:98)");
            }
            TextKt.c(k48.b(uk6.notification_adjust_settings, composer, 0), PaddingKt.i(Modifier.a, bu1.g(8)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer, 8).r0(), composer, 48, 0, 65532);
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

    public final it2 c() {
        return d;
    }
}
