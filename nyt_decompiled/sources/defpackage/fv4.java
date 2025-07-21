package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class fv4 {
    private final AtomicReference a = new AtomicReference();
    private final so b = new so();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        cx4 cx4Var = (cx4) this.a.getAndSet(null);
        if (cx4Var == null) {
            cx4Var = new cx4(cls, cls2, cls3);
        } else {
            cx4Var.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = (List) this.b.get(cx4Var);
        }
        this.a.set(cx4Var);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.b) {
            this.b.put(new cx4(cls, cls2, cls3), list);
        }
    }
}
