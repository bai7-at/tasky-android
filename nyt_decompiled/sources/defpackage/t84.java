package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface t84 extends Closeable {
    static t84 c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add((t84) it2.next());
        }
        return arrayList.isEmpty() ? i85.a() : arrayList.size() == 1 ? (t84) arrayList.get(0) : ix4.a(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    gq0 export(Collection collection);

    gq0 shutdown();
}
