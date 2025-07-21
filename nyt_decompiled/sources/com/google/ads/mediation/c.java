package com.google.ads.mediation;

import defpackage.kp4;
import defpackage.t64;
import defpackage.vq3;
import defpackage.wq3;

/* loaded from: classes2.dex */
final class c extends wq3 {
    final AbstractAdViewAdapter a;
    final kp4 b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, kp4 kp4Var) {
        this.a = abstractAdViewAdapter;
        this.b = kp4Var;
    }

    @Override // defpackage.p6
    public final void a(t64 t64Var) {
        this.b.j(this.a, t64Var);
    }

    @Override // defpackage.p6
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        vq3 vq3Var = (vq3) obj;
        abstractAdViewAdapter.mInterstitialAd = vq3Var;
        vq3Var.c(new d(abstractAdViewAdapter, this.b));
        this.b.o(this.a);
    }
}
