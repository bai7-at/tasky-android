package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class c8g {
    final TreeMap a = new TreeMap();
    final TreeMap b = new TreeMap();

    private static final int c(xhe xheVar, a9a a9aVar, caa caaVar) {
        caa b = a9aVar.b(xheVar, Collections.singletonList(caaVar));
        if (b instanceof q0a) {
            return s0f.b(b.zzh().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i, a9a a9aVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), a9aVar);
    }

    public final void b(xhe xheVar, vs9 vs9Var) {
        tcf tcfVar = new tcf(vs9Var);
        for (Integer num : this.a.keySet()) {
            vq9 clone = vs9Var.b().clone();
            int c = c(xheVar, (a9a) this.a.get(num), tcfVar);
            if (c == 2 || c == -1) {
                vs9Var.f(clone);
            }
        }
        Iterator it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            c(xheVar, (a9a) this.b.get((Integer) it2.next()), tcfVar);
        }
    }
}
