package com.nytimes.android.dailyfive.ui.items;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveArticle;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.ui.items.a;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import defpackage.a58;
import defpackage.ai6;
import defpackage.di0;
import defpackage.du8;
import defpackage.hn6;
import defpackage.hr3;
import defpackage.it7;
import defpackage.k56;
import defpackage.lf6;
import defpackage.qs2;
import defpackage.zq3;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class a extends c implements it7 {
    private final DailyFiveArticle f;
    private final k56 g;
    private final boolean h;
    private final di0 i;
    private final qs2 j;
    private final List k;
    private final Pair l;

    public a(DailyFiveArticle dailyFiveArticle, k56 k56Var, boolean z, di0 di0Var, qs2 qs2Var) {
        zq3.h(dailyFiveArticle, AssetConstants.ARTICLE_TYPE);
        zq3.h(k56Var, "promoMediaBinder");
        zq3.h(di0Var, "et2CardImpression");
        zq3.h(qs2Var, "onClickListener");
        this.f = dailyFiveArticle;
        this.g = k56Var;
        this.h = z;
        this.i = di0Var;
        this.j = qs2Var;
        this.k = i.e(dailyFiveArticle.a().b().d());
        this.l = du8.a(dailyFiveArticle, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(a aVar, View view) {
        zq3.h(aVar, "this$0");
        aVar.j.mo865invoke();
    }

    private final void L(hr3 hr3Var) {
        com.nytimes.android.dailyfive.domain.b b = this.f.a().b();
        String a = b.a();
        TextView textView = hr3Var.f;
        a58 a58Var = a58.a;
        Context context = hr3Var.getRoot().getContext();
        zq3.g(context, "getContext(...)");
        textView.setText(a58Var.a(context, a + " ", hn6.DailyFive_ArticleHeading, lf6.font_chelt_bold, b.c(), hn6.DailyFive_ArticleSummary, lf6.font_chelt_light));
        TextView textView2 = hr3Var.e;
        zq3.g(textView2, "label");
        textView2.setVisibility(b.f() ? 0 : 8);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.k;
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public boolean G() {
        return true;
    }

    @Override // defpackage.k80
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void A(hr3 hr3Var, int i) {
        zq3.h(hr3Var, "binding");
        hr3Var.d.setText(this.f.c());
        L(hr3Var);
        com.nytimes.android.dailyfive.domain.b b = this.f.a().b();
        com.nytimes.android.dailyfive.domain.d dVar = b instanceof com.nytimes.android.dailyfive.domain.d ? (com.nytimes.android.dailyfive.domain.d) b : null;
        Image b2 = dVar != null ? dVar.b() : null;
        k56 k56Var = this.g;
        AspectRatioImageView aspectRatioImageView = hr3Var.c;
        zq3.g(aspectRatioImageView, AssetConstants.IMAGE_TYPE);
        k56.b(k56Var, b2, aspectRatioImageView, hr3Var.b, null, 0, 0, 56, null);
        hr3Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.K(a.this, view);
            }
        });
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Pair E() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public hr3 D(View view) {
        zq3.h(view, "view");
        hr3 a = hr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.it7
    public di0 h() {
        return this.i;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_article;
    }
}
