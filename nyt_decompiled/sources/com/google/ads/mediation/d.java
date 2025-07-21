package com.google.ads.mediation;

import defpackage.fr2;
import defpackage.kp4;

/* loaded from: classes2.dex */
final class d extends fr2 {
    final AbstractAdViewAdapter a;
    final kp4 b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, kp4 kp4Var) {
        this.a = abstractAdViewAdapter;
        this.b = kp4Var;
    }

    @Override // defpackage.fr2
    public final void b() {
        this.b.p(this.a);
    }

    @Override // defpackage.fr2
    public final void e() {
        this.b.s(this.a);
    }
}
