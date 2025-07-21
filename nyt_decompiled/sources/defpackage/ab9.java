package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ab9 {
    private final WeakReference a;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ cb9 a;
        final /* synthetic */ View b;

        a(cb9 cb9Var, View view) {
            this.a = cb9Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    ab9(View view) {
        this.a = new WeakReference(view);
    }

    private void i(View view, cb9 cb9Var) {
        if (cb9Var != null) {
            view.animate().setListener(new a(cb9Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public ab9 b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ab9 f(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ab9 g(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ab9 h(cb9 cb9Var) {
        View view = (View) this.a.get();
        if (view != null) {
            i(view, cb9Var);
        }
        return this;
    }

    public ab9 j(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ab9 k(final eb9 eb9Var) {
        final View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(eb9Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: za9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    eb9.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ab9 m(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
