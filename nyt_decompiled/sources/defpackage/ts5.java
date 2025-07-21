package defpackage;

/* loaded from: classes3.dex */
public final class ts5 {
    public static final ts5 a = new ts5();

    private ts5() {
    }

    public final void a(lu3 lu3Var, ls5 ls5Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(ls5Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("listUri");
        j8.g.toJson(lu3Var, w41Var, ls5Var.f());
        lu3Var.name("count");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(ls5Var.d()));
        lu3Var.name("prop");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, ls5Var.h());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, ls5Var.e());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, ls5Var.g());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, ls5Var.i());
    }
}
