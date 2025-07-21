package com.nytimes.android.dailyfive.ui.items;

import androidx.fragment.app.Fragment;
import com.nytimes.android.dailyfive.analytics.DailyFiveAnalytics;
import com.nytimes.android.dailyfive.domain.DailyFiveArticle;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.DailyFiveCompletion;
import com.nytimes.android.dailyfive.domain.DailyFiveGames;
import com.nytimes.android.dailyfive.domain.DailyFivePack;
import com.nytimes.android.dailyfive.domain.DailyFiveSalutation;
import com.nytimes.android.dailyfive.domain.DailyFiveTrending;
import com.nytimes.android.dailyfive.domain.GamesAsset;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import defpackage.di0;
import defpackage.fk6;
import defpackage.gt2;
import defpackage.j81;
import defpackage.k56;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tg3;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class DailyFiveViewItemProvider {
    private final tg3 a;
    private final k56 b;
    private final j81 c;
    private final RecentlyViewedManager d;
    private final DailyFiveAnalytics e;
    private final Fragment f;
    private final Map g;
    private final Map h;

    public DailyFiveViewItemProvider(tg3 tg3Var, k56 k56Var, j81 j81Var, RecentlyViewedManager recentlyViewedManager, DailyFiveAnalytics dailyFiveAnalytics, Fragment fragment) {
        zq3.h(tg3Var, "imageLoaderWrapper");
        zq3.h(k56Var, "promoMediaBinder");
        zq3.h(j81Var, "navigator");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(dailyFiveAnalytics, "analytics");
        zq3.h(fragment, "fragment");
        this.a = tg3Var;
        this.b = k56Var;
        this.c = j81Var;
        this.d = recentlyViewedManager;
        this.e = dailyFiveAnalytics;
        this.f = fragment;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
    }

    private final List e(final DailyFiveArticle dailyFiveArticle, int i) {
        return i.e(new a(dailyFiveArticle, this.b, this.d.u(dailyFiveArticle.a().b().d()), this.e.a(dailyFiveArticle, i), new qs2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createArticleViewItems$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m332invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m332invoke() {
                j81 j81Var;
                j81Var = DailyFiveViewItemProvider.this.c;
                j81Var.a(dailyFiveArticle.a(), dailyFiveArticle.c(), "dailyArticle");
            }
        }));
    }

    private final List f(final DailyFiveGames dailyFiveGames, int i) {
        return i.o(i(dailyFiveGames.b()), new GameViewItem(dailyFiveGames, this.a, new gt2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createGameViewItems$1
            {
                super(2);
            }

            public final void b(GamesAsset gamesAsset, String str) {
                j81 j81Var;
                Fragment fragment;
                zq3.h(gamesAsset, "gamesAsset");
                zq3.h(str, "kicker");
                j81Var = DailyFiveViewItemProvider.this.c;
                fragment = DailyFiveViewItemProvider.this.f;
                j81Var.b(str, gamesAsset, fragment);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((GamesAsset) obj, (String) obj2);
                return ww8.a;
            }
        }, this.e.c(dailyFiveGames, i), this.h, new ss2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createGameViewItems$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(float f) {
                DailyFiveAnalytics dailyFiveAnalytics;
                dailyFiveAnalytics = DailyFiveViewItemProvider.this.e;
                dailyFiveAnalytics.g(f, "Carousel.dailyGames", dailyFiveGames.b());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).floatValue());
                return ww8.a;
            }
        }));
    }

    private final PackViewItem g(final DailyFivePack dailyFivePack, int i) {
        List a = dailyFivePack.a();
        ArrayList arrayList = new ArrayList(i.w(a, 10));
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((DailyFiveAsset) it2.next()).b().d());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, Boolean.valueOf(this.d.u((String) obj)));
        }
        return new PackViewItem(dailyFivePack, this.b, linkedHashMap, this.e.f(dailyFivePack, i), new gt2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createPackViewItem$1
            {
                super(2);
            }

            public final void b(DailyFiveAsset dailyFiveAsset, String str) {
                j81 j81Var;
                zq3.h(dailyFiveAsset, "asset");
                zq3.h(str, "sectionTitle");
                j81Var = DailyFiveViewItemProvider.this.c;
                j81Var.a(dailyFiveAsset, str, "Carousel.packBlock");
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                b((DailyFiveAsset) obj2, (String) obj3);
                return ww8.a;
            }
        }, new ss2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createPackViewItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(float f) {
                DailyFiveAnalytics dailyFiveAnalytics;
                dailyFiveAnalytics = DailyFiveViewItemProvider.this.e;
                dailyFiveAnalytics.g(f, "Carousel.packBlock", dailyFivePack.d());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b(((Number) obj2).floatValue());
                return ww8.a;
            }
        }, this.g);
    }

    private final f h(int i) {
        String string = this.f.requireActivity().getString(i);
        zq3.g(string, "getString(...)");
        return new f(string);
    }

    private final f i(String str) {
        return new f(str);
    }

    private final List j(DailyFiveTrending dailyFiveTrending, int i) {
        final String string = this.f.requireActivity().getString(fk6.daily_five_trending_for_you);
        zq3.g(string, "getString(...)");
        List e = i.e(i(string));
        List a = dailyFiveTrending.a();
        ArrayList arrayList = new ArrayList(i.w(a, 10));
        int i2 = 0;
        for (Object obj : a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.v();
            }
            final DailyFiveAsset dailyFiveAsset = (DailyFiveAsset) obj;
            k56 k56Var = this.b;
            boolean u = this.d.u(dailyFiveAsset.b().d());
            di0 i4 = this.e.i(string, dailyFiveAsset, i, i2);
            boolean z = true;
            if (i2 != dailyFiveTrending.a().size() - 1) {
                z = false;
            }
            arrayList.add(new g(dailyFiveAsset, i2, k56Var, u, i4, z, new qs2() { // from class: com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider$createTrendingArticleViewItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m333invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m333invoke() {
                    j81 j81Var;
                    j81Var = DailyFiveViewItemProvider.this.c;
                    j81Var.a(dailyFiveAsset, string, "dailyTrending");
                }
            }));
            i2 = i3;
        }
        return i.F0(e, arrayList);
    }

    public final List d(List list) {
        int i;
        List j;
        int i2;
        zq3.h(list, "loadedItems");
        ArrayList<c> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            com.nytimes.android.dailyfive.domain.a aVar = (com.nytimes.android.dailyfive.domain.a) it2.next();
            if (aVar instanceof DailyFiveSalutation) {
                i2 = i3 + 1;
                j = i.e(new e(this.e.h(i3)));
            } else {
                if (aVar instanceof DailyFiveCompletion) {
                    int i4 = i3 + 1;
                    j = i.e(new b((DailyFiveCompletion) aVar, this.e.b(i3)));
                    i = i4;
                } else if (aVar instanceof DailyFivePack) {
                    i2 = i3 + 1;
                    j = i.o(h(fk6.daily_five_pack_title), g((DailyFivePack) aVar, i3));
                } else if (aVar instanceof DailyFiveArticle) {
                    i = i3 + 1;
                    j = e((DailyFiveArticle) aVar, i3);
                } else if (aVar instanceof DailyFiveGames) {
                    i = i3 + 1;
                    j = f((DailyFiveGames) aVar, i3);
                } else {
                    if (!(aVar instanceof DailyFiveTrending)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = i3 + 1;
                    j = j((DailyFiveTrending) aVar, i3);
                }
                i.B(arrayList, j);
                i3 = i;
            }
            i = i2;
            i.B(arrayList, j);
            i3 = i;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c cVar : arrayList) {
            i.B(arrayList2, cVar.G() ? i.o(new d(), cVar) : i.e(cVar));
        }
        return arrayList2;
    }
}
