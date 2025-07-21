package defpackage;

import androidx.work.impl.constraints.controllers.BaseConstraintController;

/* loaded from: classes.dex */
public final class i28 extends BaseConstraintController {
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i28(dv0 dv0Var) {
        super(dv0Var);
        zq3.h(dv0Var, "tracker");
        this.b = 9;
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return dk9Var.j.k();
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int e() {
        return this.b;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public /* bridge */ /* synthetic */ boolean f(Object obj) {
        return g(((Boolean) obj).booleanValue());
    }

    protected boolean g(boolean z) {
        return !z;
    }
}
