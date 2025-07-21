package com.nytimes.android.preference;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.comscore.streaming.ContentType;
import defpackage.do5;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.it2;
import defpackage.ww8;
import defpackage.ye6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$SavedForLaterPreferenceLayoutKt {
    public static final ComposableSingletons$SavedForLaterPreferenceLayoutKt a = new ComposableSingletons$SavedForLaterPreferenceLayoutKt();
    public static it2 b = zr0.c(230500080, false, new it2() { // from class: com.nytimes.android.preference.ComposableSingletons$SavedForLaterPreferenceLayoutKt$lambda-1$1
        public final void b(String str, Composer composer, int i) {
            zq3.h(str, "it");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(230500080, i, -1, "com.nytimes.android.preference.ComposableSingletons$SavedForLaterPreferenceLayoutKt.lambda-1.<anonymous> (SavedForLaterPreferenceLayout.kt:141)");
            }
            float F = ((fm1) composer.m(CompositionLocalsKt.e())).F(ek8.g(16));
            ImageKt.b(do5.d(ye6.ic_saved_outline, composer, 0), "Saved for Later", SizeKt.m(Modifier.a, F, F), Alignment.a.e(), null, 0.0f, null, composer, 3128, ContentType.LONG_FORM_ON_DEMAND);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
