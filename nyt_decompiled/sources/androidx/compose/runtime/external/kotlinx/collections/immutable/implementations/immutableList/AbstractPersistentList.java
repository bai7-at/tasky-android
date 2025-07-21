package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.cs5;
import defpackage.mh3;
import defpackage.ss2;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class AbstractPersistentList extends kotlin.collections.a implements cs5 {
    @Override // java.util.Collection, java.util.List, defpackage.cs5
    public cs5 addAll(Collection collection) {
        cs5.a b = b();
        b.addAll(collection);
        return b.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, defpackage.cs5
    public cs5 remove(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf != -1 ? P(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, defpackage.cs5
    public cs5 removeAll(final Collection collection) {
        return e1(new ss2() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // kotlin.collections.a, java.util.List
    public mh3 subList(int i, int i2) {
        return super.subList(i, i2);
    }
}
