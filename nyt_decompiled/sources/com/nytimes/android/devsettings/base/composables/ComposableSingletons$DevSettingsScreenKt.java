package com.nytimes.android.devsettings.base.composables;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nytimes.android.devsettings.utils.ProcessPhoenix;
import defpackage.bu1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jt1;
import defpackage.l8;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.wh;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DevSettingsScreenKt {
    public static final ComposableSingletons$DevSettingsScreenKt a = new ComposableSingletons$DevSettingsScreenKt();
    public static gt2 b = zr0.c(-1914499301, false, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt$lambda-1$1
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
                b.S(-1914499301, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt.lambda-1.<anonymous> (DevSettingsScreen.kt:86)");
            }
            IconKt.a(l8.a(oe3.a.a), null, PaddingKt.m(Modifier.a, 0.0f, 0.0f, bu1.g(8), 0.0f, 11, null), 0L, composer, 432, 8);
            TextKt.e("Dev settings", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(-1363324730, false, new it2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(wh whVar, Composer composer, int i) {
            zq3.h(whVar, "$this$AnimatedVisibility");
            if (b.G()) {
                b.S(-1363324730, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt.lambda-2.<anonymous> (DevSettingsScreen.kt:152)");
            }
            DevSettingsScreenKt.g(composer, 0);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(-3839383, false, new it2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt$lambda-3$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(wh whVar, Composer composer, int i) {
            zq3.h(whVar, "$this$AnimatedVisibility");
            if (b.G()) {
                b.S(-3839383, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt.lambda-3.<anonymous> (DevSettingsScreen.kt:157)");
            }
            final Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
            PreferenceItemComposableKt.d("Restart the app", null, "No data will be cleared", new qs2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt$lambda-3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m346invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m346invoke() {
                    ProcessPhoenix.Companion.e(context);
                }
            }, null, null, composer, 390, 50);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 e = zr0.c(-441284385, false, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt$lambda-4$1
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
                b.S(-441284385, i, -1, "com.nytimes.android.devsettings.base.composables.ComposableSingletons$DevSettingsScreenKt.lambda-4.<anonymous> (DevSettingsScreen.kt:199)");
            }
            IconKt.a(jt1.a(oe3.a.a()), null, PaddingKt.m(Modifier.a, 0.0f, 0.0f, bu1.g(12), 0.0f, 11, null), 0L, composer, 432, 8);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }

    public final it2 c() {
        return d;
    }

    public final gt2 d() {
        return e;
    }
}
