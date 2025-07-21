package com.nytimes.android.video.sectionfront.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.designsystem.text.NytFontSize;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.views.InlineVideoState;
import com.nytimes.android.video.views.VideoMuteControl;
import defpackage.d79;
import defpackage.dd6;
import defpackage.de6;
import defpackage.e79;
import defpackage.fy6;
import defpackage.pf7;
import defpackage.sg3;
import defpackage.tg3;
import defpackage.ud6;
import defpackage.yb6;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class VideoCover extends com.nytimes.android.video.sectionfront.ui.a {
    public static final a Companion = new a(null);
    private final d79 c;
    private final AnimatorSet d;
    private final AnimatorSet e;
    private final CompositeDisposable f;
    private final float g;
    private final float h;
    private boolean i;
    public tg3 imageLoader;
    private boolean j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ConstraintLayout constraintLayout = VideoCover.this.c.e;
            zq3.g(constraintLayout, "frontCover");
            constraintLayout.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static final class c implements View.OnLayoutChangeListener {
        final /* synthetic */ ImageDimension b;

        c(ImageDimension imageDimension) {
            this.b = imageDimension;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(VideoCover videoCover, ImageDimension imageDimension) {
            zq3.h(videoCover, "this$0");
            zq3.h(imageDimension, "$imageDimension");
            pf7.b(videoCover.c.i, null, imageDimension.getWidth(), imageDimension.getHeight(), imageDimension.getUrl());
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            zq3.h(view, QueryKeys.INTERNAL_REFERRER);
            if (VideoCover.this.c.i.getWidth() == 0) {
                return;
            }
            VideoCover.this.c.i.removeOnLayoutChangeListener(this);
            AspectRatioImageView aspectRatioImageView = VideoCover.this.c.i;
            final VideoCover videoCover = VideoCover.this;
            final ImageDimension imageDimension = this.b;
            aspectRatioImageView.post(new Runnable() { // from class: c79
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCover.c.b(VideoCover.this, imageDimension);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoCover(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    private final void N() {
        this.c.l.post(new Runnable() { // from class: b79
            @Override // java.lang.Runnable
            public final void run() {
                VideoCover.O(VideoCover.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(VideoCover videoCover) {
        zq3.h(videoCover, "this$0");
        if (videoCover.i) {
            if (videoCover.getResources().getConfiguration().fontScale >= NytFontSize.JUMBO.getScale()) {
                TextView textView = videoCover.c.l;
                zq3.g(textView, "videoTitle");
                textView.setVisibility(8);
            } else {
                TextView textView2 = videoCover.c.l;
                zq3.g(textView2, "videoTitle");
                textView2.setVisibility(0);
            }
        }
    }

    private final void R(boolean z) {
        this.c.l.setTextSize(0, z ? this.g : this.h);
    }

    private final void X() {
        ImageView imageView = this.c.k;
        zq3.g(imageView, "videoPlayButton");
        imageView.setVisibility(8);
        VideoCoverTimeTextView videoCoverTimeTextView = this.c.h;
        zq3.g(videoCoverTimeTextView, "videoDuration");
        videoCoverTimeTextView.setVisibility(8);
        this.c.f.b();
        this.c.j.g0();
    }

    private final void k0() {
        VideoEndOverlay videoEndOverlay = this.c.b;
        zq3.g(videoEndOverlay, "backCover");
        videoEndOverlay.setVisibility(8);
        ImageView imageView = this.c.k;
        zq3.g(imageView, "videoPlayButton");
        imageView.setVisibility(8);
        AspectRatioImageView aspectRatioImageView = this.c.i;
        zq3.g(aspectRatioImageView, "videoImage");
        aspectRatioImageView.setVisibility(8);
    }

    private final void m0(ImageDimension imageDimension) {
        this.c.i.addOnLayoutChangeListener(new c(imageDimension));
    }

    private final void p0() {
        VideoMuteControl videoMuteControl = this.c.j;
        zq3.g(videoMuteControl, "videoMuteControl");
        videoMuteControl.setVisibility(8);
        ConstraintLayout constraintLayout = this.c.e;
        zq3.g(constraintLayout, "frontCover");
        constraintLayout.setVisibility(8);
        VideoEndOverlay videoEndOverlay = this.c.b;
        zq3.g(videoEndOverlay, "backCover");
        videoEndOverlay.setVisibility(0);
        z0();
    }

    private final void r0() {
        ConstraintLayout constraintLayout = this.c.e;
        zq3.g(constraintLayout, "frontCover");
        constraintLayout.setVisibility(0);
        this.c.e.setAlpha(1.0f);
        this.c.e.setTranslationY(0.0f);
    }

    private final void s0() {
        VideoEndOverlay videoEndOverlay = this.c.b;
        zq3.g(videoEndOverlay, "backCover");
        videoEndOverlay.setVisibility(8);
        ImageView imageView = this.c.k;
        zq3.g(imageView, "videoPlayButton");
        imageView.setVisibility(8);
        z0();
        r0();
        this.c.f.a();
    }

    private final void u() {
        this.c.f.b();
        VideoEndOverlay videoEndOverlay = this.c.b;
        zq3.g(videoEndOverlay, "backCover");
        videoEndOverlay.setVisibility(8);
        AspectRatioImageView aspectRatioImageView = this.c.i;
        zq3.g(aspectRatioImageView, "videoImage");
        if (aspectRatioImageView.getVisibility() == 0) {
            AspectRatioImageView aspectRatioImageView2 = this.c.i;
            zq3.g(aspectRatioImageView2, "videoImage");
            ViewExtensions.h(aspectRatioImageView2, TimeUnit.SECONDS.toMillis(1L));
        }
        if (!this.j) {
            ConstraintLayout constraintLayout = this.c.e;
            zq3.g(constraintLayout, "frontCover");
            constraintLayout.setVisibility(8);
        }
        if (this.i) {
            TextView textView = this.c.l;
            zq3.g(textView, "videoTitle");
            textView.setVisibility(0);
        } else {
            TextView textView2 = this.c.l;
            zq3.g(textView2, "videoTitle");
            textView2.setVisibility(8);
        }
    }

    private final void v0() {
    }

    private final void w0() {
        TextView textView = this.c.l;
        zq3.g(textView, "videoTitle");
        textView.setVisibility(this.i ? 0 : 8);
        VideoEndOverlay videoEndOverlay = this.c.b;
        zq3.g(videoEndOverlay, "backCover");
        videoEndOverlay.setVisibility(8);
        ImageView imageView = this.c.k;
        zq3.g(imageView, "videoPlayButton");
        imageView.setVisibility(0);
        r0();
        z0();
        this.c.j.g0();
        this.c.f.b();
    }

    private final void z0() {
        this.c.i.animate().cancel();
        AspectRatioImageView aspectRatioImageView = this.c.i;
        zq3.g(aspectRatioImageView, "videoImage");
        aspectRatioImageView.setVisibility(0);
        this.c.i.setAlpha(1.0f);
    }

    public void U(e79 e79Var) {
        zq3.h(e79Var, "item");
        boolean f = e79Var.f();
        this.i = f;
        this.c.l.setText(f ? e79Var.g() : "");
        this.c.h.s(e79Var);
        this.c.b.U(e79Var);
        N();
        R(e79Var.j());
    }

    public void W() {
        this.c.j.O();
    }

    public void Z(boolean z) {
        if (this.c.j.R()) {
            return;
        }
        this.c.j.X(z);
    }

    public boolean d0() {
        return this.c.j.R();
    }

    public void g0(ImageDimension imageDimension) {
        zq3.h(imageDimension, "imageDimension");
        pf7.c(this.c.i, imageDimension.getWidth(), imageDimension.getHeight());
        if (this.c.i.getWidth() > 0) {
            pf7.b(this.c.i, null, imageDimension.getWidth(), imageDimension.getHeight(), imageDimension.getUrl());
        } else {
            m0(imageDimension);
        }
    }

    public final tg3 getImageLoader() {
        tg3 tg3Var = this.imageLoader;
        if (tg3Var != null) {
            return tg3Var;
        }
        zq3.z("imageLoader");
        return null;
    }

    public void i0() {
        fy6 o = getImageLoader().get().o("Invalid URL For Picasso to load placeholder");
        ColorDrawable a2 = sg3.a(getContext(), dd6.image_placeholder);
        zq3.g(a2, "compatPlaceholder(...)");
        fy6 i = o.i(a2);
        AspectRatioImageView aspectRatioImageView = this.c.i;
        zq3.g(aspectRatioImageView, "videoImage");
        i.p(aspectRatioImageView);
    }

    public void n0() {
        this.j = false;
        this.c.l.setText("");
        this.c.h.setText("");
        this.c.j.g0();
        r0();
        z0();
    }

    public void o0(InlineVideoState inlineVideoState, boolean z) {
        zq3.h(inlineVideoState, TransferTable.COLUMN_STATE);
        if (inlineVideoState == InlineVideoState.PLAYING) {
            u();
            return;
        }
        if (z) {
            X();
            return;
        }
        if (inlineVideoState == InlineVideoState.START) {
            w0();
            return;
        }
        if (inlineVideoState == InlineVideoState.LOADING) {
            s0();
            return;
        }
        if (inlineVideoState == InlineVideoState.BUFFERING) {
            k0();
            return;
        }
        if (inlineVideoState == InlineVideoState.RESUME) {
            v0();
        } else if (inlineVideoState == InlineVideoState.END) {
            this.j = false;
            p0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tg3 imageLoader = getImageLoader();
        AspectRatioImageView aspectRatioImageView = this.c.i;
        zq3.g(aspectRatioImageView, "videoImage");
        imageLoader.b(aspectRatioImageView);
        this.f.clear();
        W();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c.i.setAdjustViewBounds(true);
        this.c.i.setScaleType(ImageView.ScaleType.FIT_START);
    }

    public void q0() {
        this.j = true;
        this.d.playTogether(this.e);
        this.d.start();
        this.c.j.i0();
    }

    public void setCoverClickListener(View.OnClickListener onClickListener) {
        this.c.i.setOnClickListener(onClickListener);
    }

    public final void setImageLoader(tg3 tg3Var) {
        zq3.h(tg3Var, "<set-?>");
        this.imageLoader = tg3Var;
    }

    public void setMuteControlListener(VideoMuteControl.a aVar) {
        this.c.j.setListener(aVar);
    }

    public void t0(boolean z) {
        this.c.j.U(z);
    }

    public /* synthetic */ VideoCover(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCover(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        d79 b2 = d79.b(LayoutInflater.from(context), this);
        zq3.g(b2, "inflate(...)");
        this.c = b2;
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, yb6.video_cover_title_anim);
        zq3.f(loadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet = (AnimatorSet) loadAnimator;
        animatorSet.addListener(new b());
        animatorSet.setTarget(b2.e);
        this.d = animatorSet;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, yb6.video_cover_mute_anim);
        zq3.f(loadAnimator2, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet2 = (AnimatorSet) loadAnimator2;
        animatorSet2.setTarget(b2.j);
        this.e = animatorSet2;
        this.f = new CompositeDisposable();
        this.g = getResources().getDimension(ud6.vertical_video_title_text_size);
        this.h = getResources().getDimension(de6.row_section_front_headline_text_size);
        this.i = true;
        setClipChildren(false);
    }
}
