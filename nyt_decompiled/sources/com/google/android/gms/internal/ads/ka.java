package com.google.android.gms.internal.ads;

import defpackage.uge;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes3.dex */
final class ka extends ja implements SortedSet {
    ka(SortedSet sortedSet, uge ugeVar) {
        super(sortedSet, ugeVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it2 = this.a.iterator();
        it2.getClass();
        uge ugeVar = this.b;
        ugeVar.getClass();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (ugeVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new ka(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            uge ugeVar = this.b;
            Object last = sortedSet.last();
            if (ugeVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ka(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new ka(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
