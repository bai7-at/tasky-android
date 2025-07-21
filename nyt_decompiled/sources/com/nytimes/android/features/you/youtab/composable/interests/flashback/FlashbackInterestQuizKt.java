package com.nytimes.android.features.you.youtab.composable.interests.flashback;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import coil.compose.SingletonAsyncImageKt;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n37;
import defpackage.pl0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.t5;
import defpackage.vg3;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class FlashbackInterestQuizKt {
    public static final void a(final int i, final Interest.FlashbackQuizInterest flashbackQuizInterest, final qs2 qs2Var, final qs2 qs2Var2, Modifier modifier, final gt2 gt2Var, Composer composer, final int i2, final int i3) {
        zq3.h(flashbackQuizInterest, "interest");
        zq3.h(qs2Var, "sendFlashbackInterestQuizImpression");
        zq3.h(qs2Var2, "flashbackQuizInitialed");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(1586631566);
        Modifier modifier2 = (i3 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1586631566, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestQuiz (FlashbackInterestQuiz.kt:50)");
        }
        final ComponentActivity d = t5.d(h, 0);
        final InterestAsset e = flashbackQuizInterest.e();
        float f = 20;
        final Modifier modifier3 = modifier2;
        Modifier k = PaddingKt.k(SizeKt.h(modifier2, 0.0f, 1, null), bu1.g(f), 0.0f, 2, null);
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar = Alignment.a;
        rg4 a = d.a(g, aVar.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(k);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        ww8 ww8Var = ww8.a;
        h.z(-1512282799);
        boolean z = (((i2 & 896) ^ 384) > 256 && h.S(qs2Var)) || (i2 & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new FlashbackInterestQuizKt$FlashbackInterestQuiz$1$1$1(qs2Var, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        Modifier.a aVar2 = Modifier.a;
        Modifier d2 = BackgroundKt.d(pl0.a(PaddingKt.m(aVar2, 0.0f, 0.0f, 0.0f, bu1.g(f), 7, null), d37.c(bu1.g(8))), wn0.d(4294111719L), null, 2, null);
        h.z(-483455358);
        rg4 a5 = d.a(arrangement.g(), aVar.k(), h, 0);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c2 = LayoutKt.c(d2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a7);
        } else {
            h.p();
        }
        Composer a8 = Updater.a(h);
        Updater.c(a8, a5, companion.e());
        Updater.c(a8, o2, companion.g());
        gt2 b2 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b2);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        String b3 = k48.b(yk6.flashbackQuizHeader, h, 0);
        Modifier c3 = ap0Var.c(PaddingKt.i(aVar2, bu1.g(f)), aVar.g());
        long g2 = ek8.g(16);
        long e2 = ek8.e(18.2d);
        dh8.a aVar3 = dh8.b;
        int a9 = aVar3.a();
        e e3 = gb5.e();
        o.a aVar4 = o.b;
        TextKt.c(b3, c3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(wn0.d(4284111450L), g2, aVar4.e(), null, null, e3, null, 0L, null, null, null, 0L, null, null, null, a9, 0, e2, null, null, null, 0, 0, null, 16613336, null), h, 0, 0, 65532);
        Modifier m = PaddingKt.m(aVar2, bu1.g(f), 0.0f, bu1.g(f), 0.0f, 10, null);
        h.z(693286680);
        rg4 a10 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a11 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a12 = companion.a();
        it2 c4 = LayoutKt.c(m);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a12);
        } else {
            h.p();
        }
        Composer a13 = Updater.a(h);
        Updater.c(a13, a10, companion.e());
        Updater.c(a13, o3, companion.g());
        gt2 b4 = companion.b();
        if (a13.f() || !zq3.c(a13.A(), Integer.valueOf(a11))) {
            a13.q(Integer.valueOf(a11));
            a13.v(Integer.valueOf(a11), b4);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        SingletonAsyncImageKt.a(new vg3.a((Context) h.m(AndroidCompositionLocals_androidKt.g())).d(flashbackQuizInterest.h()).g(re6.ic_placeholder).f(re6.ic_placeholder).c(true).a(), null, AspectRatioKt.b(SizeKt.n(aVar2, bu1.g(66)), 1.0f, false, 2, null), null, null, null, ContentScale.a.a(), 0.0f, null, 0, h, 1573304, 952);
        TextKt.c(flashbackQuizInterest.f(), PaddingKt.m(aVar2, bu1.g(f), 0.0f, bu1.g(f), bu1.g(30), 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(wn0.d(4279374354L), ek8.g(16), aVar4.f(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.e(18.2d), null, null, null, 0, 0, null, 16646104, null), h, 0, 0, 65532);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        Modifier m2 = PaddingKt.m(aVar2, 0.0f, 0.0f, 0.0f, bu1.g(14), 7, null);
        int a14 = aVar3.a();
        String b5 = k48.b(yk6.flashbackQuizSortQuizLabel, h, 0);
        long g3 = ek8.g(20);
        long g4 = ek8.g(23);
        e c5 = gb5.c();
        o f2 = aVar4.f();
        eb5.a aVar5 = eb5.Companion;
        TextKt.c(b5, m2, 0L, 0L, null, null, null, 0L, null, dh8.h(a14), 0L, 0, false, 0, 0, null, new j(aVar5.b(h, 8).g(), g3, f2, null, null, c5, null, 0L, null, null, null, 0L, null, null, null, 0, 0, g4, null, null, null, 0, 0, null, 16646104, null), h, 48, 0, 65020);
        float f3 = 16;
        ButtonKt.c(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestQuizKt$FlashbackInterestQuiz$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m524invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m524invoke() {
                qs2.this.mo865invoke();
                gt2Var.invoke(FlashbackInterestKt.c(e, false, i, null, 5, null), d);
            }
        }, PaddingKt.m(ap0Var.c(SizeKt.b(aVar2, 0.0f, bu1.g(44), 1, null), aVar.g()), 0.0f, 0.0f, 0.0f, bu1.g(28), 7, null), false, null, null, d37.c(bu1.g(3)), fb0.a(bu1.g(1), aVar5.b(h, 8).k()), null, PaddingKt.d(bu1.g(f3), bu1.g(f3), bu1.g(f3), bu1.g(f3)), ComposableSingletons$FlashbackInterestQuizKt.a.a(), h, 905969664, 156);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestQuizKt$FlashbackInterestQuiz$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    FlashbackInterestQuizKt.a(i, flashbackQuizInterest, qs2Var, qs2Var2, modifier3, gt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
