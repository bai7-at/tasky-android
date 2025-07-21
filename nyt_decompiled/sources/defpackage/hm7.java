package defpackage;

import defpackage.nk5;
import type.adapter.UserIdentifier_InputAdapter;
import type.adapter.UserStateInput_InputAdapter;

/* loaded from: classes3.dex */
public final class hm7 {
    public static final hm7 a = new hm7();

    private hm7() {
    }

    public final void a(lu3 lu3Var, em7 em7Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(em7Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("data");
        j8.d(UserStateInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, em7Var.d());
        if (em7Var.e() instanceof nk5.c) {
            lu3Var.name("identifier");
            j8.e(j8.b(j8.d(UserIdentifier_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) em7Var.e());
        }
    }
}
