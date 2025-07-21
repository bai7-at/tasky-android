package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class dw2 {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public final List a(String str) {
        zq3.h(str, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((cw2) ((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    public final void b(String str, List list) {
        zq3.h(str, "appId");
        zq3.h(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            cw2 cw2Var = (cw2) it2.next();
            concurrentHashMap.put(cw2Var.a(), cw2Var);
        }
        this.a.put(str, concurrentHashMap);
    }
}
