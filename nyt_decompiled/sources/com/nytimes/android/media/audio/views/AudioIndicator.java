package com.nytimes.android.media.audio.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter;
import com.nytimes.android.media.audio.views.AudioIndicator;
import com.nytimes.android.utils.AudioIndicatorDismissBehavior;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.be6;
import defpackage.dy;
import defpackage.e37;
import defpackage.ed6;
import defpackage.fg6;
import defpackage.gy6;
import defpackage.if6;
import defpackage.js7;
import defpackage.k99;
import defpackage.mx0;
import defpackage.og3;
import defpackage.on6;
import defpackage.yh6;
import defpackage.yn0;
import defpackage.z44;
import defpackage.zn0;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AudioIndicator extends j implements dy {
    private static final long B;
    private static final long H;
    js7 l;
    js7 m;
    private ImageView n;
    AudioIndicatorPresenter presenter;
    private LottieAnimationView r;
    private boolean s;
    private Integer t;
    private Integer u;
    private final ValueAnimator w;
    private final CompositeDisposable x;
    private float y;

    class a implements gy6 {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // defpackage.gy6
        public void a(Exception exc) {
            NYTLogger.h(exc);
            AudioIndicator.this.d0(false);
        }

        @Override // defpackage.gy6
        public void b() {
            AudioIndicator.this.n.setTag(this.a);
            AudioIndicator.this.d0(true);
        }
    }

    class b implements AudioIndicatorDismissBehavior.b {
        b() {
        }

        @Override // com.nytimes.android.utils.AudioIndicatorDismissBehavior.b
        public void a(View view) {
            AudioIndicator.this.X();
        }

        @Override // com.nytimes.android.utils.AudioIndicatorDismissBehavior.b
        public void b(int i) {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        B = timeUnit.toMillis(5L);
        H = timeUnit.toMillis(5L);
    }

    public AudioIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void O(boolean z, float f, float f2) {
        if (!z) {
            this.n.clearColorFilter();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        zn0.b(colorMatrix, f2);
        colorMatrix.setSaturation(f);
        this.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    private float R() {
        return DeviceUtils.p(getContext()) / getResources().getDimension(be6.audio_indicator_width);
    }

    private void W() {
        if (k99.P(this)) {
            this.y = getTranslationY();
            animate().setInterpolator(new z44()).translationY(getAnimationHeight() * (!this.s ? 1 : 0)).alpha(this.s ? 0.0f : 1.0f).setDuration(this.s ? 150L : 300L).withStartAction(new Runnable() { // from class: kx
                @Override // java.lang.Runnable
                public final void run() {
                    AudioIndicator.this.o0();
                }
            }).withEndAction(new Runnable() { // from class: lx
                @Override // java.lang.Runnable
                public final void run() {
                    AudioIndicator.this.p0();
                }
            });
        }
    }

    private void Z() {
        if (k99.P(this)) {
            animate().setInterpolator(new z44()).translationY(this.y).alpha(1.0f).setDuration(this.s ? 150L : 300L).withEndAction(new Runnable() { // from class: jx
                @Override // java.lang.Runnable
                public final void run() {
                    AudioIndicator.this.r0();
                }
            });
        }
    }

    private ValueAnimator g0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -0.4f);
        ofFloat.setDuration(B);
        final ColorMatrix colorMatrix = new ColorMatrix();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioIndicator.this.s0(colorMatrix, valueAnimator);
            }
        });
        return ofFloat;
    }

    private float getAnimationHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        return getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void i0() {
        if (getLayoutParams() instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) getLayoutParams()).n(new AudioIndicatorDismissBehavior(m0(), AudioIndicatorDismissBehavior.SwipeDirection.ANY, 1.0f, R(), 0.0f, R()));
        }
    }

    private AudioIndicatorDismissBehavior.b m0() {
        return new b();
    }

    private boolean n0(String str) {
        return str != null && (this.n.getDrawable() == null || this.n.getTag() == null || !(this.n.getDrawable() instanceof BitmapDrawable) || !this.n.getTag().equals(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0() {
        this.w.cancel();
        setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        this.presenter.S0();
        N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0() {
        L(0L);
        setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(ColorMatrix colorMatrix, ValueAnimator valueAnimator) {
        zn0.b(colorMatrix, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        colorMatrix.setSaturation(1.0f - valueAnimator.getAnimatedFraction());
        this.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.presenter.Q0(valueAnimator.getCurrentPlayTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(Throwable th) {
        NYTLogger.i(th, "Error toggling expand state.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(View view) {
        this.presenter.R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(boolean z) {
        if (z) {
            W();
        } else {
            Z();
        }
    }

    @Override // defpackage.dy
    public void D() {
        this.r.setSpeed(0.0f);
        this.r.setProgress(0.0f);
        this.r.setColorFilter(this.m);
    }

    @Override // defpackage.dy
    public void H() {
        this.r.v();
        this.r.setSpeed(1.0f);
        this.r.setColorFilter(this.l);
    }

    @Override // defpackage.dy
    public void L(long j) {
        this.w.cancel();
        if (j == 0) {
            this.w.setStartDelay(H);
        } else {
            this.w.setCurrentPlayTime(j);
        }
        this.w.start();
    }

    public void N(boolean z) {
        O(z, 0.0f, -0.4f);
    }

    @Override // defpackage.dy
    public void O0() {
        this.n.setImageDrawable(getResources().getDrawable(if6.audio_indicator_placeholder));
        d0(false);
    }

    public void U() {
        this.w.cancel();
        N(false);
    }

    @Override // defpackage.dy
    public void V(String str) {
        if (n0(str)) {
            float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(this.s ? be6.audio_indicator_corner_radius_mini : be6.audio_indicator_corner_radius);
            ColorMatrix colorMatrix = new ColorMatrix();
            zn0.a(colorMatrix, -0.15f);
            og3.c().o(str).j().m(new e37(dimensionPixelSize, 0)).m(new yn0(colorMatrix)).l(this.s ? if6.audio_indicator_placeholder_mini : if6.audio_indicator_placeholder).a(this.n, new a(str));
        }
    }

    protected void X() {
        U();
        this.presenter.T0();
    }

    @Override // defpackage.dy
    public void a() {
        Integer num = this.t;
        if (num != null) {
            setLeft(num.intValue());
            setRight(this.u.intValue());
        } else if (getLeft() != 0 && getRight() != 0) {
            this.t = Integer.valueOf(getLeft());
            this.u = Integer.valueOf(getRight());
        }
        setVisibility(0);
    }

    @Override // defpackage.dy
    public void a0() {
        setTranslationY(getAnimationHeight());
        animate().translationY(0.0f).setInterpolator(new z44()).start();
        setVisibility(0);
    }

    @Override // defpackage.dy
    public void c() {
        setVisibility(com.nytimes.android.utils.snackbar.a.m(ViewExtensions.n(this)) ? 8 : 4);
    }

    void d0(boolean z) {
        int i = z ? ed6.audio_indicator_icon : ed6.audio_indicator_icon_no_artwork;
        int i2 = z ? ed6.audio_indicator_icon : ed6.audio_indicator_icon_no_artwork_pause;
        this.l = new js7(mx0.c(getContext(), i));
        this.m = new js7(mx0.c(getContext(), i2));
        LottieAnimationView lottieAnimationView = this.r;
        lottieAnimationView.setColorFilter(lottieAnimationView.q() ? this.l : this.m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.z0(this);
        this.x.add(this.presenter.O0().subscribe(new Consumer() { // from class: gx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicator.this.w0(((Boolean) obj).booleanValue());
            }
        }, new Consumer() { // from class: hx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicator.t0((Throwable) obj);
            }
        }));
        i0();
        setOnClickListener(new View.OnClickListener() { // from class: ix
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioIndicator.this.v0(view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnClickListener(null);
        this.x.clear();
        animate().cancel();
        this.presenter.L();
        this.r.j();
        this.w.cancel();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof AudioIndicatorSavedState) {
            AudioIndicatorSavedState audioIndicatorSavedState = (AudioIndicatorSavedState) parcelable;
            setEnabled(audioIndicatorSavedState.d());
            setTranslationY(audioIndicatorSavedState.e());
            setVisibility(audioIndicatorSavedState.f());
            V(audioIndicatorSavedState.c());
            if (audioIndicatorSavedState.b()) {
                float a2 = this.w.getDuration() > 0 ? audioIndicatorSavedState.a() / this.w.getDuration() : 1.0f;
                O(true, 1.0f - (a2 * 1.0f), a2 * (-0.4f));
            } else {
                N(false);
            }
            parcelable = audioIndicatorSavedState.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        AudioIndicatorSavedState audioIndicatorSavedState = new AudioIndicatorSavedState(super.onSaveInstanceState());
        audioIndicatorSavedState.i(isEnabled());
        audioIndicatorSavedState.m(getTranslationY());
        audioIndicatorSavedState.n(getVisibility());
        audioIndicatorSavedState.h(this.w.getCurrentPlayTime());
        audioIndicatorSavedState.k(this.n.getColorFilter() != null);
        audioIndicatorSavedState.l(this.n.getTag());
        return audioIndicatorSavedState;
    }

    public AudioIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = false;
        this.x = new CompositeDisposable();
        this.y = 0.0f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, on6.AudioIndicator);
        this.s = obtainStyledAttributes.getBoolean(on6.AudioIndicator_mini, false);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), yh6.audio_indicator, this);
        ImageView imageView = (ImageView) findViewById(fg6.cover_image);
        this.n = imageView;
        imageView.getLayoutParams().width = getResources().getDimensionPixelSize(this.s ? be6.audio_indicator_width_mini : be6.audio_indicator_width);
        this.n.getLayoutParams().height = getResources().getDimensionPixelSize(this.s ? be6.audio_indicator_height_mini : be6.audio_indicator_height);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(fg6.animation_view);
        this.r = lottieAnimationView;
        lottieAnimationView.getLayoutParams().width = getResources().getDimensionPixelSize(this.s ? be6.audio_indicator_animation_width_mini : be6.audio_indicator_animation_width);
        this.r.getLayoutParams().height = getResources().getDimensionPixelSize(this.s ? be6.audio_indicator_animation_height_mini : be6.audio_indicator_animation_height);
        this.w = g0();
    }
}
