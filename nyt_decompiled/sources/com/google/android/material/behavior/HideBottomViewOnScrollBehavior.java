package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.hi;
import defpackage.hw4;
import defpackage.lc6;
import defpackage.lh4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {
    private static final int j = lc6.motionDurationLong2;
    private static final int k = lc6.motionDurationMedium4;
    private static final int l = lc6.motionEasingEmphasizedInterpolator;
    private final LinkedHashSet a;
    private int b;
    private int c;
    private TimeInterpolator d;
    private TimeInterpolator e;
    private int f;
    private int g;
    private int h;
    private ViewPropertyAnimator i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }

    private void f(View view, int i, long j2, TimeInterpolator timeInterpolator) {
        this.i = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    private void n(View view, int i) {
        this.g = i;
        Iterator it2 = this.a.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    public boolean g() {
        return this.g == 1;
    }

    public boolean h() {
        return this.g == 2;
    }

    public void i(View view, int i) {
        this.h = i;
        if (this.g == 1) {
            view.setTranslationY(this.f + i);
        }
    }

    public void j(View view) {
        k(view, true);
    }

    public void k(View view, boolean z) {
        if (g()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        n(view, 1);
        int i = this.f + this.h;
        if (z) {
            f(view, i, this.c, this.e);
        } else {
            view.setTranslationY(i);
        }
    }

    public void l(View view) {
        m(view, true);
    }

    public void m(View view, boolean z) {
        if (h()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        n(view, 2);
        if (z) {
            f(view, 0, this.b, this.d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = hw4.f(view.getContext(), j, 225);
        this.c = hw4.f(view.getContext(), k, 175);
        Context context = view.getContext();
        int i2 = l;
        this.d = hw4.g(context, i2, hi.d);
        this.e = hw4.g(view.getContext(), i2, hi.c);
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            j(view);
        } else if (i2 < 0) {
            l(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }
}
