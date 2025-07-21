package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class wf4 extends jf4 {
    private final float g;
    private final float h;
    private final float i;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ int b;

        a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wf4.this.b.setTranslationX(0.0f);
            wf4.this.k(0.0f, this.a, this.b);
        }
    }

    public wf4(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(zd6.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(zd6.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(zd6.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean g(int i, int i2) {
        return (p23.b(i, k99.x(this.b)) & i2) == i2;
    }

    private int i(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public void h(h30 h30Var, int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = h30Var.b() == 0;
        boolean g = g(i, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(g);
        View view = this.b;
        Property property = View.TRANSLATION_X;
        if (g) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new la2());
        ofFloat.setDuration(hi.c(this.c, this.d, h30Var.a()));
        ofFloat.addListener(new a(z, i));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void j(h30 h30Var) {
        super.d(h30Var);
    }

    public void k(float f, boolean z, int i) {
        float a2 = a(f);
        boolean g = g(i, 3);
        boolean z2 = z == g;
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            View view = this.b;
            if (g) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float a3 = hi.a(0.0f, f5, a2);
            float f7 = a3 + 1.0f;
            this.b.setScaleX(f7);
            float a4 = 1.0f - hi.a(0.0f, f6, a2);
            this.b.setScaleY(a4);
            View view2 = this.b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - a3 : 1.0f;
                    float f9 = a4 != 0.0f ? (f7 / a4) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }

    public void l(h30 h30Var, int i) {
        if (super.e(h30Var) == null) {
            return;
        }
        k(h30Var.a(), h30Var.b() == 0, i);
    }
}
