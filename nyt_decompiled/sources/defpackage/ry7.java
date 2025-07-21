package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ry7 {

    public static final class a extends qm3 {
        private int a;
        final /* synthetic */ py7 b;

        a(py7 py7Var) {
            this.b = py7Var;
        }

        @Override // defpackage.qm3
        public int c() {
            py7 py7Var = this.b;
            int i = this.a;
            this.a = i + 1;
            return py7Var.h(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.m();
        }
    }

    public static final class b implements Iterator, yu3 {
        private int a;
        final /* synthetic */ py7 b;

        b(py7 py7Var) {
            this.b = py7Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.m();
        }

        @Override // java.util.Iterator
        public Object next() {
            py7 py7Var = this.b;
            int i = this.a;
            this.a = i + 1;
            return py7Var.n(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final qm3 a(py7 py7Var) {
        zq3.h(py7Var, "<this>");
        return new a(py7Var);
    }

    public static final Iterator b(py7 py7Var) {
        zq3.h(py7Var, "<this>");
        return new b(py7Var);
    }
}
