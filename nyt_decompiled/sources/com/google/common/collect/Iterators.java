package com.google.common.collect;

import defpackage.b16;
import defpackage.gx8;
import defpackage.hc5;
import defpackage.i16;
import defpackage.jx8;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class Iterators {

    private enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            e.c(false);
        }
    }

    class a extends AbstractIterator {
        final /* synthetic */ Iterator c;
        final /* synthetic */ i16 d;

        a(Iterator it2, i16 i16Var) {
            this.c = it2;
            this.d = i16Var;
        }

        @Override // com.google.common.collect.AbstractIterator
        protected Object b() {
            while (this.c.hasNext()) {
                Object next = this.c.next();
                if (this.d.apply(next)) {
                    return next;
                }
            }
            return c();
        }
    }

    class b extends gx8 {
        boolean a;
        final /* synthetic */ Object b;

        b(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.a) {
                throw new NoSuchElementException();
            }
            this.a = true;
            return this.b;
        }
    }

    private static final class c extends com.google.common.collect.a {
        static final jx8 e = new c(new Object[0], 0, 0, 0);
        private final Object[] c;
        private final int d;

        c(Object[] objArr, int i, int i2, int i3) {
            super(i2, i3);
            this.c = objArr;
            this.d = i;
        }

        @Override // com.google.common.collect.a
        protected Object b(int i) {
            return this.c[this.d + i];
        }
    }

    public static boolean a(Collection collection, Iterator it2) {
        b16.k(collection);
        b16.k(it2);
        boolean z = false;
        while (it2.hasNext()) {
            z |= collection.add(it2.next());
        }
        return z;
    }

    public static boolean b(Iterator it2, i16 i16Var) {
        return n(it2, i16Var) != -1;
    }

    static void c(Iterator it2) {
        b16.k(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public static boolean d(Iterator it2, Object obj) {
        if (obj == null) {
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it2.hasNext()) {
            if (obj.equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it2, Iterator it3) {
        while (it2.hasNext()) {
            if (!it3.hasNext() || !hc5.a(it2.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    static gx8 f() {
        return g();
    }

    static jx8 g() {
        return c.e;
    }

    static Iterator h() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static gx8 i(Iterator it2, i16 i16Var) {
        b16.k(it2);
        b16.k(i16Var);
        return new a(it2, i16Var);
    }

    public static Object j(Iterator it2, i16 i16Var) {
        b16.k(it2);
        b16.k(i16Var);
        while (it2.hasNext()) {
            Object next = it2.next();
            if (i16Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it2) {
        Object next;
        do {
            next = it2.next();
        } while (it2.hasNext());
        return next;
    }

    public static Object l(Iterator it2, Object obj) {
        return it2.hasNext() ? k(it2) : obj;
    }

    public static Object m(Iterator it2, Object obj) {
        return it2.hasNext() ? it2.next() : obj;
    }

    public static int n(Iterator it2, i16 i16Var) {
        b16.l(i16Var, "predicate");
        int i = 0;
        while (it2.hasNext()) {
            if (i16Var.apply(it2.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static Object o(Iterator it2) {
        if (!it2.hasNext()) {
            return null;
        }
        Object next = it2.next();
        it2.remove();
        return next;
    }

    public static boolean p(Iterator it2, Collection collection) {
        b16.k(collection);
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean q(Iterator it2, i16 i16Var) {
        b16.k(i16Var);
        boolean z = false;
        while (it2.hasNext()) {
            if (i16Var.apply(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static gx8 r(Object obj) {
        return new b(obj);
    }

    public static String s(Iterator it2) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it2.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it2.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
