package defpackage;

import defpackage.nk5;

/* loaded from: classes3.dex */
public final class go2 {
    public static final go2 a = new go2();

    private go2() {
    }

    public final void a(lu3 lu3Var, tn2 tn2Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(tn2Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        if (tn2Var.d() instanceof nk5.c) {
            lu3Var.name("itemsToFetch");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) tn2Var.d());
        }
    }
}
