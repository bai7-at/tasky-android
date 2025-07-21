package com.google.firebase.installations;

import defpackage.qg8;

/* loaded from: classes3.dex */
class e implements g {
    final qg8 a;

    public e(qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(com.google.firebase.installations.local.b bVar) {
        if (!bVar.l() && !bVar.k() && !bVar.i()) {
            return false;
        }
        this.a.e(bVar.d());
        return true;
    }
}
