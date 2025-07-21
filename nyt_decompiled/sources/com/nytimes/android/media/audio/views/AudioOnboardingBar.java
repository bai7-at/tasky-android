package com.nytimes.android.media.audio.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nytimes.android.media.audio.views.AudioOnboardingBar;
import defpackage.fs7;
import defpackage.sy;
import defpackage.uy;
import defpackage.yh6;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AudioOnboardingBar extends l implements uy {
    private static final long e = TimeUnit.SECONDS.toMillis(5);
    private final ValueAnimator c;
    private final ValueAnimator d;
    sy presenter;

    class a extends CoordinatorLayout.c {
        a() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AudioIndicator;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            view.setTranslationY(view2.getTranslationY());
            return true;
        }
    }

    class b extends fs7 {
        b() {
        }

        @Override // defpackage.fs7, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AudioOnboardingBar.this.setVisibility(0);
        }
    }

    class c extends fs7 {
        c() {
        }

        @Override // defpackage.fs7, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AudioOnboardingBar.this.presenter.l0();
            AudioOnboardingBar.this.setVisibility(8);
        }
    }

    public AudioOnboardingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ValueAnimator valueAnimator) {
        setAlpha(valueAnimator.getAnimatedFraction());
    }

    private ValueAnimator q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ny
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioOnboardingBar.this.z(valueAnimator);
            }
        });
        ofFloat.setDuration(500L);
        ofFloat.setStartDelay(e);
        ofFloat.addListener(new c());
        return ofFloat;
    }

    private void r() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) layoutParams).n(new a());
        }
    }

    private ValueAnimator s() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioOnboardingBar.this.A(valueAnimator);
            }
        });
        ofFloat.setDuration(500L);
        ofFloat.addListener(new b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(ValueAnimator valueAnimator) {
        setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    @Override // defpackage.uy
    public void a() {
        this.c.start();
        this.d.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
        this.presenter.a0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
    }

    public AudioOnboardingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), yh6.audio_onboarding_bar, this);
        this.c = s();
        this.d = q();
    }
}
