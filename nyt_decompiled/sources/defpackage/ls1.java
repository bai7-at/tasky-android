package defpackage;

/* loaded from: classes.dex */
final class ls1 implements ov6 {
    private final ss2 a;
    private ms1 b;

    public ls1(ss2 ss2Var) {
        this.a = ss2Var;
    }

    @Override // defpackage.ov6
    public void c() {
        ns1 ns1Var;
        ss2 ss2Var = this.a;
        ns1Var = py1.a;
        this.b = (ms1) ss2Var.invoke(ns1Var);
    }

    @Override // defpackage.ov6
    public void d() {
    }

    @Override // defpackage.ov6
    public void e() {
        ms1 ms1Var = this.b;
        if (ms1Var != null) {
            ms1Var.dispose();
        }
        this.b = null;
    }
}
