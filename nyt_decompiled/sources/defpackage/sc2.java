package defpackage;

import com.nytimes.android.feedback.FeedbackActivity;
import com.nytimes.android.feedback.ui.tooltip.FeedbackTooltipHelper;

/* loaded from: classes4.dex */
public abstract class sc2 implements op4 {
    public static void a(FeedbackActivity feedbackActivity, tc2 tc2Var) {
        feedbackActivity.feedbackAppDependencies = tc2Var;
    }

    public static void b(FeedbackActivity feedbackActivity, FeedbackTooltipHelper feedbackTooltipHelper) {
        feedbackActivity.tooltipHelper = feedbackTooltipHelper;
    }
}
