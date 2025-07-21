package com.google.ads.mediation;

import defpackage.hp4;
import defpackage.jl;
import defpackage.jq9;
import defpackage.o6;
import defpackage.t64;

/* loaded from: classes2.dex */
final class b extends o6 implements jl, jq9 {
    final AbstractAdViewAdapter a;
    final hp4 b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, hp4 hp4Var) {
        this.a = abstractAdViewAdapter;
        this.b = hp4Var;
    }

    @Override // defpackage.o6
    public final void E() {
        this.b.g(this.a);
    }

    @Override // defpackage.o6
    public final void l() {
        this.b.i(this.a);
    }

    @Override // defpackage.o6
    public final void n(t64 t64Var) {
        this.b.q(this.a, t64Var);
    }

    @Override // defpackage.o6
    public final void t() {
        this.b.e(this.a);
    }

    @Override // defpackage.o6, defpackage.jq9
    public final void v() {
        this.b.c(this.a);
    }

    @Override // defpackage.jl
    public final void x(String str, String str2) {
        this.b.k(this.a, str, str2);
    }
}
