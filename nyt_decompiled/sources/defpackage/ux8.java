package defpackage;

/* loaded from: classes4.dex */
public final class ux8 {
    public static final ux8 a = new ux8();

    private ux8() {
    }

    public final void a(lu3 lu3Var, rx8 rx8Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(rx8Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("source");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, rx8Var.f());
        lu3Var.name("preference");
        h8Var.toJson(lu3Var, w41Var, rx8Var.e());
        lu3Var.name("value");
        t09.a.toJson(lu3Var, w41Var, rx8Var.g());
        lu3Var.name("initialUIState");
        h8Var.toJson(lu3Var, w41Var, rx8Var.d());
    }
}
