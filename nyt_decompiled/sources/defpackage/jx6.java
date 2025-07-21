package defpackage;

import type.adapter.UserInterestsInput_InputAdapter;

/* loaded from: classes3.dex */
public final class jx6 {
    public static final jx6 a = new jx6();

    private jx6() {
    }

    public final void a(lu3 lu3Var, gx6 gx6Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(gx6Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("input");
        j8.d(UserInterestsInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, gx6Var.d());
    }
}
