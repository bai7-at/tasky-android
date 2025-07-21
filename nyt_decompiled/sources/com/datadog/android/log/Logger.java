package com.datadog.android.log;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.log.internal.LogsFeature;
import com.datadog.android.log.internal.logger.DatadogLogHandler;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bb1;
import defpackage.ep0;
import defpackage.f75;
import defpackage.f94;
import defpackage.h84;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.qa1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.te4;
import defpackage.vc7;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class Logger {
    public static final a d = new a(null);
    private h84 a;
    private final ConcurrentHashMap b;
    private final CopyOnWriteArraySet c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Logger(h84 h84Var) {
        zq3.h(h84Var, "handler");
        this.a = h84Var;
        this.b = new ConcurrentHashMap();
        this.c = new CopyOnWriteArraySet();
    }

    private final void c(String str) {
        this.c.add(str);
    }

    public static /* synthetic */ void g(Logger logger, int i, String str, Throwable th, Map map, Long l, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = null;
        }
        logger.f(i, str, th, map, l);
    }

    private final void i(ss2 ss2Var) {
        Object[] array = this.c.toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : array) {
            if (((Boolean) ss2Var.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.c.removeAll(arrayList);
    }

    public final void a(String str, Object obj) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        if (obj == null) {
            this.b.put(str, te4.a());
        } else {
            this.b.put(str, obj);
        }
    }

    public final void b(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        c(str + ":" + str2);
    }

    public final void d(String str, Throwable th, Map map) {
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        g(this, 6, str, th, map, null, 16, null);
    }

    public final void e(String str, Throwable th, Map map) {
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        g(this, 4, str, th, map, null, 16, null);
    }

    public final void f(int i, String str, Throwable th, Map map, Long l) {
        zq3.h(str, "message");
        zq3.h(map, "localAttributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.b);
        linkedHashMap.putAll(map);
        this.a.a(i, str, th, linkedHashMap, new HashSet(this.c), l);
    }

    public final void h(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        final String str2 = str + ":";
        i(new ss2() { // from class: com.datadog.android.log.Logger$removeTagsWithKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str3) {
                zq3.h(str3, "it");
                return Boolean.valueOf(h.K(str3, str2, false, 2, null));
            }
        });
    }

    public final void j(String str, Throwable th, Map map) {
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        g(this, 7, str, th, map, null, 16, null);
    }

    public static final class Builder {
        private final jb2 a;
        private String b;
        private String c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private float h;
        private int i;

        public Builder(vc7 vc7Var) {
            zq3.h(vc7Var, "sdkCore");
            this.a = (jb2) vc7Var;
            this.f = true;
            this.g = true;
            this.h = 100.0f;
            this.i = -1;
        }

        private final h84 b(jb2 jb2Var, LogsFeature logsFeature) {
            if (logsFeature == null) {
                InternalLogger.b.a(jb2Var.f(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.Logger$Builder$buildDatadogHandler$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.";
                    }
                }, null, false, null, 56, null);
                return new f75();
            }
            String str = this.c;
            if (str == null) {
                str = logsFeature.k();
            }
            String str2 = str;
            String str3 = this.b;
            if (str3 == null) {
                str3 = jb2Var.c();
            }
            bb1 bb1Var = new bb1(str3);
            qa1 j = logsFeature.j();
            int i = this.i;
            return new DatadogLogHandler(str2, bb1Var, jb2Var, j, this.e, this.f, this.g, new RateBasedSampler(this.h), i);
        }

        private final h84 c(vc7 vc7Var) {
            String str = this.b;
            if (str == null) {
                str = vc7Var != null ? vc7Var.c() : null;
                if (str == null) {
                    str = DatasetUtils.UNKNOWN_IDENTITY_ID;
                }
            }
            return new f94(str, true, false, 4, null);
        }

        public final Logger a() {
            ib2 d = this.a.d("logs");
            LogsFeature logsFeature = d != null ? (LogsFeature) d.b() : null;
            boolean z = this.h > 0.0f;
            return new Logger((z && this.d) ? new ep0(b(this.a, logsFeature), c(this.a)) : z ? b(this.a, logsFeature) : this.d ? c(this.a) : new f75());
        }

        public final Builder d(boolean z) {
            this.f = z;
            return this;
        }

        public final Builder e(boolean z) {
            this.d = z;
            return this;
        }

        public final Builder f(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.c = str;
            return this;
        }

        public final Builder g(boolean z) {
            this.e = z;
            return this;
        }

        public final Builder h(String str) {
            zq3.h(str, "service");
            this.b = str;
            return this;
        }

        public /* synthetic */ Builder(vc7 vc7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Datadog.b(null, 1, null) : vc7Var);
        }
    }
}
