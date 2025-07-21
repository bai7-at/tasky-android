package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class ComposableSingletons$DialogNavigatorKt {
    public static final ComposableSingletons$DialogNavigatorKt a = new ComposableSingletons$DialogNavigatorKt();
    public static it2 b = zr0.c(-1092249270, false, new it2() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1
        public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1092249270, i, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:64)");
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
