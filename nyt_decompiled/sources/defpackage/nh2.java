package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class nh2 implements ak7 {
    private final ak7 a;
    private final boolean b;
    private final ss2 c;

    public static final class a implements Iterator, yu3 {
        private final Iterator a;
        private int b = -1;
        private Object c;

        a() {
            this.a = nh2.this.a.iterator();
        }

        private final void c() {
            while (this.a.hasNext()) {
                Object next = this.a.next();
                if (((Boolean) nh2.this.c.invoke(next)).booleanValue() == nh2.this.b) {
                    this.c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                c();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.b == -1) {
                c();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.c;
            this.c = null;
            this.b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nh2(ak7 ak7Var, boolean z, ss2 ss2Var) {
        zq3.h(ak7Var, "sequence");
        zq3.h(ss2Var, "predicate");
        this.a = ak7Var;
        this.b = z;
        this.c = ss2Var;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a();
    }
}
