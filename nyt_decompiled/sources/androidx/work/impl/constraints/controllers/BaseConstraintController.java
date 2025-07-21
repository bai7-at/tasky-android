package androidx.work.impl.constraints.controllers;

import defpackage.dk9;
import defpackage.dv0;
import defpackage.gv0;
import defpackage.yu0;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract class BaseConstraintController implements yu0 {
    private final dv0 a;

    public BaseConstraintController(dv0 dv0Var) {
        zq3.h(dv0Var, "tracker");
        this.a = dv0Var;
    }

    @Override // defpackage.yu0
    public boolean a(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return c(dk9Var) && f(this.a.e());
    }

    @Override // defpackage.yu0
    public Flow b(gv0 gv0Var) {
        zq3.h(gv0Var, "constraints");
        return FlowKt.callbackFlow(new BaseConstraintController$track$1(this, null));
    }

    protected abstract int e();

    protected abstract boolean f(Object obj);
}
