package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.ToneDecorator;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.bd6;
import defpackage.hb5;
import defpackage.k57;
import defpackage.mi4;
import defpackage.pg6;
import defpackage.pr;
import defpackage.q1;
import defpackage.re7;
import defpackage.tm5;
import defpackage.yq;

/* loaded from: classes4.dex */
public class g extends q1 {
    private final LinearLayout s0;
    private final View t0;
    private boolean u0;

    public g(View view, Activity activity, pr prVar, FooterBinder footerBinder, NetworkStatus networkStatus, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view, activity, prVar, footerBinder, networkStatus, recentlyViewedManager, hb5Var, feedStore, mi4Var);
        this.u0 = false;
        this.s0 = (LinearLayout) view.findViewById(pg6.horizPhonePackageRule);
        this.t0 = view.findViewById(pg6.row_sf_lede_image_space);
    }

    private void A0(int i) {
        View view = this.t0;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private void z0(int i) {
        LinearLayout linearLayout = this.s0;
        if (linearLayout != null) {
            if (i == 0) {
                this.s0.getLayoutParams().width = DeviceUtils.p(linearLayout.getContext()) / 3;
            }
            this.s0.setVisibility(i);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e, com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        super.W(re7Var);
        yq yqVar = (yq) re7Var;
        SectionFront sectionFront = yqVar.i;
        Asset asset = yqVar.h;
        if (sectionFront == null || asset == null || sectionFront.getLedePackage() == null || sectionFront.getLedePackage().getAssetIds() == null) {
            return;
        }
        this.u0 = sectionFront.getLedePackage().getAssetIds().size() == 1;
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e
    protected void n0(k57 k57Var, SectionFront sectionFront, boolean z) {
        tm5.a(this.r0, this.S, k57Var.a(), sectionFront);
        if (this.r0.getVisibility() == 0) {
            ToneDecorator.c(this.a.getContext(), sectionFront, ToneDecorator.ToneLayout.SECTION_FRONT_LEDE, this.r0);
            ToneDecorator.c(this.a.getContext(), sectionFront, ToneDecorator.ToneLayout.SECTION_FRONT, this.S);
        } else {
            ToneDecorator.c(this.a.getContext(), sectionFront, ToneDecorator.ToneLayout.SECTION_FRONT_LEDE, this.S);
        }
        if (z) {
            TextView textView = this.r0;
            textView.setTextColor(textView.getContext().getResources().getColor(bd6.banner_text_read));
            TextView textView2 = this.S;
            textView2.setTextColor(textView2.getContext().getResources().getColor(bd6.headline_text_read));
            return;
        }
        TextView textView3 = this.r0;
        textView3.setTextColor(textView3.getContext().getResources().getColor(bd6.banner_text));
        TextView textView4 = this.S;
        textView4.setTextColor(textView4.getContext().getResources().getColor(bd6.headline_text));
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.e
    protected void o0(k57 k57Var, SectionFront sectionFront, re7 re7Var) {
        if (re7Var.f() == null && sectionFront.getLedePackage().hasBanner()) {
            A0(8);
            z0(0);
        } else {
            A0(0);
            z0(8);
            super.o0(k57Var, sectionFront, re7Var);
        }
    }
}
