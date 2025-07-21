package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.ToneDecorator;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.bd6;
import defpackage.hb5;
import defpackage.k57;
import defpackage.mi4;
import defpackage.pr;

/* loaded from: classes4.dex */
public class d extends e {
    public d(View view, Activity activity, boolean z, pr prVar, FooterBinder footerBinder, NetworkStatus networkStatus, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view, activity, prVar, footerBinder, networkStatus, recentlyViewedManager, hb5Var, feedStore, mi4Var);
        this.L.setAspectRatioOption(z ? 3 : 1);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e
    protected void n0(k57 k57Var, SectionFront sectionFront, boolean z) {
        Asset a = k57Var.a();
        ToneDecorator.c(this.a.getContext(), sectionFront, ToneDecorator.ToneLayout.SECTION_FRONT, this.S);
        this.S.setText(a.getDisplayTitle());
        if (z) {
            TextView textView = this.S;
            textView.setTextColor(textView.getContext().getResources().getColor(bd6.headline_text_read));
        } else {
            TextView textView2 = this.S;
            textView2.setTextColor(textView2.getContext().getResources().getColor(bd6.headline_text));
        }
    }
}
