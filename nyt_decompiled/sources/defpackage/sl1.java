package defpackage;

/* loaded from: classes4.dex */
public final class sl1 implements ba2 {
    private p76 a;

    public static void a(p76 p76Var, p76 p76Var2) {
        g16.b(p76Var2);
        sl1 sl1Var = (sl1) p76Var;
        if (sl1Var.a != null) {
            throw new IllegalStateException();
        }
        sl1Var.a = p76Var2;
    }

    @Override // defpackage.p76
    public Object get() {
        p76 p76Var = this.a;
        if (p76Var != null) {
            return p76Var.get();
        }
        throw new IllegalStateException();
    }
}
