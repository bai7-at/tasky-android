package com.nytimes.android.features.you.youtab.composable.interests.flashback;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.subauth.ui.purr.ui.compose.CenterTopAppBarKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.pl0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.r81;
import defpackage.rg4;
import defpackage.t5;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class FlashbackInterestResultKt {
    public static final void a(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(82422022);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(82422022, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.AnswerIndicator (FlashbackInterestResult.kt:180)");
            }
            float f = 8;
            BoxKt.a(BackgroundKt.d(pl0.a(SizeKt.p(modifier, bu1.g(13), bu1.g(f)), d37.c(bu1.g(f))), z ? wn0.d(4285958093L) : r81.a(h, 0) ? wn0.d(4288914339L) : wn0.d(4291282887L), null, 2, null), h, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestResultKt$AnswerIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    FlashbackInterestResultKt.a(z, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final int i, final int i2, final List list, final qs2 qs2Var, final Interest.FlashbackQuizInterest flashbackQuizInterest, Modifier modifier, final gt2 gt2Var, Composer composer, final int i3, final int i4) {
        zq3.h(list, "answers");
        zq3.h(qs2Var, "sendFlashbackInterestResultImpression");
        zq3.h(flashbackQuizInterest, "interest");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-1747008516);
        Modifier modifier2 = (i4 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1747008516, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackQuizResult (FlashbackInterestResult.kt:52)");
        }
        final InterestAsset e = flashbackQuizInterest.e();
        final ComponentActivity d = t5.d(h, 0);
        float f = 20;
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
        h.z(1079150084);
        boolean z = (((i3 & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i3 & 3072) == 2048;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new FlashbackInterestResultKt$FlashbackQuizResult$1$1$1(qs2Var, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        int i5 = (i3 >> 3) & 14;
        String d2 = d(i2, h, i5);
        Modifier.a aVar2 = Modifier.a;
        Modifier h2 = SizeKt.h(aVar2, 0.0f, 1, null);
        Arrangement.f n = arrangement.n(bu1.g(f));
        h.z(693286680);
        rg4 a5 = m.a(n, aVar.l(), h, 6);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c2 = LayoutKt.c(h2);
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
        n37 n37Var = n37.a;
        Modifier c3 = n37Var.c(m37.b(n37Var, aVar2, 1.0f, false, 2, null), aVar.i());
        long g2 = ek8.g(16);
        long e2 = ek8.e(18.2d);
        e e3 = gb5.e();
        o.a aVar3 = o.b;
        o f2 = aVar3.f();
        eb5.a aVar4 = eb5.Companion;
        TextKt.c(d2, c3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar4.b(h, 8).g(), g2, f2, null, null, e3, null, 0L, null, null, null, 0L, null, null, null, 0, 0, e2, null, null, null, 0, 0, null, 16646104, null), h, 0, 0, 65532);
        final Modifier modifier3 = modifier2;
        c(i2, 28, list, null, h, i5 | 560, 8);
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(f)), h, 6);
        Modifier e4 = ModifierUtilsKt.e(ClickableKt.e(aVar2, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestResultKt$FlashbackQuizResult$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m525invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m525invoke() {
                gt2.this.invoke(FlashbackInterestKt.b(e, false, i, "https://www.nytimes.com/spotlight/flashback"), d);
            }
        }, 7, null), aVar4.b(h, 8).g(), bu1.g(1), CenterTopAppBarKt.q(4));
        TextKt.c(k48.b(yk6.take_past_quizzes, h, 0), e4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar4.b(h, 8).g(), ek8.g(16), aVar3.g(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.e(18.2d), null, null, null, 0, 0, null, 16646104, null), h, 0, 0, 65532);
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(24)), h, 6);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestResultKt$FlashbackQuizResult$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    FlashbackInterestResultKt.b(i, i2, list, qs2Var, flashbackQuizInterest, modifier3, gt2Var, composer2, gt6.a(i3 | 1), i4);
                }
            });
        }
    }

    public static final void c(final int i, final int i2, final List list, Modifier modifier, Composer composer, final int i3, final int i4) {
        zq3.h(list, "answers");
        Composer h = composer.h(2110834215);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(2110834215, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.ScoreDisplay (FlashbackInterestResult.kt:120)");
        }
        Alignment.a aVar = Alignment.a;
        Alignment.b g = aVar.g();
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        rg4 a = d.a(arrangement.g(), g, h, 48);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
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
        String upperCase = k48.b(yk6.your_score, h, 0).toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        long e = ek8.e(13.75d);
        long g2 = ek8.g(11);
        e e2 = gb5.e();
        o.a aVar2 = o.b;
        o b2 = aVar2.b();
        eb5.a aVar3 = eb5.Companion;
        TextKt.c(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar3.b(h, 8).g(), g2, b2, null, null, e2, null, ek8.e(1.1d), null, null, null, 0L, null, null, null, 0, 0, e, null, null, null, 0, 0, null, 16645976, null), h, 0, 0, 65534);
        Modifier.a aVar4 = Modifier.a;
        SpacerKt.a(SizeKt.i(aVar4, bu1.g(8)), h, 6);
        Alignment.c i5 = aVar.i();
        h.z(693286680);
        rg4 a5 = m.a(arrangement.f(), i5, h, 48);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c2 = LayoutKt.c(aVar4);
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
        gt2 b3 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        float f = 4;
        TextKt.c(String.valueOf(i), PaddingKt.m(aVar4, 0.0f, 0.0f, bu1.g(f), 0.0f, 11, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar3.b(h, 8).g(), ek8.g(56), aVar2.c(), null, null, gb5.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 48, 0, 65532);
        Modifier c3 = n37Var.c(aVar4, aVar.l());
        h.z(733328855);
        rg4 g3 = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a9 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a10 = companion.a();
        it2 c4 = LayoutKt.c(c3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a10);
        } else {
            h.p();
        }
        Composer a11 = Updater.a(h);
        Updater.c(a11, g3, companion.e());
        Updater.c(a11, o3, companion.g());
        gt2 b4 = companion.b();
        if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
            a11.q(Integer.valueOf(a9));
            a11.v(Integer.valueOf(a9), b4);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        String str = "/" + i2;
        TextKt.c(str, OffsetKt.c(aVar4, 0.0f, bu1.g(2), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar3.b(h, 8).g(), ek8.g(28), aVar2.c(), null, null, gb5.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.e(32.2d), null, null, null, 0, 0, null, 16646104, null), h, 48, 0, 65532);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.i(aVar4, bu1.g(5)), h, 6);
        h.z(693286680);
        rg4 a12 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a13 = cs0.a(h, 0);
        et0 o4 = h.o();
        qs2 a14 = companion.a();
        it2 c5 = LayoutKt.c(aVar4);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a14);
        } else {
            h.p();
        }
        Composer a15 = Updater.a(h);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, o4, companion.g());
        gt2 b5 = companion.b();
        if (a15.f() || !zq3.c(a15.A(), Integer.valueOf(a13))) {
            a15.q(Integer.valueOf(a13));
            a15.v(Integer.valueOf(a13), b5);
        }
        c5.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1226365195);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a(((Boolean) it2.next()).booleanValue(), null, h, 0, 2);
            SpacerKt.a(SizeKt.s(Modifier.a, bu1.g(f)), h, 6);
        }
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestResultKt$ScoreDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    FlashbackInterestResultKt.c(i, i2, list, modifier3, composer2, gt6.a(i3 | 1), i4);
                }
            });
        }
    }

    private static final String d(int i, Composer composer, int i2) {
        String str;
        composer.z(374726930);
        if (b.G()) {
            b.S(374726930, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.getScoreDescription (FlashbackInterestResult.kt:199)");
        }
        if (i <= 8) {
            composer.z(825321676);
            str = k48.b(yk6.flashbackQuizScoreLow, composer, 0);
            composer.R();
        } else if (9 <= i && i < 12) {
            composer.z(825321749);
            str = k48.b(yk6.flashbackQuizScoreMid, composer, 0);
            composer.R();
        } else if (12 <= i && i < 21) {
            composer.z(825321823);
            str = k48.b(yk6.flashbackQuizScoreHigh, composer, 0);
            composer.R();
        } else if (21 > i || i >= 29) {
            composer.z(-184822458);
            composer.R();
            str = "";
        } else {
            composer.z(825321911);
            str = k48.b(yk6.flashbackQuizScorePerfect, composer, 0);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return str;
    }
}
