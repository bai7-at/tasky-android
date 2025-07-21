package com.nytimes.android.devsettings.search;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.yd7;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DevSettingSearchViewKt {
    public static final ComposableSingletons$DevSettingSearchViewKt a = new ComposableSingletons$DevSettingSearchViewKt();
    public static gt2 b = zr0.c(-393765196, false, new gt2() { // from class: com.nytimes.android.devsettings.search.ComposableSingletons$DevSettingSearchViewKt$lambda-1$1
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
                b.S(-393765196, i, -1, "com.nytimes.android.devsettings.search.ComposableSingletons$DevSettingSearchViewKt.lambda-1.<anonymous> (DevSettingSearchView.kt:41)");
            }
            TextKt.e("Search Dev Settings", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, 65534);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(1500568690, false, new gt2() { // from class: com.nytimes.android.devsettings.search.ComposableSingletons$DevSettingSearchViewKt$lambda-2$1
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
                b.S(1500568690, i, -1, "com.nytimes.android.devsettings.search.ComposableSingletons$DevSettingSearchViewKt.lambda-2.<anonymous> (DevSettingSearchView.kt:48)");
            }
            IconKt.a(yd7.a(oe3.a.a), "Search", null, 0L, composer, 48, 12);
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
