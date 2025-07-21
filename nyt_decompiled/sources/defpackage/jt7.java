package defpackage;

/* loaded from: classes4.dex */
public final class jt7 implements p76 {
    private static final Object c = new Object();
    private volatile p76 a;
    private volatile Object b = c;

    private jt7(p76 p76Var) {
        this.a = p76Var;
    }

    public static p76 a(p76 p76Var) {
        return ((p76Var instanceof jt7) || (p76Var instanceof nt1)) ? p76Var : new jt7((p76) g16.b(p76Var));
    }

    @Override // defpackage.p76
    public Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        p76 p76Var = this.a;
        if (p76Var == null) {
            return this.b;
        }
        Object obj2 = p76Var.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
