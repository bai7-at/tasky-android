package com.nytimes.android.utils.composeutils;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.ap0;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fd5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ComposablePositionsKt$lambda2$1 extends Lambda implements gt2 {
    public static final ComposableSingletons$ComposablePositionsKt$lambda2$1 a = new ComposableSingletons$ComposablePositionsKt$lambda2$1();

    ComposableSingletons$ComposablePositionsKt$lambda2$1() {
        super(2);
    }

    private static final long c(sy4 sy4Var) {
        return ((fd5) sy4Var.getValue()).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, long j) {
        sy4Var.setValue(fd5.d(j));
    }

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
            androidx.compose.runtime.b.S(-1976569131, i, -1, "com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt.lambda-2.<anonymous> (ComposablePositions.kt:124)");
        }
        composer.z(1959491768);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(fd5.d(fd5.b.c()), null, 2, null);
            composer.q(A);
        }
        sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(1959491853);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            A2 = new ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1(sy4Var, null);
            composer.q(A2);
        }
        composer.R();
        ComposablePositionsKt.a((gt2) A2, composer, 8);
        composer.z(-483455358);
        Modifier.a aVar2 = Modifier.a;
        rg4 a2 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
        composer.z(-1323940314);
        int a3 = cs0.a(composer, 0);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(aVar2);
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
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        ap0 ap0Var = ap0.a;
        TextKt.c("Offset: " + fd5.v(c(sy4Var)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        TextKt.c("This is an example 1", ComposablePositionsKt.d(aVar2, "exampleText", null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131068);
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
    }
}
