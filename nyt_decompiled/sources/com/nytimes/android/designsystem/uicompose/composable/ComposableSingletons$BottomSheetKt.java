package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.eb5;
import defpackage.em0;
import defpackage.gt2;
import defpackage.ik6;
import defpackage.k48;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$BottomSheetKt {
    public static final ComposableSingletons$BottomSheetKt a = new ComposableSingletons$BottomSheetKt();
    public static gt2 b = zr0.c(61901885, false, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$BottomSheetKt$lambda-1$1
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
                b.S(61901885, i, -1, "com.nytimes.android.designsystem.uicompose.composable.ComposableSingletons$BottomSheetKt.lambda-1.<anonymous> (BottomSheet.kt:94)");
            }
            IconKt.a(em0.a(oe3.a.a()), k48.b(ik6.dismiss, composer, 0), null, eb5.Companion.b(composer, 6).g(), composer, 0, 4);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
