package defpackage;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public class ue4 {
    private final Map a;

    public ue4(Pair... pairArr) {
        zq3.h(pairArr, "pairs");
        Map m = t.m((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(m.size()));
        for (Map.Entry entry : m.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof ue4) {
                value = ((ue4) value).a;
            }
            linkedHashMap.put(key, value);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object value2 = entry2.getValue();
            if (value2 != null) {
                Map map = value2 instanceof Map ? (Map) value2 : null;
                if (map == null || !map.isEmpty()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        this.a = linkedHashMap2;
    }

    private final Map b(Map map, Map map2) {
        Set<String> q0 = i.q0(map.keySet(), map2.keySet());
        ArrayList arrayList = new ArrayList(i.w(q0, 10));
        for (String str : q0) {
            Object j = t.j(map, str);
            Object j2 = t.j(map2, str);
            if ((j instanceof Map) && (j2 instanceof Map)) {
                j2 = b((Map) j, (Map) j2);
            }
            arrayList.add(du8.a(str, j2));
        }
        return t.p(t.p(map, map2), t.t(arrayList));
    }

    public final Map a() {
        return this.a;
    }

    public final Map c(ue4... ue4VarArr) {
        zq3.h(ue4VarArr, ParamProviderKt.PARAM_OVERRIDES);
        List Y = d.Y(ue4VarArr);
        ArrayList arrayList = new ArrayList(i.w(Y, 10));
        Iterator it2 = Y.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ue4) it2.next()).a);
        }
        Map map = this.a;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            map = b(map, (Map) it3.next());
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type com.nytimes.android.eventtracker.model.Mappable");
        return zq3.c(this.a, ((ue4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ue4(defpackage.ue4 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mappable"
            defpackage.zq3.h(r5, r0)
            java.util.Map r5 = r5.a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L18
        L35:
            r5 = 0
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            kotlin.Pair[] r5 = (kotlin.Pair[]) r5
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            kotlin.Pair[] r5 = (kotlin.Pair[]) r5
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue4.<init>(ue4):void");
    }
}
