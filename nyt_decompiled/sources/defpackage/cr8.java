package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class cr8 implements ak7 {
    private final ak7 a;
    private final ss2 b;

    public static final class a implements Iterator, yu3 {
        private final Iterator a;

        a() {
            this.a = cr8.this.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return cr8.this.b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cr8(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "sequence");
        zq3.h(ss2Var, "transformer");
        this.a = ak7Var;
        this.b = ss2Var;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a();
    }
}
