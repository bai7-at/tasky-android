package defpackage;

/* loaded from: classes4.dex */
public final class iz4 {
    public static final iz4 a = new iz4();

    private iz4() {
    }

    public final void a(lu3 lu3Var, fz4 fz4Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(fz4Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("input");
        j8.d(yg8.a, false, 1, null).toJson(lu3Var, w41Var, fz4Var.d());
    }
}
