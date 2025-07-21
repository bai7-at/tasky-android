package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.media.audio.views.SfAudioControl;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.SectionTextDecorator;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.FooterView;
import com.nytimes.android.sectionfront.ui.HomepageGroupHeaderView;
import defpackage.a1;
import defpackage.dd6;
import defpackage.ee6;
import defpackage.k57;
import defpackage.mn2;
import defpackage.og3;
import defpackage.pg6;
import defpackage.pr;
import defpackage.qn2;
import defpackage.re7;
import defpackage.s48;
import defpackage.yq;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes4.dex */
public class i extends a implements qn2 {
    final TextView L;
    final TextView M;
    final FooterView N;
    final HomepageGroupHeaderView Q;
    final FooterBinder S;
    private final View X;
    private final View Y;
    private final CardView Z;
    private final View e0;
    private final a1 f0;
    private final ImageView g0;
    private final FrameLayout h0;
    private final SfAudioControl i0;
    private final CompositeDisposable j0;
    private final int k0;
    private final int l0;
    private final int m0;
    private final pr n0;
    private final com.nytimes.android.media.common.a o0;
    private final AudioFileVerifier p0;
    private final RecentlyViewedManager q0;

    public i(View view, FooterBinder footerBinder, pr prVar, com.nytimes.android.media.common.a aVar, AudioFileVerifier audioFileVerifier, RecentlyViewedManager recentlyViewedManager) {
        super(view);
        this.j0 = new CompositeDisposable();
        this.S = footerBinder;
        this.n0 = prVar;
        this.o0 = aVar;
        this.p0 = audioFileVerifier;
        this.q0 = recentlyViewedManager;
        this.i0 = (SfAudioControl) this.a.findViewById(pg6.audio_view);
        this.Z = (CardView) this.a.findViewById(pg6.card_view);
        this.L = (TextView) this.a.findViewById(pg6.row_sf_kicker);
        this.M = (TextView) this.a.findViewById(pg6.row_sf_headline);
        this.f0 = (a1) this.a.findViewById(pg6.row_sf_summary);
        ImageView imageView = (ImageView) this.a.findViewById(pg6.row_sf_thumbnail);
        this.g0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        imageView.setAdjustViewBounds(true);
        this.h0 = (FrameLayout) this.a.findViewById(pg6.media_component);
        this.N = (FooterView) this.a.findViewById(pg6.footer_view);
        this.Q = (HomepageGroupHeaderView) view.findViewById(pg6.row_group_header);
        this.X = view.findViewById(pg6.row_group_header_separator);
        this.e0 = this.a.findViewById(pg6.rule);
        this.Y = this.a.findViewById(pg6.row_pre_kicker_space);
        View findViewById = this.a.findViewById(pg6.row_sf_byline_and_timestamp);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        Resources resources = this.a.getContext().getResources();
        this.k0 = resources.getDimensionPixelSize(ee6.search_thumbnail_width_and_height);
        this.l0 = resources.getDimensionPixelSize(ee6.section_front_thumbnail_width_and_height_annex);
        this.m0 = resources.getDimensionPixelSize(ee6.row_section_front_spacing_top_bottom);
    }

    private void h0(yq yqVar) {
        if (this.N != null) {
            this.j0.clear();
            this.j0.add(this.S.f(this.N, yqVar, o0()));
            this.N.n();
        }
    }

    private void i0() {
        if (this.Q.getVisibility() == 0) {
            f0(this.Y);
        } else {
            e0(this.Y);
        }
    }

    private void j0(AudioAsset audioAsset, boolean z) {
        SectionTextDecorator.a(this.y, SectionTextDecorator.Text.HEADLINE, this.M, z);
        this.M.setGravity(0);
        this.M.setText(audioAsset.getDisplayTitle());
    }

    private void k0(String str, k57 k57Var) {
        FrameLayout frameLayout = this.h0;
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = k57Var.d() ? this.k0 : this.l0;
            layoutParams.width = k57Var.d() ? this.k0 : this.l0;
            this.h0.setLayoutParams(layoutParams);
        }
        if (str == null) {
            e0(this.g0, this.h0);
        } else {
            og3.c().o(str).l(dd6.image_placeholder).j().h().p(this.g0);
            f0(this.g0, this.h0);
        }
    }

    private void l0(String str) {
        if (s48.b(str)) {
            e0(this.L);
        } else {
            this.L.setText(str);
            f0(this.L);
        }
    }

    private void m0(k57 k57Var) {
        this.n0.a(this.f0, k57Var, Boolean.FALSE);
    }

    private void n0() {
        this.X.setVisibility(8);
        this.Q.a();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        yq yqVar = (yq) re7Var;
        Asset asset = yqVar.h;
        if (asset instanceof AudioAsset) {
            AudioAsset audioAsset = (AudioAsset) asset;
            if (this.p0.isSupported(audioAsset)) {
                this.a.setVisibility(0);
                n0();
                SectionFront sectionFront = yqVar.i;
                boolean u = this.q0.u(audioAsset.getSafeUri());
                e0(this.e0);
                i0();
                k0(audioAsset.seriesThumbUrl(), yqVar.j);
                l0(audioAsset.getKicker());
                j0(audioAsset, u);
                m0(yqVar.e());
                h0(yqVar);
                this.N.r();
                this.N.n();
                this.N.l();
                this.N.m();
                this.i0.setPaddingRelative(0, yqVar.j.d() ? this.m0 : 0, 0, 0);
                this.i0.r(this.o0.a(audioAsset, sectionFront), this.Z);
                return;
            }
        }
        this.a.setVisibility(8);
    }

    @Override // defpackage.qn2
    public void a(mn2 mn2Var) {
        if (this.N == null || !o0()) {
            return;
        }
        this.S.g(this.N, mn2Var.b(), mn2Var.c());
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.j0.clear();
    }

    public boolean o0() {
        a1 a1Var = this.f0;
        return a1Var != null && a1Var.d();
    }
}
