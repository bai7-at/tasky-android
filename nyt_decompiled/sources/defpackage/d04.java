package defpackage;

/* loaded from: classes3.dex */
public class d04 implements q76 {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile q76 b;

    public d04(q76 q76Var) {
        this.b = q76Var;
    }

    @Override // defpackage.q76
    public Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
