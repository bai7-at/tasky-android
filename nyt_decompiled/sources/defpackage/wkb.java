package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class wkb {
    private final ArrayList a = new ArrayList();
    private long b;

    wkb() {
    }

    final long a() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            for (Map.Entry entry : ((t4f) it2.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.b = Math.max(this.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it2.remove();
        }
        return this.b;
    }

    final void b(t4f t4fVar) {
        this.a.add(t4fVar);
    }
}
