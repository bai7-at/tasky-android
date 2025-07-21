package kotlin.collections;

import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class r extends q {
    public static List W(Iterable iterable, Class cls) {
        zq3.h(iterable, "<this>");
        zq3.h(cls, "klass");
        return (List) X(iterable, new ArrayList(), cls);
    }

    public static final Collection X(Iterable iterable, Collection collection, Class cls) {
        zq3.h(iterable, "<this>");
        zq3.h(collection, "destination");
        zq3.h(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static void Y(List list) {
        zq3.h(list, "<this>");
        Collections.reverse(list);
    }
}
