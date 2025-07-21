package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class rr5 implements Iterator, yu3 {
    private final pr5 a;

    public rr5(or5 or5Var) {
        vs8[] vs8VarArr = new vs8[8];
        for (int i = 0; i < 8; i++) {
            vs8VarArr[i] = new zs8(this);
        }
        this.a = new pr5(or5Var, vs8VarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.a.next();
    }

    public final void d(Object obj, Object obj2) {
        this.a.n(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.a.remove();
    }
}
