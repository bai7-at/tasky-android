package com.google.common.collect;

import defpackage.b16;
import defpackage.i16;
import defpackage.ml2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class j {

    class a extends ml2 {
        final /* synthetic */ Iterable b;
        final /* synthetic */ i16 c;

        a(Iterable iterable, i16 i16Var) {
            this.b = iterable;
            this.c = i16Var;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.i(this.b.iterator(), this.c);
        }
    }

    public static boolean a(Iterable iterable, i16 i16Var) {
        return Iterators.b(iterable.iterator(), i16Var);
    }

    private static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : k.i(iterable.iterator());
    }

    public static Iterable c(Iterable iterable, i16 i16Var) {
        b16.k(iterable);
        b16.k(i16Var);
        return new a(iterable, i16Var);
    }

    public static Object d(Iterable iterable, Object obj) {
        return Iterators.m(iterable.iterator(), obj);
    }

    public static Object e(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return Iterators.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return g(list);
    }

    public static Object f(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return g(k.a(iterable));
            }
        }
        return Iterators.l(iterable.iterator(), obj);
    }

    private static Object g(List list) {
        return list.get(list.size() - 1);
    }

    public static boolean h(Iterable iterable, i16 i16Var) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (i16) b16.k(i16Var)) : Iterators.q(iterable.iterator(), i16Var);
    }

    private static boolean i(List list, i16 i16Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!i16Var.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, i16Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, i16Var, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static void j(List list, i16 i16Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (i16Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }

    public static String l(Iterable iterable) {
        return Iterators.s(iterable.iterator());
    }
}
