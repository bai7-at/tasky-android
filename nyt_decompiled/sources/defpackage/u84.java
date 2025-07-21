package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface u84 extends Closeable {
    static u84 c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add((u84) it2.next());
        }
        return arrayList.isEmpty() ? j85.a() : arrayList.size() == 1 ? (u84) arrayList.get(0) : jx4.a(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    default gq0 forceFlush() {
        return gq0.i();
    }

    void onEmit(hx0 hx0Var, kp6 kp6Var);

    default gq0 shutdown() {
        return forceFlush();
    }
}
