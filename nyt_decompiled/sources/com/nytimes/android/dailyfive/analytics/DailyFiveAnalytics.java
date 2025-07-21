package com.nytimes.android.dailyfive.analytics;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveArticle;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.DailyFiveGames;
import com.nytimes.android.dailyfive.domain.DailyFivePack;
import com.nytimes.android.dailyfive.domain.GamesAsset;
import com.nytimes.android.dailyfive.ui.DailyFiveFragment;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.ai0;
import defpackage.d44;
import defpackage.di0;
import defpackage.e52;
import defpackage.ei1;
import defpackage.g90;
import defpackage.s42;
import defpackage.t71;
import defpackage.u32;
import defpackage.y32;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DailyFiveAnalytics {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final ET2Scope a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DailyFiveAnalytics(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final di0 a(DailyFiveArticle dailyFiveArticle, int i) {
        zq3.h(dailyFiveArticle, AssetConstants.ARTICLE_TYPE);
        g90 g90Var = new g90(dailyFiveArticle.c(), null, "dailyArticle", Integer.valueOf(i), 2, null);
        ai0 ai0Var = new ai0(dailyFiveArticle.a().b().d(), dailyFiveArticle.a().b().e(), 0, null, dailyFiveArticle.a().a(), 8, null);
        List c = dailyFiveArticle.a().c();
        return new di0(g90Var, ai0Var, c != null ? t71.a(c) : null);
    }

    public final di0 b(int i) {
        return new di0(new g90("You're all caught up", null, "dailyCompletion", Integer.valueOf(i), 2, null), new ai0(null, null, 0, null, null, 27, null), null, 4, null);
    }

    public final List c(DailyFiveGames dailyFiveGames, int i) {
        zq3.h(dailyFiveGames, "games");
        g90 g90Var = new g90(dailyFiveGames.b(), null, "Carousel.dailyGames", Integer.valueOf(i), 2, null);
        List a2 = dailyFiveGames.a();
        ArrayList arrayList = new ArrayList(i.w(a2, 10));
        int i2 = 0;
        for (Object obj : a2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.v();
            }
            GamesAsset gamesAsset = (GamesAsset) obj;
            arrayList.add(new di0(g90Var, new ai0(gamesAsset.c().d(), gamesAsset.c().e(), i2, null, gamesAsset.b(), 8, null), null, 4, null));
            i2 = i3;
        }
        return arrayList;
    }

    public final void d(DailyFiveFragment dailyFiveFragment, final RecyclerView recyclerView) {
        zq3.h(dailyFiveFragment, "fragment");
        zq3.h(recyclerView, "recyclerView");
        final DailyFiveImpressionScrollListener dailyFiveImpressionScrollListener = new DailyFiveImpressionScrollListener(this.a);
        recyclerView.addOnScrollListener(dailyFiveImpressionScrollListener);
        dailyFiveFragment.getViewLifecycleOwner().getLifecycle().a(new ei1() { // from class: com.nytimes.android.dailyfive.analytics.DailyFiveAnalytics$initFeed$1
            @Override // defpackage.ei1
            public void onStart(d44 d44Var) {
                zq3.h(d44Var, "owner");
                DailyFiveImpressionScrollListener.this.h();
                DailyFiveImpressionScrollListener.this.e(recyclerView);
            }
        });
    }

    public final void e() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("settings tap", null, null, null, null, null, null, new y32(null, null, null, "Settings", null, null, 55, null), null, 382, null), new u32(null, "for you", "tap", 1, null), null, 8, null);
    }

    public final List f(DailyFivePack dailyFivePack, int i) {
        zq3.h(dailyFivePack, "pack");
        g90 g90Var = new g90(dailyFivePack.d(), null, "Carousel.packBlock", Integer.valueOf(i), 2, null);
        List a2 = dailyFivePack.a();
        ArrayList arrayList = new ArrayList(i.w(a2, 10));
        int i2 = 0;
        for (Object obj : a2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.v();
            }
            DailyFiveAsset dailyFiveAsset = (DailyFiveAsset) obj;
            ai0 ai0Var = new ai0(dailyFiveAsset.b().d(), dailyFiveAsset.b().e(), i2, null, dailyFiveAsset.a(), 8, null);
            List c = dailyFiveAsset.c();
            arrayList.add(new di0(g90Var, ai0Var, c != null ? t71.a(c) : null));
            i2 = i3;
        }
        return arrayList;
    }

    public final void g(float f, String str, String str2) {
        zq3.h(str, "context");
        zq3.h(str2, "label");
        String str3 = f > 0.0f ? "horizontal swipe left" : "horizontal swipe right";
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(str3, str2, null, null, null, null, null, null, str, 252, null), new u32(null, "for you", str3, 1, null), null, 8, null);
    }

    public final di0 h(int i) {
        return new di0(new g90("Welcome to your daily five", null, "dailySalutation", Integer.valueOf(i), 2, null), new ai0(null, null, 0, null, null, 27, null), null, 4, null);
    }

    public final di0 i(String str, DailyFiveAsset dailyFiveAsset, int i, int i2) {
        zq3.h(str, "kicker");
        zq3.h(dailyFiveAsset, AssetConstants.ARTICLE_TYPE);
        g90 g90Var = new g90(str, null, "dailyTrending", Integer.valueOf(i), 2, null);
        ai0 ai0Var = new ai0(dailyFiveAsset.b().d(), dailyFiveAsset.b().e(), i2, null, dailyFiveAsset.a(), 8, null);
        List c = dailyFiveAsset.c();
        return new di0(g90Var, ai0Var, c != null ? t71.a(c) : null);
    }
}
