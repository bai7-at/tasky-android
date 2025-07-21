package com.nytimes.android.dailyfive.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.DailyFivePack;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.ui.items.PackViewItem;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.designsystem.uiview.CarouselView;
import defpackage.ai6;
import defpackage.bx4;
import defpackage.fk6;
import defpackage.gt2;
import defpackage.k56;
import defpackage.or3;
import defpackage.pd6;
import defpackage.pr3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class PackViewItem extends c implements bx4 {
    private final DailyFivePack f;
    private final k56 g;
    private final Map h;
    private final List i;
    private final gt2 j;
    private final ss2 k;
    private final Map l;
    private final List m;
    private ss2 n;

    public PackViewItem(DailyFivePack dailyFivePack, k56 k56Var, Map map, List list, gt2 gt2Var, ss2 ss2Var, Map map2) {
        zq3.h(dailyFivePack, "pack");
        zq3.h(k56Var, "promoMediaBinder");
        zq3.h(map, "readStatus");
        zq3.h(list, "et2CardImpressions");
        zq3.h(gt2Var, "assetClickListener");
        zq3.h(ss2Var, "flingListener");
        zq3.h(map2, "carouselPositionCache");
        this.f = dailyFivePack;
        this.g = k56Var;
        this.h = map;
        this.i = list;
        this.j = gt2Var;
        this.k = ss2Var;
        this.l = map2;
        List a = dailyFivePack.a();
        ArrayList arrayList = new ArrayList(i.w(a, 10));
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((DailyFiveAsset) it2.next()).b().d());
        }
        this.m = arrayList;
    }

    private final void N(pr3 pr3Var, final DailyFiveAsset dailyFiveAsset, int i) {
        com.nytimes.android.dailyfive.domain.b b = dailyFiveAsset.b();
        k56 k56Var = this.g;
        Image b2 = b.b();
        AspectRatioImageView aspectRatioImageView = pr3Var.d;
        zq3.g(aspectRatioImageView, AssetConstants.IMAGE_TYPE);
        k56.b(k56Var, b2, aspectRatioImageView, pr3Var.b, null, 1024, 683, 8, null);
        pr3Var.c.setText(b.a());
        pr3Var.c.setTextColor(pr3Var.getRoot().getContext().getColor(pd6.daily_five_text_color_dark));
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = pr3Var.getRoot().getLayoutParams();
            zq3.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        }
        TextView textView = pr3Var.e;
        zq3.g(textView, "label");
        textView.setVisibility(b.f() ? 0 : 8);
        pr3Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: qm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PackViewItem.O(PackViewItem.this, dailyFiveAsset, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(PackViewItem packViewItem, DailyFiveAsset dailyFiveAsset, View view) {
        zq3.h(packViewItem, "this$0");
        zq3.h(dailyFiveAsset, "$asset");
        gt2 gt2Var = packViewItem.j;
        String string = view.getResources().getString(fk6.daily_five_pack_title);
        zq3.g(string, "getString(...)");
        gt2Var.invoke(dailyFiveAsset, string);
    }

    private final void P(or3 or3Var, LayoutInflater layoutInflater) {
        or3Var.c.setPagedScroll(true);
        or3Var.c.setFlingListener(this.k);
        or3Var.c.setScrollListener(null);
        or3Var.b.removeAllViews();
        int i = 0;
        for (Object obj : this.f.a()) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            pr3 c = pr3.c(layoutInflater, or3Var.b, true);
            zq3.g(c, "inflate(...)");
            N(c, (DailyFiveAsset) obj, i);
            i = i2;
        }
        or3Var.c.setScrollListener(new ss2() { // from class: com.nytimes.android.dailyfive.ui.items.PackViewItem$bindArticles$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(int i3) {
                Map map;
                DailyFivePack dailyFivePack;
                ss2 ss2Var;
                Integer valueOf = Integer.valueOf(i3);
                map = PackViewItem.this.l;
                dailyFivePack = PackViewItem.this.f;
                map.put(dailyFivePack.b().e(), valueOf);
                ss2Var = PackViewItem.this.n;
                if (ss2Var != null) {
                    ss2Var.invoke(Integer.valueOf(i3));
                }
            }
        });
        CarouselView carouselView = or3Var.c;
        Integer num = (Integer) this.l.get(this.f.b().e());
        carouselView.setScrollX(num != null ? num.intValue() : 0);
    }

    private final void Q(or3 or3Var) {
        or3Var.d.setText(this.f.f());
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.m;
    }

    @Override // defpackage.k80
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void A(or3 or3Var, int i) {
        zq3.h(or3Var, "binding");
        LayoutInflater from = LayoutInflater.from(or3Var.getRoot().getContext());
        Q(or3Var);
        zq3.e(from);
        P(or3Var, from);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Pair E() {
        return new Pair(this.f, this.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public or3 D(View view) {
        zq3.h(view, "view");
        or3 a = or3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.bx4
    public List b(View view) {
        zq3.h(view, "root");
        LinearLayout linearLayout = D(view).b;
        zq3.g(linearLayout, "carouselContent");
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
        this.n = ss2Var;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_pack;
    }
}
