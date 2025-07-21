package defpackage;

import android.app.Activity;
import com.google.android.play.core.review.ReviewInfo;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public class dr7 {
    private final Activity a;
    private l17 b;
    private final m17 c;

    public dr7(Activity activity, l17 l17Var, m17 m17Var) {
        zq3.h(activity, "activity");
        zq3.h(l17Var, "reviewManager");
        zq3.h(m17Var, "reviewStorage");
        this.a = activity;
        this.b = l17Var;
        this.c = m17Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(dr7 dr7Var, og8 og8Var) {
        zq3.h(dr7Var, "this$0");
        zq3.h(og8Var, "request");
        if (og8Var.q()) {
            final og8 b = dr7Var.b.b(dr7Var.a, (ReviewInfo) og8Var.m());
            zq3.g(b, "launchReviewFlow(...)");
            dr7Var.c.d();
            b.b(new me5() { // from class: cr7
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var2) {
                    dr7.f(og8.this, og8Var2);
                }
            });
            return;
        }
        Exception l = og8Var.l();
        if (l != null) {
            NYTLogger.i(l, "Error: " + l.getLocalizedMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(og8 og8Var, og8 og8Var2) {
        zq3.h(og8Var, "$flow");
        zq3.h(og8Var2, "it");
        NYTLogger.l("IAR: Requested review completed " + og8Var.q(), new Object[0]);
    }

    public final void c() {
        if (this.c.f()) {
            d();
        }
    }

    public void d() {
        og8 a = this.b.a();
        zq3.g(a, "requestReviewFlow(...)");
        a.b(new me5() { // from class: br7
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                dr7.e(dr7.this, og8Var);
            }
        });
    }
}
