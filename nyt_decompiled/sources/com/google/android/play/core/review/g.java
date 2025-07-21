package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import defpackage.kzc;
import defpackage.n6f;
import defpackage.og8;
import defpackage.qg8;
import defpackage.txf;
import defpackage.vg8;
import defpackage.x1g;

/* loaded from: classes3.dex */
public final class g {
    private static final n6f c = new n6f("ReviewService");
    txf a;
    private final String b;

    public g(Context context) {
        this.b = context.getPackageName();
        if (x1g.a(context)) {
            this.a = new txf(context, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), kzc.a, null, null);
        }
    }

    public final og8 a() {
        n6f n6fVar = c;
        n6fVar.d("requestInAppReview (%s)", this.b);
        if (this.a == null) {
            n6fVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return vg8.d(new ReviewException(-1));
        }
        qg8 qg8Var = new qg8();
        this.a.p(new d(this, qg8Var, qg8Var), qg8Var);
        return qg8Var.a();
    }
}
