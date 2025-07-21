package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class ao1 {
    public static final List a(Iterable iterable, boolean z) {
        zq3.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(i.w(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            arrayList.add(new zn1((String) pair.b(), (String) pair.a(), null, z, 4, null));
        }
        return arrayList;
    }

    public static final List b(List list, boolean z) {
        zq3.h(list, "<this>");
        List list2 = list;
        return a(i.h1(list2, list2), z);
    }

    public static /* synthetic */ List c(List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return b(list, z);
    }
}
