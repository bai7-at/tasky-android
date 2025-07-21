package defpackage;

import type.adapter.OnsiteMessagingInput_InputAdapter;

/* loaded from: classes3.dex */
public final class ai5 {
    public static final ai5 a = new ai5();

    private ai5() {
    }

    public final void a(lu3 lu3Var, uh5 uh5Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(uh5Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("data");
        j8.d(OnsiteMessagingInput_InputAdapter.INSTANCE, false, 1, null).toJson(lu3Var, w41Var, uh5Var.d());
    }
}
