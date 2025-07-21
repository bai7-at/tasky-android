package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class dn2 {
    private final List a;
    private final boolean b;

    public dn2(cn2... cn2VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cn2VarArr.length > 0) {
            cn2 cn2Var = cn2VarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + i.u0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
            }
            i.B(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        if (arrayList2.size() > 0) {
            lh4.a(arrayList2.get(0));
            throw null;
        }
        this.b = false;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn2) && zq3.c(this.a, ((dn2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
