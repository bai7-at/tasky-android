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
import defpackage.p8;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$InterestsContentHeaderKt {
    public static final ComposableSingletons$InterestsContentHeaderKt a = new ComposableSingletons$InterestsContentHeaderKt();
    public static gt2 b = zr0.c(-11062538, false, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$InterestsContentHeaderKt$lambda-1$1
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
                b.S(-11062538, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ComposableSingletons$InterestsContentHeaderKt.lambda-1.<anonymous> (InterestsContentHeader.kt:124)");
            }
            IconKt.a(p8.a(oe3.a.a()), k48.b(yk6.add_content_description, composer, 0), SizeKt.n(Modifier.a, bu1.g(20)), eb5.Companion.b(composer, 8).g(), composer, 384, 0);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
