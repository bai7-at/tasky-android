package defpackage;

/* loaded from: classes2.dex */
public final class ot1 implements p76 {
    private static final Object c = new Object();
    private volatile p76 a;
    private volatile Object b = c;

    private ot1(p76 p76Var) {
        this.a = p76Var;
    }

    public static p76 a(p76 p76Var) {
        a16.b(p76Var);
        return p76Var instanceof ot1 ? p76Var : new ot1(p76Var);
    }

    public static Object b(Object obj, Object obj2) {
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
                        this.b = b(this.b, obj);
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
