package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
final class s08 implements r08 {
    private final Map b = new LinkedHashMap();

    @Override // defpackage.r08
    public q08 c(ej9 ej9Var) {
        zq3.h(ej9Var, "id");
        return (q08) this.b.remove(ej9Var);
    }

    @Override // defpackage.r08
    public boolean e(ej9 ej9Var) {
        zq3.h(ej9Var, "id");
        return this.b.containsKey(ej9Var);
    }

    @Override // defpackage.r08
    public q08 f(ej9 ej9Var) {
        zq3.h(ej9Var, "id");
        Map map = this.b;
        Object obj = map.get(ej9Var);
        if (obj == null) {
            obj = new q08(ej9Var);
            map.put(ej9Var, obj);
        }
        return (q08) obj;
    }

    @Override // defpackage.r08
    public List remove(String str) {
        zq3.h(str, "workSpecId");
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (zq3.c(((ej9) entry.getKey()).b(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (it2.hasNext()) {
            this.b.remove((ej9) it2.next());
        }
        return i.X0(linkedHashMap.values());
    }
}
