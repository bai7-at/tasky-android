package defpackage;

/* loaded from: classes3.dex */
public final class ow6 {
    public static final ow6 a = new ow6();

    private ow6() {
    }

    public final void a(lu3 lu3Var, kw6 kw6Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(kw6Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("url");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, kw6Var.e());
        lu3Var.name("clientMutationId");
        h8Var.toJson(lu3Var, w41Var, kw6Var.d());
    }
}
