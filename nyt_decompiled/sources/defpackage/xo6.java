package defpackage;

import com.datadog.opentracing.a;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class xo6 implements z77, y26 {
    private volatile Map a;

    public xo6() {
        this(Double.valueOf(1.0d));
    }

    private zo6 d(double d) {
        if (d < 0.0d || d > 1.0d) {
            d = 1.0d;
        }
        return new qn1(d);
    }

    private static String e(a aVar) {
        return aVar.x().get("env") == null ? "" : String.valueOf(aVar.x().get("env"));
    }

    @Override // defpackage.y26
    public void a(a aVar) {
        String str = "service:" + aVar.u() + ",env:" + e(aVar);
        Map map = this.a;
        zo6 zo6Var = (zo6) this.a.get(str);
        if (zo6Var == null) {
            zo6Var = (zo6) map.get("service:,env:");
        }
        if (zo6Var.b(aVar) ? aVar.f().v(1) : aVar.f().v(0)) {
            aVar.f().s("_dd.agent_psr", Double.valueOf(zo6Var.c()));
        }
    }

    @Override // defpackage.z77
    public boolean b(a aVar) {
        return true;
    }

    public xo6(Double d) {
        this.a = Collections.singletonMap("service:,env:", d(d.doubleValue()));
    }
}
