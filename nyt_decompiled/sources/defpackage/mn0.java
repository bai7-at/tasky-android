package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class mn0 {
    static final long[] a = new long[0];
    private static final rm9 b = new a();

    static class a implements rm9 {
        a() {
        }

        @Override // defpackage.rm9
        public Object apply(Object obj) {
            return obj;
        }
    }

    public static List a(List... listArr) {
        if (listArr == null || listArr.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = new CopyOnWriteArrayList(listArr).iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            if (h(list)) {
                Iterator it3 = new CopyOnWriteArrayList(list).iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next());
                }
            }
        }
        return arrayList;
    }

    public static List b(List list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public static Map c(Map map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    public static List d(List list) {
        return f(list) ? new ArrayList() : list;
    }

    public static List e(Collection collection, rm9 rm9Var) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (((Boolean) rm9Var.apply(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean f(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean g(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean h(Collection collection) {
        return !f(collection);
    }

    public static boolean i(Object[] objArr) {
        return !g(objArr);
    }

    public static List j(List list) {
        return Collections.unmodifiableList(d(list));
    }
}
