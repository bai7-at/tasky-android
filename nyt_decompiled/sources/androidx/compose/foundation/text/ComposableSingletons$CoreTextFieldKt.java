package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt a = new ComposableSingletons$CoreTextFieldKt();
    public static it2 b = zr0.c(671295101, false, new it2() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        public final void b(gt2 gt2Var, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.C(gt2Var) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(671295101, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:212)");
            }
            gt2Var.invoke(composer, Integer.valueOf(i & 14));
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((gt2) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
