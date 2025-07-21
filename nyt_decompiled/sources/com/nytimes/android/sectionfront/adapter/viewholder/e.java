package com.nytimes.android.sectionfront.adapter.viewholder;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.ToneDecorator;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.FooterView;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.video.views.InlineVideoView;
import defpackage.a1;
import defpackage.al4;
import defpackage.bd6;
import defpackage.fp2;
import defpackage.hb5;
import defpackage.if5;
import defpackage.ip6;
import defpackage.jf5;
import defpackage.k57;
import defpackage.lf6;
import defpackage.mi4;
import defpackage.mn2;
import defpackage.mx0;
import defpackage.oe6;
import defpackage.og3;
import defpackage.pg6;
import defpackage.pr;
import defpackage.qn2;
import defpackage.re7;
import defpackage.um6;
import defpackage.yq;
import defpackage.yt;
import io.reactivex.disposables.Disposable;
import java.util.Locale;

/* loaded from: classes4.dex */
public class e extends a implements ip6, qn2 {
    protected AspectRatioImageView L;
    protected TextView M;
    protected TextView N;
    protected TextView Q;
    protected TextView S;
    protected TextView X;
    protected a1 Y;
    protected TextView Z;
    protected FooterView e0;
    protected InlineVideoView f0;
    final al4 g0;
    final FooterBinder h0;
    Disposable i0;
    f j0;
    private j k0;
    private final l l0;
    private long m0;
    private final pr n0;
    private final NetworkStatus o0;
    private final RecentlyViewedManager p0;
    private final hb5 q0;

    public e(View view, Activity activity, pr prVar, FooterBinder footerBinder, NetworkStatus networkStatus, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view);
        this.m0 = -1L;
        this.n0 = prVar;
        this.h0 = footerBinder;
        this.o0 = networkStatus;
        this.p0 = recentlyViewedManager;
        this.q0 = hb5Var;
        this.L = (AspectRatioImageView) view.findViewById(pg6.row_sf_lede_image);
        this.M = (TextView) view.findViewById(pg6.row_sf_lede_image_credit);
        this.N = (TextView) view.findViewById(pg6.row_sf_lede_image_caption_and_credit);
        this.Q = (TextView) view.findViewById(pg6.row_sf_lede_kicker);
        this.S = (TextView) view.findViewById(pg6.row_sf_lede_headline);
        this.X = (TextView) view.findViewById(pg6.row_sf_lede_byline_timestamp);
        this.Y = (a1) view.findViewById(pg6.row_sf_lede_summary);
        this.Z = (TextView) view.findViewById(pg6.row_sf_ordered_section_number);
        this.e0 = (FooterView) this.a.findViewById(pg6.footer_view);
        this.f0 = (InlineVideoView) this.a.findViewById(pg6.sf_inline_video_view);
        this.l0 = new l(activity, l0(), this.f0, feedStore, mi4Var);
        this.g0 = new al4(this.a, false, 0);
    }

    private j k0() {
        if (this.k0 == null) {
            this.k0 = i0();
        }
        return this.k0;
    }

    private void m0(Asset asset) {
        if (TextUtils.isEmpty(asset.getByline())) {
            this.X.setVisibility(8);
            return;
        }
        this.X.setVisibility(0);
        String byline = asset.getByline();
        if (AssetConstants.VIDEO_TYPE.equals(asset.getAssetType())) {
            byline = Y(byline);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(byline + "  ");
        fp2.d(this.y, spannableStringBuilder, um6.TextView_Section_BylineAndTimestamp_Byline, lf6.font_chelt_sh_medium, 0, spannableStringBuilder.length());
        this.X.setText(spannableStringBuilder);
    }

    private void r0(int i) {
        if (this.Z != null) {
            this.Z.setText(i + InstructionFileId.DOT);
        }
    }

    private void t0(boolean z) {
        TextView textView = this.Z;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.Z.setTextColor(mx0.c(this.y, z ? bd6.ordered_section_number_read : bd6.ordered_section_number));
    }

    private boolean u0(k57 k57Var, SectionFront sectionFront) {
        return this.f0 != null && this.g0.l(k57Var.a(), sectionFront);
    }

    private void w0() {
        e0(this.f0);
        f0(this.L);
    }

    private void x0() {
        e0(this.L);
        f0(this.f0);
    }

    private void y0() {
        l lVar = this.l0;
        if (lVar != null) {
            lVar.c();
        }
        k0().d();
        og3.b(this.L);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        y0();
        InlineVideoView inlineVideoView = this.f0;
        if (inlineVideoView != null) {
            inlineVideoView.setActive(false);
        }
        yq yqVar = (yq) re7Var;
        k57 k57Var = yqVar.j;
        Asset asset = yqVar.h;
        SectionFront sectionFront = yqVar.i;
        this.m0 = -1L;
        boolean u = this.p0.u(asset.getSafeUri());
        if (this.X != null) {
            m0(asset);
        }
        if (this.Y != null) {
            q0(k57Var, u);
        }
        o0(k57Var, sectionFront, re7Var);
        p0(k57Var, sectionFront, u);
        n0(k57Var, sectionFront, u);
        t0(u);
        s0(yqVar);
        if (this.e0 != null) {
            Disposable disposable = this.i0;
            if (disposable != null && !disposable.isDisposed()) {
                this.i0.dispose();
            }
            this.i0 = this.h0.f(this.e0, yqVar, v0());
        }
    }

    @Override // defpackage.qn2
    public void a(mn2 mn2Var) {
        if (this.e0 == null || !v0()) {
            return;
        }
        this.h0.g(this.e0, mn2Var.b(), mn2Var.c());
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void a0() {
        super.a0();
        if (this.f0 == null || !this.q0.j(this.m0, null)) {
            return;
        }
        this.q0.A();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void b0(if5 if5Var, jf5 jf5Var) {
        super.b0(if5Var, jf5Var);
        InlineVideoView inlineVideoView = this.f0;
        if (inlineVideoView != null) {
            inlineVideoView.R();
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void c0() {
        y0();
        super.c0();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.L.setImageDrawable(null);
        this.L.setTag(null);
        Disposable disposable = this.i0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // defpackage.ip6
    public void f(k57 k57Var, SectionFront sectionFront) {
        Asset a = k57Var.a();
        if (this.X != null) {
            m0(a);
        }
        if (this.Y != null) {
            q0(k57Var, true);
        }
        p0(k57Var, sectionFront, true);
        n0(k57Var, sectionFront, true);
        t0(true);
    }

    protected f h0() {
        return new f(this.y, this.M, this.N);
    }

    protected j i0() {
        return new j(this.y, this.o0, this.g0, this.L, l0());
    }

    protected pr j0() {
        return this.n0;
    }

    f l0() {
        if (this.j0 == null) {
            this.j0 = h0();
        }
        return this.j0;
    }

    protected void n0(k57 k57Var, SectionFront sectionFront, boolean z) {
        Asset a = k57Var.a();
        ToneDecorator.c(this.a.getContext(), sectionFront, ToneDecorator.ToneLayout.SECTION_FRONT_LEDE, this.S);
        this.S.setText(a.getDisplayTitle());
        this.S.setTextColor(mx0.c(this.y, z ? bd6.headline_text_read : bd6.headline_text));
    }

    protected void o0(k57 k57Var, SectionFront sectionFront, re7 re7Var) {
        if (!u0(k57Var, sectionFront)) {
            w0();
            k0().k(k57Var, sectionFront, Optional.b(re7Var.f()));
            return;
        }
        Asset l = yt.l(k57Var.a(), sectionFront);
        if (l instanceof VideoAsset) {
            VideoAsset videoAsset = (VideoAsset) l;
            x0();
            this.m0 = videoAsset.getAssetId();
            this.l0.f(k57Var.a(), videoAsset, sectionFront, Optional.b(re7Var.g()));
        }
    }

    void p0(k57 k57Var, SectionFront sectionFront, boolean z) {
        if (this.Q == null) {
            return;
        }
        Asset a = k57Var.a();
        String Z = Z(k57Var, sectionFront);
        if (TextUtils.isEmpty(Z) || (a instanceof VideoAsset)) {
            this.Q.setVisibility(8);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Z.toUpperCase(Locale.getDefault()));
        int c = mx0.c(this.y, z ? bd6.kicker_text_read : bd6.kicker_text);
        this.Q.setTextColor(c);
        if (a instanceof InteractiveAsset) {
            Drawable drawable = this.a.getContext().getResources().getDrawable(oe6.ic_interactive_kicker);
            if (z) {
                drawable.setColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter(null);
            }
            this.Q.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.Q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.Q.setText(spannableStringBuilder);
        this.Q.setVisibility(0);
    }

    void q0(k57 k57Var, boolean z) {
        j0().a(this.Y, k57Var, Boolean.valueOf(z));
    }

    protected void s0(yq yqVar) {
        if (!yqVar.g) {
            this.Z.setVisibility(8);
            return;
        }
        r0(yqVar.f + 1);
        this.Z.setVisibility(0);
        this.e0.i();
    }

    public boolean v0() {
        a1 a1Var = this.Y;
        return a1Var != null && a1Var.getVisibility() == 0;
    }
}
