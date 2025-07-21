package com.nytimes.android.features.you.youtab.composable.interests.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public final class ComposableSingletons$FilterInterestKt {
    public static final ComposableSingletons$FilterInterestKt a = new ComposableSingletons$FilterInterestKt();
    public static it2 b = zr0.c(1633582378, false, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.ComposableSingletons$FilterInterestKt$lambda-1$1
        public final void b(List list, Composer composer, int i) {
            zq3.h(list, "it");
            if (b.G()) {
                b.S(1633582378, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.filter.ComposableSingletons$FilterInterestKt.lambda-1.<anonymous> (FilterInterest.kt:78)");
            }
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });
    public static gt2 c = zr0.c(118056779, false, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.ComposableSingletons$FilterInterestKt$lambda-2$1
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
                b.S(118056779, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.filter.ComposableSingletons$FilterInterestKt.lambda-2.<anonymous> (FilterInterest.kt:77)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }
}
