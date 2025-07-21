package defpackage;

import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.log.model.LogEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class bb1 implements f84 {
    public static final a c = new a(null);
    private final String a;
    private final SimpleDateFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public bb1(String str) {
        this.a = str;
        this.b = e94.a();
    }

    private final String b(ua1 ua1Var) {
        String n = ua1Var.n();
        if (n.length() <= 0) {
            return null;
        }
        return "version:" + n;
    }

    private final String c(ua1 ua1Var) {
        String d = ua1Var.d();
        if (d.length() <= 0) {
            return null;
        }
        return "env:" + d;
    }

    private final LogEvent d(int i, String str, LogEvent.e eVar, Map map, Set set, long j, String str2, ua1 ua1Var, boolean z, String str3, boolean z2, boolean z3, j09 j09Var, NetworkInfo networkInfo) {
        String format;
        long a2 = j + ua1Var.k().a();
        Map e = e(ua1Var, map, z2, str2, z3);
        synchronized (this.b) {
            format = this.b.format(new Date(a2));
        }
        Set i2 = i(ua1Var, set);
        LogEvent.j j2 = j(ua1Var, j09Var);
        LogEvent.g g = (networkInfo != null || z) ? g(ua1Var, networkInfo) : null;
        LogEvent.f fVar = new LogEvent.f(str3, str2, ua1Var.g());
        String str4 = this.a;
        if (str4 == null) {
            str4 = ua1Var.h();
        }
        String str5 = str4;
        LogEvent.Status f = f(i);
        String a3 = ua1Var.a();
        LogEvent.c cVar = new LogEvent.c(new LogEvent.d(ua1Var.c().a()));
        String u0 = i.u0(i2, ",", null, null, 0, null, null, 62, null);
        zq3.g(format, "formattedDate");
        return new LogEvent(f, str5, str, format, fVar, cVar, j2, g, eVar, a3, u0, e);
    }

    private final Map e(ua1 ua1Var, Map map, boolean z, String str, boolean z2) {
        Map map2;
        Map map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (z && (map3 = (Map) ua1Var.e().get("tracing")) != null) {
            Object obj = map3.get("context@" + str);
            Map map4 = obj instanceof Map ? (Map) obj : null;
            if (map4 != null) {
                linkedHashMap.put("dd.trace_id", map4.get("trace_id"));
                linkedHashMap.put("dd.span_id", map4.get("span_id"));
            }
        }
        if (z2 && (map2 = (Map) ua1Var.e().get("rum")) != null) {
            linkedHashMap.put("application_id", map2.get("application_id"));
            linkedHashMap.put("session_id", map2.get("session_id"));
            linkedHashMap.put("view.id", map2.get("view_id"));
            linkedHashMap.put("user_action.id", map2.get("action_id"));
        }
        return linkedHashMap;
    }

    private final LogEvent.Status f(int i) {
        switch (i) {
            case 2:
                return LogEvent.Status.TRACE;
            case 3:
                return LogEvent.Status.DEBUG;
            case 4:
                return LogEvent.Status.INFO;
            case 5:
                return LogEvent.Status.WARN;
            case 6:
                return LogEvent.Status.ERROR;
            case 7:
                return LogEvent.Status.CRITICAL;
            case 8:
            default:
                return LogEvent.Status.DEBUG;
            case 9:
                return LogEvent.Status.EMERGENCY;
        }
    }

    private final LogEvent.g g(ua1 ua1Var, NetworkInfo networkInfo) {
        if (networkInfo == null) {
            networkInfo = ua1Var.f();
        }
        LogEvent.h h = h(networkInfo);
        Long e = networkInfo.e();
        String l = e != null ? e.toString() : null;
        Long d = networkInfo.d();
        String l2 = d != null ? d.toString() : null;
        Long f = networkInfo.f();
        return new LogEvent.g(new LogEvent.a(h, l, l2, f != null ? f.toString() : null, networkInfo.c().toString()));
    }

    private final LogEvent.h h(NetworkInfo networkInfo) {
        if (networkInfo.a() == null && networkInfo.b() == null) {
            return null;
        }
        Long a2 = networkInfo.a();
        return new LogEvent.h(a2 != null ? a2.toString() : null, networkInfo.b());
    }

    private final Set i(ua1 ua1Var, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        String c2 = c(ua1Var);
        if (c2 != null) {
            linkedHashSet.add(c2);
        }
        String b = b(ua1Var);
        if (b != null) {
            linkedHashSet.add(b);
        }
        String k = k(ua1Var);
        if (k != null) {
            linkedHashSet.add(k);
        }
        return linkedHashSet;
    }

    private final LogEvent.j j(ua1 ua1Var, j09 j09Var) {
        if (j09Var == null) {
            j09Var = ua1Var.l();
        }
        return new LogEvent.j(j09Var.d(), j09Var.e(), j09Var.c(), t.x(j09Var.b()));
    }

    private final String k(ua1 ua1Var) {
        String m = ua1Var.m();
        if (m.length() <= 0) {
            return null;
        }
        return "variant:" + m;
    }

    @Override // defpackage.f84
    public LogEvent a(int i, String str, Throwable th, Map map, Set set, long j, String str2, ua1 ua1Var, boolean z, String str3, boolean z2, boolean z3, j09 j09Var, NetworkInfo networkInfo, List list) {
        LogEvent.e eVar;
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        zq3.h(set, "tags");
        zq3.h(str2, "threadName");
        zq3.h(ua1Var, "datadogContext");
        zq3.h(str3, "loggerName");
        zq3.h(list, "threads");
        Map x = t.x(map);
        if (th != null) {
            Object remove = x.remove("_dd.error.fingerprint");
            String str4 = remove instanceof String ? (String) remove : null;
            String canonicalName = th.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th.getClass().getSimpleName();
            }
            String str5 = canonicalName;
            String b = g62.b(th);
            String message = th.getMessage();
            List<bl8> list2 = list;
            ArrayList arrayList = new ArrayList(i.w(list2, 10));
            for (bl8 bl8Var : list2) {
                arrayList.add(new LogEvent.i(bl8Var.b(), bl8Var.a(), bl8Var.c(), bl8Var.d()));
            }
            eVar = new LogEvent.e(str5, message, b, null, str4, arrayList.isEmpty() ? null : arrayList, 8, null);
        } else {
            eVar = null;
        }
        return d(i, str, eVar, x, set, j, str2, ua1Var, z, str3, z2, z3, j09Var, networkInfo);
    }

    public /* synthetic */ bb1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
