package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CommentThreadContentKt {
    public static final ComposableSingletons$CommentThreadContentKt INSTANCE = new ComposableSingletons$CommentThreadContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static it2 f0lambda1 = zr0.c(-738185384, false, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentThreadContentKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$item");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-738185384, i, -1, "com.nytimes.android.comments.comments.mvi.view.ComposableSingletons$CommentThreadContentKt.lambda-1.<anonymous> (CommentThreadContent.kt:100)");
            }
            Modifier h = SizeKt.h(Modifier.a, 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            composer.z(693286680);
            rg4 a = m.a(b, Alignment.a.l(), composer, 6);
            composer.z(-1323940314);
            int a2 = cs0.a(composer, 0);
            et0 o = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(h);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a3);
            } else {
                composer.p();
            }
            Composer a4 = Updater.a(composer);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            n37 n37Var = n37.a;
            ProgressIndicatorKt.a(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (b.G()) {
                b.R();
            }
        }
    });

    /* renamed from: getLambda-1$comments_release, reason: not valid java name */
    public final it2 m241getLambda1$comments_release() {
        return f0lambda1;
    }
}
