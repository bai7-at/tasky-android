package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z0 implements ln {
    private final Object a;
    private final List b = new ArrayList();
    private Object c;

    public z0(Object obj) {
        this.a = obj;
        this.c = obj;
    }

    @Override // defpackage.ln
    public Object b() {
        return this.c;
    }

    @Override // defpackage.ln
    public final void clear() {
        this.b.clear();
        l(this.a);
        k();
    }

    @Override // defpackage.ln
    public void g(Object obj) {
        this.b.add(b());
        l(obj);
    }

    @Override // defpackage.ln
    public void i() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        l(this.b.remove(r0.size() - 1));
    }

    public final Object j() {
        return this.a;
    }

    protected abstract void k();

    protected void l(Object obj) {
        this.c = obj;
    }
}
