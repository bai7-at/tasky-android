package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface iy7 extends Closeable {
    static iy7 c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add((iy7) it2.next());
        }
        return arrayList.isEmpty() ? v85.a() : arrayList.size() == 1 ? (iy7) arrayList.get(0) : rx4.a(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    default gq0 forceFlush() {
        return gq0.i();
    }

    boolean isEndRequired();

    boolean isStartRequired();

    void onEnd(np6 np6Var);

    void onStart(hx0 hx0Var, mp6 mp6Var);

    default gq0 shutdown() {
        return forceFlush();
    }
}
