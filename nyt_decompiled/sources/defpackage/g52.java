package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import defpackage.e52;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class g52 implements yk8 {
    private final ET2Scope a;

    public g52(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    private final void g(Map map) {
        try {
            ET2Scope eT2Scope = this.a;
            e52.b bVar = new e52.b();
            Pair[] pairArr = (Pair[]) t.z(map).toArray(new Pair[0]);
            ET2PageScope.DefaultImpls.a(eT2Scope, bVar, null, new ue4((Pair[]) Arrays.copyOf(pairArr, pairArr.length)), null, 10, null);
        } catch (Exception e) {
            NYTLogger.i(e, "Failed to track AppPerformance event, metadata: " + t.v(map), new Object[0]);
        }
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
        g(map);
    }

    @Override // defpackage.yk8
    public void e(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        g(map);
    }

    @Override // defpackage.yk8
    public void f(PerformanceTracker.a aVar, Map map) {
        zq3.h(aVar, "event");
        zq3.h(map, "metadata");
        g(map);
    }
}
