package defpackage;

import defpackage.nk5;
import type.adapter.ShareCodeOptions_InputAdapter;

/* loaded from: classes3.dex */
public final class p21 {
    public static final p21 a = new p21();

    private p21() {
    }

    public final void a(lu3 lu3Var, m21 m21Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(m21Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("url");
        j8.g.toJson(lu3Var, w41Var, m21Var.e());
        if (m21Var.d() instanceof nk5.c) {
            lu3Var.name("options");
            j8.e(j8.b(j8.d(ShareCodeOptions_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) m21Var.d());
        }
    }
}
