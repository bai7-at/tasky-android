package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class x33 {
    public static Map a(v33 v33Var) {
        zq3.h(v33Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = v33Var.b();
        while (b.hasNext()) {
            Object a = v33Var.a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = new Ref$IntRef();
            }
            Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
            ref$IntRef.element++;
            linkedHashMap.put(a, ref$IntRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            zq3.f(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            ku8.e(entry).setValue(Integer.valueOf(((Ref$IntRef) entry.getValue()).element));
        }
        return ku8.d(linkedHashMap);
    }
}
