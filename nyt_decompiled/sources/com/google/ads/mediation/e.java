package com.google.ads.mediation;

import defpackage.eie;
import defpackage.gtd;
import defpackage.kua;
import defpackage.mp4;
import defpackage.o6;
import defpackage.o6f;
import defpackage.rw8;
import defpackage.t64;

/* loaded from: classes2.dex */
final class e extends o6 implements o6f, eie, gtd {
    final AbstractAdViewAdapter a;
    final mp4 b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, mp4 mp4Var) {
        this.a = abstractAdViewAdapter;
        this.b = mp4Var;
    }

    @Override // defpackage.o6
    public final void E() {
        this.b.a(this.a);
    }

    @Override // defpackage.o6f
    public final void a(rw8 rw8Var) {
        this.b.m(this.a, new a(rw8Var));
    }

    @Override // defpackage.eie
    public final void c(kua kuaVar) {
        this.b.r(this.a, kuaVar);
    }

    @Override // defpackage.gtd
    public final void k(kua kuaVar, String str) {
        this.b.n(this.a, kuaVar, str);
    }

    @Override // defpackage.o6
    public final void l() {
        this.b.d(this.a);
    }

    @Override // defpackage.o6
    public final void n(t64 t64Var) {
        this.b.f(this.a, t64Var);
    }

    @Override // defpackage.o6
    public final void s() {
        this.b.h(this.a);
    }

    @Override // defpackage.o6
    public final void t() {
    }

    @Override // defpackage.o6, defpackage.jq9
    public final void v() {
        this.b.l(this.a);
    }
}
