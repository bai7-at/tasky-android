package defpackage;

import type.adapter.UserInterestsInput_InputAdapter;

/* loaded from: classes3.dex */
public final class xw6 {
    public static final xw6 a = new xw6();

    private xw6() {
    }

    public final void a(lu3 lu3Var, uw6 uw6Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(uw6Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("input");
        j8.d(UserInterestsInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, uw6Var.d());
    }
}
