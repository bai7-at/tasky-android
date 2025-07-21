package defpackage;

import androidx.lifecycle.q;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public final class wj3 implements t.b {
    private final oa9[] b;

    public wj3(oa9... oa9VarArr) {
        zq3.h(oa9VarArr, "initializers");
        this.b = oa9VarArr;
    }

    @Override // androidx.lifecycle.t.b
    public q b(Class cls, t21 t21Var) {
        zq3.h(cls, "modelClass");
        zq3.h(t21Var, "extras");
        q qVar = null;
        for (oa9 oa9Var : this.b) {
            if (zq3.c(oa9Var.a(), cls)) {
                Object invoke = oa9Var.b().invoke(t21Var);
                qVar = invoke instanceof q ? (q) invoke : null;
            }
        }
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
