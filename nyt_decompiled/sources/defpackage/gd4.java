package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class gd4 {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public gd4(long j) {
        this.b = j;
        this.c = j;
    }

    private void e() {
        l(this.c);
    }

    public void clearMemory() {
        l(0L);
    }

    public synchronized Object f(Object obj) {
        return this.a.get(obj);
    }

    public synchronized long g() {
        return this.c;
    }

    protected int h(Object obj) {
        return 1;
    }

    protected void i(Object obj, Object obj2) {
    }

    public synchronized Object j(Object obj, Object obj2) {
        long h = h(obj2);
        if (h >= this.c) {
            i(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += h;
        }
        Object put = this.a.put(obj, obj2);
        if (put != null) {
            this.d -= h(put);
            if (!put.equals(obj2)) {
                i(obj, put);
            }
        }
        e();
        return put;
    }

    public synchronized Object k(Object obj) {
        Object remove;
        remove = this.a.remove(obj);
        if (remove != null) {
            this.d -= h(remove);
        }
        return remove;
    }

    protected synchronized void l(long j) {
        while (this.d > j) {
            Iterator it2 = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it2.next();
            Object value = entry.getValue();
            this.d -= h(value);
            Object key = entry.getKey();
            it2.remove();
            i(key, value);
        }
    }
}
