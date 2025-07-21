package com.google.firebase.installations;

import defpackage.qg8;

/* loaded from: classes3.dex */
class d implements g {
    private final h a;
    private final qg8 b;

    public d(h hVar, qg8 qg8Var) {
        this.a = hVar;
        this.b = qg8Var;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(com.google.firebase.installations.local.b bVar) {
        if (!bVar.k() || this.a.f(bVar)) {
            return false;
        }
        this.b.c(f.a().b(bVar.b()).d(bVar.c()).c(bVar.h()).a());
        return true;
    }
}
