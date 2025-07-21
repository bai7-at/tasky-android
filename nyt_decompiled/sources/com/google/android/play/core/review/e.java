package com.google.android.play.core.review;

import android.os.Bundle;
import defpackage.bie;
import defpackage.n6f;
import defpackage.qg8;
import defpackage.txf;

/* loaded from: classes3.dex */
abstract class e extends bie {
    final n6f a;
    final qg8 b;
    final /* synthetic */ g c;

    e(g gVar, n6f n6fVar, qg8 qg8Var) {
        this.c = gVar;
        this.a = n6fVar;
        this.b = qg8Var;
    }

    @Override // defpackage.w0f
    public void k0(Bundle bundle) {
        txf txfVar = this.c.a;
        if (txfVar != null) {
            txfVar.r(this.b);
        }
        this.a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
