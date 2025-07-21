package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dr8;

/* loaded from: classes.dex */
public class ea2 extends gc9 {

    private static class a extends AnimatorListenerAdapter implements dr8.f {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void c(dr8 dr8Var, boolean z) {
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
            this.a.setTag(tf6.transition_pause_alpha, null);
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
            this.a.setTag(tf6.transition_pause_alpha, Float.valueOf(this.a.getVisibility() == 0 ? qb9.b(this.a) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            qb9.e(this.a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            qb9.e(this.a, 1.0f);
            qb9.a(this.a);
        }
    }

    public ea2(int i) {
        q0(i);
    }

    private Animator r0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        qb9.e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) qb9.b, f2);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        x().a(aVar);
        return ofFloat;
    }

    private static float s0(wr8 wr8Var, float f) {
        Float f2;
        return (wr8Var == null || (f2 = (Float) wr8Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.gc9, defpackage.dr8
    public void i(wr8 wr8Var) {
        super.i(wr8Var);
        Float f = (Float) wr8Var.b.getTag(tf6.transition_pause_alpha);
        if (f == null) {
            f = wr8Var.b.getVisibility() == 0 ? Float.valueOf(qb9.b(wr8Var.b)) : Float.valueOf(0.0f);
        }
        wr8Var.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.gc9
    public Animator n0(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        qb9.c(view);
        return r0(view, s0(wr8Var, 0.0f), 1.0f);
    }

    @Override // defpackage.gc9
    public Animator p0(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        qb9.c(view);
        Animator r0 = r0(view, s0(wr8Var, 1.0f), 0.0f);
        if (r0 == null) {
            qb9.e(view, s0(wr8Var2, 1.0f));
        }
        return r0;
    }

    public ea2() {
    }
}
