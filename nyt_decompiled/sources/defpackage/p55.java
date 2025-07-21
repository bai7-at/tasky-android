package defpackage;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.BaseConstraintController;

/* loaded from: classes.dex */
public final class p55 extends BaseConstraintController {
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p55(dv0 dv0Var) {
        super(dv0Var);
        zq3.h(dv0Var, "tracker");
        this.b = 7;
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        NetworkType f = dk9Var.j.f();
        return f == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && f == NetworkType.TEMPORARILY_UNMETERED);
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
        return !y45Var.a() || y45Var.b();
    }
}
