package com.nytimes.android.feedback;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.al6;
import defpackage.ss2;
import defpackage.u14;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class FeedbackActivity$onCreate$6 extends Lambda implements ss2 {
    final /* synthetic */ FeedbackActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackActivity$onCreate$6(FeedbackActivity feedbackActivity) {
        super(1);
        this.this$0 = feedbackActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TransitionDrawable transitionDrawable, final FeedbackActivity feedbackActivity, final BitmapDrawable bitmapDrawable) {
        zq3.h(transitionDrawable, "$transitionDrawable");
        zq3.h(feedbackActivity, "this$0");
        zq3.h(bitmapDrawable, "$endDrawable");
        transitionDrawable.startTransition(150);
        feedbackActivity.c0().j.postDelayed(new Runnable() { // from class: com.nytimes.android.feedback.c
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackActivity$onCreate$6.j(FeedbackActivity.this, bitmapDrawable);
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(FeedbackActivity feedbackActivity, BitmapDrawable bitmapDrawable) {
        zq3.h(feedbackActivity, "this$0");
        zq3.h(bitmapDrawable, "$endDrawable");
        feedbackActivity.c0().j.setImageDrawable(bitmapDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TransitionDrawable transitionDrawable, final FeedbackActivity feedbackActivity) {
        zq3.h(transitionDrawable, "$transitionDrawable");
        zq3.h(feedbackActivity, "this$0");
        transitionDrawable.startTransition(150);
        feedbackActivity.c0().j.postDelayed(new Runnable() { // from class: com.nytimes.android.feedback.d
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackActivity$onCreate$6.l(FeedbackActivity.this);
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FeedbackActivity feedbackActivity) {
        zq3.h(feedbackActivity, "this$0");
        feedbackActivity.c0().j.setImageDrawable(new ColorDrawable(0));
    }

    public final void h(u14 u14Var) {
        Boolean bool = null;
        if (!(u14Var instanceof u14.c)) {
            if (u14Var instanceof u14.a) {
                SnackbarUtil.y(this.this$0.getSnackbarUtil(), al6.feedback_screenshot_failed, 0, 2, null);
                return;
            }
            return;
        }
        u14.c cVar = (u14.c) u14Var;
        if (((Bitmap) ((Pair) cVar.a()).c()) != null) {
            final FeedbackActivity feedbackActivity = this.this$0;
            Drawable drawable = feedbackActivity.c0().j.getDrawable();
            if (drawable == null) {
                drawable = new ColorDrawable(0);
            } else {
                zq3.e(drawable);
            }
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(feedbackActivity.getResources(), (Bitmap) ((Pair) cVar.a()).c());
            final TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
            transitionDrawable.setCrossFadeEnabled(true);
            feedbackActivity.c0().j.setImageDrawable(transitionDrawable);
            bool = Boolean.valueOf(feedbackActivity.c0().j.post(new Runnable() { // from class: com.nytimes.android.feedback.a
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackActivity$onCreate$6.i(transitionDrawable, feedbackActivity, bitmapDrawable);
                }
            }));
        }
        final FeedbackActivity feedbackActivity2 = this.this$0;
        if (bool == null) {
            Drawable drawable2 = feedbackActivity2.c0().j.getDrawable();
            if (drawable2 == null) {
                drawable2 = new ColorDrawable(0);
            }
            final TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{drawable2, new ColorDrawable(0)});
            transitionDrawable2.setCrossFadeEnabled(true);
            feedbackActivity2.c0().j.setImageDrawable(transitionDrawable2);
            feedbackActivity2.c0().j.post(new Runnable() { // from class: com.nytimes.android.feedback.b
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackActivity$onCreate$6.k(transitionDrawable2, feedbackActivity2);
                }
            });
        }
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((u14) obj);
        return ww8.a;
    }
}
