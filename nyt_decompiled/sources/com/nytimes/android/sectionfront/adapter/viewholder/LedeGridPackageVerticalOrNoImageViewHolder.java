package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import defpackage.a1;
import defpackage.bd6;
import defpackage.ee6;
import defpackage.k57;
import defpackage.mx0;
import defpackage.pg6;
import defpackage.pr;
import defpackage.re7;
import defpackage.tm5;
import defpackage.um6;
import defpackage.yi7;

/* loaded from: classes4.dex */
public class LedeGridPackageVerticalOrNoImageViewHolder extends b {
    protected TextView n0;
    protected View o0;

    enum ToneCatalog {
        HEADLINE_WITH_BANNER(um6.Tone_SectionFront_News),
        HEADLINE_WITH_NOBANNER(um6.TextView_Section_Lede_Banner),
        BANNER_WITH_HEADLINE(um6.TextView_Section_Lede_Banner),
        BANNER_WITH_NOHEADLINE(um6.TextView_Section_Lede_Banner);

        public final int style;

        ToneCatalog(int i) {
            this.style = i;
        }
    }

    public LedeGridPackageVerticalOrNoImageViewHolder(View view, Activity activity, yi7 yi7Var, RecentlyViewedManager recentlyViewedManager, FooterBinder footerBinder, pr prVar) {
        super(view, yi7Var, recentlyViewedManager, footerBinder, prVar);
        this.n0 = (TextView) view.findViewById(pg6.row_sf_package_headline);
        this.o0 = view.findViewById(pg6.package_no_image_divider);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(ee6.row_section_front_package_vertical_image_max_width);
        a1 a1Var = this.Y;
        if (a1Var != null) {
            a1Var.setMaxWidth(dimensionPixelSize);
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setMaxWidth(dimensionPixelSize);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b, com.nytimes.android.sectionfront.adapter.viewholder.a
    public void W(re7 re7Var) {
        super.W(re7Var);
        boolean z = this.n0.getVisibility() == 0;
        boolean z2 = this.S.getVisibility() == 0;
        if (z2) {
            ToneDecorator.b(this.n0.getContext(), (z ? ToneCatalog.HEADLINE_WITH_BANNER : ToneCatalog.HEADLINE_WITH_NOBANNER).style, this.S);
        }
        if (z) {
            ToneDecorator.b(this.n0.getContext(), (z2 ? ToneCatalog.BANNER_WITH_HEADLINE : ToneCatalog.BANNER_WITH_NOHEADLINE).style, this.n0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b
    protected void o0(k57 k57Var, SectionFront sectionFront, boolean z) {
        tm5.a(this.n0, this.S, k57Var.a(), sectionFront);
        if (z) {
            this.n0.setTextColor(mx0.c(this.y, bd6.banner_text_read));
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text_read));
        } else {
            this.n0.setTextColor(mx0.c(this.y, bd6.banner_text));
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text));
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b
    protected void q0(k57 k57Var, SectionFront sectionFront, boolean z, Optional optional) {
        super.q0(k57Var, sectionFront, z, optional);
        if (this.n0.getVisibility() == 0) {
            this.o0.setVisibility(0);
        } else {
            this.o0.setVisibility(8);
        }
    }
}
