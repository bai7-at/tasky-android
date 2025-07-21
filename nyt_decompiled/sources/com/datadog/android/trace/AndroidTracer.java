package com.datadog.android.trace;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.trace.internal.FeatureSdkCoreExtKt;
import com.datadog.android.trace.internal.TracingFeature;
import com.datadog.legacy.trace.api.Config;
import com.datadog.opentracing.b;
import defpackage.du8;
import defpackage.g84;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.ql9;
import defpackage.qs2;
import defpackage.tx7;
import defpackage.u75;
import defpackage.vc7;
import defpackage.wx7;
import defpackage.yx7;
import defpackage.zb7;
import defpackage.zq3;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AndroidTracer extends com.datadog.opentracing.b {
    public static final b B = new b(null);
    private final jb2 w;
    private final g84 x;
    private final boolean y;

    public static final class a implements zb7 {
        a() {
        }

        @Override // defpackage.zb7
        public void a() {
            FeatureSdkCoreExtKt.b(AndroidTracer.this.w);
        }

        @Override // defpackage.zb7
        public void b() {
            tx7 n = AndroidTracer.this.n();
            wx7 f = n != null ? n.f() : null;
            if (f != null) {
                String a = f.a();
                String a2 = yx7.a(f);
                jb2 jb2Var = AndroidTracer.this.w;
                zq3.g(a, "activeSpanId");
                FeatureSdkCoreExtKt.a(jb2Var, a2, a);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(tx7 tx7Var, String str) {
            zq3.h(tx7Var, "span");
            zq3.h(str, "message");
            tx7Var.i(t.f(du8.a("message", str)));
        }

        public final void b(tx7 tx7Var, Throwable th) {
            zq3.h(tx7Var, "span");
            zq3.h(th, "throwable");
            tx7Var.i(t.f(du8.a("error.object", th)));
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTracer(jb2 jb2Var, Config config, ql9 ql9Var, Random random, g84 g84Var, boolean z) {
        super(config, ql9Var, random);
        zq3.h(jb2Var, "sdkCore");
        zq3.h(config, "config");
        zq3.h(ql9Var, "writer");
        zq3.h(random, "random");
        zq3.h(g84Var, "logsHandler");
        this.w = jb2Var;
        this.x = g84Var;
        this.y = z;
        l(new a());
    }

    private final b.C0161b f0(b.C0161b c0161b) {
        if (!this.y) {
            return c0161b;
        }
        Map a2 = this.w.a("rum");
        Object obj = a2.get("application_id");
        b.C0161b l = c0161b.l("application_id", obj instanceof String ? (String) obj : null);
        Object obj2 = a2.get("session_id");
        b.C0161b l2 = l.l("session_id", obj2 instanceof String ? (String) obj2 : null);
        Object obj3 = a2.get("view_id");
        b.C0161b l3 = l2.l("view.id", obj3 instanceof String ? (String) obj3 : null);
        Object obj4 = a2.get("action_id");
        b.C0161b l4 = l3.l("user_action.id", obj4 instanceof String ? (String) obj4 : null);
        zq3.g(l4, "{\n            val rumCon…d\"] as? String)\n        }");
        return l4;
    }

    @Override // defpackage.hp8
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b.C0161b I(String str) {
        zq3.h(str, "operationName");
        b.C0161b i = new b.C0161b(str, L()).i(this.x);
        zq3.g(i, "DDSpanBuilder(operationN…thLogHandler(logsHandler)");
        return f0(i);
    }

    @Override // com.datadog.opentracing.b
    public String toString() {
        return "AndroidTracer/" + super.toString();
    }

    public static final class Builder {
        private final jb2 a;
        private final g84 b;
        private Set c;
        private boolean d;
        private double e;
        private String f;
        private int g;
        private Random h;
        private final Map i;

        public Builder(jb2 jb2Var, g84 g84Var) {
            zq3.h(jb2Var, "sdkCore");
            zq3.h(g84Var, "logsHandler");
            this.a = jb2Var;
            this.b = g84Var;
            this.c = b0.j(TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT);
            this.d = true;
            this.e = 100.0d;
            this.f = "";
            this.g = 5;
            this.h = new SecureRandom();
            this.i = new LinkedHashMap();
        }

        private final Config c() {
            Config c = Config.c(e());
            zq3.g(c, "get(properties())");
            return c;
        }

        private final String d() {
            String str = this.f;
            if (str.length() == 0) {
                str = this.a.c();
                if (str.length() == 0) {
                    InternalLogger.b.a(this.a.f(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.trace.AndroidTracer$Builder$serviceName$1$1
                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            return "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
                        }
                    }, null, false, null, 56, null);
                }
            }
            return str;
        }

        public final Builder a(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            this.i.put(str, str2);
            return this;
        }

        public final AndroidTracer b() {
            ql9 u75Var;
            ib2 d = this.a.d("tracing");
            TracingFeature tracingFeature = d != null ? (TracingFeature) d.b() : null;
            ib2 d2 = this.a.d("rum");
            if (tracingFeature == null) {
                InternalLogger.b.a(this.a.f(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.trace.AndroidTracer$Builder$build$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was not registered/initialized. No tracing data will be sent.";
                    }
                }, null, false, null, 56, null);
            }
            if (this.d && d2 == null) {
                InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.trace.AndroidTracer$Builder$build$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "You're trying to bundle the traces with a RUM context, but the RUM feature was not registered/initialized. No RUM context will be attached to your traces in this case.";
                    }
                }, null, false, null, 56, null);
                this.d = false;
            }
            jb2 jb2Var = this.a;
            Config c = c();
            if (tracingFeature == null || (u75Var = tracingFeature.h()) == null) {
                u75Var = new u75();
            }
            return new AndroidTracer(jb2Var, c, u75Var, this.h, this.b, this.d);
        }

        public final Properties e() {
            Properties properties = new Properties();
            properties.setProperty("service.name", d());
            properties.setProperty("trace.partial.flush.min.spans", String.valueOf(this.g));
            Map map = this.i;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey() + ":" + entry.getValue());
            }
            properties.setProperty("tags", i.u0(arrayList, ",", null, null, 0, null, null, 62, null));
            properties.setProperty("trace.sample.rate", String.valueOf(this.e / 100.0d));
            String u0 = i.u0(this.c, ",", null, null, 0, null, null, 62, null);
            properties.setProperty("propagation.style.extract", u0);
            properties.setProperty("propagation.style.inject", u0);
            return properties;
        }

        public final Builder f(double d) {
            this.e = d;
            return this;
        }

        public final Builder g(Set set) {
            zq3.h(set, "headerTypes");
            this.c = set;
            return this;
        }

        public /* synthetic */ Builder(vc7 vc7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Datadog.b(null, 1, null) : vc7Var);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(defpackage.vc7 r2) {
            /*
                r1 = this;
                java.lang.String r0 = "sdkCore"
                defpackage.zq3.h(r2, r0)
                jb2 r2 = (defpackage.jb2) r2
                com.datadog.android.trace.internal.handlers.AndroidSpanLogsHandler r0 = new com.datadog.android.trace.internal.handlers.AndroidSpanLogsHandler
                r0.<init>(r2)
                r1.<init>(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.trace.AndroidTracer.Builder.<init>(vc7):void");
        }
    }
}
