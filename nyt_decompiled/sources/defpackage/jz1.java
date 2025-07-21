package defpackage;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import java.util.Map;

/* loaded from: classes4.dex */
public final class jz1 implements yk8 {
    private final String g(PerformanceTracker.a aVar) {
        String str = "PT: " + aVar.d();
        zq3.g(str, "toString(...)");
        return str;
    }

    @Override // defpackage.yk8
    public void a(PerformanceTracker.b bVar, Map map) {
        zq3.h(bVar, "token");
    }

    @Override // defpackage.yk8
    public void b(j32 j32Var) {
        zq3.h(j32Var, "event");
    }

    @Override // defpackage.yk8
    public void c(String str) {
        zq3.h(str, "message");
        Embrace.getInstance().addBreadcrumb(str);
    }

    @Override // defpackage.yk8
    public void d(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        Embrace.getInstance().logMessage(g(aVar), Severity.ERROR, map);
    }

    @Override // defpackage.yk8
    public void e(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        Embrace.getInstance().logMessage(g(aVar), Severity.WARNING, map);
    }

    @Override // defpackage.yk8
    public void f(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
    }
}
