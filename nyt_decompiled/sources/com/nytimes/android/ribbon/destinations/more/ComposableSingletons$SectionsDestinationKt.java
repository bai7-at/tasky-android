package com.nytimes.android.ribbon.destinations.more;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$SectionsDestinationKt {
    public static final ComposableSingletons$SectionsDestinationKt a = new ComposableSingletons$SectionsDestinationKt();
    public static gt2 b = zr0.c(1550771157, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.more.ComposableSingletons$SectionsDestinationKt$lambda-1$1
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
                b.S(1550771157, i, -1, "com.nytimes.android.ribbon.destinations.more.ComposableSingletons$SectionsDestinationKt.lambda-1.<anonymous> (SectionsDestination.kt:75)");
            }
            XpnDividersKt.a(null, 0L, null, composer, 0, 7);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
