package com.datadog.legacy.trace.api;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes2.dex */
public class Config {
    private static final Pattern p0 = Pattern.compile("[^a-zA-Z0-9_]");
    public static final String q0 = null;
    private static final Set r0 = N("500-599", "default");
    private static final Set s0 = N("400-499", "default");
    private static final String t0;
    private static final String u0;
    private static final String v0;
    private static final String w0;
    private static Properties x0;
    private static final Config y0;
    private final boolean A;
    private final Set B;
    private final Set C;
    private final boolean D;
    private final String E;
    private final List F;
    private final List G;
    private final Integer H;
    private final Integer I;
    private final String J;
    private final Integer K;
    private final boolean L;
    private final String M;
    private final Integer N;
    private final boolean O;
    private final boolean P;
    private final String Q;
    private final String R;
    private final boolean S;
    private final List T;
    private final boolean U;
    private final Map V;
    private final Map W;
    private final Double X;
    private final Double Y;
    private final boolean Z;
    private final String a;
    private final String a0;
    private final String b;
    private final Map b0;
    private final String c;
    private final int c0;
    private final boolean d;
    private final boolean d0;
    private final boolean e;
    private final int e0;
    private final String f;
    private final String f0;
    private final String g;
    private final int g0;
    private final int h;
    private final String h0;
    private final String i;
    private final String i0;
    private final boolean j;
    private final int j0;
    private final boolean k;
    private final String k0;
    private final Map l;
    private final String l0;
    private final Map m;
    private final int m0;
    private final Map n;
    private final int n0;
    private final Map o;
    private final int o0;
    private final List p;
    private final Map q;
    private final Set r;
    private final Set s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final Set x;
    private final Integer y;
    private final Integer z;

    public enum PropagationStyle {
        DATADOG,
        B3,
        B3MULTI,
        TRACECONTEXT,
        HAYSTACK
    }

    static {
        PropagationStyle propagationStyle = PropagationStyle.DATADOG;
        t0 = propagationStyle.name();
        u0 = propagationStyle.name();
        v0 = null;
        w0 = null;
        y0 = new Config();
    }

    Config() {
        x0 = K();
        this.a = UUID.randomUUID().toString();
        this.b = E("site", "datadoghq.com");
        this.c = E("service", E("service.name", "unnamed-java-app"));
        Boolean bool = Boolean.TRUE;
        this.d = d("trace.enabled", bool).booleanValue();
        this.e = d("integrations.enabled", bool).booleanValue();
        this.f = E("writer.type", "DDAgentWriter");
        this.g = E("agent.host", "localhost");
        this.h = j("trace.agent.port", j("agent.port", 8126)).intValue();
        this.i = E("trace.agent.unix.domain.socket", q0);
        this.j = d("priority.sampling", bool).booleanValue();
        this.k = d("trace.resolver.enabled", bool).booleanValue();
        this.l = m("service.mapping", null);
        HashMap hashMap = new HashMap(m("trace.global.tags", null));
        hashMap.putAll(m("tags", null));
        this.m = n(hashMap, "env", "version");
        this.n = m("trace.span.tags", null);
        this.o = m("trace.jmx.tags", null);
        this.p = k("trace.classes.exclude", null);
        this.q = m("trace.header.tags", null);
        this.r = i("http.server.error.statuses", r0);
        this.s = i("http.client.error.statuses", s0);
        Boolean bool2 = Boolean.FALSE;
        this.t = d("http.server.tag.query-string", bool2).booleanValue();
        this.u = d("http.client.tag.query-string", bool2).booleanValue();
        this.v = d("trace.http.client.split-by-domain", bool2).booleanValue();
        this.w = d("trace.db.client.split-by-instance", bool2).booleanValue();
        this.x = Collections.unmodifiableSet(new LinkedHashSet(k("trace.split-by-tags", "")));
        this.y = j("trace.scope.depth.limit", 100);
        this.z = j("trace.partial.flush.min.spans", Integer.valueOf(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
        this.A = d("trace.runtime.context.field.injection", bool).booleanValue();
        this.B = r("propagation.style.extract", t0);
        this.C = r("propagation.style.inject", u0);
        this.D = d("jmxfetch.enabled", bool).booleanValue();
        this.E = E("jmxfetch.config.dir", null);
        this.F = k("jmxfetch.config", null);
        this.G = k("jmxfetch.metrics-configs", null);
        this.H = j("jmxfetch.check-period", null);
        this.I = j("jmxfetch.refresh-beans-period", null);
        this.J = E("jmxfetch.statsd.host", null);
        this.K = j("jmxfetch.statsd.port", 8125);
        this.L = d("trace.health.metrics.enabled", bool2).booleanValue();
        this.M = E("trace.health.metrics.statsd.host", null);
        this.N = j("trace.health.metrics.statsd.port", null);
        this.O = d("logs.injection", bool2).booleanValue();
        this.P = d("trace.report-hostname", bool2).booleanValue();
        this.Q = E("trace.annotations", v0);
        this.R = E("trace.methods", w0);
        this.S = d("trace.executors.all", bool2).booleanValue();
        this.T = k("trace.executors", "");
        this.U = d("trace.analytics.enabled", bool2).booleanValue();
        this.V = m("trace.sampling.service.rules", null);
        this.W = m("trace.sampling.operation.rules", null);
        this.X = e("trace.sample.rate", null);
        this.Y = e("trace.rate.limit", Double.valueOf(100.0d));
        this.Z = d("profiling.enabled", bool2).booleanValue();
        this.a0 = E("profiling.url", null);
        this.b0 = m("profiling.tags", null);
        this.c0 = j("profiling.start-delay", 10).intValue();
        this.d0 = d("profiling.experimental.start-force-first", bool2).booleanValue();
        this.e0 = j("profiling.upload.period", 60).intValue();
        this.f0 = E("profiling.jfr-template-override-file", null);
        this.g0 = j("profiling.upload.timeout", 30).intValue();
        this.h0 = E("profiling.upload.compression", DebugKt.DEBUG_PROPERTY_VALUE_ON);
        this.i0 = E("profiling.proxy.host", null);
        this.j0 = j("profiling.proxy.port", 8080).intValue();
        this.k0 = E("profiling.proxy.username", null);
        this.l0 = E("profiling.proxy.password", null);
        Integer valueOf = Integer.valueOf(Constants.MAXIMUM_UPLOAD_PARTS);
        this.m0 = j("profiling.exception.sample.limit", valueOf).intValue();
        this.n0 = j("profiling.exception.histogram.top-items", 50).intValue();
        this.o0 = j("profiling.exception.histogram.max-collection-size", valueOf).intValue();
    }

    private Map A() {
        Map L = L(2);
        L.put("runtime-id", this.a);
        return Collections.unmodifiableMap(L);
    }

    public static String E(String str, String str2) {
        String S = S(str);
        String property = System.getProperties().getProperty(S);
        if (property != null) {
            return property;
        }
        String str3 = System.getenv(R(str));
        if (str3 != null) {
            return str3;
        }
        String property2 = x0.getProperty(S);
        return property2 != null ? property2 : str2;
    }

    private static Object F(String str, Class cls, Object obj) {
        try {
            return T(E(str, null), cls, obj);
        } catch (NumberFormatException unused) {
            return obj;
        }
    }

    private static Properties K() {
        Properties properties = new Properties();
        String property = System.getProperty(S("trace.config"));
        if (property == null) {
            property = System.getenv(R("trace.config"));
        }
        if (property == null) {
            return properties;
        }
        File file = new File(property.replaceFirst("^~", System.getProperty("user.home")));
        if (!file.exists()) {
            return properties;
        }
        try {
            FileReader fileReader = new FileReader(file);
            try {
                properties.load(fileReader);
                fileReader.close();
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused) {
        }
        return properties;
    }

    private static Map L(int i) {
        return new HashMap(i + 1, 1.0f);
    }

    private static Map M(Map map, Properties properties, String... strArr) {
        HashMap hashMap = new HashMap(map);
        for (String str : strArr) {
            String property = properties.getProperty(str, null);
            if (property != null) {
                hashMap.put(str, property);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static Set N(String str, String str2) {
        String replaceAll = str.replaceAll("\\s", "");
        if (!replaceAll.matches("\\d{3}(?:-\\d{3})?(?:,\\d{3}(?:-\\d{3})?)*")) {
            throw new NumberFormatException();
        }
        String[] split = replaceAll.split(",", -1);
        HashSet hashSet = new HashSet();
        for (String str3 : split) {
            String[] split2 = str3.split("-", -1);
            if (split2.length == 1) {
                hashSet.add(Integer.valueOf(Integer.parseInt(split2[0])));
            } else if (split2.length == 2) {
                int parseInt = Integer.parseInt(split2[0]);
                int parseInt2 = Integer.parseInt(split2[1]);
                int max = Math.max(parseInt, parseInt2);
                for (int min = Math.min(parseInt, parseInt2); min <= max; min++) {
                    hashSet.add(Integer.valueOf(min));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static List O(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptyList();
        }
        String[] split = str.split(",", -1);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        return Collections.unmodifiableList(Arrays.asList(split));
    }

    private static Map P(String str, String str2) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptyMap();
        }
        if (!str.matches("(([^,:]+:[^,:]*,)*([^,:]+:[^,:]*),?)?")) {
            return Collections.emptyMap();
        }
        String[] split = str.split(",", -1);
        Map L = L(split.length);
        for (String str3 : split) {
            String[] split2 = str3.split(":", -1);
            if (split2.length == 2) {
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                if (trim2.length() > 0) {
                    L.put(trim, trim2);
                }
            }
        }
        return Collections.unmodifiableMap(L);
    }

    private static Set Q(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : str.split("[,\\s]+")) {
            if (!str2.isEmpty()) {
                linkedHashSet.add(str2);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private static String R(String str) {
        return p0.matcher(S(str).toUpperCase(Locale.US)).replaceAll(QueryKeys.END_MARKER);
    }

    private static String S(String str) {
        return "dd." + str;
    }

    private static Object T(String str, Class cls, Object obj) {
        if (str == null || str.trim().isEmpty()) {
            return obj;
        }
        try {
            return cls.getMethod("valueOf", String.class).invoke(null, str);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new NumberFormatException(e.toString());
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new NumberFormatException(th.toString());
        }
    }

    private static Set a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                linkedHashSet.add(PropagationStyle.valueOf(((String) it2.next()).toUpperCase(Locale.US)));
            } catch (IllegalArgumentException unused) {
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static Config b() {
        return y0;
    }

    public static Config c(Properties properties) {
        return (properties == null || properties.isEmpty()) ? y0 : new Config(properties, y0);
    }

    public static Boolean d(String str, Boolean bool) {
        return (Boolean) F(str, Boolean.class, bool);
    }

    private static Double e(String str, Double d) {
        return (Double) F(str, Double.class, d);
    }

    private Map f() {
        return this.m;
    }

    private static String h() {
        String str = System.getProperty("os.name").startsWith("Windows") ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
        if (str != null && !str.isEmpty()) {
            return str.trim();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
            try {
                str = bufferedReader.readLine();
                bufferedReader.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        if (str != null && !str.isEmpty()) {
            return str.trim();
        }
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused2) {
            return null;
        }
    }

    private static Set i(String str, Set set) {
        String E = E(str, null);
        if (E == null) {
            return set;
        }
        try {
            return N(E, str);
        } catch (NumberFormatException unused) {
            return set;
        }
    }

    private static Integer j(String str, Integer num) {
        return (Integer) F(str, Integer.class, num);
    }

    private static List k(String str, String str2) {
        return O(E(str, str2));
    }

    private static Map m(String str, String str2) {
        return P(E(str, str2), S(str));
    }

    private static Map n(Map map, String... strArr) {
        HashMap hashMap = new HashMap(map);
        for (String str : strArr) {
            String E = E(str, null);
            if (E != null) {
                hashMap.put(str, E);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static Set q(Properties properties, String str) {
        String property = properties.getProperty(str);
        if (property == null) {
            return null;
        }
        Set a = a(Q(property));
        if (a.isEmpty()) {
            return null;
        }
        return a;
    }

    private static Set r(String str, String str2) {
        Set a = a(Q(E(str, str2)));
        return a.isEmpty() ? a(Q(str2)) : a;
    }

    private static Boolean u(Properties properties, String str, Boolean bool) {
        return (Boolean) T(properties.getProperty(str), Boolean.class, bool);
    }

    private static Double v(Properties properties, String str, Double d) {
        return (Double) T(properties.getProperty(str), Double.class, d);
    }

    private static Set w(Properties properties, String str, Set set) {
        String property = properties.getProperty(str);
        if (property == null) {
            return set;
        }
        try {
            return N(property, str);
        } catch (NumberFormatException unused) {
            return set;
        }
    }

    private static Integer x(Properties properties, String str, Integer num) {
        return (Integer) T(properties.getProperty(str), Integer.class, num);
    }

    private static List y(Properties properties, String str, List list) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? list : O(property);
    }

    private static Map z(Properties properties, String str, Map map) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? map : P(property, str);
    }

    public Integer B() {
        return this.y;
    }

    public Map C() {
        return this.l;
    }

    public String D() {
        return this.c;
    }

    public Set G() {
        return this.x;
    }

    public Double H() {
        return this.X;
    }

    public boolean I() {
        return this.j;
    }

    public boolean J(String str) {
        String str2 = "trace." + str + ".enabled";
        Boolean bool = Boolean.TRUE;
        if (d(str2, bool).booleanValue()) {
            if (d("trace." + str.toLowerCase(Locale.US) + ".enabled", bool).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public Map g() {
        return this.q;
    }

    public Map l() {
        String h;
        HashMap hashMap = new HashMap(A());
        hashMap.put("language", "jvm");
        if (this.P && (h = h()) != null && !h.isEmpty()) {
            hashMap.put("_dd.hostname", h);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Map o() {
        Map L = L(f().size() + this.n.size());
        L.putAll(f());
        L.putAll(this.n);
        return Collections.unmodifiableMap(L);
    }

    public Integer p() {
        return this.z;
    }

    public Set s() {
        return this.B;
    }

    public Set t() {
        return this.C;
    }

    public String toString() {
        return "Config{runtimeId='" + this.a + "', site='" + this.b + "', serviceName='" + this.c + "', traceEnabled=" + this.d + ", integrationsEnabled=" + this.e + ", writerType='" + this.f + "', agentHost='" + this.g + "', agentPort=" + this.h + ", agentUnixDomainSocket='" + this.i + "', prioritySamplingEnabled=" + this.j + ", traceResolverEnabled=" + this.k + ", serviceMapping=" + this.l + ", tags=" + this.m + ", spanTags=" + this.n + ", jmxTags=" + this.o + ", excludedClasses=" + this.p + ", headerTags=" + this.q + ", httpServerErrorStatuses=" + this.r + ", httpClientErrorStatuses=" + this.s + ", httpServerTagQueryString=" + this.t + ", httpClientTagQueryString=" + this.u + ", httpClientSplitByDomain=" + this.v + ", dbClientSplitByInstance=" + this.w + ", splitByTags=" + this.x + ", scopeDepthLimit=" + this.y + ", partialFlushMinSpans=" + this.z + ", runtimeContextFieldInjection=" + this.A + ", propagationStylesToExtract=" + this.B + ", propagationStylesToInject=" + this.C + ", jmxFetchEnabled=" + this.D + ", jmxFetchConfigDir='" + this.E + "', jmxFetchConfigs=" + this.F + ", jmxFetchMetricsConfigs=" + this.G + ", jmxFetchCheckPeriod=" + this.H + ", jmxFetchRefreshBeansPeriod=" + this.I + ", jmxFetchStatsdHost='" + this.J + "', jmxFetchStatsdPort=" + this.K + ", healthMetricsEnabled=" + this.L + ", healthMetricsStatsdHost='" + this.M + "', healthMetricsStatsdPort=" + this.N + ", logsInjectionEnabled=" + this.O + ", reportHostName=" + this.P + ", traceAnnotations='" + this.Q + "', traceMethods='" + this.R + "', traceExecutorsAll=" + this.S + ", traceExecutors=" + this.T + ", traceAnalyticsEnabled=" + this.U + ", traceSamplingServiceRules=" + this.V + ", traceSamplingOperationRules=" + this.W + ", traceSampleRate=" + this.X + ", traceRateLimit=" + this.Y + ", profilingEnabled=" + this.Z + ", profilingUrl='" + this.a0 + "', profilingTags=" + this.b0 + ", profilingStartDelay=" + this.c0 + ", profilingStartForceFirst=" + this.d0 + ", profilingUploadPeriod=" + this.e0 + ", profilingTemplateOverrideFile='" + this.f0 + "', profilingUploadTimeout=" + this.g0 + ", profilingUploadCompression='" + this.h0 + "', profilingProxyHost='" + this.i0 + "', profilingProxyPort=" + this.j0 + ", profilingProxyUsername='" + this.k0 + "', profilingProxyPassword='" + this.l0 + "', profilingExceptionSampleLimit=" + this.m0 + ", profilingExceptionHistogramTopItems=" + this.n0 + ", profilingExceptionHistogramMaxCollectionSize=" + this.o0 + '}';
    }

    private Config(Properties properties, Config config) {
        this.a = config.a;
        this.b = properties.getProperty("site", config.b);
        this.c = properties.getProperty("service", properties.getProperty("service.name", config.c));
        this.d = u(properties, "trace.enabled", Boolean.valueOf(config.d)).booleanValue();
        this.e = u(properties, "integrations.enabled", Boolean.valueOf(config.e)).booleanValue();
        this.f = properties.getProperty("writer.type", config.f);
        this.g = properties.getProperty("agent.host", config.g);
        this.h = x(properties, "trace.agent.port", x(properties, "agent.port", Integer.valueOf(config.h))).intValue();
        this.i = properties.getProperty("trace.agent.unix.domain.socket", config.i);
        this.j = u(properties, "priority.sampling", Boolean.valueOf(config.j)).booleanValue();
        this.k = u(properties, "trace.resolver.enabled", Boolean.valueOf(config.k)).booleanValue();
        this.l = z(properties, "service.mapping", config.l);
        HashMap hashMap = new HashMap(z(properties, "trace.global.tags", Collections.emptyMap()));
        hashMap.putAll(z(properties, "tags", config.m));
        this.m = M(hashMap, properties, "env", "version");
        this.n = z(properties, "trace.span.tags", config.n);
        this.o = z(properties, "trace.jmx.tags", config.o);
        this.p = y(properties, "trace.classes.exclude", config.p);
        this.q = z(properties, "trace.header.tags", config.q);
        this.r = w(properties, "http.server.error.statuses", config.r);
        this.s = w(properties, "http.client.error.statuses", config.s);
        this.t = u(properties, "http.server.tag.query-string", Boolean.valueOf(config.t)).booleanValue();
        this.u = u(properties, "http.client.tag.query-string", Boolean.valueOf(config.u)).booleanValue();
        this.v = u(properties, "trace.http.client.split-by-domain", Boolean.valueOf(config.v)).booleanValue();
        this.w = u(properties, "trace.db.client.split-by-instance", Boolean.valueOf(config.w)).booleanValue();
        this.x = Collections.unmodifiableSet(new LinkedHashSet(y(properties, "trace.split-by-tags", new ArrayList(config.x))));
        this.y = x(properties, "trace.scope.depth.limit", config.y);
        this.z = x(properties, "trace.partial.flush.min.spans", config.z);
        this.A = u(properties, "trace.runtime.context.field.injection", Boolean.valueOf(config.A)).booleanValue();
        Set q = q(properties, "propagation.style.extract");
        this.B = q == null ? config.B : q;
        Set q2 = q(properties, "propagation.style.inject");
        this.C = q2 == null ? config.C : q2;
        this.D = u(properties, "jmxfetch.enabled", Boolean.valueOf(config.D)).booleanValue();
        this.E = properties.getProperty("jmxfetch.config.dir", config.E);
        this.F = y(properties, "jmxfetch.config", config.F);
        this.G = y(properties, "jmxfetch.metrics-configs", config.G);
        this.H = x(properties, "jmxfetch.check-period", config.H);
        this.I = x(properties, "jmxfetch.refresh-beans-period", config.I);
        this.J = properties.getProperty("jmxfetch.statsd.host", config.J);
        this.K = x(properties, "jmxfetch.statsd.port", config.K);
        Boolean bool = Boolean.FALSE;
        this.L = u(properties, "trace.health.metrics.enabled", bool).booleanValue();
        this.M = properties.getProperty("trace.health.metrics.statsd.host", config.M);
        this.N = x(properties, "trace.health.metrics.statsd.port", config.N);
        this.O = d("logs.injection", bool).booleanValue();
        this.P = u(properties, "trace.report-hostname", Boolean.valueOf(config.P)).booleanValue();
        this.Q = properties.getProperty("trace.annotations", config.Q);
        this.R = properties.getProperty("trace.methods", config.R);
        this.S = u(properties, "trace.executors.all", Boolean.valueOf(config.S)).booleanValue();
        this.T = y(properties, "trace.executors", config.T);
        this.U = u(properties, "trace.analytics.enabled", Boolean.valueOf(config.U)).booleanValue();
        this.V = z(properties, "trace.sampling.service.rules", config.V);
        this.W = z(properties, "trace.sampling.operation.rules", config.W);
        this.X = v(properties, "trace.sample.rate", config.X);
        this.Y = v(properties, "trace.rate.limit", config.Y);
        this.Z = u(properties, "profiling.enabled", Boolean.valueOf(config.Z)).booleanValue();
        this.a0 = properties.getProperty("profiling.url", config.a0);
        this.b0 = z(properties, "profiling.tags", config.b0);
        this.c0 = x(properties, "profiling.start-delay", Integer.valueOf(config.c0)).intValue();
        this.d0 = u(properties, "profiling.experimental.start-force-first", Boolean.valueOf(config.d0)).booleanValue();
        this.e0 = x(properties, "profiling.upload.period", Integer.valueOf(config.e0)).intValue();
        this.f0 = properties.getProperty("profiling.jfr-template-override-file", config.f0);
        this.g0 = x(properties, "profiling.upload.timeout", Integer.valueOf(config.g0)).intValue();
        this.h0 = properties.getProperty("profiling.upload.compression", config.h0);
        this.i0 = properties.getProperty("profiling.proxy.host", config.i0);
        this.j0 = x(properties, "profiling.proxy.port", Integer.valueOf(config.j0)).intValue();
        this.k0 = properties.getProperty("profiling.proxy.username", config.k0);
        this.l0 = properties.getProperty("profiling.proxy.password", config.l0);
        this.m0 = x(properties, "profiling.exception.sample.limit", Integer.valueOf(config.m0)).intValue();
        this.n0 = x(properties, "profiling.exception.histogram.top-items", Integer.valueOf(config.n0)).intValue();
        this.o0 = x(properties, "profiling.exception.histogram.max-collection-size", Integer.valueOf(config.o0)).intValue();
    }
}
