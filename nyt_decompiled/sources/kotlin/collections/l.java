package kotlin.collections;

import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class l extends k {
    public static int w(Iterable iterable, int i) {
        zq3.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final Integer x(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List y(Iterable iterable) {
        zq3.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, (Iterable) it2.next());
        }
        return arrayList;
    }
}
