package defpackage;

/* loaded from: classes3.dex */
public final class vx2 {
    public static final vx2 a = new vx2();

    private vx2() {
    }

    public final void a(lu3 lu3Var, nx2 nx2Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(nx2Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("listUri");
        j8.g.toJson(lu3Var, w41Var, nx2Var.f());
        lu3Var.name("count");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(nx2Var.d()));
        lu3Var.name("prop");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, nx2Var.h());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, nx2Var.e());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, nx2Var.g());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, nx2Var.i());
    }
}
