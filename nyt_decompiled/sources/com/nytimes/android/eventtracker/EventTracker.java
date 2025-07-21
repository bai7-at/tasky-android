package com.nytimes.android.eventtracker;

import android.app.Application;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.context.PageContextDelegate;
import com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator;
import com.nytimes.android.eventtracker.model.Metadata;
import defpackage.b22;
import defpackage.b42;
import defpackage.e52;
import defpackage.h52;
import defpackage.h85;
import defpackage.jk;
import defpackage.k42;
import defpackage.k61;
import defpackage.l32;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class EventTracker {
    public static final EventTracker a = new EventTracker();
    private static volatile Guard b = Guard.WARN;
    private static l32 c = new h85();
    private static final Map d = new LinkedHashMap();

    public static final class Builder {
        public static final a Companion = new a(null);
        private final Application a;
        private Environment b;
        private String c;
        private boolean d;
        private ss2 e;
        private ss2 f;
        private String g;
        private long h;
        private TimeUnit i;
        private long j;
        private TimeUnit k;
        private int l;
        private long m;
        private TimeUnit n;
        private long o;
        private TimeUnit p;
        private Map q;
        private Metadata r;
        private Set s;
        private Set t;
        private boolean u;

        public static final class MissingRequiredParameter extends RuntimeException {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingRequiredParameter(String str) {
                super("Missing required parameter: " + str);
                zq3.h(str, "param");
            }
        }

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public Builder(Application application) {
            zq3.h(application, "context");
            this.a = application;
            this.b = Environment.PRODUCTION;
            this.e = new EventTracker$Builder$agentIdLambda$1(null);
            this.f = new EventTracker$Builder$deviceTokenLambda$1(null);
            this.g = "https://storage.googleapis.com/nyt-dti-prd-staticjs/analytics/et2/android/validate.js";
            this.h = 6L;
            this.i = TimeUnit.HOURS;
            this.j = 30L;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.k = timeUnit;
            this.l = 2500;
            this.m = 5L;
            this.n = timeUnit;
            this.o = 30L;
            this.p = TimeUnit.MINUTES;
        }

        private final void g() {
            String str = this.c;
            if (str == null) {
                zq3.z("sourceApp");
                str = null;
            }
            if (h.d0(str)) {
                throw new MissingRequiredParameter("sourceApp");
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new EventTracker$Builder$checkRequiredParameters$1(this, null), 3, null);
        }

        public final Builder b(b42 b42Var) {
            zq3.h(b42Var, "interceptor");
            Set set = this.t;
            if (set == null) {
                this.t = b0.h(b42Var);
            } else if (set != null) {
                set.add(b42Var);
            }
            return this;
        }

        public final Builder c(ss2 ss2Var) {
            zq3.h(ss2Var, "agentId");
            this.e = ss2Var;
            return this;
        }

        public final Builder d(Single single) {
            zq3.h(single, "agentIdAsync");
            return c(new EventTracker$Builder$agentId$2(single, null));
        }

        public final l32 e() {
            TimeUnit timeUnit;
            if (this.u) {
                return new h85();
            }
            g();
            Environment a2 = h52.a.a(this.a);
            if (a2 == null) {
                a2 = this.b;
            }
            Environment environment = a2;
            String str = this.c;
            if (str == null) {
                zq3.z("sourceApp");
                str = null;
            }
            String str2 = str;
            boolean z = this.d;
            ss2 ss2Var = this.e;
            Map map = this.q;
            ss2 ss2Var2 = this.f;
            long j = this.h;
            TimeUnit timeUnit2 = this.i;
            long j2 = this.j;
            TimeUnit timeUnit3 = this.k;
            long j3 = this.m;
            TimeUnit timeUnit4 = this.n;
            int i = this.l;
            long j4 = this.o;
            TimeUnit timeUnit5 = this.p;
            String str3 = this.g;
            Metadata metadata = this.r;
            if (metadata == null) {
                timeUnit = timeUnit2;
                metadata = Metadata.Companion.b(this.a);
            } else {
                timeUnit = timeUnit2;
            }
            return new DefaultEventCoordinator(k61.a().a(this.a).b(new a(environment, j2, timeUnit3, j3, timeUnit4, i, j4, timeUnit5, j, timeUnit, str3, str2, z, ss2Var, map, ss2Var2, metadata)).build(), this.s, null, this.t, 4, null);
        }

        public final Builder f(k42.a aVar) {
            zq3.h(aVar, "callback");
            Set set = this.s;
            if (set == null) {
                this.s = b0.h(aVar);
            } else if (set != null) {
                set.add(aVar);
            }
            return this;
        }

        public final Builder h(ss2 ss2Var) {
            zq3.h(ss2Var, "deviceToken");
            this.f = ss2Var;
            return this;
        }

        public final Builder i(Environment environment) {
            zq3.h(environment, "environment");
            this.b = environment;
            return this;
        }

        public final Builder j(boolean z) {
            this.d = z;
            return this;
        }

        public final Builder k(String str) {
            zq3.h(str, "sourceApp");
            this.c = str;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Environment {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Environment[] $VALUES;
        private final String baseUrl;
        public static final Environment STAGING = new Environment("STAGING", 0, "https://a.et.stg.nytimes.com");
        public static final Environment PRODUCTION = new Environment("PRODUCTION", 1, "https://a.et.nytimes.com");

        private static final /* synthetic */ Environment[] $values() {
            return new Environment[]{STAGING, PRODUCTION};
        }

        static {
            Environment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Environment(String str, int i, String str2) {
            this.baseUrl = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Environment valueOf(String str) {
            return (Environment) Enum.valueOf(Environment.class, str);
        }

        public static Environment[] values() {
            return (Environment[]) $VALUES.clone();
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Guard {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Guard[] $VALUES;
        public static final a Companion;
        public static final Guard WARN = new Guard("WARN", 0);
        public static final Guard ASSERT = new Guard("ASSERT", 1);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(String str, qs2 qs2Var) {
                zq3.h(str, "assertion");
                zq3.h(qs2Var, "condition");
                if (((Boolean) qs2Var.mo865invoke()).booleanValue()) {
                    if (EventTracker.a.d() != Guard.WARN) {
                        throw new AssertionError(str);
                    }
                    ul8.a.z("ET2").u(str, new Object[0]);
                }
            }

            private a() {
            }
        }

        private static final /* synthetic */ Guard[] $values() {
            return new Guard[]{WARN, ASSERT};
        }

        static {
            Guard[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private Guard(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Guard valueOf(String str) {
            return (Guard) Enum.valueOf(Guard.class, str);
        }

        public static Guard[] values() {
            return (Guard[]) $VALUES.clone();
        }
    }

    public static final class a {
        private final Environment a;
        private final long b;
        private final TimeUnit c;
        private final long d;
        private final TimeUnit e;
        private final int f;
        private final long g;
        private final TimeUnit h;
        private final long i;
        private final TimeUnit j;
        private final String k;
        private final String l;
        private final boolean m;
        private final ss2 n;
        private final Map o;
        private final ss2 p;
        private final Metadata q;

        public a(Environment environment, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, int i, long j3, TimeUnit timeUnit3, long j4, TimeUnit timeUnit4, String str, String str2, boolean z, ss2 ss2Var, Map map, ss2 ss2Var2, Metadata metadata) {
            zq3.h(environment, "environment");
            zq3.h(timeUnit, "bufferLengthUnit");
            zq3.h(timeUnit2, "flushThrottleUnit");
            zq3.h(timeUnit3, "sessionLengthUnit");
            zq3.h(timeUnit4, "validationCacheTimeUnit");
            zq3.h(str, "validationURL");
            zq3.h(str2, "sourceApp");
            zq3.h(ss2Var, "agentIdAsync");
            zq3.h(ss2Var2, "deviceTokenAsync");
            zq3.h(metadata, "metadata");
            this.a = environment;
            this.b = j;
            this.c = timeUnit;
            this.d = j2;
            this.e = timeUnit2;
            this.f = i;
            this.g = j3;
            this.h = timeUnit3;
            this.i = j4;
            this.j = timeUnit4;
            this.k = str;
            this.l = str2;
            this.m = z;
            this.n = ss2Var;
            this.o = map;
            this.p = ss2Var2;
            this.q = metadata;
        }

        public final long a() {
            return this.c.toMillis(this.b);
        }

        public final long b() {
            return this.e.toMillis(this.d);
        }

        public final Map c() {
            return this.o;
        }

        public final ss2 d() {
            return this.n;
        }

        public final ss2 e() {
            return this.p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && zq3.c(this.k, aVar.k) && zq3.c(this.l, aVar.l) && this.m == aVar.m && zq3.c(this.n, aVar.n) && zq3.c(this.o, aVar.o) && zq3.c(this.p, aVar.p) && zq3.c(this.q, aVar.q);
        }

        public final Environment f() {
            return this.a;
        }

        public final int g() {
            return this.f;
        }

        public final Metadata h() {
            return this.q;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((((((((((this.a.hashCode() * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + Long.hashCode(this.g)) * 31) + this.h.hashCode()) * 31) + Long.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + Boolean.hashCode(this.m)) * 31) + this.n.hashCode()) * 31;
            Map map = this.o;
            return ((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
        }

        public final String i() {
            return this.l;
        }

        public final String j() {
            return this.k;
        }

        public final boolean k() {
            return this.m;
        }

        public final long l() {
            return this.h.toMillis(this.g);
        }

        public final long m() {
            return this.j.toMillis(this.i);
        }

        public String toString() {
            return "Configuration(environment=" + this.a + ", bufferLength=" + this.b + ", bufferLengthUnit=" + this.c + ", flushThrottle=" + this.d + ", flushThrottleUnit=" + this.e + ", flushLimit=" + this.f + ", sessionLength=" + this.g + ", sessionLengthUnit=" + this.h + ", validationCacheTime=" + this.i + ", validationCacheTimeUnit=" + this.j + ", validationURL=" + this.k + ", sourceApp=" + this.l + ", isFirstLaunch=" + this.m + ", agentIdAsync=" + this.n + ", agentData=" + this.o + ", deviceTokenAsync=" + this.p + ", metadata=" + this.q + ")";
        }
    }

    private EventTracker() {
    }

    public static /* synthetic */ void i(EventTracker eventTracker, PageContext pageContext, e52 e52Var, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = t.i();
        }
        eventTracker.h(pageContext, e52Var, map);
    }

    public final void a() {
        synchronized (this) {
            c.e();
            ww8 ww8Var = ww8.a;
        }
    }

    public final void b() {
        synchronized (this) {
            c.d();
            ww8 ww8Var = ww8.a;
        }
    }

    public final void c() {
        synchronized (this) {
            c.flush();
            ww8 ww8Var = ww8.a;
        }
    }

    public final Guard d() {
        return b;
    }

    public final void e(l32 l32Var) {
        zq3.h(l32Var, "coordinator");
        synchronized (this) {
            c.f();
            l32Var.c();
            c = l32Var;
            ww8 ww8Var = ww8.a;
        }
    }

    public final void f() {
        synchronized (this) {
            c.b();
            ww8 ww8Var = ww8.a;
        }
    }

    public final void g(jk jkVar, e52 e52Var, Map map) {
        zq3.h(jkVar, "page");
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        h(PageContextDelegate.a.a(jkVar), e52Var, map);
    }

    public final void h(PageContext pageContext, e52 e52Var, Map map) {
        zq3.h(pageContext, "pageContext");
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        synchronized (this) {
            c.a(e52Var, t.p(map, d), pageContext.a(), pageContext.e(), pageContext.g(), pageContext.f(), pageContext.b(e52Var));
            ww8 ww8Var = ww8.a;
        }
    }

    public final void j(Guard guard) {
        zq3.h(guard, "level");
        b = guard;
    }
}
