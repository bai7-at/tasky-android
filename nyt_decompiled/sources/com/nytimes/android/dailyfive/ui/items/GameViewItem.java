package com.nytimes.android.dailyfive.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.dailyfive.domain.DailyFiveGames;
import com.nytimes.android.dailyfive.domain.GamesAsset;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.ui.items.GameViewItem;
import com.nytimes.android.designsystem.uiview.CarouselView;
import defpackage.ai6;
import defpackage.bx4;
import defpackage.fy6;
import defpackage.gt2;
import defpackage.lr3;
import defpackage.mr3;
import defpackage.ss2;
import defpackage.tg3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class GameViewItem extends c implements bx4 {
    private final DailyFiveGames f;
    private final tg3 g;
    private final gt2 h;
    private final List i;
    private final Map j;
    private final ss2 k;
    private ss2 l;
    private final List m;
    private final DailyFiveGames n;

    public GameViewItem(DailyFiveGames dailyFiveGames, tg3 tg3Var, gt2 gt2Var, List list, Map map, ss2 ss2Var) {
        zq3.h(dailyFiveGames, "gameItem");
        zq3.h(tg3Var, "imageLoaderWrapper");
        zq3.h(gt2Var, "onClickListener");
        zq3.h(list, "et2CardImpressions");
        zq3.h(map, "gamesCarouselItemsCache");
        zq3.h(ss2Var, "flingListener");
        this.f = dailyFiveGames;
        this.g = tg3Var;
        this.h = gt2Var;
        this.i = list;
        this.j = map;
        this.k = ss2Var;
        List a = dailyFiveGames.a();
        ArrayList arrayList = new ArrayList(i.w(a, 10));
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((GamesAsset) it2.next()).c().d());
        }
        this.m = arrayList;
        this.n = this.f;
    }

    private final void N(lr3 lr3Var) {
        CarouselView carouselView = lr3Var.c;
        carouselView.setPagedScroll(false);
        carouselView.setFlingListener(this.k);
        carouselView.setScrollListener(null);
        lr3Var.b.removeAllViews();
        for (final GamesAsset gamesAsset : this.f.a()) {
            mr3 c = mr3.c(LayoutInflater.from(lr3Var.getRoot().getContext()), lr3Var.b, true);
            zq3.g(c, "inflate(...)");
            c.d.setText(gamesAsset.a().b());
            c.b.setText(gamesAsset.a().d());
            Image c2 = gamesAsset.a().c();
            if (c2 != null) {
                fy6 o = this.g.get().o(c2.d().b());
                ImageView imageView = c.c;
                zq3.g(imageView, "gameIcon");
                o.p(imageView);
            }
            c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: zt2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameViewItem.O(GameViewItem.this, gamesAsset, view);
                }
            });
        }
        lr3Var.c.setScrollListener(new ss2() { // from class: com.nytimes.android.dailyfive.ui.items.GameViewItem$bindCarouselItems$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return ww8.a;
            }

            public final void invoke(int i) {
                Map map;
                DailyFiveGames dailyFiveGames;
                ss2 ss2Var;
                Integer valueOf = Integer.valueOf(i);
                map = GameViewItem.this.j;
                dailyFiveGames = GameViewItem.this.f;
                map.put(dailyFiveGames.a(), valueOf);
                ss2Var = GameViewItem.this.l;
                if (ss2Var != null) {
                    ss2Var.invoke(Integer.valueOf(i));
                }
            }
        });
        CarouselView carouselView2 = lr3Var.c;
        Integer num = (Integer) this.j.get(this.f.a());
        carouselView2.setScrollX(num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(GameViewItem gameViewItem, GamesAsset gamesAsset, View view) {
        zq3.h(gameViewItem, "this$0");
        zq3.h(gamesAsset, "$gameAsset");
        gameViewItem.h.invoke(gamesAsset, gameViewItem.E().b());
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.m;
    }

    @Override // defpackage.k80
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void A(lr3 lr3Var, int i) {
        zq3.h(lr3Var, "viewBinding");
        N(lr3Var);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public DailyFiveGames E() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public lr3 D(View view) {
        zq3.h(view, "view");
        lr3 a = lr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.bx4
    public List b(View view) {
        zq3.h(view, "root");
        LinearLayout linearLayout = D(view).b;
        zq3.g(linearLayout, "gamesCarouselContent");
        return kotlin.sequences.d.w(ViewGroupKt.b(linearLayout));
    }

    @Override // defpackage.bx4
    public List e() {
        return this.i;
    }

    @Override // defpackage.bx4
    public void g(View view, ss2 ss2Var) {
        zq3.h(view, "root");
        zq3.h(ss2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.l = ss2Var;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_games;
    }
}
