package defpackage;

/* loaded from: classes5.dex */
public abstract class tt3 {
    public static final at3 a(at3 at3Var, ss2 ss2Var) {
        zq3.h(at3Var, "from");
        zq3.h(ss2Var, "builderAction");
        dt3 dt3Var = new dt3(at3Var);
        ss2Var.invoke(dt3Var);
        return new rt3(dt3Var.a(), dt3Var.b());
    }

    public static /* synthetic */ at3 b(at3 at3Var, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            at3Var = at3.d;
        }
        return a(at3Var, ss2Var);
    }
}
