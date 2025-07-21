package defpackage;

import com.nytimes.android.coroutinesutils.b;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import io.embrace.android.embracesdk.Embrace;
import io.opentracing.util.GlobalTracer;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class si1 implements b {
    private final String a;
    private final String b;
    private final tx7 c;
    private final Map d;
    private tx7 e;
    private yb7 f;

    public static final class a {
        private final AppEventFactory a;

        public a(AppEventFactory appEventFactory) {
            zq3.h(appEventFactory, "appEventFactory");
            this.a = appEventFactory;
        }

        public static /* synthetic */ si1 b(a aVar, String str, String str2, tx7 tx7Var, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                tx7Var = null;
            }
            return aVar.a(str, str2, tx7Var);
        }

        public final si1 a(String str, String str2, tx7 tx7Var) {
            zq3.h(str, "resourceName");
            return new si1(str, str2, tx7Var, this.a.b());
        }
    }

    protected si1(String str, String str2, tx7 tx7Var, Map map) {
        zq3.h(str, "resourceName");
        zq3.h(map, "defaultAttributes");
        this.a = str;
        this.b = str2;
        this.c = tx7Var;
        this.d = map;
    }

    private final String e() {
        String r;
        tx7 tx7Var = this.c;
        com.datadog.opentracing.a aVar = tx7Var instanceof com.datadog.opentracing.a ? (com.datadog.opentracing.a) tx7Var : null;
        if (aVar != null && (r = aVar.r()) != null) {
            return r;
        }
        tx7 f = f();
        com.datadog.opentracing.a aVar2 = f instanceof com.datadog.opentracing.a ? (com.datadog.opentracing.a) f : null;
        if (aVar2 != null) {
            return aVar2.r();
        }
        return null;
    }

    private final tx7 f() {
        return GlobalTracer.a().n();
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void a() {
        Embrace.getInstance().endMoment(this.a);
        tx7 tx7Var = this.e;
        if (tx7Var != null) {
            tx7Var.a();
        }
        yb7 yb7Var = this.f;
        if (yb7Var != null) {
            yb7Var.close();
        }
        this.e = null;
        this.f = null;
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void b(boolean z, Pair... pairArr) {
        zq3.h(pairArr, "attributes");
        Embrace.getInstance().startMoment(this.a);
        hp8 a2 = GlobalTracer.a();
        tx7 start = a2.I(h()).a(this.c).start();
        zq3.e(start);
        ti1.c(start, this.a);
        ti1.a(start, this.d);
        ti1.b(start, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        this.e = start;
        this.f = z ? a2.k1(start) : null;
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public b c(String str) {
        zq3.h(str, "resourceName");
        return new si1(str, null, this.e, this.d, 2, null);
    }

    public void d(Pair... pairArr) {
        zq3.h(pairArr, "attributes");
        tx7 tx7Var = this.e;
        if (tx7Var != null) {
            ti1.b(tx7Var, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void error(Throwable th) {
        zq3.h(th, "throwable");
        tx7 tx7Var = this.e;
        if (tx7Var != null) {
            com.datadog.android.trace.a.b(tx7Var, th);
        }
        a();
    }

    protected final tx7 g() {
        return this.e;
    }

    protected final String h() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String e = e();
        return e == null ? this.a : e;
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void error(String str) {
        zq3.h(str, "message");
        tx7 tx7Var = this.e;
        if (tx7Var != null) {
            com.datadog.android.trace.a.a(tx7Var, str);
        }
        a();
    }

    public /* synthetic */ si1(String str, String str2, tx7 tx7Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : tx7Var, (i & 8) != 0 ? t.i() : map);
    }
}
