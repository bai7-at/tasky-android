package defpackage;

import defpackage.nk5;

/* loaded from: classes4.dex */
public final class g36 {
    public static final g36 a = new g36();

    private g36() {
    }

    public final void a(lu3 lu3Var, a36 a36Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(a36Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("params");
        j8.a(j8.d(v09.a, false, 1, null)).toJson(lu3Var, w41Var, a36Var.f());
        lu3Var.name("dntOn");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(a36Var.e()));
        if (a36Var.d() instanceof nk5.c) {
            lu3Var.name("agentTcfData");
            j8.e(j8.b(j8.d(yg8.a, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) a36Var.d());
        }
    }
}
