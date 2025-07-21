package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import defpackage.ap0;
import defpackage.bm6;
import defpackage.bu1;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gv1;
import defpackage.h04;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.k48;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ComposableSingletons$GreatReadsLockupsKt {
    public static final ComposableSingletons$GreatReadsLockupsKt a = new ComposableSingletons$GreatReadsLockupsKt();
    public static it2 b = zr0.c(2070547177, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.ComposableSingletons$GreatReadsLockupsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i) {
            zq3.h(h04Var, "$this$xpnListModule");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(2070547177, i, -1, "com.nytimes.android.ribbon.destinations.greatreads.ComposableSingletons$GreatReadsLockupsKt.lambda-1.<anonymous> (GreatReadsLockups.kt:50)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier k = PaddingKt.k(aVar, bu1.g(20), 0.0f, 2, null);
            composer.z(-483455358);
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
            composer.z(-1323940314);
            int a3 = cs0.a(composer, 0);
            et0 o = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(k);
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
            float f = 24;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), composer, 6);
            composer.z(285665417);
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            c0064a.i(k48.b(bm6.great_reads_title_bold, composer, 0));
            composer.z(285665549);
            int n = c0064a.n(new jy7(0L, 0L, o.b.h(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null));
            try {
                c0064a.i(" — " + k48.b(bm6.great_reads_title_regular, composer, 0));
                ww8 ww8Var = ww8.a;
                c0064a.k(n);
                composer.R();
                a o2 = c0064a.o();
                composer.R();
                TextKt.d(o2, null, eb5.Companion.b(composer, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, XPNTypography.titleBold16.getValue(), composer, 0, 0, 131066);
                SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), composer, 6);
                composer.R();
                composer.t();
                composer.R();
                composer.R();
                if (b.G()) {
                    b.R();
                }
            } catch (Throwable th) {
                c0064a.k(n);
                throw th;
            }
        }
    });
    public static gt2 c = zr0.c(2014099975, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.ComposableSingletons$GreatReadsLockupsKt$lambda-2$1
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
                b.S(2014099975, i, -1, "com.nytimes.android.ribbon.destinations.greatreads.ComposableSingletons$GreatReadsLockupsKt.lambda-2.<anonymous> (GreatReadsLockups.kt:72)");
            }
            XpnDividersKt.a(null, eb5.Companion.b(composer, 8).k(), null, composer, 0, 5);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return c;
    }
}
