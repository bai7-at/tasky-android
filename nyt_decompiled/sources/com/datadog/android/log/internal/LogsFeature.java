package com.datadog.android.log.internal;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.log.internal.domain.event.LogEventMapperWrapper;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bb1;
import defpackage.c04;
import defpackage.d84;
import defpackage.f32;
import defpackage.f84;
import defpackage.g28;
import defpackage.gt2;
import defpackage.h42;
import defpackage.ib2;
import defpackage.j09;
import defpackage.jb2;
import defpackage.ky6;
import defpackage.lb2;
import defpackage.pu3;
import defpackage.qa1;
import defpackage.qs2;
import defpackage.ta4;
import defpackage.ua1;
import defpackage.ua4;
import defpackage.w65;
import defpackage.ww8;
import defpackage.xe4;
import defpackage.za2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class LogsFeature implements g28, za2 {
    public static final a k = new a(null);
    private final jb2 a;
    private final h42 b;
    private qa1 c;
    private final AtomicBoolean d;
    private String e;
    private final bb1 f;
    private final ConcurrentHashMap g;
    private final String h;
    private final c04 i;
    private final lb2 j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogsFeature(jb2 jb2Var, final String str, h42 h42Var) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(h42Var, "eventMapper");
        this.a = jb2Var;
        this.b = h42Var;
        this.c = new w65();
        this.d = new AtomicBoolean(false);
        this.e = "";
        this.f = new bb1(null, 1, 0 == true ? 1 : 0);
        this.g = new ConcurrentHashMap();
        this.h = "logs";
        this.i = c.a(new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$requestFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ua4 mo865invoke() {
                jb2 jb2Var2;
                String str2 = str;
                jb2Var2 = this.a;
                return new ua4(str2, jb2Var2.f());
            }
        });
        this.j = lb2.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final qa1 h(h42 h42Var) {
        return new ta4(new xe4(new LogEventMapperWrapper(h42Var, this.a.f()), new d84(this.a.f(), null, 2, 0 == true ? 1 : 0)), this.a.f());
    }

    private final void l(final pu3.a aVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Map i = i();
        ib2 d = this.a.d(getName());
        if (d != null) {
            ib2.a.a(d, false, new gt2() { // from class: com.datadog.android.log.internal.LogsFeature$sendJvmCrashLog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(ua1 ua1Var, f32 f32Var) {
                    bb1 bb1Var;
                    zq3.h(ua1Var, "datadogContext");
                    zq3.h(f32Var, "eventBatchWriter");
                    bb1Var = LogsFeature.this.f;
                    String a2 = aVar.a();
                    String b = aVar.b();
                    Throwable e = aVar.e();
                    long f = aVar.f();
                    String c = aVar.c();
                    List d2 = aVar.d();
                    LogsFeature.this.j().a(f32Var, bb1Var.a(9, b, e, i, b0.e(), f, c, ua1Var, true, a2, true, true, null, null, d2), EventType.CRASH);
                    countDownLatch.countDown();
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((ua1) obj, (f32) obj2);
                    return ww8.a;
                }
            }, 1, null);
        }
        try {
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$sendJvmCrashLog$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Log event write operation wait was interrupted.";
                }
            }, e, false, null, 48, null);
        }
    }

    private final void m(Map map) {
        final LinkedHashMap linkedHashMap;
        Object obj = map.get("timestamp");
        final Long l = obj instanceof Long ? (Long) obj : null;
        Object obj2 = map.get("message");
        final String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("loggerName");
        final String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("attributes");
        Map map2 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(t.e(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                zq3.f(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap3.put((String) key, entry2.getValue());
            }
            linkedHashMap = linkedHashMap3;
        } else {
            linkedHashMap = null;
        }
        Object obj5 = map.get("networkInfo");
        final NetworkInfo networkInfo = obj5 instanceof NetworkInfo ? (NetworkInfo) obj5 : null;
        Object obj6 = map.get("userInfo");
        final j09 j09Var = obj6 instanceof j09 ? (j09) obj6 : null;
        if (str2 == null || str == null || l == null || linkedHashMap == null) {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$sendNdkCrashLog$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                }
            }, null, false, null, 56, null);
            return;
        }
        ib2 d = this.a.d(getName());
        if (d != null) {
            ib2.a.a(d, false, new gt2() { // from class: com.datadog.android.log.internal.LogsFeature$sendNdkCrashLog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(ua1 ua1Var, f32 f32Var) {
                    bb1 bb1Var;
                    zq3.h(ua1Var, "datadogContext");
                    zq3.h(f32Var, "eventBatchWriter");
                    bb1Var = LogsFeature.this.f;
                    String name = Thread.currentThread().getName();
                    Set e = b0.e();
                    String str3 = str;
                    Map<String, Object> map3 = linkedHashMap;
                    long longValue = l.longValue();
                    zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
                    LogsFeature.this.j().a(f32Var, f84.a.a(bb1Var, 9, str3, null, map3, e, longValue, name, ua1Var, true, str2, false, false, j09Var, networkInfo, null, Http2.INITIAL_MAX_FRAME_SIZE, null), EventType.CRASH);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj7, Object obj8) {
                    b((ua1) obj7, (f32) obj8);
                    return ww8.a;
                }
            }, 1, null);
        }
    }

    private final void n(Map map) {
        final LinkedHashMap linkedHashMap;
        Object obj = map.get("timestamp");
        final Long l = obj instanceof Long ? (Long) obj : null;
        Object obj2 = map.get("message");
        final String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("loggerName");
        final String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("attributes");
        Map map2 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(t.e(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                zq3.f(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap3.put((String) key, entry2.getValue());
            }
            linkedHashMap = linkedHashMap3;
        } else {
            linkedHashMap = null;
        }
        if (str2 == null || str == null || linkedHashMap == null || l == null) {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$sendSpanLog$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                }
            }, null, false, null, 56, null);
            return;
        }
        ib2 d = this.a.d(getName());
        if (d != null) {
            ib2.a.a(d, false, new gt2() { // from class: com.datadog.android.log.internal.LogsFeature$sendSpanLog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(ua1 ua1Var, f32 f32Var) {
                    bb1 bb1Var;
                    zq3.h(ua1Var, "datadogContext");
                    zq3.h(f32Var, "eventBatchWriter");
                    bb1Var = LogsFeature.this.f;
                    String name = Thread.currentThread().getName();
                    Set e = b0.e();
                    String str3 = str;
                    Map<String, Object> map3 = linkedHashMap;
                    long longValue = l.longValue();
                    zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
                    LogsFeature.this.j().a(f32Var, f84.a.a(bb1Var, 2, str3, null, map3, e, longValue, name, ua1Var, true, str2, false, true, null, null, null, 28672, null), EventType.DEFAULT);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                    b((ua1) obj5, (f32) obj6);
                    return ww8.a;
                }
            }, 1, null);
        }
    }

    @Override // defpackage.ya2
    public void a() {
        this.a.i(getName());
        this.c = new w65();
        this.e = "";
        this.d.set(false);
        this.g.clear();
    }

    @Override // defpackage.g28
    public lb2 b() {
        return this.j;
    }

    @Override // defpackage.za2
    public void c(final Object obj) {
        zq3.h(obj, "event");
        if (obj instanceof pu3.a) {
            l((pu3.a) obj);
            return;
        }
        if (!(obj instanceof Map)) {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$onReceive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Logs feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return;
        }
        Map map = (Map) obj;
        if (zq3.c(map.get(TransferTable.COLUMN_TYPE), "ndk_crash")) {
            m(map);
        } else if (zq3.c(map.get(TransferTable.COLUMN_TYPE), "span_log")) {
            n(map);
        } else {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.LogsFeature$onReceive$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Logs feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{((Map) obj).get(TransferTable.COLUMN_TYPE)}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
    }

    @Override // defpackage.ya2
    public void d(Context context) {
        zq3.h(context, "appContext");
        this.a.h(getName(), this);
        String packageName = context.getPackageName();
        zq3.g(packageName, "appContext.packageName");
        this.e = packageName;
        this.c = h(this.b);
        this.d.set(true);
    }

    @Override // defpackage.g28
    public ky6 e() {
        return (ky6) this.i.getValue();
    }

    @Override // defpackage.ya2
    public String getName() {
        return this.h;
    }

    public final Map i() {
        return t.v(this.g);
    }

    public final qa1 j() {
        return this.c;
    }

    public final String k() {
        return this.e;
    }
}
