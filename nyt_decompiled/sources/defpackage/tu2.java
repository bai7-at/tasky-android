package defpackage;

/* loaded from: classes3.dex */
public final class tu2 {
    public static final tu2 a = new tu2();

    private tu2() {
    }

    public final void a(lu3 lu3Var, bu2 bu2Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(bu2Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("prop");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, bu2Var.f());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, bu2Var.d());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, bu2Var.e());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, bu2Var.g());
    }
}
