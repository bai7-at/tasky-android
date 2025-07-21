package defpackage;

/* loaded from: classes4.dex */
public final class gb9 implements lp6 {
    private final qs2 a;
    private Object b;

    public gb9(Object obj, qs2 qs2Var) {
        zq3.h(qs2Var, "invalidator");
        this.a = qs2Var;
        this.b = obj;
    }

    @Override // defpackage.lp6
    public void a(Object obj, iv3 iv3Var, Object obj2) {
        zq3.h(iv3Var, "property");
        if (zq3.c(this.b, obj2)) {
            return;
        }
        this.b = obj2;
        this.a.mo865invoke();
    }

    @Override // defpackage.lp6, defpackage.hp6
    public Object getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        return this.b;
    }
}
