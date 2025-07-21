package defpackage;

/* loaded from: classes3.dex */
public final class ae8 {
    public static final ae8 a = new ae8();

    private ae8() {
    }

    public final void a(lu3 lu3Var, sd8 sd8Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(sd8Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, sd8Var.e());
        lu3Var.name("first");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(sd8Var.d()));
    }
}
