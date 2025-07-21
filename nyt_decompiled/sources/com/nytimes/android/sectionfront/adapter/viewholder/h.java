package com.nytimes.android.sectionfront.adapter.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.video.VideoReferringSource;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.SectionTextDecorator;
import com.nytimes.android.sectionfront.adapter.viewholder.h;
import com.nytimes.android.sectionfront.ui.DefaultArticleSummary;
import com.nytimes.android.sectionfront.ui.HomepageGroupHeaderView;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.video.views.InlineVideoView;
import defpackage.hb5;
import defpackage.if5;
import defpackage.jf5;
import defpackage.k57;
import defpackage.mi4;
import defpackage.pg6;
import defpackage.pr;
import defpackage.re7;
import defpackage.s48;
import defpackage.vd6;
import defpackage.yq;
import defpackage.yt;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Locale;

/* loaded from: classes4.dex */
public class h extends a {
    final TextView L;
    final TextView M;
    private final pr N;
    private final RecentlyViewedManager Q;
    private final hb5 S;
    private final FeedStore X;
    private final mi4 Y;
    private final InlineVideoView Z;
    private final DefaultArticleSummary e0;
    private final View f0;
    private final LinearLayout g0;
    private final Space h0;
    private final CompositeDisposable i0;
    private long j0;
    private final int k0;

    public h(View view, pr prVar, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view);
        this.i0 = new CompositeDisposable();
        this.j0 = -1L;
        this.N = prVar;
        this.Q = recentlyViewedManager;
        this.S = hb5Var;
        this.X = feedStore;
        this.Y = mi4Var;
        this.B = (HomepageGroupHeaderView) view.findViewById(pg6.row_group_header);
        this.Z = (InlineVideoView) view.findViewById(pg6.sf_inline_video_view);
        this.M = (TextView) view.findViewById(pg6.row_sf_lede_headline);
        this.L = (TextView) view.findViewById(pg6.video_image_credits);
        this.e0 = (DefaultArticleSummary) view.findViewById(pg6.video_summary);
        this.g0 = (LinearLayout) this.a.findViewById(pg6.container);
        this.h0 = (Space) this.a.findViewById(pg6.space);
        this.f0 = this.a.findViewById(pg6.rule);
        this.k0 = this.y.getResources().getDimensionPixelSize(vd6.vertical_video_sf_inset);
    }

    private void k0(final VideoAsset videoAsset, final SectionFront sectionFront) {
        this.i0.add(this.X.f().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: w57
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                h.this.m0(videoAsset, sectionFront, (LatestFeed) obj);
            }
        }, new Consumer() { // from class: x57
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                h.n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m0(VideoAsset videoAsset, SectionFront sectionFront, LatestFeed latestFeed) {
        NYTMediaItem a = this.Y.a(null, videoAsset, sectionFront, VideoReferringSource.SECTION_FRONT, latestFeed);
        this.Z.C(a, this.Y.b(videoAsset, ShareOrigin.SECTION_FRONT, a.i0(), false));
        this.Z.d0(videoAsset.isVertical() ? this.k0 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(Throwable th) {
        NYTLogger.i(th, "Error fetching latest for inline video", new Object[0]);
    }

    private void o0(VideoAsset videoAsset, yq yqVar) {
        ImageAsset m = yt.m(videoAsset, yqVar.i);
        Image image = m == null ? null : m.getImage();
        p0(image, videoAsset.isVertical());
        if (image == null) {
            this.Z.N(null);
        } else {
            this.Z.N(yqVar.f());
        }
    }

    private void p0(Image image, boolean z) {
        if (image == null || s48.b(image.getCredit())) {
            this.L.setVisibility(8);
            return;
        }
        int i = z ? this.k0 : 0;
        this.L.setPaddingRelative(i, 0, i, 0);
        this.L.setText(image.getCredit().toUpperCase(Locale.getDefault()));
        this.L.setVisibility(0);
    }

    private void q0() {
        this.B.a();
        this.Z.U();
        this.e0.b();
        this.h0.setVisibility(0);
        this.i0.clear();
    }

    private void r0(k57 k57Var, boolean z) {
        Asset a = k57Var.a();
        SectionTextDecorator.a(this.y, SectionTextDecorator.Text.HEADLINE, this.M, z);
        this.M.setGravity(0);
        this.M.setText(a.getDisplayTitle());
    }

    private void s0(yq yqVar, boolean z) {
        this.N.a(this.e0, yqVar.e(), Boolean.valueOf(z));
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        q0();
        yq yqVar = (yq) re7Var;
        Asset d = yqVar.d();
        if (!(d instanceof VideoAsset)) {
            this.g0.setVisibility(8);
            return;
        }
        this.g0.setVisibility(0);
        this.j0 = d.getAssetId();
        boolean u = this.Q.u(d.getSafeUri());
        VideoAsset videoAsset = (VideoAsset) d;
        k0(videoAsset, yqVar.i);
        r0(yqVar.j, u);
        s0(yqVar, u);
        e0(this.f0);
        o0(videoAsset, yqVar);
        j0();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void a0() {
        super.a0();
        if (this.S.j(this.j0, null)) {
            this.S.A();
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void b0(if5 if5Var, jf5 jf5Var) {
        super.b0(if5Var, jf5Var);
        this.Z.R();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void c0() {
        super.c0();
        this.i0.clear();
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
    }

    void j0() {
        if (this.y.getResources().getConfiguration().fontScale > 1.3f) {
            this.M.setVisibility(0);
            this.h0.setVisibility(0);
        } else {
            this.M.setVisibility(8);
            if (this.e0.d()) {
                return;
            }
            this.h0.setVisibility(8);
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a, android.view.View.OnClickListener
    public void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
    }
}
