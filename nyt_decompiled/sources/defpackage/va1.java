package defpackage;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.privacy.TrackingConsent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class va1 implements tx0 {
    private final CoreFeature a;

    public va1(CoreFeature coreFeature) {
        zq3.h(coreFeature, "coreFeature");
        this.a = coreFeature;
    }

    @Override // defpackage.tx0
    public Map a(String str) {
        Map v;
        zq3.h(str, "feature");
        Map map = (Map) this.a.v().get(str);
        return (map == null || (v = t.v(map)) == null) ? t.i() : v;
    }

    @Override // defpackage.tx0
    public void b(String str, Map map) {
        zq3.h(str, "feature");
        zq3.h(map, "context");
        this.a.v().put(str, map);
    }

    @Override // defpackage.tx0
    public ua1 getContext() {
        DatadogSite L = this.a.L();
        String q = this.a.q();
        String K = this.a.K();
        String u = this.a.u();
        String version = this.a.F().getVersion();
        String U = this.a.U();
        String J = this.a.J();
        String M = this.a.M();
        em8 P = this.a.P();
        long b = P.b();
        long a = P.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanos = timeUnit.toNanos(b);
        long nanos2 = timeUnit.toNanos(a);
        long j = a - b;
        wl8 wl8Var = new wl8(nanos, nanos2, timeUnit.toNanos(j), j);
        p36 p36Var = new p36(this.a.Y());
        NetworkInfo c = this.a.C().c();
        jf l = this.a.l();
        String f = l.f();
        String d = l.d();
        DeviceType c2 = l.c();
        gp1 gp1Var = new gp1(f, d, l.b(), c2, l.a(), l.g(), l.e(), l.getOsVersion(), l.getArchitecture());
        j09 userInfo = this.a.T().getUserInfo();
        TrackingConsent c3 = this.a.Q().c();
        String m = this.a.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.v().entrySet()) {
            linkedHashMap.put((String) entry.getKey(), t.v((Map) entry.getValue()));
        }
        return new ua1(L, q, K, u, version, U, M, J, wl8Var, p36Var, c, gp1Var, userInfo, c3, m, linkedHashMap);
    }
}
