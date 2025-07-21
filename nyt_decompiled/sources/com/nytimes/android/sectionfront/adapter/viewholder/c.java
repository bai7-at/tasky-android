package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.m;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.FooterView;
import defpackage.al;
import defpackage.bd6;
import defpackage.dd6;
import defpackage.ip6;
import defpackage.k57;
import defpackage.mn2;
import defpackage.oe6;
import defpackage.og3;
import defpackage.pg6;
import defpackage.qn2;
import defpackage.re7;
import defpackage.sg3;
import defpackage.yq;
import io.reactivex.disposables.Disposable;

/* loaded from: classes4.dex */
public class c extends a implements m, ip6, qn2 {
    protected ImageView L;
    protected View M;
    TextView N;
    TextView Q;
    TextView S;
    FooterView X;
    boolean Y;
    final TextView Z;
    private final RecentlyViewedManager e0;
    private final FooterBinder f0;
    private Disposable g0;

    public c(View view, Activity activity, RecentlyViewedManager recentlyViewedManager, FooterBinder footerBinder) {
        super(view);
        this.Y = false;
        this.S = (TextView) view.findViewById(pg6.row_sf_dailybriefing_kicker);
        this.e0 = recentlyViewedManager;
        this.f0 = footerBinder;
        h0(activity);
        this.N = (TextView) view.findViewById(pg6.row_sf_dailybriefing_headline);
        this.Z = (TextView) view.findViewById(pg6.row_sf_dailybriefing_byline);
        TextView textView = (TextView) view.findViewById(pg6.row_sf_dailybriefing_summary);
        this.Q = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        this.L = (ImageView) view.findViewById(pg6.row_sf_dailybriefing_thumbnail);
        this.M = view.findViewById(pg6.thumbnail_container);
        this.X = (FooterView) view.findViewById(pg6.footer_view);
    }

    private void h0(Context context) {
        this.S.setCompoundDrawablesWithIntrinsicBounds(al.b(context, oe6.ic_daily_briefing), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void i0(Asset asset) {
        if (this.Z != null) {
            String byline = asset.getByline();
            if (TextUtils.isEmpty(byline)) {
                this.Z.setVisibility(8);
                return;
            }
            if (AssetConstants.VIDEO_TYPE.equals(asset.getAssetType())) {
                byline = Y(byline);
            }
            this.Z.setText(byline);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void W(re7 re7Var) {
        yq yqVar = (yq) re7Var;
        Asset asset = yqVar.h;
        SectionFront sectionFront = yqVar.i;
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams instanceof SpannableGridLayoutManager.c) {
            this.Y = ((SpannableGridLayoutManager.c) layoutParams).h;
        }
        boolean u = this.e0.u(asset.getSafeUri());
        k0(asset, sectionFront, u);
        j0(asset, sectionFront, u);
        i0(asset);
        m0(asset, sectionFront, u);
        l0(this.Y, yqVar.f());
        Disposable disposable = this.g0;
        if (disposable != null && !disposable.isDisposed()) {
            this.g0.dispose();
        }
        this.g0 = this.f0.f(this.X, yqVar, n0());
    }

    @Override // defpackage.qn2
    public void a(mn2 mn2Var) {
        if (this.X == null || !n0()) {
            return;
        }
        this.f0.g(this.X, mn2Var.b(), mn2Var.c());
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public int b() {
        return m.a.a(this.S, this.N);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public void c(int i) {
        View view = this.M;
        if (view != null) {
            view.setPadding(0, i, 0, 0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public void d() {
        View view = this.M;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.L.setImageDrawable(null);
        this.L.setTag(null);
        Disposable disposable = this.g0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public boolean e() {
        ImageView imageView = this.L;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // defpackage.ip6
    public void f(k57 k57Var, SectionFront sectionFront) {
        Asset a = k57Var.a();
        j0(a, sectionFront, true);
        m0(a, sectionFront, true);
    }

    void j0(Asset asset, SectionFront sectionFront, boolean z) {
        this.N.setText(asset.getDisplayTitle());
        if (z) {
            TextView textView = this.N;
            textView.setTextColor(textView.getContext().getResources().getColor(bd6.headline_text_read));
        } else {
            TextView textView2 = this.N;
            textView2.setTextColor(textView2.getContext().getResources().getColor(bd6.headline_text));
        }
    }

    void k0(Asset asset, SectionFront sectionFront, boolean z) {
        int i = 0;
        if (!z) {
            this.S.setTextColor(this.N.getContext().getResources().getColor(bd6.kicker_text));
            Drawable[] compoundDrawables = this.S.getCompoundDrawables();
            int length = compoundDrawables.length;
            while (i < length) {
                Drawable drawable = compoundDrawables[i];
                if (drawable != null) {
                    drawable.setColorFilter(null);
                }
                i++;
            }
            return;
        }
        int color = this.S.getContext().getResources().getColor(bd6.kicker_text_read);
        this.S.setTextColor(color);
        Drawable[] compoundDrawables2 = this.S.getCompoundDrawables();
        int length2 = compoundDrawables2.length;
        while (i < length2) {
            Drawable drawable2 = compoundDrawables2[i];
            if (drawable2 != null) {
                drawable2.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            i++;
        }
    }

    void l0(boolean z, ImageDimension imageDimension) {
        if (z || imageDimension == null) {
            this.L.setVisibility(8);
            return;
        }
        String url = imageDimension.getUrl();
        if (url == null) {
            this.L.setVisibility(8);
        } else {
            this.L.setVisibility(0);
            og3.c().o(url).i(sg3.a(this.a.getContext(), dd6.image_placeholder)).p(this.L);
        }
    }

    void m0(Asset asset, SectionFront sectionFront, boolean z) {
        this.Q.setText(asset.getSummary());
        if (z) {
            TextView textView = this.Q;
            textView.setTextColor(textView.getContext().getResources().getColor(bd6.summary_text_read));
        } else {
            TextView textView2 = this.Q;
            textView2.setTextColor(textView2.getContext().getResources().getColor(bd6.summary_text));
        }
    }

    public boolean n0() {
        TextView textView = this.Q;
        return textView != null && textView.getVisibility() == 0;
    }
}
