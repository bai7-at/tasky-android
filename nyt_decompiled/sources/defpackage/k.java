package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class k {
    public static final void a(lu3 lu3Var, Object obj) {
        zq3.h(lu3Var, "<this>");
        if (obj == null) {
            lu3Var.p1();
            return;
        }
        if (obj instanceof Map) {
            lu3Var.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                lu3Var.name(String.valueOf(key));
                a(lu3Var, value);
            }
            lu3Var.endObject();
            ww8 ww8Var = ww8.a;
            return;
        }
        if (obj instanceof List) {
            lu3Var.beginArray();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                a(lu3Var, it2.next());
            }
            lu3Var.endArray();
            ww8 ww8Var2 = ww8.a;
            return;
        }
        if (obj instanceof Boolean) {
            lu3Var.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            lu3Var.D(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            lu3Var.value(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            lu3Var.value(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof zt3) {
            lu3Var.z0((zt3) obj);
            return;
        }
        if (obj instanceof String) {
            lu3Var.value((String) obj);
            return;
        }
        throw new IllegalStateException(("Cannot write " + obj + " of class '" + zt6.b(obj.getClass()) + "' to Json").toString());
    }
}
