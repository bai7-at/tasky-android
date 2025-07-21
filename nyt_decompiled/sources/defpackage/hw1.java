package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class hw1 implements ak7, lw1 {
    private final ak7 a;
    private final int b;

    public static final class a implements Iterator, yu3 {
        private final Iterator a;
        private int b;

        a(hw1 hw1Var) {
            this.a = hw1Var.a.iterator();
            this.b = hw1Var.b;
        }

        private final void c() {
            while (this.b > 0 && this.a.hasNext()) {
                this.a.next();
                this.b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public hw1(ak7 ak7Var, int i) {
        zq3.h(ak7Var, "sequence");
        this.a = ak7Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.lw1
    public ak7 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new hw1(this, i) : new hw1(this.a, i2);
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a(this);
    }
}
