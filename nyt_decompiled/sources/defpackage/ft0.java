package defpackage;

import defpackage.jr5;

/* loaded from: classes.dex */
public abstract class ft0 {
    public static final boolean a(kr5 kr5Var, bt0 bt0Var) {
        zq3.f(bt0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return kr5Var.containsKey(bt0Var);
    }

    public static final Object b(kr5 kr5Var, bt0 bt0Var) {
        zq3.f(bt0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        x08 x08Var = (x08) kr5Var.get(bt0Var);
        if (x08Var != null) {
            return x08Var.getValue();
        }
        return null;
    }

    public static final Object c(kr5 kr5Var, bt0 bt0Var) {
        return a(kr5Var, bt0Var) ? b(kr5Var, bt0Var) : bt0Var.a().getValue();
    }

    public static final kr5 d(o76[] o76VarArr, kr5 kr5Var, kr5 kr5Var2) {
        jr5.a b = lr5.a().b();
        for (o76 o76Var : o76VarArr) {
            bt0 b2 = o76Var.b();
            zq3.f(b2, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            m76 m76Var = (m76) b2;
            if (o76Var.a() || !a(kr5Var, m76Var)) {
                b.put(m76Var, m76Var.b(o76Var.c(), (x08) kr5Var2.get(m76Var)));
            }
        }
        return b.build();
    }

    public static /* synthetic */ kr5 e(o76[] o76VarArr, kr5 kr5Var, kr5 kr5Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            kr5Var2 = lr5.a();
        }
        return d(o76VarArr, kr5Var, kr5Var2);
    }
}
