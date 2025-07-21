package com.datadog.android.core.internal.logger;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.metrics.MethodCalledTelemetry;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.core.sampling.RateBasedSampler;
import defpackage.ar5;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uq3;
import defpackage.xd0;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SdkInternalLogger implements InternalLogger {
    public static final a h = new a(null);
    private final jb2 b;
    private final LogcatLogHandler c;
    private final LogcatLogHandler d;
    private final Set e;
    private final Set f;
    private final Set g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[InternalLogger.Target.values().length];
            try {
                iArr[InternalLogger.Target.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalLogger.Target.MAINTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalLogger.Target.TELEMETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[TelemetryMetricType.values().length];
            try {
                iArr2[TelemetryMetricType.MethodCalled.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[InternalLogger.Level.values().length];
            try {
                iArr3[InternalLogger.Level.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[InternalLogger.Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InternalLogger.Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InternalLogger.Level.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[InternalLogger.Level.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
        }
    }

    public SdkInternalLogger(jb2 jb2Var, qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(qs2Var, "userLogHandlerFactory");
        zq3.h(qs2Var2, "maintainerLogHandlerFactory");
        this.b = jb2Var;
        this.c = (LogcatLogHandler) qs2Var.mo865invoke();
        this.d = (LogcatLogHandler) qs2Var2.mo865invoke();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
    }

    private final void e(InternalLogger.Level level, qs2 qs2Var, Throwable th, boolean z) {
        LogcatLogHandler logcatLogHandler = this.d;
        if (logcatLogHandler != null) {
            h(logcatLogHandler, level, qs2Var, th, z, this.f);
        }
    }

    private final void f(InternalLogger.Level level, qs2 qs2Var, Throwable th, boolean z, Map map) {
        ib2 d;
        jb2 jb2Var = this.b;
        if (jb2Var == null || (d = jb2Var.d("rum")) == null) {
            return;
        }
        String str = (String) qs2Var.mo865invoke();
        if (z) {
            if (this.g.contains(str)) {
                return;
            } else {
                this.g.add(str);
            }
        }
        d.a((level == InternalLogger.Level.ERROR || level == InternalLogger.Level.WARN || th != null) ? new uq3.b.C0548b(str, map, th, null, null, 24, null) : new uq3.b.a(str, map));
    }

    private final void g(InternalLogger.Level level, qs2 qs2Var, Throwable th, boolean z) {
        h(this.c, level, qs2Var, th, z, this.e);
    }

    private final void h(LogcatLogHandler logcatLogHandler, InternalLogger.Level level, qs2 qs2Var, Throwable th, boolean z, Set set) {
        if (logcatLogHandler.a(i(level))) {
            String j = j((String) qs2Var.mo865invoke());
            if (z) {
                if (set.contains(j)) {
                    return;
                } else {
                    set.add(j);
                }
            }
            logcatLogHandler.b(i(level), j, th);
        }
    }

    private final int i(InternalLogger.Level level) {
        int i = b.c[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        int i2 = 3;
        if (i != 2) {
            if (i == 3) {
                return 4;
            }
            i2 = 5;
            if (i != 4) {
                if (i == 5) {
                    return 6;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i2;
    }

    private final String j(String str) {
        jb2 jb2Var = this.b;
        String name = jb2Var != null ? jb2Var.getName() : null;
        if (name == null) {
            return str;
        }
        return "[" + name + "]: " + str;
    }

    @Override // com.datadog.android.api.InternalLogger
    public void a(qs2 qs2Var, Map map, float f) {
        jb2 jb2Var;
        ib2 d;
        zq3.h(qs2Var, "messageBuilder");
        zq3.h(map, "additionalProperties");
        if (!new RateBasedSampler(f).a() || (jb2Var = this.b) == null || (d = jb2Var.d("rum")) == null) {
            return;
        }
        d.a(new uq3.c((String) qs2Var.mo865invoke(), map));
    }

    @Override // com.datadog.android.api.InternalLogger
    public void b(InternalLogger.Level level, InternalLogger.Target target, qs2 qs2Var, Throwable th, boolean z, Map map) {
        zq3.h(level, "level");
        zq3.h(target, "target");
        zq3.h(qs2Var, "messageBuilder");
        int i = b.a[target.ordinal()];
        if (i == 1) {
            g(level, qs2Var, th, z);
        } else if (i == 2) {
            e(level, qs2Var, th, z);
        } else {
            if (i != 3) {
                return;
            }
            f(level, qs2Var, th, z, map);
        }
    }

    @Override // com.datadog.android.api.InternalLogger
    public void c(InternalLogger.Level level, List list, qs2 qs2Var, Throwable th, boolean z, Map map) {
        zq3.h(level, "level");
        zq3.h(list, "targets");
        zq3.h(qs2Var, "messageBuilder");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            b(level, (InternalLogger.Target) it2.next(), qs2Var, th, z, map);
        }
    }

    @Override // com.datadog.android.api.InternalLogger
    public ar5 d(String str, TelemetryMetricType telemetryMetricType, float f, String str2) {
        zq3.h(str, "callerClass");
        zq3.h(telemetryMetricType, "metric");
        zq3.h(str2, "operationName");
        if (!new RateBasedSampler(f).a()) {
            return null;
        }
        if (b.b[telemetryMetricType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new MethodCalledTelemetry(this, str2, str, 0L, 8, null);
    }

    public /* synthetic */ SdkInternalLogger(jb2 jb2Var, qs2 qs2Var, qs2 qs2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jb2Var, (i & 2) != 0 ? new qs2() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LogcatLogHandler mo865invoke() {
                return new LogcatLogHandler("Datadog", new ss2() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.1.1
                    public final Boolean b(int i2) {
                        return Boolean.valueOf(i2 >= Datadog.c());
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return b(((Number) obj).intValue());
                    }
                });
            }
        } : qs2Var, (i & 4) != 0 ? new qs2() { // from class: com.datadog.android.core.internal.logger.SdkInternalLogger.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LogcatLogHandler mo865invoke() {
                Boolean bool = xd0.a;
                zq3.g(bool, "LOGCAT_ENABLED");
                ss2 ss2Var = null;
                Object[] objArr = 0;
                if (bool.booleanValue()) {
                    return new LogcatLogHandler("DD_LOG", ss2Var, 2, objArr == true ? 1 : 0);
                }
                return null;
            }
        } : qs2Var2);
    }
}
