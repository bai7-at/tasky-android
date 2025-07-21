package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.common.seekbar.MediaSeekBar;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.views.VideoControlView;
import defpackage.c04;
import defpackage.e79;
import defpackage.fk3;
import defpackage.gk3;
import defpackage.qs2;
import defpackage.tv5;
import defpackage.vd6;
import defpackage.zg6;
import defpackage.zq3;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class InlineVideoView extends e implements gk3, VideoControlView.ControlInteractionCallback {
    public static final a Companion = new a(null);
    private VideoControlView c;
    private MediaSeekBar d;
    public h delegate;
    private boolean e;
    private final fk3 f;
    private final c04 g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    private final void W(boolean z) {
        if (z) {
            this.d.c();
            this.c.E();
        } else {
            this.d.a();
            this.c.A0();
        }
        this.c.getCaptionsView().g();
    }

    private final void X(View view, String str) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        zq3.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.I = str;
        view.setLayoutParams(bVar);
    }

    private final int getVerticalVideoInset() {
        return ((Number) this.g.getValue()).intValue();
    }

    public void C(NYTMediaItem nYTMediaItem, e79 e79Var) {
        zq3.h(nYTMediaItem, "mediaItem");
        zq3.h(e79Var, "videoCoverItem");
        getDelegate$video_release().g(this.c);
        this.e = true;
        W(e79Var.i());
        this.f.c.U(e79Var);
        this.c.z(e79Var.d());
        ExoPlayerView exoPlayerView = this.f.b;
        zq3.g(exoPlayerView, "exoPlayerView");
        X(exoPlayerView, e79Var.a());
        VideoCover videoCover = this.f.c;
        zq3.g(videoCover, "videoCover");
        X(videoCover, e79Var.a());
        getDelegate$video_release().k(nYTMediaItem);
    }

    public final boolean F() {
        return this.e;
    }

    public final void N(ImageDimension imageDimension) {
        if ((imageDimension != null ? imageDimension.getUrl() : null) == null) {
            this.f.c.i0();
        } else {
            this.f.c.g0(imageDimension);
        }
    }

    public final NYTMediaItem O() {
        return getDelegate$video_release().p();
    }

    public final void R() {
        getDelegate$video_release().s();
    }

    @Override // defpackage.gk3
    public boolean T() {
        return this.f.c.d0();
    }

    public void U() {
        this.f.b.setVisibility(4);
        this.f.c.setVisibility(0);
        this.f.c.n0();
        d0(0);
    }

    public void Z() {
        getDelegate$video_release().u();
    }

    @Override // com.nytimes.android.video.views.VideoControlView.ControlInteractionCallback
    public void b() {
        this.f.c.t0(false);
    }

    public void d0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        zq3.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        setLayoutParams(marginLayoutParams);
    }

    public final h getDelegate$video_release() {
        h hVar = this.delegate;
        if (hVar != null) {
            return hVar;
        }
        zq3.z("delegate");
        return null;
    }

    @Override // com.nytimes.android.video.views.VideoControlView.ControlInteractionCallback
    public void j() {
        this.f.c.Z(false);
    }

    @Override // defpackage.gk3
    public tv5 j0() {
        return getDelegate$video_release().m();
    }

    @Override // com.nytimes.android.video.views.VideoControlView.ControlInteractionCallback
    public void o(VideoControlView.ControlInteractionCallback.Interaction interaction) {
        zq3.h(interaction, "interaction");
        getDelegate$video_release().q(interaction);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate$video_release().h(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate$video_release().l(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getDelegate$video_release().n();
        this.f.b.setCaptions(this.c.getCaptionsView());
        this.c.setInteractionCallback(this);
    }

    @Override // defpackage.gk3
    public void q0() {
        this.c.F();
        if (getDelegate$video_release().o()) {
            return;
        }
        this.f.c.t0(true);
        this.f.c.q0();
    }

    public final void setActive(boolean z) {
        this.e = z;
    }

    public final void setDelegate$video_release(h hVar) {
        zq3.h(hVar, "<set-?>");
        this.delegate = hVar;
    }

    @Override // defpackage.gk3
    public void setState(InlineVideoState inlineVideoState) {
        zq3.h(inlineVideoState, TransferTable.COLUMN_STATE);
        getDelegate$video_release().t(inlineVideoState);
    }

    public /* synthetic */ InlineVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineVideoView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        fk3 b = fk3.b(LayoutInflater.from(context), this);
        zq3.g(b, "inflate(...)");
        this.f = b;
        this.g = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.video.views.InlineVideoView$verticalVideoInset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(context.getResources().getDimensionPixelSize(vd6.vertical_video_sf_inset));
            }
        });
        View findViewById = findViewById(zg6.control_view);
        zq3.g(findViewById, "findViewById(...)");
        this.c = (VideoControlView) findViewById;
        View findViewById2 = findViewById(zg6.seek_bar);
        zq3.g(findViewById2, "findViewById(...)");
        this.d = (MediaSeekBar) findViewById2;
        h delegate$video_release = getDelegate$video_release();
        VideoCover videoCover = b.c;
        zq3.g(videoCover, "videoCover");
        ExoPlayerView exoPlayerView = b.b;
        zq3.g(exoPlayerView, "exoPlayerView");
        delegate$video_release.i(videoCover, exoPlayerView, this.c);
    }
}
