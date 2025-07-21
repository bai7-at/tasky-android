package com.nytimes.android.comments.comments.mvi.navigation;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.i;
import com.nytimes.android.logging.NYTLogger;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.n25;
import defpackage.py1;
import defpackage.ss2;
import defpackage.vz5;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NavigatorKt {
    public static final void NavigationEffects(final NavigationIntent navigationIntent, final n25 n25Var, Composer composer, final int i) {
        zq3.h(navigationIntent, "destination");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(149424601);
        if (b.G()) {
            b.S(149424601, i, -1, "com.nytimes.android.comments.comments.mvi.navigation.NavigationEffects (Navigator.kt:61)");
        }
        Object m = h.m(AndroidCompositionLocals_androidKt.g());
        py1.d(navigationIntent, new NavigatorKt$NavigationEffects$1(m instanceof Activity ? (Activity) m : null, n25Var, navigationIntent, null), h, (i & 14) | 64);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.NavigatorKt$NavigationEffects$2
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
                    NavigatorKt.NavigationEffects(NavigationIntent.this, n25Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popUpTo(final n25 n25Var, String str) {
        try {
            n25Var.A(str);
        } catch (IllegalArgumentException e) {
            NYTLogger.h(e);
            n25Var.R(str, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.NavigatorKt$popUpTo$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((i) obj);
                    return ww8.a;
                }

                public final void invoke(i iVar) {
                    NavDestination e2;
                    String v;
                    zq3.h(iVar, "$this$navigate");
                    NavBackStackEntry C = n25.this.C();
                    if (C == null || (e2 = C.e()) == null || (v = e2.v()) == null) {
                        return;
                    }
                    iVar.d(v, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.NavigatorKt$popUpTo$1$1$1
                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((vz5) obj);
                            return ww8.a;
                        }

                        public final void invoke(vz5 vz5Var) {
                            zq3.h(vz5Var, "$this$popUpTo");
                            vz5Var.c(true);
                        }
                    });
                }
            });
        }
    }
}
