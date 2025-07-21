package com.nytimes.android.feedback.ui.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.nytimes.android.feedback.ui.tooltip.FeedbackTooltipHelper;
import defpackage.al6;
import defpackage.c04;
import defpackage.id2;
import defpackage.qs2;
import defpackage.td6;
import defpackage.zq3;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FeedbackTooltipHelper {
    public static final a Companion = new a(null);
    private final Application a;
    private final SharedPreferences b;
    private final c04 c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        private final void a() {
            ViewParent parent = FeedbackTooltipHelper.this.g().getRoot().getParent();
            zq3.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(FeedbackTooltipHelper.this.g().getRoot());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            zq3.h(animator, "animation");
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zq3.h(animator, "animation");
            a();
        }
    }

    public FeedbackTooltipHelper(Application application, SharedPreferences sharedPreferences) {
        zq3.h(application, "application");
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = application;
        this.b = sharedPreferences;
        this.c = c.a(new qs2() { // from class: com.nytimes.android.feedback.ui.tooltip.FeedbackTooltipHelper$feedbackToolTipBindingDelegate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final id2 mo865invoke() {
                return id2.c(LayoutInflater.from(FeedbackTooltipHelper.this.f()));
            }
        });
        this.d = application.getResources().getDimensionPixelSize(td6.feedback_tooltip_margin);
    }

    private final boolean d() {
        int i = this.b.getInt("FeedbackTooltipHelper.KEY_FEEDBACK_SCREENSHOT_TOOLTIP_COUNT", 0);
        boolean z = i < 5;
        if (z) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putInt("FeedbackTooltipHelper.KEY_FEEDBACK_SCREENSHOT_TOOLTIP_COUNT", i + 1);
            edit.apply();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id2 g() {
        return (id2) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final FeedbackTooltipHelper feedbackTooltipHelper, View view, View view2, ViewGroupOverlay viewGroupOverlay) {
        zq3.h(feedbackTooltipHelper, "this$0");
        zq3.h(view, "$root");
        zq3.h(view2, "$anchor");
        zq3.h(viewGroupOverlay, "$this_with");
        feedbackTooltipHelper.g().c.setText(al6.feedback_screenshot_tooltip);
        feedbackTooltipHelper.g().getRoot().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Rect rect = new Rect();
        view2.getDrawingRect(rect);
        ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
        int measuredWidth = rect.right - feedbackTooltipHelper.g().getRoot().getMeasuredWidth();
        int measuredHeight = (rect.top - feedbackTooltipHelper.g().getRoot().getMeasuredHeight()) - feedbackTooltipHelper.d;
        int measuredWidth2 = feedbackTooltipHelper.g().getRoot().getMeasuredWidth() + measuredWidth;
        feedbackTooltipHelper.g().getRoot().layout(measuredWidth, measuredHeight, measuredWidth2, feedbackTooltipHelper.g().getRoot().getMeasuredHeight() + measuredHeight);
        float centerX = rect.centerX() - (measuredWidth2 - (feedbackTooltipHelper.g().getRoot().getMeasuredWidth() / 2.0f));
        if (centerX > 0.0f && Math.abs(centerX) <= feedbackTooltipHelper.g().getRoot().getMeasuredWidth()) {
            feedbackTooltipHelper.g().b.setTranslationX(centerX);
        }
        feedbackTooltipHelper.g().getRoot().setAlpha(0.0f);
        feedbackTooltipHelper.g().getRoot().setTranslationY(feedbackTooltipHelper.d);
        viewGroupOverlay.add(feedbackTooltipHelper.g().getRoot());
        ViewPropertyAnimator alpha = feedbackTooltipHelper.g().getRoot().animate().translationY(0.0f).alpha(1.0f);
        alpha.setDuration(150L);
        alpha.setStartDelay(300L);
        feedbackTooltipHelper.g().getRoot().postDelayed(new Runnable() { // from class: jd2
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackTooltipHelper.j(FeedbackTooltipHelper.this);
            }
        }, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(FeedbackTooltipHelper feedbackTooltipHelper) {
        zq3.h(feedbackTooltipHelper, "this$0");
        feedbackTooltipHelper.e();
    }

    public final void e() {
        if (this.c.a() && g().getRoot().isAttachedToWindow() && g().getRoot().getTag() == null) {
            g().getRoot().setTag(new Object());
            g().getRoot().animate().translationY(this.d).alpha(0.0f).setListener(new b());
        }
    }

    public final Application f() {
        return this.a;
    }

    public final void h(final View view, final View view2) {
        zq3.h(view, "root");
        zq3.h(view2, "anchor");
        if (d()) {
            final ViewGroupOverlay overlay = ((ViewGroup) view).getOverlay();
            zq3.f(overlay, "null cannot be cast to non-null type android.view.ViewGroupOverlay");
            view2.post(new Runnable() { // from class: kd2
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackTooltipHelper.i(FeedbackTooltipHelper.this, view, view2, overlay);
                }
            });
        }
    }
}
