package com.nytimes.android.utils.composeutils;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.ap0;
import defpackage.as0;
import defpackage.bs0;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fd5;
import defpackage.fu1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ComposablePositionsKt {
    public static final ComposableSingletons$ComposablePositionsKt a = new ComposableSingletons$ComposablePositionsKt();
    public static mt2 b = zr0.c(1644516792, false, new mt2() { // from class: com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt$lambda-1$1
        public final void b(Modifier modifier, long j, qs2 qs2Var, Composer composer, int i) {
            zq3.h(modifier, "$anonymous$parameter$0$");
            zq3.h(qs2Var, "$anonymous$parameter$2$");
            if ((i & 5121) == 1024 && composer.i()) {
                composer.K();
                return;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1644516792, i, -1, "com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt.lambda-1.<anonymous> (ComposablePositions.kt:75)");
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }

        @Override // defpackage.mt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            b((Modifier) obj, ((fu1) obj2).k(), (qs2) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return ww8.a;
        }
    });
    public static gt2 c = zr0.c(-1976569131, false, ComposableSingletons$ComposablePositionsKt$lambda2$1.a);
    public static gt2 d = zr0.c(-453129832, false, new gt2() { // from class: com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt$lambda-3$1
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
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-453129832, i, -1, "com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt.lambda-3.<anonymous> (ComposablePositions.kt:149)");
            }
            as0 as0Var = (as0) ((bs0) composer.m(ComposablePositionsKt.b())).a().get("exampleText");
            fd5 d2 = as0Var != null ? fd5.d(as0Var.c()) : null;
            composer.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a2 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
            composer.z(-1323940314);
            int a3 = cs0.a(composer, 0);
            et0 o = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a4);
            } else {
                composer.p();
            }
            Composer a5 = Updater.a(composer);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            ap0 ap0Var = ap0.a;
            TextKt.c("Offset: " + d2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            TextKt.c("This is an example 2", ComposablePositionsKt.d(aVar, "exampleText", null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131068);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
    });

    public final mt2 a() {
        return b;
    }
}
