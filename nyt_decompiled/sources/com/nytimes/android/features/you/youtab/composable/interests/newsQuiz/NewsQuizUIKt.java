package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.WindowState;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.c;
import com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.ex0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.t5;
import defpackage.uh;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class NewsQuizUIKt {
    public static final void a(final int i, final YouScreenViewModel youScreenViewModel, final Interest.NewsQuizInterest newsQuizInterest, Modifier modifier, Composer composer, final int i2, final int i3) {
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(newsQuizInterest, "newsQuiz");
        Composer h = composer.h(-318861154);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-318861154, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUI (NewsQuizUI.kt:27)");
        }
        x08 b = y.b(youScreenViewModel.S(), null, h, 8, 1);
        final x08 b2 = y.b(youScreenViewModel.B(), null, h, 8, 1);
        final ComponentActivity d = t5.d(h, 0);
        zq3.f(d, "null cannot be cast to non-null type android.app.Activity");
        Modifier i4 = SizeKt.i(modifier2, bu1.g(WindowState.NORMAL));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i4);
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
        gt2 b3 = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b3);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        final Modifier modifier3 = modifier2;
        AnimatedContentKt.b((c) b.getValue(), IntrinsicKt.a(Modifier.a, IntrinsicSize.Max), new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ex0 invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                zq3.h(animatedContentTransitionScope, "$this$AnimatedContent");
                return AnimatedContentKt.e(EnterExitTransitionKt.o(null, 0.0f, 3, null), EnterExitTransitionKt.q(null, 0.0f, 3, null));
            }
        }, null, "newsQuiz content", null, zr0.b(h, 188128132, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(uh uhVar, c cVar, Composer composer2, int i5) {
                zq3.h(uhVar, "$this$AnimatedContent");
                zq3.h(cVar, TransferTable.COLUMN_STATE);
                if (b.G()) {
                    b.S(188128132, i5, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUI.<anonymous>.<anonymous> (NewsQuizUI.kt:45)");
                }
                if (zq3.c(cVar, c.b.a)) {
                    composer2.z(-1729583664);
                    Modifier d2 = SizeKt.d(Modifier.a, 0.0f, 1, null);
                    PromotionalMedia g = Interest.NewsQuizInterest.this.e().g().g();
                    final YouScreenViewModel youScreenViewModel2 = youScreenViewModel;
                    final int i6 = i;
                    final Interest.NewsQuizInterest newsQuizInterest2 = Interest.NewsQuizInterest.this;
                    qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m534invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m534invoke() {
                            YouScreenViewModel.this.m1(c.a.a, Integer.valueOf(i6), newsQuizInterest2.e().g().k());
                        }
                    };
                    final YouScreenViewModel youScreenViewModel3 = youScreenViewModel;
                    NewsQuizIntroKt.a(g, qs2Var, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.2
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m535invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m535invoke() {
                            YouScreenViewModel.this.x0();
                        }
                    }, d2, composer2, 3080, 0);
                    composer2.R();
                } else if (zq3.c(cVar, c.a.a)) {
                    composer2.z(-1729582863);
                    Interest.InitialNewsQuizData e = Interest.NewsQuizInterest.this.e();
                    final YouScreenViewModel youScreenViewModel4 = youScreenViewModel;
                    final Interest.NewsQuizInterest newsQuizInterest3 = Interest.NewsQuizInterest.this;
                    ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.3
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
                            zq3.h(str, "selectedAnswer");
                            YouScreenViewModel.this.y(str, newsQuizInterest3.e().b());
                        }
                    };
                    x08 x08Var = b2;
                    final Interest.NewsQuizInterest newsQuizInterest4 = Interest.NewsQuizInterest.this;
                    final YouScreenViewModel youScreenViewModel5 = youScreenViewModel;
                    final Activity activity = d;
                    ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.4
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
                            zq3.h(str, "answerId");
                            if (Interest.NewsQuizInterest.this.e().d() != null) {
                                YouScreenViewModel.n1(youScreenViewModel5, c.C0297c.a, null, null, 6, null);
                            } else {
                                if (youScreenViewModel5.m0(activity, Interest.NewsQuizInterest.this.e().g().k(), str)) {
                                    return;
                                }
                                CommonComponentsKt.c(activity);
                            }
                        }
                    };
                    final YouScreenViewModel youScreenViewModel6 = youScreenViewModel;
                    NewsQuizQuestionnaireKt.b(e, ss2Var, x08Var, ss2Var2, null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.5
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return ww8.a;
                        }

                        public final void invoke(String str) {
                            zq3.h(str, "answerId");
                            YouScreenViewModel.this.h0(str);
                        }
                    }, composer2, 8, 16);
                    composer2.R();
                } else if (zq3.c(cVar, c.C0297c.a)) {
                    composer2.z(-1729581401);
                    Interest.InitialNewsQuizData e2 = Interest.NewsQuizInterest.this.e();
                    x08 x08Var2 = b2;
                    final YouScreenViewModel youScreenViewModel7 = youScreenViewModel;
                    final Activity activity2 = d;
                    final Interest.NewsQuizInterest newsQuizInterest5 = Interest.NewsQuizInterest.this;
                    NewsQuizMoreContextKt.a(e2, x08Var2, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$1$2.6
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
                            zq3.h(str, "answerId");
                            if (YouScreenViewModel.this.m0(activity2, newsQuizInterest5.e().g().k(), str)) {
                                return;
                            }
                            CommonComponentsKt.c(activity2);
                        }
                    }, null, composer2, 8, 8);
                    composer2.R();
                } else {
                    composer2.z(-1729580727);
                    composer2.R();
                }
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                b((uh) obj, (c) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }
        }), h, 1597872, 40);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizUIKt$NewsQuizUI$2
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
                    NewsQuizUIKt.a(i, youScreenViewModel, newsQuizInterest, modifier3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
