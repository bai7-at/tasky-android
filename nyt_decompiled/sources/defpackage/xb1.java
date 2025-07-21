package defpackage;

import com.datadog.android.api.context.NetworkInfo;
import com.datadog.opentracing.a;
import defpackage.cy7;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class xb1 implements kx0 {
    private final boolean a;
    private final f80 b;

    public xb1(boolean z, f80 f80Var) {
        zq3.h(f80Var, "bigIntegerUtils");
        this.a = z;
        this.b = f80Var;
    }

    private final cy7.e c(ua1 ua1Var, a aVar) {
        cy7.g gVar;
        cy7.a aVar2;
        cy7.h hVar;
        cy7.m mVar = null;
        if (this.a) {
            NetworkInfo f = ua1Var.f();
            cy7.i e = e(f);
            Long e2 = f.e();
            String l = e2 != null ? e2.toString() : null;
            Long d = f.d();
            String l2 = d != null ? d.toString() : null;
            Long f2 = f.f();
            gVar = new cy7.g(new cy7.b(e, l, l2, f2 != null ? f2.toString() : null, f.c().toString()));
        } else {
            gVar = null;
        }
        j09 l3 = ua1Var.l();
        f80 f80Var = this.b;
        BigInteger y = aVar.y();
        zq3.g(y, "event.traceId");
        String c = f80Var.c(y);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_dd.p.id", c);
        Map p = aVar.p();
        zq3.g(p, "event.meta");
        linkedHashMap.putAll(p);
        cy7.l lVar = new cy7.l(l3.d(), l3.e(), l3.c(), t.x(l3.b()));
        String j = ua1Var.j();
        Object obj = aVar.x().get("application_id");
        if (obj != null) {
            aVar2 = new cy7.a(obj instanceof String ? (String) obj : null);
        } else {
            aVar2 = null;
        }
        Object obj2 = aVar.x().get("session_id");
        if (obj2 != null) {
            hVar = new cy7.h(obj2 instanceof String ? (String) obj2 : null);
        } else {
            hVar = null;
        }
        Object obj3 = aVar.x().get("view.id");
        if (obj3 != null) {
            mVar = new cy7.m(obj3 instanceof String ? (String) obj3 : null);
        }
        return new cy7.e(ua1Var.n(), new cy7.d(j, aVar2, hVar, mVar), new cy7.j(), new cy7.k(ua1Var.g()), lVar, gVar, linkedHashMap);
    }

    private final cy7.f d(a aVar) {
        Long l = aVar.s().longValue() == 0 ? 1L : null;
        Map q = aVar.q();
        zq3.g(q, "event.metrics");
        return new cy7.f(l, q);
    }

    private final cy7.i e(NetworkInfo networkInfo) {
        if (networkInfo.a() == null && networkInfo.b() == null) {
            return null;
        }
        Long a = networkInfo.a();
        return new cy7.i(a != null ? a.toString() : null, networkInfo.b());
    }

    @Override // defpackage.kx0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public cy7 a(ua1 ua1Var, a aVar) {
        zq3.h(ua1Var, "datadogContext");
        zq3.h(aVar, "model");
        long b = ua1Var.k().b();
        cy7.f d = d(aVar);
        cy7.e c = c(ua1Var, aVar);
        f80 f80Var = this.b;
        BigInteger y = aVar.y();
        zq3.g(y, "model.traceId");
        String b2 = f80Var.b(y);
        BigInteger v = aVar.v();
        zq3.g(v, "model.spanId");
        String b3 = ab5.b(v);
        BigInteger s = aVar.s();
        zq3.g(s, "model.parentId");
        String b4 = ab5.b(s);
        String t = aVar.t();
        String r = aVar.r();
        String u = aVar.u();
        long n = aVar.n();
        long w = aVar.w() + b;
        Boolean z = aVar.z();
        zq3.g(z, "model.isError");
        long j = z.booleanValue() ? 1L : 0L;
        zq3.g(t, "resourceName");
        zq3.g(r, "operationName");
        zq3.g(u, "serviceName");
        return new cy7(b2, b3, b4, t, r, u, n, w, j, d, c);
    }

    public /* synthetic */ xb1(boolean z, f80 f80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? f80.a : f80Var);
    }
}
