package kotlin.collections;

import defpackage.zq3;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e0 extends d0 {
    public static Set k(Set set, Iterable iterable) {
        zq3.h(set, "<this>");
        zq3.h(iterable, "elements");
        Collection<?> D = p.D(iterable);
        if (D.isEmpty()) {
            return i.c1(set);
        }
        if (!(D instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(D);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!D.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set l(Set set, Object obj) {
        zq3.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.e(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && zq3.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set m(Set set, Iterable iterable) {
        int size;
        zq3.h(set, "<this>");
        zq3.h(iterable, "elements");
        Integer x = l.x(iterable);
        if (x != null) {
            size = set.size() + x.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.e(size));
        linkedHashSet.addAll(set);
        i.B(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set n(Set set, Object obj) {
        zq3.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
