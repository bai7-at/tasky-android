package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface ey7 extends Closeable {
    static ey7 c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add((ey7) it2.next());
        }
        return arrayList.isEmpty() ? t85.a() : arrayList.size() == 1 ? (ey7) arrayList.get(0) : qx4.a(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    gq0 export(Collection collection);

    gq0 shutdown();
}
