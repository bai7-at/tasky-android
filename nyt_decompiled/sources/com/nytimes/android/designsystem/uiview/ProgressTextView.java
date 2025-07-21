package com.nytimes.android.designsystem.uiview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.designsystem.uiview.ProgressTextView;
import defpackage.de6;
import defpackage.gd6;
import defpackage.mx0;
import defpackage.yk0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ProgressTextView extends AppCompatTextView {
    public static final a Companion = new a(null);
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final yk0 m;
    private final CharSequence n;
    private boolean r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProgressVisibility.values().length];
            try {
                iArr[ProgressVisibility.INDICATOR_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressVisibility.INDICATOR_WITH_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProgressVisibility.INVISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zq3.h(animator, "animation");
            ProgressTextView.this.r = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    private final void B(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    private final AnimatorSet t(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(getWidth(), i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w46
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressTextView.u(ProgressTextView.this, valueAnimator);
            }
        });
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(this, "textColor", getCurrentTextColor(), i2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(ofInt, ofArgb);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(ProgressTextView progressTextView, ValueAnimator valueAnimator) {
        zq3.h(progressTextView, "this$0");
        zq3.h(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        zq3.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressTextView.B(((Integer) animatedValue).intValue());
    }

    private final int w() {
        return this.k + ((int) getPaint().measureText(this.n.toString()));
    }

    public static /* synthetic */ void y(ProgressTextView progressTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        progressTextView.x(z);
    }

    private final void z() {
        setText(this.n);
        B(this.j);
        AnimatorSet t = t(w(), this.l);
        t.addListener(new c());
        t.start();
    }

    public final void A(SwipeRefreshLayout swipeRefreshLayout, ProgressVisibility progressVisibility) {
        zq3.h(swipeRefreshLayout, "swipeRefreshLayout");
        zq3.h(progressVisibility, "visibility");
        int i = b.a[progressVisibility.ordinal()];
        if (i == 1) {
            y(this, false, 1, null);
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(false);
        } else {
            if (i == 2) {
                if (swipeRefreshLayout.isRefreshing()) {
                    return;
                }
                x(true);
                swipeRefreshLayout.setEnabled(false);
                return;
            }
            if (i != 3) {
                return;
            }
            v();
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0 && getVisibility() != 0) {
            this.m.start();
        } else if (getVisibility() == 0) {
            this.m.stop();
        }
        super.setVisibility(i);
    }

    public final void v() {
        setVisibility(8);
    }

    public final void x(boolean z) {
        if (getVisibility() == 0) {
            if (z) {
                z();
                return;
            }
            return;
        }
        setVisibility(0);
        if (z) {
            setText(this.n);
            setTextColor(this.l);
            B(w());
        } else {
            setText("");
            setTextColor(-1);
            B(this.j);
        }
    }

    public /* synthetic */ ProgressTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        int i2 = gd6.content_primary;
        this.h = i2;
        int i3 = gd6.background_primary;
        this.i = i3;
        this.j = getResources().getDimensionPixelSize(de6.progress_text_view_small_size);
        this.k = getResources().getDimensionPixelSize(de6.progress_text_view_small_total_margin);
        this.l = mx0.c(context, i2);
        yk0 yk0Var = new yk0(context);
        yk0Var.o(1);
        yk0Var.i(mx0.c(context, i2));
        yk0Var.h(mx0.c(context, i3));
        int d = ((int) (yk0Var.d() + yk0Var.e())) * 2;
        yk0Var.setBounds(0, 0, d, d);
        this.m = yk0Var;
        setCompoundDrawables(null, null, yk0Var, null);
        CharSequence text = getText();
        zq3.g(text, "getText(...)");
        this.n = text;
        setText("");
    }
}
