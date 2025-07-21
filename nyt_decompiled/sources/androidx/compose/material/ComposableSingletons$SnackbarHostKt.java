package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.it2;
import defpackage.tv7;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt a = new ComposableSingletons$SnackbarHostKt();
    public static it2 b = zr0.c(996639038, false, new it2() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        public final void b(tv7 tv7Var, Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.S(tv7Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            SnackbarKt.d(tv7Var, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((tv7) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
