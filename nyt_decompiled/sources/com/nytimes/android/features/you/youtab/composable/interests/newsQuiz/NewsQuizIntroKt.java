package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.material3.ButtonKt;
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
import com.comscore.streaming.WindowState;
import com.nytimes.android.interests.db.PromotionalMedia;
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
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class NewsQuizIntroKt {
    public static final void a(final PromotionalMedia promotionalMedia, final qs2 qs2Var, final qs2 qs2Var2, Modifier modifier, Composer composer, final int i, final int i2) {
        PromotionalMedia.ImageCrop a;
        PromotionalMedia.ImageDimension a2;
        zq3.h(qs2Var, "beginButtonClicked");
        zq3.h(qs2Var2, "sendBeginNewsQuizImpression");
        Composer h = composer.h(682100550);
        final Modifier modifier2 = (i2 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(682100550, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizIntro (NewsQuizIntro.kt:44)");
        }
        ww8 ww8Var = ww8.a;
        h.z(1197664358);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var2)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new NewsQuizIntroKt$NewsQuizIntro$1$1(qs2Var2, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        Modifier h2 = SizeKt.h(SizeKt.k(modifier2, bu1.g(WindowState.NORMAL), 0.0f, 2, null), 0.0f, 1, null);
        Alignment.a aVar = Alignment.a;
        Alignment.b g = aVar.g();
        Arrangement.f b = Arrangement.a.b();
        h.z(-483455358);
        rg4 a3 = d.a(b, g, h, 54);
        h.z(-1323940314);
        int a4 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a5 = companion.a();
        it2 c = LayoutKt.c(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a5);
        } else {
            h.p();
        }
        Composer a6 = Updater.a(h);
        Updater.c(a6, a3, companion.e());
        Updater.c(a6, o, companion.g());
        gt2 b2 = companion.b();
        if (a6.f() || !zq3.c(a6.A(), Integer.valueOf(a4))) {
            a6.q(Integer.valueOf(a4));
            a6.v(Integer.valueOf(a4), b2);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        Modifier.a aVar2 = Modifier.a;
        float f = 15;
        SingletonAsyncImageKt.a(new vg3.a((Context) h.m(AndroidCompositionLocals_androidKt.g())).d((promotionalMedia == null || (a = promotionalMedia.a()) == null || (a2 = a.a()) == null) ? null : a2.a()).g(re6.ic_placeholder).f(re6.ic_placeholder).c(true).a(), null, SizeKt.k(AspectRatioKt.b(SizeKt.h(PaddingKt.m(aVar2, 0.0f, bu1.g(f), 0.0f, bu1.g(f), 5, null), 0.0f, 1, null), 1.5f, false, 2, null), 0.0f, bu1.g(184), 1, null), null, null, null, ContentScale.a.a(), 0.0f, null, 0, h, 1573304, 952);
        Modifier m = PaddingKt.m(aVar2, 0.0f, bu1.g(5), 0.0f, bu1.g(10), 5, null);
        String b3 = k48.b(yk6.news_quiz_intro_question, h, 0);
        long g2 = ek8.g(20);
        long g3 = ek8.g(23);
        e c2 = gb5.c();
        o f2 = o.b.f();
        eb5.a aVar3 = eb5.Companion;
        TextKt.c(b3, m, aVar3.b(h, 8).g(), 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, new j(aVar3.b(h, 8).g(), g2, f2, null, null, c2, null, 0L, null, null, null, 0L, null, null, null, 0, 0, g3, null, null, null, 0, 0, null, 16646104, null), h, 48, 0, 65016);
        ButtonKt.b(qs2Var, PaddingKt.m(ap0Var.c(SizeKt.b(aVar2, 0.0f, bu1.g(44), 1, null), aVar.g()), 0.0f, 0.0f, 0.0f, bu1.g(23), 7, null), false, d37.c(bu1.g(3)), null, null, fb0.a(bu1.g(1), aVar3.b(h, 8).k()), PaddingKt.b(bu1.g(16), bu1.g(8)), null, ComposableSingletons$NewsQuizIntroKt.a.a(), h, ((i >> 3) & 14) | 817889280, StatusLine.HTTP_PERM_REDIRECT);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizIntroKt$NewsQuizIntro$3
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
                    NewsQuizIntroKt.a(PromotionalMedia.this, qs2Var, qs2Var2, modifier2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
