package com.datadog.android.trace.internal.handlers;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import defpackage.du8;
import defpackage.g84;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.kl8;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AndroidSpanLogsHandler implements g84 {
    public static final a b = new a(null);
    private final jb2 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AndroidSpanLogsHandler(jb2 jb2Var) {
        zq3.h(jb2Var, "sdkCore");
        this.a = jb2Var;
    }

    private final void b(Map map, com.datadog.opentracing.a aVar) {
        String name;
        String a2;
        String obj;
        Object remove = map.remove("error.object");
        String str = null;
        Throwable th = remove instanceof Throwable ? (Throwable) remove : null;
        Object remove2 = map.remove("error.kind");
        if (remove2 == null || (name = remove2.toString()) == null) {
            name = th != null ? th.getClass().getName() : null;
        }
        if (name != null) {
            Object remove3 = map.remove("stack");
            Object obj2 = map.get("message");
            if (remove3 == null || (a2 = remove3.toString()) == null) {
                a2 = th != null ? kl8.a(th) : null;
            }
            if (obj2 != null && (obj = obj2.toString()) != null) {
                str = obj;
            } else if (th != null) {
                str = th.getMessage();
            }
            aVar.g(true);
            aVar.e("error.type", name);
            aVar.e("error.msg", str);
            aVar.e("error.stack", a2);
        }
    }

    private final void c(com.datadog.opentracing.a aVar, Map map, Long l) {
        String str;
        ib2 d = this.a.d("logs");
        if (d == null || map.isEmpty()) {
            if (d == null) {
                InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.trace.internal.handlers.AndroidSpanLogsHandler$logFields$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Requested to write span log, but Logs feature is not registered.";
                    }
                }, null, false, null, 56, null);
                return;
            }
            return;
        }
        Object remove = map.remove("message");
        if (remove == null || (str = remove.toString()) == null) {
            str = "Span event";
        }
        map.put("dd.trace_id", aVar.y().toString());
        map.put("dd.span_id", aVar.v().toString());
        Long e = e(l);
        d.a(t.m(du8.a(TransferTable.COLUMN_TYPE, "span_log"), du8.a("loggerName", "trace"), du8.a("message", str), du8.a("attributes", map), du8.a("timestamp", Long.valueOf(e != null ? e.longValue() : System.currentTimeMillis()))));
    }

    static /* synthetic */ void d(AndroidSpanLogsHandler androidSpanLogsHandler, com.datadog.opentracing.a aVar, Map map, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        androidSpanLogsHandler.c(aVar, map, l);
    }

    private final Long e(Long l) {
        if (l == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
    }

    @Override // defpackage.g84
    public void a(Map map, com.datadog.opentracing.a aVar) {
        zq3.h(map, "fields");
        zq3.h(aVar, "span");
        Map x = t.x(map);
        b(x, aVar);
        d(this, aVar, x, null, 4, null);
    }
}
