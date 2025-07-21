package com.nytimes.android.dailyfive.ui.items;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.ui.items.g;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import defpackage.ai6;
import defpackage.ce6;
import defpackage.di0;
import defpackage.du8;
import defpackage.fk6;
import defpackage.it7;
import defpackage.k56;
import defpackage.pd6;
import defpackage.qs2;
import defpackage.ur3;
import defpackage.zq3;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class g extends c implements it7 {
    private final DailyFiveAsset f;
    private final int g;
    private final k56 h;
    private final boolean i;
    private final di0 j;
    private final boolean k;
    private final qs2 l;
    private final List m;
    private final Pair n;

    public g(DailyFiveAsset dailyFiveAsset, int i, k56 k56Var, boolean z, di0 di0Var, boolean z2, qs2 qs2Var) {
        zq3.h(dailyFiveAsset, "asset");
        zq3.h(k56Var, "promoMediaBinder");
        zq3.h(di0Var, "et2CardImpression");
        zq3.h(qs2Var, "onClickListener");
        this.f = dailyFiveAsset;
        this.g = i;
        this.h = k56Var;
        this.i = z;
        this.j = di0Var;
        this.k = z2;
        this.l = qs2Var;
        this.m = i.e(dailyFiveAsset.b().d());
        this.n = du8.a(dailyFiveAsset, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(g gVar, View view) {
        zq3.h(gVar, "this$0");
        gVar.l.mo865invoke();
    }

    private final void L(ur3 ur3Var) {
        ur3Var.e.setTextColor(ur3Var.getRoot().getContext().getColor(pd6.daily_five_text_color_dark));
        ur3Var.e.setText(this.f.b().a());
        TextView textView = ur3Var.c;
        zq3.g(textView, "label");
        textView.setVisibility(this.f.b().f() ? 0 : 8);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.m;
    }

    @Override // defpackage.k80
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void A(ur3 ur3Var, int i) {
        zq3.h(ur3Var, "binding");
        L(ur3Var);
        com.nytimes.android.dailyfive.domain.b b = this.f.b();
        com.nytimes.android.dailyfive.domain.d dVar = b instanceof com.nytimes.android.dailyfive.domain.d ? (com.nytimes.android.dailyfive.domain.d) b : null;
        Image b2 = dVar != null ? dVar.b() : null;
        k56 k56Var = this.h;
        AspectRatioImageView aspectRatioImageView = ur3Var.b;
        zq3.g(aspectRatioImageView, AssetConstants.IMAGE_TYPE);
        k56.b(k56Var, b2, aspectRatioImageView, null, b2 != null ? b2.e() : null, 0, 0, 52, null);
        ur3Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: os8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.K(g.this, view);
            }
        });
        Resources resources = ur3Var.getRoot().getResources();
        ConstraintLayout root = ur3Var.getRoot();
        zq3.g(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), resources.getDimensionPixelOffset(this.k ? ce6.daily_five_trending_bottom_padding_last : ce6.daily_five_trending_bottom_padding));
        ur3Var.getRoot().setContentDescription(ur3Var.getRoot().getContext().getString(fk6.daily_five_for_you_trending_accessibility) + " " + this.g);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Pair E() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public ur3 D(View view) {
        zq3.h(view, "view");
        ur3 a = ur3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.it7
    public di0 h() {
        return this.j;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_trending_article;
    }
}
