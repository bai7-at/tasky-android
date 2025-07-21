package com.nytimes.android.features.settings.legal;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.k48;
import defpackage.m37;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LegalUiKt {
    public static final ComposableSingletons$LegalUiKt a = new ComposableSingletons$LegalUiKt();
    public static it2 b = zr0.c(1500891868, false, new it2() { // from class: com.nytimes.android.features.settings.legal.ComposableSingletons$LegalUiKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$OutlinedButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1500891868, i, -1, "com.nytimes.android.features.settings.legal.ComposableSingletons$LegalUiKt.lambda-1.<anonymous> (LegalUi.kt:51)");
            }
            TextKt.c(k48.b(xk6.legal_error_retry, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }
}
