package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class d8g {
    public static Object a(Iterable iterable, Object obj) {
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }
}
