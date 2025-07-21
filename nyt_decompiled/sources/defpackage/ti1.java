package defpackage;

import com.datadog.opentracing.a;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class ti1 {
    public static final void a(tx7 tx7Var, Map map) {
        zq3.h(tx7Var, "<this>");
        zq3.h(map, "attributes");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                tx7Var.j(str, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                tx7Var.e(str, (String) value);
            } else if (value instanceof Number) {
                tx7Var.b(str, (Number) value);
            }
        }
    }

    public static final void b(tx7 tx7Var, Pair... pairArr) {
        zq3.h(tx7Var, "<this>");
        zq3.h(pairArr, "attributes");
        for (Pair pair : pairArr) {
            String str = (String) pair.a();
            Object b = pair.b();
            if (b instanceof Boolean) {
                tx7Var.j(str, ((Boolean) b).booleanValue());
            } else if (b instanceof String) {
                tx7Var.e(str, (String) b);
            } else if (b instanceof Number) {
                tx7Var.b(str, (Number) b);
            }
        }
    }

    public static final void c(tx7 tx7Var, String str) {
        zq3.h(tx7Var, "<this>");
        zq3.h(str, "resourceName");
        a aVar = tx7Var instanceof a ? (a) tx7Var : null;
        if (aVar != null) {
            aVar.h(str);
        }
    }
}
