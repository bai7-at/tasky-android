package com.nytimes.android.sectionfront.adapter.viewholder;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.m;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.FooterView;
import defpackage.a1;
import defpackage.al4;
import defpackage.bd6;
import defpackage.dd6;
import defpackage.dx3;
import defpackage.fp2;
import defpackage.gy6;
import defpackage.ip6;
import defpackage.k57;
import defpackage.lf6;
import defpackage.mn2;
import defpackage.mx0;
import defpackage.og3;
import defpackage.pg6;
import defpackage.pr;
import defpackage.qn2;
import defpackage.re7;
import defpackage.s48;
import defpackage.sg3;
import defpackage.um6;
import defpackage.yi7;
import defpackage.yq;
import io.reactivex.disposables.Disposable;
import java.util.Locale;

/* loaded from: classes4.dex */
public class b extends com.nytimes.android.sectionfront.adapter.viewholder.a implements m, ip6, qn2 {
    protected ImageView L;
    protected FrameLayout M;
    protected View N;
    TextView Q;
    TextView S;
    TextView X;
    a1 Y;
    TextView Z;
    FooterView e0;
    Disposable f0;
    boolean g0;
    boolean h0;
    final al4 i0;
    private final yi7 j0;
    private final RecentlyViewedManager k0;
    private final FooterBinder l0;
    private final pr m0;

    class a implements gy6 {
        final /* synthetic */ String a;
        final /* synthetic */ Asset b;
        final /* synthetic */ SectionFront c;

        a(String str, Asset asset, SectionFront sectionFront) {
            this.a = str;
            this.b = asset;
            this.c = sectionFront;
        }

        @Override // defpackage.gy6
        public void a(Exception exc) {
            NYTLogger.h(exc);
        }

        @Override // defpackage.gy6
        public void b() {
            b.this.L.setTag(this.a);
            b.this.i0.a(this.b, this.c);
        }
    }

    public b(View view, yi7 yi7Var, RecentlyViewedManager recentlyViewedManager, FooterBinder footerBinder, pr prVar) {
        super(view);
        this.g0 = false;
        this.h0 = false;
        this.j0 = yi7Var;
        this.k0 = recentlyViewedManager;
        this.l0 = footerBinder;
        this.m0 = prVar;
        k0();
        this.i0 = new al4(view, false, 1);
    }

    private SpannableStringBuilder i0(Asset asset, String str, SectionFront sectionFront) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!asset.getSectionBranded() || sectionFront.getName().equalsIgnoreCase(asset.getSectionContentName())) {
            spannableStringBuilder.append((CharSequence) str.toUpperCase(Locale.getDefault()));
        } else {
            spannableStringBuilder.append((CharSequence) asset.getSectionDisplayName().toUpperCase(Locale.getDefault()));
        }
        return spannableStringBuilder;
    }

    private void k0() {
        this.Q = (TextView) this.a.findViewById(pg6.row_sf_kicker);
        this.S = (TextView) this.a.findViewById(pg6.row_sf_headline);
        TextView textView = (TextView) this.a.findViewById(pg6.row_sf_byline_and_timestamp);
        this.X = textView;
        if (textView != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        this.Y = (a1) this.a.findViewById(pg6.row_sf_summary);
        ImageView imageView = (ImageView) this.a.findViewById(pg6.row_sf_thumbnail);
        this.L = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.L.setAdjustViewBounds(true);
        this.M = (FrameLayout) this.a.findViewById(pg6.media_component);
        this.N = this.a.findViewById(pg6.thumbnail_container);
        this.Z = (TextView) this.a.findViewById(pg6.row_sf_ordered_section_number);
        this.e0 = (FooterView) this.a.findViewById(pg6.footer_view);
    }

    private boolean l0(k57 k57Var, SectionFront sectionFront) {
        String Z = Z(k57Var, sectionFront);
        if (s48.b(Z)) {
            return false;
        }
        String upperCase = Z.toUpperCase(Locale.getDefault());
        String byline = k57Var.a().getByline();
        return !s48.b(byline) && byline.contains(upperCase);
    }

    private void m0(Asset asset, SectionFront sectionFront, String str) {
        this.h0 = true;
        t0(0);
        if (this.L.getTag() != null && str.equals(this.L.getTag()) && (this.L.getDrawable() instanceof BitmapDrawable)) {
            return;
        }
        og3.c().o(str).i(sg3.a(this.a.getContext(), dd6.image_placeholder)).j().h().a(this.L, new a(str, asset, sectionFront));
    }

    private void u0(int i) {
        if (this.Z != null) {
            this.Z.setText(i + InstructionFileId.DOT);
        }
    }

    private void v0(yq yqVar) {
        if (!yqVar.g) {
            this.Z.setVisibility(8);
        } else {
            u0(yqVar.f + 1);
            this.Z.setVisibility(0);
        }
    }

    private void w0(boolean z) {
        TextView textView = this.Z;
        if (textView != null) {
            textView.setTextColor(mx0.c(this.y, z ? bd6.ordered_section_number_read : bd6.ordered_section_number));
        }
    }

    private void y0() {
        og3.b(this.L);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void W(re7 re7Var) {
        y0();
        yq yqVar = (yq) re7Var;
        k57 k57Var = yqVar.j;
        Asset asset = yqVar.h;
        SectionFront sectionFront = yqVar.i;
        boolean u = this.k0.u(asset.getSafeUri());
        p0(k57Var, sectionFront, u);
        o0(k57Var, sectionFront, u);
        n0(k57Var, sectionFront, u);
        r0(k57Var, u);
        v0(yqVar);
        w0(u);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams instanceof SpannableGridLayoutManager.c) {
            this.g0 = ((SpannableGridLayoutManager.c) layoutParams).h;
        }
        q0(k57Var, sectionFront, this.g0, Optional.b(yqVar.f()));
        this.a.setActivated(this.j0.b(sectionFront.getName(), asset.getAssetId()));
        if (this.e0 != null) {
            Disposable disposable = this.f0;
            if (disposable != null && !disposable.isDisposed()) {
                this.f0.dispose();
            }
            this.f0 = this.l0.f(this.e0, yqVar, x0());
        }
    }

    @Override // defpackage.qn2
    public void a(mn2 mn2Var) {
        if (this.e0 == null || !x0()) {
            return;
        }
        this.l0.g(this.e0, mn2Var.b(), mn2Var.c());
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public int b() {
        return m.a.a(this.Q, this.S);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public void c(int i) {
        View view = this.N;
        if (view != null) {
            view.setPadding(0, i, 0, 0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void c0() {
        y0();
        super.c0();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.m
    public void d() {
        View view = this.N;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.L.setImageDrawable(null);
        this.L.setTag(null);
        Disposable disposable = this.f0;
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
        p0(k57Var, sectionFront, true);
        o0(k57Var, sectionFront, true);
        n0(k57Var, sectionFront, true);
        r0(k57Var, true);
        w0(true);
    }

    protected pr h0() {
        return this.m0;
    }

    public void j0() {
        t0(8);
    }

    void n0(k57 k57Var, SectionFront sectionFront, boolean z) {
        Asset a2 = k57Var.a();
        if (this.X == null) {
            return;
        }
        if (!s48.b(k57Var.a().getColumnDisplayName()) || l0(k57Var, sectionFront)) {
            this.X.setVisibility(8);
            return;
        }
        String byline = a2.getByline() == null ? "" : a2.getByline();
        if (AssetConstants.VIDEO_TYPE.equals(a2.getAssetType())) {
            byline = Y(byline);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(byline + "  ");
        fp2.d(this.y, spannableStringBuilder, um6.TextView_Section_BylineAndTimestamp_Byline, lf6.font_chelt_sh_medium, 0, spannableStringBuilder.length());
        if (TextUtils.isEmpty(spannableStringBuilder.toString().trim())) {
            this.X.setVisibility(8);
        } else {
            this.X.setText(spannableStringBuilder);
            this.X.setVisibility(0);
        }
    }

    protected void o0(k57 k57Var, SectionFront sectionFront, boolean z) {
        Asset a2 = k57Var.a();
        if (z) {
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text_read));
        } else {
            this.S.setTextColor(mx0.c(this.y, bd6.headline_text));
        }
        this.S.setText(a2.getDisplayTitle());
    }

    void p0(k57 k57Var, SectionFront sectionFront, boolean z) {
        Asset a2 = k57Var.a();
        String Z = Z(k57Var, sectionFront);
        if (TextUtils.isEmpty(Z)) {
            this.Q.setVisibility(8);
            return;
        }
        this.Q.setTextColor(dx3.c(this.a.getContext(), z));
        this.Q.setText(i0(a2, Z, sectionFront));
        this.Q.setCompoundDrawablesWithIntrinsicBounds(dx3.b(this.a, a2.getClass(), z), (Drawable) null, (Drawable) null, (Drawable) null);
        this.Q.setVisibility(0);
    }

    protected void q0(k57 k57Var, SectionFront sectionFront, boolean z, Optional optional) {
        Asset a2 = k57Var.a();
        if (!z && optional.d() && ((ImageDimension) optional.c()).getUrl() != null) {
            m0(a2, sectionFront, ((ImageDimension) optional.c()).getUrl());
        } else {
            this.h0 = false;
            t0(8);
        }
    }

    void r0(k57 k57Var, boolean z) {
        h0().a(this.Y, k57Var, Boolean.valueOf(z));
    }

    public void s0() {
        if (this.g0 || !this.h0) {
            t0(8);
        } else {
            t0(0);
        }
    }

    void t0(int i) {
        ImageView imageView = this.L;
        if (imageView != null) {
            if (i != 0) {
                imageView.setImageDrawable(null);
                this.L.setTag(null);
            }
            this.L.setVisibility(i);
        }
        FrameLayout frameLayout = this.M;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    public boolean x0() {
        a1 a1Var = this.Y;
        return a1Var != null && a1Var.d();
    }
}
