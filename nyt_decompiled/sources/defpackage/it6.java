package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class it6 {
    private static final Object a = new Object();
    private static final Object b = new Object();

    public static final Object a(Map map, Object obj) {
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object J = i.J(list);
        if (!list.isEmpty()) {
            return J;
        }
        map.remove(obj);
        return J;
    }
}
