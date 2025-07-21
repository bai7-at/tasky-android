package defpackage;

import type.adapter.UserInterestsInput_InputAdapter;

/* loaded from: classes3.dex */
public final class c9 {
    public static final c9 a = new c9();

    private c9() {
    }

    public final void a(lu3 lu3Var, z8 z8Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(z8Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("input");
        j8.d(UserInterestsInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, z8Var.d());
    }
}
