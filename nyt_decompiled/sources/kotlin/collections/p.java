package kotlin.collections;

import defpackage.ku8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p extends o {
    public static boolean B(Collection collection, Iterable iterable) {
        zq3.h(collection, "<this>");
        zq3.h(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it2 = iterable.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.add(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    public static boolean C(Collection collection, Object[] objArr) {
        zq3.h(collection, "<this>");
        zq3.h(objArr, "elements");
        return collection.addAll(d.e(objArr));
    }

    public static final Collection D(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = i.X0(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean E(Iterable iterable, ss2 ss2Var, boolean z) {
        Iterator it2 = iterable.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            if (((Boolean) ss2Var.invoke(it2.next())).booleanValue() == z) {
                it2.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static final boolean F(List list, ss2 ss2Var, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            zq3.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return E(ku8.b(list), ss2Var, z);
        }
        int n = i.n(list);
        if (n >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) ss2Var.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == n) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int n2 = i.n(list);
        if (i > n2) {
            return true;
        }
        while (true) {
            list.remove(n2);
            if (n2 == i) {
                return true;
            }
            n2--;
        }
    }

    public static boolean G(Iterable iterable, ss2 ss2Var) {
        zq3.h(iterable, "<this>");
        zq3.h(ss2Var, "predicate");
        return E(iterable, ss2Var, true);
    }

    public static final boolean H(Collection collection, Iterable iterable) {
        zq3.h(collection, "<this>");
        zq3.h(iterable, "elements");
        return collection.removeAll(D(iterable));
    }

    public static boolean I(List list, ss2 ss2Var) {
        zq3.h(list, "<this>");
        zq3.h(ss2Var, "predicate");
        return F(list, ss2Var, true);
    }

    public static Object J(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object K(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object L(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(i.n(list));
    }

    public static Object M(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(i.n(list));
    }

    public static boolean N(Iterable iterable, ss2 ss2Var) {
        zq3.h(iterable, "<this>");
        zq3.h(ss2Var, "predicate");
        return E(iterable, ss2Var, false);
    }

    public static final boolean O(Collection collection, Iterable iterable) {
        zq3.h(collection, "<this>");
        zq3.h(iterable, "elements");
        return collection.retainAll(D(iterable));
    }
}
