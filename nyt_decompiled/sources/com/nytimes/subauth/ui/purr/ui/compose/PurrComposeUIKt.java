package com.nytimes.subauth.ui.purr.ui.compose;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.g;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.nytimes.android.composeui.base.AppBarWithTitleContentKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ek8;
import defpackage.fk;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m36;
import defpackage.mf6;
import defpackage.mm2;
import defpackage.mm6;
import defpackage.n37;
import defpackage.qs2;
import defpackage.r81;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class PurrComposeUIKt {
    public static final void a(final int i, final NavController navController, Composer composer, final int i2) {
        zq3.h(navController, "navController");
        Composer h = composer.h(607000647);
        if (b.G()) {
            b.S(607000647, i2, -1, "com.nytimes.subauth.ui.purr.ui.compose.PurrAppbar (PurrComposeUI.kt:24)");
        }
        Object m = h.m(AndroidCompositionLocals_androidKt.g());
        final Activity activity = m instanceof Activity ? (Activity) m : null;
        final String string = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getString(mm6.privacy_settings);
        zq3.g(string, "getString(...)");
        AppBarWithTitleContentKt.a(null, zr0.b(h, -571313632, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.PurrComposeUIKt$PurrAppbar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-571313632, i3, -1, "com.nytimes.subauth.ui.purr.ui.compose.PurrAppbar.<anonymous> (PurrComposeUI.kt:30)");
                }
                int i4 = i;
                composer2.z(693286680);
                Modifier.a aVar = Modifier.a;
                Arrangement.e f = Arrangement.a.f();
                Alignment.a aVar2 = Alignment.a;
                rg4 a = m.a(f, aVar2.l(), composer2, 0);
                composer2.z(-1323940314);
                fm1 fm1Var = (fm1) composer2.m(CompositionLocalsKt.e());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.m(CompositionLocalsKt.j());
                r99 r99Var = (r99) composer2.m(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a2 = companion.a();
                it2 b = LayoutKt.b(aVar);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a2);
                } else {
                    composer2.p();
                }
                composer2.H();
                Composer a3 = Updater.a(composer2);
                Updater.c(a3, a, companion.e());
                Updater.c(a3, fm1Var, companion.c());
                Updater.c(a3, layoutDirection, companion.d());
                Updater.c(a3, r99Var, companion.h());
                composer2.c();
                b.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                composer2.z(-678309503);
                n37 n37Var = n37.a;
                String b2 = k48.b(i4, composer2, 0);
                long a4 = m36.a.a(composer2, 6).a();
                long g = ek8.g(18);
                long e = ek8.e(23.4d);
                TextKt.e(b2, n37Var.c(aVar, aVar2.i()), a4, g, null, new o(600), mm2.b(g.b(mf6.font_franklin_bold, null, 0, 0, 14, null)), 0L, null, null, e, 0, false, 0, null, null, composer2, 199680, 6, 64400);
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), false, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.PurrComposeUIKt$PurrAppbar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m788invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m788invoke() {
                NavDestination e;
                NavBackStackEntry C = NavController.this.C();
                if (!zq3.c((C == null || (e = C.e()) == null) ? null : e.v(), string)) {
                    NavController.this.V();
                    return;
                }
                Activity activity2 = activity;
                if (activity2 != null) {
                    activity2.finish();
                }
            }
        }, r81.a(h, 0) ? bu1.g(0) : fk.a.b(), m36.a.a(h, 6).b().c(), 0L, h, 48, 69);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.PurrComposeUIKt$PurrAppbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    PurrComposeUIKt.a(i, navController, composer2, i2 | 1);
                }
            });
        }
    }
}
