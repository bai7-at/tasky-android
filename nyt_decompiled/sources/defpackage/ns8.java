package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class ns8 implements Iterator, yu3 {
    private final ss2 a;
    private final List b = new ArrayList();
    private Iterator c;

    public ns8(Iterator it2, ss2 ss2Var) {
        this.a = ss2Var;
        this.c = it2;
    }

    private final void c(Object obj) {
        Iterator it2 = (Iterator) this.a.invoke(obj);
        if (it2 != null && it2.hasNext()) {
            this.b.add(this.c);
            this.c = it2;
        } else {
            while (!this.c.hasNext() && !this.b.isEmpty()) {
                this.c = (Iterator) i.w0(this.b);
                i.L(this.b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.c.next();
        c(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
