package defpackage;

/* loaded from: classes3.dex */
public final class zf7 {
    public static final zf7 a = new zf7();

    private zf7() {
    }

    public final void a(lu3 lu3Var, rf7 rf7Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(rf7Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, rf7Var.f());
        lu3Var.name("count");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(rf7Var.d()));
        lu3Var.name("prop");
        h8Var.toJson(lu3Var, w41Var, rf7Var.h());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, rf7Var.e());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, rf7Var.g());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, rf7Var.i());
    }
}
