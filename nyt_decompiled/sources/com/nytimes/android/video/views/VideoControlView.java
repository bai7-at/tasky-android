package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nytimes.android.media.common.seekbar.MediaSeekBar;
import com.nytimes.android.media.common.seekbar.b;
import com.nytimes.android.media.util.FadeAnimationListener;
import com.nytimes.android.video.sectionfront.ui.VideoProgressIndicator;
import com.nytimes.android.video.views.VideoBottomActionsView;
import com.nytimes.android.video.views.VideoControlView;
import defpackage.hb5;
import defpackage.jk;
import defpackage.k69;
import defpackage.oi6;
import defpackage.oz4;
import defpackage.te6;
import defpackage.u69;
import defpackage.ub6;
import defpackage.vd6;
import defpackage.x3;
import defpackage.zg6;

/* loaded from: classes4.dex */
public class VideoControlView extends g implements k69 {
    VideoBottomActionsView c;
    ViewGroup d;
    private ViewGroup e;
    private CaptionsView f;
    private AppCompatImageView g;
    private FrameLayout h;
    private MediaSeekBar i;
    private VideoProgressIndicator j;
    private TextView k;
    private final Animation l;
    private final Animation m;
    hb5 mediaController;
    private final Runnable n;
    u69 presenter;
    private final int r;
    private final int s;
    private final int t;
    private boolean u;
    private boolean w;
    private ControlInteractionCallback x;

    public interface ControlInteractionCallback {

        public enum Interaction {
            UNDEFINED,
            PLAY_PAUSE,
            SEEK
        }

        void b();

        void j();

        void o(Interaction interaction);
    }

    class a implements VideoBottomActionsView.a {
        a() {
        }

        @Override // com.nytimes.android.video.views.VideoBottomActionsView.a
        public void a() {
            VideoControlView.this.C(ControlInteractionCallback.Interaction.UNDEFINED);
        }

        @Override // com.nytimes.android.video.views.VideoBottomActionsView.a
        public void b() {
            VideoControlView.this.W();
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // com.nytimes.android.media.common.seekbar.b.a
        public void a() {
            VideoControlView.this.W();
        }

        @Override // com.nytimes.android.media.common.seekbar.b.a
        public void b() {
            VideoControlView.this.C(ControlInteractionCallback.Interaction.SEEK);
            VideoControlView.this.A();
        }
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        F();
        ControlInteractionCallback controlInteractionCallback = this.x;
        if (controlInteractionCallback != null) {
            controlInteractionCallback.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        Integer g = this.mediaController.g();
        if (g == null || g.intValue() != 3 || this.i.q()) {
            return;
        }
        this.presenter.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(oz4 oz4Var, View view) {
        oz4Var.call();
        C(ControlInteractionCallback.Interaction.PLAY_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.d.setVisibility(0);
    }

    private void X(Animation animation, oz4 oz4Var) {
        this.l.setAnimationListener(null);
        this.l.cancel();
        this.m.setAnimationListener(null);
        this.m.cancel();
        this.d.clearAnimation();
        animation.setAnimationListener(new FadeAnimationListener(oz4Var));
        this.d.startAnimation(animation);
    }

    private void Z() {
        x3 supportActionBar;
        if (!(getContext() instanceof jk) || (supportActionBar = ((jk) getContext()).getSupportActionBar()) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        marginLayoutParams.topMargin = this.t + supportActionBar.getHeight();
        this.k.setLayoutParams(marginLayoutParams);
    }

    private void s(float f) {
        this.f.clearAnimation();
        this.f.animate().cancel();
        this.f.animate().translationY(f);
    }

    private void setPlayPauseBottomMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.h.setLayoutParams(marginLayoutParams);
        this.h.postInvalidate();
    }

    void A() {
        removeCallbacks(this.n);
    }

    @Override // defpackage.k69
    public void A0() {
        this.k.setVisibility(8);
        if (this.u) {
            return;
        }
        setPlayPauseBottomMargin(this.s);
    }

    void C(ControlInteractionCallback.Interaction interaction) {
        ControlInteractionCallback controlInteractionCallback = this.x;
        if (controlInteractionCallback != null) {
            controlInteractionCallback.o(interaction);
        }
    }

    @Override // defpackage.k69
    public void E() {
        this.k.setVisibility(0);
        if (this.u) {
            return;
        }
        setPlayPauseBottomMargin(0);
    }

    public void F() {
        this.w = false;
        this.d.setVisibility(8);
        if (this.u) {
            s(0.0f);
        } else {
            this.f.i();
        }
    }

    @Override // defpackage.k69
    public boolean M() {
        return this.j.getVisibility() == 0;
    }

    void W() {
        A();
        postDelayed(this.n, 4000L);
    }

    @Override // defpackage.k69
    public void d() {
        this.g.setImageResource(te6.ic_vr_pause);
        W();
    }

    public void d0(boolean z) {
        this.u = z;
        if (z) {
            this.c.X();
            Z();
        } else {
            this.c.Z();
            setPlayPauseBottomMargin(this.s);
        }
    }

    @Override // defpackage.k69
    public void e() {
        this.j.a();
        this.h.setVisibility(8);
    }

    @Override // defpackage.k69
    public void e0() {
        if (this.w) {
            this.w = false;
            A();
            X(this.m, new oz4() { // from class: x69
                @Override // defpackage.oz4
                public final void call() {
                    VideoControlView.this.N();
                }
            });
        }
    }

    @Override // defpackage.k69
    public void f() {
        this.g.setImageResource(te6.vr_play);
        A();
    }

    @Override // defpackage.k69
    public void g() {
        this.j.b();
        this.h.setVisibility(0);
    }

    public CaptionsView getCaptionsView() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.m0(this);
        if (this.u) {
            this.presenter.A0();
        }
        this.i.setInteractionListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
        this.i.setInteractionListener(null);
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.k = (TextView) findViewById(zg6.live_indicator_text);
        this.d = (ViewGroup) findViewById(zg6.control_container);
        this.e = (ViewGroup) findViewById(zg6.seekbar_control_container);
        CaptionsView captionsView = (CaptionsView) findViewById(zg6.captions_layout);
        this.f = captionsView;
        captionsView.animate().setInterpolator(new DecelerateInterpolator());
        this.h = (FrameLayout) findViewById(zg6.play_pause_container);
        this.g = (AppCompatImageView) findViewById(zg6.play_pause_button);
        TextView textView = (TextView) findViewById(zg6.currentVideoPosition);
        TextView textView2 = (TextView) findViewById(zg6.totalVideoDuration);
        MediaSeekBar mediaSeekBar = (MediaSeekBar) findViewById(zg6.seek_bar);
        this.i = mediaSeekBar;
        mediaSeekBar.z(textView, textView2);
        this.j = (VideoProgressIndicator) findViewById(zg6.video_control_progress_indicator);
        VideoBottomActionsView videoBottomActionsView = (VideoBottomActionsView) findViewById(zg6.bottom_video_actions);
        this.c = videoBottomActionsView;
        videoBottomActionsView.setCallback(new a());
    }

    public void setInteractionCallback(ControlInteractionCallback controlInteractionCallback) {
        this.x = controlInteractionCallback;
    }

    @Override // defpackage.k69
    public void setPlayPauseAction(final oz4 oz4Var) {
        if (oz4Var == null) {
            this.h.setOnClickListener(null);
        } else {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: v69
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoControlView.this.R(oz4Var, view);
                }
            });
        }
    }

    @Override // defpackage.k69
    public void w() {
        if (this.w) {
            return;
        }
        ControlInteractionCallback controlInteractionCallback = this.x;
        if (controlInteractionCallback != null) {
            controlInteractionCallback.j();
        }
        this.w = true;
        if (this.u) {
            s(-(this.e.getHeight() - (this.r * 2)));
        } else {
            this.f.f();
        }
        X(this.l, new oz4() { // from class: y69
            @Override // defpackage.oz4
            public final void call() {
                VideoControlView.this.U();
            }
        });
        W();
    }

    @Override // defpackage.k69
    public void x() {
        if (this.w) {
            e0();
        } else {
            w();
        }
    }

    public void z(String str) {
        this.c.A(str);
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = true;
        View.inflate(getContext(), oi6.video_controls_layout_contents, this);
        this.r = getResources().getDimensionPixelSize(vd6.caption_bottom_space_controls_on);
        this.s = getResources().getDimensionPixelSize(vd6.inline_play_pause_bottom_margin);
        this.t = getResources().getDimensionPixelSize(vd6.live_video_text_fullscreen_top_margin);
        this.l = AnimationUtils.loadAnimation(context, ub6.video_control_fade_in);
        this.m = AnimationUtils.loadAnimation(context, ub6.video_control_fade_out);
        this.n = new Runnable() { // from class: w69
            @Override // java.lang.Runnable
            public final void run() {
                VideoControlView.this.O();
            }
        };
    }
}
