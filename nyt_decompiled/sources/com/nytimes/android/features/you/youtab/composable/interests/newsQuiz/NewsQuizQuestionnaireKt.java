package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.features.you.youtab.d;
import com.nytimes.android.interests.db.Interest;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c37;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb0;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.pl0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ue6;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class NewsQuizQuestionnaireKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Interest.Choice choice, final boolean z, final d dVar, final qs2 qs2Var, final String str, Composer composer, final int i) {
        long a;
        final long g;
        Composer h = composer.h(1302038744);
        if (b.G()) {
            b.S(1302038744, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ChoiceButton (NewsQuizQuestionnaire.kt:114)");
        }
        boolean z2 = dVar instanceof d.c;
        final boolean z3 = !z2;
        final boolean c = zq3.c(str, choice.a());
        if (!z2 && z) {
            h.z(-1572350913);
            if (dVar instanceof d.a) {
                h.z(-1572350846);
                a = eb5.Companion.b(h, 8).f();
                h.R();
            } else if (dVar instanceof d.b) {
                h.z(-1572350774);
                a = eb5.Companion.b(h, 8).d();
                h.R();
            } else {
                h.z(-1572350728);
                a = eb5.Companion.b(h, 8).a();
                h.R();
            }
            h.R();
        } else if (z) {
            h.z(-1572350667);
            a = eb5.Companion.b(h, 8).c();
            h.R();
        } else {
            h.z(-1572350622);
            a = eb5.Companion.b(h, 8).a();
            h.R();
        }
        long j = a;
        if (!z2 && z) {
            h.z(-1572350534);
            h.R();
            g = wn0.d(4294506744L);
        } else if (z2 || !c) {
            h.z(-1572350425);
            g = eb5.Companion.b(h, 8).g();
            h.R();
        } else {
            h.z(-1572350467);
            g = eb5.Companion.b(h, 8).f();
            h.R();
        }
        boolean z4 = !z3;
        float f = 3;
        Modifier d = BackgroundKt.d(SizeKt.h(SizeKt.i(SizeKt.y(pl0.a(PaddingKt.k(Modifier.a, 0.0f, bu1.g(4), 1, null), d37.c(bu1.g(f))), Alignment.a.e(), false, 2, null), bu1.g(32)), 0.0f, 1, null), j, null, 2, null);
        c37 c2 = d37.c(bu1.g(f));
        eb0 a2 = fb0.a(bu1.g(1), eb5.Companion.b(h, 8).l());
        h.z(-1572350334);
        boolean z5 = (((i & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i & 3072) == 2048;
        Object A = h.A();
        if (z5 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$ChoiceButton$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m530invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m530invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        ButtonKt.b((qs2) A, d, z4, c2, null, null, a2, null, null, zr0.b(h, -11170102, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$ChoiceButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(m37 m37Var, Composer composer2, int i2) {
                j f2;
                int i3;
                Painter d2;
                String b;
                zq3.h(m37Var, "$this$OutlinedButton");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-11170102, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ChoiceButton.<anonymous> (NewsQuizQuestionnaire.kt:151)");
                }
                Modifier.a aVar = Modifier.a;
                Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
                Alignment.c i4 = Alignment.a.i();
                Arrangement.f b2 = Arrangement.a.b();
                Interest.Choice choice2 = Interest.Choice.this;
                long j2 = g;
                boolean z6 = z3;
                boolean z7 = c;
                boolean z8 = z;
                composer2.z(693286680);
                rg4 a3 = m.a(b2, i4, composer2, 54);
                composer2.z(-1323940314);
                int a4 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a5 = companion.a();
                it2 c3 = LayoutKt.c(h2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a5);
                } else {
                    composer2.p();
                }
                Composer a6 = Updater.a(composer2);
                Updater.c(a6, a3, companion.e());
                Updater.c(a6, o, companion.g());
                gt2 b3 = companion.b();
                if (a6.f() || !zq3.c(a6.A(), Integer.valueOf(a4))) {
                    a6.q(Integer.valueOf(a4));
                    a6.v(Integer.valueOf(a4), b3);
                }
                c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                n37 n37Var = n37.a;
                String b4 = choice2.b();
                dh8 h3 = dh8.h(dh8.b.a());
                f2 = r16.f((r48 & 1) != 0 ? r16.a.i() : j2, (r48 & 2) != 0 ? r16.a.m() : 0L, (r48 & 4) != 0 ? r16.a.p() : null, (r48 & 8) != 0 ? r16.a.n() : null, (r48 & 16) != 0 ? r16.a.o() : null, (r48 & 32) != 0 ? r16.a.k() : null, (r48 & 64) != 0 ? r16.a.l() : null, (r48 & 128) != 0 ? r16.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r16.a.g() : null, (r48 & 512) != 0 ? r16.a.w() : null, (r48 & 1024) != 0 ? r16.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r16.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r16.a.u() : null, (r48 & 8192) != 0 ? r16.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r16.a.j() : null, (r48 & 32768) != 0 ? r16.b.h() : 0, (r48 & 65536) != 0 ? r16.b.i() : 0, (r48 & 131072) != 0 ? r16.b.e() : 0L, (r48 & 262144) != 0 ? r16.b.j() : null, (r48 & 524288) != 0 ? r16.c : null, (r48 & Constants.MB) != 0 ? r16.b.f() : null, (r48 & 2097152) != 0 ? r16.b.d() : 0, (r48 & 4194304) != 0 ? r16.b.c() : 0, (r48 & 8388608) != 0 ? TPLTypography.title14.getValue().b.k() : null);
                TextKt.b(b4, null, 0L, 0L, null, null, null, 0L, null, h3, 0L, 0, false, 0, 0, null, f2, composer2, 0, 0, 65022);
                composer2.z(1480182513);
                if (z6) {
                    Modifier n = SizeKt.n(PaddingKt.m(aVar, bu1.g(8), 0.0f, 0.0f, 0.0f, 14, null), bu1.g(24));
                    if (z7 || z8) {
                        if (z7) {
                            composer2.z(-995224594);
                            i3 = 0;
                            d2 = do5.d(ue6.ic_checkmark, composer2, 0);
                            composer2.R();
                        } else {
                            i3 = 0;
                            composer2.z(-995224462);
                            d2 = do5.d(ue6.ic_close_24, composer2, 0);
                            composer2.R();
                        }
                        if (z7) {
                            composer2.z(-995224271);
                            b = k48.b(yk6.correct_answer, composer2, i3);
                            composer2.R();
                        } else {
                            composer2.z(-995224170);
                            b = k48.b(yk6.incorrect_answer, composer2, i3);
                            composer2.R();
                        }
                        IconKt.b(d2, b, n, j2, composer2, 392, 0);
                    }
                }
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 805306368, 432);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$ChoiceButton$3
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
                    NewsQuizQuestionnaireKt.a(Interest.Choice.this, z, dVar, qs2Var, str, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final Interest.InitialNewsQuizData initialNewsQuizData, final ss2 ss2Var, final x08 x08Var, final ss2 ss2Var2, Modifier modifier, final ss2 ss2Var3, Composer composer, final int i, final int i2) {
        zq3.h(initialNewsQuizData, "initialQuizData");
        zq3.h(ss2Var, "onAnswerSelected");
        zq3.h(x08Var, "quizState");
        zq3.h(ss2Var2, "onAnswerSubmitted");
        zq3.h(ss2Var3, "onAnswerClicked");
        Composer h = composer.h(672973020);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(672973020, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaire (NewsQuizQuestionnaire.kt:43)");
        }
        final boolean z = !(x08Var.getValue() instanceof d.c);
        String d = initialNewsQuizData.d();
        boolean z2 = !(d == null || h.d0(d));
        Arrangement.f b = Arrangement.a.b();
        Modifier k = SizeKt.k(SizeKt.h(PaddingKt.k(modifier2, bu1.g(16), 0.0f, 2, null), 0.0f, 1, null), bu1.g(WindowState.NORMAL), 0.0f, 2, null);
        h.z(-483455358);
        rg4 a = androidx.compose.foundation.layout.d.a(b, Alignment.a.k(), h, 6);
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
        gt2 b2 = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b2);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        d(initialNewsQuizData.f(), h, 0);
        List c2 = initialNewsQuizData.c();
        String a5 = ((d) x08Var.getValue()).a();
        h.z(1927844627);
        boolean z3 = (((458752 & i) ^ 196608) > 131072 && h.S(ss2Var3)) || (i & 196608) == 131072;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$NewsQuizQuestionnaire$1$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str) {
                    zq3.h(str, "it");
                    ss2.this.invoke(str);
                }
            };
            h.q(A);
        }
        h.R();
        int i3 = i & 896;
        c(c2, a5, x08Var, (ss2) A, initialNewsQuizData.b(), h, i3 | 8);
        String a6 = ((d) x08Var.getValue()).a();
        h.z(1927844917);
        boolean a7 = h.a(z) | ((((i & 7168) ^ 3072) > 2048 && h.S(ss2Var2)) || (i & 3072) == 2048) | (((i3 ^ 384) > 256 && h.S(x08Var)) || (i & 384) == 256) | ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(ss2Var)) || (i & 48) == 32);
        Object A2 = h.A();
        if (a7 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$NewsQuizQuestionnaire$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str) {
                    zq3.h(str, "it");
                    if (z) {
                        ss2Var2.invoke(((d) x08Var.getValue()).a());
                    } else {
                        ss2Var.invoke(((d) x08Var.getValue()).a());
                    }
                }
            };
            h.q(A2);
        }
        h.R();
        final Modifier modifier3 = modifier2;
        e(a6, (ss2) A2, z2, z, null, h, 0, 16);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$NewsQuizQuestionnaire$2
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
                    NewsQuizQuestionnaireKt.b(Interest.InitialNewsQuizData.this, ss2Var, x08Var, ss2Var2, modifier3, ss2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final List list, final String str, final x08 x08Var, final ss2 ss2Var, final String str2, Composer composer, final int i) {
        Composer h = composer.h(-650959763);
        if (b.G()) {
            b.S(-650959763, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.QuizChoices (NewsQuizQuestionnaire.kt:95)");
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final Interest.Choice choice = (Interest.Choice) it2.next();
                a(choice, zq3.c(str, choice.a()), (d) x08Var.getValue(), new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$QuizChoices$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m531invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m531invoke() {
                        ss2.this.invoke(choice.a());
                    }
                }, str2, h, (57344 & i) | 8);
            }
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$QuizChoices$2
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
                    NewsQuizQuestionnaireKt.c(list, str, x08Var, ss2Var, str2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(759578818);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(759578818, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.QuizQuestion (NewsQuizQuestionnaire.kt:78)");
            }
            composer2 = h;
            TextKt.b(str, PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, bu1.g(16), 7, null), eb5.Companion.b(h, 8).g(), 0L, null, null, null, 0L, null, null, ek8.e(20.8d), 0, false, 0, 0, null, TPLTypography.text16.getValue(), composer2, (i2 & 14) | 48, 6, 64504);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt$QuizQuestion$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    NewsQuizQuestionnaireKt.d(str, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r30, final defpackage.ss2 r31, final boolean r32, final boolean r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizQuestionnaireKt.e(java.lang.String, ss2, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
