package defpackage;

/* loaded from: classes3.dex */
public final class cj {
    public static final cj a = new cj();

    private cj() {
    }

    public final void a(lu3 lu3Var, zi ziVar, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(ziVar, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("uris");
        h8 h8Var = j8.a;
        j8.a(h8Var).toJson(lu3Var, w41Var, ziVar.g());
        lu3Var.name("prop");
        h8Var.toJson(lu3Var, w41Var, ziVar.f());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, ziVar.d());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, ziVar.e());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, ziVar.h());
    }
}
