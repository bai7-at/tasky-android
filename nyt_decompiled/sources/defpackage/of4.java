package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class of4 extends jf4 {
    private final float g;
    private final float h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            of4.this.b.setTranslationY(0.0f);
            of4.this.k(0.0f);
        }
    }

    public of4(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(zd6.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(zd6.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new la2());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator g = g();
        g.setDuration(this.e);
        g.start();
    }

    public void h(h30 h30Var, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.TRANSLATION_Y, this.b.getHeight() * this.b.getScaleY());
        ofFloat.setInterpolator(new la2());
        ofFloat.setDuration(hi.c(this.c, this.d, h30Var.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(h30 h30Var, Animator.AnimatorListener animatorListener) {
        Animator g = g();
        g.setDuration(hi.c(this.c, this.d, h30Var.a()));
        if (animatorListener != null) {
            g.addListener(animatorListener);
        }
        g.start();
    }

    public void j(h30 h30Var) {
        super.d(h30Var);
    }

    public void k(float f) {
        float a2 = a(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float a3 = 1.0f - hi.a(0.0f, f2, a2);
        float a4 = 1.0f - hi.a(0.0f, f3, a2);
        this.b.setScaleX(a3);
        this.b.setPivotY(height);
        this.b.setScaleY(a4);
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a4 != 0.0f ? a3 / a4 : 1.0f);
            }
        }
    }

    public void l(h30 h30Var) {
        if (super.e(h30Var) == null) {
            return;
        }
        k(h30Var.a());
    }
}
