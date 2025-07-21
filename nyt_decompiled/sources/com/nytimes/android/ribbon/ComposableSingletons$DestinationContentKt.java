package com.nytimes.android.ribbon;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.do5;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xe6;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DestinationContentKt {
    public static final ComposableSingletons$DestinationContentKt a = new ComposableSingletons$DestinationContentKt();
    public static gt2 b = zr0.c(1725027023, false, new gt2() { // from class: com.nytimes.android.ribbon.ComposableSingletons$DestinationContentKt$lambda-1$1
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
                b.S(1725027023, i, -1, "com.nytimes.android.ribbon.ComposableSingletons$DestinationContentKt.lambda-1.<anonymous> (DestinationContent.kt:328)");
            }
            IconKt.b(do5.d(xe6.ic_search, composer, 0), "search", null, eb5.Companion.b(composer, 8).g(), composer, 56, 4);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
