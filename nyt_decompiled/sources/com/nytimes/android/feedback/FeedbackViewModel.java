package com.nytimes.android.feedback;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.cr5;
import defpackage.ed2;
import defpackage.fy4;
import defpackage.u14;
import defpackage.wc2;
import defpackage.zq3;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class FeedbackViewModel extends q {
    private final FeedbackProvider a;
    private final wc2 b;
    private final ed2 c;
    private final cr5 d;
    private final fy4 e;
    private final fy4 f;

    public FeedbackViewModel(FeedbackProvider feedbackProvider, wc2 wc2Var, ed2 ed2Var, cr5 cr5Var) {
        zq3.h(feedbackProvider, "feedbackProvider");
        zq3.h(wc2Var, "fieldProvider");
        zq3.h(ed2Var, "resourceProvider");
        zq3.h(cr5Var, "performanceTrackerClient");
        this.a = feedbackProvider;
        this.b = wc2Var;
        this.c = ed2Var;
        this.d = cr5Var;
        this.e = new fy4();
        this.f = new fy4();
        feedbackProvider.b();
    }

    public final fy4 j() {
        return this.e;
    }

    public final fy4 k() {
        return this.f;
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new FeedbackViewModel$retrieveAppInfo$1(this, null), 3, null);
    }

    public final void m(String str, String str2, String str3, List list) {
        zq3.h(str, "email");
        zq3.h(str2, "body");
        zq3.h(list, "extraFeedbackData");
        this.f.n(u14.b.b);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new FeedbackViewModel$sendEmail$1(this, str, str2, str3, list, null), 3, null);
    }
}
