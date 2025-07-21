package defpackage;

/* loaded from: classes.dex */
public final class s30 extends jv4 {
    private mv4 a;

    public s30(mv4 mv4Var) {
        super(null);
        this.a = mv4Var;
    }

    @Override // defpackage.jv4
    public boolean a(gv4 gv4Var) {
        return gv4Var == this.a.getKey();
    }

    @Override // defpackage.jv4
    public Object b(gv4 gv4Var) {
        if (gv4Var == this.a.getKey()) {
            return this.a.getValue();
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(mv4 mv4Var) {
        this.a = mv4Var;
    }
}
