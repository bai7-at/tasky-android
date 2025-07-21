package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import defpackage.n6f;
import defpackage.qg8;

/* loaded from: classes3.dex */
final class f extends e {
    final String d;

    f(g gVar, qg8 qg8Var, String str) {
        super(gVar, new n6f("OnRequestInstallCallback"), qg8Var);
        this.d = str;
    }

    @Override // com.google.android.play.core.review.e, defpackage.w0f
    public final void k0(Bundle bundle) {
        super.k0(bundle);
        this.b.e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
