package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.view.View;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.bd6;
import defpackage.hb5;
import defpackage.k57;
import defpackage.mi4;
import defpackage.mx0;
import defpackage.pr;
import defpackage.q1;
import defpackage.re7;
import defpackage.tm5;
import defpackage.um6;

/* loaded from: classes4.dex */
public class LedeGridPackageHorizontalImageViewHolder extends q1 {

    enum ToneCatalog {
        HEADLINE_WITH_BANNER(um6.Tone_SectionFront_News),
        HEADLINE_WITH_NOBANNER(um6.Tone_SectionFrontLede_News),
        BANNER_WITH_HEADLINE(um6.TextView_Section_Lede_Banner),
        BANNER_WITH_NOHEADLINE(um6.TextView_Section_Lede_Banner);

        public final int style;

        ToneCatalog(int i) {
            this.style = i;
        }
    }

    public LedeGridPackageHorizontalImageViewHolder(View view, Activity activity, pr prVar, FooterBinder footerBinder, NetworkStatus networkStatus, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view, activity, prVar, footerBinder, networkStatus, recentlyViewedManager, hb5Var, feedStore, mi4Var);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e, com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        super.W(re7Var);
        boolean z = this.r0.getVisibility() == 0;
        boolean z2 = this.S.getVisibility() == 0;
        if (z2) {
            ToneDecorator.b(this.y, (z ? ToneCatalog.HEADLINE_WITH_BANNER : ToneCatalog.HEADLINE_WITH_NOBANNER).style, this.S);
        }
        if (z) {
            ToneDecorator.b(this.y, (z2 ? ToneCatalog.BANNER_WITH_HEADLINE : ToneCatalog.BANNER_WITH_NOHEADLINE).style, this.r0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e
    protected void n0(k57 k57Var, SectionFront sectionFront, boolean z) {
        tm5.a(this.r0, this.S, k57Var.a(), sectionFront);
        if (z) {
            this.r0.setTextColor(mx0.c(this.y, bd6.headline_text_read));
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text_read));
        } else {
            this.r0.setTextColor(mx0.c(this.y, bd6.headline_text));
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text));
        }
    }
}
