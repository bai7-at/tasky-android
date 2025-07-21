package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
public abstract class gv {
    private static boolean c(Iterable iterable, Predicate predicate) {
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!predicate.test(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static Object d(Object obj, int i) {
        if (i == Integer.MAX_VALUE) {
            return obj;
        }
        if (!(obj instanceof List)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            String str = (String) obj;
            return str.length() < i ? obj : str.substring(0, i);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(d(it2.next(), i));
        }
        return arrayList;
    }

    public static hv e(hv hvVar, int i, final int i2) {
        if ((hvVar.isEmpty() || hvVar.size() <= i) && (i2 == Integer.MAX_VALUE || c(hvVar.c().values(), new Predicate() { // from class: ev
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean g;
                g = gv.g(i2, obj);
                return g;
            }
        }))) {
            return hvVar;
        }
        iv b = hv.b();
        int i3 = 0;
        for (Map.Entry entry : hvVar.c().entrySet()) {
            if (i3 >= i) {
                break;
            }
            b.d((dv) entry.getKey(), d(entry.getValue(), i2));
            i3++;
        }
        return b.build();
    }

    private static boolean f(Object obj, final int i) {
        return obj instanceof List ? c((List) obj, new Predicate() { // from class: fv
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                boolean h;
                h = gv.h(i, obj2);
                return h;
            }
        }) : !(obj instanceof String) || ((String) obj).length() < i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(int i, Object obj) {
        return f(obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(int i, Object obj) {
        return f(obj, i);
    }
}
