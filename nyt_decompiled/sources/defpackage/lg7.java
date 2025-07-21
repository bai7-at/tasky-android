package defpackage;

import type.adapter.MostPopularType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class lg7 {
    public static final lg7 a = new lg7();

    private lg7() {
    }

    public final void a(lu3 lu3Var, fg7 fg7Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(fg7Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("popularType");
        MostPopularType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, fg7Var.f());
        lu3Var.name("prop");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, fg7Var.g());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, fg7Var.d());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, fg7Var.e());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, fg7Var.h());
    }
}
