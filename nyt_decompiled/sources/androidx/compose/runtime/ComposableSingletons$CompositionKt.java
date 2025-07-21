package androidx.compose.runtime;

import defpackage.gt2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt a = new ComposableSingletons$CompositionKt();
    public static gt2 b = zr0.c(954879418, false, new gt2() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
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
                b.S(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:607)");
            }
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(1918065384, false, new gt2() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
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
                b.S(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:739)");
            }
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
