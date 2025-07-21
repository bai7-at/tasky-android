package defpackage;

import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.BaseConstraintController;

/* loaded from: classes.dex */
public final class s35 extends BaseConstraintController {
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s35(dv0 dv0Var) {
        super(dv0Var);
        zq3.h(dv0Var, "tracker");
        this.b = 7;
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return dk9Var.j.f() == NetworkType.CONNECTED;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(y45 y45Var) {
        zq3.h(y45Var, "value");
        return (y45Var.a() && y45Var.d()) ? false : true;
    }
}
