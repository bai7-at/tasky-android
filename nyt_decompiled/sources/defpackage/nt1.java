package defpackage;

/* loaded from: classes4.dex */
public final class nt1 implements p76, b04 {
    private static final Object c = new Object();
    private volatile p76 a;
    private volatile Object b = c;

    private nt1(p76 p76Var) {
        this.a = p76Var;
    }

    public static b04 a(p76 p76Var) {
        return p76Var instanceof b04 ? (b04) p76Var : new nt1((p76) g16.b(p76Var));
    }

    public static p76 b(p76 p76Var) {
        g16.b(p76Var);
        return p76Var instanceof nt1 ? p76Var : new nt1(p76Var);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // defpackage.p76
    public Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
                        this.b = c(this.b, obj);
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
