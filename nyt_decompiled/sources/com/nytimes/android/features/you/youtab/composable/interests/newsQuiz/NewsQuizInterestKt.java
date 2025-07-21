package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.t5;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NewsQuizInterestKt {
    public static final void a(final int i, final Interest.NewsQuizInterest newsQuizInterest, final YouScreenViewModel youScreenViewModel, final qs2 qs2Var, Composer composer, final int i2) {
        zq3.h(newsQuizInterest, "quizInterest");
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(qs2Var, "reloadQuiz");
        Composer h = composer.h(-1584861943);
        if (b.G()) {
            b.S(-1584861943, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizInterest (NewsQuizInterest.kt:19)");
        }
        ww8 ww8Var = ww8.a;
        h.z(898652075);
        boolean z = (((i2 & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i2 & 3072) == 2048;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new NewsQuizInterestKt$NewsQuizInterest$1$1(qs2Var, null);
            h.q(A);
        }
        h.R();
        LifecycleUtilsKt.a(ww8Var, (gt2) A, h, 70);
        if (newsQuizInterest.f()) {
            h.z(898652155);
            final ComponentActivity d = t5.d(h, 0);
            NewsQuizResultKt.i(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizInterestKt$NewsQuizInterest$2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m526invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m526invoke();
                    return ww8.a;
                }
            }, newsQuizInterest.d(), new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizInterestKt$NewsQuizInterest$3
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m527invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m527invoke() {
                    YouScreenViewModel.this.b1();
                }
            }, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizInterestKt$NewsQuizInterest$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m528invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m528invoke() {
                    YouScreenViewModel.this.g0(d, NewsQuizInterestKt.b(newsQuizInterest.e().g(), i, newsQuizInterest.c()));
                }
            }, h, 70, 8);
            h.R();
        } else {
            h.z(898652823);
            NewsQuizUIKt.a(i, youScreenViewModel, newsQuizInterest, null, h, (i2 & 14) | 576, 8);
            h.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizInterestKt$NewsQuizInterest$5
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
                    NewsQuizInterestKt.a(i, newsQuizInterest, youScreenViewModel, qs2Var, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final y25 b(InterestAsset interestAsset, int i, String str) {
        zq3.h(interestAsset, "<this>");
        zq3.h(str, "pastQuizUrl");
        InterestType interestType = InterestType.COLUMN;
        return new y25(str, AssetConstants.ARTICLE_TYPE, str, interestType.getType(), interestType.getType(), interestAsset.m(interestAsset), false, null, null, NavigationSource.YOU_TAB_NEWSQUIZ, null, String.valueOf(i), "you tab", "interests-hub", "take_past_quizzes", null, null, null, null, 426240, null);
    }
}
