package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.k48;
import defpackage.oe3;
import defpackage.rv4;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ContextMenuKt {
    public static final ComposableSingletons$ContextMenuKt a = new ComposableSingletons$ContextMenuKt();
    public static gt2 b = zr0.c(281761624, false, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$ContextMenuKt$lambda-1$1
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
                b.S(281761624, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$ContextMenuKt.lambda-1.<anonymous> (ContextMenu.kt:53)");
            }
            IconKt.a(rv4.a(oe3.a.a()), k48.b(yk6.kebab_content_description, composer, 0), SizeKt.n(Modifier.a, bu1.g(20)), eb5.Companion.a(composer, 8).l(), composer, 384, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
