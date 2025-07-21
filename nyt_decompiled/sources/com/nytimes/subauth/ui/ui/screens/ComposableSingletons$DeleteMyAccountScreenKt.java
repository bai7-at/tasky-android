package com.nytimes.subauth.ui.ui.screens;

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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j98;
import defpackage.ju7;
import defpackage.k48;
import defpackage.mm6;
import defpackage.n37;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DeleteMyAccountScreenKt {
    public static final ComposableSingletons$DeleteMyAccountScreenKt a = new ComposableSingletons$DeleteMyAccountScreenKt();
    public static gt2 b = zr0.c(-944106772, false, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.ComposableSingletons$DeleteMyAccountScreenKt$lambda-1$1
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
                b.S(-944106772, i, -1, "com.nytimes.subauth.ui.ui.screens.ComposableSingletons$DeleteMyAccountScreenKt.lambda-1.<anonymous> (DeleteMyAccountScreen.kt:157)");
            }
            composer.z(693286680);
            Modifier.a aVar = Modifier.a;
            Arrangement.e f = Arrangement.a.f();
            Alignment.a aVar2 = Alignment.a;
            rg4 a2 = m.a(f, aVar2.l(), composer, 0);
            composer.z(-1323940314);
            fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) composer.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) composer.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 b2 = LayoutKt.b(aVar);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a3);
            } else {
                composer.p();
            }
            composer.H();
            Composer a4 = Updater.a(composer);
            Updater.c(a4, a2, companion.e());
            Updater.c(a4, fm1Var, companion.c());
            Updater.c(a4, layoutDirection, companion.d());
            Updater.c(a4, r99Var, companion.h());
            composer.c();
            b2.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            composer.z(-678309503);
            n37 n37Var = n37.a;
            TextKt.e(k48.b(mm6.subauth_account_delete_activity_title, composer, 0), n37Var.c(aVar, aVar2.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(composer, 8).a(), composer, 0, 0, 32764);
            composer.R();
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (b.G()) {
                b.R();
            }
        }
    });

    public final gt2 a() {
        return b;
    }
}
