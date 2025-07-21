package com.nytimes.android.dailyfive.ui.items;

import defpackage.gr3;
import defpackage.k80;
import defpackage.u33;
import defpackage.zq3;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public abstract class c extends k80 {
    private CoroutineScope e = CoroutineScopeKt.MainScope();

    public abstract Object E();

    public abstract List F();

    public boolean G() {
        return false;
    }

    @Override // defpackage.gr3
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void y(u33 u33Var) {
        zq3.h(u33Var, "viewHolder");
        super.y(u33Var);
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
        this.e = CoroutineScopeKt.MainScope();
    }

    @Override // defpackage.gr3
    public boolean r(gr3 gr3Var) {
        zq3.h(gr3Var, "other");
        if (gr3Var instanceof c) {
            return zq3.c(E(), ((c) gr3Var).E());
        }
        return false;
    }

    @Override // defpackage.gr3
    public boolean v(gr3 gr3Var) {
        zq3.h(gr3Var, "other");
        if (gr3Var instanceof c) {
            return zq3.c(F(), ((c) gr3Var).F());
        }
        return false;
    }
}
