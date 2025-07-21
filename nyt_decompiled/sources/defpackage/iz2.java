package defpackage;

import defpackage.nk5;

/* loaded from: classes3.dex */
public final class iz2 {
    public static final iz2 a = new iz2();

    private iz2() {
    }

    public final void a(lu3 lu3Var, bz2 bz2Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(bz2Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        if (bz2Var.e() instanceof nk5.c) {
            lu3Var.name("limit");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) bz2Var.e());
        }
        if (bz2Var.f() instanceof nk5.c) {
            lu3Var.name("page");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) bz2Var.f());
        }
        if (bz2Var.d() instanceof nk5.c) {
            lu3Var.name("interestIds");
            j8.e(j8.b(j8.a(j8.b))).toJson(lu3Var, w41Var, (nk5.c) bz2Var.d());
        }
    }
}
