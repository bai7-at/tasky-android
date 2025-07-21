package defpackage;

import defpackage.nk5;
import type.adapter.UserIdentifier_InputAdapter;

/* loaded from: classes3.dex */
public final class j19 {
    public static final j19 a = new j19();

    private j19() {
    }

    public final void a(lu3 lu3Var, f19 f19Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(f19Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        if (f19Var.d() instanceof nk5.c) {
            lu3Var.name("identifier");
            j8.e(j8.b(j8.d(UserIdentifier_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) f19Var.d());
        }
    }
}
