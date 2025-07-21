package defpackage;

import com.datadog.android.log.Logger;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ya1 implements yk8 {
    private final Logger a;

    public ya1(Logger logger) {
        zq3.h(logger, "dataDogLogger");
        this.a = logger;
    }

    @Override // defpackage.yk8
    public void a(PerformanceTracker.b bVar, Map map) {
        zq3.h(bVar, "token");
    }

    @Override // defpackage.yk8
    public void b(j32 j32Var) {
        zq3.h(j32Var, "eventConvertible");
    }

    @Override // defpackage.yk8
    public void c(String str) {
        zq3.h(str, "message");
    }

    @Override // defpackage.yk8
    public void d(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        this.a.d(aVar.d(), null, map);
    }

    @Override // defpackage.yk8
    public void e(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        this.a.j(aVar.d(), null, map);
    }

    @Override // defpackage.yk8
    public void f(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        this.a.e(aVar.d(), null, map);
    }
}
