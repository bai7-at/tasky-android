package defpackage;

import type.adapter.SetUserInterestsInput_InputAdapter;

/* loaded from: classes3.dex */
public final class dm7 {
    public static final dm7 a = new dm7();

    private dm7() {
    }

    public final void a(lu3 lu3Var, am7 am7Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(am7Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("input");
        j8.d(SetUserInterestsInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, am7Var.d());
    }
}
