package defpackage;

/* loaded from: classes3.dex */
public final class yi {
    public static final yi a = new yi();

    private yi() {
    }

    public final void a(lu3 lu3Var, vi viVar, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(viVar, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, viVar.g());
        lu3Var.name("prop");
        h8Var.toJson(lu3Var, w41Var, viVar.f());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, viVar.d());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, viVar.e());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, viVar.h());
    }
}
