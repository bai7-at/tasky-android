package defpackage;

import type.DateTime;

/* loaded from: classes3.dex */
public final class x70 {
    public static final x70 a = new x70();

    private x70() {
    }

    public final void a(lu3 lu3Var, q70 q70Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(q70Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("date");
        w41Var.h(DateTime.Companion.getType()).toJson(lu3Var, w41Var, q70Var.d());
    }
}
