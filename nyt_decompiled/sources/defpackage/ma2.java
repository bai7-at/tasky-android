package defpackage;

import defpackage.l77;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ma2 extends l77 {
    private final HashMap e = new HashMap();

    @Override // defpackage.l77
    protected l77.c c(Object obj) {
        return (l77.c) this.e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // defpackage.l77
    public Object j(Object obj, Object obj2) {
        l77.c c = c(obj);
        if (c != null) {
            return c.b;
        }
        this.e.put(obj, g(obj, obj2));
        return null;
    }

    @Override // defpackage.l77
    public Object k(Object obj) {
        Object k = super.k(obj);
        this.e.remove(obj);
        return k;
    }

    public Map.Entry n(Object obj) {
        if (contains(obj)) {
            return ((l77.c) this.e.get(obj)).d;
        }
        return null;
    }
}
