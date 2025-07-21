package kotlin.collections;

import defpackage.ak7;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class y extends x {
    public static ak7 y(Map map) {
        zq3.h(map, "<this>");
        return i.Z(map.entrySet());
    }

    public static List z(Map map) {
        zq3.h(map, "<this>");
        if (map.size() == 0) {
            return i.l();
        }
        Iterator it2 = map.entrySet().iterator();
        if (!it2.hasNext()) {
            return i.l();
        }
        Map.Entry entry = (Map.Entry) it2.next();
        if (!it2.hasNext()) {
            return i.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it2.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it2.hasNext());
        return arrayList;
    }
}
