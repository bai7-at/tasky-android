package com.airbnb.android.showkase.ui;

import defpackage.ce5;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class a extends ce5 {
    public qs2 a;

    public a(boolean z) {
        super(z);
    }

    public final qs2 a() {
        qs2 qs2Var = this.a;
        if (qs2Var != null) {
            return qs2Var;
        }
        zq3.z("onBackPressed");
        return null;
    }

    public final void b(qs2 qs2Var) {
        zq3.h(qs2Var, "<set-?>");
        this.a = qs2Var;
    }

    @Override // defpackage.ce5
    public void handleOnBackPressed() {
        a().mo865invoke();
    }
}
