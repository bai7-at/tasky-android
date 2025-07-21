package defpackage;

import defpackage.nk5;

/* loaded from: classes3.dex */
public final class wy2 {
    public static final wy2 a = new wy2();

    private wy2() {
    }

    public final void a(lu3 lu3Var, oy2 oy2Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(oy2Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("first");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(oy2Var.e()));
        if (oy2Var.d() instanceof nk5.c) {
            lu3Var.name("after");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) oy2Var.d());
        }
    }
}
