package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.k30;
import defpackage.o76;
import defpackage.pa9;
import defpackage.sa9;
import defpackage.t21;
import defpackage.u87;
import defpackage.ww8;
import defpackage.zr0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class NavBackStackEntryProviderKt {
    public static final void a(final NavBackStackEntry navBackStackEntry, final u87 u87Var, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-1579360880);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1579360880, i, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
        }
        CompositionLocalKt.b(new o76[]{LocalViewModelStoreOwner.a.b(navBackStackEntry), AndroidCompositionLocals_androidKt.i().c(navBackStackEntry), AndroidCompositionLocals_androidKt.j().c(navBackStackEntry)}, zr0.b(h, -52928304, true, new gt2() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-52928304, i2, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                }
                NavBackStackEntryProviderKt.b(u87.this, gt2Var, composer2, ((i >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 8);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, 56);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                NavBackStackEntryProviderKt.a(NavBackStackEntry.this, u87Var, gt2Var, composer2, gt6.a(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final u87 u87Var, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(1211832233);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1211832233, i, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
        }
        h.z(1729797275);
        sa9 a = LocalViewModelStoreOwner.a.a(h, 6);
        if (a == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q c = pa9.c(k30.class, a, null, null, a instanceof d ? ((d) a).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
        h.R();
        k30 k30Var = (k30) c;
        k30Var.g(new WeakReference(u87Var));
        u87Var.f(k30Var.e(), gt2Var, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$SaveableStateProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                NavBackStackEntryProviderKt.b(u87.this, gt2Var, composer2, gt6.a(i | 1));
            }
        });
    }
}
