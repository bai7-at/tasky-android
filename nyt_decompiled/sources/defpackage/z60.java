package defpackage;

import androidx.work.impl.constraints.controllers.BaseConstraintController;

/* loaded from: classes.dex */
public final class z60 extends BaseConstraintController {
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(a70 a70Var) {
        super(a70Var);
        zq3.h(a70Var, "tracker");
        this.b = 5;
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return dk9Var.j.h();
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
