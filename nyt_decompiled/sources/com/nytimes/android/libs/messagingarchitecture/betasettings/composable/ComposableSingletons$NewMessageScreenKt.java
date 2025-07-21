package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.ch3;
import defpackage.it2;
import defpackage.m37;
import defpackage.nn0;
import defpackage.oe3;
import defpackage.p87;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ComposableSingletons$NewMessageScreenKt {
    public static final ComposableSingletons$NewMessageScreenKt a = new ComposableSingletons$NewMessageScreenKt();
    public static it2 b = zr0.c(1231034675, false, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$NewMessageScreenKt$lambda-1$1
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
                b.S(1231034675, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$NewMessageScreenKt.lambda-1.<anonymous> (NewMessageScreen.kt:53)");
            }
            ch3 a2 = p87.a(oe3.b.a);
            Modifier.a aVar = Modifier.a;
            a aVar2 = a.a;
            Modifier n = SizeKt.n(aVar, aVar2.d());
            nn0.a aVar3 = nn0.b;
            IconKt.a(a2, "Create New Message button", n, aVar3.i(), composer, 3120, 0);
            SpacerKt.a(SizeKt.n(aVar, aVar2.e()), composer, 0);
            String upperCase = "Save Message".toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            TextKt.c(upperCase, null, aVar3.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 384, 0, 131066);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
