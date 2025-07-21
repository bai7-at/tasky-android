package defpackage;

import com.google.android.gms.internal.measurement.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class k6f {
    public static caa a(m1 m1Var) {
        if (m1Var == null) {
            return caa.T;
        }
        int A = m1Var.A() - 1;
        if (A == 1) {
            return m1Var.z() ? new eda(m1Var.u()) : caa.d0;
        }
        if (A == 2) {
            return m1Var.y() ? new q0a(Double.valueOf(m1Var.r())) : new q0a(null);
        }
        if (A == 3) {
            return m1Var.x() ? new bz9(Boolean.valueOf(m1Var.w())) : new bz9(null);
        }
        if (A != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List v = m1Var.v();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = v.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((m1) it2.next()));
        }
        return new waa(m1Var.t(), arrayList);
    }

    public static caa b(Object obj) {
        if (obj == null) {
            return caa.U;
        }
        if (obj instanceof String) {
            return new eda((String) obj);
        }
        if (obj instanceof Double) {
            return new q0a((Double) obj);
        }
        if (obj instanceof Long) {
            return new q0a(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new q0a(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new bz9((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            qx9 qx9Var = new qx9();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                qx9Var.t(qx9Var.e(), b(it2.next()));
            }
            return qx9Var;
        }
        m6a m6aVar = new m6a();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            caa b = b(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                m6aVar.Y((String) obj2, b);
            }
        }
        return m6aVar;
    }
}
