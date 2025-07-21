package com.google.android.gms.internal.ads;

import defpackage.tge;
import defpackage.uge;
import defpackage.uie;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class na {
    static int a(Set set) {
        Iterator it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static ma b(Set set, Set set2) {
        tge.c(set, "set1");
        tge.c(set2, "set2");
        return new ia(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set c(Set set, uge ugeVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof ja)) {
                set.getClass();
                return new ja(set, ugeVar);
            }
            ja jaVar = (ja) set;
            return new ja(jaVar.a, w7.a(jaVar.b, ugeVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof ja)) {
            sortedSet.getClass();
            return new ka(sortedSet, ugeVar);
        }
        ja jaVar2 = (ja) sortedSet;
        return new ka((SortedSet) jaVar2.a, w7.a(jaVar2.b, ugeVar));
    }

    static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof uie) {
            collection = ((uie) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return f(set, collection.iterator());
        }
        Iterator it2 = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    static boolean f(Set set, Iterator it2) {
        boolean z = false;
        while (it2.hasNext()) {
            z |= set.remove(it2.next());
        }
        return z;
    }
}
