package com.datadog.android.log.internal.logger;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.log.internal.LogsFeature;
import com.datadog.android.log.model.LogEvent;
import defpackage.a87;
import defpackage.du8;
import defpackage.f32;
import defpackage.f84;
import defpackage.gt2;
import defpackage.h84;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.qa1;
import defpackage.qs2;
import defpackage.ua1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DatadogLogHandler implements h84 {
    private static final a j = new a(null);
    private final String a;
    private final f84 b;
    private final jb2 c;
    private final qa1 d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final a87 h;
    private final int i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DatadogLogHandler(String str, f84 f84Var, jb2 jb2Var, qa1 qa1Var, boolean z, boolean z2, boolean z3, a87 a87Var, int i) {
        zq3.h(str, "loggerName");
        zq3.h(f84Var, "logGenerator");
        zq3.h(jb2Var, "sdkCore");
        zq3.h(qa1Var, "writer");
        zq3.h(a87Var, "sampler");
        this.a = str;
        this.b = f84Var;
        this.c = jb2Var;
        this.d = qa1Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = a87Var;
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEvent c(int i, ua1 ua1Var, String str, Throwable th, Map map, Set set, String str2, long j2) {
        return f84.a.a(this.b, i, str, th, map, set, j2, str2, ua1Var, this.e, this.a, this.f, this.g, null, null, null, 28672, null);
    }

    @Override // defpackage.h84
    public void a(final int i, final String str, final Throwable th, Map map, final Set set, Long l) {
        Object obj;
        LinkedHashMap linkedHashMap;
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        zq3.h(set, "tags");
        if (i < this.i) {
            return;
        }
        final long longValue = l != null ? l.longValue() : System.currentTimeMillis();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ib2 d = this.c.d("logs");
        if (d != null) {
            linkedHashMap2.putAll(t.x(((LogsFeature) d.b()).i()));
        }
        linkedHashMap2.putAll(map);
        if (!this.h.a()) {
            obj = "attributes";
            linkedHashMap = linkedHashMap2;
        } else if (d != null) {
            final String name = Thread.currentThread().getName();
            obj = "attributes";
            linkedHashMap = linkedHashMap2;
            ib2.a.a(d, false, new gt2() { // from class: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(ua1 ua1Var, f32 f32Var) {
                    LogEvent c;
                    zq3.h(ua1Var, "datadogContext");
                    zq3.h(f32Var, "eventBatchWriter");
                    DatadogLogHandler datadogLogHandler = DatadogLogHandler.this;
                    int i2 = i;
                    String str2 = str;
                    Throwable th2 = th;
                    Map<String, Object> map2 = linkedHashMap2;
                    Set<String> set2 = set;
                    String str3 = name;
                    zq3.g(str3, "threadName");
                    c = datadogLogHandler.c(i2, ua1Var, str2, th2, map2, set2, str3, longValue);
                    if (c != null) {
                        DatadogLogHandler.this.d().a(f32Var, c, EventType.DEFAULT);
                    }
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    b((ua1) obj2, (f32) obj3);
                    return ww8.a;
                }
            }, 1, null);
        } else {
            obj = "attributes";
            linkedHashMap = linkedHashMap2;
            InternalLogger.b.a(this.c.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Requested to write log, but Logs feature is not registered.";
                }
            }, null, false, null, 56, null);
        }
        if (i >= 6) {
            ib2 d2 = this.c.d("rum");
            if (d2 != null) {
                d2.a(t.m(du8.a(TransferTable.COLUMN_TYPE, "logger_error"), du8.a("message", str), du8.a("throwable", th), du8.a(obj, linkedHashMap)));
            } else {
                InternalLogger.b.a(this.c.f(), InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$3
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Requested to forward error log to RUM, but RUM feature is not registered.";
                    }
                }, null, false, null, 56, null);
            }
        }
    }

    public final qa1 d() {
        return this.d;
    }
}
