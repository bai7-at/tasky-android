package defpackage;

import type.adapter.NewsletterProductsInput_InputAdapter;

/* loaded from: classes3.dex */
public final class t8 {
    public static final t8 a = new t8();

    private t8() {
    }

    public final void a(lu3 lu3Var, q8 q8Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(q8Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("newsletters");
        j8.a(j8.d(NewsletterProductsInput_InputAdapter.INSTANCE, false, 1, null)).toJson(lu3Var, w41Var, q8Var.d());
    }
}
