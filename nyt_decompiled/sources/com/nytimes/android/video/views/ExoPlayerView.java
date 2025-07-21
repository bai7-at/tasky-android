package com.nytimes.android.video.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.video.views.ExoPlayerView;
import defpackage.c41;
import defpackage.hb5;
import defpackage.oi6;
import defpackage.oz4;
import defpackage.tv5;
import defpackage.uv5;
import defpackage.vn6;
import defpackage.yh0;
import defpackage.zg6;

/* loaded from: classes4.dex */
public class ExoPlayerView extends d implements uv5 {
    private AspectRatioFrameLayout c;
    private View d;
    private FrameLayout e;
    private yh0 f;
    private final tv5 g;
    private int h;
    private boolean i;
    hb5 mediaControl;

    public ExoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(oz4 oz4Var, View view) {
        if (this.mediaControl.p()) {
            oz4Var.call();
        }
    }

    private void r(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vn6.ExoPlayerView);
            try {
                try {
                    this.h = obtainStyledAttributes.getInt(vn6.ExoPlayerView_video_surface_type, 0);
                    this.i = obtainStyledAttributes.getBoolean(vn6.ExoPlayerView_fullscreenMode, false);
                } catch (Exception e) {
                    NYTLogger.i(e, "Error getting exoplayerview attrs", new Object[0]);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // defpackage.uv5
    public ViewGroup getAdOverlay() {
        return this.e;
    }

    public tv5 getPresenter() {
        return this.g;
    }

    @Override // defpackage.uv5
    public View getSurface() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.q(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.L();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (AspectRatioFrameLayout) findViewById(zg6.aspect_ratio_layout);
        this.e = (FrameLayout) findViewById(zg6.ad_overlay);
        ((VideoControlView) findViewById(zg6.control_view)).d0(this.i);
        this.d = this.h == 1 ? new TextureView(getContext()) : new SurfaceView(getContext());
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c.addView(this.d);
    }

    @Override // defpackage.jj8
    public void s(c41 c41Var) {
        yh0 yh0Var = this.f;
        if (yh0Var == null) {
            return;
        }
        yh0Var.j(c41Var.a);
    }

    @Override // defpackage.uv5
    public void setAspectRatio(float f) {
        this.c.setAspectRatio(f);
    }

    public void setCaptions(yh0 yh0Var) {
        this.f = yh0Var;
    }

    public void setOnControlClickAction(final oz4 oz4Var) {
        if (oz4Var != null) {
            setOnClickListener(new View.OnClickListener() { // from class: o72
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ExoPlayerView.this.q(oz4Var, view);
                }
            });
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
        this.i = false;
        this.g = new tv5();
        r(attributeSet);
        View.inflate(getContext(), oi6.exo_view_contents, this);
    }
}
