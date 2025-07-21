package kotlin.sequences;

import defpackage.ak7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class b implements ak7 {
    private final qs2 a;
    private final ss2 b;

    public static final class a implements Iterator, yu3 {
        private Object a;
        private int b = -2;

        a() {
        }

        private final void c() {
            Object invoke;
            if (this.b == -2) {
                invoke = b.this.a.mo865invoke();
            } else {
                ss2 ss2Var = b.this.b;
                Object obj = this.a;
                zq3.e(obj);
                invoke = ss2Var.invoke(obj);
            }
            this.a = invoke;
            this.b = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                c();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.b < 0) {
                c();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.a;
            zq3.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(qs2 qs2Var, ss2 ss2Var) {
        zq3.h(qs2Var, "getInitialValue");
        zq3.h(ss2Var, "getNextValue");
        this.a = qs2Var;
        this.b = ss2Var;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a();
    }
}
