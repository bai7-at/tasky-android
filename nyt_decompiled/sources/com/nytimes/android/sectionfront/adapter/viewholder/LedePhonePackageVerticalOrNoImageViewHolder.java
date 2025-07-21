package com.nytimes.android.sectionfront.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.bd6;
import defpackage.k57;
import defpackage.pg6;
import defpackage.pr;
import defpackage.re7;
import defpackage.tm5;
import defpackage.um6;
import defpackage.yi7;

/* loaded from: classes4.dex */
public class LedePhonePackageVerticalOrNoImageViewHolder extends b {
    TextView n0;
    private View o0;
    private View p0;

    enum ToneCatalog {
        HEADLINE_WITH_BANNER(um6.Tone_SectionFront_News),
        HEADLINE_WITH_NOBANNER(um6.Tone_SectionFrontLede_News),
        BANNER_WITH_HEADLINE(um6.Tone_SectionFrontLede_News),
        BANNER_WITH_NOHEADLINE(um6.Tone_SectionFrontLede_News);

        public final int style;

        ToneCatalog(int i) {
            this.style = i;
        }
    }

    public LedePhonePackageVerticalOrNoImageViewHolder(View view, yi7 yi7Var, RecentlyViewedManager recentlyViewedManager, FooterBinder footerBinder, pr prVar) {
        super(view, yi7Var, recentlyViewedManager, footerBinder, prVar);
        this.o0 = view.findViewById(pg6.horizPhonePackageRule);
        this.n0 = (TextView) view.findViewById(pg6.row_sf_package_headline);
        this.p0 = view.findViewById(pg6.row_sf_no_banner_space);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b, com.nytimes.android.sectionfront.adapter.viewholder.a
    public void W(re7 re7Var) {
        super.W(re7Var);
        boolean z = this.n0.getVisibility() == 0;
        boolean z2 = this.S.getVisibility() == 0;
        if (z2) {
            ToneDecorator.b(this.n0.getContext(), (z ? ToneCatalog.HEADLINE_WITH_BANNER : ToneCatalog.HEADLINE_WITH_NOBANNER).style, this.S);
        }
        if (!z) {
            this.o0.setVisibility(8);
            this.p0.setVisibility(0);
        } else {
            ToneDecorator.b(this.n0.getContext(), (z2 ? ToneCatalog.BANNER_WITH_HEADLINE : ToneCatalog.BANNER_WITH_NOHEADLINE).style, this.n0);
            this.o0.setVisibility(0);
            this.p0.setVisibility(8);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b
    protected void o0(k57 k57Var, SectionFront sectionFront, boolean z) {
        tm5.a(this.n0, this.S, k57Var.a(), sectionFront);
        if (z) {
            TextView textView = this.n0;
            textView.setTextColor(textView.getContext().getResources().getColor(bd6.banner_text_read));
            TextView textView2 = this.S;
            textView2.setTextColor(textView2.getContext().getResources().getColor(bd6.headline_text_read));
            return;
        }
        TextView textView3 = this.n0;
        textView3.setTextColor(textView3.getContext().getResources().getColor(bd6.banner_text));
        TextView textView4 = this.S;
        textView4.setTextColor(textView4.getContext().getResources().getColor(bd6.banner_text_read));
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.b
    protected void q0(k57 k57Var, SectionFront sectionFront, boolean z, Optional optional) {
        super.q0(k57Var, sectionFront, z, optional);
        if (this.n0.getVisibility() != 0) {
            this.o0.setVisibility(8);
            return;
        }
        this.o0.setVisibility(0);
        this.o0.getLayoutParams().width = DeviceUtils.p(this.o0.getContext()) / 3;
    }
}
