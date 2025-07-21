package defpackage;

/* loaded from: classes3.dex */
public final class y8 {
    public static final y8 a = new y8();

    private y8() {
    }

    public final void a(lu3 lu3Var, u8 u8Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(u8Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("url");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, u8Var.e());
        lu3Var.name("clientMutationId");
        h8Var.toJson(lu3Var, w41Var, u8Var.d());
    }
}
